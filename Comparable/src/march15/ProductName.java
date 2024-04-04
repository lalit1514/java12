package march15;

import java.util.Comparator;

public class ProductName implements Comparator<Product> {
public int compare(product o1, product o2) {
	return o1.getPname().compareTo(o2.getPname());  
}
}
