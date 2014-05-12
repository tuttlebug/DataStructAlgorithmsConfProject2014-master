/**
 * The World map:
 * consists of a Map that keys the world names to their objects
 * 
 * Check List:
 * [�] Map of Places
 * [] 
 * 
 * To Add/Implement:
 * [] Might need to extend a class (HashMap i.e)
 * [] remove method
 * [] Being a fully static class
 * [] Becoming a global variable
 * 
 * Temporary:
 * [] Instance variables
 */
import java.util.*;

public class WorldMap {
    
    // instance variables
    private Map<String, Place> places; 
    private ArrayList<String> placesNames;   // ONLY HERE FOR SAKE OF TOSTRING 
    private ArrayList<String> placesObjects; // ONLY HERE FOR SAKE OF TOSTRING 
    public int size; 
    
    // constructor
    public WorldMap () {
        this.places = new HashMap<String, Place>();  
        this.placesNames = new ArrayList<String>();
        this.placesObjects = new ArrayList<String>();
        this.size = 0;
    }
    
    // methods
    public void add(String name, Place place) {
        this.places.put(name, place);
        this.placesNames.add(name);
        this.placesObjects.add(place.toString());
        this.size++;
    }
    
    public Place getPlace(String name) {
        return this.places.get(name);
    }
    
    public Collection getValues() {
        return this.places.values();
    }
    
    public Set keys() {
        return this.places.keySet();
    }
    
    public String toString() {
        return String.format("PLACES: %s\n\nPLACES'S PLACES: \n%s\n", this.placesNames, this.placesObjects);  
    }
    
}
