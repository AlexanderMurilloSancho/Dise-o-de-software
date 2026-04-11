class NotificacionSMS implements Notificacion{
    @Override
    public void enviar(String msg) {
        System.out.println("SMS enviado: "+ msg);
    }
}

class NotificacionEmail implements Notificacion{
    @Override
    public void enviar(String msg){
        System.out.println("Email enviado: "+msg);
    }
}
