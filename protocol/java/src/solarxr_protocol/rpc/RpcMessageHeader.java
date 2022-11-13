// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class RpcMessageHeader extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static RpcMessageHeader getRootAsRpcMessageHeader(ByteBuffer _bb) { return getRootAsRpcMessageHeader(_bb, new RpcMessageHeader()); }
  public static RpcMessageHeader getRootAsRpcMessageHeader(ByteBuffer _bb, RpcMessageHeader obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public RpcMessageHeader __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * For a request, this identifies the request. For a response, this corresponds
   * to the request that it is responding to.
   */
  public solarxr_protocol.datatypes.TransactionId txId() { return txId(new solarxr_protocol.datatypes.TransactionId()); }
  public solarxr_protocol.datatypes.TransactionId txId(solarxr_protocol.datatypes.TransactionId obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public byte messageType() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table message(Table obj) { int o = __offset(8); return o != 0 ? __union(obj, o + bb_pos) : null; }

  public static void startRpcMessageHeader(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addTxId(FlatBufferBuilder builder, int txIdOffset) { builder.addStruct(0, txIdOffset, 0); }
  public static void addMessageType(FlatBufferBuilder builder, byte messageType) { builder.addByte(1, messageType, 0); }
  public static void addMessage(FlatBufferBuilder builder, int messageOffset) { builder.addOffset(2, messageOffset, 0); }
  public static int endRpcMessageHeader(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public RpcMessageHeader get(int j) { return get(new RpcMessageHeader(), j); }
    public RpcMessageHeader get(RpcMessageHeader obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public RpcMessageHeaderT unpack() {
    RpcMessageHeaderT _o = new RpcMessageHeaderT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(RpcMessageHeaderT _o) {
    if (txId() != null) txId().unpackTo(_o.getTxId());
    else _o.setTxId(null);
    solarxr_protocol.rpc.RpcMessageUnion _oMessage = new solarxr_protocol.rpc.RpcMessageUnion();
    byte _oMessageType = messageType();
    _oMessage.setType(_oMessageType);
    Table _oMessageValue;
    switch (_oMessageType) {
      case solarxr_protocol.rpc.RpcMessage.HeartbeatRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.HeartbeatRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.HeartbeatRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.HeartbeatResponse:
        _oMessageValue = message(new solarxr_protocol.rpc.HeartbeatResponse());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.HeartbeatResponse) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.ResetRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.ResetRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.ResetRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.AssignTrackerRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.AssignTrackerRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.AssignTrackerRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.SettingsRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.SettingsRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.SettingsRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.SettingsResponse:
        _oMessageValue = message(new solarxr_protocol.rpc.SettingsResponse());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.SettingsResponse) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.ChangeSettingsRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.ChangeSettingsRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.ChangeSettingsRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.RecordBVHRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.RecordBVHRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.RecordBVHRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.RecordBVHStatus:
        _oMessageValue = message(new solarxr_protocol.rpc.RecordBVHStatus());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.RecordBVHStatus) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.SkeletonConfigRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.SkeletonConfigRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.SkeletonConfigRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.ChangeSkeletonConfigRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.ChangeSkeletonConfigRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.ChangeSkeletonConfigRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.SkeletonResetAllRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.SkeletonResetAllRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.SkeletonResetAllRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.SkeletonConfigResponse:
        _oMessageValue = message(new solarxr_protocol.rpc.SkeletonConfigResponse());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.SkeletonConfigResponse) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.OpenSerialRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.OpenSerialRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.OpenSerialRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.CloseSerialRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.CloseSerialRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.CloseSerialRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.SetWifiRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.SetWifiRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.SetWifiRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.SerialUpdateResponse:
        _oMessageValue = message(new solarxr_protocol.rpc.SerialUpdateResponse());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.SerialUpdateResponse) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.AutoBoneProcessRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.AutoBoneProcessRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.AutoBoneProcessRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.AutoBoneProcessStatusResponse:
        _oMessageValue = message(new solarxr_protocol.rpc.AutoBoneProcessStatusResponse());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.AutoBoneProcessStatusResponse) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.AutoBoneEpochResponse:
        _oMessageValue = message(new solarxr_protocol.rpc.AutoBoneEpochResponse());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.AutoBoneEpochResponse) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.OverlayDisplayModeRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.OverlayDisplayModeRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.OverlayDisplayModeRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.OverlayDisplayModeChangeRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.OverlayDisplayModeChangeRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.OverlayDisplayModeChangeRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.OverlayDisplayModeResponse:
        _oMessageValue = message(new solarxr_protocol.rpc.OverlayDisplayModeResponse());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.OverlayDisplayModeResponse) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.SerialTrackerRebootRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.SerialTrackerRebootRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.SerialTrackerRebootRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.SerialTrackerGetInfoRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.SerialTrackerGetInfoRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.SerialTrackerGetInfoRequest) _oMessageValue).unpack() : null);
        break;
      case solarxr_protocol.rpc.RpcMessage.SerialTrackerFactoryResetRequest:
        _oMessageValue = message(new solarxr_protocol.rpc.SerialTrackerFactoryResetRequest());
        _oMessage.setValue(_oMessageValue != null ? ((solarxr_protocol.rpc.SerialTrackerFactoryResetRequest) _oMessageValue).unpack() : null);
        break;
      default: break;
    }
    _o.setMessage(_oMessage);
  }
  public static int pack(FlatBufferBuilder builder, RpcMessageHeaderT _o) {
    if (_o == null) return 0;
    byte _messageType = _o.getMessage() == null ? solarxr_protocol.rpc.RpcMessage.NONE : _o.getMessage().getType();
    int _message = _o.getMessage() == null ? 0 : solarxr_protocol.rpc.RpcMessageUnion.pack(builder, _o.getMessage());
    startRpcMessageHeader(builder);
    addTxId(builder, solarxr_protocol.datatypes.TransactionId.pack(builder, _o.getTxId()));
    addMessageType(builder, _messageType);
    addMessage(builder, _message);
    return endRpcMessageHeader(builder);
  }
}

