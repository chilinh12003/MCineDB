package my.db.obj;

import java.sql.Timestamp;
import java.util.Calendar;

import my.db.dao.DaoChargeLog;
import uti.MyDate;

/**
 * ChargeLog entity. @author MyEclipse Persistence Tools
 */

public class ChargeLog implements java.io.Serializable
{

	// Fields

	private Integer logId;
	private Integer serviceId;
	private String phoneNumber;
	private Integer pid;
	private Timestamp chargeDate;
	private Float price;
	private Integer typeId;
	private Integer channelId;
	private Integer statusId;
	private String telcoResult;
	private Integer partnerId;
	private Integer noteTypeId;

	// Constructors

	/** default constructor */
	public ChargeLog(Subscriber sub, Service service, DaoChargeLog.ChargeType chargeType, DaoChargeLog.Status status, String telcoResult)
	{
		this.serviceId = service.getServiceId();
		this.phoneNumber = sub.getPhoneNumber();
		this.pid = sub.getPid();
		this.chargeDate = MyDate.date2Timestamp(Calendar.getInstance());
		this.price = service.getPrice();
		this.typeId = chargeType.getValue();
		this.channelId = sub.getChannelId();
		this.statusId = status.getValue();
		this.telcoResult = telcoResult;
		this.partnerId = sub.getPartnerId();
		
	}

	





	public ChargeLog(Integer logId, Integer serviceId, String phoneNumber, Integer pid, Timestamp chargeDate,
			Float price, Integer typeId, Integer channelId, Integer statusId, String telcoResult, Integer partnerId,
			Integer noteTypeId)
	{
		super();
		this.logId = logId;
		this.serviceId = serviceId;
		this.phoneNumber = phoneNumber;
		this.pid = pid;
		this.chargeDate = chargeDate;
		this.price = price;
		this.typeId = typeId;
		this.channelId = channelId;
		this.statusId = statusId;
		this.telcoResult = telcoResult;
		this.partnerId = partnerId;
		this.noteTypeId = noteTypeId;
	}







	public Integer getLogId()
	{
		return logId;
	}



	public void setLogId(Integer logId)
	{
		this.logId = logId;
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



	public Timestamp getChargeDate()
	{
		return this.chargeDate;
	}

	public void setChargeDate(Timestamp chargeDate)
	{
		this.chargeDate = chargeDate;
	}

	public Float getPrice()
	{
		return this.price;
	}

	public void setPrice(Float price)
	{
		this.price = price;
	}

	public Integer getTypeId()
	{
		return this.typeId;
	}

	public void setTypeId(Integer typeId)
	{
		this.typeId = typeId;
	}

	public Integer getChannelId()
	{
		return this.channelId;
	}

	public void setChannelId(Integer channelId)
	{
		this.channelId = channelId;
	}

	public Integer getStatusId()
	{
		return this.statusId;
	}

	public void setStatusId(Integer statusId)
	{
		this.statusId = statusId;
	}

	public String getTelcoResult()
	{
		return this.telcoResult;
	}

	public void setTelcoResult(String telcoResult)
	{
		this.telcoResult = telcoResult;
	}

	public Integer getPartnerId()
	{
		return this.partnerId;
	}

	public void setPartnerId(Integer partnerId)
	{
		this.partnerId = partnerId;
	}

	public Integer getNoteTypeId()
	{
		return this.noteTypeId;
	}

	public void setNoteTypeId(Integer noteTypeId)
	{
		this.noteTypeId = noteTypeId;
	}

}