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
            
    public static void main(String[] args) {
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
    
    public static String intToMonth(int intMonth) {
        switch(intMonth) {
            case 0: {
                return "Enero";
            }
            case 1: {
                return "Febrero";
            }
            case 2: {
                return "Marzo";
            }
            case 3: {
                return "Abril";
            }
            case 4: {
                return "Mayo";
            }
            case 5: {
                return "Junio";
            }
            case 6: {
                return "Julio";
            }
            case 7: {
                return "Agosto";
            }
            case 8: {
                return "Septiembre";
            }
            case 9: {
                return "Octubre";
            }
            case 10: {
                return "Noviembre";
            }
            case 11: {
                return "Diciembre";
            }
            default: {
                return "";
            }
        }
    }
    
    public static void instantiateData() {
        
    }
}
