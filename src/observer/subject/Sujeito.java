package observer.subject;

import observer.observer.Observador;

public interface Sujeito {

    public void registrarObservador(Observador o);
    public void removerObservador(Observador o);
    public void notificarObservdores();

}
