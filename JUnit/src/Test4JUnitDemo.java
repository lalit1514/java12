import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Test4JUnitDemo {
@ParameterizedTest
@ValueSource(strings= {"Atul","chetan","sahil","divya"})
void display(String word) {
	System.out.println(word);
}
@ParameterizedTest
@ValueSource(ints= {100,200,300,400})
void display(int word) {
	System.out.println(word);
}
}
