package org.example;

import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;

public class Demo {

    public static void main() {
        Book[] books = new Book[]

        {
            new Book(1, "Book_1", new Author[]{new Author(1, "Jon", "Johnson")}, new Editor(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverTypeEnum.PAPERBACK),
                    new Book(2, "Book_2", new Author[]{new Author(1, "Jon", "Johnson")}, new Editor(2, "Publisher_2 "), 2000, 120, BigDecimal.valueOf(14.99), CoverTypeEnum.PAPERBACK),
                    new Book(3, "Book_3", new Author[]{new Author(4, "Craig", "Gregory")}, new Editor(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverTypeEnum.HARDCOUVERTURE),
                    new Book(4, "Book_4", new Author[]{new Author(4, "Craig", "Gregory")}, new Editor(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverTypeEnum.PAPERBACK)
        };

        BookService service = new BookService();

        Author author = new Author(1, "Jon", "Johnson");
        Editor editor = new Editor(3,"Publisher_3");
        int year = 1992;

        Book[] filterBooksByAuthor = service.filterBooksByAuthor(author, books);
        Book[] filterBooksByEditor = service.filterBooksByEditor(editor, books);
        Book[] filterBooksByYear = service.filterBooksAfterSpecifiedYear(year, books);

        System.out.println("Les livres rédigés par " + author);
        for (Book b : filterBooksByAuthor) {
            System.out.println(b);
        }

        System.out.println();

        System.out.println("Voici les livres publiés par " + editor);
        for (Book b : filterBooksByEditor) {
            System.out.println(b);
        }

        System.out.println();

        System.out.println("Voici les livres publiés en ou après " + year);
        for (Book b : filterBooksByYear) {
            System.out.println(b);
        }
//        List<Object> Book = new ArrayList<>();
//          Book.add(new Book(1, "Book_1", new Author[]{new Author(1, "Jon", "Johnson")},new Editor(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverTypeEnum.PAPERBACK));
//          Book.add(new Book(2, "Book_2", new Author[]{new Author(1, "Jon", "Johnson")},new Editor(2, "Publisher_2 "), 2000, 120, BigDecimal.valueOf(14.99), CoverTypeEnum.PAPERBACK));
//          Book.add(new Book(3, "Book_3", new Author[]{new Author(4, "Craig", "Gregory")},new Editor(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverTypeEnum.HARDCOUVERTURE));
//          Book.add(new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, new Editor(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverTypeEnum.PAPERBACK));
//
//        List<Object> filters = new ArrayList<>();
//          filters.add(new Book(1, "Book_1", new Author[]{new Author(1, "Jon", "Johnson")},new Editor(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverTypeEnum.PAPERBACK));
//          filters.add(new Book(2, "Book_2", new Author[]{new Author(1, "Jon", "Johnson")},new Editor(2, "Publisher_2 "), 2000, 120, BigDecimal.valueOf(14.99), CoverTypeEnum.PAPERBACK));
//          filters.add(new Book(3, "Book_3", new Author[]{new Author(4, "Craig", "Gregory")},new Editor(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverTypeEnum.HARDCOUVERTURE));
//          System.out.println("Original List " + Book);
//          Book.removeAll(filters);
//          System.out.println("Filtered List " + Book);

    }
}

