package spring.tpSpring.jeuxVideo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.tpSpring.jeuxVideo.JeuVideo;
@Repository
public interface JeuVideoRepository extends CrudRepository<JeuVideo,Long>
{

}
