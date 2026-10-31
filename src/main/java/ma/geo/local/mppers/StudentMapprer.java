package ma.geo.local.mppers;

import ma.geo.local.dto.StudentDto;
import ma.geo.local.entities.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface StudentMapprer {
    StudentDto studentEntityToDto(StudentEntity entity);
    List<StudentDto> listEntityToDto(List<StudentEntity> entityList);
    StudentEntity studentDtoToEntity(StudentDto dto);
    List<StudentEntity> listStudentDtoToEntity(List<StudentDto> listDto);

}
