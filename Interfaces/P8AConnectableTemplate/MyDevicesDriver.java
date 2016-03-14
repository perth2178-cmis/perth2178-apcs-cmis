import java.util.ArrayList;

public class MyDevicesDriver
   {
   public static void main( String[] args )
      {
      MyPod pod = new MyPod( 32, "Black" );
      MyPhone phone = new MyPhone( 16, "Blue", "AT&T" );
      
      ArrayList<MyDevice> inventory = new ArrayList<MyDevice>(); 
      inventory.add( pod );
      inventory.add( phone );
      
      for( Connectable device : inventory ) 
         {
         device.connectToBluetooth();              
         } // end for each
         
      } // end method main
   } // end class MyDevicesDriver
   