package com.school.admin;

import java.time.LocalDateTime;

import com.school.superpackage.Auditable;
import com.school.superpackage.IdGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name="admintable")
public class AdminEntity  extends Auditable{
	@Id
	@Column(name ="admin_id")
    private String id;

	@Column(name ="first_name")
    private String firstName;
    
	@Column(name ="last_name")
    private String lastName;
    
	@Column(name ="mobile_number")
    private String mobileNumber;
    
	@Column(name ="email")
    private String email;
	
	@Column(name ="created_by")
	private String createdBy;

	@Column(name ="created_at")
    private LocalDateTime createdAt;

	@Column(name ="update_by")
    private String updatedBy;
    
	@Column(name ="role")
    private String role;

	@Column(name ="updated_at")
    private LocalDateTime updatedAt;
    

    @PrePersist
    public void generateId() {
        if (this.id == null) {
            this.id = IdGenerator.generateId("ADM_");
        }
    }


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
    
    
}
