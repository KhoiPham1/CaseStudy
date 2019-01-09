package com.codegym.CaseStudy.controller;

import com.codegym.CaseStudy.model.Note;
import com.codegym.CaseStudy.service.NoteManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class NoteController {
    @Autowired
    private NoteManagementService noteManagementService;
    @GetMapping("/create-note")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("note",new Note());
        return modelAndView;
    }

    @PostMapping("/create-note")
    public ModelAndView createNote(@ModelAttribute("note")Note note){
        noteManagementService.addNote(note);

        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("note",new Note());
        modelAndView.addObject("message","Successfully!");
        return modelAndView;

    }
    @GetMapping("/note")
    public ModelAndView listNote(){
        List<Note> noteList = noteManagementService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("listnote",noteList);
        return modelAndView;
    }
    @GetMapping("/edit-note/{id}")
    public ModelAndView showNote(@PathVariable Long id){
        Note note = noteManagementService.searchNotes(id);
        if (note!=null){
            ModelAndView modelAndView = new ModelAndView("edit");
            modelAndView.addObject("note",note);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/edit-note")
    public ModelAndView updateNote(@ModelAttribute("note")Note note){
        noteManagementService.addNote(note);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("note",note);
        modelAndView.addObject("message","Note updated successfully");
        return modelAndView;
    }
    @GetMapping("/delete-note/{id}")
    public ModelAndView showdeleteNote(@PathVariable Long id){
        Note note = noteManagementService.searchNotes(id);
        if (note!=null){
            ModelAndView modelAndView = new ModelAndView("delete");
            modelAndView.addObject("note",note);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }
}
