package ma.geo.local.controllers;

import ma.geo.local.dto.StudentDto;
import ma.geo.local.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    public static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Select All Student
    @GetMapping("/allStudent")
    public List<StudentDto> selectAllStudent(){
        LOGGER.debug("Start methode selectAllStudent");
        return studentService.selectAllStudent();
    }

    //Select student by ID
    @GetMapping("/findStudentById/{id}")
    public StudentDto selectStudentById (@PathVariable("id") long id){
        LOGGER.debug("Start methode selectStudentById {}",id);
        return studentService.findStudentByID(id);
    }
}
