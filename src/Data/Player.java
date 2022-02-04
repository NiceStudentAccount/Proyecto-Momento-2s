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
public class Player {
    private String name;
    private String bussinessName;
    private String position;
    private Icon playerIcon;

    public Player(String name, String bussinessName, String position, Icon playerIcon) {
        this.name = name;
        this.bussinessName = bussinessName;
        this.position = position;
        this.playerIcon = playerIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBussinessName() {
        return bussinessName;
    }

    public void setBussinessName(String bussinessName) {
        this.bussinessName = bussinessName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Icon getPlayerIcon() {
        return playerIcon;
    }

    public void setPlayerIcon(Icon playerIcon) {
        this.playerIcon = playerIcon;
    }
    
}
