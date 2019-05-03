package com.example.clientApp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clientApp.Dto.ApiResponse;
import com.example.clientApp.Dto.NotificationResponseDTO;
import com.example.clientApp.service.NotificationService;

/**
 * This class is used as notification controller to view notification for users
 * 
 * @author j519
 *
 */
@RestController
@RequestMapping("/api/notification")
public class NotificationController {
	private final Logger logger = LoggerFactory.getLogger(NotificationController.class);

	@Autowired
	private NotificationService notificationService;

	/**
	 * find all notifications by id
	 * 
	 * @param notificationId
	 * @return
	 */

	@GetMapping("/{notificationId}")
	public ApiResponse findAllByNotificationId(@PathVariable Long notificationId) {
		logger.trace("invoke findAllByNotificationId() to get notifications by ID in NotificationController class");
		List<NotificationResponseDTO> response = notificationService.findAllByNotificationId(notificationId);

		logger.debug("get notification data successfully by notification id");
		return ApiResponse.toOkResponse(response, "SUCCESS", "SUCCESS");

	}

}
