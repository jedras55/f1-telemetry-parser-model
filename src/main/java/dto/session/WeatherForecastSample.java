package dto.session;

import lombok.Getter;
import lombok.Value;
import enums.SessionType;
import enums.Weather;

@Getter
@Value
public class WeatherForecastSample {
  int timeOffset;

  int trackTemperature;
  int trackTemperatureChange;

  int airTemperature;
  int airTemperatureChange;

  int rainPercentage;

  Weather weather;

  SessionType sessionType;
}
