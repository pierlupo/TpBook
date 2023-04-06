package org.example;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {

    int id;
    public String name;
    public Author[] author;
    public Editor editor;
    int publishingYear;
    int amountOfPages;
    BigDecimal price;
    CoverTypeEnum cover;



    public Book(int id, String name, Author[] author, Editor editor, int publishingYear, int amountOfPages, BigDecimal price, CoverTypeEnum cover) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.editor = editor;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", editor='" + editor + '\'' +
                ", publishingYear=" + publishingYear +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                '}';
    }
}
