package com.devops.managegroup.subject;

import com.devops.managegroup.student.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Subject>> getAllSubject () {
        List<Subject> subjects = subjectService.findAllSubjects();
        return new ResponseEntity<>(subjects, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject) {
        Subject newSubject = subjectService.addSubject(subject);
        return new ResponseEntity<>(newSubject, HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSubject(@PathVariable("id") Long id) {
        subjectService.deleteSubject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
