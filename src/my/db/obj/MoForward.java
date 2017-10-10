package my.db.obj;

import java.sql.Timestamp;

/**
 * MoForward entity. @author MyEclipse Persistence Tools
 */

public class MoForward implements java.io.Serializable
{

	// Fields

	private Integer moForwardId;
	private Integer moId;
	private String phoneNumber;
	private String shortCode;
	private Integer telcoId;
	private String keyword;
	private String mo;
	private Integer channelId;
	private String requestId;
	private Timestamp moInsertDate;
	private Timestamp receiveDate;
	private Integer moResponseId;
	private Integer retryCount;
	private Timestamp forwardDate;
	private Integer statusId;

	// Constructors

	/** default constructor */
	public MoForward()
	{
	}

	/** minimal constructor */
	public MoForward(Integer moForwardId)
	{
		this.moForwardId = moForwardId;
	}

	/** full constructor */
	public MoForward(Integer moForwardId, Integer moId, String phoneNumber, String shortCode, Integer telcoId,
			String keyword, String mo, Integer channelId, String requestId, Timestamp moInsertDate,
			Timestamp receiveDate, Integer moResponseId, Integer retryCount, Timestamp forwardDate, Integer statusId)
	{
		this.moForwardId = moForwardId;
		this.moId = moId;
		this.phoneNumber = phoneNumber;
		this.shortCode = shortCode;
		this.telcoId = telcoId;
		this.keyword = keyword;
		this.mo = mo;
		this.channelId = channelId;
		this.requestId = requestId;
		this.moInsertDate = moInsertDate;
		this.receiveDate = receiveDate;
		this.moResponseId = moResponseId;
		this.retryCount = retryCount;
		this.forwardDate = forwardDate;
		this.statusId = statusId;
	}

	// Property accessors

	public Integer getMoForwardId()
	{
		return this.moForwardId;
	}

	public void setMoForwardId(Integer moForwardId)
	{
		this.moForwardId = moForwardId;
	}

	public Integer getMoId()
	{
		return this.moId;
	}

	public void setMoId(Integer moId)
	{
		this.moId = moId;
	}

	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getShortCode()
	{
		return this.shortCode;
	}

	public void setShortCode(String shortCode)
	{
		this.shortCode = shortCode;
	}

	public Integer getTelcoId()
	{
		return this.telcoId;
	}

	public void setTelcoId(Integer telcoId)
	{
		this.telcoId = telcoId;
	}

	public String getKeyword()
	{
		return this.keyword;
	}

	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	public String getMo()
	{
		return this.mo;
	}

	public void setMo(String mo)
	{
		this.mo = mo;
	}

	public Integer getChannelId()
	{
		return this.channelId;
	}

	public void setChannelId(Integer channelId)
	{
		this.channelId = channelId;
	}

	public String getRequestId()
	{
		return this.requestId;
	}

	public void setRequestId(String requestId)
	{
		this.requestId = requestId;
	}

	public Timestamp getMoInsertDate()
	{
		return this.moInsertDate;
	}

	public void setMoInsertDate(Timestamp moInsertDate)
	{
		this.moInsertDate = moInsertDate;
	}

	public Timestamp getReceiveDate()
	{
		return this.receiveDate;
	}

	public void setReceiveDate(Timestamp receiveDate)
	{
		this.receiveDate = receiveDate;
	}

	public Integer getMoResponseId()
	{
		return this.moResponseId;
	}

	public void setMoResponseId(Integer moResponseId)
	{
		this.moResponseId = moResponseId;
	}

	public Integer getRetryCount()
	{
		return this.retryCount;
	}

	public void setRetryCount(Integer retryCount)
	{
		this.retryCount = retryCount;
	}

	public Timestamp getForwardDate()
	{
		return this.forwardDate;
	}

	public void setForwardDate(Timestamp forwardDate)
	{
		this.forwardDate = forwardDate;
	}

	public Integer getStatusId()
	{
		return this.statusId;
	}

	public void setStatusId(Integer statusId)
	{
		this.statusId = statusId;
	}

}