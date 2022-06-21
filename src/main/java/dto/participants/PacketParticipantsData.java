package dto.participants;

import dto.Packet;
import enums.PacketType;
import java.util.List;
import lombok.Getter;

@Getter
public class PacketParticipantsData extends Packet {
  private final int numberOfCars;
  private final List<ParticipantData> participants;

  public PacketParticipantsData(
      long frameIdentifier,
      int packetFormat,
      int gameMajorVersion,
      int gameMinorVersion,
      int packetVersion,
      PacketType packetType,
      String sessionUID,
      double sessionTime,
      int playerCarIndex,
      int secondaryPlayerCarIndex,
      int numberOfCars,
      List<ParticipantData> participants) {
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
    this.numberOfCars = numberOfCars;
    this.participants = participants;
  }
}
