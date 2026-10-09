public class Main {

     public static void main (String[] args){
         Notificador notificador = new Notificador();
         notificador.enviar("Hola");
         notificador.enviar("Hola", 5);
         NotificadorEmail notificadorEmail = new NotificadorEmail();
         System.out.println("");
         notificadorEmail.enviar("Hola");
     }

}

/*

1. ¿En qué momento del desarrollo (compilación o ejecución) sabe Java cuál de los
métodos sobrecargados debe ejecutar?
R= En el momento de compilacion, ya que Java determina que metodo sobrecargado utilizar en tiempo de compilacion
porque el compilador analiza el nombre del metodo y los tipos y cantidad de parametros que se estan enviando

2. ¿Por qué el método enviar de NotificadorEmail se comporta diferente al de la clase
base si tienen el mismo nombre?
R= Se comporta diferente porque la clase hija sobrescribe el metodo enviar(String) de la clase padre, proporcionando
su propia implementacion. La anotacion @Override indica que estamos sobrescribiendo un metodo heredado y permite
al compilador verificar que la sobrescritura sea correcta.

 */