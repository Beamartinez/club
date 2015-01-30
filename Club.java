import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        this.members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        this.members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return this.members.size();
    }
    
    /** 
      * Calcula el numero de socios que se dieron de alta en un mes determinado. 
      * El año no nos importa. En caso de que el parametro contenga un valor 
      * no valido se muestra por pantalla el error.
      * @param month El mes en el que estamos interesados
      * @return El numero de socios que se dieron de alta dicho mes
      */
    public int joinedMonth(int month)
    {
        int count = 0;
        if (month >= 1 && month <=12)
        {
            for (Membership member : members)
            {
                if (member.getMonth() == month)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
