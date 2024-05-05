package models;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
public class Class {

    private int yearOfStudy;
    private String mnemonic;
    private Teacher classroomTeacher;
    private List<Student> listOfStudents;

}
