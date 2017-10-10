package my.db.dao;

import java.util.ArrayList;

import my.db.base.*;
import my.db.obj.BlockList;

/**
 * BlockList entity. @author MyEclipse Persistence Tools
 */

public class DaoBlockList extends DaoBase<BlockList>
{
	
	public enum BlockType
	{
		NoThing(0),
		/*
		 * KhÃ´ng xá»­ lÃ½ MO 
		 */
		NoProcessMO(1), 
		/**
		 * KhÃ´ng náº±m trong danh sÃ¡ch PushMT
		 */
		NotPushMT(2),
		
		/**
		 * Ä�Æ°á»£c free charge cho Ä‘Äƒng kÃ½, hoáº·c gia háº¡n
		 */
		FreeCharge(3),
		;

		private int value;

		private BlockType(int value)
		{
			this.value = value;
		}

		public Integer getValue()
		{
			return this.value;
		}

		public static BlockType fromValue(Integer iValue)
		{
			for (BlockType type : BlockType.values())
			{
				if (type.getValue().equals(iValue))
					return type;
			}
			return NoThing;
		}
	}
	
	public DaoBlockList()
	{
		super(BlockList.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		// TODO Auto-generated method stub
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("phoneNumber");
		listKey.add("typeId");
		return listKey;
	}
	
}