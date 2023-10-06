package com.nothing.booking.models.finder;

import com.nothing.booking.models.Role;
import com.nothing.booking.models.User;
import io.ebean.Finder;

import java.util.Optional;

public class RoleFinder extends Finder<Long, Role> {

  /**
   * Construct using the default Database.
   */
  public RoleFinder() {
    super(Role.class);
  }

  public Optional<Role> byIdOptional(String id) {
    return query().setId(id).findOneOrEmpty();
  }
}
