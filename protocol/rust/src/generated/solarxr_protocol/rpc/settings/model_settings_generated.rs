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
pub enum ModelSettingsOffset {}
#[derive(Copy, Clone, PartialEq)]

/// Settings for the skeletal model.
pub struct ModelSettings<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for ModelSettings<'a> {
  type Inner = ModelSettings<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> ModelSettings<'a> {
  pub const VT_TOGGLES: flatbuffers::VOffsetT = 4;
  pub const VT_RATIOS: flatbuffers::VOffsetT = 6;
  pub const VT_LEG_TWEAKS: flatbuffers::VOffsetT = 8;
  pub const VT_SKELETON_HEIGHT: flatbuffers::VOffsetT = 10;

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    ModelSettings { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args ModelSettingsArgs<'args>
  ) -> flatbuffers::WIPOffset<ModelSettings<'bldr>> {
    let mut builder = ModelSettingsBuilder::new(_fbb);
    if let Some(x) = args.skeleton_height { builder.add_skeleton_height(x); }
    if let Some(x) = args.leg_tweaks { builder.add_leg_tweaks(x); }
    if let Some(x) = args.ratios { builder.add_ratios(x); }
    if let Some(x) = args.toggles { builder.add_toggles(x); }
    builder.finish()
  }


  #[inline]
  pub fn toggles(&self) -> Option<ModelToggles<'a>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<ModelToggles>>(ModelSettings::VT_TOGGLES, None)}
  }
  #[inline]
  pub fn ratios(&self) -> Option<ModelRatios<'a>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<ModelRatios>>(ModelSettings::VT_RATIOS, None)}
  }
  #[inline]
  pub fn leg_tweaks(&self) -> Option<LegTweaksSettings<'a>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<LegTweaksSettings>>(ModelSettings::VT_LEG_TWEAKS, None)}
  }
  #[inline]
  pub fn skeleton_height(&self) -> Option<SkeletonHeight<'a>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<SkeletonHeight>>(ModelSettings::VT_SKELETON_HEIGHT, None)}
  }
}

impl flatbuffers::Verifiable for ModelSettings<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<flatbuffers::ForwardsUOffset<ModelToggles>>("toggles", Self::VT_TOGGLES, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<ModelRatios>>("ratios", Self::VT_RATIOS, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<LegTweaksSettings>>("leg_tweaks", Self::VT_LEG_TWEAKS, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<SkeletonHeight>>("skeleton_height", Self::VT_SKELETON_HEIGHT, false)?
     .finish();
    Ok(())
  }
}
pub struct ModelSettingsArgs<'a> {
    pub toggles: Option<flatbuffers::WIPOffset<ModelToggles<'a>>>,
    pub ratios: Option<flatbuffers::WIPOffset<ModelRatios<'a>>>,
    pub leg_tweaks: Option<flatbuffers::WIPOffset<LegTweaksSettings<'a>>>,
    pub skeleton_height: Option<flatbuffers::WIPOffset<SkeletonHeight<'a>>>,
}
impl<'a> Default for ModelSettingsArgs<'a> {
  #[inline]
  fn default() -> Self {
    ModelSettingsArgs {
      toggles: None,
      ratios: None,
      leg_tweaks: None,
      skeleton_height: None,
    }
  }
}

pub struct ModelSettingsBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> ModelSettingsBuilder<'a, 'b> {
  #[inline]
  pub fn add_toggles(&mut self, toggles: flatbuffers::WIPOffset<ModelToggles<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<ModelToggles>>(ModelSettings::VT_TOGGLES, toggles);
  }
  #[inline]
  pub fn add_ratios(&mut self, ratios: flatbuffers::WIPOffset<ModelRatios<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<ModelRatios>>(ModelSettings::VT_RATIOS, ratios);
  }
  #[inline]
  pub fn add_leg_tweaks(&mut self, leg_tweaks: flatbuffers::WIPOffset<LegTweaksSettings<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<LegTweaksSettings>>(ModelSettings::VT_LEG_TWEAKS, leg_tweaks);
  }
  #[inline]
  pub fn add_skeleton_height(&mut self, skeleton_height: flatbuffers::WIPOffset<SkeletonHeight<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<SkeletonHeight>>(ModelSettings::VT_SKELETON_HEIGHT, skeleton_height);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> ModelSettingsBuilder<'a, 'b> {
    let start = _fbb.start_table();
    ModelSettingsBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<ModelSettings<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for ModelSettings<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("ModelSettings");
      ds.field("toggles", &self.toggles());
      ds.field("ratios", &self.ratios());
      ds.field("leg_tweaks", &self.leg_tweaks());
      ds.field("skeleton_height", &self.skeleton_height());
      ds.finish()
  }
}
