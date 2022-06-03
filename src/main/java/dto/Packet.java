package dto;

import enums.PacketType;
import java.math.BigInteger;
import lombok.Getter;

@Getter
public class Packet {
  Long frameIdentifier;
  int packetFormat;
  int gameMajorVersion;
  int gameMinorVersion;
  int packetVersion;
  PacketType packetType;
  BigInteger sessionUID;
  double sessionTime;
  int playerCarIndex;
  int secondaryPlayerCarIndex;
}
