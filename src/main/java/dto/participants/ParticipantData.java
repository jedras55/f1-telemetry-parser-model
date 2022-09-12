package dto.participants;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class ParticipantData {
  boolean aiControlled;
  int driverId;
  int teamId;
  int raceNumber;
  String nationality;
  String name;
}
