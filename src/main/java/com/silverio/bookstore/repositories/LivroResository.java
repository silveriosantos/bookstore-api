package com.silverio.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.silverio.bookstore.domain.Livro;

@Repository
public interface LivroResository extends JpaRepository <Livro, Integer>{

}
