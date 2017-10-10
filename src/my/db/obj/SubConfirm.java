package my.db.obj;

import java.sql.Timestamp;
import java.util.Calendar;

import my.db.dao.DaoSubConfirm;
import uti.MyDate;

/**
 * SubConfirm entity. @author MyEclipse Persistence Tools
 */

public class SubConfirm implements java.io.Serializable
{

	// Fields

	private Integer logId;
	private Integer serviceId;
	private String phoneNumber;
	private Integer pid;
	private Timestamp createDate;
	private Integer statusId;
	private Integer partnerId;
	// Constructors

	/** default constructor */
	public SubConfirm()
	{
	}

	

	public SubConfirm(Integer logId,Integer serviceId, String phoneNumber, Integer pid, Timestamp createDate, Integer statusId)
	{
		super();
		this.logId = logId;
		this.serviceId = serviceId;
		this.phoneNumber = phoneNumber;
		this.pid = pid;
		this.createDate = createDate;
		this.statusId = statusId;
	}
	public SubConfirm(Integer serviceId, String phoneNumber, Integer pid,Integer partnerId)
	{
		super();
		this.serviceId = serviceId;
		this.phoneNumber = phoneNumber;
		this.pid = pid;
		this.createDate = MyDate.date2Timestamp(Calendar.getInstance());
		this.statusId = DaoSubConfirm.Status.WaitingConfirm.getValue();
		this.partnerId = partnerId;
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
		return this.pid;
	}

	public void setPid(Integer pid)
	{
		this.pid = pid;
	}

	public Timestamp getCreateDate()
	{
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate)
	{
		this.createDate = createDate;
	}

	public Integer getStatusId()
	{
		return this.statusId;
	}

	public void setStatusId(Integer statusId)
	{
		this.statusId = statusId;
	}



	public Integer getPartnerId()
	{
		return partnerId;
	}

	public void setPartnerId(Integer partnerId)
	{
		this.partnerId = partnerId;
	}

}