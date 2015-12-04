
package slam.sio.llb.fr.plp4.metier;

import java.util.ArrayList;
import java.util.HashMap;
import slam.sio.llb.fr.plp4.metier.Duo;

public class LesDuos extends ArrayList<Duo> {

	public LesDuos() {
		super();
		add(new Duo("Adam", "Ève","origine"));
		add(new Duo("Tristan", "Yseult","moyen-age"));
		add(new Duo("Rodrigue", "Chimène","le Cid, 17ème siècle"));
		add(new Duo("Bonny", "Clide","19ème siècle"));
		add(new Duo("Paul", "Virginie", "18ème siècle"));
		add(new Duo("César", "Cléopatre", "50 avant JC"));
	}
	public ArrayList<HashMap<String, String>> donneListe(){
		ArrayList<HashMap<String, String>> liste = new ArrayList<HashMap<String, String>>();
		for(Duo duo : this)
			liste.add(duo.donneDuo());
		return liste;
	}
}
