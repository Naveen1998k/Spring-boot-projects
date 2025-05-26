package com.spring.Course_service.Utils;

import com.spring.Course_service.Entity.CourseEntity;
import com.spring.Course_service.dto.CourseRequestDTO;
import com.spring.Course_service.dto.CourseResponseDTO;

import java.util.UUID;

public class AppUtils {


    public static CourseEntity mapToEntity(CourseRequestDTO courseRequest) {
        CourseEntity courseEntity = new CourseEntity();
        courseEntity.setName(courseRequest.getName());
        courseEntity.setTrainerName(courseRequest.getTrainerName());
        courseEntity.setDuration(courseRequest.getDuration());
        courseEntity.setStartDate(courseRequest.getStartDate());
        courseEntity.setCourseType(courseRequest.getCourseType());
        courseEntity.setFees(courseRequest.getFees());
        courseEntity.setCertificateAvailable(courseRequest.isCertificateAvailable());
        courseEntity.setDescription(courseRequest.getDescription());
        return courseEntity;
    }

    public static CourseResponseDTO mapToResponse(CourseEntity courseEntity) {
        CourseResponseDTO courseResponse = new CourseResponseDTO();
        courseResponse.setCourseId(courseEntity.getCourseId());
        courseResponse.setName(courseEntity.getName());
        courseResponse.setTrainerName(courseEntity.getTrainerName());
        courseResponse.setDuration(courseEntity.getDuration());
        courseResponse.setStartDate(courseEntity.getStartDate());
        courseResponse.setCourseType(courseEntity.getCourseType());
        courseResponse.setFees(courseEntity.getFees());
        courseResponse.setCertificateAvailable(courseEntity.isCertificateAvailable());
        courseResponse.setDescription(courseEntity.getDescription());

        return courseResponse;
    }


}
