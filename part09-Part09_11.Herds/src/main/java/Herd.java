
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirarslan
 */
public class Herd implements Movable{
    private ArrayList<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.list.add(movable);
    }
    
    public void move(int dx, int dy){
        for (Movable movable : list) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (Movable movable : list) {
            s += movable.toString() + "\n";
        }
        return s;
    }
    
    
    
}
