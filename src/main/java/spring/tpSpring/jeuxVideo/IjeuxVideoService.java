package spring.tpSpring.jeuxVideo;

import java.util.ArrayList;
import java.util.List;

public interface IjeuxVideoService {

	List<JeuVideo>listJeu= new ArrayList<JeuVideo>();
	public List<JeuVideo> findAll();
}
