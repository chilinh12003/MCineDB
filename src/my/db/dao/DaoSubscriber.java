package my.db.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import my.db.base.*;
import my.db.obj.Subscriber;
/**
 * MoQueue entity. @author MyEclipse Persistence Tools
 */

public class DaoSubscriber extends DaoBase<Subscriber>
{

	public DaoSubscriber()
	{
		super(Subscriber.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("serviceId");
		listKey.add("phoneNumber");
		listKey.add("pid");
		return listKey;
	}
	
	public Subscriber getByKey( int pid,String phoneNumber, int serviceId) throws Exception
	{
		String query = "SELECT * FROM Subscriber WHERE Pid=? AND PhoneNumber=? AND ServiceId=? ";
		List<Subscriber> list =(List<Subscriber>) get(query,new ArrayList<Object>(Arrays.asList(pid,phoneNumber,serviceId)));
		if(list != null && list.size() > 0)
		{
			return list.get(0);
		}
		return null;
		
	}
	public Subscriber getByKey( int pid,String phoneNumber) throws Exception
	{
		String query = "SELECT * FROM Subscriber WHERE Pid=? AND PhoneNumber=? ";
		List<Subscriber> list =(List<Subscriber>) get(query,new ArrayList<Object>(Arrays.asList(pid,phoneNumber)));
		if(list != null && list.size() > 0)
		{
			return list.get(0);
		}
		return null;
	}
}