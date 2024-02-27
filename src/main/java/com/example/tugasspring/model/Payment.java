package com.example.tugasspring.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tr_payment")
public class Payment {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement 
   //@id dan @generatevalue anotasi buat id 

   @Column(name = "id")
   private Integer Id;

   @Column(name = "id_overtime")
   @JoinColumn(name = "id_overtime" , nullable = false)
   private Overtime Overtimes;

   @Column(name = "amount")
   private Integer TotalBayar;

   
   @Column(name = "id_employee")
   private Integer IdEmployee;

   @Column(name = "total_time")
   private Time TotalLembur;

public Integer getId() {
    return Id;
}

public void setId(Integer id) {
    Id = id;
}


public Integer getTotalBayar() {
    return TotalBayar;
}

public void setTotalBayar(Integer totalBayar) {
    TotalBayar = totalBayar;
}

public Integer getIdEmployee() {
    return IdEmployee;
}

public void setIdEmployee(Integer idEmployee) {
    IdEmployee = idEmployee;
}

public Time getTotalLembur() {
    return TotalLembur;
}

public void setTotalLembur(Time totalLembur) {
    TotalLembur = totalLembur;
}

public Overtime getOvertimes() {
    return Overtimes;
}

public void setOvertimes(Overtime overtimes) {
    Overtimes = overtimes;
}
}
