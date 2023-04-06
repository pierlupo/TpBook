package org.example;

import java.math.BigDecimal;

public class Demo {

    public static void main() {
        Book[] books = new Book[]

                {new Book(1, "Book_1", new Author[]{new Author(1, "Jon", "Johnson")},new Editor(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverTypeEnum.PAPERBACK),
                 new Book(2, "Book_2", new Author[]{new Author(1, "Jon", "Johnson")},new Editor(2, "Publisher_2 "), 2000, 120, BigDecimal.valueOf(14.99), CoverTypeEnum.PAPERBACK),
                 new Book(4, "Book_4", new Author[]{new Author(4, "Craig", "Gregory")},new Editor(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverTypeEnum.HARDCOUVERTURE),
                };
    }
}

