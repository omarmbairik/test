package ma.geo.local.services;

import ma.geo.local.dto.StudentDto;
import ma.geo.local.mppers.StudentMapprer;
import ma.geo.local.repositories.StudentRepo;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentServiceImpl")
public class StudentServiceImpl implements StudentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
    private final StudentRepo studentRep;
    private final StudentMapprer studentMapprer = Mappers.getMapper(StudentMapprer.class)
             ;

    public StudentServiceImpl(@Qualifier("StudentRepo") StudentRepo studentRep) {
        this.studentRep = studentRep;

    }

    @Override
    public List<StudentDto> selectAllStudent() {
        LOGGER.debug("Start methode selectAllStudent");
        return studentMapprer.listEntityToDto(studentRep.findAll());
    }

    @Override
    public StudentDto findStudentByID(long id) {
        LOGGER.debug("Start methode findStudentByID {}",id);
        return studentMapprer.studentEntityToDto(studentRep.findById(id));
    }
}
