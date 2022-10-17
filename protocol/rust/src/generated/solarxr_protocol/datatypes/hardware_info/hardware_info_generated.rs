// automatically generated by the FlatBuffers compiler, do not modify
extern crate alloc;
extern crate flatbuffers;
use alloc::boxed::Box;
use alloc::string::{String, ToString};
use alloc::vec::Vec;
use core::mem;
use core::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
pub enum HardwareInfoOffset {}
#[derive(Copy, Clone, PartialEq)]

/// Mostly static info about the device's hardware/firmware.
pub struct HardwareInfo<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for HardwareInfo<'a> {
  type Inner = HardwareInfo<'a>;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table { buf, loc } }
  }
}

impl<'a> HardwareInfo<'a> {
  pub const VT_MCU_ID: flatbuffers::VOffsetT = 4;
  pub const VT_DISPLAY_NAME: flatbuffers::VOffsetT = 6;
  pub const VT_MODEL: flatbuffers::VOffsetT = 8;
  pub const VT_MANUFACTURER: flatbuffers::VOffsetT = 10;
  pub const VT_HARDWARE_REVISION: flatbuffers::VOffsetT = 12;
  pub const VT_FIRMWARE_VERSION: flatbuffers::VOffsetT = 14;
  pub const VT_HARDWARE_ADDRESS: flatbuffers::VOffsetT = 16;
  pub const VT_IP_ADDRESS: flatbuffers::VOffsetT = 18;

  #[inline]
  pub fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    HardwareInfo { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args HardwareInfoArgs<'args>
  ) -> flatbuffers::WIPOffset<HardwareInfo<'bldr>> {
    let mut builder = HardwareInfoBuilder::new(_fbb);
    if let Some(x) = args.ip_address { builder.add_ip_address(x); }
    if let Some(x) = args.hardware_address { builder.add_hardware_address(x); }
    if let Some(x) = args.firmware_version { builder.add_firmware_version(x); }
    if let Some(x) = args.hardware_revision { builder.add_hardware_revision(x); }
    if let Some(x) = args.manufacturer { builder.add_manufacturer(x); }
    if let Some(x) = args.model { builder.add_model(x); }
    if let Some(x) = args.display_name { builder.add_display_name(x); }
    builder.add_mcu_id(args.mcu_id);
    builder.finish()
  }


  #[inline]
  pub fn mcu_id(&self) -> McuType {
    self._tab.get::<McuType>(HardwareInfo::VT_MCU_ID, Some(McuType::Other)).unwrap()
  }
  /// A human-friendly name to display as the name of the device.
  #[inline]
  pub fn display_name(&self) -> Option<&'a str> {
    self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(HardwareInfo::VT_DISPLAY_NAME, None)
  }
  /// A human-friendly string for the device model.
  #[inline]
  pub fn model(&self) -> Option<&'a str> {
    self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(HardwareInfo::VT_MODEL, None)
  }
  /// A human-friendly string for the manufacturer of the device.
  #[inline]
  pub fn manufacturer(&self) -> Option<&'a str> {
    self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(HardwareInfo::VT_MANUFACTURER, None)
  }
  /// The hardware version of the device. For example, pcb version.
  #[inline]
  pub fn hardware_revision(&self) -> Option<&'a str> {
    self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(HardwareInfo::VT_HARDWARE_REVISION, None)
  }
  /// The version of the slimevr firmware that the device is running.
  #[inline]
  pub fn firmware_version(&self) -> Option<&'a str> {
    self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(HardwareInfo::VT_FIRMWARE_VERSION, None)
  }
  #[inline]
  pub fn hardware_address(&self) -> Option<&'a HardwareAddress> {
    self._tab.get::<HardwareAddress>(HardwareInfo::VT_HARDWARE_ADDRESS, None)
  }
  #[inline]
  pub fn ip_address(&self) -> Option<&'a super::IPAddress> {
    self._tab.get::<super::IPAddress>(HardwareInfo::VT_IP_ADDRESS, None)
  }
}

