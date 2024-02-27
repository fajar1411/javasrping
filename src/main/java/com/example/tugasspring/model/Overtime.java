package com.example.tugasspring.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_m_overtime")
public class Overtime {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement 
   //@id dan @generatevalue anotasi buat id 

   @Column(name = "id")
   private Integer Id;

   @Column(name = "tanggal")
   private Date TanggalLembur;

   @Column(name = "amount")
   private Integer Pembayaran;

   @Column(name = "status_overtime")
   private String StatusLembur;

   @Column(name = "start_overtime")
   private Time MulaiLembur;

   @Column(name = "end_overtime")
   private Time AkhirLembur;

   @OneToMany(mappedBy = "Role")
   
    private Set<Payment>Payments;
   
   public Integer getId() {
    return Id;
}


public Date getTanggalLembur() {
    return TanggalLembur;
}


public Integer getPembayaran() {
    return Pembayaran;
}


public String getStatusLembur() {
    return StatusLembur;
}


public Time getMulaiLembur() {
    return MulaiLembur;
}


public Time getAkhirLembur() {
    return AkhirLembur;
}


public Time getLimitLembur() {
    return LimitLembur;
}


public void setId(Integer id) {
    Id = id;
}


public void setTanggalLembur(Date tanggalLembur) {
    TanggalLembur = tanggalLembur;
}


public void setPembayaran(Integer pembayaran) {
    Pembayaran = pembayaran;
}


public void setStatusLembur(String statusLembur) {
    StatusLembur = statusLembur;
}


public void setMulaiLembur(Time mulaiLembur) {
    MulaiLembur = mulaiLembur;
}


public void setAkhirLembur(Time akhirLembur) {
    AkhirLembur = akhirLembur;
}


public Set<Payment> getPayments() {
    return Payments;
}


public void setPayments(Set<Payment> payments) {
    Payments = payments;
}


public void setLimitLembur(Time limitLembur) {
    LimitLembur = limitLembur;
}


@Column(name = "time_limit")
   private Time LimitLembur;
}
