// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TapDetectionSettings extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static TapDetectionSettings getRootAsTapDetectionSettings(ByteBuffer _bb) { return getRootAsTapDetectionSettings(_bb, new TapDetectionSettings()); }
  public static TapDetectionSettings getRootAsTapDetectionSettings(ByteBuffer _bb, TapDetectionSettings obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TapDetectionSettings __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean hasFullResetDelay() { return 0 != __offset(4); }
  public float fullResetDelay() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasFullResetEnabled() { return 0 != __offset(6); }
  public boolean fullResetEnabled() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasFullResetTaps() { return 0 != __offset(8); }
  public int fullResetTaps() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean hasYawResetDelay() { return 0 != __offset(10); }
  public float yawResetDelay() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasYawResetEnabled() { return 0 != __offset(12); }
  public boolean yawResetEnabled() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasYawResetTaps() { return 0 != __offset(14); }
  public int yawResetTaps() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean hasMountingResetDelay() { return 0 != __offset(16); }
  public float mountingResetDelay() { int o = __offset(16); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasMountingResetEnabled() { return 0 != __offset(18); }
  public boolean mountingResetEnabled() { int o = __offset(18); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasMountingResetTaps() { return 0 != __offset(20); }
  public int mountingResetTaps() { int o = __offset(20); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  /**
   * Disables reset behavior of tap detection and sends a TapDetectionSetupResponse,
   * each time 2 taps are detected on any tracker
   */
  public boolean hasSetupMode() { return 0 != __offset(22); }
  public boolean setupMode() { int o = __offset(22); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createTapDetectionSettings(FlatBufferBuilder builder,
      float fullResetDelay,
      boolean fullResetEnabled,
      int fullResetTaps,
      float yawResetDelay,
      boolean yawResetEnabled,
      int yawResetTaps,
      float mountingResetDelay,
      boolean mountingResetEnabled,
      int mountingResetTaps,
      boolean setupMode) {
    builder.startTable(10);
    TapDetectionSettings.addMountingResetDelay(builder, mountingResetDelay);
    TapDetectionSettings.addYawResetDelay(builder, yawResetDelay);
    TapDetectionSettings.addFullResetDelay(builder, fullResetDelay);
    TapDetectionSettings.addSetupMode(builder, setupMode);
    TapDetectionSettings.addMountingResetTaps(builder, mountingResetTaps);
    TapDetectionSettings.addMountingResetEnabled(builder, mountingResetEnabled);
    TapDetectionSettings.addYawResetTaps(builder, yawResetTaps);
    TapDetectionSettings.addYawResetEnabled(builder, yawResetEnabled);
    TapDetectionSettings.addFullResetTaps(builder, fullResetTaps);
    TapDetectionSettings.addFullResetEnabled(builder, fullResetEnabled);
    return TapDetectionSettings.endTapDetectionSettings(builder);
  }

  public static void startTapDetectionSettings(FlatBufferBuilder builder) { builder.startTable(10); }
  public static void addFullResetDelay(FlatBufferBuilder builder, float fullResetDelay) { builder.addFloat(0, fullResetDelay, 0f); }
  public static void addFullResetEnabled(FlatBufferBuilder builder, boolean fullResetEnabled) { builder.addBoolean(1, fullResetEnabled, false); }
  public static void addFullResetTaps(FlatBufferBuilder builder, int fullResetTaps) { builder.addByte(2, (byte) fullResetTaps, (byte) 0); }
  public static void addYawResetDelay(FlatBufferBuilder builder, float yawResetDelay) { builder.addFloat(3, yawResetDelay, 0f); }
  public static void addYawResetEnabled(FlatBufferBuilder builder, boolean yawResetEnabled) { builder.addBoolean(4, yawResetEnabled, false); }
  public static void addYawResetTaps(FlatBufferBuilder builder, int yawResetTaps) { builder.addByte(5, (byte) yawResetTaps, (byte) 0); }
  public static void addMountingResetDelay(FlatBufferBuilder builder, float mountingResetDelay) { builder.addFloat(6, mountingResetDelay, 0f); }
  public static void addMountingResetEnabled(FlatBufferBuilder builder, boolean mountingResetEnabled) { builder.addBoolean(7, mountingResetEnabled, false); }
  public static void addMountingResetTaps(FlatBufferBuilder builder, int mountingResetTaps) { builder.addByte(8, (byte) mountingResetTaps, (byte) 0); }
  public static void addSetupMode(FlatBufferBuilder builder, boolean setupMode) { builder.addBoolean(9, setupMode, false); }
  public static int endTapDetectionSettings(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TapDetectionSettings get(int j) { return get(new TapDetectionSettings(), j); }
    public TapDetectionSettings get(TapDetectionSettings obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public TapDetectionSettingsT unpack() {
    TapDetectionSettingsT _o = new TapDetectionSettingsT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(TapDetectionSettingsT _o) {
    Float _oFullResetDelay = hasFullResetDelay() ? fullResetDelay() : null;
    _o.setFullResetDelay(_oFullResetDelay);
    Boolean _oFullResetEnabled = hasFullResetEnabled() ? fullResetEnabled() : null;
    _o.setFullResetEnabled(_oFullResetEnabled);
    Integer _oFullResetTaps = hasFullResetTaps() ? fullResetTaps() : null;
    _o.setFullResetTaps(_oFullResetTaps);
    Float _oYawResetDelay = hasYawResetDelay() ? yawResetDelay() : null;
    _o.setYawResetDelay(_oYawResetDelay);
    Boolean _oYawResetEnabled = hasYawResetEnabled() ? yawResetEnabled() : null;
    _o.setYawResetEnabled(_oYawResetEnabled);
    Integer _oYawResetTaps = hasYawResetTaps() ? yawResetTaps() : null;
    _o.setYawResetTaps(_oYawResetTaps);
    Float _oMountingResetDelay = hasMountingResetDelay() ? mountingResetDelay() : null;
    _o.setMountingResetDelay(_oMountingResetDelay);
    Boolean _oMountingResetEnabled = hasMountingResetEnabled() ? mountingResetEnabled() : null;
    _o.setMountingResetEnabled(_oMountingResetEnabled);
    Integer _oMountingResetTaps = hasMountingResetTaps() ? mountingResetTaps() : null;
    _o.setMountingResetTaps(_oMountingResetTaps);
    Boolean _oSetupMode = hasSetupMode() ? setupMode() : null;
    _o.setSetupMode(_oSetupMode);
  }
  public static int pack(FlatBufferBuilder builder, TapDetectionSettingsT _o) {
    if (_o == null) return 0;
    return createTapDetectionSettings(
      builder,
      _o.getFullResetDelay(),
      _o.getFullResetEnabled(),
      _o.getFullResetTaps(),
      _o.getYawResetDelay(),
      _o.getYawResetEnabled(),
      _o.getYawResetTaps(),
      _o.getMountingResetDelay(),
      _o.getMountingResetEnabled(),
      _o.getMountingResetTaps(),
      _o.getSetupMode());
  }
}

