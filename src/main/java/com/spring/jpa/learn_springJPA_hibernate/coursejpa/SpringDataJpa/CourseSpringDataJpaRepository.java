package com.spring.jpa.learn_springJPA_hibernate.coursejpa.SpringDataJpa;

import com.spring.jpa.learn_springJPA_hibernate.coursejpa.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
