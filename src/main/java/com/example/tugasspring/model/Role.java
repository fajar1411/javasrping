package com.example.tugasspring.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_role")
public class Role {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement 
   //@id dan @generatevalue anotasi buat id 

   @Column(name = "id")
   private Integer Id;

   @Column(name = "nama")
   private String NamaRole;

   @OneToMany(mappedBy = "Role")
   
    private Set<Credential>Credentials;

public Integer getId() {
    return Id;
}

public void setId(Integer id) {
    Id = id;
}

public String getNamaRole() {
    return NamaRole;
}

public void setNamaRole(String namaRole) {
    NamaRole = namaRole;
}

public Set<Credential> getCredentials() {
    return Credentials;
}

public void setCredentials(Set<Credential> credentials) {
    Credentials = credentials;
}







}
