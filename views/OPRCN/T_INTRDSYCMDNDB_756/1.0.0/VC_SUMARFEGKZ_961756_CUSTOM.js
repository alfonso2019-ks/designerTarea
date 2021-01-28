/* variables locales de T_INTRDSYCMDNDB_756*/

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

    
        var task = designerEvents.api.sumarform;
    

    //"TaskId": "T_INTRDSYCMDNDB_756"


    	

//Entity: Operacion
//Operacion. (Button) View: sumarForm
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONILFFVKA_407309 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = false;
    entities.Operacion.numero1 = 0;
    entities.Operacion.numero2 = 0;
    entities.Operacion.resultado = 0;
};

	

//Entity: Operacion
//Operacion. (Button) View: sumarForm
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONSWFYPMA_947309 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = false;
    entities.Operacion.resultado = entities.Operacion.numero1 + entities.Operacion.numero2;

};



}));
