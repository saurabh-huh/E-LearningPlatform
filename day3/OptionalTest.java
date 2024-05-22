package training.day3;
import java.util.Optional;

public class OptionalTest {

    // Driver code
    public static void main(String[] args)
    {

        // creating a string array
        String[] str = new String[5];

        str[2] = "Classes are coming soon";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        System.out.println(empty.hashCode());

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        //return true or false according to availability

        System.out.println(value.isPresent());

        System.out.println(-value.hashCode());
        System.out.println(value.get());
    }
}
