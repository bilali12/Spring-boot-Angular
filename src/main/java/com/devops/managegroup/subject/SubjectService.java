package com.devops.managegroup.subject;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class SubjectService {
    private final SubjectRepository subjectRepository;
    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }


    public Subject addSubject(Subject subject) {

        return subjectRepository.save(subject);
    }

    public List<Subject> findAllSubjects() {
        return subjectRepository.findAll();
    }

    public void deleteSubject(Long id){
        subjectRepository.deleteSubjectById(id);
    }
}
