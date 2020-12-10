package observer;

import observer.display.CondicoesAtuaisDisplay;
import observer.subject.WheatherData;

public class EstacaoDoTempo {

    public static void main(String args[]){
        WheatherData weatherData = new WheatherData();

        CondicoesAtuaisDisplay condicoesAtuaisDisplay = new CondicoesAtuaisDisplay(weatherData);

        weatherData.setMedidas(80, 65, 30.4f);
        weatherData.setMedidas(82,70,29.2f);
    }
}
