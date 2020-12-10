package observer.subject;

import observer.observer.Observador;

import java.util.ArrayList;

public class WheatherData  implements Sujeito{

    private ArrayList<Observador> observadores;
    private float temperatura;
    private float umidade;
    private float pressao;

    public WheatherData(){
        observadores = new ArrayList<>();
    }

    @Override
    public void registrarObservador(Observador o) {

        observadores.add(o);
    }

    @Override
    public void removerObservador(Observador o) {

        int i = observadores.indexOf(o);
        if(i >=0 )
            observadores.remove(i);

    }

    @Override
    public void notificarObservdores() {
        observadores.forEach(obs -> {
             obs.atualizar(this.temperatura, this.umidade, this.pressao);
        });
    }

    public void mudancaDeMedidas(){
        notificarObservdores();
    }

    public void setMedidas(float temperatura, float umidade, float pressao){
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        mudancaDeMedidas();
    }
}
