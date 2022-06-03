package dto.participants;

import java.util.List;
import lombok.Getter;
import lombok.Value;
import dto.Packet;

@Getter
@Value
public class PacketParticipantsData extends Packet {
  int numberOfCars;
  List<ParticipantData> participants;
}
