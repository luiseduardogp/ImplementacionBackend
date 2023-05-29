package edu.unimagdalena.pw.myapi.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import edu.unimagdalena.pw.myapi.entidades.Gender;
import edu.unimagdalena.pw.myapi.entidades.Student;

public interface StudentService {
    Student create(Student student);
    Optional<Student> update(Long id, Student newStudent);
    List<Student> findAll();
    Optional<Student> find(Long id);
    void delete(Long id);
    List<Student> findByFirstNameStartingWith(String firstName);
    Optional<Student> findByCodigo(String codigo);
    List<Student> findByBirthDateAndGender(LocalDate birthDate, Gender gender);
}
