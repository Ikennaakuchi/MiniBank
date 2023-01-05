package com.projects.MiniBank.repositories;

import com.projects.MiniBank.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
