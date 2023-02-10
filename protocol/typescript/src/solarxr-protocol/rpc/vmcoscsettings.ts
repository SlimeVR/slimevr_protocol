// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { OSCSettings, OSCSettingsT } from '../../solarxr-protocol/rpc/oscsettings.js';


/**
 * OSC Settings specific to VMC
 */
export class VMCOSCSettings implements flatbuffers.IUnpackableObject<VMCOSCSettingsT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):VMCOSCSettings {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsVMCOSCSettings(bb:flatbuffers.ByteBuffer, obj?:VMCOSCSettings):VMCOSCSettings {
  return (obj || new VMCOSCSettings()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsVMCOSCSettings(bb:flatbuffers.ByteBuffer, obj?:VMCOSCSettings):VMCOSCSettings {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new VMCOSCSettings()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

oscSettings(obj?:OSCSettings):OSCSettings|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new OSCSettings()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

vrmAddress():string|null
vrmAddress(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
vrmAddress(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

anchorHip():boolean {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : false;
}

static startVMCOSCSettings(builder:flatbuffers.Builder) {
  builder.startObject(3);
}

static addOscSettings(builder:flatbuffers.Builder, oscSettingsOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, oscSettingsOffset, 0);
}

static addVrmAddress(builder:flatbuffers.Builder, vrmAddressOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, vrmAddressOffset, 0);
}

static addAnchorHip(builder:flatbuffers.Builder, anchorHip:boolean) {
  builder.addFieldInt8(2, +anchorHip, +false);
}

static endVMCOSCSettings(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createVMCOSCSettings(builder:flatbuffers.Builder, oscSettingsOffset:flatbuffers.Offset, vrmAddressOffset:flatbuffers.Offset, anchorHip:boolean):flatbuffers.Offset {
  VMCOSCSettings.startVMCOSCSettings(builder);
  VMCOSCSettings.addOscSettings(builder, oscSettingsOffset);
  VMCOSCSettings.addVrmAddress(builder, vrmAddressOffset);
  VMCOSCSettings.addAnchorHip(builder, anchorHip);
  return VMCOSCSettings.endVMCOSCSettings(builder);
}

unpack(): VMCOSCSettingsT {
  return new VMCOSCSettingsT(
    (this.oscSettings() !== null ? this.oscSettings()!.unpack() : null),
    this.vrmAddress(),
    this.anchorHip()
  );
}


unpackTo(_o: VMCOSCSettingsT): void {
  _o.oscSettings = (this.oscSettings() !== null ? this.oscSettings()!.unpack() : null);
  _o.vrmAddress = this.vrmAddress();
  _o.anchorHip = this.anchorHip();
}
}

export class VMCOSCSettingsT implements flatbuffers.IGeneratedObject {
constructor(
  public oscSettings: OSCSettingsT|null = null,
  public vrmAddress: string|Uint8Array|null = null,
  public anchorHip: boolean = false
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const oscSettings = (this.oscSettings !== null ? this.oscSettings!.pack(builder) : 0);
  const vrmAddress = (this.vrmAddress !== null ? builder.createString(this.vrmAddress!) : 0);

  return VMCOSCSettings.createVMCOSCSettings(builder,
    oscSettings,
    vrmAddress,
    this.anchorHip
  );
}
}
