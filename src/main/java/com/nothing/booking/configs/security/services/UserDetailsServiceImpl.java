package com.nothing.booking.configs.security.services;

import io.ebean.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nothing.booking.models.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = User.find.query().where().eq("username", username).findOneOrEmpty().orElseThrow(
      () -> new UsernameNotFoundException("User Not Found with username: " + username)
    );
    return UserDetailsImpl.build(user);
  }

}
