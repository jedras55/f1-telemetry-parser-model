package dto.motion;

import java.util.List;
import lombok.Getter;
import lombok.Value;
import dto.Packet;

@Getter
@Value
public class PacketMotionData extends Packet {
  List<CarMotionData> carMotionDataList;
  ExtraCarMotionData extraCarMotionData;
}
