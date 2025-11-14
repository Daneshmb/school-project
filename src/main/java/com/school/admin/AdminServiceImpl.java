package com.school.admin;


public interface AdminServiceImpl {

	public AdminEntity createNewAdmin(AdminEntity admin);

	public String getAminById(String id);

	public AdminEntity updateAdminDetails(AdminEntity admin);

	public String deleteAdminDetail(String id);

}
