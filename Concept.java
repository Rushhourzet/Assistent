import java.util.ArrayList;

public class Concept {
//_____________________________________Data_Fields_____________________________________
    String name;
    ArrayList<String> keyWords;
    ArrayList<ArrayList<Byte>> kw_weights;
    ArrayList<Concept> linkedConcepts;
    ArrayList<ArrayList<Byte>> lc_weights;
//____________________________________Constructor_______________________________________
    public Concept(String name){
        keyWords = new ArrayList<>();
        kw_weights = new ArrayList<>();
        linkedConcepts = new ArrayList<>();
        lc_weights = new ArrayList<>();
    }
//_____________________________________Setter______________________________________
    public void setNewName(String newName){
        name = newName;
    }
//_____________________________________Getter_____________________________________________
    public String getName(){
        return name;
    }
//_____________________________________Primary_Methods______________________________________
    public void addLinkedConcept(Concept conceptToAdd, Byte weight){
        for (Concept c : linkedConcepts) {
            if(c.getName().equals(conceptToAdd.getName())){
                System.err.println("Concept already exists");
                //instead add weight to already existing linkedConcept
            }
        }
        linkedConcepts.add(conceptToAdd);
        lc_weights.add(new ArrayList<>());
        lc_weights.get(0).add(weight);
    }
}