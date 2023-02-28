package com.driver;

import java.util.HashMap;
import java.util.*;

public class StudentRepository {
    HashMap<String,Student> studentDB= new HashMap<>();
    HashMap<String,Teacher> teacherDB= new HashMap<>();

    HashMap<String, List<String>> teacherStudentLink = new HashMap<String, List<String>>();

    List<String> students= new ArrayList<>();
    public void addStudent(Student student)
    {
        studentDB.put(student.getName(),student);
        students.add(student.getName());
    }

    public void addTeacher(Teacher teacher)
    {

        teacherDB.put(teacher.getName(),teacher);
    }

    public void addStudentTeacherPair(String student, String teacher) {

        if (studentDB.containsKey(student) && teacherDB.containsKey(teacher)) {
            List<String> a;
            if(teacherStudentLink.containsKey(teacher)) {
              a = teacherStudentLink.get(teacher);
            } else {
                a=new ArrayList<>();
                //teacherStudentLink.put(teacher, a);
               // a = teacherStudentLink.get(teacher);
            }
            a.add(student);
            teacherStudentLink.put(teacher, a);
        }

    }
    public Student getStudentByName(String name)
    {
        return studentDB.get(name);
    }

    public Teacher getTeacherByName(String teacher)
    {

        return teacherDB.get(teacher);
    }

    public List<String> getStudentsByTeacherName(String name)
    {

        return teacherStudentLink.get(name);
    }

    public List<String> getAllStudents()
    {
        return students;
    }

    public void deleteTeacherByName(String name)
    {
        teacherDB.remove(name);
        List<String> a= new ArrayList<>();
        a=teacherStudentLink.get(name);
        teacherStudentLink.remove(name);
        for(String s: a)
        {
            studentDB.remove(s);
        }
    }
    public void deleteAllTeachers()
    {
        teacherDB.clear();
        System.out.println("delete-T "+teacherDB.size());
        teacherStudentLink.clear();

    }
}
