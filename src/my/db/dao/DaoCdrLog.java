package my.db.dao;

import java.util.ArrayList;

import my.db.base.*;
import my.db.obj.CdrLog;

/**
 * CdrLog entity. @author MyEclipse Persistence Tools
 */

public class DaoCdrLog extends DaoBase<CdrLog>
{
	public DaoCdrLog()
	{
		super(CdrLog.class);
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
}