package com.t06formativo.Adapter;

public class TelegramAdapter implements Notificador{
    private TelegramService adaptee;

    @Override
    public void notificar(Reporte reporte) {
        String formatoTeleg = convertToTeleg(reporte);
        adaptee.enviarMensajeTelegram(formatoTeleg);
    }
    
    public String convertToTeleg(Reporte reporte){
        return "convertido a formato Telegram";
    }
}
