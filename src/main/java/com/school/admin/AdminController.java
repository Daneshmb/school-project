package com.school.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class AdminController {

	@Autowired
	AdminServiceImpl adminServiceImpl;
	
	
	@PostMapping("/createAdmin")
	public AdminEntity createNewAdmin(@RequestBody AdminEntity admin) {
		return adminServiceImpl.createNewAdmin(admin);
	}
	
	@GetMapping("/getAminById/{id}")
	public String getAminById(@PathVariable String id) {
		return adminServiceImpl.getAminById(id);
		
	}
	
	@PutMapping("/updateAdminDetails")
	public AdminEntity updateAdminDetails(@RequestBody AdminEntity admin) {
		return adminServiceImpl.updateAdminDetails(admin);
	}
	
	@DeleteMapping("/deleteAdminDetail/{id}")
	public String deleteAdminDetails(@PathVariable String id) {
		return adminServiceImpl.deleteAdminDetail(id);
	}
}
