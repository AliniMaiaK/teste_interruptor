package teste_interruptor;

public class interruptor {

	public static void main(String[] args) {
		boolean[] interruptores = new boolean[3];

        interruptores[0] = true;
        interruptores[1] = false;
        interruptores[2] = false;
        interruptores[0] = false;
        interruptores[1] = true;

     
        interruptores[2] = true;

        for (int i = 0; i < interruptores.length; i++) {
            if (interruptores[i]) {
                System.out.println("A lâmpada " + (i + 1) + " está acesa.");
            } else {
                System.out.println("A lâmpada " + (i + 1) + " está apagada.");
            
                if (i == 0) {
                    System.out.println("A lâmpada " + (i + 1) + " está conectada ao primeiro interruptor.");
                } else {
                    System.out.println("A lâmpada " + (i + 1) + " está conectada ao segundo interruptor.");
                }
            }
        }
    }
}
	