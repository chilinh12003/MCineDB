package my.db.obj;

import java.sql.Timestamp;

/**
 * Subscriber entity. @author MyEclipse Persistence Tools
 */

public class Subscriber implements java.io.Serializable
{

	// Fields

	private Integer serviceId;
	private String phoneNumber;
	private Integer pid;
	private Integer orderId;
	private Timestamp firstDate;
	private Timestamp resetDate;
	private Timestamp effectiveDate;
	private Timestamp expiryDate;
	private Timestamp retryDate;
	private Integer retryChargeCount;
	private Timestamp renewDate;
	private Integer channelId;
	private Integer statusId;
	private Timestamp deregDate;
	private Integer typeId;
	private Float debtPrice;
	private Integer partnerId;
	private String password;

	// Constructors

	/** default constructor */
	public Subscriber()
	{
	}
	public Subscriber(SubLog subLog)
	{
		this.serviceId = subLog.getServiceId();
		this.phoneNumber = subLog.getPhoneNumber();
		this.pid = subLog.getPid();
		this.firstDate = subLog.getFirstDate();
		this.resetDate = subLog.getResetDate();
		this.retryDate = subLog.getRetryDate();
		this.retryChargeCount = subLog.getRetryChargeCount();
		this.renewDate = subLog.getRenewDate();
		this.deregDate = subLog.getDeregDate();
		this.typeId = subLog.getTypeId();
		this.debtPrice = subLog.getDebtPrice();
		this.password = subLog.getPassword();
	}

	public Subscriber(Integer serviceId, String phoneNumber, Integer pid, Integer orderId, Timestamp firstDate,
			Timestamp resetDate, Timestamp effectiveDate, Timestamp expiryDate, Timestamp retryDate,
			Integer retryChargeCount, Timestamp renewDate, Integer channelId, Integer statusId, Timestamp deregDate,
			Integer typeId, Float debtPrice, Integer partnerId, String password)
	{
		super();
		this.serviceId = serviceId;
		this.phoneNumber = phoneNumber;
		this.pid = pid;
		this.orderId = orderId;
		this.firstDate = firstDate;
		this.resetDate = resetDate;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
		this.retryDate = retryDate;
		this.retryChargeCount = retryChargeCount;
		this.renewDate = renewDate;
		this.channelId = channelId;
		this.statusId = statusId;
		this.deregDate = deregDate;
		this.typeId = typeId;
		this.debtPrice = debtPrice;
		this.partnerId = partnerId;
		this.password = password;
	}

	public Integer getServiceId()
	{
		return serviceId;
	}

	public void setServiceId(Integer serviceId)
	{
		this.serviceId = serviceId;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public Integer getPid()
	{
		return pid;
	}

	public void setPid(Integer pid)
	{
		this.pid = pid;
	}

	public Integer getOrderId()
	{
		return orderId;
	}

	public void setOrderId(Integer orderId)
	{
		this.orderId = orderId;
	}

	public Timestamp getFirstDate()
	{
		return firstDate;
	}

	public void setFirstDate(Timestamp firstDate)
	{
		this.firstDate = firstDate;
	}

	public Timestamp getResetDate()
	{
		return resetDate;
	}

	public void setResetDate(Timestamp resetDate)
	{
		this.resetDate = resetDate;
	}

	public Timestamp getEffectiveDate()
	{
		return effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate)
	{
		this.effectiveDate = effectiveDate;
	}

	public Timestamp getExpiryDate()
	{
		return expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate)
	{
		this.expiryDate = expiryDate;
	}

	public Timestamp getRetryDate()
	{
		return retryDate;
	}

	public void setRetryDate(Timestamp retryDate)
	{
		this.retryDate = retryDate;
	}

	public Integer getRetryChargeCount()
	{
		return retryChargeCount;
	}

	public void setRetryChargeCount(Integer retryChargeCount)
	{
		this.retryChargeCount = retryChargeCount;
	}

	public Timestamp getRenewDate()
	{
		return renewDate;
	}

	public void setRenewDate(Timestamp renewDate)
	{
		this.renewDate = renewDate;
	}

	public Integer getChannelId()
	{
		return channelId;
	}

	public void setChannelId(Integer channelId)
	{
		this.channelId = channelId;
	}

	public Integer getStatusId()
	{
		return statusId;
	}

	public void setStatusId(Integer statusId)
	{
		this.statusId = statusId;
	}

	public Timestamp getDeregDate()
	{
		return deregDate;
	}

	public void setDeregDate(Timestamp deregDate)
	{
		this.deregDate = deregDate;
	}

	public Integer getTypeId()
	{
		return typeId;
	}

	public void setTypeId(Integer typeId)
	{
		this.typeId = typeId;
	}

	public Float getDebtPrice()
	{
		return debtPrice;
	}

	public void setDebtPrice(Float debtPrice)
	{
		this.debtPrice = debtPrice;
	}

	public Integer getPartnerId()
	{
		return partnerId;
	}

	public void setPartnerId(Integer partnerId)
	{
		this.partnerId = partnerId;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	
}