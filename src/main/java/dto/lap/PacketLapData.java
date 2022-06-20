package dto.lap;

import dto.Packet;
import enums.PacketType;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacketLapData extends Packet {
  private List<LapData> allCarsLapData;

  public PacketLapData(
      Long frameIdentifier,
      int packetFormat,
      int gameMajorVersion,
      int gameMinorVersion,
      int packetVersion,
      PacketType packetType,
      String sessionUID,
      double sessionTime,
      int playerCarIndex,
      int secondaryPlayerCarIndex,
      List<LapData> allCarsLapData) {
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
    this.allCarsLapData = allCarsLapData;
  }
}
