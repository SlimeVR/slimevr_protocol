// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { DeviceInfo, DeviceInfoT } from '../../slimevr-protocol/hardware-info/device-info';


export class HandshakeRequest {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):HandshakeRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsHandshakeRequest(bb:flatbuffers.ByteBuffer, obj?:HandshakeRequest):HandshakeRequest {
  return (obj || new HandshakeRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsHandshakeRequest(bb:flatbuffers.ByteBuffer, obj?:HandshakeRequest):HandshakeRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new HandshakeRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

deviceInfo(obj?:DeviceInfo):DeviceInfo|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new DeviceInfo()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

static startHandshakeRequest(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addDeviceInfo(builder:flatbuffers.Builder, deviceInfoOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, deviceInfoOffset, 0);
}

static endHandshakeRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createHandshakeRequest(builder:flatbuffers.Builder, deviceInfoOffset:flatbuffers.Offset):flatbuffers.Offset {
  HandshakeRequest.startHandshakeRequest(builder);
  HandshakeRequest.addDeviceInfo(builder, deviceInfoOffset);
  return HandshakeRequest.endHandshakeRequest(builder);
}

unpack(): HandshakeRequestT {
  return new HandshakeRequestT(
    (this.deviceInfo() !== null ? this.deviceInfo()!.unpack() : null)
  );
}


unpackTo(_o: HandshakeRequestT): void {
  _o.deviceInfo = (this.deviceInfo() !== null ? this.deviceInfo()!.unpack() : null);
}
}

export class HandshakeRequestT {
constructor(
  public deviceInfo: DeviceInfoT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const deviceInfo = (this.deviceInfo !== null ? this.deviceInfo!.pack(builder) : 0);

  return HandshakeRequest.createHandshakeRequest(builder,
    deviceInfo
  );
}
}
