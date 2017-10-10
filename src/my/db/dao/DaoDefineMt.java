package my.db.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import my.db.base.*;
import my.db.obj.DefineMt;

/**
 * DefineMt entity. @author MyEclipse Persistence Tools
 */

public class DaoDefineMt extends DaoBase<DefineMt>
{
	public DaoDefineMt()
	{
		super(DefineMt.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ArrayList<String> setListKey()
	{
		ArrayList<String> listKey = new ArrayList<String>();
		listKey.add("defineMtId");
		return listKey;
	}

	public enum MTType
	{
		Default(100), Invalid(101), Help(102), SystemError(103), Fail(104), PushMT(107), Reminder(108),

		// ---- LẤY MẬT KHẨU
		GetOTPSuccess(120), GetOTPNotReg(121),

		// -----ĐĂNG KÝ DỊCH VỤ
		/**
		 * Đăng ký mới thành công
		 */
		RegNewSuccess(200),

		/**
		 * Đăng ký lai thành công và miễn phí
		 */
		RegAgainSuccessFree(201),
		/**
		 * Đăng ký lại thành công không miễn phí (đăng ký lại nhưng hết thời
		 * gian khuyến mại)
		 */
		RegAgainSuccessNotFree(202),

		/**
		 * Đăng ký rồi nhưng lại đăng ký tiếp vần còn trong thời gian khuyến mại
		 */
		RegRepeatFree(203),

		/**
		 * Đắng ký lặp trong thời gian hết khuyến mại
		 */
		RegRepeatNotFree(204),

		/**
		 * Đăng ký nhưng tải khoản khách hàng không đủ tiền
		 */
		RegNotEnoughMoney(205),
		/**
		 * Gửi MT yêu cầu confirm và được free
		 */
		RegConfirmFree(206),
		
		/**
		 * Gửi MT yêu cầu confirm và ko được free
		 */
		RegConfirmNotFree(207),
		
		/**
		 * Đăng ký sai cú pháp, VD: gửi Y khi chưa gửi DK
		 */
		RegInvalid(208),
		
		/**
		 * Đăng ký không thành công
		 */
		RegFail(220),

		/**
		 * DK nhưng hệ thống bị lỗi
		 */
		RegSystemError(221),

		// -----HỦY DỊCH VỤ
		/**
		 * Hủy thành công dịch vụ
		 */
		DeregSuccess(300),

		/**
		 * Huy khi mà chưa đăng ký dịch vụ
		 */
		DeregNotRegister(301),

		/**
		 * Hủy không thành công do lỗi hệ thống...
		 */
		DeregFail(302),

		DeregSystemError(303),

		/**
		 * Hủy khi gia hạn không thành công
		 */
		DeregExtendFail(304),

		// -----NOTIFY

		/**
		 * Tin tức hàng này
		 */
		NewsDaily(602),

		/**
		 * Thông báo khi gia hạn thành công
		 */
		NotifyRenewSuccess(603),

		/**
		 * Thông báo khi gia hạn thành công, mà lần gia hạn trước không thành
		 * công.
		 */
		NotifyRenewSuccessBeforeFail(604),

		/**
		 * Thông báo gia han không thành công cho lần gia hạn trong ngày
		 */
		NotifyRenewFail(605),

		;

		private int value;

		private MTType(int value)
		{
			this.value = value;
		}

		public Integer getValue()
		{
			return this.value;
		}

		public static MTType fromValue(Integer iValue)
		{
			for (MTType type : MTType.values())
			{
				if (type.getValue().equals(iValue))
					return type;
			}
			return Default;
		}

	}

	private static String getDefaultMT(MTType mtTypeId) throws Exception
	{
		try
		{
			String ShortCode = "5138";
			String MT = "";

			switch (mtTypeId)
			{
				case Invalid :
					MT = "Tin nhan sai cu phap, de bien thong tin chi tiet ve dich vu voi long soan TG gui "
							+ ShortCode;
					break;
				default :
					MT = "Hien tai he thong dang ban. Quy khach vui long thao tac lai sau. Chi tiet LH 0435381029 (cuoc goi co dinh).";
					break;

			}
			return MT;
		}
		catch (Exception ex)
		{
			throw ex;
		}
	}

	/**
	 * Lấy 1 MT đã được định nghĩa trong datbase, Nếu trong database không có
	 * thì lấy MT mặc định của dịch vụ. Trong trường hợp có nhiều hơn 2 MT cùng
	 * mã. thì lấy random
	 * 
	 * @param serviceId
	 * @param list
	 * @param mtType
	 * @return
	 * @throws Exception
	 */
	public static String getMTContent(int serviceId, List<DefineMt> list, MTType mtType) throws Exception
	{
		try
		{
			if (list.size() < 1)
				return getDefaultMT(mtType);

			Vector<DefineMt> listRandom = new Vector<DefineMt>();

			for (DefineMt item : list)
			{
				if (item.getServiceId().intValue() == serviceId && item.getMtTypeId().equals(mtType.getValue())
						&& item.getMt().length() > 0)
					listRandom.add(item);
			}

			if (listRandom.size() < 1)
				return getDefaultMT(mtType);

			if (listRandom.size() == 1)
				return listRandom.get(0).getMt();

			Random mRandom = new Random();
			int Range = listRandom.size();
			int Rand = mRandom.nextInt(Range);

			return listRandom.get(Rand).getMt();
		}
		catch (Exception ex)
		{
			throw ex;
		}
	}
}