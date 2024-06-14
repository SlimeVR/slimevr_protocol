// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class ResetsSettings : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : ResetsSettings {
        __init(_i, _bb)
        return this
    }
    val resetMountingFeet : Boolean
        get() {
            val o = __offset(4)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    val armsMountingResetMode : UByte
        get() {
            val o = __offset(6)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else 0u
        }
    val yawResetSmoothTime : Float
        get() {
            val o = __offset(8)
            return if(o != 0) bb.getFloat(o + bb_pos) else 0.0f
        }
    val saveMountingReset : Boolean
        get() {
            val o = __offset(10)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    val resetHmdPitch : Boolean
        get() {
            val o = __offset(12)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsResetsSettings(_bb: ByteBuffer): ResetsSettings = getRootAsResetsSettings(_bb, ResetsSettings())
        @JvmStatic
        fun getRootAsResetsSettings(_bb: ByteBuffer, obj: ResetsSettings): ResetsSettings {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createResetsSettings(builder: FlatBufferBuilder, resetMountingFeet: Boolean, armsMountingResetMode: UByte, yawResetSmoothTime: Float, saveMountingReset: Boolean, resetHmdPitch: Boolean) : Int {
            builder.startTable(5)
            addYawResetSmoothTime(builder, yawResetSmoothTime)
            addResetHmdPitch(builder, resetHmdPitch)
            addSaveMountingReset(builder, saveMountingReset)
            addArmsMountingResetMode(builder, armsMountingResetMode)
            addResetMountingFeet(builder, resetMountingFeet)
            return endResetsSettings(builder)
        }
        @JvmStatic
        fun startResetsSettings(builder: FlatBufferBuilder) = builder.startTable(5)
        @JvmStatic
        fun addResetMountingFeet(builder: FlatBufferBuilder, resetMountingFeet: Boolean) = builder.addBoolean(0, resetMountingFeet, false)
        @JvmStatic
        fun addArmsMountingResetMode(builder: FlatBufferBuilder, armsMountingResetMode: UByte) = builder.addByte(1, armsMountingResetMode.toByte(), 0)
        @JvmStatic
        fun addYawResetSmoothTime(builder: FlatBufferBuilder, yawResetSmoothTime: Float) = builder.addFloat(2, yawResetSmoothTime, 0.0)
        @JvmStatic
        fun addSaveMountingReset(builder: FlatBufferBuilder, saveMountingReset: Boolean) = builder.addBoolean(3, saveMountingReset, false)
        @JvmStatic
        fun addResetHmdPitch(builder: FlatBufferBuilder, resetHmdPitch: Boolean) = builder.addBoolean(4, resetHmdPitch, false)
        @JvmStatic
        fun endResetsSettings(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
