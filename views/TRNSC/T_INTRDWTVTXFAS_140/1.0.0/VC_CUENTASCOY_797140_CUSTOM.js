/* variables locales de T_INTRDWTVTXFAS_140*/

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

    
        var task = designerEvents.api.formcuentas;
    

    //"TaskId": "T_INTRDWTVTXFAS_140"


    	

//Entity: CuentaOrigen
//CuentaOrigen. (Button) View: FormCuentasCopy
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VAVABUTTONMWYML_226547 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = false;
    if(entities.CuentaOrigen.valorATransferir > entities.CuentaOrigen.saldo){
        executeCommandEventArgs.commons.messageHandler.showMessagesError("El saldo es insuficiente", true);
       }else{
           entities.CuentaDestino.saldo += entities.CuentaOrigen.valorATransferir;
           entities.CuentaOrigen.saldo -= entities.CuentaOrigen.valorATransferir;
            executeCommandEventArgs.commons.messageHandler.showMessagesSuccess("Transacción exitosa", true);
       }
};

	
     
//Evento initData : Inicialización de datos del formulario, después de este evento se realiza el seguimiento de cambios en los datos
//ViewContainer: FormCuentasCopy
task.initData.VC_CUENTASCOY_797140 = function (entities, initDataEventArgs){

    initDataEventArgs.commons.execServer = false;
    initDataEventArgs.commons.api.viewState.disable('VA_NUMEROCUENTALRO_542547');
    initDataEventArgs.commons.api.viewState.disable('VA_SALDOKLVOFEEPNG_987547');
    initDataEventArgs.commons.api.viewState.disable('VA_NUMERODECUENTAA_674547');
    initDataEventArgs.commons.api.viewState.disable('VA_SALDOJQJVKRHYMX_299547');
    
    entities.CuentaOrigen.saldo = 2000;
    entities.CuentaDestino.saldo = 1000;
};



}));
