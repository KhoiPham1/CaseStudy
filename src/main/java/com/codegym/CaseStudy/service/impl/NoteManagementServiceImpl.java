package com.codegym.CaseStudy.service.impl;

import com.codegym.CaseStudy.model.Note;
import com.codegym.CaseStudy.repository.NoteRepository;
import com.codegym.CaseStudy.service.NoteManagementService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NoteManagementServiceImpl implements NoteManagementService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<Note> findAll() {
        return (List<Note>) noteRepository.findAll();
    }

    @Override
    public Note searchNotes(Long keyword) {
        return noteRepository.findById(keyword).get() ;
    }

    @Override
    public void addNote(Note note) {
        noteRepository.save(note);
    }

    @Override
    public void removeNote(Long typeId) {
        noteRepository.deleteById(typeId);
    }
}
