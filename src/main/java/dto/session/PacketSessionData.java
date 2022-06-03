package dto.session;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Value;
import dto.Packet;
import enums.Era;
import enums.SafetyCar;
import enums.SessionType;
import enums.Track;
import enums.Weather;

@Getter
@Value
public class PacketSessionData extends Packet {
  Weather weather;
  int trackTemperature;
  int airTemperature;
  int totalLaps;
  int trackLength;
  SessionType sessionType;
  Track track;
  Era era;
  int sessionTimeLeft;
  int sessionDuration;
  int pitSpeedLimit;
  boolean gamePaused;
  boolean spectating;
  int spectatorCarIndex;
  boolean sliProNativeSupport;
  int numberOfMarshalZones;
  List<MarshalZone> marshalZones = new ArrayList<>();
  SafetyCar safetyCarStatus;
  boolean onlineGame;
  int numberOWeatherForecasts;
  List<WeatherForecastSample> weatherForecastSamples = new ArrayList<>();
}
