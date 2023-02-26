package com.driver;

import java.util.*;

public class StudentService {

    StudentRepository repository = new StudentRepository();
    public void addStudent(Student student)
    {
        repository.addStudent(student);
    }
    public void addTeacher(Teacher teacher)
    {
        repository.addTeacher(teacher);
    }
    public void addStudentTeacherPair(String student,String teacher)
    {
        repository.addStudentTeacherPair(student,teacher);
    }

    public Student getStudentByName(String name)
    {
        return repository.getStudentByName(name);
    }
    public Teacher getTeacherByName(String teacher)
    {
        return repository.getTeacherByName(teacher);
    }

    public List<String> getStudentsByTeacherName(String name)
    {
        return repository.getStudentsByTeacherName(name);
    }
    public List<String> getAllStudents()
    {
        return repository.getAllStudents();
    }

    public void deleteTeacherByName(String name)
    {
        repository.deleteTeacherByName(name);
    }

    public void deleteAllTeachers()
    {
        repository.deleteAllTeachers();
    }
}
