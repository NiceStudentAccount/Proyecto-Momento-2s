/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Data.DecisionCard;
import Data.Stat;
import Logic.ElementsInstantiation;
import Logic.GameState;
import Logic.MainClass;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 * @author samyg
 */
public class ChoiceCard1 extends javax.swing.JPanel {
    private List<DecisionCard> gameCards;
    private DecisionCard choice;
    private Stat statusStat;
    private Stat moneyStat;
    private Stat happinessStat;
    private Stat environmentStat;
    private GameState gameState;

    /**
     * Creates new form DisplayGuide
     */
    public ChoiceCard1(List<DecisionCard> gameCards) {
        initComponents();
        
        this.gameState = new GameState();
        this.gameCards = gameCards;
        
        setChoice(gameCards.get(0));
        paintCard();
        
        this.statusStat = ElementsInstantiation.getStatusStat();
        this.moneyStat = ElementsInstantiation.getMoneyStat();
        this.happinessStat = ElementsInstantiation.getHappinessStat();
        this.environmentStat = ElementsInstantiation.getEnvironmentStat();
        
        this.statusBar.setValue(statusStat.getValue());
        this.moneyBar.setValue(moneyStat.getValue());
        this.happinessBar.setValue(happinessStat.getValue());
        this.environmentBar.setValue(environmentStat.getValue());
        
    }

    public DecisionCard getChoice() {
        return choice;
    }

    public void setChoice(DecisionCard choice) {
        this.choice = choice;
    }
    
    public void setCard(DecisionCard card) {
        setChoice(card);
        paintCard();
    }

    public Stat getStatusStat() {
        return statusStat;
    }

    public void setStatusStat(Stat statusStat) {
        this.statusStat = statusStat;
    }

    public Stat getMoneyStat() {
        return moneyStat;
    }

    public void setMoneyStat(Stat moneyStat) {
        this.moneyStat = moneyStat;
    }

    public Stat getHappinessStat() {
        return happinessStat;
    }

    public void setHappinessStat(Stat happinessStat) {
        this.happinessStat = happinessStat;
    }

    public Stat getEnvironmentStat() {
        return environmentStat;
    }

    public void setEnvironmentStat(Stat environmentStat) {
        this.environmentStat = environmentStat;
    }
    
    public void paintCard() {
        situationDescription.setText(choice.getSituation());
        characterIconLabel.setIcon(choice.getCharacter().getCharacterIcon());
        characterNameLabel.setText(choice.getCharacter().getName());
    }
    
    public void paintInitialStats() {
        statusBar.setValue(statusStat.getValue());
        moneyBar.setValue(moneyStat.getValue());
        happinessBar.setValue(happinessStat.getValue());
        environmentBar.setValue(environmentStat.getValue());
    }
    
    public void consequenceOnBars() {
        if (statusStat.getValue() != statusBar.getValue()) {
            animateBar(statusStat, statusBar);
        }
        if (moneyStat.getValue() != moneyBar.getValue()) {
            animateBar(moneyStat, moneyBar);
        }
        if (happinessStat.getValue() != happinessBar.getValue()) {
            animateBar(happinessStat, happinessBar);
        }
        if (environmentStat.getValue() != environmentBar.getValue()) {
            animateBar(environmentStat, environmentBar);
        }
    }
    
    public void checkIfLoose() {
        if (statusStat.getValue() == 0 || statusStat.getValue() == 120 || moneyStat.getValue() == 0 || moneyStat.getValue() == 120 || happinessStat.getValue() == 0 || happinessStat.getValue() == 120 || environmentStat.getValue() == 0 || environmentStat.getValue() == 120) {
            JOptionPane.showMessageDialog(cardPanel, "Perdiste por gei");
            System.exit(0);
        }
    }
    
    public void changeCard(List<DecisionCard> choices) {
        choices.remove(0);
        DecisionCard newCard = choices.get(0);
        setCard(newCard);
    }
    
