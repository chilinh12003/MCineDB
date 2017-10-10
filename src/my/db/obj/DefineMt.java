package my.db.obj;

/**
 * DefineMt entity. @author MyEclipse Persistence Tools
 */

public class DefineMt implements java.io.Serializable
{

	// Fields

	private Integer defineMtId;
	private Integer serviceId;
	private String mt;
	private Integer mtTypeId;
	private String mtTypeName;
	private String description;
	private Integer isActive;
	private Integer orderId;

	// Constructors

	/** default constructor */
	public DefineMt()
	{
	}

	/** full constructor */
	public DefineMt(Integer serviceId, String mt, Integer mtTypeId, String mtTypeName, String description,
			Integer isActive, Integer orderId)
	{
		this.serviceId = serviceId;
		this.mt = mt;
		this.mtTypeId = mtTypeId;
		this.mtTypeName = mtTypeName;
		this.description = description;
		this.isActive = isActive;
		this.orderId = orderId;
	}

	// Property accessors

	public Integer getDefineMtId()
	{
		return this.defineMtId;
	}

	public void setDefineMtId(Integer defineMtId)
	{
		this.defineMtId = defineMtId;
	}

	public Integer getServiceId()
	{
		return this.serviceId;
	}

	public void setServiceId(Integer serviceId)
	{
		this.serviceId = serviceId;
	}

	public String getMt()
	{
		return this.mt;
	}

	public void setMt(String mt)
	{
		this.mt = mt;
	}

	public Integer getMtTypeId()
	{
		return this.mtTypeId;
	}

	public void setMtTypeId(Integer mtTypeId)
	{
		this.mtTypeId = mtTypeId;
	}

	public String getMtTypeName()
	{
		return this.mtTypeName;
	}

	public void setMtTypeName(String mtTypeName)
	{
		this.mtTypeName = mtTypeName;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public Integer getIsActive()
	{
		return this.isActive;
	}

	public void setIsActive(Integer isActive)
	{
		this.isActive = isActive;
	}

	public Integer getOrderId()
	{
		return this.orderId;
	}

	public void setOrderId(Integer orderId)
	{
		this.orderId = orderId;
	}

}