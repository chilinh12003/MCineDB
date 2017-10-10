package my.db.dao;

import java.util.ArrayList;

import my.db.base.*;
import my.db.obj.Service;

/**
 * Service entity. @author MyEclipse Persistence Tools
 */

public class DaoService extends DaoBase<Service>
{

	public DaoService()
	{
		super(Service.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("serviceId");
		return listKey;
	}

}