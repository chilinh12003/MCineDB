package my.db.obj;

import java.sql.Timestamp;

/**
 * MtLog entity. @author MyEclipse Persistence Tools
 */

public class MtLog implements java.io.Serializable
{

	// Fields

	private Integer logId;
	private String phoneNumber;
	private Integer pid;
	private Integer moId;
	private Integer mtId;
	private String shortCode;
	private Integer telcoId;
	private String keyword;
	private String mo;
	private Integer channelId;
	private String requestId;
	private Timestamp moInsertDate;
	private Timestamp receiveDate;
	private Integer moResponseId;
	private Integer serviceId;
	private String mt;
	private Integer chargeTypeId;
	private Integer contentTypeId;
	private Integer mtTypeId;
	private Integer totalSegment;
	private Integer mtResponseId;
	private Timestamp mtInsertDate;
	private Timestamp sendDate;
	private Timestamp doneDate;
	private Integer retryCount;
	private Integer statusId;
	private Integer sendTypeId;
	private Timestamp pushTime;
	private Timestamp logDate;
	private Integer parterId;
	private String note;

	// Constructors

	/** default constructor */
	public MtLog()
	{
	}

	

	public MtLog(Integer logId, String phoneNumber, Integer pid, Integer moId, Integer mtId, String shortCode,
			Integer telcoId, String keyword, String mo, Integer channelId, String requestId, Timestamp moInsertDate,
			Timestamp receiveDate, Integer moResponseId, Integer serviceId, String mt, Integer chargeTypeId,
			Integer contentTypeId, Integer mtTypeId, Integer totalSegment, Integer mtResponseId, Timestamp mtInsertDate,
			Timestamp sendDate, Timestamp doneDate, Integer retryCount, Integer statusId, Integer sendTypeId,
			Timestamp pushTime, Timestamp logDate, Integer parterId, String note)
	{
		super();
		this.logId = logId;
		this.phoneNumber = phoneNumber;
		this.pid = pid;
		this.moId = moId;
		this.mtId = mtId;
		this.shortCode = shortCode;
		this.telcoId = telcoId;
		this.keyword = keyword;
		this.mo = mo;
		this.channelId = channelId;
		this.requestId = requestId;
		this.moInsertDate = moInsertDate;
		this.receiveDate = receiveDate;
		this.moResponseId = moResponseId;
		this.serviceId = serviceId;
		this.mt = mt;
		this.chargeTypeId = chargeTypeId;
		this.contentTypeId = contentTypeId;
		this.mtTypeId = mtTypeId;
		this.totalSegment = totalSegment;
		this.mtResponseId = mtResponseId;
		this.mtInsertDate = mtInsertDate;
		this.sendDate = sendDate;
		this.doneDate = doneDate;
		this.retryCount = retryCount;
		this.statusId = statusId;
		this.sendTypeId = sendTypeId;
		this.pushTime = pushTime;
		this.logDate = logDate;
		this.parterId = parterId;
		this.note = note;
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

	public Integer getChargeTypeId()
	{
		return this.chargeTypeId;
	}

	public void setChargeTypeId(Integer chargeTypeId)
	{
		this.chargeTypeId = chargeTypeId;
	}

	public Integer getContentTypeId()
	{
		return this.contentTypeId;
	}

	public void setContentTypeId(Integer contentTypeId)
	{
		this.contentTypeId = contentTypeId;
	}

	public Integer getMtTypeId()
	{
		return this.mtTypeId;
	}

	public void setMtTypeId(Integer mtTypeId)
	{
		this.mtTypeId = mtTypeId;
	}

	public Integer getTotalSegment()
	{
		return this.totalSegment;
	}

	public void setTotalSegment(Integer totalSegment)
	{
		this.totalSegment = totalSegment;
	}

	public Integer getMtResponseId()
	{
		return this.mtResponseId;
	}

	public void setMtResponseId(Integer mtResponseId)
	{
		this.mtResponseId = mtResponseId;
	}

	public Timestamp getMtInsertDate()
	{
		return this.mtInsertDate;
	}

	public void setMtInsertDate(Timestamp mtInsertDate)
	{
		this.mtInsertDate = mtInsertDate;
	}

	public Timestamp getSendDate()
	{
		return this.sendDate;
	}

	public void setSendDate(Timestamp sendDate)
	{
		this.sendDate = sendDate;
	}

	public Timestamp getDoneDate()
	{
		return this.doneDate;
	}

	public void setDoneDate(Timestamp doneDate)
	{
		this.doneDate = doneDate;
	}

	public Integer getRetryCount()
	{
		return this.retryCount;
	}

	public void setRetryCount(Integer retryCount)
	{
		this.retryCount = retryCount;
	}

	public Integer getStatusId()
	{
		return this.statusId;
	}

	public void setStatusId(Integer statusId)
	{
		this.statusId = statusId;
	}

	public Integer getSendTypeId()
	{
		return this.sendTypeId;
	}

	public void setSendTypeId(Integer sendTypeId)
	{
		this.sendTypeId = sendTypeId;
	}

	public Timestamp getPushTime()
	{
		return this.pushTime;
	}

	public void setPushTime(Timestamp pushTime)
	{
		this.pushTime = pushTime;
	}

	public Timestamp getLogDate()
	{
		return this.logDate;
	}

	public void setLogDate(Timestamp logDate)
	{
		this.logDate = logDate;
	}

	public Integer getParterId()
	{
		return this.parterId;
	}

	public void setParterId(Integer parterId)
	{
		this.parterId = parterId;
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