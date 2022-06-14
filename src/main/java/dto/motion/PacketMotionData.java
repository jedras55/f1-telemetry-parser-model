package dto.motion;

import dto.Packet;
import enums.PacketType;
import java.util.List;
import lombok.Getter;

@Getter
public class PacketMotionData extends Packet {
  private final List<CarMotionData> carMotionDataList;
  ExtraCarMotionData extraCarMotionData;

  public PacketMotionData(
      String id,
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
      List<CarMotionData> carMotionDataList,
      ExtraCarMotionData extraCarMotionData) {
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
    this.carMotionDataList = carMotionDataList;
    this.extraCarMotionData = extraCarMotionData;
  }
}
