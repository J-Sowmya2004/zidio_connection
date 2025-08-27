package com.example.service;

import com.example.dto.StudentDTO;
import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    //backend logic

    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO createOrUpdateStudent(StudentDTO dto) {
        Student student = new Student(dto.id, dto.name, dto.email, dto.phone, dto.qualification, dto.resumeURL);
        Student saved = (Student) studentRepository.save(student);
        return mapDTO(saved);
    }

    public StudentDTO getStudentByEmail(String email) {
        Student student = studentRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("student not found"));
        return mapDTO(student);
    }

    public StudentDTO getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        //Student student=studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student not found"));
        return mapDTO(student);
    }

    private StudentDTO mapDTO(Student student) {
        return new StudentDTO(
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getPhone(),
                student.getQualification(),
                student.getResumeURL());

    }
}
//    public StudentDTO createStudent(StudentDTO dto,String email){
//
//
//        Student student=new Student(null,dto.name,dto.email,dto.phone,dto.qualification,dto.resumeURL);
//        return dto;
//
//    }
//    public StudentDTO getStudentByEmail(String email){
//        Student student=StudentRepository.findByEmail(email);
//        if(student == null)return null;
//        return new StudentDTO(student.getId(),student.getName(),student.getEmail(),student.getPhone(),student.getQualification(),student.getResumeURL());
//    }

