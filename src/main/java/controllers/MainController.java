package controllers;


import models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
@GetMapping(value="/students/")
    public String getStudent (Model model)
{
    Student student = new Student();
    student.setGender("M");
    student.setYearOfBirth(1990);
    return "index";
}






}
