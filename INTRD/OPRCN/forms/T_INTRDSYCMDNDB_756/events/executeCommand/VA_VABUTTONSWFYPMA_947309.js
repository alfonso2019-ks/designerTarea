

//Entity: Operacion
//Operacion. (Button) View: sumarForm
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONSWFYPMA_947309 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = false;
    entities.Operacion.resultado = entities.Operacion.numero1 + entities.Operacion.numero2;

};