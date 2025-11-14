package com.school.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements AdminServiceImpl {

	@Autowired
	AdminRepository adminRepository;
	
	
	@Override
	public AdminEntity createNewAdmin(AdminEntity admin) {
		if(admin.getFirstName() ==null && admin.getRole()==null) {
			System.out.println("FirstName or Role may be null ");
		}
		return adminRepository.save(admin);
	}

	@Override
	public String getAminById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminEntity updateAdminDetails(AdminEntity admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAdminDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
