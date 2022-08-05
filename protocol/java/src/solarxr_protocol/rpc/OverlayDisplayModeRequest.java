// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Requests the current state of `OverlayDisplayModeResponse`.
 */
@SuppressWarnings("unused")
public final class OverlayDisplayModeRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static OverlayDisplayModeRequest getRootAsOverlayDisplayModeRequest(ByteBuffer _bb) { return getRootAsOverlayDisplayModeRequest(_bb, new OverlayDisplayModeRequest()); }
  public static OverlayDisplayModeRequest getRootAsOverlayDisplayModeRequest(ByteBuffer _bb, OverlayDisplayModeRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public OverlayDisplayModeRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startOverlayDisplayModeRequest(FlatBufferBuilder builder) { builder.startTable(0); }
  public static int endOverlayDisplayModeRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public OverlayDisplayModeRequest get(int j) { return get(new OverlayDisplayModeRequest(), j); }
    public OverlayDisplayModeRequest get(OverlayDisplayModeRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public OverlayDisplayModeRequestT unpack() {
    OverlayDisplayModeRequestT _o = new OverlayDisplayModeRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(OverlayDisplayModeRequestT _o) {
  }
  public static int pack(FlatBufferBuilder builder, OverlayDisplayModeRequestT _o) {
    if (_o == null) return 0;
    startOverlayDisplayModeRequest(builder);
    return endOverlayDisplayModeRequest(builder);
  }
}

