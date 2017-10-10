package my.db.obj;

/**
 * Parnter entity. @author MyEclipse Persistence Tools
 */

public class Partner implements java.io.Serializable
{

	// Fields

	private Integer partnerId;
	private String name;
	private Integer statusId;
	private String listKeyword;

	// Constructors

	/** default constructor */
	public Partner()
	{
	}

	/** minimal constructor */
	public Partner(Integer partnerId)
	{
		this.partnerId = partnerId;
	}


	// Property accessors

	public Partner(Integer partnerId, String name, Integer statusId, String listKeyword)
	{
		super();
		this.partnerId = partnerId;
		this.name = name;
		this.statusId = statusId;
		this.listKeyword = listKeyword;
	}

	public Integer getPartnerId()
	{
		return this.partnerId;
	}

	public void setPartnerId(Integer partnerId)
	{
		this.partnerId = partnerId;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getStatusId()
	{
		return this.statusId;
	}

	public void setStatusId(Integer statusId)
	{
		this.statusId = statusId;
	}

	public String getListKeyword()
	{
		return listKeyword;
	}

	public void setListKeyword(String listKeyword)
	{
		this.listKeyword = listKeyword;
	}

}