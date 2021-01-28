

//Entity: RespuestaEstadoCivil
//RespuestaEstadoCivil. (Button) View: FormEstadoCivil
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONAYOWPAV_602218 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = false;
    entities.EstadoCivil.estadoCivil = "";
    executeCommandEventArgs.commons.api.viewState.hide('G_ESTADOCIIV_934218');
};