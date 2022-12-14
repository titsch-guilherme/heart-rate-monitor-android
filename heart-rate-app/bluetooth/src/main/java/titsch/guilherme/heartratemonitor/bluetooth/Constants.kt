package titsch.guilherme.heartratemonitor.bluetooth

import java.util.UUID

internal object Constants {
    val DEVICE_NAMES = listOf("HeartRate", "Heart Rate Monitor")

    val CCCD_UUID = standardUUID("2902")
    val HEART_RATE_SERVICE_UUID: UUID = standardUUID("180D")
    val HEART_RATE_CHARACTERISTIC_UUID: UUID = standardUUID("2A37")
    val DEVICE_INFORMATION_SERVICE_UUID: UUID = standardUUID("180A")
    val MANUFACTURER_NAME_CHAR_UUID: UUID = standardUUID("2A29")

    private fun standardUUID(uuid: String): UUID =
        UUID.fromString("0000$uuid-0000-1000-8000-00805F9B34FB")
}
