
/**
 * @author 
 * @version 
 */
public class Punkteliste
{
    private int[] punkte;
    public Punkteliste()
    {
        punkte = new int[5];
    }
    public void setzePunkte(int pIndex, int pPunkte){
        if(pIndex >= 0 && pIndex <= 4){
            punkte[pIndex] = pPunkte;
        }
    }
    public int anzahlBestanden(int pGrenze){
        int bestanden = 0;
        for(int i = 0; i < punkte.length; i++){
            if(punkte[i] >= pGrenze){
                bestanden ++;
            }
        }
        return bestanden;
    }
    public int hoechstePunktzahl(){
        int hoechste = 0;
        for(int i = 0; i < punkte.length; i++){
            if(punkte[i] > hoechste){
                hoechste = punkte[i];
            }
        }
        return hoechste;
    }
    // Dienste

}