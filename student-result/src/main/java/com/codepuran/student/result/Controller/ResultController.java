package com.codepuran.student.result.Controller;

import com.codepuran.student.result.dto.ResponseMessageDto;
import com.codepuran.student.result.dto.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/result")
public class ResultController {


  @GetMapping
  public ResponseEntity<?> getAllStudent(HttpServletRequest request) {
    request.getLocalPort();
    List<Result> results = new ArrayList<>();
    results.add(new Result(1l, "PASS"));
    results.add(new Result(2l, "FAIL"));
    results.add(new Result(3l, "PASS"));
    results.add(new Result(4l, "FAIL"));
    results.add(new Result(5l, "PASS"));
    return ResponseEntity.ok(new ResponseMessageDto(request.getLocalPort(), results));
  }

}
