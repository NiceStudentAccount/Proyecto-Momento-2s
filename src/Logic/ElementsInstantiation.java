/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Data.Consequence;
import Data.DecisionCard;
import Data.GameCharacter;
import Data.Stat;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author samyg
 */
public class ElementsInstantiation {
    private static Stat statusStat = new Stat(60);
    private static Stat moneyStat = new Stat(60);
    private static Stat happinessStat = new Stat(60);
    private static Stat environmentStat = new Stat(60);

    public static Stat getStatusStat() {
        return statusStat;
    }

    public static Stat getMoneyStat() {
        return moneyStat;
    }

    public static Stat getHappinessStat() {
        return happinessStat;
    }

    public static Stat getEnvironmentStat() {
        return environmentStat;
    }
    
    //------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon1 = new Consequence(new HashMap<Stat, Integer>() {{put(moneyStat, -20); put(happinessStat, 20);}});
    private static Consequence noCon1 = new Consequence(new HashMap<Stat, Integer>() {{put(happinessStat, -20); put(moneyStat, 20);}});
    private static String charName1 = "Juan el xd";
    private static Icon charIcon1 = staticIcon("The_Barbarian.png");
    private static GameCharacter character1 = new GameCharacter(charIcon1, charName1, "Jefe");
    private static String situation1 = "Sexo?";
    private static DecisionCard card1 = new DecisionCard(character1, situation1, yesCon1, noCon1);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon2 = new Consequence(new HashMap<Stat, Integer>() {{put(statusStat, -20); put(environmentStat, 20);}});
    private static Consequence noCon2 = new Consequence(new HashMap<Stat, Integer>() {{put(environmentStat, -20); put(statusStat, 20);}});
    private static String charName2 = "Juan el xd";
    private static Icon charIcon2 = staticIcon("The_Barbarian.png");
    private static GameCharacter character2 = new GameCharacter(charIcon2, charName2, "Jefe");
    private static String situation2 = "Coito?";
    private static DecisionCard card2 = new DecisionCard(character2, situation2, yesCon2, noCon2);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon3 = new Consequence(new HashMap<Stat, Integer>() {{put(environmentStat, -20); put(moneyStat, 20);}});
    private static Consequence noCon3 = new Consequence(new HashMap<Stat, Integer>() {{put(moneyStat, -20); put(environmentStat, 20);}});
    private static String charName3 = "Juan el xd";
    private static Icon charIcon3 = staticIcon("The_Barbarian.png");
    private static GameCharacter character3 = new GameCharacter(charIcon3, charName3, "Jefe");
    private static String situation3 = "Copulación?";
    private static DecisionCard card3 = new DecisionCard(character3, situation3, yesCon3, noCon3);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon4 = new Consequence(new HashMap<Stat, Integer>() {{put(happinessStat, -20); put(statusStat, 20);}});
    private static Consequence noCon4 = new Consequence(new HashMap<Stat, Integer>() {{put(statusStat, -20); put(happinessStat, 20);}});
    private static String charName4 = "Juan el xd";
    private static Icon charIcon4 = staticIcon("The_Barbarian.png");
    private static GameCharacter character4 = new GameCharacter(charIcon4, charName4, "Jefe");
    private static String situation4 = "Relaciones sexuales?";
    private static DecisionCard card4 = new DecisionCard(character4, situation4, yesCon4, noCon4);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon5 = new Consequence(new HashMap<Stat, Integer>() {{put(environmentStat, -20); put(happinessStat, 20);}});
    private static Consequence noCon5 = new Consequence(new HashMap<Stat, Integer>() {{put(happinessStat, -20); put(environmentStat, 20);}});
    private static String charName5 = "Juan el xd";
    private static Icon charIcon5 = staticIcon("The_Barbarian.png");
    private static GameCharacter character5 = new GameCharacter(charIcon5, charName5, "Jefe");
    private static String situation5 = "Masturbación?";
    private static DecisionCard card5 = new DecisionCard(character5, situation5, yesCon5, noCon5);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon6 = new Consequence(new HashMap<Stat, Integer>() {{put(moneyStat, -20); put(statusStat, 20);}});
    private static Consequence noCon6 = new Consequence(new HashMap<Stat, Integer>() {{put(statusStat, -20); put(moneyStat, 20);}});
    private static String charName6 = "Juan el xd";
    private static Icon charIcon6 = staticIcon("The_Barbarian.png");
    private static GameCharacter character6 = new GameCharacter(charIcon6, charName6, "Jefe");
    private static String situation6 = "Tabaco?";
    private static DecisionCard card6 = new DecisionCard(character6, situation6, yesCon6, noCon6);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon7 = new Consequence(new HashMap<Stat, Integer>() {{put(moneyStat, -20); put(happinessStat, 20);}});
    private static Consequence noCon7 = new Consequence(new HashMap<Stat, Integer>() {{put(happinessStat, -20); put(moneyStat, 20);}});
    private static String charName7 = "Juan el xd";
    private static Icon charIcon7 = staticIcon("The_Barbarian.png");
    private static GameCharacter character7 = new GameCharacter(charIcon7, charName7, "Jefe");
    private static String situation7 = "Cigarros?";
    private static DecisionCard card7 = new DecisionCard(character7, situation7, yesCon7, noCon7);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon8 = new Consequence(new HashMap<Stat, Integer>() {{put(statusStat, -20); put(environmentStat, 20);}});
    private static Consequence noCon8 = new Consequence(new HashMap<Stat, Integer>() {{put(environmentStat, -20); put(statusStat, 20);}});
    private static String charName8 = "Juan el xd";
    private static Icon charIcon8 = staticIcon("The_Barbarian.png");
    private static GameCharacter character8 = new GameCharacter(charIcon8, charName8, "Jefe");
    private static String situation8 = "Vicio?";
    private static DecisionCard card8 = new DecisionCard(character8, situation8, yesCon8, noCon8);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon9 = new Consequence(new HashMap<Stat, Integer>() {{put(environmentStat, -20); put(moneyStat, 20);}});
    private static Consequence noCon9 = new Consequence(new HashMap<Stat, Integer>() {{put(moneyStat, -20); put(environmentStat, 20);}});
    private static String charName9 = "Juan el xd";
    private static Icon charIcon9 = staticIcon("The_Barbarian.png");
    private static GameCharacter character9 = new GameCharacter(charIcon9, charName9, "Jefe");
    private static String situation9 = "Droga?";
    private static DecisionCard card9 = new DecisionCard(character9, situation9, yesCon9, noCon9);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon10 = new Consequence(new HashMap<Stat, Integer>() {{put(happinessStat, -20); put(statusStat, 20);}});
    private static Consequence noCon10 = new Consequence(new HashMap<Stat, Integer>() {{put(statusStat, -20); put(happinessStat, 20);}});
    private static String charName10 = "Juan el xd";
    private static Icon charIcon10 = staticIcon("The_Barbarian.png");
    private static GameCharacter character10 = new GameCharacter(charIcon10, charName10, "Jefe");
    private static String situation10 = "Estupefacientes?";
    private static DecisionCard card10 = new DecisionCard(character10, situation10, yesCon10, noCon10);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon11 = new Consequence(new HashMap<Stat, Integer>() {{put(environmentStat, -20); put(happinessStat, 20);}});
    private static Consequence noCon11 = new Consequence(new HashMap<Stat, Integer>() {{put(happinessStat, -20); put(environmentStat, 20);}});
    private static String charName11 = "Juan el xd";
    private static Icon charIcon11 = staticIcon("The_Barbarian.png");
    private static GameCharacter character11 = new GameCharacter(charIcon11, charName11, "Jefe");
    private static String situation11 = "Narcóticos?";
    private static DecisionCard card11 = new DecisionCard(character11, situation11, yesCon11, noCon11);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon12 = new Consequence(new HashMap<Stat, Integer>() {{put(moneyStat, -20); put(statusStat, 20);}});
    private static Consequence noCon12 = new Consequence(new HashMap<Stat, Integer>() {{put(statusStat, -20); put(moneyStat, 20);}});
    private static String charName12 = "Juan el xd";
    private static Icon charIcon12 = staticIcon("The_Barbarian.png");
    private static GameCharacter character12 = new GameCharacter(charIcon12, charName12, "Jefe");
    private static String situation12 = "Psicotrópicos?";
    private static DecisionCard card12 = new DecisionCard(character12, situation12, yesCon12, noCon12);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon13 = new Consequence(new HashMap<Stat, Integer>() {{put(moneyStat, -20); put(happinessStat, 20);}});
    private static Consequence noCon13 = new Consequence(new HashMap<Stat, Integer>() {{put(happinessStat, -20); put(moneyStat, 20);}});
    private static String charName13 = "Juan el xd";
    private static Icon charIcon13 = staticIcon("The_Barbarian.png");
    private static GameCharacter character13 = new GameCharacter(charIcon13, charName13, "Jefe");
    private static String situation13 = "Psicoactivos?";
    private static DecisionCard card13 = new DecisionCard(character13, situation13, yesCon13, noCon13);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon14 = new Consequence(new HashMap<Stat, Integer>() {{put(statusStat, -20); put(environmentStat, 20);}});
    private static Consequence noCon14 = new Consequence(new HashMap<Stat, Integer>() {{put(environmentStat, -20); put(statusStat, 20);}});
    private static String charName14 = "Juan el xd";
    private static Icon charIcon14 = staticIcon("The_Barbarian.png");
    private static GameCharacter character14 = new GameCharacter(charIcon14, charName14, "Jefe");
    private static String situation14 = "Trago?";
    private static DecisionCard card14 = new DecisionCard(character14, situation14, yesCon14, noCon14);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon15 = new Consequence(new HashMap<Stat, Integer>() {{put(environmentStat, -20); put(moneyStat, 20);}});
    private static Consequence noCon15 = new Consequence(new HashMap<Stat, Integer>() {{put(moneyStat, -20); put(environmentStat, 20);}});
    private static String charName15 = "Juan el xd";
    private static Icon charIcon15 = staticIcon("The_Barbarian.png");
    private static GameCharacter character15 = new GameCharacter(charIcon15, charName15, "Jefe");
    private static String situation15 = "Alcohol?";
    private static DecisionCard card15 = new DecisionCard(character15, situation15, yesCon15, noCon15);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon16 = new Consequence(new HashMap<Stat, Integer>() {{put(happinessStat, -20); put(statusStat, 20);}});
    private static Consequence noCon16 = new Consequence(new HashMap<Stat, Integer>() {{put(statusStat, -20); put(happinessStat, 20);}});
    private static String charName16 = "Juan el xd";
    private static Icon charIcon16 = staticIcon("The_Barbarian.png");
    private static GameCharacter character16 = new GameCharacter(charIcon16, charName16, "Jefe");
    private static String situation16 = "Café?";
    private static DecisionCard card16 = new DecisionCard(character16, situation16, yesCon16, noCon16);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon17 = new Consequence(new HashMap<Stat, Integer>() {{put(environmentStat, -20); put(happinessStat, 20);}});
    private static Consequence noCon17 = new Consequence(new HashMap<Stat, Integer>() {{put(happinessStat, -20); put(environmentStat, 20);}});
    private static String charName17 = "Juan el xd";
    private static Icon charIcon17 = staticIcon("The_Barbarian.png");
    private static GameCharacter character17 = new GameCharacter(charIcon17, charName17, "Jefe");
    private static String situation17 = "Dopamina?";
    private static DecisionCard card17 = new DecisionCard(character17, situation17, yesCon17, noCon17);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon18 = new Consequence(new HashMap<Stat, Integer>() {{put(moneyStat, -20); put(statusStat, 20);}});
    private static Consequence noCon18 = new Consequence(new HashMap<Stat, Integer>() {{put(statusStat, -20); put(moneyStat, 20);}});
    private static String charName18 = "Juan el xd";
    private static Icon charIcon18 = staticIcon("The_Barbarian.png");
    private static GameCharacter character18 = new GameCharacter(charIcon18, charName18, "Jefe");
    private static String situation18 = "Galleta?";
    private static DecisionCard card18 = new DecisionCard(character18, situation18, yesCon18, noCon18);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon19 = new Consequence(new HashMap<Stat, Integer>() {{put(moneyStat, -20); put(happinessStat, 20);}});
    private static Consequence noCon19 = new Consequence(new HashMap<Stat, Integer>() {{put(happinessStat, -20); put(moneyStat, 20);}});
    private static String charName19 = "Juan el xd";
    private static Icon charIcon19 = staticIcon("The_Barbarian.png");
    private static GameCharacter character19 = new GameCharacter(charIcon19, charName19, "Jefe");
    private static String situation19 = "Abrazo?";
    private static DecisionCard card19 = new DecisionCard(character19, situation19, yesCon19, noCon19);
    //-------------------------------------------------------------------------------------------------------------------------------------------
    private static Consequence yesCon20 = new Consequence(new HashMap<Stat, Integer>() {{put(statusStat, -20); put(environmentStat, 20);}});
    private static Consequence noCon20 = new Consequence(new HashMap<Stat, Integer>() {{put(environmentStat, -20); put(statusStat, 20);}});
    private static String charName20 = "Juan el xd";
    private static Icon charIcon20 = staticIcon("The_Barbarian.png");
    private static GameCharacter character20 = new GameCharacter(charIcon20, charName20, "Jefe");
    private static String situation20 = "Amor?";
    private static DecisionCard card20 = new DecisionCard(character20, situation20, yesCon20, noCon20);
    //-------------------------------------------------------------------------------------------------------------------------------------------

