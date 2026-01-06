package com.spring.jpa.learn_springJPA_hibernate.course.jdbc;

import com.spring.jpa.learn_springJPA_hibernate.course.jpa.CourseJpaRepository;
import com.spring.jpa.learn_springJPA_hibernate.coursejpa.Course;
import com.spring.jpa.learn_springJPA_hibernate.coursejpa.SpringDataJpa.CourseSpringDataJpaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    private CourseSpringDataJpaRepository repository;

    public CourseCommandLineRunner(CourseSpringDataJpaRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"learn aws","akash"));
        repository.save(new Course(2,"learn azure","akshay"));
        repository.save(new Course(3,"microservices","akash"));
        repository.save(new Course(4,"learn jpa","akash"));
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));

        System.out.println(repository.findByAuthor("akash"));

        System.out.println(repository.findByName("learn jpa"));

    }

}
