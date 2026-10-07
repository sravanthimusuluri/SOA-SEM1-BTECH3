package com.example.teacher.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.teacher.entity.Teacher;

@Service
public class TeacherService {
    public List<Teacher> getTeachers() {
        return Arrays.asList(
            new Teacher(1, "Dr. Kumar", "Java"),
            new Teacher(2, "Dr. Anitha", "Database"),
            new Teacher(3, "Dr. Ravi", "Computer Networks")
        );
    }
}
