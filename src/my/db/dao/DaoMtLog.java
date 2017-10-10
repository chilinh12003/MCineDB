package my.db.dao;
import java.util.ArrayList;

import my.db.base.DaoBase;
import my.db.obj.*;

/**
 * MtLog entity. @author MyEclipse Persistence Tools
 */

public class DaoMtLog  extends DaoBase<MtLog>
{

	public DaoMtLog()
	{
		super(MtLog.class);
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
	
}