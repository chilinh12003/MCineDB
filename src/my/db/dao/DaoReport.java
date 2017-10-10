package my.db.dao;

import java.util.ArrayList;

import my.db.base.*;
import my.db.obj.Report;

/**
 * Report entity. @author MyEclipse Persistence Tools
 */

public class DaoReport extends DaoBase<Report>
{

	public DaoReport()
	{
		super(Report.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("reportDay");
		listKey.add("partnerId");
		listKey.add("serviceId");
		return listKey;
	}

}