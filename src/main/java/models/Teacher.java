package models;


import lombok.AllArgsConstructor;
import lombok.Data;

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
