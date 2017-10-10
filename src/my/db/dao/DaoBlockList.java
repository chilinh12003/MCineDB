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
		 * Không xử lý MO 
		 */
		NoProcessMO(1), 
		/**
		 * Không nằm trong danh sách PushMT
		 */
		NotPushMT(2),
		
		/**
		 * Được free charge cho đăng ký, hoặc gia hạn
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