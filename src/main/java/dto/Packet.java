package dto;

import enums.PacketType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Packet {
  private final Long frameIdentifier;
  private final int packetFormat;
  private final int gameMajorVersion;
  private final int gameMinorVersion;
  private final int packetVersion;
  private final PacketType packetType;
  private final String sessionUID;
  private final double sessionTime;
  private final int playerCarIndex;
  private final int secondaryPlayerCarIndex;
}
