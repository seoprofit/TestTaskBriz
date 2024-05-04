package controllers;


import models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
@GetMapping(value="/student/{studentId}")
    public Student getStudent (@PathVariable Integer studentId)
{
    Student student = new Student();
    student.setGender("M");
    student.setYearOfBirth(studentId);
    return student;
}


}
