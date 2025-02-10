package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Page d'inscription
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Page de connexion
    }

    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // Page d'accueil avec les données des entités
    }
    
    @GetMapping("/projets")
    public String showProjetsPage() {
        return "projets"; // Page pour afficher les projets
    }
    
    @GetMapping("/roles")
    public String showRolesPage() {
        return "roles"; // Page pour afficher les rôles
    }
    
    @GetMapping("/tasks")
    public String showTasksPage() {
        return "tasks"; // Page pour afficher les tâches
    }
    
    @GetMapping("/users")
    public String showUsersPage() {
        return "users"; // Page pour afficher les utilisateurs
    }
}
