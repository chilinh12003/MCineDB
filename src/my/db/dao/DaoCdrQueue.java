package my.db.dao;

import java.util.ArrayList;
import my.db.base.*;
import my.db.obj.CdrQueue;

/**
 * CdrQueue entity. @author MyEclipse Persistence Tools
 */

public class DaoCdrQueue extends DaoBase<CdrQueue>
{

	public DaoCdrQueue()
	{
		super(CdrQueue.class);
		// TODO Auto-generated constructor stub
	}

	public enum ChargeType
	{
		NoThing(0), 
		/**
		 * Tính cước
		 */
		Charge(1), 
		/**
		 * Hoàn cước
		 */
		Refund(2), 
		/**
		 * Không tính cước
		 */
		Free(3),;

		private int value;

		private ChargeType(int value)
		{
			this.value = value;
		}

		public Integer getValue()
		{
			return  this.value;
		}

		public static ChargeType fromValue(Integer iValue)
		{
			for (ChargeType type : ChargeType.values())
			{
				if (type.getValue().equals(iValue))
					return type;
			}
			return NoThing;
		}
	}

	/**
	 * Tình trạng xử lý của MO, MT
	 * 
	 * @author Administrator
	 * 
	 */
	public enum Status
	{
		NoThing(0),		
		
		/**
		 * Chờ MT trả về để xem Tính cước hay hoàn cước
		 */
		WaitingMt(1),
		/**
		 * Đang chờ để đẩy cdr sang telco
		 */
		WaitingFtp(2),
		/**
		 * Hoàn thành đầy sang cdr và ghi vào log
		 */
		Complete(3);
		
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
	
	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("cdrId");
		return listKey;
	}
	
}