public class Vizinho implements Emergencia {
    
    @Override
    public void notificar() {
        System.out.println("Cuidado! Há um incêndio na casa do seu vizinho!");
    }
}
