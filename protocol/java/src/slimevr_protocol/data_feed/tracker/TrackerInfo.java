// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.data_feed.tracker;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Static description of a tracker
 */
@SuppressWarnings("unused")
public final class TrackerInfo extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static TrackerInfo getRootAsTrackerInfo(ByteBuffer _bb) { return getRootAsTrackerInfo(_bb, new TrackerInfo()); }
  public static TrackerInfo getRootAsTrackerInfo(ByteBuffer _bb, TrackerInfo obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TrackerInfo __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public slimevr_protocol.datatypes.TrackerId trackerId() { return trackerId(new slimevr_protocol.datatypes.TrackerId()); }
  public slimevr_protocol.datatypes.TrackerId trackerId(slimevr_protocol.datatypes.TrackerId obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public int imuType() { int o = __offset(6); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  /**
   * The user-assigned role of the tracker.
   */
  public slimevr_protocol.datatypes.BodyPartW bodyPart() { return bodyPart(new slimevr_protocol.datatypes.BodyPartW()); }
  public slimevr_protocol.datatypes.BodyPartW bodyPart(slimevr_protocol.datatypes.BodyPartW obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * average samples per second
   */
  public slimevr_protocol.datatypes.HzF32 pollRate() { return pollRate(new slimevr_protocol.datatypes.HzF32()); }
  public slimevr_protocol.datatypes.HzF32 pollRate(slimevr_protocol.datatypes.HzF32 obj) { int o = __offset(10); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  /**
   * The orientation of the tracker when mounted on the body
   */
  public slimevr_protocol.datatypes.math.Quat mountingOrientation() { return mountingOrientation(new slimevr_protocol.datatypes.math.Quat()); }
  public slimevr_protocol.datatypes.math.Quat mountingOrientation(slimevr_protocol.datatypes.math.Quat obj) { int o = __offset(12); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startTrackerInfo(FlatBufferBuilder builder) { builder.startTable(5); }
  public static void addTrackerId(FlatBufferBuilder builder, int trackerIdOffset) { builder.addOffset(0, trackerIdOffset, 0); }
  public static void addImuType(FlatBufferBuilder builder, int imuType) { builder.addShort(1, (short) imuType, (short) 0); }
  public static void addBodyPart(FlatBufferBuilder builder, int bodyPartOffset) { builder.addOffset(2, bodyPartOffset, 0); }
  public static void addPollRate(FlatBufferBuilder builder, int pollRateOffset) { builder.addStruct(3, pollRateOffset, 0); }
  public static void addMountingOrientation(FlatBufferBuilder builder, int mountingOrientationOffset) { builder.addStruct(4, mountingOrientationOffset, 0); }
  public static int endTrackerInfo(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TrackerInfo get(int j) { return get(new TrackerInfo(), j); }
    public TrackerInfo get(TrackerInfo obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public TrackerInfoT unpack() {
    TrackerInfoT _o = new TrackerInfoT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(TrackerInfoT _o) {
    if (trackerId() != null) _o.setTrackerId(trackerId().unpack());
    else _o.setTrackerId(null);
    int _oImuType = imuType();
    _o.setImuType(_oImuType);
    if (bodyPart() != null) _o.setBodyPart(bodyPart().unpack());
    else _o.setBodyPart(null);
    if (pollRate() != null) pollRate().unpackTo(_o.getPollRate());
    else _o.setPollRate(null);
    if (mountingOrientation() != null) mountingOrientation().unpackTo(_o.getMountingOrientation());
    else _o.setMountingOrientation(null);
  }
  public static int pack(FlatBufferBuilder builder, TrackerInfoT _o) {
    if (_o == null) return 0;
    int _tracker_id = _o.getTrackerId() == null ? 0 : slimevr_protocol.datatypes.TrackerId.pack(builder, _o.getTrackerId());
    int _body_part = _o.getBodyPart() == null ? 0 : slimevr_protocol.datatypes.BodyPartW.pack(builder, _o.getBodyPart());
    startTrackerInfo(builder);
    addTrackerId(builder, _tracker_id);
    addImuType(builder, _o.getImuType());
    addBodyPart(builder, _body_part);
    addPollRate(builder, slimevr_protocol.datatypes.HzF32.pack(builder, _o.getPollRate()));
    addMountingOrientation(builder, slimevr_protocol.datatypes.math.Quat.pack(builder, _o.getMountingOrientation()));
    return endTrackerInfo(builder);
  }
}
