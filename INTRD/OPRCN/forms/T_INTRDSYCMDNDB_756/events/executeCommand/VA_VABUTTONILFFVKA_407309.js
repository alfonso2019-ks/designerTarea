

//Entity: Operacion
//Operacion. (Button) View: sumarForm
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONILFFVKA_407309 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = false;
    entities.Operacion.numero1 = 0;
    entities.Operacion.numero2 = 0;
    entities.Operacion.resultado = 0;
};