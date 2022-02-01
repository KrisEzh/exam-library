package pro.sky.java.course2.examlibrary;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService{

    Set<Question> questions = new HashSet<>();

    Question question1 = new Question("colour", "white");
    Question question2 = new Question("number", "two");
    Question question3 = new Question("season", "fall");
    Question question4 = new Question("letter", "a");
    Question question5 = new Question("fruit", "apple");

    @Override
    public Question add(String question, String answer) {
         Question newQuestion = new Question(question,answer);
         return add(newQuestion);
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(String question, String answer) {
        Question newQuestion = new Question(question,answer);
        return remove(newQuestion);
    }
    @Override
    public Question remove(Question question){
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }


    @Override
    public Question getRandomQuestion() {
        var random = new Random();
        var questions = Arrays.asList(question1,question2,question3,question4,question5);
        var randQuestion = questions.get(random.nextInt(questions.size()));
        return randQuestion;

    }


}
