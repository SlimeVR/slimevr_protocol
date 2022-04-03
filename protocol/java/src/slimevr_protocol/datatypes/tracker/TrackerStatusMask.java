// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.datatypes.tracker;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * A mask of the data in `TrackerStatus`
 */
@SuppressWarnings("unused")
public final class TrackerStatusMask extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static TrackerStatusMask getRootAsTrackerStatusMask(ByteBuffer _bb) { return getRootAsTrackerStatusMask(_bb, new TrackerStatusMask()); }
  public static TrackerStatusMask getRootAsTrackerStatusMask(ByteBuffer _bb, TrackerStatusMask obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TrackerStatusMask __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean role() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean orientation() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean position() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean rawRotVel() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean rawTransAccel() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean temp() { int o = __offset(14); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean pollRate() { int o = __offset(16); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mountingRotation() { int o = __offset(18); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createTrackerStatusMask(FlatBufferBuilder builder,
      boolean role,
      boolean orientation,
      boolean position,
      boolean rawRotVel,
      boolean rawTransAccel,
      boolean temp,
      boolean pollRate,
      boolean mountingRotation) {
    builder.startTable(8);
    TrackerStatusMask.addMountingRotation(builder, mountingRotation);
    TrackerStatusMask.addPollRate(builder, pollRate);
    TrackerStatusMask.addTemp(builder, temp);
    TrackerStatusMask.addRawTransAccel(builder, rawTransAccel);
    TrackerStatusMask.addRawRotVel(builder, rawRotVel);
    TrackerStatusMask.addPosition(builder, position);
    TrackerStatusMask.addOrientation(builder, orientation);
    TrackerStatusMask.addRole(builder, role);
    return TrackerStatusMask.endTrackerStatusMask(builder);
  }

  public static void startTrackerStatusMask(FlatBufferBuilder builder) { builder.startTable(8); }
  public static void addRole(FlatBufferBuilder builder, boolean role) { builder.addBoolean(0, role, false); }
  public static void addOrientation(FlatBufferBuilder builder, boolean orientation) { builder.addBoolean(1, orientation, false); }
  public static void addPosition(FlatBufferBuilder builder, boolean position) { builder.addBoolean(2, position, false); }
  public static void addRawRotVel(FlatBufferBuilder builder, boolean rawRotVel) { builder.addBoolean(3, rawRotVel, false); }
  public static void addRawTransAccel(FlatBufferBuilder builder, boolean rawTransAccel) { builder.addBoolean(4, rawTransAccel, false); }
  public static void addTemp(FlatBufferBuilder builder, boolean temp) { builder.addBoolean(5, temp, false); }
  public static void addPollRate(FlatBufferBuilder builder, boolean pollRate) { builder.addBoolean(6, pollRate, false); }
  public static void addMountingRotation(FlatBufferBuilder builder, boolean mountingRotation) { builder.addBoolean(7, mountingRotation, false); }
  public static int endTrackerStatusMask(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TrackerStatusMask get(int j) { return get(new TrackerStatusMask(), j); }
    public TrackerStatusMask get(TrackerStatusMask obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

