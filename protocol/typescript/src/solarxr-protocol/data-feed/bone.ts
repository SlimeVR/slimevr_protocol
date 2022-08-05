// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { BodyPart } from '../../solarxr-protocol/datatypes/body-part';
import { Quat, QuatT } from '../../solarxr-protocol/datatypes/math/quat';
import { Vec3f, Vec3fT } from '../../solarxr-protocol/datatypes/math/vec3f';


export class Bone {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):Bone {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsBone(bb:flatbuffers.ByteBuffer, obj?:Bone):Bone {
  return (obj || new Bone()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsBone(bb:flatbuffers.ByteBuffer, obj?:Bone):Bone {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new Bone()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

bodyPart():BodyPart {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : BodyPart.NONE;
}

/**
 * The global rotation of the bone.
 *
 * Note that the identity rotation is where a bone's tail is towards -y (assuming
 * the head of the bone is the origin)
 */
rotationG(obj?:Quat):Quat|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? (obj || new Quat()).__init(this.bb_pos + offset, this.bb!) : null;
}

boneLength():number {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? this.bb!.readFloat32(this.bb_pos + offset) : 0.0;
}

/**
 * The global position of the head of this bone.
 *
 * The head of a bone is joint/node of the bone touching the parent bone. The
 * parent is defined as the bone closer to the HMD.
 */
headPositionG(obj?:Vec3f):Vec3f|null {
  const offset = this.bb!.__offset(this.bb_pos, 10);
  return offset ? (obj || new Vec3f()).__init(this.bb_pos + offset, this.bb!) : null;
}

static startBone(builder:flatbuffers.Builder) {
  builder.startObject(4);
}

static addBodyPart(builder:flatbuffers.Builder, bodyPart:BodyPart) {
  builder.addFieldInt8(0, bodyPart, BodyPart.NONE);
}

static addRotationG(builder:flatbuffers.Builder, rotationGOffset:flatbuffers.Offset) {
  builder.addFieldStruct(1, rotationGOffset, 0);
}

static addBoneLength(builder:flatbuffers.Builder, boneLength:number) {
  builder.addFieldFloat32(2, boneLength, 0.0);
}

static addHeadPositionG(builder:flatbuffers.Builder, headPositionGOffset:flatbuffers.Offset) {
  builder.addFieldStruct(3, headPositionGOffset, 0);
}

static endBone(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}


unpack(): BoneT {
  return new BoneT(
    this.bodyPart(),
    (this.rotationG() !== null ? this.rotationG()!.unpack() : null),
    this.boneLength(),
    (this.headPositionG() !== null ? this.headPositionG()!.unpack() : null)
  );
}


unpackTo(_o: BoneT): void {
  _o.bodyPart = this.bodyPart();
  _o.rotationG = (this.rotationG() !== null ? this.rotationG()!.unpack() : null);
  _o.boneLength = this.boneLength();
  _o.headPositionG = (this.headPositionG() !== null ? this.headPositionG()!.unpack() : null);
}
}

export class BoneT {
constructor(
  public bodyPart: BodyPart = BodyPart.NONE,
  public rotationG: QuatT|null = null,
  public boneLength: number = 0.0,
  public headPositionG: Vec3fT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  Bone.startBone(builder);
  Bone.addBodyPart(builder, this.bodyPart);
  Bone.addRotationG(builder, (this.rotationG !== null ? this.rotationG!.pack(builder) : 0));
  Bone.addBoneLength(builder, this.boneLength);
  Bone.addHeadPositionG(builder, (this.headPositionG !== null ? this.headPositionG!.pack(builder) : 0));

  return Bone.endBone(builder);
}
}
