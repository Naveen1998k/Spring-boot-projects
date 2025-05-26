package com.spring.Course_service.Services;

import com.spring.Course_service.Entity.CourseEntity;
import com.spring.Course_service.Utils.AppUtils;
import com.spring.Course_service.dao.CourseDao;
import com.spring.Course_service.dto.CourseRequestDTO;
import com.spring.Course_service.dto.CourseResponseDTO;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CourseService {


    private CourseDao courseDao;

    public CourseService( CourseDao courseDao) {

        this.courseDao = courseDao;
    }

    //create course object in DB -> POST
    public CourseResponseDTO onBoardCourse(CourseRequestDTO course){
       CourseEntity courseEntity= AppUtils.mapToEntity(course);
        CourseEntity newCourse=  courseDao.save(courseEntity);
       CourseResponseDTO courseResponseDTO= AppUtils.mapToResponse(newCourse);
       courseResponseDTO.setCourseUniqueCode(UUID.randomUUID().toString().split("-")[0]);



        return courseResponseDTO;

    }

    //load all the course from Database  // GET
    public List<CourseResponseDTO> findAllCourses(){

          Iterable<CourseEntity> courseEntities= courseDao.findAll();
       return StreamSupport.stream(courseEntities.spliterator(),false).map(AppUtils::mapToResponse)
                .collect(Collectors.toList());


    }

    //filter course by course id //GET
    public CourseResponseDTO findByCourseId(Integer courseId){
        CourseEntity courseEntity = courseDao.findById(courseId).orElseThrow(()->new RuntimeException(courseId+" Not valid"));
        return AppUtils.mapToResponse(courseEntity);
        // return courseList.stream().filter(course-> course.getCourseId()==courseId).findFirst().orElse( null);
    }

    //delete course  //DELETE
    public void deleteCourse(Integer courseId){
          courseDao.deleteById(courseId);
    }


    //update the course //PUT
    public CourseResponseDTO updateCourse(int courseId, CourseRequestDTO courseRequest) {
         CourseEntity existingCourseEntity= courseDao.findById(courseId).orElse(null);
        existingCourseEntity.setName(courseRequest.getName());
        existingCourseEntity.setTrainerName(courseRequest.getTrainerName());
        existingCourseEntity.setDuration(courseRequest.getDuration());
        existingCourseEntity.setStartDate(courseRequest.getStartDate());
        existingCourseEntity.setCourseType(courseRequest.getCourseType());
        existingCourseEntity.setFees(courseRequest.getFees());
        existingCourseEntity.setCertificateAvailable(courseRequest.isCertificateAvailable());
        existingCourseEntity.setDescription(courseRequest.getDescription());
            CourseEntity courseEntity=courseDao.save(existingCourseEntity);
        return AppUtils.mapToResponse(courseEntity);

    }

}
