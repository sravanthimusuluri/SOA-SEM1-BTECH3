package com.example.student.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.student.entity.Student;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return Arrays.asList(
            new Student(1, "Ramesh", "CSE"),
            new Student(2, "Suresh", "ECE"),
            new Student(3, "Priya", "IT")
        );
    }
}
