package titsch.guilherme.heartratemonitor.central.usecases

import titsch.guilherme.heartratemonitor.bluetooth.central.CentralManager

class StartBluetoothCentralUseCase(private val centralManager: CentralManager) {
    suspend operator fun invoke(openConnection: Boolean) {
        centralManager.start(openConnection)
    }
}