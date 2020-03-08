
public class ScratchOne {

	
	const CONVERSION = 1.609;
    
    public static double toMilesPerHour(double: kilometersPerHour){
        return kilometersPerHour * CONVERSION;
    }
    
    public static void printConversion( double : kilometersPerHour){
        String km = str(kilometersPerHour);
        String mi = str( toMilesPerHour(kilometersPerHour) );
        
        System.out.println( km + "km/h = " + mi + " mi/h" );
    }
}
