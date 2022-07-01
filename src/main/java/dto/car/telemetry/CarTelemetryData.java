package dto.car.telemetry;

import java.util.List;
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
  private final List<Integer> brakesTemperature;
  private final List<Integer> tyresSurfaceTemperature;
  private final List<Integer> tyresInnerTemperature;
  private final int engineTemperature;
  private final List<Double> tyresPressure;
  private final List<Integer> surfaceType;

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
      List<Integer> brakesTemperature,
      List<Integer> tyresSurfaceTemperature,
      List<Integer> tyresInnerTemperature,
      int engineTemperature,
      List<Double> tyresPressure,
      List<Integer> surfaceType) {
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
