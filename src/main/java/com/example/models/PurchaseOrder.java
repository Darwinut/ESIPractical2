package com.example.models;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class PurchaseOrder {
  @Id @GeneratedValue
  Long id;

//  List<PlantReservation> reservations;
  @OneToMany
  PlantInventoryEntry plant;

  LocalDate issueDate;
  LocalDate paymentSchedule;
  @Column(precision=8,scale=2)
  BigDecimal total;

  @Enumerated(EnumType.STRING)
  POStatus status;
  @Embedded
  BusinessPeriod rentalPeriod;
}
