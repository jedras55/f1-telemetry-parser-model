package dto.car.telemetry;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacketCarTelemetryData {

  private final List<CarTelemetryData> carTelemetryDataList;
  private final int mfdPanelIndex;
  private final int mfdPanelIndexSecondaryPlayer;
  private final int suggestedGear;

  public PacketCarTelemetryData(
      List<CarTelemetryData> carTelemetryDataList,
      int mfdPanelIndex,
      int mfdPanelIndexSecondaryPlayer,
      int suggestedGear) {
    this.carTelemetryDataList = carTelemetryDataList;
    this.mfdPanelIndex = mfdPanelIndex;
    this.mfdPanelIndexSecondaryPlayer = mfdPanelIndexSecondaryPlayer;
    this.suggestedGear = suggestedGear;
  }
}
