package models;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Teacher {
    private String name;
    private String surname;
    private String subname;
    private int yearOfBirth;
    private String gender;
    private String mainSubject;
}
