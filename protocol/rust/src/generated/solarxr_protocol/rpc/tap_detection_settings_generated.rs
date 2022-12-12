// automatically generated by the FlatBuffers compiler, do not modify
// @generated
extern crate alloc;
extern crate flatbuffers;
use alloc::boxed::Box;
use alloc::string::{String, ToString};
use alloc::vec::Vec;
use core::mem;
use core::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
pub enum TapDetectionSettingsOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct TapDetectionSettings<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for TapDetectionSettings<'a> {
  type Inner = TapDetectionSettings<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> TapDetectionSettings<'a> {
  pub const VT_TAP_RESET_DELAY: flatbuffers::VOffsetT = 4;
  pub const VT_TAP_RESET_ENABLED: flatbuffers::VOffsetT = 6;
  pub const VT_TAP_RESET_TAPS: flatbuffers::VOffsetT = 8;
  pub const VT_TAP_QUICK_RESET_DELAY: flatbuffers::VOffsetT = 10;
  pub const VT_TAP_QUICK_RESET_ENABLED: flatbuffers::VOffsetT = 12;
  pub const VT_TAP_QUICK_RESET_TAPS: flatbuffers::VOffsetT = 14;
  pub const VT_TAP_MOUNTING_RESET_DELAY: flatbuffers::VOffsetT = 16;
  pub const VT_TAP_MOUNTING_RESET_ENABLED: flatbuffers::VOffsetT = 18;
  pub const VT_TAP_MOUNTING_RESET_TAPS: flatbuffers::VOffsetT = 20;

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    TapDetectionSettings { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args TapDetectionSettingsArgs
  ) -> flatbuffers::WIPOffset<TapDetectionSettings<'bldr>> {
    let mut builder = TapDetectionSettingsBuilder::new(_fbb);
    if let Some(x) = args.tap_mounting_reset_delay { builder.add_tap_mounting_reset_delay(x); }
    if let Some(x) = args.tap_quick_reset_delay { builder.add_tap_quick_reset_delay(x); }
    if let Some(x) = args.tap_reset_delay { builder.add_tap_reset_delay(x); }
    if let Some(x) = args.tap_mounting_reset_taps { builder.add_tap_mounting_reset_taps(x); }
    if let Some(x) = args.tap_quick_reset_taps { builder.add_tap_quick_reset_taps(x); }
    if let Some(x) = args.tap_reset_taps { builder.add_tap_reset_taps(x); }
    if let Some(x) = args.tap_mounting_reset_enabled { builder.add_tap_mounting_reset_enabled(x); }
    if let Some(x) = args.tap_quick_reset_enabled { builder.add_tap_quick_reset_enabled(x); }
    if let Some(x) = args.tap_reset_enabled { builder.add_tap_reset_enabled(x); }
    builder.finish()
  }


  #[inline]
  pub fn tap_reset_delay(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(TapDetectionSettings::VT_TAP_RESET_DELAY, None)}
  }
  #[inline]
  pub fn tap_reset_enabled(&self) -> Option<bool> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(TapDetectionSettings::VT_TAP_RESET_ENABLED, None)}
  }
  #[inline]
  pub fn tap_reset_taps(&self) -> Option<u16> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<u16>(TapDetectionSettings::VT_TAP_RESET_TAPS, None)}
  }
  #[inline]
  pub fn tap_quick_reset_delay(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(TapDetectionSettings::VT_TAP_QUICK_RESET_DELAY, None)}
  }
  #[inline]
  pub fn tap_quick_reset_enabled(&self) -> Option<bool> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(TapDetectionSettings::VT_TAP_QUICK_RESET_ENABLED, None)}
  }
  #[inline]
  pub fn tap_quick_reset_taps(&self) -> Option<u16> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<u16>(TapDetectionSettings::VT_TAP_QUICK_RESET_TAPS, None)}
  }
  #[inline]
  pub fn tap_mounting_reset_delay(&self) -> Option<f32> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<f32>(TapDetectionSettings::VT_TAP_MOUNTING_RESET_DELAY, None)}
  }
  #[inline]
  pub fn tap_mounting_reset_enabled(&self) -> Option<bool> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(TapDetectionSettings::VT_TAP_MOUNTING_RESET_ENABLED, None)}
  }
  #[inline]
  pub fn tap_mounting_reset_taps(&self) -> Option<u16> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<u16>(TapDetectionSettings::VT_TAP_MOUNTING_RESET_TAPS, None)}
  }
}

