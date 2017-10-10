package my.db.obj;

/**
 * Service entity. @author MyEclipse Persistence Tools
 */

public class Service implements java.io.Serializable
{

	// Fields

	private Integer serviceId;
	private Integer parentId;
	private String name;
	private String desc;
	private String regKeyword;
	private String unregKeyword;
	private Float price;
	private String priceStep;
	private String pushTime;
	private String packageCode;
	private Integer freeDay;
	private Integer cycleId;
	private String telcoContentId;
	private String telcoCateId;
	private String note;

	// Constructors

	/** default constructor */
	public Service()
	{
	}
	public Service(Service service)
	{
		this.serviceId = service.getServiceId();
		this.parentId = service.getParentId();
		this.name = service.getName();
		this.desc = service.getDesc();
		this.regKeyword = service.getRegKeyword();
		this.unregKeyword = service.getUnregKeyword();
		this.price = service.getPrice();
		this.priceStep = service.getPriceStep();
		this.pushTime = service.getPushTime();
		this.packageCode = service.getPackageCode();
		this.freeDay = service.getFreeDay();
		this.cycleId = service.getCycleId();
		this.telcoContentId = service.getTelcoContentId();
		this.telcoCateId = service.getTelcoCateId();
		this.note = service.getNote();
	}

	/** minimal constructor */
	public Service(Integer serviceId)
	{
		this.serviceId = serviceId;
	}

	/** full constructor */
	public Service(Integer serviceId, Integer parentId, String name, String desc, String regKeyword,
			String unregKeyword, Float price, String priceStep, String pushTime, String packageCode, Integer freeDay,
			Integer cycleId, String telcoContentId, String telcoCateId, String note)
	{
		this.serviceId = serviceId;
		this.parentId = parentId;
		this.name = name;
		this.desc = desc;
		this.regKeyword = regKeyword;
		this.unregKeyword = unregKeyword;
		this.price = price;
		this.priceStep = priceStep;
		this.pushTime = pushTime;
		this.packageCode = packageCode;
		this.freeDay = freeDay;
		this.cycleId = cycleId;
		this.telcoContentId = telcoContentId;
		this.telcoCateId = telcoCateId;
		this.note = note;
	}

	// Property accessors

	public Integer getServiceId()
	{
		return this.serviceId;
	}

	public void setServiceId(Integer serviceId)
	{
		this.serviceId = serviceId;
	}

	public Integer getParentId()
	{
		return this.parentId;
	}

	public void setParentId(Integer parentId)
	{
		this.parentId = parentId;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDesc()
	{
		return this.desc;
	}

	public void setDesc(String desc)
	{
		this.desc = desc;
	}

	public String getRegKeyword()
	{
		return this.regKeyword;
	}

	public void setRegKeyword(String regKeyword)
	{
		this.regKeyword = regKeyword;
	}

	public String getUnregKeyword()
	{
		return this.unregKeyword;
	}

	public void setUnregKeyword(String unregKeyword)
	{
		this.unregKeyword = unregKeyword;
	}

	public Float getPrice()
	{
		return this.price;
	}

	public void setPrice(Float price)
	{
		this.price = price;
	}

	public String getPriceStep()
	{
		return this.priceStep;
	}

	public void setPriceStep(String priceStep)
	{
		this.priceStep = priceStep;
	}

	public String getPushTime()
	{
		return this.pushTime;
	}

	public void setPushTime(String pushTime)
	{
		this.pushTime = pushTime;
	}

	public String getPackageCode()
	{
		return this.packageCode;
	}

	public void setPackageCode(String packageCode)
	{
		this.packageCode = packageCode;
	}

	public Integer getFreeDay()
	{
		return this.freeDay;
	}

	public void setFreeDay(Integer freeDay)
	{
		this.freeDay = freeDay;
	}

	public Integer getCycleId()
	{
		return this.cycleId;
	}

	public void setCycleId(Integer cycleId)
	{
		this.cycleId = cycleId;
	}

	public String getTelcoContentId()
	{
		return this.telcoContentId;
	}

	public void setTelcoContentId(String telcoContentId)
	{
		this.telcoContentId = telcoContentId;
	}

	public String getTelcoCateId()
	{
		return this.telcoCateId;
	}

	public void setTelcoCateId(String telcoCateId)
	{
		this.telcoCateId = telcoCateId;
	}

	public String getNote()
	{
		return this.note;
	}

	public void setNote(String note)
	{
		this.note = note;
	}

}