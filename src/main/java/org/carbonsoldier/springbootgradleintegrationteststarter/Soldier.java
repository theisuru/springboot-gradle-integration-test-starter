package org.carbonsoldier.springbootgradleintegrationteststarter;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Soldier {
  private String id;
  private String name;
  private String soldierClass;
}
