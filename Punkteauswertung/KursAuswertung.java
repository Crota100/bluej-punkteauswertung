
/**
 * @author 
 * @version 
 */
public class KursAuswertung
{
    private Punkteliste liste;
    public KursAuswertung(Punkteliste pPunkteliste)
    {
        liste = pPunkteliste;
    }
    public String beurteile(int pGrenze){
        if(liste.anzahlBestanden(pGrenze) > 3){
            return "Die Mehrheit hat bestanden.";
        }
        else{
            return "Die Mehrheit hat nicht bestanden.";
        }
    }
    // Dienste

}