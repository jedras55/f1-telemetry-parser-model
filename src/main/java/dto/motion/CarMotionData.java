package dto.motion;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class CarMotionData {
  double worldPositionX;
  double worldPositionY;
  double worldPositionZ;
  double worldVelocityX;
  double worldVelocityY;
  double worldVelocityZ;
  int worldForwardDirX;
  int worldForwardDirY;
  int worldForwardDirZ;
  int worldRightDirX;
  int worldRightDirY;
  int worldRightDirZ;
  double gForceLateral;
  double gForceLongitudinal;
  double gForceVertical;
  double yaw;
  double pitch;
  double roll;
}
