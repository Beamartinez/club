import java.util.ArrayList;
import java.util.Iterator;

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
    
    /** 
      * Todos los socios que se han dado de alta un determinado mes de un determinado año se
      * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
      * por pantalla el error.
      * @param month El mes en el que estamos interesados
      * @param year El año en el que estamos interesados
      * @return Una coleccion con los socios que se han dado de baja del club
      */
    public ArrayList<Membership> purge(int month, int year)
    {
        //lista de los socios
        ArrayList<Membership> purg = new ArrayList<Membership>();
        if ((month >= 1) && (month <= 12))
        {
            Iterator<Membership> it = members.iterator();
            //vemos si corresponde el miembro con el mes y año de la baja
            while (it.hasNext())
            {
                Membership member = it.next();
                if ((member.getMonth() == month) && (member.getYear() == year))
                {
                    purg.add(member);
                    //si corresponde se borra y se guarda en purg
                    it.remove();
                }
            }
        }
        else
        {
            System.out.println("El valor introducido no es valido, no es un mes");
        }
        return purg;
    }
}
