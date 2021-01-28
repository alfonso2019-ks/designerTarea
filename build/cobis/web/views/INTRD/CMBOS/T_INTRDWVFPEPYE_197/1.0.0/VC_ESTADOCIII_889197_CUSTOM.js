/* variables locales de T_INTRDWVFPEPYE_197*/

(function (root, factory) {
    factory();
} (this, function() {

    "use strict";

    /*global designerEvents, console */

        //*********** COMENTARIOS DE AYUDA **************
        //  Para imprimir mensajes en consola
        //  console.log("executeCommand");

        //  Para enviar mensaje use
        //  eventArgs.commons.messageHandler.showMessagesInformation('Ejecutando comando personalizado');

        //  Para evitar que se continue con la validación a nivel de servidor
        //  eventArgs.commons.execServer = false;

        //**********************************************************
        //  Eventos de VISUAL ATTRIBUTES
        //**********************************************************

    
        var task = designerEvents.api.formestadocivil;
    

    //"TaskId": "T_INTRDWVFPEPYE_197"


    	

//Entity: EstadoCivil
//EstadoCivil.estadoCivil (ComboBox) View: FormEstadoCivil
//Evento Change: Se ejecuta al cambiar el valor de un InputControl.
task.change.VA_1FPVTJRNDUEBZZE_366218 = function(  entities, changedEventArgs ) {

    changedEventArgs.commons.execServer = false;
    if(entities.EstadoCivil.estadoCivil == 1){
        entities.RespuestaEstadoCivil.estadoCivil = "Soltero";
        entities.RespuestaEstadoCivil.actividadActual = "Listo para la farra";
       }else{
           entities.RespuestaEstadoCivil.estadoCivil = "Casado";
            entities.RespuestaEstadoCivil.actividadActual = "Lavando los platos";
       }

};

	

//Entity: RespuestaEstadoCivil
//RespuestaEstadoCivil. (Button) View: FormEstadoCivil
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONAYOWPAV_602218 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = false;
    entities.EstadoCivil.estadoCivil = "";
    executeCommandEventArgs.commons.api.viewState.hide('G_ESTADOCIIV_934218');
};



}));
