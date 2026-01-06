package com.spring.jpa.learn_springJPA_hibernate.coursejpa.SpringDataJpa;

import com.spring.jpa.learn_springJPA_hibernate.coursejpa.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
