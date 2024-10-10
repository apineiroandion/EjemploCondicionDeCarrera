public class Contador extends Thread{
    @Override
    public void run() {
        while (true){
            if (Main.contador < 400) {
                Main.contador++;
                System.out.println("Contador: " + Main.contador);
            }
            else {
                break;
            }
        }
    }

}
