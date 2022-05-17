package tw.com.fcb.music;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MusicServiceTest {

	@Test
	void testGetByCode() {
		MusicService service = new MusicServiceImpl();
		Music music = service.getByCode("A01");
		assertEquals("聽媽媽的話",music.getName());
		}

}
