package com.nothing.booking.models;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.UUID;

/**
 * Base domain object with Id, version, whenCreated and whenModified.
 */
@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel extends Model {

  @Id
  @Column(name="id", insertable = false, updatable = false, nullable = false, unique = true)
  private String id = UUID.randomUUID().toString();

}
