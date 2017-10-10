package my.db.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import my.db.base.*;
import my.db.obj.SubConfirm;
import my.db.obj.Subscriber;
import uti.MyConfig;

/**
 * MoQueue entity. @author MyEclipse Persistence Tools
 */

public class DaoSubConfirm extends DaoBase<SubConfirm>
{
	public enum Status
	{
		NoThing(0),

		WaitingConfirm(1), RegSuccess(2), RegFail(3), Expired(4);

		private int value;

		private Status(int value)
		{
			this.value = value;
		}

		public Integer getValue()
		{
			return this.value;
		}

		public static Status fromValue(Integer iValue)
		{
			for (Status type : Status.values())
			{
				if (type.getValue().equals(iValue))
					return type;
			}
			return NoThing;
		}
	}

	public DaoSubConfirm()
	{
		super(SubConfirm.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("logId");
		return listKey;
	}

	/**
	 * Lấy thuê bao đang chờ confirm
	 * @param pid
	 * @param phoneNumber
	 * @param maxMinuteTimeout: Số phút so với thời gian hiện tại.
	 * @return
	 * @throws Exception
	 */
	public SubConfirm getWaitConfirm(int pid, String phoneNumber, int maxMinuteTimeout) throws Exception
	{
		Calendar calExpire = Calendar.getInstance();
		calExpire.add(Calendar.MINUTE, -maxMinuteTimeout);
		String query = "SELECT * FROM SubConfirm WHERE Pid=? AND PhoneNumber=? AND StatusId=? AND CreateDate<=? ";
		List<SubConfirm> list = (List<SubConfirm>) get(query, new ArrayList<Object>(Arrays.asList(pid, phoneNumber,
				Status.WaitingConfirm.getValue(), MyConfig.getDateFormatInsertDB().format(calExpire.getTime()))));
		if (list != null && list.size() > 0)
		{
			return list.get(0);
		}
		return null;
	}
}