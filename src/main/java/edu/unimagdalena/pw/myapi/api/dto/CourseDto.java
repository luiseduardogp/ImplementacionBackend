package edu.unimagdalena.pw.myapi.api.dto;

import java.util.List;

public class CourseDto {
    private Long id;
    private String name;
    private Long teacherId;
    private List<Long> studentIds;
    private Long courseMaterialId;
}
