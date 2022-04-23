package com.company;

public class Book {
    private String name;
    private Author author;
    private int publicationAge;

    public Book(String name, Author author, int publicationAge) {
        this.name = name;
        this.author = author;
        this.publicationAge = publicationAge;

    }

    public String getName() {
        return this.name;
    }

    public int getPublicationAge() {
        return this.publicationAge;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublicationAge(int publicationAge) {
        this.publicationAge = publicationAge;
    }



}
