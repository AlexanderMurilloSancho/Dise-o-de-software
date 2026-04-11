class ProveedorSMS extends GestorNotificaciones {
    @Override
    public Notificacion GenerarNotificacion(){
        return new NotificacionSMS();
    }
}

class ProveedorEmail extends GestorNotificaciones {
    @Override
    public Notificacion GenerarNotificacion(){
        return new NotificacionEmail();
    }
}
