
     
//Evento initData : Inicialización de datos del formulario, después de este evento se realiza el seguimiento de cambios en los datos
//ViewContainer: FormCuentas
task.initData.VC_CUENTASRFL_158528 = function (entities, initDataEventArgs){

    initDataEventArgs.commons.execServer = false;
    initDataEventArgs.commons.api.viewState.disable('VA_2948RYBIEKAGUJH_112211');
    initDataEventArgs.commons.api.viewState.disable('VA_7319WGYQQIGXQUS_545211');
    initDataEventArgs.commons.api.viewState.disable('VA_1172ICYTHGNFEUB_846211');
    initDataEventArgs.commons.api.viewState.disable('VA_4328FXDTCZGINII_498211');
    entities.CuentaDestino.numeroDeCuenta = 1233;
    entities.CuentaOrigen.numeroCuenta = 123442;
    entities.CuentaOrigen.saldo = 2000;
    entities.CuentaDestino.saldo = 1000;
};