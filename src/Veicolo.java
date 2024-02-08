/**
 * 
 * @author 4a
 *
 */
public class Veicolo {
	String targa, marca;
	boolean disabile;
	float speseVigilanzaVeicolo;
/**
 * 
 * @param targa targa veicolo
 * @param marca marca veicolo
 * @param disabile disabile veicolo
 * @param speseVigilanzaVeicolo spese vigilanza 
 */
	public Veicolo(String targa, String marca, boolean disabile, float speseVigilanzaVeicolo) {
		this.targa = targa;
		this.marca = marca;
		this.disabile = disabile;
		this.speseVigilanzaVeicolo = speseVigilanzaVeicolo;
	}
/**
 * 
 */
	public String toString() {
		String s = "";
		s += "targa=" + targa + "\nmarca=" + marca + "\ndisabile=" + disabile + "\nSpese Vigilanza Veicolo="
				+ speseVigilanzaVeicolo + "\n";
		return s;
	}
/**
 * 
 * @param args argomento
 */
	public static void main(String[] args) {
		Veicolo v1 = new Veicolo("X9JXLP", "Mercedes", false, 7.99F);
		System.out.println(v1);
	}

}
