package com.example.clientApp.Dto;

import java.util.List;

import com.example.clientApp.model.NotificationT;

public class NotificationResponseWrapper {
	private String notiDate;
	private List<NotificationT> notiList;

	public String getNotiDate() {
		return notiDate;
	}

	public void setNotiDate(String notiDate) {
		this.notiDate = notiDate;
	}

	public List<NotificationT> getNotiList() {
		return notiList;
	}

	public void setNotiList(List<NotificationT> notiList) {
		this.notiList = notiList;
	}

	@Override
	public String toString() {
		return "NotificationResponseWrapper [notiDate=" + notiDate + ", notiList=" + notiList + "]";
	}

}
