package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;


@RestController
@RequestMapping("User")
public class UserController  {

	
	@Autowired
	private UserRepository userrep;
	@Autowired
	private RoleRepository rolerep;
	
	@PostMapping("ajouter")
	public String ajouter(@RequestBody User u) {
          this.userrep.save(u);		
		return ("ajouter avec succée");
		
		
	}
	
	@PostMapping("ajouteravectest")
	public String ajoutertest(@RequestBody User user) {
		User u =this.userrep.findByemail(user.getEmail());
		
		if (u==null) {
		
          this.userrep.save(user);		
		return ("ajouter avec succée");
		}
		
		else {
			
			return ("email exsite");

			}
		
	}
	
	@PutMapping("modifier/{id}")
	public String modifier(Long id ,String nom , String prenom , String email, Role role) {
	
    User u = this.userrep.findById(id).get();
    
    u.setNom(nom);
    u.setPrenom(prenom);
    u.setRole(role);
    u.setEmail(email);
    
   
	 this.userrep.saveAndFlush(u);
	return ("modifier avec succée")	;
	}
	
	@DeleteMapping("supprimer")
	public String supprimer(Long id) {
		
       User user=   this.userrep.findById(id).get();
       this.userrep.delete(user);
		return ("supprimer avec succée");	
		
	}
	//@PreAuthorize("hasAuthority('admin')")
	@PreAuthorize("hasAnyAuthority('admin','Formateur')")
    @GetMapping("afficher")
	public List<User> afficher () {
		
      return this.userrep.findAll();
		
		
	}	
	
	@GetMapping("afficherID/{id}")
	public User afficherbyId (Long id ) {  
		
      return this.userrep.findById(id).get();
		
		
	}
	
	@Autowired
	private PasswordEncoder encoder;
	
    @PostMapping("ajouteravecrole")
    
    public String ajouterbyrole(@RequestBody User u , String profil) {
    	
    	Role r = this.rolerep.findByProfil(profil);
    	//cryptage pass
    	String pass =encoder.encode(u.getMotpass());
    	u.setMotpass(pass);
    	u.setRole(r);
    	this.userrep.save(u);
    	
    	return "ajouter avec succe";
    	
    }
@PreAuthorize("hasAnyAuthority('admin','Formateur')")
@GetMapping("afficheravecrole")
public List<User> afficheravecrole(String profil){
	Role r =this.rolerep.findByProfil(profil);
	return this.userrep.findByRole(r);
}
@PutMapping("archiver/{id}")
public String archiver( Long id) {
    User user = this.userrep.findById(id).get();
    if (user == null) {
        return "user n'est existe pas";
    }
    user.setStatus("archived");
    this.userrep.saveAndFlush(user);
    return "User archivé avec succès.";
}

@PutMapping("desarchiver/{id}")
public String desarchiver( Long id) {
    User user = this.userrep.findById(id).orElse(null);
    if (user == null) {
        return "user n'est existe pas";
    }
    user.setStatus("active");
    this.userrep.saveAndFlush(user);
    return "user désarchivé avec succès.";
}

@GetMapping("afficherarchiver")
public List<User> afficherArchiver() {
    return this.userrep.findByStatus("archived");
}

    
}
