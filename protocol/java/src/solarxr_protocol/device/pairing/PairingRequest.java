// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.device.pairing;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Sent by a server, trying to connect to a device
 * which then the device will respond to with the `PairingResponse` packet.
 */
@SuppressWarnings("unused")
public final class PairingRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static PairingRequest getRootAsPairingRequest(ByteBuffer _bb) { return getRootAsPairingRequest(_bb, new PairingRequest()); }
  public static PairingRequest getRootAsPairingRequest(ByteBuffer _bb, PairingRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public PairingRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * Should not be `0`, will get ignored by the tracker otherwise.
   */
  public long serverId() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createPairingRequest(FlatBufferBuilder builder,
      long serverId) {
    builder.startTable(1);
    PairingRequest.addServerId(builder, serverId);
    return PairingRequest.endPairingRequest(builder);
  }

  public static void startPairingRequest(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addServerId(FlatBufferBuilder builder, long serverId) { builder.addInt(0, (int) serverId, (int) 0L); }
  public static int endPairingRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public PairingRequest get(int j) { return get(new PairingRequest(), j); }
    public PairingRequest get(PairingRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public PairingRequestT unpack() {
    PairingRequestT _o = new PairingRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(PairingRequestT _o) {
    long _oServerId = serverId();
    _o.setServerId(_oServerId);
  }
  public static int pack(FlatBufferBuilder builder, PairingRequestT _o) {
    if (_o == null) return 0;
    return createPairingRequest(
      builder,
      _o.getServerId());
  }
}
