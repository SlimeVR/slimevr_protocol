// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class AssignTrackerRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static AssignTrackerRequest getRootAsAssignTrackerRequest(ByteBuffer _bb) { return getRootAsAssignTrackerRequest(_bb, new AssignTrackerRequest()); }
  public static AssignTrackerRequest getRootAsAssignTrackerRequest(ByteBuffer _bb, AssignTrackerRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public AssignTrackerRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public solarxr_protocol.datatypes.TrackerId trackerId() { return trackerId(new solarxr_protocol.datatypes.TrackerId()); }
  public solarxr_protocol.datatypes.TrackerId trackerId(solarxr_protocol.datatypes.TrackerId obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public int bodyPosition() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public solarxr_protocol.datatypes.math.Quat mountingRotation() { return mountingRotation(new solarxr_protocol.datatypes.math.Quat()); }
  public solarxr_protocol.datatypes.math.Quat mountingRotation(solarxr_protocol.datatypes.math.Quat obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public String displayName() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer displayNameAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer displayNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }

  public static void startAssignTrackerRequest(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addTrackerId(FlatBufferBuilder builder, int trackerIdOffset) { builder.addOffset(0, trackerIdOffset, 0); }
  public static void addBodyPosition(FlatBufferBuilder builder, int bodyPosition) { builder.addByte(1, (byte) bodyPosition, (byte) 0); }
  public static void addMountingRotation(FlatBufferBuilder builder, int mountingRotationOffset) { builder.addStruct(2, mountingRotationOffset, 0); }
  public static void addDisplayName(FlatBufferBuilder builder, int displayNameOffset) { builder.addOffset(3, displayNameOffset, 0); }
  public static int endAssignTrackerRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public AssignTrackerRequest get(int j) { return get(new AssignTrackerRequest(), j); }
    public AssignTrackerRequest get(AssignTrackerRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public AssignTrackerRequestT unpack() {
    AssignTrackerRequestT _o = new AssignTrackerRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(AssignTrackerRequestT _o) {
    if (trackerId() != null) _o.setTrackerId(trackerId().unpack());
    else _o.setTrackerId(null);
    int _oBodyPosition = bodyPosition();
    _o.setBodyPosition(_oBodyPosition);
    if (mountingRotation() != null) mountingRotation().unpackTo(_o.getMountingRotation());
    else _o.setMountingRotation(null);
    String _oDisplayName = displayName();
    _o.setDisplayName(_oDisplayName);
  }
  public static int pack(FlatBufferBuilder builder, AssignTrackerRequestT _o) {
    if (_o == null) return 0;
    int _trackerId = _o.getTrackerId() == null ? 0 : solarxr_protocol.datatypes.TrackerId.pack(builder, _o.getTrackerId());
    int _displayName = _o.getDisplayName() == null ? 0 : builder.createString(_o.getDisplayName());
    startAssignTrackerRequest(builder);
    addTrackerId(builder, _trackerId);
    addBodyPosition(builder, _o.getBodyPosition());
    addMountingRotation(builder, solarxr_protocol.datatypes.math.Quat.pack(builder, _o.getMountingRotation()));
    addDisplayName(builder, _displayName);
    return endAssignTrackerRequest(builder);
  }
}

