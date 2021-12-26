package dataStructures.queue;

public class CurcularTour {

	public static void main(String[] args) {

		System.out.println(tour(new int[]{77, 61, 40, 69}, new int[]{55, 52, 33, 100}));

	}

	static int tour(int petrol[], int distance[]) {
		int start = 0, requiredFuel = 0, extraFuel=0;
		int n = petrol.length;
		for(int i=0; i<n; i++) {
			extraFuel += (petrol[i] - distance[i]);
			if(extraFuel<0) {
				start = i+1;
				requiredFuel +=  extraFuel;
				extraFuel = 0;
			}
		}
		if(requiredFuel + extraFuel >=0) {
			return start;
		}
		return -1;
	}

}
