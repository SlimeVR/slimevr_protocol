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
pub enum DataFeedUpdateOffset {}
#[derive(Copy, Clone, PartialEq)]

/// All of the data components related to a single data feed. A data feed is comprised
/// of device data, and tracker data.
///
/// A data feed might send data only when it changes/updates, and we should make no
/// assumptions that the data is actually delivered. If you want to guarantee
/// delivery and avoid dropped observations of data (such as a user-initiated
/// button press), it is better to use the RPC system.
pub struct DataFeedUpdate<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for DataFeedUpdate<'a> {
  type Inner = DataFeedUpdate<'a>;
  #[inline]
  fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table { buf, loc } }
  }
}

impl<'a> DataFeedUpdate<'a> {
  pub const VT_DEVICES: flatbuffers::VOffsetT = 4;
  pub const VT_SYNTHETIC_TRACKERS: flatbuffers::VOffsetT = 6;
  pub const VT_BONES: flatbuffers::VOffsetT = 8;

  #[inline]
  pub fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    DataFeedUpdate { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args DataFeedUpdateArgs<'args>
  ) -> flatbuffers::WIPOffset<DataFeedUpdate<'bldr>> {
    let mut builder = DataFeedUpdateBuilder::new(_fbb);
    if let Some(x) = args.bones { builder.add_bones(x); }
    if let Some(x) = args.synthetic_trackers { builder.add_synthetic_trackers(x); }
    if let Some(x) = args.devices { builder.add_devices(x); }
    builder.finish()
  }


  #[inline]
  pub fn devices(&self) -> Option<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<device_data::DeviceData<'a>>>> {
    self._tab.get::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<device_data::DeviceData>>>>(DataFeedUpdate::VT_DEVICES, None)
  }
  #[inline]
  pub fn synthetic_trackers(&self) -> Option<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<tracker::TrackerData<'a>>>> {
    self._tab.get::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<tracker::TrackerData>>>>(DataFeedUpdate::VT_SYNTHETIC_TRACKERS, None)
  }
  /// This must represent a set, where there is no more than one bone for a `BodyPart`.
  #[inline]
  pub fn bones(&self) -> Option<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<Bone<'a>>>> {
    self._tab.get::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<Bone>>>>(DataFeedUpdate::VT_BONES, None)
  }
}

impl flatbuffers::Verifiable for DataFeedUpdate<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'_, flatbuffers::ForwardsUOffset<device_data::DeviceData>>>>("devices", Self::VT_DEVICES, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'_, flatbuffers::ForwardsUOffset<tracker::TrackerData>>>>("synthetic_trackers", Self::VT_SYNTHETIC_TRACKERS, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'_, flatbuffers::ForwardsUOffset<Bone>>>>("bones", Self::VT_BONES, false)?
     .finish();
    Ok(())
  }
}
pub struct DataFeedUpdateArgs<'a> {
    pub devices: Option<flatbuffers::WIPOffset<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<device_data::DeviceData<'a>>>>>,
    pub synthetic_trackers: Option<flatbuffers::WIPOffset<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<tracker::TrackerData<'a>>>>>,
    pub bones: Option<flatbuffers::WIPOffset<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<Bone<'a>>>>>,
}
impl<'a> Default for DataFeedUpdateArgs<'a> {
  #[inline]
  fn default() -> Self {
    DataFeedUpdateArgs {
      devices: None,
      synthetic_trackers: None,
      bones: None,
    }
  }
}

pub struct DataFeedUpdateBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> DataFeedUpdateBuilder<'a, 'b> {
  #[inline]
  pub fn add_devices(&mut self, devices: flatbuffers::WIPOffset<flatbuffers::Vector<'b , flatbuffers::ForwardsUOffset<device_data::DeviceData<'b >>>>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(DataFeedUpdate::VT_DEVICES, devices);
  }
  #[inline]
  pub fn add_synthetic_trackers(&mut self, synthetic_trackers: flatbuffers::WIPOffset<flatbuffers::Vector<'b , flatbuffers::ForwardsUOffset<tracker::TrackerData<'b >>>>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(DataFeedUpdate::VT_SYNTHETIC_TRACKERS, synthetic_trackers);
  }
  #[inline]
  pub fn add_bones(&mut self, bones: flatbuffers::WIPOffset<flatbuffers::Vector<'b , flatbuffers::ForwardsUOffset<Bone<'b >>>>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(DataFeedUpdate::VT_BONES, bones);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> DataFeedUpdateBuilder<'a, 'b> {
    let start = _fbb.start_table();
    DataFeedUpdateBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<DataFeedUpdate<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for DataFeedUpdate<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("DataFeedUpdate");
      ds.field("devices", &self.devices());
      ds.field("synthetic_trackers", &self.synthetic_trackers());
      ds.field("bones", &self.bones());
      ds.finish()
  }
}
