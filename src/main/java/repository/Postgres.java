package repository;

import models.Student;

import java.util.List;

public interface Postgres {
    List<Student> get ();
    void delete (int id);
    Student copy (int id);


}
