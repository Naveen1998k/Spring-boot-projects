package com.spring.Course_service.Controller;


import com.spring.Course_service.Services.CourseService;
import com.spring.Course_service.dto.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addCourse(@RequestBody Course course){
      Course newCourse=  courseService.onBoardCourse(course);
        return new ResponseEntity<>(newCourse, HttpStatus.CREATED);
    }

    @GetMapping("/view")
    public ResponseEntity<List<Course>> findAllCourses(){
            return new ResponseEntity<>(courseService.findAllCourses(),HttpStatus.OK);
    }

    @GetMapping("/search/{courseId}")
    public ResponseEntity<?> findCourseById(@PathVariable int courseId){
        return new ResponseEntity<>(courseService.findByCourseId(courseId),HttpStatus.OK);
    }

    @GetMapping("/search/request")
    public ResponseEntity<?> findCourseByIdReq(@RequestParam(required = false,defaultValue = "1") int courseId){
        return new ResponseEntity<>(courseService.findByCourseId(courseId),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{courseId}")
    public ResponseEntity<?> deleteCourse(@PathVariable int courseId){

        courseService.deleteCourse(courseId);
        return new ResponseEntity<>("" ,HttpStatus.NO_CONTENT);
    }

    @PutMapping("/update/{courseId}")
    public ResponseEntity<?> updateCourse(@PathVariable int courseId, @RequestBody Course course){
        return new ResponseEntity<>(courseService.updateCourse(courseId,course),HttpStatus.OK);
    }
}
