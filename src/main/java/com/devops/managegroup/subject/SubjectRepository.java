package com.devops.managegroup.subject;

import com.devops.managegroup.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    void deleteSubjectById(Long id);

}
