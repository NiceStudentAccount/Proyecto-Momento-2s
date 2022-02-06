/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author samyg
 */
public class TutorialCard extends Card {
    private String aspectToTeach;

    public TutorialCard(GameCharacter character, String description, String aspectToTeach) {
        super(character, description);
        this.aspectToTeach = aspectToTeach;
    }

    public String getAspectToTeach() {
        return aspectToTeach;
    }

    public void setAspectToTeach(String aspectToTeach) {
        this.aspectToTeach = aspectToTeach;
    }

    
    
}
