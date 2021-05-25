/*
 * Below are the attributes to one of my favourite song
 * The name of this song is "Makasam" by the Indian artist kr$na
 */
package favouritesong;

import java.lang.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FavouriteSong {

    public static void main(String[] args) {
        
        String[] attributes = {"Name", "Makasam", "YearReleased", "2020", "Artist", "Kr$na", "ArtistLogo", "$", "SongLength", "5.38", "Views", "7006957", "Label", "Kalamkaar", "Genre", "hip-hop", "Likes", "206000"};
        
        String[] keyNames = new String[(attributes.length/2)];
        String[] valueNames = new String[(attributes.length/2)];
        
        for(int i=0;i<attributes.length;i++){
            if(i%2 == 0){
                keyNames[i/2] = attributes[i];
            }else{
                valueNames[i/2] = attributes[i];
            }
        }
        
        Map<String, String> attrMap = new HashMap<String, String>();
        for(int i=0; i<valueNames.length; i++){
            attrMap.put(keyNames[i], valueNames[i]);
        }
        
        
        for(int i=0; i<valueNames.length; i++){
            System.out.println(keyNames[i]+":"+attrMap.get(keyNames[i]));
        }
    }
    
}
