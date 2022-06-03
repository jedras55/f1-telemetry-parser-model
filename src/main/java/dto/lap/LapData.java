package dto.lap;

import enums.PitStatus;
import enums.Sector;
import lombok.Getter;
import lombok.Value;
import enums.DriverStatus;
import enums.PitStatus;
import enums.ResultStatus;
import enums.Sector;

@Getter
@Value
public class LapData {
  Long lastLapTimeInMS;
  Long currentLapTimeInMS;
  int sector1TimeInMS;
  int sector2TimeInMS;
  double lapDistance;

  double totalDistance;

  double safetyCarDelta;
  int carPosition;
  int currentLapNum;
  PitStatus pitStatus;
  int numPitStops;
  Sector sector;
  boolean currentLapInvalid;
  int penalties;
  int warnings;
  int numUnservedDriveThroughPens;
  int numUnservedStopGoPens;
  int gridPosition;
  DriverStatus driverStatus;

  ResultStatus resultStatus;

  boolean pitLaneTimerActive;
  int pitLaneTimeInLaneInMS;
  int pitStopTimerInMS;
  boolean pitStopShouldServePen;
}
