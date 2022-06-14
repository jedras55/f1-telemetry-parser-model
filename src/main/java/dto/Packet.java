package dto;

import enums.PacketType;
import java.math.BigInteger;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Packet {
  private final String id;
  private final Long frameIdentifier;
  private final int packetFormat;
  private final int gameMajorVersion;
  private final int gameMinorVersion;
  private final int packetVersion;
  private final PacketType packetType;
  private final BigInteger sessionUID;
  private final double sessionTime;
  private final int playerCarIndex;
  private final int secondaryPlayerCarIndex;
}
