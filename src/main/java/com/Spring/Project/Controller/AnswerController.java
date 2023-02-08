package com.Spring.Project.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Project.Constant.ProjectConstant;

import com.Spring.Project.Service.AnswerService;

@RestController
@RequestMapping(value = ProjectConstant.FORWORD_SLASH)
public class AnswerController {
	@Autowired
	private AnswerService answerService;

	@PostMapping(value = ProjectConstant.RECEIVE_ANSWER)
	public ResponseEntity<Integer> receiveAnswers(@RequestBody Map<String, Object> answers) {
		answerService.saveAnswers(answers);
		int index = answerService.calculateHappinessIndex(answers);
		return new ResponseEntity<>(index, HttpStatus.OK);
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@PutMapping(value = ProjectConstant.UPDATE_ANSWER)
	public ResponseEntity<Integer> updateAnswer(@RequestBody Map<String, Object> answers) {
		jdbcTemplate.update(
				"INSERT INTO answers (answer1, answer2, answer3, answer4, answer5,answer6) VALUES (?, ?, ?, ?, ?, ?)",
				answers.get("answer1"), answers.get("answer2"), answers.get("answer3"), answers.get("answer4"),
				answers.get("answer5"), answers.get("answer6"));

		int index = answerService.calculateHappinessIndex(answers);

		return new ResponseEntity<>(index, HttpStatus.OK);
	}

}
