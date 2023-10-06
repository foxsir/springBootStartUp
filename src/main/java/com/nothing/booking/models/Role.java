package com.nothing.booking.models;

import com.nothing.booking.models.finder.RoleFinder;
import com.nothing.booking.models.finder.UserFinder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role extends BaseModel {

  public static final RoleFinder find = new RoleFinder();

  @Enumerated(EnumType.STRING)
  @Column(length = 20, unique = true)
  private ERole name;

  public Role() {
  }

  public Role(ERole name) {
    this.name = name;
  }
}
