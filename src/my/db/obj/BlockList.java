package my.db.obj;

import java.sql.Timestamp;

/**
 * BlockList entity. @author MyEclipse Persistence Tools
 */

public class BlockList implements java.io.Serializable
{

	// Fields

	private String phoneNumber;
	private Integer pid;
	private Integer telcoId;
	private Integer typeId;
	private Timestamp insertDate;

	// Constructors

	/** default constructor */
	public BlockList()
	{
	}

	/** minimal constructor */
	public BlockList(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	/** full constructor */
	public BlockList(String phoneNumber, Integer pid, Integer telcoId, Integer typeId, Timestamp insertDate)
	{
		this.phoneNumber = phoneNumber;
		this.pid = pid;
		this.telcoId = telcoId;
		this.typeId = typeId;
		this.insertDate = insertDate;
	}

	// Property accessors

	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public Integer getPid()
	{
		return this.pid;
	}

	public void setPid(Integer pid)
	{
		this.pid = pid;
	}

	public Integer getTelcoId()
	{
		return this.telcoId;
	}

	public void setTelcoId(Integer telcoId)
	{
		this.telcoId = telcoId;
	}

	public Integer getTypeId()
	{
		return this.typeId;
	}

	public void setTypeId(Integer typeId)
	{
		this.typeId = typeId;
	}

	public Timestamp getInsertDate()
	{
		return this.insertDate;
	}

	public void setInsertDate(Timestamp insertDate)
	{
		this.insertDate = insertDate;
	}

}