package com.codegym.CaseStudy.service;

import com.codegym.CaseStudy.model.Note;
//import sun.jvm.hotspot.debugger.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface NoteManagementService {
    List<Note> findAll();

    Note searchNotes(Long keyword);

    void addNote(Note note);

    void removeNote(Long typeId);
}
