package com.hcl.phase3sectiontwo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.phase3sectiontwo.model.FeedbackEntity;
import com.hcl.phase3sectiontwo.repository.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository feedbackRepository;
	
	@Transactional
	public FeedbackEntity saveFeedback(FeedbackEntity feedback) {
		return feedbackRepository.save(feedback);
	}

}