    public static GameCharacter getCharacter1() {
        return character1;
    }

    public static GameCharacter getCharacter2() {
        return character2;
    }

    public static GameCharacter getCharacter3() {
        return character3;
    }

    public static GameCharacter getCharacter4() {
        return character4;
    }
    
    public static void resetStats() {
        statusStat.setValue(60);
        moneyStat.setValue(60);
        happinessStat.setValue(60);
        environmentStat.setValue(60);
    }
    
    
    
    public static Icon staticIcon(String path) {
        URL resource = ElementsInstantiation.class.getResource("/Sources/" + path);
        return new ImageIcon(resource);
    }
    
    public static List<DecisionCard> createDecisionsList() {
        List<DecisionCard> decisionList = new ArrayList<>();
        decisionList.add(card1);
        decisionList.add(card2);
        decisionList.add(card3);
        decisionList.add(card4);
        decisionList.add(card5);
        decisionList.add(card6);
        decisionList.add(card7);
        decisionList.add(card8);
        decisionList.add(card9);
        decisionList.add(card10);
        decisionList.add(card11);
        decisionList.add(card12);
        decisionList.add(card13);
        decisionList.add(card14);
        decisionList.add(card15);
        decisionList.add(card16);
        decisionList.add(card17);
        decisionList.add(card18);
        decisionList.add(card19);
        decisionList.add(card20);
        Collections.shuffle(decisionList);
        return decisionList;
    }
}
