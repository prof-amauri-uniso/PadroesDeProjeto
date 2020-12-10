package observer.display;

import observer.observer.Observador;
import observer.subject.Sujeito;

public class CondicoesAtuaisDisplay implements Observador, ElementoDisplay {

    private float temperatura;
    private float umidade;
    private Sujeito weatherData;

    public CondicoesAtuaisDisplay(Sujeito weatherData){
        this.weatherData = weatherData;
        weatherData.registrarObservador(this);
    }

    @Override
    public void display() {

        String mensagem = "Temperatura: " + this.temperatura +
                " Umidade: " + this.umidade;
        System.out.println(mensagem);

    }

    @Override
    public void atualizar(float temp, float umidade, float pressao) {
        this.temperatura = temp;
        this.umidade = umidade;
        display();

    }
}
