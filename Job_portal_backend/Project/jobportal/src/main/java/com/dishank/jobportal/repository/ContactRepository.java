package com.dishank.jobportal.repository;

import com.dishank.jobportal.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findContactsByStatus(String status);

    List<Contact> findContactsByStatusOrderByCreatedAtAsc(String status);

    List<Contact> findContactsByStatus(String status, Sort sort);

    Page<Contact> findContactsByStatus(String status, Pageable pageable);

}