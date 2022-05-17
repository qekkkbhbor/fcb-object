package tw.com.fcb.music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicServiceImpl implements MusicService{

Map<String,Music> myMusic = new HashMap<String,Music>();
	

	public MusicServiceImpl() {
		
		Music music1 = new Music();
		music1.setCode("A01");
		music1.setName("聽媽媽的話");
		music1.setPrice(300);
		music1.setSingerName("周杰倫");
		
		Music music2 = new Music();
		music2.setCode("A02");
		music2.setName("范特西");
		music2.setPrice(280);
		music2.setSingerName("周杰倫");
		
		
		Music music3 = new Music();
		music3.setCode("B01");
		music3.setName("姊妹");
		music3.setPrice(360);
		music3.setSingerName("張惠妹");
		
		myMusic.put(music1.getCode(), music1);
		myMusic.put(music2.getCode(), music2);
		myMusic.put(music3.getCode(), music3);
		
	
	}
	
	@Override
	public Music getByCode(String code) {
		// TODO Auto-generated method stub
		return myMusic.get(code);
	}

	@Override
	public List<Music> getBySinger(String singerName) {
		// TODO Auto-generated method stub
		
		List<Music> result = new ArrayList<Music>();
		
		for(String key:myMusic.keySet()) {
			Music thisMusic = myMusic.get(key);
			
			if(thisMusic.getSingerName().equals(singerName)) {
				result.add(thisMusic);
			}else {
				System.out.println("this is other singer");
			}
			
		}
		return result;
	}



}
