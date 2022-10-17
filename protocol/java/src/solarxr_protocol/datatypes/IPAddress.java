// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class IPAddress extends Struct {
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public IPAddress __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long addr() { return (long)bb.getInt(bb_pos + 0) & 0xFFFFFFFFL; }

  public static int createIPAddress(FlatBufferBuilder builder, long addr) {
    builder.prep(4, 4);
    builder.putInt((int) addr);
    return builder.offset();
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public IPAddress get(int j) { return get(new IPAddress(), j); }
    public IPAddress get(IPAddress obj, int j) {  return obj.__assign(__element(j), bb); }
  }
  public IPAddressT unpack() {
    IPAddressT _o = new IPAddressT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(IPAddressT _o) {
    long _oAddr = addr();
    _o.setAddr(_oAddr);
  }
  public static int pack(FlatBufferBuilder builder, IPAddressT _o) {
    if (_o == null) return 0;
    return createIPAddress(
      builder,
      _o.getAddr());
  }
}

