
/**
 * Beschreiben Sie hier die Klasse whileloop.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class whileloop4
{
    public void multiplesOfFive(){
        int number = 5;
        while(number<95){
            System.out.println(number);
            number += 5;
        }
    }

    public void addOneToTen(){
        int idx = 1;
        int number =0;
        while(idx<=10){
            number += idx; 
            idx++;
        }
        System.out.println(number);
    }

    public void summing(int start, int end){
        int begin = start;
        int pass = end;

        int sum = 0;
        while(begin<=pass){
            sum += begin;
            begin++;
        }
        System.out.println(sum);
    }

}
