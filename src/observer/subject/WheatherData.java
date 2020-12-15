package observer.subject;

import java.util.Observable;
import java.util.Observer;

import java.util.ArrayList;

public class WheatherData extends Observable{

    // Não precisamos mais do arraylist para guardar os observadores
    private float temperatura;
    private float umidade;
    private float pressao;

    public WheatherData(){

    }


    public void mudancaDeMedidas(){
        setChanged();
        //Não estamos enviando um objeto de dados, portanto os observadores terão que recuperar os dads eles mesmos
        notifyObservers();
    }

    public void setMedidas(float temperatura, float umidade, float pressao){
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        mudancaDeMedidas();
    }

    //Precisamos dos getters já que os próprios observadores quem recueperarão os dados.
    public float getTemperatura() {
        return temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public float getPressao() {
        return pressao;
    }
}
