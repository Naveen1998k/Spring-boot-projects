package com.spring.Course_service.Services;

import com.spring.Course_service.dto.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CourseService {

    private List<Course> courseList=new ArrayList<>();


    //create course object in DB -> POST
    public Course onBoardCourse(Course course){

        course.setCourseId(new Random().nextInt(3756));
        courseList.add(course);
        return course;

    }

    //load all the course from Database  // GET
    public List<Course> findAllCourses(){
        return courseList;
    }

    //filter course by course id //GET
    public Course findByCourseId(Integer courseId){
        return courseList.stream().filter(course-> course.getCourseId()==courseId).findFirst().orElse( null);
    }

    //delete course  //DELETE
    public void deleteCourse(Integer courseId){
        Course course = findByCourseId(courseId);
        courseList.remove(course);

    }


    //update the course //PUT
    public Course updateCourse(int courseId, Course course) {
        Course existingCourse = findByCourseId(courseId);
        courseList.set(courseList.indexOf(existingCourse), course);
        return course;
    }

}
