package factory.pizza;

public abstract class Pizza {

    protected String tipo;

    public void preparar(){
        System.out.println("Preparando pizza: " + this.tipo);
    }

    public void assar(){
        System.out.println("Assando pizza: " + this.tipo);
    }

    public void cortar(){
        System.out.println("Cortando pizza: " + this.tipo);
    }

    public void embalar(){
        System.out.println("Embalando pizza: " + this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
