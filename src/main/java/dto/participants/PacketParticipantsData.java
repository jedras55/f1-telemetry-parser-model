package dto.participants;

import dto.Packet;
import enums.PacketType;
import java.math.BigInteger;
import java.util.List;
import lombok.Getter;

@Getter
public class PacketParticipantsData extends Packet {
  private final int numberOfCars;
  private final List<ParticipantData> participants;

  public PacketParticipantsData(
      String id,
      Long frameIdentifier,
      int packetFormat,
      int gameMajorVersion,
      int gameMinorVersion,
      int packetVersion,
      PacketType packetType,
      BigInteger sessionUID,
      double sessionTime,
      int playerCarIndex,
      int secondaryPlayerCarIndex,
      int numberOfCars,
      List<ParticipantData> participants) {
    super(
        id,
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
