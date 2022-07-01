package dto.car.telemetry;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarTelemetryData {
  private final int speed;
  private final double throttle;
  private final double steer;
  private final double brake;
  private final int clutch;
  private final int gear;
  private final int engineRPM;
  private final boolean drs;
  private final int revLightsPercent;
  private final int revLightsBitValue;
  private final int[] brakesTemperature;
  private final int[] tyresSurfaceTemperature;
  private final int[] tyresInnerTemperature;
  private final int engineTemperature;
  private final double[] tyresPressure;
  private final int[] surfaceType;

  public CarTelemetryData(
      int speed,
      double throttle,
      double steer,
      double brake,
      int clutch,
      int gear,
      int engineRPM,
      boolean drs,
      int revLightsPercent,
      int revLightsBitValue,
      int[] brakesTemperature,
      int[] tyresSurfaceTemperature,
      int[] tyresInnerTemperature,
      int engineTemperature,
      double[] tyresPressure,
      int[] surfaceType) {
    this.speed = speed;
    this.throttle = throttle;
    this.steer = steer;
    this.brake = brake;
    this.clutch = clutch;
    this.gear = gear;
    this.engineRPM = engineRPM;
    this.drs = drs;
    this.revLightsPercent = revLightsPercent;
    this.revLightsBitValue = revLightsBitValue;
    this.brakesTemperature = brakesTemperature;
    this.tyresSurfaceTemperature = tyresSurfaceTemperature;
    this.tyresInnerTemperature = tyresInnerTemperature;
    this.engineTemperature = engineTemperature;
    this.tyresPressure = tyresPressure;
    this.surfaceType = surfaceType;
  }
}
