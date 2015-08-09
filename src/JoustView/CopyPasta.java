package JoustView;
import java.text.DecimalFormat;

import org.json.*;

public class CopyPasta {
	public void printMyJobIsDone(double result) {
		DecimalFormat f = new DecimalFormat("##.00");
		System.out.println("Probability of victory!: " + f.format(result*100) + "%");
	}
}
