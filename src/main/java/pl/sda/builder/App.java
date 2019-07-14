package pl.sda.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {

        User user = new User.Builder().name("Marcin").lastName("Stanisławek").active(true).city("Toruń").password("123456").postalCode("87-100").build();

        System.out.println(user);



    }
}
