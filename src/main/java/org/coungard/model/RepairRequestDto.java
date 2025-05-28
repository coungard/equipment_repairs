package org.coungard.model;

import java.time.LocalDateTime;
import lombok.Data;
import org.coungard.entity.User;

@Data
public class RepairRequestDto {

  private long id;

  private String title;
  private String description;
  private String status;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private User createdBy;
  private User assignedTo;
}
