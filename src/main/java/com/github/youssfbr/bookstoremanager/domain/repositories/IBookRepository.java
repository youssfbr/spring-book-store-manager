package com.github.youssfbr.bookstoremanager.domain.repositories;

import com.github.youssfbr.bookstoremanager.domain.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book , Long> {
}
