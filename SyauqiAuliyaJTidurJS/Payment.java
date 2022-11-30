package SyauqiAuliyaJTidurJS;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 * Write a description of class Payment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payment extends Invoice
{
    
    public Date to;
    public Date from;
    private int roomId;
    
    public Payment(int id, int buyerId, int renterId, int roomId, Date from, Date to)
    {
      super(id, buyerId, renterId); 
      this.from = from;
      this.to = to;
      this.roomId = roomId;
    }
    
     public Payment (int id, Account buyer, Renter renter, int roomId, Date from, Date to ){
      super(id, buyer, renter); 
      this.from = from;
      this.to = to;
      this.roomId = roomId;
    }
    
     public static boolean availability(Date from,Date to,Room room){
        if(to.before(from))
            return false;
        else if(room.booked.size() == 0) {
            return true;
        } else {
            
             for (Date count : room.booked){
            if((count.after(from) && count.before(to)) || count.equals(from))
                return false;
            }
        return true;
        }
    }
    
    public static boolean makeBooking(Date from,Date to,Room room){

        if(availability(from, to, room)){
            while (from.before(to)){
                room.booked.add(from);
                Calendar c = Calendar.getInstance();
                c.setTime(from);
                c.add(Calendar.DATE, 1);
                from = c.getTime();
            }return true;

        }return false;

    }
    
    public String getTime(){
      SimpleDateFormat sdformat = new SimpleDateFormat ("dd MMMM yyyy");
      return "Formatted date = " + sdformat.format(time.getTime());
    }
    
    public String print(){
        return "to: " + to + "\n" + "From: " + from + "\n" + "roomId: " + roomId;
    }
    
    public int getRoomId(){
        return roomId;
    }


}
