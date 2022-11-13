// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class Bytes implements flatbuffers.IUnpackableObject<BytesT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):Bytes {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsBytes(bb:flatbuffers.ByteBuffer, obj?:Bytes):Bytes {
  return (obj || new Bytes()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsBytes(bb:flatbuffers.ByteBuffer, obj?:Bytes):Bytes {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new Bytes()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

b(index: number):number|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint8(this.bb!.__vector(this.bb_pos + offset) + index) : 0;
}

bLength():number {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.__vector_len(this.bb_pos + offset) : 0;
}

bArray():Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? new Uint8Array(this.bb!.bytes().buffer, this.bb!.bytes().byteOffset + this.bb!.__vector(this.bb_pos + offset), this.bb!.__vector_len(this.bb_pos + offset)) : null;
}

static startBytes(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addB(builder:flatbuffers.Builder, bOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, bOffset, 0);
}

static createBVector(builder:flatbuffers.Builder, data:number[]|Uint8Array):flatbuffers.Offset {
  builder.startVector(1, data.length, 1);
  for (let i = data.length - 1; i >= 0; i--) {
    builder.addInt8(data[i]!);
  }
  return builder.endVector();
}

static startBVector(builder:flatbuffers.Builder, numElems:number) {
  builder.startVector(1, numElems, 1);
}

static endBytes(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createBytes(builder:flatbuffers.Builder, bOffset:flatbuffers.Offset):flatbuffers.Offset {
  Bytes.startBytes(builder);
  Bytes.addB(builder, bOffset);
  return Bytes.endBytes(builder);
}

unpack(): BytesT {
  return new BytesT(
    this.bb!.createScalarList<number>(this.b.bind(this), this.bLength())
  );
}


unpackTo(_o: BytesT): void {
  _o.b = this.bb!.createScalarList<number>(this.b.bind(this), this.bLength());
}
}

export class BytesT implements flatbuffers.IGeneratedObject {
constructor(
  public b: (number)[] = []
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const b = Bytes.createBVector(builder, this.b);

  return Bytes.createBytes(builder,
    b
  );
}
}
