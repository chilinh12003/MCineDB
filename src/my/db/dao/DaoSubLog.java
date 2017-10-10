package my.db.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import my.db.base.*;
import my.db.obj.SubLog;
import my.db.obj.Subscriber;

/**
 * SubLog entity. @author MyEclipse Persistence Tools
 */

public class DaoSubLog extends DaoBase<SubLog>
{

	public DaoSubLog()
	{
		super(SubLog.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("logId");
		listKey.add("phoneNumber");
		listKey.add("pid");
		return listKey;
	}
	
	public SubLog getByKey( int pid,String phoneNumber) throws Exception
	{
		String query = "SELECT * FROM Subog WHERE Pid=? AND PhoneNumber=? ORDER BY OrderId DESC limit 1";
		List<SubLog> list =(List<SubLog>) get(query,new ArrayList<Object>(Arrays.asList(pid,phoneNumber)));
		if(list != null && list.size() > 0)
		{
			return list.get(0);
		}
		return null;
	}
}