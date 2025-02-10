package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {

	Projet findByNom(String nom);

	List<Projet> findByStatus(String string);
}