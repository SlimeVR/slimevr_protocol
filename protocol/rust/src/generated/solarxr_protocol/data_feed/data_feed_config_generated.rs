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
pub enum DataFeedConfigOffset {}
#[derive(Copy, Clone, PartialEq)]

/// All information related to the configuration of a data feed. This may be sent
/// as part of a `StartFeed`.
pub struct DataFeedConfig<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for DataFeedConfig<'a> {
  type Inner = DataFeedConfig<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> DataFeedConfig<'a> {
  pub const VT_MINIMUM_TIME_SINCE_LAST: flatbuffers::VOffsetT = 4;
  pub const VT_DATA_MASK: flatbuffers::VOffsetT = 6;
  pub const VT_SYNTHETIC_TRACKERS_MASK: flatbuffers::VOffsetT = 8;
  pub const VT_BONE_MASK: flatbuffers::VOffsetT = 10;

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    DataFeedConfig { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args DataFeedConfigArgs<'args>
  ) -> flatbuffers::WIPOffset<DataFeedConfig<'bldr>> {
    let mut builder = DataFeedConfigBuilder::new(_fbb);
    if let Some(x) = args.synthetic_trackers_mask { builder.add_synthetic_trackers_mask(x); }
    if let Some(x) = args.data_mask { builder.add_data_mask(x); }
    builder.add_minimum_time_since_last(args.minimum_time_since_last);
    builder.add_bone_mask(args.bone_mask);
    builder.finish()
  }


  /// Minimum delay in milliseconds between new data updates. This value will be
  /// ignored when used for a `PollDataFeed`.
  #[inline]
  pub fn minimum_time_since_last(&self) -> u16 {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<u16>(DataFeedConfig::VT_MINIMUM_TIME_SINCE_LAST, Some(0)).unwrap()}
  }
  #[inline]
  pub fn data_mask(&self) -> Option<device_data::DeviceDataMask<'a>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<device_data::DeviceDataMask>>(DataFeedConfig::VT_DATA_MASK, None)}
  }
  #[inline]
  pub fn synthetic_trackers_mask(&self) -> Option<tracker::TrackerDataMask<'a>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<tracker::TrackerDataMask>>(DataFeedConfig::VT_SYNTHETIC_TRACKERS_MASK, None)}
  }
  #[inline]
  pub fn bone_mask(&self) -> bool {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<bool>(DataFeedConfig::VT_BONE_MASK, Some(false)).unwrap()}
  }
}

impl flatbuffers::Verifiable for DataFeedConfig<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<u16>("minimum_time_since_last", Self::VT_MINIMUM_TIME_SINCE_LAST, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<device_data::DeviceDataMask>>("data_mask", Self::VT_DATA_MASK, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<tracker::TrackerDataMask>>("synthetic_trackers_mask", Self::VT_SYNTHETIC_TRACKERS_MASK, false)?
     .visit_field::<bool>("bone_mask", Self::VT_BONE_MASK, false)?
     .finish();
    Ok(())
  }
}
pub struct DataFeedConfigArgs<'a> {
    pub minimum_time_since_last: u16,
    pub data_mask: Option<flatbuffers::WIPOffset<device_data::DeviceDataMask<'a>>>,
    pub synthetic_trackers_mask: Option<flatbuffers::WIPOffset<tracker::TrackerDataMask<'a>>>,
    pub bone_mask: bool,
}
impl<'a> Default for DataFeedConfigArgs<'a> {
  #[inline]
  fn default() -> Self {
    DataFeedConfigArgs {
      minimum_time_since_last: 0,
      data_mask: None,
      synthetic_trackers_mask: None,
      bone_mask: false,
    }
  }
}

pub struct DataFeedConfigBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> DataFeedConfigBuilder<'a, 'b> {
  #[inline]
  pub fn add_minimum_time_since_last(&mut self, minimum_time_since_last: u16) {
    self.fbb_.push_slot::<u16>(DataFeedConfig::VT_MINIMUM_TIME_SINCE_LAST, minimum_time_since_last, 0);
  }
  #[inline]
  pub fn add_data_mask(&mut self, data_mask: flatbuffers::WIPOffset<device_data::DeviceDataMask<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<device_data::DeviceDataMask>>(DataFeedConfig::VT_DATA_MASK, data_mask);
  }
  #[inline]
  pub fn add_synthetic_trackers_mask(&mut self, synthetic_trackers_mask: flatbuffers::WIPOffset<tracker::TrackerDataMask<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<tracker::TrackerDataMask>>(DataFeedConfig::VT_SYNTHETIC_TRACKERS_MASK, synthetic_trackers_mask);
  }
  #[inline]
  pub fn add_bone_mask(&mut self, bone_mask: bool) {
    self.fbb_.push_slot::<bool>(DataFeedConfig::VT_BONE_MASK, bone_mask, false);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> DataFeedConfigBuilder<'a, 'b> {
    let start = _fbb.start_table();
    DataFeedConfigBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<DataFeedConfig<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for DataFeedConfig<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("DataFeedConfig");
      ds.field("minimum_time_since_last", &self.minimum_time_since_last());
      ds.field("data_mask", &self.data_mask());
      ds.field("synthetic_trackers_mask", &self.synthetic_trackers_mask());
      ds.field("bone_mask", &self.bone_mask());
      ds.finish()
  }
}
