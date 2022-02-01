package pro.sky.java.course2.examlibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {
    @Mock
    private JavaQuestionService javaQuestionService;

    @BeforeEach
    public void initOut(){out=new ExaminerServiceImpl(javaQuestionService);}

    @InjectMocks
    private ExaminerServiceImpl out;

    @BeforeEach
    public void setUp(){
        Question question1 = new Question("colour", "white");
        when(javaQuestionService.getRandomQuestion()).thenReturn(question1);

    }

    @Test
    public void getQuestionsTest(){
        Question question1 = new Question("colour", "white");
        Set actual = new HashSet();
        actual.add(question1);

        assertEquals(out.getQuestions(1),actual);
    }
}
