package dto.session;

import dto.Packet;
import enums.Era;
import enums.PacketType;
import enums.SafetyCar;
import enums.SessionType;
import enums.Track;
import enums.Weather;
import java.util.List;
import lombok.Getter;

@Getter
public class PacketSessionData extends Packet {
  private final Weather weather;
  private final int trackTemperature;
  private final int airTemperature;
  private final int totalLaps;
  private final int trackLength;
  private final SessionType sessionType;
  private final Track track;
  private final Era era;
  private final int sessionTimeLeft;
  private final int sessionDuration;
  private final int pitSpeedLimit;
  private final boolean gamePaused;
  private final boolean spectating;
  private final int spectatorCarIndex;
  private final boolean sliProNativeSupport;
  private final int numberOfMarshalZones;
  private final List<MarshalZone> marshalZones;
  private final SafetyCar safetyCarStatus;
  private final boolean onlineGame;
  private final int numberOWeatherForecasts;
  private final List<WeatherForecastSample> weatherForecastSamples;

  public PacketSessionData(

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
      Weather weather,
      int trackTemperature,
      int airTemperature,
      int totalLaps,
      int trackLength,
      SessionType sessionType,
      Track track,
      Era era,
      int sessionTimeLeft,
      int sessionDuration,
      int pitSpeedLimit,
      boolean gamePaused,
      boolean spectating,
      int spectatorCarIndex,
      boolean sliProNativeSupport,
      int numberOfMarshalZones,
      List<MarshalZone> marshalZones,
      SafetyCar safetyCarStatus,
      boolean onlineGame,
      int numberOWeatherForecasts,
      List<WeatherForecastSample> weatherForecastSamples) {
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
    this.weather = weather;
    this.trackTemperature = trackTemperature;
    this.airTemperature = airTemperature;
    this.totalLaps = totalLaps;
    this.trackLength = trackLength;
    this.sessionType = sessionType;
    this.track = track;
    this.era = era;
    this.sessionTimeLeft = sessionTimeLeft;
    this.sessionDuration = sessionDuration;
    this.pitSpeedLimit = pitSpeedLimit;
    this.gamePaused = gamePaused;
    this.spectating = spectating;
    this.spectatorCarIndex = spectatorCarIndex;
    this.sliProNativeSupport = sliProNativeSupport;
    this.numberOfMarshalZones = numberOfMarshalZones;
    this.marshalZones = marshalZones;
    this.safetyCarStatus = safetyCarStatus;
    this.onlineGame = onlineGame;
    this.numberOWeatherForecasts = numberOWeatherForecasts;
    this.weatherForecastSamples = weatherForecastSamples;
  }
}
