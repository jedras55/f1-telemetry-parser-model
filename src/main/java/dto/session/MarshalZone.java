package dto.session;

import lombok.Getter;
import lombok.Value;
import enums.ZoneFlag;

@Getter
@Value
public final class MarshalZone {
  int zoneStartTrackPercent;
  ZoneFlag zoneFlag;
}
