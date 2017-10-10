package my.db.dao;

import java.util.ArrayList;
import java.util.List;

import my.db.base.*;
import my.db.obj.MoQueue;

/**
 * MoQueue entity. @author MyEclipse Persistence Tools
 */

public class DaoMoQueue extends DaoBase<MoQueue>
{

	public DaoMoQueue()
	{
		super(MoQueue.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("moId");
		return listKey;
	}
	
	public List<MoQueue> getByThread( Integer threadNumber, Integer threadIndex, int rowCount) throws Exception
	{
		String query = "SELECT * FROM MoQueue WHERE (mod(MoId," + threadNumber
				+ ")=" + threadIndex + ") LIMIT "+ rowCount;
		return (List<MoQueue>) get(query);
	}
}