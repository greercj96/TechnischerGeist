/**
 * 
 */
package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import java.util.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author greerjackson
 *
 */
class SongsDatabaseTest {

	@Test
	@DisplayName ("Test cases for addSong")
	void testAddSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
	
		
		//Test 1 - use getSongs to ensure that two songs were added to Rap genre
		
		assertEquals(db.getSongs("Rap").toString(), "[Savage, Gin and Juice]");
//		
//		
		//Test 2 - use getSongs to ensure that one song was added to Jazz
		
		assertEquals(db.getSongs("Jazz").toString(), "[Always There]");
		
	}

	
	@Test
	@DisplayName ("Test cases for getSong")
	void testGetSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong ("Soca", "Backyard Jam");
		db.addSong("Soul", "Adore");
		db.addSong("Soca", "Human");
		db.addSong("Afrobeats", "Ginger");
		db.addSong("Soul", "Memory Lane");
		
		 Set<String> SoulSongs = db.getSongs("Soul");
		 
		//Test 1 - getSongs retrieves two songs in SoulSongs set
		assertEquals(SoulSongs.toString(), "[Memory Lane, Adore]");
		
		Set<String> SocaSongs = db.getSongs("Soca");
		
		//Test 2- getSongs retreives two songs in SocaSongs set
		assertEquals(SocaSongs.toString(), "[Human, Backyard Jam]");
		
		Set<String> AfrobeatsSongs = db.getSongs("Afrobeats");
 
		//Test 3 - getSongs retrieves one song from Afrobeats genre
		assertEquals(AfrobeatsSongs.toString(), "[Ginger]");
			
	}
	
	
	@Test 
	@DisplayName("Test cases for getGenreOfSong")
	
	void testGetGenreOfSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rock", "Adam's Song");
		db.addSong("Indie", "Roots");
		db.addSong("Reggae", "Never Leave I");
		db.addSong("Indie", "Menswear");
		
		
		//Test 1 - getGenreOfSong retrieves genre Rock for "Adam's Song"
		assertEquals(db.getGenreOfSong("Adam's Song"), "Rock");
		
		
		//Test 1 - getGenreOfSong retrieves genre Reggae  for "Never Leave I"
		assertEquals(db.getGenreOfSong("Never Leave I"), "Reggae");
		
		//Test 1 - getGenreOfSong retrieves genre Indie for "Roots"
		assertEquals(db.getGenreOfSong("Roots"), "Indie");
}
	}

