

//Entity: EstadoCivil
//EstadoCivil.estadoCivil (ComboBox) View: FormEstadoCivil
//Evento Change: Se ejecuta al cambiar el valor de un InputControl.
task.change.VA_1FPVTJRNDUEBZZE_366218 = function(  entities, changedEventArgs ) {

    changedEventArgs.commons.execServer = false;
    if(entities.EstadoCivil.estadoCivil == 0){
        changedEventArgs.commons.api.viewState.hide('G_ESTADOCIIV_934218');
       }
    if(entities.EstadoCivil.estadoCivil == 1){
        entities.RespuestaEstadoCivil.estadoCivil = "Soltero";
        entities.RespuestaEstadoCivil.actividadActual = "Listo para la farra";
        changedEventArgs.commons.api.viewState.show('G_ESTADOCIIV_934218');
       }
    if (entities.EstadoCivil.estadoCivil == 2){
           entities.RespuestaEstadoCivil.estadoCivil = "Casado";
            entities.RespuestaEstadoCivil.actividadActual = "Lavando los platos";
        changedEventArgs.commons.api.viewState.show('G_ESTADOCIIV_934218');
       }

};