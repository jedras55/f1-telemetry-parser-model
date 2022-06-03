package dto.lap;

import java.util.List;
import lombok.Getter;
import lombok.Value;
import dto.Packet;

@Value
@Getter
public class PacketLapData extends Packet {
  public List<LapData> allCarsLapData;
}