impl flatbuffers::Verifiable for HardwareInfo<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<McuType>("mcu_id", Self::VT_MCU_ID, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("display_name", Self::VT_DISPLAY_NAME, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("model", Self::VT_MODEL, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("manufacturer", Self::VT_MANUFACTURER, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("hardware_revision", Self::VT_HARDWARE_REVISION, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("firmware_version", Self::VT_FIRMWARE_VERSION, false)?
     .visit_field::<HardwareAddress>("hardware_address", Self::VT_HARDWARE_ADDRESS, false)?
     .visit_field::<super::IPAddress>("ip_address", Self::VT_IP_ADDRESS, false)?
     .finish();
    Ok(())
  }
}
pub struct HardwareInfoArgs<'a> {
    pub mcu_id: McuType,
    pub display_name: Option<flatbuffers::WIPOffset<&'a str>>,
    pub model: Option<flatbuffers::WIPOffset<&'a str>>,
    pub manufacturer: Option<flatbuffers::WIPOffset<&'a str>>,
    pub hardware_revision: Option<flatbuffers::WIPOffset<&'a str>>,
    pub firmware_version: Option<flatbuffers::WIPOffset<&'a str>>,
    pub hardware_address: Option<&'a HardwareAddress>,
    pub ip_address: Option<&'a super::IPAddress>,
}
impl<'a> Default for HardwareInfoArgs<'a> {
  #[inline]
  fn default() -> Self {
    HardwareInfoArgs {
      mcu_id: McuType::Other,
      display_name: None,
      model: None,
      manufacturer: None,
      hardware_revision: None,
      firmware_version: None,
      hardware_address: None,
      ip_address: None,
    }
  }
}

pub struct HardwareInfoBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> HardwareInfoBuilder<'a, 'b> {
  #[inline]
  pub fn add_mcu_id(&mut self, mcu_id: McuType) {
    self.fbb_.push_slot::<McuType>(HardwareInfo::VT_MCU_ID, mcu_id, McuType::Other);
  }
  #[inline]
  pub fn add_display_name(&mut self, display_name: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(HardwareInfo::VT_DISPLAY_NAME, display_name);
  }
  #[inline]
  pub fn add_model(&mut self, model: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(HardwareInfo::VT_MODEL, model);
  }
  #[inline]
  pub fn add_manufacturer(&mut self, manufacturer: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(HardwareInfo::VT_MANUFACTURER, manufacturer);
  }
  #[inline]
  pub fn add_hardware_revision(&mut self, hardware_revision: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(HardwareInfo::VT_HARDWARE_REVISION, hardware_revision);
  }
  #[inline]
  pub fn add_firmware_version(&mut self, firmware_version: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(HardwareInfo::VT_FIRMWARE_VERSION, firmware_version);
  }
  #[inline]
  pub fn add_hardware_address(&mut self, hardware_address: &HardwareAddress) {
    self.fbb_.push_slot_always::<&HardwareAddress>(HardwareInfo::VT_HARDWARE_ADDRESS, hardware_address);
  }
  #[inline]
  pub fn add_ip_address(&mut self, ip_address: &super::IPAddress) {
    self.fbb_.push_slot_always::<&super::IPAddress>(HardwareInfo::VT_IP_ADDRESS, ip_address);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> HardwareInfoBuilder<'a, 'b> {
    let start = _fbb.start_table();
    HardwareInfoBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<HardwareInfo<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for HardwareInfo<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("HardwareInfo");
      ds.field("mcu_id", &self.mcu_id());
      ds.field("display_name", &self.display_name());
      ds.field("model", &self.model());
      ds.field("manufacturer", &self.manufacturer());
      ds.field("hardware_revision", &self.hardware_revision());
      ds.field("firmware_version", &self.firmware_version());
      ds.field("hardware_address", &self.hardware_address());
      ds.field("ip_address", &self.ip_address());
      ds.finish()
  }
}
