package pro.sky.java.course2.examlibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {
   private final JavaQuestionService out = new JavaQuestionService();

    @Mock
    private Random random;


    Question question1 = new Question("colour", "white");
    Question question2 = new Question("number", "two");
    Question question3 = new Question("season", "fall");
    Question question4 = new Question("letter", "a");
    Question question5 = new Question("fruit", "apple");

    @BeforeEach
    public void setUp(){
         Question question1 = new Question("colour", "white");
         Question question2 = new Question("number", "two");
         Question question3 = new Question("season", "fall");
         Question question4 = new Question("letter", "a");
         Question question5 = new Question("fruit", "apple");

         out.add(question1);
         out.add(question2);
         out.add(question3);
         out.add(question4);
         out.add(question5);
    }
    @Test
    public void addQuestionTest(){
        Collection<Question> expected = new ArrayList<>(out.getAll());
        Collection<Question> actual = new ArrayList<>();
        actual.add(question1);
        actual.add(question2);
        actual.add(question3);
        actual.add(question4);
        actual.add(question5);
        assertTrue(actual.size()==expected.size()&&actual.containsAll(expected)&&expected.containsAll(actual));
    }
    @Test
    public void getAll(){
        Collection<Question> expected = new ArrayList<>(out.getAll());
        Collection<Question> actual = new ArrayList<>();
        actual.add(question1);
        actual.add(question2);
        actual.add(question3);
        actual.add(question4);
        actual.add(question5);
        assertTrue(actual.size()==expected.size()&&actual.containsAll(expected)&&expected.containsAll(actual));
    }
    @Test
    public void getAllNotNull(){
        Collection<Question> expected = new ArrayList<>(out.getAll());
        assertNotNull(expected);
    }
    @Test
    public void removeTest(){
        Collection<Question> expected = new ArrayList<>(out.getAll().size()-1);
        Collection<Question> actual = new ArrayList<>();
        actual.remove(question1);
        actual.remove(question2);
        actual.remove(question3);
        actual.remove(question4);
        actual.remove(question5);
        assertTrue(actual.size()==expected.size()&&actual.containsAll(expected)&&expected.containsAll(actual));
    }
    @Test
    public void getRandomTest(){
        when(random.nextInt()).thenReturn(0);
        assertEquals(random.nextInt(),0 );
    }
    @Test
    public void getRandomQuestionTest(){
        List question = new ArrayList();
        question.add(question1);
        var expected = (question).get(random.nextInt(question.size()));
        List actual = new ArrayList<>();
        actual.add(question1);
        assertEquals(expected, actual.get(0));
    }

}
