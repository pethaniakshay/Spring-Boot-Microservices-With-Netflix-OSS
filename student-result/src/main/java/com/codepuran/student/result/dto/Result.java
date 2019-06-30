package com.codepuran.student.result.dto;


public class Result {

  private Long studentId;

  private String result;

  public Long getStudentId() {
    return studentId;
  }

  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public Result(Long studentId, String result) {
    this.studentId = studentId;
    this.result = result;
  }
}
