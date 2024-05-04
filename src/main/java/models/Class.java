package models;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class Class {

    private int yearOfStudy;
    private String mnemokod;
    private Teacher classroomTeacher;
    private List<Student> listOfStudents;

}
