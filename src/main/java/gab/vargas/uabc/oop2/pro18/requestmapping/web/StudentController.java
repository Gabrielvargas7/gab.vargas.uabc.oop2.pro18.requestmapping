/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro18.requestmapping.web;

import gab.vargas.uabc.oop2.pro18.requestmapping.domain.Student;
import gab.vargas.uabc.oop2.pro18.requestmapping.repository.StudentDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author gvargas
 */
@Controller
@RequestMapping("/student/*")
public class StudentController {
    
    private StudentDao  studentDao;

    @Autowired
    public StudentController(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @RequestMapping("find/{studentId}")
    public String findStudent(
              @PathVariable("studentId") int studentId, 
              Model model){
        
        model.addAttribute("studentList",studentDao.findStudent(studentId));
        return "student";
    }

    
    
    @RequestMapping(value = {"show","display"}, method = RequestMethod.GET)
    public String showStudent(Model model){
        
        model.addAttribute("studentList",studentDao.getStudentList());
        return "student";
    }
    
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    // Submission will come with courtName field, also add Model to return results 
    public String deleteStudent(@RequestParam("studentId") int studentId, Model model) {
         
        model.addAttribute("studentList",studentDao.removeStudent(studentId));
        return "student";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    // Submission will come with courtName field, also add Model to return results 
    public String addStudent(
            
            @RequestParam("studentId") int studentId, 
            @RequestParam("firstName")   String firstName, 
            @RequestParam("lastName")    String lastName, 
            @RequestParam("phoneHome")   String phoneHome, 
            @RequestParam("phoneMobile") String phoneMobile, 
            Model model) {
        
        Student student = new Student();
        
        student.setStudentId(studentId);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setPhoneHome(phoneHome);
        student.setPhoneMobile(phoneMobile);
        
        model.addAttribute("studentList",studentDao.addStudent(student));
        return "student";
    }
    
    
    
}
