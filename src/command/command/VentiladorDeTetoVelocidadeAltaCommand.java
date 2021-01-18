package command.command;

import command.fornecedores.ventiladordeteto.VentiladorDeTeto;

public class VentiladorDeTetoVelocidadeAltaCommand implements Command{

    VentiladorDeTeto ventiladorDeTeto;
    int velocidadeAnterior;

    public VentiladorDeTetoVelocidadeAltaCommand(VentiladorDeTeto ventiladorDeTeto){
        this.ventiladorDeTeto = ventiladorDeTeto;
    }

    /*Precisamos armazenar o estado da velocidade para podermos reverter corretamente*/
    @Override
    public void executar() {
        velocidadeAnterior = ventiladorDeTeto.getvelocidade();
        ventiladorDeTeto.alta();
    }

    /*Configuramos o estado da velocidade de acordo com o estado da velcoidade previamente armazenado*/
    @Override
    public void desfazer() {

        switch(velocidadeAnterior){
            case VentiladorDeTeto.ALTA: ventiladorDeTeto.alta(); break;
            case VentiladorDeTeto.BAIXA: ventiladorDeTeto.baixa(); break;
            case VentiladorDeTeto.MEDIA: ventiladorDeTeto.media(); break;
            case VentiladorDeTeto.DESLIGADO: ventiladorDeTeto.desligado(); break;
        }

    }
}
