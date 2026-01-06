package com.spring.jpa.learn_springJPA_hibernate.course.jdbc;

import com.spring.jpa.learn_springJPA_hibernate.coursejpa.Course;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    private JdbcTemplate springJdbcTemplate;

    public CourseJDBCRepository(JdbcTemplate springJdbcTemplate){
        this.springJdbcTemplate = springJdbcTemplate;
    }
    private static String INSERT_QUERY =
            """
                 insert into course(id, name, author)
                 values(?,?,?)   
                    """;
    private static String DELETE_QUERY =
            """
                 Delete from course where id = ?
                    """;
    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }
    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_QUERY, 1);
    }
}
