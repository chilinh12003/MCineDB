package my.db.dao;

import java.util.ArrayList;

import my.db.base.*;
import my.db.obj.ChargeLog;

/**
 * ChargeLog entity. @author MyEclipse Persistence Tools
 */

public class DaoChargeLog extends DaoBase<ChargeLog>
{
	public DaoChargeLog()
	{
		super(ChargeLog.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("logId");
		listKey.add("pid");
		listKey.add("phoneNumber");
		return listKey;
	}	
	

	public enum ChargeType
	{
		NoThing(0), 
		Reg(1), 
		Unreg(2), 
		Renew(3),;

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
	
	public enum Status
	{
		NoThing(0), 
		Success(1), 
		Fail(2), 
		NotEnoughMoney(3),;

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
}