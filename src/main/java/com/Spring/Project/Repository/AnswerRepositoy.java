package com.Spring.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.Project.Entity.Answer;

@Repository
public interface AnswerRepositoy extends JpaRepository<Answer, Long> {

}
