package com.nothing.booking.models.finder;

import com.nothing.booking.models.User;
import io.ebean.Finder;

import java.util.Optional;

public class UserFinder extends Finder<Long, User> {

  /**
   * Construct using the default Database.
   */
  public UserFinder() {
    super(User.class);
  }

  public Optional<User> byIdOptional(String id) {
    return query().setId(id).findOneOrEmpty();
  }
}
