// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

@Suppress("unused")
class FlashingMethod private constructor() {
    companion object {
        const val NONE: UByte = 0u
        const val OTA: UByte = 1u
        const val SERIAL: UByte = 2u
        val names : Array<String> = arrayOf("NONE", "OTA", "SERIAL")
        @JvmStatic
        fun name(e: Int) : String = names[e]
    }
}