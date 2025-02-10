package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Projet;
import com.example.demo.repository.ProjetRepository;



@RestController
@RequestMapping("Projet")
public class ProjetController {

    @Autowired
    private ProjetRepository projetRep;

    

    @PostMapping("ajouter")
    public String ajouter(@RequestBody Projet p) {
        this.projetRep.save(p);
        return "Projet ajouté avec succès";
    }

    @PostMapping("ajouteravectest")
    public String ajouterAvecTest(@RequestBody Projet projet) {
        Projet p = this.projetRep.findByNom(projet.getNom());
        if (p == null) {
            this.projetRep.save(projet);
            return "Projet ajouté avec succès";
        } else {
            return "Nom de projet existe déjà";
        }
    }

    @PutMapping("modifier/{id}")
    public String modifier( Long id,  String nom,  String description,  String dateDebut, String dateFin) {
        Projet p = this.projetRep.findById(id).orElse(null);
        if (p == null) {
            return "Projet n'existe pas";
        }
        p.setNom(nom);
        p.setDescription(description);
        p.setDateDebut(dateDebut);
        p.setDateFin(dateFin);
        this.projetRep.saveAndFlush(p);
        return "Projet modifié avec succès";
    }

    @DeleteMapping("supprimer/{id}")
    public String supprimer( Long id) {
        Projet p = this.projetRep.findById(id).orElse(null);
        if (p == null) {
            return "Projet n'existe pas";
        }
        this.projetRep.delete(p);
        return "Projet supprimé avec succès";
    }

    @GetMapping("afficher")
    public List<Projet> afficher() {
        return this.projetRep.findAll();
    }

    @GetMapping("afficherID/{id}")
    public Projet afficherParId( Long id) {
        return this.projetRep.findById(id).orElse(null);
    }



    @PutMapping("archiver/{id}")
    public String archiver( Long id) {
        Projet p = this.projetRep.findById(id).orElse(null);
        if (p == null) {
            return "Projet n'existe pas";
        }
        p.setStatus("archived");
        this.projetRep.saveAndFlush(p);
        return "Projet archivé avec succès";
    }

    @GetMapping("afficherarchiver")
    public List<Projet> afficherArchiver() {
        return this.projetRep.findByStatus("archived");
    }
}
