package com.codepuran.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codepuran.dto.ResponseMessageDto;
import com.codepuran.dto.Student;

@RestController
public class UserController {
    @GetMapping("/students")
    public ResponseEntity<?> getAllStudent(HttpServletRequest request) {
        request.getLocalPort();
        List<Student> students = new ArrayList<>();
        students.add(new Student(1l, "Akshay"));
        students.add(new Student(2l, "Karan"));
        students.add(new Student(3l, "Hasmukh"));
        students.add(new Student(4l, "Keyur"));
        students.add(new Student(5l, "Prashant"));
        return ResponseEntity.ok(new ResponseMessageDto(request.getLocalPort(), students));
    }
}
