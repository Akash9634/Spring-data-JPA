package com.spring.jpa.learn_springJPA_hibernate.course.jdbc;

import com.spring.jpa.learn_springJPA_hibernate.coursejpa.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    CourseJDBCRepository repository;

    public CourseJdbcCommandLineRunner(CourseJDBCRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"learn aws","akash"));
        repository.insert(new Course(2,"learn azure","akshay"));
        repository.insert(new Course(3,"microservices","akash"));
        repository.insert(new Course(4,"learn jpa","akash"));
        repository.deleteById(1);
    }

}
