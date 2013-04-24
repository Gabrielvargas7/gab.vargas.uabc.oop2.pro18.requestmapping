/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro18.requestmapping.repository;

import gab.vargas.uabc.oop2.pro18.requestmapping.domain.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author gvargas
 */
public class StudentDaoMemory implements StudentDao{

   
    private List studentList;

    
    public StudentDaoMemory() {
        
        Student student1 = new Student();
        student1.setStudentId(1);
        student1.setFirstName("Juan");
        student1.setLastName("Perez");
        student1.setPhoneHome("510-555-5858");
        student1.setPhoneMobile("510-551-5151");
        
        
        Student student2 = new Student();
        student2.setStudentId(52);
        student2.setFirstName("Pedro");
        student2.setLastName("Lopez");
        student2.setPhoneHome("510-665-5858");
        student2.setPhoneMobile("510-858-5151");
        
        Student student3 = new Student();
        student3.setStudentId(22);
        student3.setFirstName("Jorge");
        student3.setLastName("Lu");
        student3.setPhoneHome("848-665-5258");
        student3.setPhoneMobile("848-852-5251");
        
        Student student4 = new Student();
        student4.setStudentId(100);
        student4.setFirstName("Alejandro");
        student4.setLastName("Jimenez");
        student4.setPhoneHome("554-645-5858");
        student4.setPhoneMobile("554-845-5151");
        
        
        
        this.studentList = new ArrayList<Student>();
        
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        
    }
    
    
    @Override
    public List<Student> removeStudent(int studentId) {
        
        for (Iterator it = studentList.iterator(); it.hasNext();) {
            Student student = (Student) it.next();
            if (student.getStudentId() == studentId){
                it.remove();
                break;
            } 
        }
       return this.studentList;        
    }

    
    @Override
    public List<Student> getStudentList() {
        return this.studentList;
    }

    
//     @Override
//    public List<Student> findStudent(int studentId) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

    
    @Override
    public List<Student> findStudent(int studentId) {
        
        List<Student> findStudent = new ArrayList<Student>();
        
        for (Iterator it = studentList.iterator(); it.hasNext();) {
            Student student = (Student) it.next();
            if (student.getStudentId() == studentId){
                findStudent.add(student);
                break;
            } 
        }
       return findStudent;        
        
        
    }

    
    @Override
    public List<Student> addStudent(Student student) {
        
        this.studentList.add(student);
        return this.studentList;
    }
        
    
    
}
