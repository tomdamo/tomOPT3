public class VerzekeringKorting {

    public double berekenKorting(int dagenVerzekerd) {

        if ((0 <= dagenVerzekerd) && (dagenVerzekerd < 15)) {
             return 1.00; //geen korting
        } else if ((dagenVerzekerd >= 15) && (dagenVerzekerd < 30)) {
            return 0.95; //5% korting
        } else if (dagenVerzekerd >= 30) {
            return 0.90; //10% korting. verzekering prijs * dit
        }
        return 1.00;
    }
}
