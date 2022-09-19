import java.util.Timer;
import java.util.TimerTask;

public class Teste {
    
    static int i = 0;
    public static void main(String[] args) {
        Incendio incendio = new Incendio();
        Vizinho vizinho = new Vizinho();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                i++;
                System.out.println(i);

                if(i == 10) {
                    for(Emergencia emergencia: incendio.listeners) {
                        emergencia.notificar();
                    }
                }
            }
        };
        incendio.addListeners(vizinho);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 1000l, 1000l);

    }
}
