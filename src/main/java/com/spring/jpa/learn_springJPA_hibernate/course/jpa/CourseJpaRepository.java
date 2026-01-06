package com.spring.jpa.learn_springJPA_hibernate.course.jpa;

import com.spring.jpa.learn_springJPA_hibernate.coursejpa.Course;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

    private EntityManager entityManager;

    public CourseJpaRepository(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    public void insert(Course course){
        entityManager.merge(course);
    }
    public Course findById(long id){
        return entityManager.find(Course.class, id);
    }
    public void deleteById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}
