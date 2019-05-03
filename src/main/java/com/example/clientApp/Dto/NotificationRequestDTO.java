package com.example.clientApp.Dto;

import java.util.Date;

public class NotificationRequestDTO {

	private Long notificationId;
	private String title;
	private Date notificationDate;
	private String shortDesc;
	private String longDesc;
	private String userId;
	private String notificationStatus;
	private String pushNotiSendStat;
	private Long mstKeyId;

	public String getPushNotiSendStat() {
		return pushNotiSendStat;
	}

	public void setPushNotiSendStat(String pushNotiSendStat) {
		this.pushNotiSendStat = pushNotiSendStat;
	}

	public Long getMstKeyId() {
		return mstKeyId;
	}

	public void setMstKeyId(Long mstKeyId) {
		this.mstKeyId = mstKeyId;
	}

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getNotificationDate() {
		return notificationDate;
	}

	public void setNotificationDate(Date notificationDate) {
		this.notificationDate = notificationDate;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(String notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

}
