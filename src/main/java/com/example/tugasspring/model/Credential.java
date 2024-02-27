package com.example.tugasspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_credential")
public class Credential {
      @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement 
   //@id dan @generatevalue anotasi buat id 

     
    @Column(name = "id")
    private Integer Id;

    @Column(name = "email")
    private String Email;

    @Column(name = "password")
    private String Password;

    
    @Column(name = "id_role")
    @JoinColumn(name = "id_role" , nullable = false)
    private Role Role;


    public Integer getId() {
        return Id;
    }


    public void setId(Integer id) {
        Id = id;
    }


    public String getEmail() {
        return Email;
    }


    public void setEmail(String email) {
        Email = email;
    }


    public String getPassword() {
        return Password;
    }


    public void setPassword(String password) {
        Password = password;
    }


    public Role getRole() {
        return Role;
    }


    public void setRole(Role role) {
        Role = role;
    }


  

    
}
