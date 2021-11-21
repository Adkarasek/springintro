package Adrian.demo.student;
import javax.persistence.*;

@Entity(name = "students")
public class StudentEntity {
    @Id //no id
    @GeneratedValue(strategy = GenerationType.AUTO) // dostaje to z bazy(autogenerowane przez baze)
    @Column(name = "id") //kolumna o nazwie id
    private Long id;
    @Column(name = "name") //jw
    private String name;
    @Column(name = "surname")
    private String surname;

    public StudentEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
