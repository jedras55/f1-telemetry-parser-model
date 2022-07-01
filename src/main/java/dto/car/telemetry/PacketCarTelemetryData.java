package dto.car.telemetry;

import dto.Packet;
import enums.PacketType;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacketCarTelemetryData extends Packet {

  private final List<CarTelemetryData> carTelemetryDataList;
  private final int mfdPanelIndex;
  private final int mfdPanelIndexSecondaryPlayer;
  private final int suggestedGear;

  public PacketCarTelemetryData(
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
      List<CarTelemetryData> carTelemetryDataList,
      int mfdPanelIndex,
      int mfdPanelIndexSecondaryPlayer,
      int suggestedGear) {
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
    this.carTelemetryDataList = carTelemetryDataList;
    this.mfdPanelIndex = mfdPanelIndex;
    this.mfdPanelIndexSecondaryPlayer = mfdPanelIndexSecondaryPlayer;
    this.suggestedGear = suggestedGear;
  }
}
