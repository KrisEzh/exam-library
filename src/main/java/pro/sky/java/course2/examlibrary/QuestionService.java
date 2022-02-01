package pro.sky.java.course2.examlibrary;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);

    Question add(Question question);

    Question remove(String question, String answer);

    Question remove(Question question);

    Collection<Question> getAll();

    Object getRandomQuestion();
}

