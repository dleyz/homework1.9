package com.company;

public class Main {



    public static void main(String[] args) {
        Author author1 = new Author("Ekaterina", "Andreeva");
        Book book1 = new Book("Kolobok", author1,1950);
        book1.setPublicationAge(1972);
        Author author2 = new Author("Napoleon", "Hill");
        Book book2 = new Book("Think and grow rich", author2, 2000);

    }
}
