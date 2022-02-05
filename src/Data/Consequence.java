/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.HashMap;
import javax.swing.JProgressBar;

/**
 *
 * @author samyg
 */
public class Consequence {
    private HashMap<Stat, Integer> statsAlteration;

    public Consequence(HashMap<Stat, Integer> statsAlteration) {
        this.statsAlteration = statsAlteration;
    }

    public HashMap<Stat, Integer> getStatsAlteration() {
        return statsAlteration;
    }

    public void setStatsAlteration(HashMap<Stat, Integer> statsAlteration) {
        this.statsAlteration = statsAlteration;
    }
    
    public void affectStats() {
        statsAlteration.forEach((k, v) -> {
            k.setValue(k.getValue() + v);
        });
    }
    
}
