package com.spring.Course_service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequestDTO
{

    private String name;
    private String trainerName;
    private String duration; // days
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private Date startDate;
    private String courseType; //Live OR Recodring
    private double fees;
    private boolean certificateAvailable;
    private String description;
}
