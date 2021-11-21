package Adrian.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//metody do całej paczki student
@Repository //springboot
public interface StudentRepository extends JpaRepository<StudentEntity, Long> { //Interfejs ściąga domyślne zapytanka z repo
}
