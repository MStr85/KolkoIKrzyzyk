package zadanie7.kolkoikrzyzyk;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class PlanszaXO {

	int krok;

	final int gra_trwa = 0;
	final int sukcesX = 1;
	final int sukcesO = 2;
	final int remis = 3;

	Element[][] plansza;

	public PlanszaXO() {
                krok = 1;
		plansza = new Element[3][3];
	}
        
        public Element[][] getPlansza(){
            return plansza;
        }
        
        public void setPlansza(Element[][] plansza){
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    this.plansza[i][j] = plansza[i][j];
                }
            }
        }

	public int getKrok() {
		return krok;
	}

	public void setKrok(int krok) {
		this.krok = krok;
	}
        
        public Element getElement(int i, int j){
            return plansza[i][j];
        }
        
        public void setElement(int i, int j, Element element){
            this.plansza[i][j] = element;
        }

	boolean dodajElement(int x, int y, Element rodzajElementu) {
		if (plansza[x][y] == null && stanGry() ==  gra_trwa) {
			return true;
		} else
			return false;
	}

	boolean wygranaX() {
		if ((plansza[0][0] == Element.X && plansza[0][1] == Element.X && plansza[0][2] == Element.X)
				|| (plansza[1][0] == Element.X && plansza[1][1] == Element.X && plansza[1][2] == Element.X)
				|| (plansza[2][0] == Element.X && plansza[2][1] == Element.X && plansza[2][2] == Element.X)
				|| (plansza[0][0] == Element.X && plansza[1][0] == Element.X && plansza[2][0] == Element.X)
				|| (plansza[0][1] == Element.X && plansza[1][1] == Element.X && plansza[2][1] == Element.X)
				|| (plansza[0][2] == Element.X && plansza[1][2] == Element.X && plansza[2][2] == Element.X)
				|| (plansza[0][0] == Element.X && plansza[1][1] == Element.X && plansza[2][2] == Element.X)
				|| (plansza[2][0] == Element.X && plansza[1][1] == Element.X && plansza[0][2] == Element.X)) {
			return true;
		} else {
			return false;
		}
	}

	boolean wygranaO() {
		if ((plansza[0][0] == Element.O && plansza[0][1] == Element.O && plansza[0][2] == Element.O)
				|| (plansza[1][0] == Element.O && plansza[1][1] == Element.O && plansza[1][2] == Element.O)
				|| (plansza[2][0] == Element.O && plansza[2][1] == Element.O && plansza[2][2] == Element.O)
				|| (plansza[0][0] == Element.O && plansza[1][0] == Element.O && plansza[2][0] == Element.O)
				|| (plansza[0][1] == Element.O && plansza[1][1] == Element.O && plansza[2][1] == Element.O)
				|| (plansza[0][2] == Element.O && plansza[1][2] == Element.O && plansza[2][2] == Element.O)
				|| (plansza[0][0] == Element.O && plansza[1][1] == Element.O && plansza[2][2] == Element.O)
				|| (plansza[2][0] == Element.O && plansza[1][1] == Element.O && plansza[0][2] == Element.O)) {
			return true;
		} else {
			return false;
		}
	}

	boolean remis() {
		if (plansza[0][0] != null && plansza[0][1] != null && plansza[0][1] != null && 
                    plansza[1][0] != null && plansza[1][1] != null && plansza[0][2] != null && 
                    plansza[2][0] != null && plansza[2][1] != null && plansza[2][2] != null) {
			return true;
		} else {
			return false;
		}
	}

	int stanGry() {
		if (wygranaX()) {
			return sukcesX;
		}
		if (wygranaO()) {
			return sukcesO;
		}
		if (remis()) {
			return remis;
                }
		return gra_trwa;
		
	}

	Element czyjRuch() {
		if (krok % 2 == 1) {
			return Element.X;
		} else {
			return Element.O;
		}
	}

	@Override
	public String toString() {
		String wynik = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (plansza[i][j]!=null) {
					wynik = wynik + " " + plansza[i][j];
				} else {
					wynik = wynik + "  ";
				}
				
			} wynik = wynik + "\n";
		}
		return wynik;
	}
        
        void wykonajRuch(int x, int y){
           
                plansza[x][y] = czyjRuch();
                switch (stanGry())
                {
                case sukcesX: JOptionPane.showMessageDialog(null, "Wygrały krzyżyki! Gratulacje!"); krok++;break;
                case sukcesO: JOptionPane.showMessageDialog(null, "Wygrały kółka! Gratulacje!"); krok++;break;
                case remis: JOptionPane.showMessageDialog(null, "Gra zakończona remisem!"); krok++;break;
                case gra_trwa: krok++; break;
                } 
             
        }
}
