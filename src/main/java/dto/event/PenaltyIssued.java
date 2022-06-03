package dto.event;

import lombok.Getter;
import lombok.Value;
import enums.InfringementType;
import enums.PenaltyType;

@Value
@Getter
public class PenaltyIssued extends Event {
  PenaltyType penaltyType;
  InfringementType infringementType;
  int vehicleId;
  int otherVehicleId;
  int time;
  int lapNumber;
  int placesGained;
}
