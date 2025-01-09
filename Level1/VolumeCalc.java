public class VolumeCalc{
    public static void main(String[] args){
        // Created a int variable to store the radius and assigned 6378
        int radiusInKm = 6378;
        // Calculation of volume in km^3
        double volumeInKm = ((double)4/3) * 3.14 * radiusInKm *radiusInKm * radiusInKm;
        // converting radius to miles
        double volumeInMiles = 1.6 * 1.6 * 1.6 * volumeInKm;
        // Output the Result
        
        System.out.println("The volume of earth in cubic kilomneter is "+String.format("%.2f",volumeInKm) +" and cubic miles is " + String.format("%.2f",volumeInMiles));
    }
}

