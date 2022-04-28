// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class AutoBoneProcessStatus extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static AutoBoneProcessStatus getRootAsAutoBoneProcessStatus(ByteBuffer _bb) { return getRootAsAutoBoneProcessStatus(_bb, new AutoBoneProcessStatus()); }
  public static AutoBoneProcessStatus getRootAsAutoBoneProcessStatus(ByteBuffer _bb, AutoBoneProcessStatus obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public AutoBoneProcessStatus __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int processType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public String message() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer messageAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer messageInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public boolean completed() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean success() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createAutoBoneProcessStatus(FlatBufferBuilder builder,
      int processType,
      int messageOffset,
      boolean completed,
      boolean success) {
    builder.startTable(4);
    AutoBoneProcessStatus.addMessage(builder, messageOffset);
    AutoBoneProcessStatus.addSuccess(builder, success);
    AutoBoneProcessStatus.addCompleted(builder, completed);
    AutoBoneProcessStatus.addProcessType(builder, processType);
    return AutoBoneProcessStatus.endAutoBoneProcessStatus(builder);
  }

  public static void startAutoBoneProcessStatus(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addProcessType(FlatBufferBuilder builder, int processType) { builder.addByte(0, (byte) processType, (byte) 0); }
  public static void addMessage(FlatBufferBuilder builder, int messageOffset) { builder.addOffset(1, messageOffset, 0); }
  public static void addCompleted(FlatBufferBuilder builder, boolean completed) { builder.addBoolean(2, completed, false); }
  public static void addSuccess(FlatBufferBuilder builder, boolean success) { builder.addBoolean(3, success, false); }
  public static int endAutoBoneProcessStatus(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public AutoBoneProcessStatus get(int j) { return get(new AutoBoneProcessStatus(), j); }
    public AutoBoneProcessStatus get(AutoBoneProcessStatus obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public AutoBoneProcessStatusT unpack() {
    AutoBoneProcessStatusT _o = new AutoBoneProcessStatusT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(AutoBoneProcessStatusT _o) {
    int _oProcessType = processType();
    _o.setProcessType(_oProcessType);
    String _oMessage = message();
    _o.setMessage(_oMessage);
    boolean _oCompleted = completed();
    _o.setCompleted(_oCompleted);
    boolean _oSuccess = success();
    _o.setSuccess(_oSuccess);
  }
  public static int pack(FlatBufferBuilder builder, AutoBoneProcessStatusT _o) {
    if (_o == null) return 0;
    int _message = _o.getMessage() == null ? 0 : builder.createString(_o.getMessage());
    return createAutoBoneProcessStatus(
      builder,
      _o.getProcessType(),
      _message,
      _o.getCompleted(),
      _o.getSuccess());
  }
}

