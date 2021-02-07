package com.hcl.phase3sectiontwo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.phase3sectiontwo.model.FeedbackEntity;
import com.hcl.phase3sectiontwo.service.FeedbackService;

@RestController
public class FeedbackController {

	Logger logger = LoggerFactory.getLogger(FeedbackController.class);

	@Autowired
	FeedbackService feedbackService;

	@RequestMapping("/")
	public String viewHomePage() {
		return "Homepage";
	}

	@PostMapping("/add")
	public FeedbackEntity addFeedback(@RequestBody FeedbackEntity feedback) {
		return feedbackService.saveFeedback(feedback);
	}
}
