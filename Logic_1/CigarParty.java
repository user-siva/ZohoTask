package Logic_1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (isWeekend && cigars >= 40) || cigars >= 40 && cigars <= 60;
    }

}