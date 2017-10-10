package my.db.dao;

import java.util.ArrayList;

import my.db.base.DaoBase;
import my.db.obj.MoForward;

/**
 * MoForward entity. @author MyEclipse Persistence Tools
 */

public class DaoMoForward extends DaoBase<MoForward>
{
	public DaoMoForward()
	{
		super(MoForward.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("moForwardId");
		return listKey;
	}

}