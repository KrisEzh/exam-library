package pro.sky.java.course2.examlibrary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {

    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService){this.javaQuestionService=javaQuestionService;}

    @GetMapping(path="/java/add")
    public String addQuestion(@RequestParam("question") String question, @RequestParam("answer") String answer){
        return "Вопрос добавлен " + javaQuestionService.add(question, answer);
    }

    @GetMapping(path="/java/remove")
    public String removeQuestion(@RequestParam("question") String question, @RequestParam("answer") String answer){
        return "Вопрос удален " + javaQuestionService.remove(question, answer);
    }
    @GetMapping(path="/java")
    public Collection<Question> getAll(){return javaQuestionService.getAll();}
}
