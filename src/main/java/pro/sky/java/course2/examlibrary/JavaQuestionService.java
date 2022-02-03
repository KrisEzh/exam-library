package pro.sky.java.course2.examlibrary;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService{

    Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
         Question newQuestion = new Question(question,answer);
         return add(newQuestion);
    }

    @Override
    public Question add(Question question) {
        if (questions.contains(question)) {
            throw new QuestionExistsException();
        } else {
            questions.add(question);
            return question;
        }
    }

    @Override
    public Question remove(String question, String answer) {
        Question newQuestion = new Question(question,answer);
        return remove(newQuestion);
    }
    @Override
    public Question remove(Question question){
        if(questions.contains(question)) {
            questions.remove(question);
        }else{
            throw new QuestionNotFoundException();
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }


    @Override
    public Question getRandomQuestion() {
        var random = new Random();
        Question[]questions = getAll().toArray(new Question[0]);
        var randQuestion = random.nextInt(questions.length);
        return questions[randQuestion];

    }


}
