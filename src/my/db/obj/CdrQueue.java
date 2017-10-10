package my.db.obj;

import java.sql.Timestamp;

/**
 * CdrQueue entity. @author MyEclipse Persistence Tools
 */

public class CdrQueue implements java.io.Serializable
{

	// Fields

	private Integer cdrId;
	private Integer moId;
	private Integer mtId;
	private Integer serviceId;
	private Integer pid;
	private String phoneNumber;
	private Integer telcoId;
	private String requestId;
	private Timestamp receiveDate;
	private String keyword;
	private Timestamp doneDate;
	private Integer chargeTypeId;
	private Integer statusId;
	private Integer price;
	private Integer channelId;
	private String contentId;
	private Integer partnerId;
	private Timestamp cdrDate;

	// Constructors

	/** default constructor */
	public CdrQueue()
	{
	}

	/** full constructor */
	public CdrQueue(Integer moId, Integer mtId, Integer serviceId, Integer pid, String phoneNumber, Integer telcoId,
			String requestId, Timestamp receiveDate, String keyword, Timestamp doneDate, Integer chargeTypeId,
			Integer statusId, Integer price, Integer channelId, String contentId, Integer partnerId, Timestamp cdrDate)
	{
		this.moId = moId;
		this.mtId = mtId;
		this.serviceId = serviceId;
		this.pid = pid;
		this.phoneNumber = phoneNumber;
		this.telcoId = telcoId;
		this.requestId = requestId;
		this.receiveDate = receiveDate;
		this.keyword = keyword;
		this.doneDate = doneDate;
		this.chargeTypeId = chargeTypeId;
		this.statusId = statusId;
		this.price = price;
		this.channelId = channelId;
		this.contentId = contentId;
		this.partnerId = partnerId;
		this.cdrDate = cdrDate;
	}

	// Property accessors

	public Integer getCdrId()
	{
		return this.cdrId;
	}

	public void setCdrId(Integer cdrId)
	{
		this.cdrId = cdrId;
	}

	public Integer getMoId()
	{
		return this.moId;
	}

	public void setMoId(Integer moId)
	{
		this.moId = moId;
	}

	public Integer getMtId()
	{
		return this.mtId;
	}

	public void setMtId(Integer mtId)
	{
		this.mtId = mtId;
	}

	public Integer getServiceId()
	{
		return this.serviceId;
	}

	public void setServiceId(Integer serviceId)
	{
		this.serviceId = serviceId;
	}

	public Integer getPid()
	{
		return this.pid;
	}

	public void setPid(Integer pid)
	{
		this.pid = pid;
	}

	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public Integer getTelcoId()
	{
		return this.telcoId;
	}

	public void setTelcoId(Integer telcoId)
	{
		this.telcoId = telcoId;
	}

	public String getRequestId()
	{
		return this.requestId;
	}

	public void setRequestId(String requestId)
	{
		this.requestId = requestId;
	}

	public Timestamp getReceiveDate()
	{
		return this.receiveDate;
	}

	public void setReceiveDate(Timestamp receiveDate)
	{
		this.receiveDate = receiveDate;
	}

	public String getKeyword()
	{
		return this.keyword;
	}

	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	public Timestamp getDoneDate()
	{
		return this.doneDate;
	}

	public void setDoneDate(Timestamp doneDate)
	{
		this.doneDate = doneDate;
	}

	public Integer getChargeTypeId()
	{
		return this.chargeTypeId;
	}

	public void setChargeTypeId(Integer chargeTypeId)
	{
		this.chargeTypeId = chargeTypeId;
	}

	public Integer getStatusId()
	{
		return this.statusId;
	}

	public void setStatusId(Integer statusId)
	{
		this.statusId = statusId;
	}

	public Integer getPrice()
	{
		return this.price;
	}

	public void setPrice(Integer price)
	{
		this.price = price;
	}

	public Integer getChannelId()
	{
		return this.channelId;
	}

	public void setChannelId(Integer channelId)
	{
		this.channelId = channelId;
	}

	public String getContentId()
	{
		return this.contentId;
	}

	public void setContentId(String contentId)
	{
		this.contentId = contentId;
	}

	public Integer getPartnerId()
	{
		return this.partnerId;
	}

	public void setPartnerId(Integer partnerId)
	{
		this.partnerId = partnerId;
	}

	public Timestamp getCdrDate()
	{
		return this.cdrDate;
	}

	public void setCdrDate(Timestamp cdrDate)
	{
		this.cdrDate = cdrDate;
	}

}