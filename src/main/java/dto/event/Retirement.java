package dto.event;

import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class Retirement extends Event {
  int vehicleId;
}
