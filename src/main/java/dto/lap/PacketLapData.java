package dto.lap;

import dto.Packet;
import enums.PacketType;
import java.math.BigInteger;
import java.util.List;
import lombok.Getter;

@Getter
public class PacketLapData extends Packet {
  public final List<LapData> allCarsLapData;

  public PacketLapData(
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
      List<LapData> allCarsLapData) {
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
    this.allCarsLapData = allCarsLapData;
  }
}
