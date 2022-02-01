package pro.sky.java.course2.examlibrary;

import java.util.Set;

public interface ExaminerService {


    Set<Question> getQuestions(int amount) throws BadRequestException;
}
