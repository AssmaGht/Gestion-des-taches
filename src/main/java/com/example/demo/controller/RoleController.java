package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;

@RestController
@RequestMapping("Role")
public class RoleController {

	@Autowired
	private RoleRepository rolerep;
	
	
	
	@PostMapping("ajouter")
	public String ajouter(@RequestBody Role role) {
		
          this.rolerep.save(role);		
		return ("ajouter avec succée");
		
		
	}

	
	@PutMapping("modifier/{Id}")
	public String modifier(Long id ,String role) {
	
    Role r = this.rolerep.findById(id).get();
    
    r.setProfil(role);
    
   
	 this.rolerep.saveAndFlush(r);
	return ("modifier avec succée")	;
	}
	
	@DeleteMapping("supprimer")
	public String supprimer(Long id) {
		
       Role r=   this.rolerep.findById(id).get();
       this.rolerep.delete(r);
		return ("supprimer avec succée");	
		
	}
	@GetMapping("afficher")
	public List<Role> afficher () {
		
      return this.rolerep.findAll();
		
		
	}	
	
	@GetMapping("afficherID/{id}")
	public Role afficherbyId (Long id ) {  
		
      return this.rolerep.findById(id).get();
		
		
	}	
}
