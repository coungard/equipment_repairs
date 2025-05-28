package org.coungard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;
import lombok.Data;

@Entity(name = "comments")
@Data
public class Comment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String text;
  @OneToOne
  private User author;
  @Column(name = "created_at")
  private LocalDateTime createdAt;
  @OneToOne
  private RepairRequest repairRequest;
}
