package titsch.guilherme.heartratemonitor.peripheral.usecases

import titsch.guilherme.heartratemonitor.bluetooth.peripheral.PeripheralManager

class EmitHeartRateMeasurementUseCase(private val peripheralManager: PeripheralManager) {
    operator fun invoke(value: Int) {
        peripheralManager.emitHeartRate(value)
    }
}