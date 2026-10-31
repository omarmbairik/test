package ma.geo.local.repositories;

import ma.geo.local.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("StudentRepo")
public interface StudentRepo extends JpaRepository<StudentEntity,Long> {
    List<StudentEntity> findAll();
    StudentEntity findById(long id);
}
