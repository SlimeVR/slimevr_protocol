// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes.hardware_info;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Mostly static info about the device's hardware/firmware.
 */
@SuppressWarnings("unused")
public final class HardwareInfo extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static HardwareInfo getRootAsHardwareInfo(ByteBuffer _bb) { return getRootAsHardwareInfo(_bb, new HardwareInfo()); }
  public static HardwareInfo getRootAsHardwareInfo(ByteBuffer _bb, HardwareInfo obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public HardwareInfo __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int mcuId() { int o = __offset(4); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  /**
   * A human-friendly name to display as the name of the device.
   */
  public String displayName() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer displayNameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer displayNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  /**
   * A human-friendly string for the device model.
   */
  public String model() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer modelAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer modelInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  /**
   * A human-friendly string for the manufacturer of the device.
   */
  public String manufacturer() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer manufacturerAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer manufacturerInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  /**
   * The hardware version of the device. For example, pcb version.
   */
  public String hardwareRevision() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer hardwareRevisionAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer hardwareRevisionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  /**
   * The version of the slimevr firmware that the device is running.
   */
  public String firmwareVersion() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer firmwareVersionAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer firmwareVersionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }
  public solarxr_protocol.datatypes.hardware_info.HardwareAddress hardwareAddress() { return hardwareAddress(new solarxr_protocol.datatypes.hardware_info.HardwareAddress()); }
  public solarxr_protocol.datatypes.hardware_info.HardwareAddress hardwareAddress(solarxr_protocol.datatypes.hardware_info.HardwareAddress obj) { int o = __offset(16); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public solarxr_protocol.datatypes.Ipv4Address ipAddress() { return ipAddress(new solarxr_protocol.datatypes.Ipv4Address()); }
  public solarxr_protocol.datatypes.Ipv4Address ipAddress(solarxr_protocol.datatypes.Ipv4Address obj) { int o = __offset(18); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public int boardType() { int o = __offset(20); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }

  public static void startHardwareInfo(FlatBufferBuilder builder) { builder.startTable(9); }
  public static void addMcuId(FlatBufferBuilder builder, int mcuId) { builder.addShort(0, (short) mcuId, (short) 0); }
  public static void addDisplayName(FlatBufferBuilder builder, int displayNameOffset) { builder.addOffset(1, displayNameOffset, 0); }
  public static void addModel(FlatBufferBuilder builder, int modelOffset) { builder.addOffset(2, modelOffset, 0); }
  public static void addManufacturer(FlatBufferBuilder builder, int manufacturerOffset) { builder.addOffset(3, manufacturerOffset, 0); }
  public static void addHardwareRevision(FlatBufferBuilder builder, int hardwareRevisionOffset) { builder.addOffset(4, hardwareRevisionOffset, 0); }
  public static void addFirmwareVersion(FlatBufferBuilder builder, int firmwareVersionOffset) { builder.addOffset(5, firmwareVersionOffset, 0); }
  public static void addHardwareAddress(FlatBufferBuilder builder, int hardwareAddressOffset) { builder.addStruct(6, hardwareAddressOffset, 0); }
  public static void addIpAddress(FlatBufferBuilder builder, int ipAddressOffset) { builder.addStruct(7, ipAddressOffset, 0); }
  public static void addBoardType(FlatBufferBuilder builder, int boardType) { builder.addShort(8, (short) boardType, (short) 0); }
  public static int endHardwareInfo(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public HardwareInfo get(int j) { return get(new HardwareInfo(), j); }
    public HardwareInfo get(HardwareInfo obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public HardwareInfoT unpack() {
    HardwareInfoT _o = new HardwareInfoT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(HardwareInfoT _o) {
    int _oMcuId = mcuId();
    _o.setMcuId(_oMcuId);
    String _oDisplayName = displayName();
    _o.setDisplayName(_oDisplayName);
    String _oModel = model();
    _o.setModel(_oModel);
    String _oManufacturer = manufacturer();
    _o.setManufacturer(_oManufacturer);
    String _oHardwareRevision = hardwareRevision();
    _o.setHardwareRevision(_oHardwareRevision);
    String _oFirmwareVersion = firmwareVersion();
    _o.setFirmwareVersion(_oFirmwareVersion);
    if (hardwareAddress() != null) hardwareAddress().unpackTo(_o.getHardwareAddress());
    else _o.setHardwareAddress(null);
    if (ipAddress() != null) ipAddress().unpackTo(_o.getIpAddress());
    else _o.setIpAddress(null);
    int _oBoardType = boardType();
    _o.setBoardType(_oBoardType);
  }
  public static int pack(FlatBufferBuilder builder, HardwareInfoT _o) {
    if (_o == null) return 0;
    int _displayName = _o.getDisplayName() == null ? 0 : builder.createString(_o.getDisplayName());
    int _model = _o.getModel() == null ? 0 : builder.createString(_o.getModel());
    int _manufacturer = _o.getManufacturer() == null ? 0 : builder.createString(_o.getManufacturer());
    int _hardwareRevision = _o.getHardwareRevision() == null ? 0 : builder.createString(_o.getHardwareRevision());
    int _firmwareVersion = _o.getFirmwareVersion() == null ? 0 : builder.createString(_o.getFirmwareVersion());
    startHardwareInfo(builder);
    addMcuId(builder, _o.getMcuId());
    addDisplayName(builder, _displayName);
    addModel(builder, _model);
    addManufacturer(builder, _manufacturer);
    addHardwareRevision(builder, _hardwareRevision);
    addFirmwareVersion(builder, _firmwareVersion);
    addHardwareAddress(builder, solarxr_protocol.datatypes.hardware_info.HardwareAddress.pack(builder, _o.getHardwareAddress()));
    addIpAddress(builder, solarxr_protocol.datatypes.Ipv4Address.pack(builder, _o.getIpAddress()));
    addBoardType(builder, _o.getBoardType());
    return endHardwareInfo(builder);
  }
}

