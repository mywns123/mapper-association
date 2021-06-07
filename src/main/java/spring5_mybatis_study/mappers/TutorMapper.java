package spring5_mybatis_study.mappers;

import spring5_mybatis_study.dto.Tutor;

public interface TutorMapper {
	Tutor selectTutorByTutorId(Tutor tutor);
	
	/* Transaction */
	int insertTutor(Tutor tutor);
	
	/* Transaction */
	int deleteTutor(int tutorId);
}
