
     
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