package com.github.youssfbr.bookstoremanager.domain.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_publishers")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String note;

    public Publisher() { }

    public Publisher(Long id , String note) {
        this.id = id;
        this.note = note;
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
}
