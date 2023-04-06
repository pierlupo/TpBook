package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookService {

    //Book[] books = new Book[]
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        if (author == null || books == null) {
            return new Book[0];
        }
        int matchBooksAmount = 0;
        for (Book book : books) {
            for (Author authors : book.getAuthor()) {
                if (authors.equals(author)) {
                    matchBooksAmount++;
                }
            }
        }
        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            for (Author authors : book.getAuthor()) {
                if (authors.equals(author)) {
                    filteredBooks[index++] = book;
                }
            }
        }
        return filteredBooks;
    }

    public Book[] filterBooksByEditor(Editor editor, Book[] books) {
            if (editor == null || books == null) {
                return new Book[0];
            }
                int matchBooksAmount = 0;
                for (Book book : books) {
                        if (book.getEditor().equals(editor)) {
                            matchBooksAmount++;

                    }
                }
                Book[] filteredBooks = new Book[matchBooksAmount];
                int index = 0;
                for (Book book : books) {

                        if (book.getEditor().equals(editor)){
                            filteredBooks[index++] = book;
                        }
                    }

                return filteredBooks;
            }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        if (books == null) {
            return new Book[0];
        }
        int matchBooksAmount = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                matchBooksAmount++;
            }
        }

        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                filteredBooks[index++] = book;
            }
        }

        return filteredBooks;
    }
  }
