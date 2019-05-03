package com.example.clientApp.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clientApp.Dto.NotificationResponseDTO;
import com.example.clientApp.model.NotificationT;
import com.example.clientApp.repository.NotificationRepository;
import com.example.clientApp.service.NotificationService;

/**
 * This class is used as notification service
 * 
 * @author j519
 *
 */
@Service
public class NotificationServiceImpl implements NotificationService {

	private final Logger logger = LoggerFactory.getLogger(NotificationServiceImpl.class);

	@Autowired
	private NotificationRepository notificationRepository;


	


	@Override
	public List<NotificationResponseDTO> findAllByNotificationId(Long notificationId) {
		logger.trace("invoke findAllByNotificationId() to get notifications by ID in NotificationServiceImpl class");
		List<NotificationT> notificationList = notificationRepository.findAllByNotificationId(notificationId);
		return convertNotificationToResDTO(notificationList);
	}
	private List<NotificationResponseDTO> convertNotificationToResDTO(List<NotificationT> notificationList) {
		List<NotificationResponseDTO> responseDTOList = new ArrayList<>();
		for (NotificationT notification : notificationList) {
			NotificationResponseDTO responseDTO = new NotificationResponseDTO();
			responseDTO.setTitle(notification.getTitle());
			responseDTO.setLongDesc(notification.getLongDescription());
			responseDTO.setShortDesc(notification.getShortDescription());
			responseDTO.setNotificationId(notification.getNotificationId());
			responseDTO.setNotificationDate(null);
			responseDTO.setUserId(notification.getUserId());
			responseDTO.setNotificationStatus(notification.getNotiStat().toString());
			responseDTOList.add(responseDTO);
		}
		return responseDTOList;
	}

}
