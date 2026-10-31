package ma.geo.local.services;

import ma.geo.local.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> selectAllStudent();
    StudentDto findStudentByID(long id);
}
