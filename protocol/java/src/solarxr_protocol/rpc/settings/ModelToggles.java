// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc.settings;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Settings for the skeletal model that are toggles.
 */
@SuppressWarnings("unused")
public final class ModelToggles extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static ModelToggles getRootAsModelToggles(ByteBuffer _bb) { return getRootAsModelToggles(_bb, new ModelToggles()); }
  public static ModelToggles getRootAsModelToggles(ByteBuffer _bb, ModelToggles obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ModelToggles __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean hasExtendedSpine() { return 0 != __offset(4); }
  public boolean extendedSpine() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasExtendedPelvis() { return 0 != __offset(6); }
  public boolean extendedPelvis() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasExtendedKnee() { return 0 != __offset(8); }
  public boolean extendedKnee() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasForceArmsFromHmd() { return 0 != __offset(10); }
  public boolean forceArmsFromHmd() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasFloorClip() { return 0 != __offset(12); }
  public boolean floorClip() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasSkatingCorrection() { return 0 != __offset(14); }
  public boolean skatingCorrection() { int o = __offset(14); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createModelToggles(FlatBufferBuilder builder,
      boolean extendedSpine,
      boolean extendedPelvis,
      boolean extendedKnee,
      boolean forceArmsFromHmd,
      boolean floorClip,
      boolean skatingCorrection) {
    builder.startTable(6);
    ModelToggles.addSkatingCorrection(builder, skatingCorrection);
    ModelToggles.addFloorClip(builder, floorClip);
    ModelToggles.addForceArmsFromHmd(builder, forceArmsFromHmd);
    ModelToggles.addExtendedKnee(builder, extendedKnee);
    ModelToggles.addExtendedPelvis(builder, extendedPelvis);
    ModelToggles.addExtendedSpine(builder, extendedSpine);
    return ModelToggles.endModelToggles(builder);
  }

  public static void startModelToggles(FlatBufferBuilder builder) { builder.startTable(6); }
  public static void addExtendedSpine(FlatBufferBuilder builder, boolean extendedSpine) { builder.addBoolean(0, extendedSpine, false); }
  public static void addExtendedPelvis(FlatBufferBuilder builder, boolean extendedPelvis) { builder.addBoolean(1, extendedPelvis, false); }
  public static void addExtendedKnee(FlatBufferBuilder builder, boolean extendedKnee) { builder.addBoolean(2, extendedKnee, false); }
  public static void addForceArmsFromHmd(FlatBufferBuilder builder, boolean forceArmsFromHmd) { builder.addBoolean(3, forceArmsFromHmd, false); }
  public static void addFloorClip(FlatBufferBuilder builder, boolean floorClip) { builder.addBoolean(4, floorClip, false); }
  public static void addSkatingCorrection(FlatBufferBuilder builder, boolean skatingCorrection) { builder.addBoolean(5, skatingCorrection, false); }
  public static int endModelToggles(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ModelToggles get(int j) { return get(new ModelToggles(), j); }
    public ModelToggles get(ModelToggles obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ModelTogglesT unpack() {
    ModelTogglesT _o = new ModelTogglesT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ModelTogglesT _o) {
    Boolean _oExtendedSpine = hasExtendedSpine() ? extendedSpine() : null;
    _o.setExtendedSpine(_oExtendedSpine);
    Boolean _oExtendedPelvis = hasExtendedPelvis() ? extendedPelvis() : null;
    _o.setExtendedPelvis(_oExtendedPelvis);
    Boolean _oExtendedKnee = hasExtendedKnee() ? extendedKnee() : null;
    _o.setExtendedKnee(_oExtendedKnee);
    Boolean _oForceArmsFromHmd = hasForceArmsFromHmd() ? forceArmsFromHmd() : null;
    _o.setForceArmsFromHmd(_oForceArmsFromHmd);
    Boolean _oFloorClip = hasFloorClip() ? floorClip() : null;
    _o.setFloorClip(_oFloorClip);
    Boolean _oSkatingCorrection = hasSkatingCorrection() ? skatingCorrection() : null;
    _o.setSkatingCorrection(_oSkatingCorrection);
  }
  public static int pack(FlatBufferBuilder builder, ModelTogglesT _o) {
    if (_o == null) return 0;
    return createModelToggles(
      builder,
      _o.getExtendedSpine(),
      _o.getExtendedPelvis(),
      _o.getExtendedKnee(),
      _o.getForceArmsFromHmd(),
      _o.getFloorClip(),
      _o.getSkatingCorrection());
  }
}

