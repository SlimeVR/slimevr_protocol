// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class YawCorrectionSettings extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static YawCorrectionSettings getRootAsYawCorrectionSettings(ByteBuffer _bb) { return getRootAsYawCorrectionSettings(_bb, new YawCorrectionSettings()); }
  public static YawCorrectionSettings getRootAsYawCorrectionSettings(ByteBuffer _bb, YawCorrectionSettings obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public YawCorrectionSettings __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float amountInDegPerSec() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static int createYawCorrectionSettings(FlatBufferBuilder builder,
      float amountInDegPerSec) {
    builder.startTable(1);
    YawCorrectionSettings.addAmountInDegPerSec(builder, amountInDegPerSec);
    return YawCorrectionSettings.endYawCorrectionSettings(builder);
  }

  public static void startYawCorrectionSettings(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addAmountInDegPerSec(FlatBufferBuilder builder, float amountInDegPerSec) { builder.addFloat(0, amountInDegPerSec, 0.0f); }
  public static int endYawCorrectionSettings(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public YawCorrectionSettings get(int j) { return get(new YawCorrectionSettings(), j); }
    public YawCorrectionSettings get(YawCorrectionSettings obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public YawCorrectionSettingsT unpack() {
    YawCorrectionSettingsT _o = new YawCorrectionSettingsT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(YawCorrectionSettingsT _o) {
    float _oAmountInDegPerSec = amountInDegPerSec();
    _o.setAmountInDegPerSec(_oAmountInDegPerSec);
  }
  public static int pack(FlatBufferBuilder builder, YawCorrectionSettingsT _o) {
    if (_o == null) return 0;
    return createYawCorrectionSettings(
      builder,
      _o.getAmountInDegPerSec());
  }
}

