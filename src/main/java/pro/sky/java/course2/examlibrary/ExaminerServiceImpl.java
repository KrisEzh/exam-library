package pro.sky.java.course2.examlibrary;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final Random random;
    private final JavaQuestionService javaQuestionService;

    public ExaminerServiceImpl(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
        random = new Random();
    }


    @Override
    public Set<Question> getQuestions(int amount) throws BadRequestException {
        if( javaQuestionService.getAll().size() < amount || amount < 0 ){
            throw new BadRequestException();
        }
        Set<Question> qList = new HashSet<>();
        while(qList.size() < amount) {
            qList.add(javaQuestionService.getRandomQuestion());
        }
        return  qList;
    }
}
