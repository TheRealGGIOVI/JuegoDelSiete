import java.util.Arrays;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */
class Mano {
  private Carta[] cartas;
  private int numCartas;

  public Mano() {
    cartas = new Carta[10]; // Como mucho en una mano hay 10 cartas.
    numCartas = 0;
  }

  public void recibirCarta(Carta carta) {
    if (numCartas < 10) {
      cartas[numCartas++] = carta;
    }
  }

  public double calcularPuntuacion() {
    double puntuacion = 0;
    for (int i = 0; i < numCartas; i++) {
      puntuacion += cartas[i].getPuntuacion();
    }
    return puntuacion;
  }

  public Carta[] getCartas() {
    return Arrays.copyOf(cartas, numCartas); // Utilizando copyOf hacemos una copia exacta del array de cartas junto con
                                             // su número
  }

  public void reiniciar() { // Reiniciamos la mano
    cartas = new Carta[10];
    numCartas = 0;
  }
}