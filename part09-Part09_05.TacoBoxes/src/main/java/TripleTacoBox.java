/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirarslan
 */
public class TripleTacoBox implements TacoBox{
    private int tacos = 3;
    
    public TripleTacoBox() {
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (this.tacos-1 >= 0) {
            this.tacos = this.tacos-1;
        }
    }
    
    
    
    
}
