/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import javax.swing.Icon;

/**
 *
 * @author samyg
 */
public class Stat {
    private int value;
    private Icon statIcon;

    public Stat(int value, Icon statIcon) {
        this.value = value;
        this.statIcon = statIcon;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Icon getStatIcon() {
        return statIcon;
    }

    public void setStatIcon(Icon statIcon) {
        this.statIcon = statIcon;
    }
    
}