    private void animateBar(Stat stat, JProgressBar bar) {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int counter = bar.getValue();
                if (stat.getValue() < bar.getValue()) {
                    bar.setValue(counter-1);
                }
                else if (stat.getValue() > bar.getValue()) {
                    bar.setValue(counter+1);
                } else {
                    return;
                }
            }
        };
        Timer timer = new Timer(25, actionListener);
        timer.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        statsPanel = new javax.swing.JPanel();
        statusBar = new javax.swing.JProgressBar();
        moneyBar = new javax.swing.JProgressBar();
        happinessBar = new javax.swing.JProgressBar();
        environmentBar = new javax.swing.JProgressBar();
        username = new javax.swing.JLabel();
        playerIconLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        businessName = new javax.swing.JTextArea();
        statusIcon = new javax.swing.JLabel();
        happinessIcon = new javax.swing.JLabel();
        environmentIcon = new javax.swing.JLabel();
        moneyIcon = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        characterNameLabel = new javax.swing.JLabel();
        characterIconLabel = new javax.swing.JLabel();
        situationPane = new javax.swing.JScrollPane();
        situationDescription = new javax.swing.JTextArea();
        goLeftPanel = new javax.swing.JPanel();
        noLabel = new javax.swing.JLabel();
        goRightPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        dateLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(520, 650));

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statsPanel.setBackground(new java.awt.Color(255, 51, 0));
        statsPanel.setPreferredSize(new java.awt.Dimension(520, 170));

        statusBar.setMaximum(120);

        moneyBar.setMaximum(120);

        happinessBar.setMaximum(120);

        environmentBar.setMaximum(120);

        username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("GUI/Bundle"); // NOI18N
        username.setText(bundle.getString("ChoiceCard1.username.text")); // NOI18N

        playerIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/empresarioicono.png"))); // NOI18N
        playerIconLabel.setText(bundle.getString("ChoiceCard1.playerIconLabel.text")); // NOI18N

        businessName.setEditable(false);
        businessName.setBackground(new java.awt.Color(255, 51, 0));
        businessName.setColumns(20);
        businessName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        businessName.setLineWrap(true);
        businessName.setRows(5);
        businessName.setText(bundle.getString("ChoiceCard1.businessName.text")); // NOI18N
        businessName.setWrapStyleWord(true);
        businessName.setBorder(null);
        businessName.setPreferredSize(new java.awt.Dimension(280, 20));
        jScrollPane1.setViewportView(businessName);

        statusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/reputacionIcon.png"))); // NOI18N
        statusIcon.setText(bundle.getString("ChoiceCard1.statusIcon.text")); // NOI18N

        happinessIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/felicidadIcon.png"))); // NOI18N
        happinessIcon.setText(bundle.getString("ChoiceCard1.happinessIcon.text")); // NOI18N

        environmentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/arbolIcon.png"))); // NOI18N
        environmentIcon.setText(bundle.getString("ChoiceCard1.environmentIcon.text")); // NOI18N

        moneyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/dineroIcon.png"))); // NOI18N
        moneyIcon.setText(bundle.getString("ChoiceCard1.moneyIcon.text")); // NOI18N

        javax.swing.GroupLayout statsPanelLayout = new javax.swing.GroupLayout(statsPanel);
        statsPanel.setLayout(statsPanelLayout);
        statsPanelLayout.setHorizontalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsPanelLayout.createSequentialGroup()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(playerIconLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(statsPanelLayout.createSequentialGroup()
                                .addComponent(username)
                                .addGap(0, 141, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(happinessBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(environmentBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(moneyBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusIcon)
                    .addComponent(happinessIcon)
                    .addComponent(environmentIcon)
                    .addComponent(moneyIcon))
                .addGap(7, 7, 7))
        );
        statsPanelLayout.setVerticalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusIcon)
                            .addComponent(statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(statsPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(username)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(statsPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(moneyBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(moneyIcon))
                                .addGap(12, 12, 12)
                                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(happinessBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(happinessIcon))
                                .addGap(12, 12, 12)
                                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(environmentBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(environmentIcon)))))
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(playerIconLabel)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        background.add(statsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 180));

        cardPanel.setBackground(new java.awt.Color(255, 255, 51));

        characterNameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        characterNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        characterNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        characterNameLabel.setText(bundle.getString("ChoiceCard1.characterNameLabel.text")); // NOI18N

        characterIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/The_Jester.png"))); // NOI18N
        characterIconLabel.setText(bundle.getString("ChoiceCard1.characterIconLabel.text")); // NOI18N

        situationDescription.setEditable(false);
        situationDescription.setBackground(new java.awt.Color(255, 255, 255));
        situationDescription.setColumns(20);
        situationDescription.setForeground(new java.awt.Color(0, 0, 0));
        situationDescription.setLineWrap(true);
        situationDescription.setRows(5);
        situationDescription.setText(bundle.getString("ChoiceCard1.situationDescription.text")); // NOI18N
        situationDescription.setWrapStyleWord(true);
        situationDescription.setBorder(null);
        situationPane.setViewportView(situationDescription);

        goLeftPanel.setBackground(new java.awt.Color(255, 255, 51));
        goLeftPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goLeftPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goLeftPanelMouseClicked(evt);
            }
        });

        noLabel.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        noLabel.setForeground(new java.awt.Color(0, 0, 0));
        noLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noLabel.setText(bundle.getString("ChoiceCard1.noLabel.text")); // NOI18N

        javax.swing.GroupLayout goLeftPanelLayout = new javax.swing.GroupLayout(goLeftPanel);
        goLeftPanel.setLayout(goLeftPanelLayout);
        goLeftPanelLayout.setHorizontalGroup(
            goLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, goLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        goLeftPanelLayout.setVerticalGroup(
            goLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goLeftPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(noLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        goRightPanel.setBackground(new java.awt.Color(255, 255, 51));
        goRightPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goRightPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goRightPanelMouseClicked(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(bundle.getString("ChoiceCard1.jTextArea1.text")); // NOI18N
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout goRightPanelLayout = new javax.swing.GroupLayout(goRightPanel);
        goRightPanel.setLayout(goRightPanelLayout);
        goRightPanelLayout.setHorizontalGroup(
            goRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goRightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        goRightPanelLayout.setVerticalGroup(
            goRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, goRightPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(situationPane)
                    .addGroup(cardPanelLayout.createSequentialGroup()
                        .addComponent(goLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(characterIconLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(characterNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(situationPane, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(characterIconLabel)
                    .addComponent(goRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(characterNameLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        background.add(cardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 200, 440, 390));

        dateLabel.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 0, 0));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText(bundle.getString("ChoiceCard1.dateLabel.text")); // NOI18N
        background.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 600, 540, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goRightPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goRightPanelMouseClicked
        choice.executeYesConsequence();
        consequenceOnBars();
        gameState.setTurnCounter(gameState.getTurnCounter() + 1);
        checkIfLoose();
        gameState.checkIfWon(cardPanel);
        changeCard(gameCards);
    }//GEN-LAST:event_goRightPanelMouseClicked

    private void goLeftPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goLeftPanelMouseClicked
        choice.executeNoConsequence();
        consequenceOnBars();
        gameState.setTurnCounter(gameState.getTurnCounter() + 1);
        checkIfLoose();
        gameState.checkIfWon(cardPanel);
        changeCard(gameCards);
    }//GEN-LAST:event_goLeftPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextArea businessName;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel characterIconLabel;
    private javax.swing.JLabel characterNameLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JProgressBar environmentBar;
    private javax.swing.JLabel environmentIcon;
    private javax.swing.JPanel goLeftPanel;
    private javax.swing.JPanel goRightPanel;
    private javax.swing.JProgressBar happinessBar;
    private javax.swing.JLabel happinessIcon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JProgressBar moneyBar;
    private javax.swing.JLabel moneyIcon;
    private javax.swing.JLabel noLabel;
    private javax.swing.JLabel playerIconLabel;
    private javax.swing.JTextArea situationDescription;
    private javax.swing.JScrollPane situationPane;
    private javax.swing.JPanel statsPanel;
    private javax.swing.JProgressBar statusBar;
    private javax.swing.JLabel statusIcon;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
