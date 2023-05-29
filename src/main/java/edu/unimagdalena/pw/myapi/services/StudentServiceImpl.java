package edu.unimagdalena.pw.myapi.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unimagdalena.pw.myapi.entidades.Gender;
import edu.unimagdalena.pw.myapi.entidades.Student;
import edu.unimagdalena.pw.myapi.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> update(Long id, Student newStudent) {
        return studentRepository.findById(id)
                .map(existingStudent -> {
                    existingStudent.setLastName(newStudent.getLastName());
                    existingStudent.setFirstName(newStudent.getFirstName());
                    existingStudent.setCodigo(newStudent.getCodigo());
                    existingStudent.setBirthDate(newStudent.getBirthDate());
                    existingStudent.setGender(newStudent.getGender());
                    existingStudent.setCourses(newStudent.getCourses());
                    return studentRepository.save(existingStudent);
                });
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> find(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findByFirstNameStartingWith(String firstName) {
        return studentRepository.findByFirstNameStartingWith(firstName);
    }

    @Override
    public Optional<Student> findByCodigo(String codigo) {
        return studentRepository.findByCodigo(codigo);
    }

    @Override
    public List<Student> findByBirthDateAndGender(LocalDate birthDate, Gender gender) {
        return studentRepository.findByBirthDateAndGender(birthDate, gender);
    }
}
