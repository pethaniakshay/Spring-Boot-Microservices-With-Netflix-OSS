package com.codepuran.dto;

import java.util.List;

public class ResponseMessageDto {

    private Integer port;

    private List<Student> students;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public ResponseMessageDto(Integer port, List<Student> students) {
        super();
        this.port = port;
        this.students = students;
    }
}
