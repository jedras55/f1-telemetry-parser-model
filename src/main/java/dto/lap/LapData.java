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
  private int lastLapTimeInMS;
  private int currentLapTimeInMS;
  private int sector1TimeInMS;
  private int sector2TimeInMS;
  private double lapDistance;

  private double totalDistance;

  private double safetyCarDelta;
  private int carPosition;
  private int currentLapNum;
  private PitStatus pitStatus;
  private int numPitStops;
  private Sector sector;
  private boolean currentLapInvalid;
  private int penalties;
  private int warnings;
  private int numUnservedDriveThroughPens;
  private int numUnservedStopGoPens;
  private int gridPosition;
  private DriverStatus driverStatus;

  private ResultStatus resultStatus;

  private boolean pitLaneTimerActive;
  private int pitLaneTimeInLaneInMS;
  private int pitStopTimerInMS;
  private boolean pitStopShouldServePen;

  public LapData(
      int lastLapTimeInMS,
      int currentLapTimeInMS,
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
