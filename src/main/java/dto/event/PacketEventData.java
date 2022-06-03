package dto.event;

import dto.Packet;
import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class PacketEventData extends Packet {
  String eventStringCode;
  EventType eventType;
  Event event;
}
