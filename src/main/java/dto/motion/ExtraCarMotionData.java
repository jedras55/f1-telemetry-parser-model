package dto.motion;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class ExtraCarMotionData {
  double[] suspensionPosition;
  double[] suspensionVelocity;
  double[] suspensionAcceleration;
  double[] wheelSpeed;
  double[] wheelSlip;
  double localVelocityX;
  double localVelocityY;
  double localVelocityZ;
  double angularVelocityX;
  double angularVelocityY;
  double angularVelocityZ;
  double angularAccelerationX;
  double angularAccelerationY;
  double angularAccelerationZ;
  double frontWheelsAngle;
}
