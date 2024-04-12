package com.github.youssfbr.bookstoremanager.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private LocalDate publicationDate;
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST , CascadeType.MERGE , CascadeType.REMOVE })
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
    private String summary;
    private String pages;
    private String chapters;
    private String isbn;
    @Column(name = "publisher_name" , nullable = false)
    private String publisherName;
    @OneToMany
    private final List<Comment> comments = new ArrayList<>();
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST , CascadeType.MERGE , CascadeType.REMOVE })
    @JoinColumn(name = "author_id")
    private Author author;


    public Book() { }

    public Book(Long id , String name , LocalDate publicationDate , Publisher publisher , String summary , String pages , String chapters , String isbn , String publisherName , Author author) {
        this.id = id;
        this.name = name;
        this.publicationDate = publicationDate;
        this.publisher = publisher;
        this.summary = summary;
        this.pages = pages;
        this.chapters = chapters;
        this.isbn = isbn;
        this.publisherName = publisherName;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Publisher getPublisher() { return publisher; }

    public void setPublisher(Publisher publisher) { this.publisher = publisher; }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
