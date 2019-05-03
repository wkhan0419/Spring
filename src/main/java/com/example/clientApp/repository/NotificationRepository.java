package com.example.clientApp.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.clientApp.model.NotificationT;

@Repository
public interface NotificationRepository extends PagingAndSortingRepository<NotificationT, Long> {

	public List<NotificationT> findAllByNotificationId(Long notificationId);
}