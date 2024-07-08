package org.real.project.example.services;

import org.real.project.example.entities.AuthorEntity;
import org.real.project.example.models.Author;

import java.util.List;

public interface AuthorService {
    //Create
    Author createAuthor(Author author);

    //READ
    Author getAuthorById(Integer id);

    List<AuthorEntity> getAllAuthors();

    Author getAuthorByLastName(String lastName);

    //UPDATE
    Author updateAuthor(Integer id, Author author);

    //DELETE
    void deleteAuthorById(Integer id);

    void deleteAllAuthors();
}
