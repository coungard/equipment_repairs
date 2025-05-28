package org.coungard.model;

import java.time.LocalDateTime;
import lombok.Data;
import org.coungard.entity.RepairRequest;
import org.coungard.entity.User;

@Data
public class CommentDto {

  private long id;

  private String text;
  private User author;
  private LocalDateTime createdAt;
  private RepairRequest repairRequest;
}