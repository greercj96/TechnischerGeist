/**
 * 
 */
package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author greerjackson
 *
 */
public class SongsDatabase {
	private Map<String, Set<String>>map = new HashMap<String, Set<String>>();
				
				 		
			    		/**
			    		 * @param genre 
			    		 * @param songTitle
			    		 * Adds a song title to a genre 
			    		 */
			    		public void addSong(String genre, String songTitle) {
								Set<String> songs = map.getOrDefault(genre, new HashSet<String>());
							
								songs.add(songTitle);
								
								map.put(genre, songs);
								System.out.println("Song " + songTitle + "has been added into " + genre);
			    		
			    		}
			   
			    
			    		
			 		/**
			 		 * @param genre represents genre that we would like to find songs for 
			 		 * @return returns the Set that contains all songs for a genre
			 		 */
			 		public Set<String> getSongs(String genre) {
			        			return map.getOrDefault(genre, new HashSet<String>());
			    		}
				
			    		 
			    		/**
			    		 * @param songTitle represents song we want to find out genre of 
			    		 * @return returns genre, e.g, jazz or rap , given a song title
			    		 */
			    		public String getGenreOfSong(String songTitle) {
			        			String result = "";
			        			
			        			for(String genre: map.keySet()) {
			        				if (map.get(genre).contains(songTitle)){
			        					result = genre;
			        					break;
			        				}
			    		}
			        			return result;
			    		}
			}

