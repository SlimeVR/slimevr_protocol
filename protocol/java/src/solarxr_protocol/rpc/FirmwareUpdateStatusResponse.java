// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FirmwareUpdateStatusResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static FirmwareUpdateStatusResponse getRootAsFirmwareUpdateStatusResponse(ByteBuffer _bb) { return getRootAsFirmwareUpdateStatusResponse(_bb, new FirmwareUpdateStatusResponse()); }
  public static FirmwareUpdateStatusResponse getRootAsFirmwareUpdateStatusResponse(ByteBuffer _bb, FirmwareUpdateStatusResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FirmwareUpdateStatusResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte deviceIdType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table deviceId(Table obj) { int o = __offset(6); return o != 0 ? __union(obj, o + bb_pos) : null; }
  public int status() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  /**
   * from 0 to 100
   */
  public byte progress() { int o = __offset(10); return o != 0 ? bb.get(o + bb_pos) : 0; }

  public static int createFirmwareUpdateStatusResponse(FlatBufferBuilder builder,
      byte deviceIdType,
      int deviceIdOffset,
      int status,
      byte progress) {
    builder.startTable(4);
    FirmwareUpdateStatusResponse.addDeviceId(builder, deviceIdOffset);
    FirmwareUpdateStatusResponse.addProgress(builder, progress);
    FirmwareUpdateStatusResponse.addStatus(builder, status);
    FirmwareUpdateStatusResponse.addDeviceIdType(builder, deviceIdType);
    return FirmwareUpdateStatusResponse.endFirmwareUpdateStatusResponse(builder);
  }

  public static void startFirmwareUpdateStatusResponse(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addDeviceIdType(FlatBufferBuilder builder, byte deviceIdType) { builder.addByte(0, deviceIdType, 0); }
  public static void addDeviceId(FlatBufferBuilder builder, int deviceIdOffset) { builder.addOffset(1, deviceIdOffset, 0); }
  public static void addStatus(FlatBufferBuilder builder, int status) { builder.addByte(2, (byte) status, (byte) 0); }
  public static void addProgress(FlatBufferBuilder builder, byte progress) { builder.addByte(3, progress, 0); }
  public static int endFirmwareUpdateStatusResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FirmwareUpdateStatusResponse get(int j) { return get(new FirmwareUpdateStatusResponse(), j); }
    public FirmwareUpdateStatusResponse get(FirmwareUpdateStatusResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public FirmwareUpdateStatusResponseT unpack() {
    FirmwareUpdateStatusResponseT _o = new FirmwareUpdateStatusResponseT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(FirmwareUpdateStatusResponseT _o) {
    solarxr_protocol.rpc.FirmwareDeviceIdUnion _oDeviceId = new solarxr_protocol.rpc.FirmwareDeviceIdUnion();
    byte _oDeviceIdType = deviceIdType();
    _oDeviceId.setType(_oDeviceIdType);
    Table _oDeviceIdValue;
    switch (_oDeviceIdType) {
      case solarxr_protocol.rpc.FirmwareDeviceId.solarxr_protocol_datatypes_DeviceIdTable:
        _oDeviceIdValue = deviceId(new solarxr_protocol.datatypes.DeviceIdTable());
        _oDeviceId.setValue(_oDeviceIdValue != null ? ((solarxr_protocol.datatypes.DeviceIdTable) _oDeviceIdValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.FirmwareDeviceId.SerialDeviceId:
        _oDeviceIdValue = deviceId(new solarxr_protocol.rpc.SerialDeviceId());
        _oDeviceId.setValue(_oDeviceIdValue != null ? ((solarxr_protocol.rpc.SerialDeviceId) _oDeviceIdValue).unpack() : null);
        break;
      default: break;
    }
    _o.setDeviceId(_oDeviceId);
    int _oStatus = status();
    _o.setStatus(_oStatus);
    byte _oProgress = progress();
    _o.setProgress(_oProgress);
  }
  public static int pack(FlatBufferBuilder builder, FirmwareUpdateStatusResponseT _o) {
    if (_o == null) return 0;
    byte _deviceIdType = _o.getDeviceId() == null ? solarxr_protocol.rpc.FirmwareDeviceId.NONE : _o.getDeviceId().getType();
    int _deviceId = _o.getDeviceId() == null ? 0 : solarxr_protocol.rpc.FirmwareDeviceIdUnion.pack(builder, _o.getDeviceId());
    return createFirmwareUpdateStatusResponse(
      builder,
      _deviceIdType,
      _deviceId,
      _o.getStatus(),
      _o.getProgress());
  }
}

