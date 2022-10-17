// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class IPAddress {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):IPAddress {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

addr():number {
  return this.bb!.readUint32(this.bb_pos);
}

static sizeOf():number {
  return 4;
}

static createIPAddress(builder:flatbuffers.Builder, addr: number):flatbuffers.Offset {
  builder.prep(4, 4);
  builder.writeInt32(addr);
  return builder.offset();
}


unpack(): IPAddressT {
  return new IPAddressT(
    this.addr()
  );
}


unpackTo(_o: IPAddressT): void {
  _o.addr = this.addr();
}
}

export class IPAddressT {
constructor(
  public addr: number = 0
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return IPAddress.createIPAddress(builder,
    this.addr
  );
}
}
