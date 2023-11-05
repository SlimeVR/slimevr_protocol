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
pub enum FirmwareUpdateStopQueuesRequestOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct FirmwareUpdateStopQueuesRequest<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for FirmwareUpdateStopQueuesRequest<'a> {
  type Inner = FirmwareUpdateStopQueuesRequest<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> FirmwareUpdateStopQueuesRequest<'a> {

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    FirmwareUpdateStopQueuesRequest { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    _args: &'args FirmwareUpdateStopQueuesRequestArgs
  ) -> flatbuffers::WIPOffset<FirmwareUpdateStopQueuesRequest<'bldr>> {
    let mut builder = FirmwareUpdateStopQueuesRequestBuilder::new(_fbb);
    builder.finish()
  }

}

impl flatbuffers::Verifiable for FirmwareUpdateStopQueuesRequest<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .finish();
    Ok(())
  }
}
pub struct FirmwareUpdateStopQueuesRequestArgs {
}
impl<'a> Default for FirmwareUpdateStopQueuesRequestArgs {
  #[inline]
  fn default() -> Self {
    FirmwareUpdateStopQueuesRequestArgs {
    }
  }
}

pub struct FirmwareUpdateStopQueuesRequestBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> FirmwareUpdateStopQueuesRequestBuilder<'a, 'b> {
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> FirmwareUpdateStopQueuesRequestBuilder<'a, 'b> {
    let start = _fbb.start_table();
    FirmwareUpdateStopQueuesRequestBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<FirmwareUpdateStopQueuesRequest<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for FirmwareUpdateStopQueuesRequest<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("FirmwareUpdateStopQueuesRequest");
      ds.finish()
  }
}