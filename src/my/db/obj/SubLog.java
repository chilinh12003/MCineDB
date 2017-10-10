package my.db.obj;

import java.sql.Timestamp;

/**
 * SubLog entity. @author MyEclipse Persistence Tools
 */

public class SubLog implements java.io.Serializable
{

	// Fields

	private Integer logId;
	private String phoneNumber;
	private Integer pid;
	private Integer serviceId;
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
	public SubLog()
	{
	}

	public Integer getLogId()
	{
		return logId;
	}

	public void setLogId(Integer logId)
	{
		this.logId = logId;
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

	public Integer getServiceId()
	{
		return serviceId;
	}

	public void setServiceId(Integer serviceId)
	{
		this.serviceId = serviceId;
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