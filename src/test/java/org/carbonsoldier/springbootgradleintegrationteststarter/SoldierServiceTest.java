package org.carbonsoldier.springbootgradleintegrationteststarter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class SoldierServiceTest {

  @Mock
  SoldierRepository soldierRepository;

  @InjectMocks
  SoldierService soldierService;

  @Test
  public void search_should_return_a_list_of_soldiers() {
    Mockito.when(soldierRepository.findAll()).thenReturn(getTestSoldiers());

    List<Soldier> soldiers = soldierService.searchSoldiers();
    Assertions.assertNotNull(soldiers);
    Assertions.assertEquals(3, soldiers.size());
  }

  private List<Soldier> getTestSoldiers() {
    return List.of(new Soldier(), new Soldier(), new Soldier());
  }

  @Test
  public void testInstant() {
    System.out.println(Instant.now());
  }

}
