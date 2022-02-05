/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Data.Card;
import Data.DecisionCard;
import GUI.MainFrame;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
        MainFrame mainFrame = new MainFrame();
        mainFrame.runMainFrame();
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
