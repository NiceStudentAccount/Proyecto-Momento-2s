/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Data.DecisionCard;
import Data.GameCharacter;
import Data.GameOverCard;
import Data.Stat;
import Logic.ElementsInstantiation;
import Logic.GameState;
import Logic.MainClass;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 * @author samyg
 */
public class ChoiceCard extends javax.swing.JPanel {
    private Calendar dates;
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
    public ChoiceCard() {
        initComponents();
        
        setNames();
        
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 2, 17);
        this.dates = cal;
        setDateLabel();
        
        this.gameCards = ElementsInstantiation.createDecisionsList();
        
        setChoice(gameCards.get(0));
        paintCard();
        
        ElementsInstantiation.resetStats();
        
        this.statusStat = ElementsInstantiation.getStatusStat();
        this.moneyStat = ElementsInstantiation.getMoneyStat();
        this.happinessStat = ElementsInstantiation.getHappinessStat();
        this.environmentStat = ElementsInstantiation.getEnvironmentStat();
        
        this.statusBar.setValue(statusStat.getValue());
        this.moneyBar.setValue(moneyStat.getValue());
        this.happinessBar.setValue(happinessStat.getValue());
        this.environmentBar.setValue(environmentStat.getValue());
        
        this.gameState = new GameState(this);
        
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
        situationDescription.setText(choice.getCharacter().getPrefix() + ", " + choice.getSituation());
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
    
    public void darkMenu() {
        statsPanel.setBackground(Color.decode("#3A4E7A"));
        businessName.setBackground(Color.decode("#3A4E7A"));
        datePanel.setBackground(Color.decode("#3A4E7A"));
        cardPanel.setBackground(Color.decode("#5E83BA"));
        background.setBackground(Color.decode("#091D36"));
    }
    
    public void checkIfLoose() {
        if (statusStat.getValue() == 0) {
            GameCharacter statusCharacter = ElementsInstantiation.getChar1();
            GameOverCard statusMinEnd = new GameOverCard(statusCharacter, "Nuestra reputación está por el piso y la gente está muy enojada con nosotros.", "La gente inició una campaña de cancelación contra la compañía. Ésta fue demasiado fuerte y las acciones de la empresa cayeron en picada.", ElementsInstantiation.staticIcon("calaveraIcon.png"), this);
            DeathCard statusMinPanel = new DeathCard(statusMinEnd);
            MainClass.repaintMenu(statusMinPanel, cardPanel);
        }
        else if (statusStat.getValue() == 120) {
            GameCharacter statusCharacter = ElementsInstantiation.getChar1();
            GameOverCard statusMaxEnd = new GameOverCard(statusCharacter, "Somos demasiado queridos por todo el mundo... Tanto que hay políticos usando nuestro nombre a su favor sin nuestro permiso", "La gente perdió la fe en la compañía gracias a los políticos que usaban su nombre. La empresa perdió sus clientes y cayó en bancarrota.", ElementsInstantiation.staticIcon("calaveraIcon.png"), this);
            DeathCard statusMaxPanel = new DeathCard(statusMaxEnd);
            MainClass.repaintMenu(statusMaxPanel, cardPanel);
        }
        else if (moneyStat.getValue() == 0) {
            GameCharacter moneyCharacter = ElementsInstantiation.getChar2();
            GameOverCard moneyMinEnd = new GameOverCard(moneyCharacter, "La empresa está practicamente quebrada. Los inversionistas estamos muy preocupados por su desempeño en el manejo del negocio...", "Los inversionistas decidieron vender sus acciones antes de que perdieran todo valor y la empresa quedó a la deriva esperando comprador.", ElementsInstantiation.staticIcon("calaveraIcon.png"), this);
            DeathCard moneyMinPanel = new DeathCard(moneyMinEnd);
            MainClass.repaintMenu(moneyMinPanel, cardPanel);
        }
        else if (moneyStat.getValue() == 120) {
            GameCharacter moneyCharacter = ElementsInstantiation.getChar2();
            GameOverCard moneyMaxEnd = new GameOverCard(moneyCharacter, "Ser socio de esta empresa es igual a hacerse rico. Los inversionistas estamos muy alegres con usted...", "Los inversionistas se adjudicaron el éxito capital de la empresa, por lo que tomaron control sobre la misma quitándote todo poder de decisión.", ElementsInstantiation.staticIcon("calaveraIcon.png"), this);
            DeathCard moneyMaxPanel = new DeathCard(moneyMaxEnd);
            MainClass.repaintMenu(moneyMaxPanel, cardPanel);
        }
        else if (happinessStat.getValue() == 0) {
            GameCharacter happinessCharacter = ElementsInstantiation.getChar1();
            GameOverCard happinessMinEnd = new GameOverCard(happinessCharacter, "Sus empleados están extremadamente descontentos con usted. Nadie quiere trabajar sabiendo que es usted quien está al mando...", "Muchos empleados renunciaron de sus trabajos y los que no iniciaron una huelga donde se exigía tu renuncia del cargo. La presión te hizo dimitir del puesto.", ElementsInstantiation.staticIcon("calaveraIcon.png"), this);
            DeathCard happinessMinPanel = new DeathCard(happinessMinEnd);
            MainClass.repaintMenu(happinessMinPanel, cardPanel);
        }
        else if (happinessStat.getValue() == 120) {
            GameCharacter happinessCharacter = ElementsInstantiation.getChar1();
            GameOverCard happinessMaxEnd = new GameOverCard(happinessCharacter, "Los empleados están demasiado felices en sus puestos de trabajo y le tienen mucha confianza. Demasiada tal vez...", "La gente, al saber que no habría consecuencias, se tomaba la libertad de no ir a trabajar o de holgazanear en el trabajo, por lo que la productividad de la empresa cayó dramáticamente.", ElementsInstantiation.staticIcon("calaveraIcon.png"), this);
            DeathCard happinessMaxPanel = new DeathCard(happinessMaxEnd);
            MainClass.repaintMenu(happinessMaxPanel, cardPanel);
        }
        else if (environmentStat.getValue() == 0) {
            GameCharacter environmentCharacter = ElementsInstantiation.getChar2();
            GameOverCard environmentMinEnd = new GameOverCard(environmentCharacter, "El gobierno hoy nos hizo llegar una carta bastante negra para la empresa...", "El gobierno local ha recibido muchas quejas de las actividades de la empresa alegando que el negocio hacía mucho daño al medio ambiente, por lo que decidieron suspender las actividades de la empresa.", ElementsInstantiation.staticIcon("calaveraIcon.png"), this);
            DeathCard environmentMinPanel = new DeathCard(environmentMinEnd);
            MainClass.repaintMenu(environmentMinPanel, cardPanel);
        }
        else if (environmentStat.getValue() == 120) {
            GameCharacter environmentCharacter = ElementsInstantiation.getChar2();
            GameOverCard environmentMaxEnd = new GameOverCard(environmentCharacter, "Hoy me llamó el encargado del cuidado al medio ambiente en el gobierno y me dijo que quiere tener una reunión de urgencia con usted y parece ser grave...", "Los encargados del gobierno te amenazan de muerte diciendo que debes cooperar con ellos, convirtiendo a la empresa en una tapadera para que el gobierno pueda atentar contra el ambiente sin llamar la atención.", ElementsInstantiation.staticIcon("calaveraIcon.png"), this);
            DeathCard environmentMaxPanel = new DeathCard(environmentMaxEnd);
            MainClass.repaintMenu(environmentMaxPanel, cardPanel);
        }
    }
    
