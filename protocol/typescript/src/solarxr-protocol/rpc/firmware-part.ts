// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class FirmwarePart implements flatbuffers.IUnpackableObject<FirmwarePartT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):FirmwarePart {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsFirmwarePart(bb:flatbuffers.ByteBuffer, obj?:FirmwarePart):FirmwarePart {
  return (obj || new FirmwarePart()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsFirmwarePart(bb:flatbuffers.ByteBuffer, obj?:FirmwarePart):FirmwarePart {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new FirmwarePart()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

/**
 * Url of the firmware bin to download
 */
url():string|null
url(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
url(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

/**
 * Offset of the firmware, used when flashing to the mcu, it indicates where to write this file in memory
 * Will be ignored in the case of OTA flashing
 */
offset():number {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.readUint32(this.bb_pos + offset) : 0;
}

static startFirmwarePart(builder:flatbuffers.Builder) {
  builder.startObject(2);
}

static addUrl(builder:flatbuffers.Builder, urlOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, urlOffset, 0);
}

static addOffset(builder:flatbuffers.Builder, offset:number) {
  builder.addFieldInt32(1, offset, 0);
}

static endFirmwarePart(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createFirmwarePart(builder:flatbuffers.Builder, urlOffset:flatbuffers.Offset, offset:number):flatbuffers.Offset {
  FirmwarePart.startFirmwarePart(builder);
  FirmwarePart.addUrl(builder, urlOffset);
  FirmwarePart.addOffset(builder, offset);
  return FirmwarePart.endFirmwarePart(builder);
}

unpack(): FirmwarePartT {
  return new FirmwarePartT(
    this.url(),
    this.offset()
  );
}


unpackTo(_o: FirmwarePartT): void {
  _o.url = this.url();
  _o.offset = this.offset();
}
}

export class FirmwarePartT implements flatbuffers.IGeneratedObject {
constructor(
  public url: string|Uint8Array|null = null,
  public offset: number = 0
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const url = (this.url !== null ? builder.createString(this.url!) : 0);

  return FirmwarePart.createFirmwarePart(builder,
    url,
    this.offset
  );
}
}