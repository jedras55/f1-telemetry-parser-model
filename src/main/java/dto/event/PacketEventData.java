package dto.event;

import dto.Packet;
import enums.PacketType;
import java.math.BigInteger;
import lombok.Getter;

@Getter
public class PacketEventData extends Packet {
  private final String eventStringCode;
  private final EventType eventType;
  private final Event event;

  public PacketEventData(String id, String eventStringCode, EventType eventType, Event event) {
    super(id, 0L, 0, 0, 0, 0, PacketType.EVENT, BigInteger.ONE, 0, 0, 0);
    this.eventStringCode = eventStringCode;
    this.eventType = eventType;
    this.event = event;
  }
}
