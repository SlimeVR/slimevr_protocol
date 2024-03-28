// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class AddUnknownDeviceRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : AddUnknownDeviceRequest {
        __init(_i, _bb)
        return this
    }
    fun macAddress(j: Int) : String? {
        val o = __offset(4)
        return if (o != 0) {
            __string(__vector(o) + j * 4)
        } else {
            null
        }
    }
    val macAddressLength : Int
        get() {
            val o = __offset(4); return if (o != 0) __vector_len(o) else 0
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsAddUnknownDeviceRequest(_bb: ByteBuffer): AddUnknownDeviceRequest = getRootAsAddUnknownDeviceRequest(_bb, AddUnknownDeviceRequest())
        @JvmStatic
        fun getRootAsAddUnknownDeviceRequest(_bb: ByteBuffer, obj: AddUnknownDeviceRequest): AddUnknownDeviceRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createAddUnknownDeviceRequest(builder: FlatBufferBuilder, macAddressOffset: Int) : Int {
            builder.startTable(1)
            addMacAddress(builder, macAddressOffset)
            return endAddUnknownDeviceRequest(builder)
        }
        @JvmStatic
        fun startAddUnknownDeviceRequest(builder: FlatBufferBuilder) = builder.startTable(1)
        @JvmStatic
        fun addMacAddress(builder: FlatBufferBuilder, macAddress: Int) = builder.addOffset(0, macAddress, 0)
        @JvmStatic
        fun createMacAddressVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        @JvmStatic
        fun startMacAddressVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        @JvmStatic
        fun endAddUnknownDeviceRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
