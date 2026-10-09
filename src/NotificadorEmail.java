public class NotificadorEmail extends Notificador{

    @Override
    public void enviar(String texto) {
        System.out.println("Enviando Email de forma segura: [" + texto +"]");
    }
}
