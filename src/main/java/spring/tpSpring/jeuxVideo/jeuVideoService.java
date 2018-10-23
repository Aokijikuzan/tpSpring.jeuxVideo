package spring.tpSpring.jeuxVideo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class jeuVideoService implements IjeuxVideoService
{
	@Autowired
	private  JeuVideoRepository repository;
	
	@Autowired
	@Override
	public List<JeuVideo> findAll() {
		// TODO Auto-generated method stub
		List<JeuVideo>listJeu= (List<JeuVideo>)repository.findAll();
		
		return listJeu;
	}

}
