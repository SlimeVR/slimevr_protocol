// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class HeartbeatRequest {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):HeartbeatRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsHeartbeatRequest(bb:flatbuffers.ByteBuffer, obj?:HeartbeatRequest):HeartbeatRequest {
  return (obj || new HeartbeatRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsHeartbeatRequest(bb:flatbuffers.ByteBuffer, obj?:HeartbeatRequest):HeartbeatRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new HeartbeatRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static startHeartbeatRequest(builder:flatbuffers.Builder) {
  builder.startObject(0);
}

static endHeartbeatRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createHeartbeatRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  HeartbeatRequest.startHeartbeatRequest(builder);
  return HeartbeatRequest.endHeartbeatRequest(builder);
}

unpack(): HeartbeatRequestT {
  return new HeartbeatRequestT();
}


unpackTo(_o: HeartbeatRequestT): void {}
}

export class HeartbeatRequestT {
constructor(){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return HeartbeatRequest.createHeartbeatRequest(builder);
}
}
