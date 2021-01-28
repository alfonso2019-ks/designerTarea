

//Entity: CuentaOrigen
//CuentaOrigen. (Button) View: FormCuentas
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONMWMLRYL_310211 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = false;
    if(entities.CuentaOrigen.valorATransferir > entities.CuentaOrigen.saldo){
        executeCommandEventArgs.commons.messageHandler.showMessagesError("El saldo es insuficiente", true);
       }else{
           entities.CuentaDestino.saldo += entities.CuentaOrigen.valorATransferir;
           entities.CuentaOrigen.saldo -= entities.CuentaOrigen.valorATransferir;
            executeCommandEventArgs.commons.messageHandler.showMessagesSuccess("Transacción exitosa", true);
       }
};