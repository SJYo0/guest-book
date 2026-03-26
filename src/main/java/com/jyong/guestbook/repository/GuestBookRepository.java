package com.jyong.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jyong.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
