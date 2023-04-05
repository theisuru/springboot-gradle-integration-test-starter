package org.carbonsoldier.springbootgradleintegrationteststarter;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SoldierRepository extends MongoRepository<Soldier, String> {

}
