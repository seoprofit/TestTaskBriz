package models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String surname;
    private String subname;
    private int yearOfBirth;
    private String gender;

}
