package tw.com.fcb.music;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;



public class MusicApp {

	public static void  main (String[] args) throws SQLException {
		
		MusicService  musicService 	= new MusicServiceImpl();
		Music musicgetByCode = musicService.getByCode("A01");
		System.out.println(musicgetByCode);	
		List<Music> musicgetBySinger = musicService.getBySinger("張惠妹");
		System.out.println(musicgetBySinger);
		
		Music music = new Music();
		music.setCode("001");
		music.setName("Jay");
		music.setPrice(100);
		music.setSingerName("ABC");
		System.out.println(music);
		Music2 music2 = new Music2();
		try {
			BeanUtils.copyProperties(music2, music);
			System.out.println(music2);
		} catch (IllegalAccessException e){
			e.printStackTrace();
			
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 Repository repository = new Repository();
		 
		 repository.insert(music);
		 repository.select();
		 System.out.println(repository.getBycode("A01"));
		 repository.delete("A02");
		 System.out.println(repository.getBycode("A02"));
		 
		 System.out.println(repository.getBycode());
	}
}
