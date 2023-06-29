/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author kathe
 */
class Rectangulo {
    private int ancho;
    private int altura;

    public Rectangulo(int ancho, int altura) throws RectanguloException {
        setAncho(ancho);
        setAltura(altura);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws RectanguloException {
        if (ancho <= 0) {
            throw new RectanguloException("El ancho debe ser mayor que 0.");
        }
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) throws RectanguloException {
        if (altura <= 0) {
            throw new RectanguloException("La altura debe ser mayor que 0.");
        }
        this.altura = altura;
    }

    public int calcularArea() {
        return ancho * altura;
    }
}
