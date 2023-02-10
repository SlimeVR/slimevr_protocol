// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * OSC Settings specific to VMC
 */
@SuppressWarnings("unused")
public final class VMCOSCSettings extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static VMCOSCSettings getRootAsVMCOSCSettings(ByteBuffer _bb) { return getRootAsVMCOSCSettings(_bb, new VMCOSCSettings()); }
  public static VMCOSCSettings getRootAsVMCOSCSettings(ByteBuffer _bb, VMCOSCSettings obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public VMCOSCSettings __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public solarxr_protocol.rpc.OSCSettings oscSettings() { return oscSettings(new solarxr_protocol.rpc.OSCSettings()); }
  public solarxr_protocol.rpc.OSCSettings oscSettings(solarxr_protocol.rpc.OSCSettings obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public String vrmAddress() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer vrmAddressAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer vrmAddressInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public boolean anchorHip() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createVMCOSCSettings(FlatBufferBuilder builder,
      int oscSettingsOffset,
      int vrmAddressOffset,
      boolean anchorHip) {
    builder.startTable(3);
    VMCOSCSettings.addVrmAddress(builder, vrmAddressOffset);
    VMCOSCSettings.addOscSettings(builder, oscSettingsOffset);
    VMCOSCSettings.addAnchorHip(builder, anchorHip);
    return VMCOSCSettings.endVMCOSCSettings(builder);
  }

  public static void startVMCOSCSettings(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addOscSettings(FlatBufferBuilder builder, int oscSettingsOffset) { builder.addOffset(0, oscSettingsOffset, 0); }
  public static void addVrmAddress(FlatBufferBuilder builder, int vrmAddressOffset) { builder.addOffset(1, vrmAddressOffset, 0); }
  public static void addAnchorHip(FlatBufferBuilder builder, boolean anchorHip) { builder.addBoolean(2, anchorHip, false); }
  public static int endVMCOSCSettings(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public VMCOSCSettings get(int j) { return get(new VMCOSCSettings(), j); }
    public VMCOSCSettings get(VMCOSCSettings obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public VMCOSCSettingsT unpack() {
    VMCOSCSettingsT _o = new VMCOSCSettingsT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(VMCOSCSettingsT _o) {
    if (oscSettings() != null) _o.setOscSettings(oscSettings().unpack());
    else _o.setOscSettings(null);
    String _oVrmAddress = vrmAddress();
    _o.setVrmAddress(_oVrmAddress);
    boolean _oAnchorHip = anchorHip();
    _o.setAnchorHip(_oAnchorHip);
  }
  public static int pack(FlatBufferBuilder builder, VMCOSCSettingsT _o) {
    if (_o == null) return 0;
    int _oscSettings = _o.getOscSettings() == null ? 0 : solarxr_protocol.rpc.OSCSettings.pack(builder, _o.getOscSettings());
    int _vrmAddress = _o.getVrmAddress() == null ? 0 : builder.createString(_o.getVrmAddress());
    return createVMCOSCSettings(
      builder,
      _oscSettings,
      _vrmAddress,
      _o.getAnchorHip());
  }
}

