package dto.lap;

import enums.DriverStatus;
import enums.PitStatus;
import enums.ResultStatus;
import enums.Sector;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LapData {
  private final Long lastLapTimeInMS;
  private final Long currentLapTimeInMS;
  private final int sector1TimeInMS;
  private final int sector2TimeInMS;
  private final double lapDistance;

  private final double totalDistance;

  private final double safetyCarDelta;
  private final int carPosition;
  private final int currentLapNum;
  private final PitStatus pitStatus;
  private final int numPitStops;
  private final Sector sector;
  private final boolean currentLapInvalid;
  private final int penalties;
  private final int warnings;
  private final int numUnservedDriveThroughPens;
  private final int numUnservedStopGoPens;
  private final int gridPosition;
  private final DriverStatus driverStatus;

  private final ResultStatus resultStatus;

  private final boolean pitLaneTimerActive;
  private final int pitLaneTimeInLaneInMS;
  private final int pitStopTimerInMS;
  private final boolean pitStopShouldServePen;

  public LapData(
      Long lastLapTimeInMS,
      Long currentLapTimeInMS,
      int sector1TimeInMS,
      int sector2TimeInMS,
      double lapDistance,
      double totalDistance,
      double safetyCarDelta,
      int carPosition,
      int currentLapNum,
      PitStatus pitStatus,
      int numPitStops,
      Sector sector,
      boolean currentLapInvalid,
      int penalties,
      int warnings,
      int numUnservedDriveThroughPens,
      int numUnservedStopGoPens,
      int gridPosition,
      DriverStatus driverStatus,
      ResultStatus resultStatus,
      boolean pitLaneTimerActive,
      int pitLaneTimeInLaneInMS,
      int pitStopTimerInMS,
      boolean pitStopShouldServePen) {
    this.lastLapTimeInMS = lastLapTimeInMS;
    this.currentLapTimeInMS = currentLapTimeInMS;
    this.sector1TimeInMS = sector1TimeInMS;
    this.sector2TimeInMS = sector2TimeInMS;
    this.lapDistance = lapDistance;
    this.totalDistance = totalDistance;
    this.safetyCarDelta = safetyCarDelta;
    this.carPosition = carPosition;
    this.currentLapNum = currentLapNum;
    this.pitStatus = pitStatus;
    this.numPitStops = numPitStops;
    this.sector = sector;
    this.currentLapInvalid = currentLapInvalid;
    this.penalties = penalties;
    this.warnings = warnings;
    this.numUnservedDriveThroughPens = numUnservedDriveThroughPens;
    this.numUnservedStopGoPens = numUnservedStopGoPens;
    this.gridPosition = gridPosition;
    this.driverStatus = driverStatus;
    this.resultStatus = resultStatus;
    this.pitLaneTimerActive = pitLaneTimerActive;
    this.pitLaneTimeInLaneInMS = pitLaneTimeInLaneInMS;
    this.pitStopTimerInMS = pitStopTimerInMS;
    this.pitStopShouldServePen = pitStopShouldServePen;
  }
}
