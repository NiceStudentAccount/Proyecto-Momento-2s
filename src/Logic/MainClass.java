/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import GUI.MainFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author samyg
 */
public class MainClass {
    public static void main(String[] args) {
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
}
