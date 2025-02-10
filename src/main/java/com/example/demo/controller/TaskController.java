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

import com.example.demo.entities.Task;
import com.example.demo.entities.User;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.UserRepository;


@RestController
@RequestMapping("Task")
public class TaskController {

	
	@Autowired
	private TaskRepository taskrep;
	@Autowired
	private UserRepository userrep;
	
	@PostMapping("ajouter")
	public String ajouter(@RequestBody Task T ) {
		
          this.taskrep.save(T);		
		return ("ajouter avec succée");
		
		
	}
	
	@PutMapping("modifier/{Id}")
	public String modifier(Long id, String description ,User user ) {
	
    Task T = this.taskrep.findById(id).get();
    
    T.setDescription(description);
    T.setUser(user);
   
	 this.taskrep.saveAndFlush(T);
	return ("modifier avec succée")	;
	}
	
	@DeleteMapping("supprimer")
	public String supprimer(Long id) {
		
       Task ta=   this.taskrep.findById(id).get();
       this.taskrep.delete(ta);
		return ("supprimer avec succée");	
		
	}
	@GetMapping("afficher")
	public List<Task> afficher () {
		
      return this.taskrep.findAll();
		
		
	}	
	
	@GetMapping("afficherID/{id}")
	public Task afficherbyId (Long id ) {  
		
      return this.taskrep.findById(id).get();
		
		
	}
	@PostMapping("creer")
	public String creertache (@RequestBody Task tache , String email) {  
		
       User	u = this.userrep.findByemail(email);
       if (u==null)
       {
    	   
    	   return ("user n'existe pas ");
       }
       else {
    	   tache.setUser(u);
    	   this.taskrep.save(tache);
    	   return("task cree avec succee");
       }
		}
	@GetMapping("tachebyuser")
	public List<Task> tachebyuser(String email) {
		
	      User u =this.userrep.findByemail(email);
			
			return this.taskrep.findByuser(u);
		}
	
}