    public void showWinPanel() {
        VictoryPanel victory = new VictoryPanel(this);
        MainClass.repaintMenu(victory, cardPanel);
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
    
    public void playAgain() {
        ChoiceCard newChoiceCard = new ChoiceCard();
        MainClass.repaintMenu(newChoiceCard, this);
    }
    
    public void setDateLabel() {
        String date = "";
        date += dates.get(Calendar.DAY_OF_MONTH) + " de " + MainClass.intToMonth(dates.get(Calendar.MONTH)) + " de " + dates.get(Calendar.YEAR);
        dateLabel.setText(date);
    }
    
    public void changeDate() {
        int originalMonth = dates.get(Calendar.MONTH);
        int originalYear = dates.get(Calendar.YEAR);
        int finalMonth, finalYear;
        if (originalMonth+2 <=11) {
            finalMonth = originalMonth+2;
            finalYear = originalYear;
        } else {
            finalYear = originalYear+1;
            finalMonth = originalMonth+2-12;
        }
        dates.set(finalYear, finalMonth, new Random().nextInt(30)+1);
        setDateLabel();
    }
    
    public void setNames() {
        String userName = JOptionPane.showInputDialog("Ingresa tu nombre:");
        String companyName = JOptionPane.showInputDialog("Ingresa el nombre de la compañía:");
        username.setText(userName);
        businessName.setText("C.E.O. de " + companyName);
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
        yesLabel = new javax.swing.JLabel();
        datePanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(520, 650));

        background.setBackground(new java.awt.Color(58, 78, 122));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statsPanel.setBackground(new java.awt.Color(94, 131, 186));
        statsPanel.setPreferredSize(new java.awt.Dimension(520, 180));

        statusBar.setMaximum(120);

        moneyBar.setMaximum(120);

        happinessBar.setMaximum(120);

        environmentBar.setMaximum(120);

        username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("GUI/Bundle"); // NOI18N
        username.setText(bundle.getString("ChoiceCard.username.text")); // NOI18N

        playerIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/empresarioicono.png"))); // NOI18N
        playerIconLabel.setText(bundle.getString("ChoiceCard.playerIconLabel.text")); // NOI18N

        businessName.setEditable(false);
        businessName.setBackground(new java.awt.Color(94, 131, 186));
        businessName.setColumns(20);
        businessName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        businessName.setForeground(new java.awt.Color(255, 255, 255));
        businessName.setLineWrap(true);
        businessName.setRows(5);
        businessName.setText(bundle.getString("ChoiceCard.businessName.text")); // NOI18N
        businessName.setWrapStyleWord(true);
        businessName.setBorder(null);
        businessName.setPreferredSize(new java.awt.Dimension(280, 20));
        jScrollPane1.setViewportView(businessName);

        statusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/reputacionIcon.png"))); // NOI18N
        statusIcon.setText(bundle.getString("ChoiceCard.statusIcon.text")); // NOI18N

        happinessIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/felicidadIcon.png"))); // NOI18N
        happinessIcon.setText(bundle.getString("ChoiceCard.happinessIcon.text")); // NOI18N

        environmentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/arbolIcon.png"))); // NOI18N
        environmentIcon.setText(bundle.getString("ChoiceCard.environmentIcon.text")); // NOI18N

        moneyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/dineroIcon.png"))); // NOI18N
        moneyIcon.setText(bundle.getString("ChoiceCard.moneyIcon.text")); // NOI18N

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

        cardPanel.setBackground(new java.awt.Color(194, 210, 233));

        characterNameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        characterNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        characterNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        characterNameLabel.setText(bundle.getString("ChoiceCard.characterNameLabel.text")); // NOI18N

        characterIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/The_Jester.png"))); // NOI18N
        characterIconLabel.setText(bundle.getString("ChoiceCard.characterIconLabel.text")); // NOI18N

        situationDescription.setEditable(false);
        situationDescription.setBackground(new java.awt.Color(255, 255, 255));
        situationDescription.setColumns(20);
        situationDescription.setForeground(new java.awt.Color(0, 0, 0));
        situationDescription.setLineWrap(true);
        situationDescription.setRows(5);
        situationDescription.setText(bundle.getString("ChoiceCard.situationDescription.text")); // NOI18N
        situationDescription.setWrapStyleWord(true);
        situationDescription.setBorder(null);
        situationPane.setViewportView(situationDescription);

        goLeftPanel.setBackground(new java.awt.Color(194, 210, 233));
        goLeftPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goLeftPanel.setPreferredSize(new java.awt.Dimension(100, 210));
        goLeftPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goLeftPanelMouseClicked(evt);
            }
        });

        noLabel.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        noLabel.setForeground(new java.awt.Color(0, 0, 0));
        noLabel.setText(bundle.getString("ChoiceCard.noLabel.text")); // NOI18N

        javax.swing.GroupLayout goLeftPanelLayout = new javax.swing.GroupLayout(goLeftPanel);
        goLeftPanel.setLayout(goLeftPanelLayout);
        goLeftPanelLayout.setHorizontalGroup(
            goLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, goLeftPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(noLabel)
                .addGap(27, 27, 27))
        );
        goLeftPanelLayout.setVerticalGroup(
            goLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goLeftPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(noLabel)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        goRightPanel.setBackground(new java.awt.Color(194, 210, 233));
        goRightPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goRightPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goRightPanelMouseClicked(evt);
            }
        });

        yesLabel.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        yesLabel.setForeground(new java.awt.Color(0, 0, 0));
        yesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yesLabel.setText(bundle.getString("ChoiceCard.yesLabel.text")); // NOI18N

        javax.swing.GroupLayout goRightPanelLayout = new javax.swing.GroupLayout(goRightPanel);
        goRightPanel.setLayout(goRightPanelLayout);
        goRightPanelLayout.setHorizontalGroup(
            goRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goRightPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(yesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        goRightPanelLayout.setVerticalGroup(
            goRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goRightPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(yesLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(situationPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardPanelLayout.createSequentialGroup()
                        .addComponent(goLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(characterIconLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(characterNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(situationPane, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(goRightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(characterIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(characterNameLabel)
                .addContainerGap())
        );

        background.add(cardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 200, 440, 390));

        datePanel.setBackground(new java.awt.Color(94, 131, 186));

        dateLabel.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 0, 0));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText(bundle.getString("ChoiceCard.dateLabel.text")); // NOI18N

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datePanelLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(dateLabel))
        );

        background.add(datePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 550, 50));

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
        if (gameCards.size() > 1) {
            changeCard(gameCards);
            changeDate();
        }
        
    }//GEN-LAST:event_goRightPanelMouseClicked

    private void goLeftPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goLeftPanelMouseClicked
        choice.executeNoConsequence();
        consequenceOnBars();
        gameState.setTurnCounter(gameState.getTurnCounter() + 1);
        checkIfLoose();
        gameState.checkIfWon(cardPanel);
        if (gameCards.size() > 1) {
            changeCard(gameCards);
            changeDate();
        }
    }//GEN-LAST:event_goLeftPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextArea businessName;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel characterIconLabel;
    private javax.swing.JLabel characterNameLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel datePanel;
    private javax.swing.JProgressBar environmentBar;
    private javax.swing.JLabel environmentIcon;
    private javax.swing.JPanel goLeftPanel;
    private javax.swing.JPanel goRightPanel;
    private javax.swing.JProgressBar happinessBar;
    private javax.swing.JLabel happinessIcon;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel yesLabel;
    // End of variables declaration//GEN-END:variables
}
