package org.carbonsoldier.springbootgradleintegrationteststarter;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldierService {
  private final SoldierRepository soldierRepository;

  public SoldierService(SoldierRepository soldierRepository) {
    this.soldierRepository = soldierRepository;
  }

  public List<Soldier> searchSoldiers() {
    return soldierRepository.findAll();
  }
}
