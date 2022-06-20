package dto;

import enums.PacketType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Packet {
  private Long frameIdentifier;
  private int packetFormat;
  private int gameMajorVersion;
  private int gameMinorVersion;
  private int packetVersion;
  private PacketType packetType;
  private String sessionUID;
  private double sessionTime;
  private int playerCarIndex;
  private int secondaryPlayerCarIndex;
}
