package spring5_mybatis_study.mappers;

import java.util.Map;

import org.springframework.stereotype.Component;

import spring5_mybatis_study.dto.CourseErollment;

@Component
public interface CourseErollmentMapper {

	CourseErollment selctCourseErollmentById(CourseErollment courseErollment);

	int insertCourseErollment(CourseErollment courseErollment);

	int updateCourseErollment(Map<String, Integer> map);

	int deleteCourseErollment(CourseErollment courseErollment);

}
