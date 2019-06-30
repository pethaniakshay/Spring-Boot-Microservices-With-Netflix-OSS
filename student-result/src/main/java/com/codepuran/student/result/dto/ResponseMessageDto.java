package com.codepuran.student.result.dto;

import java.util.List;

public class ResponseMessageDto {

    private Integer port;

    private List<Result> results;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public ResponseMessageDto(Integer port, List<Result> results) {
        super();
        this.port = port;
        this.results = results;
    }
}
