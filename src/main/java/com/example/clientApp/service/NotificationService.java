package com.example.clientApp.service;

import java.util.List;

import com.example.clientApp.Dto.NotificationResponseDTO;

/**
 * This interface is used for notification service
 * 
 * @author j519
 *
 */
public interface NotificationService {

	public List<NotificationResponseDTO> findAllByNotificationId(Long notificationId);

}
