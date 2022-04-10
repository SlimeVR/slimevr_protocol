// automatically generated by the FlatBuffers compiler, do not modify

import { Temperature, TemperatureT } from '../../../slimevr-protocol/datatypes/temperature';
import { Quat, QuatT } from '../../../slimevr-protocol/datatypes/math/quat';
import { Vec3f, Vec3fT } from '../../../slimevr-protocol/datatypes/math/vec3f';


/**
 * Contains all of the valid data components in a `TrackerData`.
 */
export enum TrackerDataComponent{
  NONE = 0,
  rotation = 1,

  /**
   * Position, in meters
   */
  position = 2,

  /**
   * Raw rotational velocity, in euler angles
   */
  raw_rot_vel = 3,

  /**
   * Raw translational acceleration, in m/s^2
   */
  raw_trans_accel = 4,

  /**
   * Temperature in degrees celsius
   */
  temp = 5
}

export function unionToTrackerDataComponent(
  type: TrackerDataComponent,
  accessor: (obj:Quat|Temperature|Vec3f) => Quat|Temperature|Vec3f|null
): Quat|Temperature|Vec3f|null {
  switch(TrackerDataComponent[type]) {
    case 'NONE': return null; 
    case 'rotation': return accessor(new Quat())! as Quat;
    case 'position': return accessor(new Vec3f())! as Vec3f;
    case 'raw_rot_vel': return accessor(new Vec3f())! as Vec3f;
    case 'raw_trans_accel': return accessor(new Vec3f())! as Vec3f;
    case 'temp': return accessor(new Temperature())! as Temperature;
    default: return null;
  }
}

export function unionListToTrackerDataComponent(
  type: TrackerDataComponent, 
  accessor: (index: number, obj:Quat|Temperature|Vec3f) => Quat|Temperature|Vec3f|null, 
  index: number
): Quat|Temperature|Vec3f|null {
  switch(TrackerDataComponent[type]) {
    case 'NONE': return null; 
    case 'rotation': return accessor(index, new Quat())! as Quat;
    case 'position': return accessor(index, new Vec3f())! as Vec3f;
    case 'raw_rot_vel': return accessor(index, new Vec3f())! as Vec3f;
    case 'raw_trans_accel': return accessor(index, new Vec3f())! as Vec3f;
    case 'temp': return accessor(index, new Temperature())! as Temperature;
    default: return null;
  }
}
