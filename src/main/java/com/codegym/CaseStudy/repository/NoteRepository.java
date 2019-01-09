package com.codegym.CaseStudy.repository;

import com.codegym.CaseStudy.model.Note;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NoteRepository extends PagingAndSortingRepository<Note,Long> {
}
