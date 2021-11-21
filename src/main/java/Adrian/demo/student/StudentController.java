package Adrian.demo.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students") //adres
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/find/all")
    public ResponseEntity<List<StudentEntity>> getAllStudents(){

        List<StudentEntity> students = studentService.findAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
