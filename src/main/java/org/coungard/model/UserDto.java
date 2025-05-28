package org.coungard.model;

import lombok.Data;

@Data
public class UserDto {

  private long id;
  private String username;
  private String password;
  private Role role;
}
