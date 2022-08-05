// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class HeartbeatResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static HeartbeatResponse getRootAsHeartbeatResponse(ByteBuffer _bb) { return getRootAsHeartbeatResponse(_bb, new HeartbeatResponse()); }
  public static HeartbeatResponse getRootAsHeartbeatResponse(ByteBuffer _bb, HeartbeatResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public HeartbeatResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startHeartbeatResponse(FlatBufferBuilder builder) { builder.startTable(0); }
  public static int endHeartbeatResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public HeartbeatResponse get(int j) { return get(new HeartbeatResponse(), j); }
    public HeartbeatResponse get(HeartbeatResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public HeartbeatResponseT unpack() {
    HeartbeatResponseT _o = new HeartbeatResponseT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(HeartbeatResponseT _o) {
  }
  public static int pack(FlatBufferBuilder builder, HeartbeatResponseT _o) {
    if (_o == null) return 0;
    startHeartbeatResponse(builder);
    return endHeartbeatResponse(builder);
  }
}

