package dto.event;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class RaceWinner extends Event {
  int vehicleId;
}
