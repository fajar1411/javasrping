package com.example.tugasspring.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_m_employee")
public class Employee {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement 
   //@id dan @generatevalue anotasi buat id 

   @Column(name = "id")
   private Integer Id;

   @Column(name = "nama")
   private String NamaEmployee;

   
   @Column(name = "Handphone")
   private String nomorHape;


public Integer getId() {
    return Id;
}


public void setId(Integer id) {
    Id = id;
}


public String getNamaEmployee() {
    return NamaEmployee;
}


public void setNamaEmployee(String namaEmployee) {
    NamaEmployee = namaEmployee;
}


public String getNomorHape() {
    return nomorHape;
}


public void setNomorHape(String nomorHape) {
    this.nomorHape = nomorHape;
}
}
