package com.codegym.CaseStudy.service;

import com.codegym.CaseStudy.model.Note;
//import sun.jvm.hotspot.debugger.Page;

import java.awt.print.Pageable;

public interface NoteManagementService {


    Note searchNotes(Long keyword);

    void addNote(Note note);

    void removeNote(Long typeId);
}
