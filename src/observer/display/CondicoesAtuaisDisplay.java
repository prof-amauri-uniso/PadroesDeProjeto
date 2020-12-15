package observer.display;

import observer.subject.WheatherData;

import java.util.Observer;
import java.util.Observable;

public class CondicoesAtuaisDisplay implements Observer, ElementoDisplay {

    Observable weatherData;
    private float temperatura;
    private float umidade;

    public CondicoesAtuaisDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {

        String mensagem = "Temperatura: " + this.temperatura +
                " Umidade: " + this.umidade;
        System.out.println(mensagem);

    }

    @Override
    public void update(Observable obs, Object arg) {
        WheatherData weatherData = (WheatherData) obs;
        this.temperatura = weatherData.getTemperatura();
        this.umidade = weatherData.getUmidade();
        display();
    }
}
