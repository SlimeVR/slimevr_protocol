// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { AutoBoneProcessType } from '../../solarxr-protocol/rpc/auto-bone-process-type';


export class AutoBoneProcessRequest {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):AutoBoneProcessRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsAutoBoneProcessRequest(bb:flatbuffers.ByteBuffer, obj?:AutoBoneProcessRequest):AutoBoneProcessRequest {
  return (obj || new AutoBoneProcessRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsAutoBoneProcessRequest(bb:flatbuffers.ByteBuffer, obj?:AutoBoneProcessRequest):AutoBoneProcessRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new AutoBoneProcessRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

processType():AutoBoneProcessType {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : AutoBoneProcessType.RECORD;
}

static startAutoBoneProcessRequest(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addProcessType(builder:flatbuffers.Builder, processType:AutoBoneProcessType) {
  builder.addFieldInt8(0, processType, AutoBoneProcessType.RECORD);
}

static endAutoBoneProcessRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createAutoBoneProcessRequest(builder:flatbuffers.Builder, processType:AutoBoneProcessType):flatbuffers.Offset {
  AutoBoneProcessRequest.startAutoBoneProcessRequest(builder);
  AutoBoneProcessRequest.addProcessType(builder, processType);
  return AutoBoneProcessRequest.endAutoBoneProcessRequest(builder);
}

unpack(): AutoBoneProcessRequestT {
  return new AutoBoneProcessRequestT(
    this.processType()
  );
}


unpackTo(_o: AutoBoneProcessRequestT): void {
  _o.processType = this.processType();
}
}

export class AutoBoneProcessRequestT {
constructor(
  public processType: AutoBoneProcessType = AutoBoneProcessType.RECORD
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return AutoBoneProcessRequest.createAutoBoneProcessRequest(builder,
    this.processType
  );
}
}
