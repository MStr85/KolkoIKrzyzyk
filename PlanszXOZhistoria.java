package zadanie7.kolkoikrzyzyk;

public class PlanszaXOZhistoria extends PlanszaXO {

    public PlanszaXOZhistoria(PlanszaXO planszaXO) {
        this.krok = planszaXO.getKrok();
        this.plansza = new Element[3][3];
        for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    this.plansza[i][j] = planszaXO.getElement(i, j);
                }
        }   
    }
    
    static PlanszaXO cofnij(PlanszaXOZhistoria planszaXOZ){
        
        return (PlanszaXO) planszaXOZ;
        
    }
    
}
