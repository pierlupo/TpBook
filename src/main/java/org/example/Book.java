package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {

    private int id;
    public String name;
    private Author[] author;
    private Editor editor;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CoverTypeEnum getCover() {
        return cover;
    }

    public void setCover(CoverTypeEnum cover) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null || getClass() != o.getClass())) return false;
        Book book = (Book) o;
        return id == book.id && publishingYear == book.publishingYear && amountOfPages == book.amountOfPages && Objects.equals(name, book.name) && Arrays.equals(author, book.author) && Objects.equals(editor, book.editor) && Objects.equals(price, book.price) && cover == book.cover;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, editor, publishingYear, amountOfPages, price, cover);
        result = 31 * result + Arrays.hashCode(author);
        return result;
    }
}
