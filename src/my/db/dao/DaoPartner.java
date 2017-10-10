package my.db.dao;

import java.util.ArrayList;

import my.db.base.*;
import my.db.obj.Partner;

/**
 * Partner entity. @author MyEclipse Persistence Tools
 */

public class DaoPartner extends DaoBase<Partner>
{

	public DaoPartner()
	{
		super(Partner.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("partnerId");
		return listKey;
	}

}