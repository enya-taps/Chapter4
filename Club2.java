import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club2
{
    // Define any necessary fields here ...
    private ArrayList<Membership2> members;

    /**
     * Constructor for objects of class Club
     */
    public Club2()
    {
        // Initialise any fields here ...
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership2 member)
    {
        members.add(member);
    }

    public void remove(Membership2 member){
        members.remove(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }

    public int joinedMonth(int month){
        int count = 0;
        if(month<1 || month > 12){
            System.out.println("The month " + month+ " does not exist.");
            return 0;
        }
        else{
            for(int i = 0; i< members.size(); i++){
                Membership2 mm = members.get(i);
                if(mm.getMonth() == month){
                    count++;
                }
            }
            return count;
        }
    }

    public ArrayList<Membership2> remove(int month, int year){

        ArrayList<Membership2> removings = new ArrayList<>();
        
        if(month<1 || month > 12){
            System.out.println("The month " + month+ " does not exist.");
            return removings;
        }
        else{
            for(int i = 0; i< members.size(); i++){
                Membership2 mm = members.get(i);
                if(mm.getMonth() == month){
                    removings.add(mm);
                    members.remove(mm);
                }
            }
            return removings;
        }
    }

}
