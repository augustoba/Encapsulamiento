package entity;

public class Auto {
    // modificador de acceso public
    public Integer  puertas;
    // modificador de acceso protected
    protected int cc;
    // modificador de acceso default
    Integer modelo;
    // modificador de acceso private
    private String color;


    public Auto() {
    }

    public Auto(Integer puertas, int cc, Integer modelo, String color) {
        this.puertas = puertas;
        this.cc = cc;
        this.modelo = modelo;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }


}
