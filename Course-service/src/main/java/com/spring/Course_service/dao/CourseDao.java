package com.spring.Course_service.dao;

import com.spring.Course_service.Entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface CourseDao extends CrudRepository<CourseEntity, Integer> {

}
