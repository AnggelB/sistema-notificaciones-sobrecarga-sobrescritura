public class Notificador {

    public void enviar(String texto){
        System.out.println(texto);
    }

    public void enviar(String texto, Integer num){
        for(int i = 0; i<num; i++){
            System.out.print(texto + " ");
        }
    }


}
