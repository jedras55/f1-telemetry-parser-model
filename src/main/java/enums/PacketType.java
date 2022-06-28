package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PacketType {
  MOTION("Motion"),
  SESSION("Session"),
  LAP("Lap"),
  EVENT("Event"),
  PARTICIPANTS("Participants"),
  CAR_SETUPS("Car setups"),
  CAR_TELEMETRY("Car telemetry"),
  CAR_STATUS("Car status"),
  FINAL_CLASSIFICATION("Final classification"),
  LOBBY_INFO("Lobby info"),
  CAR_DAMAGE("Car damage"),
  SESSION_HISTORY("Session history"),
  UNKNOWN("Unknown");

  @Getter private final String description;
}
