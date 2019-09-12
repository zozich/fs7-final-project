package ua.com.danit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private String firstName;
  private String lastName;
  private String email;
  @ToString.Exclude
  @EqualsAndHashCode.Exclude
  @JsonIgnore
  private String password;
}
