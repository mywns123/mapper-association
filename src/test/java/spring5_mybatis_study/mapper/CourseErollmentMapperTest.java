package spring5_mybatis_study.mapper;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import spring5_mybatis_study.config.ContextRoot;
import spring5_mybatis_study.dto.Course;
import spring5_mybatis_study.dto.CourseErollment;
import spring5_mybatis_study.dto.Student;
import spring5_mybatis_study.mappers.CourseErollmentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseErollmentMapperTest {

	private static final Log log = LogFactory.getLog(CourseErollmentMapperTest.class);

	@Autowired
	private CourseErollmentMapper mapper;

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test01SelctCourseErollmentById() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		CourseErollment courseErollment = new CourseErollment(new Course(1), new Student(1));
		CourseErollment erollment = mapper.selctCourseErollmentById(courseErollment);
		log.debug(erollment.toString());
		Assert.assertNotNull(erollment);
	}

	@Test
	public void test02InsertCourseErollment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		Course course = new Course();
		course.setCourseId(3);
		
		Student student = new Student();
		student.setStudId(1);
		
		CourseErollment courseErollment = new CourseErollment(course, student);
		int res = mapper.insertCourseErollment(courseErollment);
		Assert.assertEquals(1, res);
		log.debug("res erollment >> " + res);
	}

	@Test
	public void test03UpdateCourseErollment() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("item1", 2);
		map.put("item2", 1);
		map.put("item3", 3);
		map.put("item4", 1);

		int res = mapper.updateCourseErollment(map);
		Assert.assertSame(1, res);
		log.debug("res erollment >> " + res);
	}

	@Test
	public void test04DeleteCourseErollment() {
		CourseErollment courseErollment = new CourseErollment(new Course(2), new Student(1));
		int res = mapper.deleteCourseErollment(courseErollment);
		Assert.assertEquals(1, res);
		log.debug("res erollment >> " + res);
	}

}
