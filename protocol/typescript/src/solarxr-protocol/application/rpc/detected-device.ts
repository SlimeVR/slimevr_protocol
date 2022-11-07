// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { HardwareAddress, HardwareAddressT } from '../../../solarxr-protocol/datatypes/hardware-info/hardware-address';
import { PairingInfo, PairingInfoT } from '../../../solarxr-protocol/device/pairing/pairing-info';


export class DetectedDevice {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):DetectedDevice {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsDetectedDevice(bb:flatbuffers.ByteBuffer, obj?:DetectedDevice):DetectedDevice {
  return (obj || new DetectedDevice()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsDetectedDevice(bb:flatbuffers.ByteBuffer, obj?:DetectedDevice):DetectedDevice {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new DetectedDevice()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

infos(obj?:PairingInfo):PairingInfo|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new PairingInfo()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

macAddress(obj?:HardwareAddress):HardwareAddress|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? (obj || new HardwareAddress()).__init(this.bb_pos + offset, this.bb!) : null;
}

static startDetectedDevice(builder:flatbuffers.Builder) {
  builder.startObject(2);
}

static addInfos(builder:flatbuffers.Builder, infosOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, infosOffset, 0);
}

static addMacAddress(builder:flatbuffers.Builder, macAddressOffset:flatbuffers.Offset) {
  builder.addFieldStruct(1, macAddressOffset, 0);
}

static endDetectedDevice(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}


unpack(): DetectedDeviceT {
  return new DetectedDeviceT(
    (this.infos() !== null ? this.infos()!.unpack() : null),
    (this.macAddress() !== null ? this.macAddress()!.unpack() : null)
  );
}


unpackTo(_o: DetectedDeviceT): void {
  _o.infos = (this.infos() !== null ? this.infos()!.unpack() : null);
  _o.macAddress = (this.macAddress() !== null ? this.macAddress()!.unpack() : null);
}
}

export class DetectedDeviceT {
constructor(
  public infos: PairingInfoT|null = null,
  public macAddress: HardwareAddressT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const infos = (this.infos !== null ? this.infos!.pack(builder) : 0);

  DetectedDevice.startDetectedDevice(builder);
  DetectedDevice.addInfos(builder, infos);
  DetectedDevice.addMacAddress(builder, (this.macAddress !== null ? this.macAddress!.pack(builder) : 0));

  return DetectedDevice.endDetectedDevice(builder);
}
}