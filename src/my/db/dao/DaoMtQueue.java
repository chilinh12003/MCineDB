package my.db.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import my.db.base.DaoBase;
import my.db.obj.MtQueue;
import uti.MyConfig;

public class DaoMtQueue extends DaoBase<MtQueue>
{
	/**
	 * Phục vụ cho đầu số ngắn, để ghi cdr hay biết đây là MT tính tiền hay không
	 * @author Chilinh
	 *
	 */
	public enum ChargeType
	{
		NoThing(0),

		Free(1), Charge(2),Refund(3);

		private int value;

		private ChargeType(int value)
		{
			this.value = value;
		}

		public Integer getValue()
		{
			return this.value;
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
	
	public enum SendType
	{
		NoThing(0),

		SendToUser(1), NotSend(2),;

		private int value;

		private SendType(int value)
		{
			this.value = value;
		}

		public Integer getValue()
		{
			return this.value;
		}

		public static SendType fromValue(Integer iValue)
		{
			for (SendType type : SendType.values())
			{
				if (type.getValue().equals(iValue))
					return type;
			}
			return NoThing;
		}
	}

	public enum ContentType
	{
		NoThing(0), ShortText(1), LongText(2), ShortUnicode(3), LongUnicode(4),;

		private int value;

		private ContentType(int value)
		{
			this.value = value;
		}

		public Integer getValue()
		{
			return this.value;
		}

		public static ContentType fromValue(Integer iValue)
		{
			for (ContentType type : ContentType.values())
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

		ProcessMODone(10), 
		/**
		 * Đã buil song MT và đang trong queue để chờ gửi sang telco
		 */
		WaitingSend(20),
		/**
		 * Đã gửi sang telco và đang chờ để nhận Reponse từ telco
		 */
		HasSendToTelco(21), 
		
		WaitingRetrySend(22),
		HasRetrySendToTelco(23), 
		
		/**
		 * Gửi MT không thành công
		 */
		SendFail(30),
		SendFailByTimeout(31),
		SendFailByMaxRetry(32),
		
		
		SendSuccess(40), 
		
		MtInvalid(50), 
		BuildSubmitFail(51), ;
		
		private int value;

		private Status(int value)
		{
			this.value = value;
		}

		public Integer getValue()
		{
			return  this.value;
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

	public DaoMtQueue()
	{
		super(MtQueue.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("mtId");
		return listKey;
	}
	
	public List<MtQueue> getByThread( Integer threadNumber, Integer threadIndex, int maxResults) throws Exception
	{
		Calendar calCurrent = Calendar.getInstance();

		String query = "SELECT * FROM MtQueue WHERE (PushTime IS NULL OR PushTime <= '"
				+ MyConfig.getDateFormatInsertDB().format(calCurrent.getTime()) + "') AND (mod(mtid," + threadNumber
				+ ")=" + threadIndex + ") LIMIT "+ maxResults;
		return (List<MtQueue>) get(query);
	}

}
