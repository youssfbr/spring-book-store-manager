package com.github.youssfbr.bookstoremanager.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String note;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private LocalDate instant;

    public Comment() { }

    public Comment(Long id , String note , User user , LocalDate instant) {
        this.id = id;
        this.note = note;
        this.user = user;
        this.instant = instant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getInstant() {
        return instant;
    }

    public void setInstant(LocalDate instant) {
        this.instant = instant;
    }
}
