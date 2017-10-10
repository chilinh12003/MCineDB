package my.db.dao;

import java.util.ArrayList;

import my.db.base.DaoBase;
import my.db.obj.Keyword;

/**
 * Keyword entity. @author MyEclipse Persistence Tools
 */

public class DaoKeyword extends DaoBase<Keyword>
{
	public DaoKeyword()
	{
		super(Keyword.class);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("keywordId");
		return listKey;
	}

}