impl flatbuffers::Verifiable for TapDetectionSettings<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<f32>("tap_reset_delay", Self::VT_TAP_RESET_DELAY, false)?
     .visit_field::<bool>("tap_reset_enabled", Self::VT_TAP_RESET_ENABLED, false)?
     .visit_field::<u16>("tap_reset_taps", Self::VT_TAP_RESET_TAPS, false)?
     .visit_field::<f32>("tap_quick_reset_delay", Self::VT_TAP_QUICK_RESET_DELAY, false)?
     .visit_field::<bool>("tap_quick_reset_enabled", Self::VT_TAP_QUICK_RESET_ENABLED, false)?
     .visit_field::<u16>("tap_quick_reset_taps", Self::VT_TAP_QUICK_RESET_TAPS, false)?
     .visit_field::<f32>("tap_mounting_reset_delay", Self::VT_TAP_MOUNTING_RESET_DELAY, false)?
     .visit_field::<bool>("tap_mounting_reset_enabled", Self::VT_TAP_MOUNTING_RESET_ENABLED, false)?
     .visit_field::<u16>("tap_mounting_reset_taps", Self::VT_TAP_MOUNTING_RESET_TAPS, false)?
     .finish();
    Ok(())
  }
}
pub struct TapDetectionSettingsArgs {
    pub tap_reset_delay: Option<f32>,
    pub tap_reset_enabled: Option<bool>,
    pub tap_reset_taps: Option<u16>,
    pub tap_quick_reset_delay: Option<f32>,
    pub tap_quick_reset_enabled: Option<bool>,
    pub tap_quick_reset_taps: Option<u16>,
    pub tap_mounting_reset_delay: Option<f32>,
    pub tap_mounting_reset_enabled: Option<bool>,
    pub tap_mounting_reset_taps: Option<u16>,
}
impl<'a> Default for TapDetectionSettingsArgs {
  #[inline]
  fn default() -> Self {
    TapDetectionSettingsArgs {
      tap_reset_delay: None,
      tap_reset_enabled: None,
      tap_reset_taps: None,
      tap_quick_reset_delay: None,
      tap_quick_reset_enabled: None,
      tap_quick_reset_taps: None,
      tap_mounting_reset_delay: None,
      tap_mounting_reset_enabled: None,
      tap_mounting_reset_taps: None,
    }
  }
}

pub struct TapDetectionSettingsBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> TapDetectionSettingsBuilder<'a, 'b> {
  #[inline]
  pub fn add_tap_reset_delay(&mut self, tap_reset_delay: f32) {
    self.fbb_.push_slot_always::<f32>(TapDetectionSettings::VT_TAP_RESET_DELAY, tap_reset_delay);
  }
  #[inline]
  pub fn add_tap_reset_enabled(&mut self, tap_reset_enabled: bool) {
    self.fbb_.push_slot_always::<bool>(TapDetectionSettings::VT_TAP_RESET_ENABLED, tap_reset_enabled);
  }
  #[inline]
  pub fn add_tap_reset_taps(&mut self, tap_reset_taps: u16) {
    self.fbb_.push_slot_always::<u16>(TapDetectionSettings::VT_TAP_RESET_TAPS, tap_reset_taps);
  }
  #[inline]
  pub fn add_tap_quick_reset_delay(&mut self, tap_quick_reset_delay: f32) {
    self.fbb_.push_slot_always::<f32>(TapDetectionSettings::VT_TAP_QUICK_RESET_DELAY, tap_quick_reset_delay);
  }
  #[inline]
  pub fn add_tap_quick_reset_enabled(&mut self, tap_quick_reset_enabled: bool) {
    self.fbb_.push_slot_always::<bool>(TapDetectionSettings::VT_TAP_QUICK_RESET_ENABLED, tap_quick_reset_enabled);
  }
  #[inline]
  pub fn add_tap_quick_reset_taps(&mut self, tap_quick_reset_taps: u16) {
    self.fbb_.push_slot_always::<u16>(TapDetectionSettings::VT_TAP_QUICK_RESET_TAPS, tap_quick_reset_taps);
  }
  #[inline]
  pub fn add_tap_mounting_reset_delay(&mut self, tap_mounting_reset_delay: f32) {
    self.fbb_.push_slot_always::<f32>(TapDetectionSettings::VT_TAP_MOUNTING_RESET_DELAY, tap_mounting_reset_delay);
  }
  #[inline]
  pub fn add_tap_mounting_reset_enabled(&mut self, tap_mounting_reset_enabled: bool) {
    self.fbb_.push_slot_always::<bool>(TapDetectionSettings::VT_TAP_MOUNTING_RESET_ENABLED, tap_mounting_reset_enabled);
  }
  #[inline]
  pub fn add_tap_mounting_reset_taps(&mut self, tap_mounting_reset_taps: u16) {
    self.fbb_.push_slot_always::<u16>(TapDetectionSettings::VT_TAP_MOUNTING_RESET_TAPS, tap_mounting_reset_taps);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> TapDetectionSettingsBuilder<'a, 'b> {
    let start = _fbb.start_table();
    TapDetectionSettingsBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<TapDetectionSettings<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for TapDetectionSettings<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("TapDetectionSettings");
      ds.field("tap_reset_delay", &self.tap_reset_delay());
      ds.field("tap_reset_enabled", &self.tap_reset_enabled());
      ds.field("tap_reset_taps", &self.tap_reset_taps());
      ds.field("tap_quick_reset_delay", &self.tap_quick_reset_delay());
      ds.field("tap_quick_reset_enabled", &self.tap_quick_reset_enabled());
      ds.field("tap_quick_reset_taps", &self.tap_quick_reset_taps());
      ds.field("tap_mounting_reset_delay", &self.tap_mounting_reset_delay());
      ds.field("tap_mounting_reset_enabled", &self.tap_mounting_reset_enabled());
      ds.field("tap_mounting_reset_taps", &self.tap_mounting_reset_taps());
      ds.finish()
  }
}
