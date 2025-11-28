public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Matrix", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("Gabriel");
        customer.addRental(rental);

        System.out.println(customer.statement());
    }
}

