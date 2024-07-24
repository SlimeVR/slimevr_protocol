// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc.settings

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class SkeletonHeight : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : SkeletonHeight {
        __init(_i, _bb)
        return this
    }
    val hmdHeight : Float?
        get() {
            val o = __offset(4)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    val floorHeight : Float?
        get() {
            val o = __offset(6)
            return if(o != 0) bb.getFloat(o + bb_pos) else null
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsSkeletonHeight(_bb: ByteBuffer): SkeletonHeight = getRootAsSkeletonHeight(_bb, SkeletonHeight())
        @JvmStatic
        fun getRootAsSkeletonHeight(_bb: ByteBuffer, obj: SkeletonHeight): SkeletonHeight {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createSkeletonHeight(builder: FlatBufferBuilder, hmdHeight: Float?, floorHeight: Float?) : Int {
            builder.startTable(2)
            floorHeight?.run { addFloorHeight(builder, floorHeight) }
            hmdHeight?.run { addHmdHeight(builder, hmdHeight) }
            return endSkeletonHeight(builder)
        }
        @JvmStatic
        fun startSkeletonHeight(builder: FlatBufferBuilder) = builder.startTable(2)
        @JvmStatic
        fun addHmdHeight(builder: FlatBufferBuilder, hmdHeight: Float) = builder.addFloat(0, hmdHeight, 0.0)
        @JvmStatic
        fun addFloorHeight(builder: FlatBufferBuilder, floorHeight: Float) = builder.addFloat(1, floorHeight, 0.0)
        @JvmStatic
        fun endSkeletonHeight(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
