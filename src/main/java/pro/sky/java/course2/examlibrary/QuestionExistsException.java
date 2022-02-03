package pro.sky.java.course2.examlibrary;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionExistsException extends RuntimeException {
    public QuestionExistsException(){super("Такой вопрос уже есть");}
}
