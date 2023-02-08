package com.Spring.Project.Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Project.Entity.Answer;
import com.Spring.Project.Repository.AnswerRepositoy;

@Service
public class AnswerService {
	@Autowired
	private AnswerRepositoy answerRepositoy;

	public void saveAnswers(Map<String, Object> answer) {
		Answer answer1 = convertMapToAnswerEntity(answer);
		answerRepositoy.save(answer1);
	}

	public Answer convertMapToAnswerEntity(Map<String, Object> answers) {
		Answer answer = new Answer();
		answer.setAnswer1((String) answers.get("answer1"));
		answer.setAnswer2((String) answers.get("answer2"));
		answer.setAnswer3((String) answers.get("answer3"));
		answer.setAnswer4((String) answers.get("answer4"));
		answer.setAnswer5((String) answers.get("answer5"));
		answer.setAnswer6((String) answers.get("answer6"));
		return answer;
	}

	public int calculateHappinessIndex(Map<String, Object> answers) {
		int index = 0;

		if (answers.get("answer1").equals("yes")) {
			index += 5;
		}
		if (answers.get("answer2").equals("yes")) {
			index += 3;
		}
		if (answers.get("answer3").equals("yes")) {
			index += 4;
		}
		if (answers.get("answer4").equals("yes")) {
			index += 5;
		}

		if (answers.get("answer5").equals("yes")) {
			index += 3;
		}
		if (answers.get("answer6").equals("yes")) {
			index += 5;
		}

		return index;
	}
}
