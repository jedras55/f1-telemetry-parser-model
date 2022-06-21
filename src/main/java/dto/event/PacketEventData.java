package dto.event;

import dto.Packet;
import enums.PacketType;
import lombok.Getter;

@Getter
public class PacketEventData extends Packet {
  private final String eventStringCode;
  private final EventType eventType;
  private final Event event;

  public PacketEventData(
      int frameIdentifier,
      int packetFormat,
      int gameMajorVersion,
      int gameMinorVersion,
      int packetVersion,
      PacketType packetType,
      String sessionUID,
      double sessionTime,
      int playerCarIndex,
      int secondaryPlayerCarIndex,
      String eventStringCode,
      EventType eventType,
      Event event) {
    super(
        frameIdentifier,
        packetFormat,
        gameMajorVersion,
        gameMinorVersion,
        packetVersion,
        packetType,
        sessionUID,
        sessionTime,
        playerCarIndex,
        secondaryPlayerCarIndex);
    this.eventStringCode = eventStringCode;
    this.eventType = eventType;
    this.event = event;
  }
}
