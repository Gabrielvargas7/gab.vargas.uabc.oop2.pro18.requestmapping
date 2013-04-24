/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro18.requestmapping.repository;


import gab.vargas.uabc.oop2.pro18.requestmapping.domain.Student;
import java.util.List;

/**
 *
 * @author GabrielVargas
 */
public interface StudentDao {
     
     public List<Student> getStudentList();
     public List<Student> removeStudent(int studentId);
     public List<Student> findStudent(int studentId);
     public List<Student> addStudent(Student student);
     
}
