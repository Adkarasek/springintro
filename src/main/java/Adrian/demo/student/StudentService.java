package Adrian.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//zbior metod do studenta (CRUD)
@Service
public class StudentService {

    private final StudentRepository studentRepository; //wstrzyknięcie zależności konstruktorem

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<StudentEntity> findAllStudents(){

        return studentRepository.findAll();
    }
}
