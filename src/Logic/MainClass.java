/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Data.Card;
import Data.DecisionCard;
import GUI.MainFrame;
import java.awt.BorderLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author samyg
 */
public class MainClass {
    private static List<DecisionCard> cardList = ElementsInstantiation.createDecisionsList(); 

    public static List<DecisionCard> getCardList() {
        return cardList;
    }
            
    public static void main(String[] args) {
        Collections.shuffle(cardList);
        MainFrame.runMainFrame();
    }
    
    public static ImageIcon staticImage(String path) {
        URL resource = ElementsInstantiation.class.getResource("/Sources/" + path);
        return new ImageIcon(resource);
    } 
    
    public static void repaintMenu(JPanel panel, JPanel contentPanel) {
        panel.setSize(contentPanel.getWidth(), contentPanel.getHeight());
        panel.setLocation(0, 0);
        
        contentPanel.removeAll();
        contentPanel.add(panel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
    
    public static void instantiateData() {
        
    }
}
