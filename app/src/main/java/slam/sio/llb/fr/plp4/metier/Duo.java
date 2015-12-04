package slam.sio.llb.fr.plp4.metier;

import java.util.HashMap;

public class Duo{
	private String garcon;
	private String fille;
	private String epoque;

	public Duo(String garcon, String fille, String epoque) {
		super();
		this.garcon = garcon;
		this.fille = fille;
		this.epoque = epoque;
	}
	public String getGarcon() {	return garcon;}
	public String getFille() { return fille;}
	public String getEpoque() { return epoque;}

	public HashMap<String, String> donneDuo(){
		HashMap<String, String> ligne = new HashMap<String, String>();
		ligne.put("garcon", garcon);
		ligne.put("fille", fille);
		ligne.put("epoque", epoque);
		return ligne;	
	}
}
