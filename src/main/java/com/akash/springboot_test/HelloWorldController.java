package com.akash.springboot_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloWorldController {

    // Endpoint to return a "Hello, World!" message
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    // Endpoint to return a list of students with their positions
    @GetMapping("/students")
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student(1, "Akash"),
                new Student(2, "John"),
                new Student(3, "Emily"),
                new Student(4, "Sophia"));
    }

    // Static inner class to represent a student
    static class Student {
        private int position;
        private String name;

        // Constructor
        public Student(int position, String name) {
            this.position = position;
            this.name = name;
        }

        // Getters
        public int getPosition() {
            return position;
        }

        public String getName() {
            return name;
        }

        // Setters (optional if needed for future updates)
        public void setPosition(int position) {
            this.position = position;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
