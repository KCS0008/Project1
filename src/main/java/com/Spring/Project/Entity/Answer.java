package com.Spring.Project.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.Spring.Project.Constant.ProjectConstant;

@Entity
@Table(name = ProjectConstant.ANSWER_TABLE)
public class Answer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5601128171163948218L;
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "user_Id")
	private Long userId;

	@Column(name = "answer_1")
	private String answer1;

	@Column(name = "answer_2")
	private String answer2;

	@Column(name = "answer_3")
	private String answer3;

	@Column(name = "answer_4")
	private String answer4;

	@Column(name = "answer_5")
	private String answer5;

	@Column(name = "answer_6")
	private String answer6;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getAnswer4() {
		return answer4;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public String getAnswer5() {
		return answer5;
	}

	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}

	public String getAnswer6() {
		return answer6;
	}

	public void setAnswer6(String answer6) {
		this.answer6 = answer6;
	}

	@Override
	public String toString() {
		return "Answer [userId=" + userId + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3
				+ ", answer4=" + answer4 + ", answer5=" + answer5 + ", answer6=" + answer6 + "]";
	}

	public Answer(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6) {

		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer5 = answer5;
		this.answer6 = answer6;
	}

	public Answer() {

	}

}