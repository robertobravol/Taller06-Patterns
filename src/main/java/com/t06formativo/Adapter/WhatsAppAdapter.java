package com.t06formativo.Adapter;

public class WhatsAppAdapter implements Notificador {
    private WhatsAppService adaptee;

    @Override
    public void notificar(Reporte reporte) {
        String formatoWhats = convertToWhats(reporte);
        adaptee.enviarMensajeChat(formatoWhats);
    }
    
    public String convertToWhats(Reporte reporte){
        return "convertido a formato whats";
    }
}
