package org.carbonsoldier.springbootgradleintegrationteststarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SoldierController {
  private final SoldierService soldierService;

  public SoldierController(SoldierService soldierService) {
    this.soldierService = soldierService;
  }

  @GetMapping("soldiers")
  public List<Soldier> getSoldiers() {
    return soldierService.searchSoldiers();
  }
}
