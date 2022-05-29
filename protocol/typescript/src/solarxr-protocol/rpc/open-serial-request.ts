// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class OpenSerialRequest {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):OpenSerialRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsOpenSerialRequest(bb:flatbuffers.ByteBuffer, obj?:OpenSerialRequest):OpenSerialRequest {
  return (obj || new OpenSerialRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsOpenSerialRequest(bb:flatbuffers.ByteBuffer, obj?:OpenSerialRequest):OpenSerialRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new OpenSerialRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

/**
 * rts: Status of the Serial Line "Request to Send" datapin cached. On Dev-Boards used for RST or Flash Pin
 * dtr: Status of the Serial Line "Data Terminal Ready" datapin cached. On Dev-Boards used for RST or Flash Pin
 */
rts():boolean {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : false;
}

dtr():boolean {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : false;
}

static startOpenSerialRequest(builder:flatbuffers.Builder) {
  builder.startObject(2);
}

static addRts(builder:flatbuffers.Builder, rts:boolean) {
  builder.addFieldInt8(0, +rts, +false);
}

static addDtr(builder:flatbuffers.Builder, dtr:boolean) {
  builder.addFieldInt8(1, +dtr, +false);
}

static endOpenSerialRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createOpenSerialRequest(builder:flatbuffers.Builder, rts:boolean, dtr:boolean):flatbuffers.Offset {
  OpenSerialRequest.startOpenSerialRequest(builder);
  OpenSerialRequest.addRts(builder, rts);
  OpenSerialRequest.addDtr(builder, dtr);
  return OpenSerialRequest.endOpenSerialRequest(builder);
}

unpack(): OpenSerialRequestT {
  return new OpenSerialRequestT(
    this.rts(),
    this.dtr()
  );
}


unpackTo(_o: OpenSerialRequestT): void {
  _o.rts = this.rts();
  _o.dtr = this.dtr();
}
}

export class OpenSerialRequestT {
constructor(
  public rts: boolean = false,
  public dtr: boolean = false
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return OpenSerialRequest.createOpenSerialRequest(builder,
    this.rts,
    this.dtr
  );
}
}
