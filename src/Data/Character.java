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
public class Character {
    private Icon characterIcon;
    private String name;
    private String prefix;

    public Character(Icon characterIcon, String name, String prefix) {
        this.characterIcon = characterIcon;
        this.name = name;
        this.prefix = prefix;
    }

    public Icon getCharacterIcon() {
        return characterIcon;
    }

    public void setCharacterIcon(Icon characterIcon) {
        this.characterIcon = characterIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
}
