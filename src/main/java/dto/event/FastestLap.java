package dto.event;

import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class FastestLap extends Event {
  int vehicleId;
  double lapTime;
}
