package dto.event;

import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class TeammateInPits extends Event {
  int vehicleId;
}
