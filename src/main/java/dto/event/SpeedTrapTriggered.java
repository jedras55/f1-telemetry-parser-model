package dto.event;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class SpeedTrapTriggered extends Event {
  int vehicleId;
  double speed;
}
