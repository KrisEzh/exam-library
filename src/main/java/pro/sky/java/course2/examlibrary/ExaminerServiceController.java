package pro.sky.java.course2.examlibrary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController

public class ExaminerServiceController {
    private final ExaminerService examinerService;

    public ExaminerServiceController(ExaminerService examinerService) {
       this. examinerService = examinerService;
    }


    @GetMapping(path="/get")
    public Set<Question> getQuestions(@RequestParam("amount") int amount){
        return  examinerService.getQuestions(amount);
    }

}
