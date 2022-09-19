import java.util.ArrayList;
import java.util.List;

public class Incendio {

    public final List<Emergencia>listeners = new ArrayList<>();

    public void addListeners(Emergencia toadd) {
        listeners.add(toadd);
    }

    public Incendio() {

        this.addListeners(new CorpoDeBombeiros());
        this.addListeners(new DonoDaCasa());
    }
}

//----------------------------------------------------

interface Emergencia {
    void notificar();
}

//----------------------------------------------------

class DonoDaCasa implements Emergencia {

    @Override
    public void notificar() {
        System.out.println("Sua casa está pegando fogo!Chame os Bombeiros!");
    }
}

//----------------------------------------------------

class CorpoDeBombeiros implements Emergencia {

    @Override
    public void notificar() {
        System.out.println("Existe um incêndio em andamento!Emergência necessária!");
    }
}