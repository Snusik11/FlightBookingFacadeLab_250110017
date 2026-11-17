public class Main {
    public static void main(String[] args) {
        FlightBookingFacade bookingFacade = new FlightBookingFacade();

        System.out.println("=== Test 1: Standard Successful Booking ===");
        String ticket1 = bookingFacade.bookFlight(
                "Aigerim Nurlan",
                "KC101",
                "12A",
                300.0,
                2,
                25.0,
                "KZT",
                "4111 2222 3333 4444"
        );
        System.out.println("Result 1: " + ticket1);
        System.out.println();

        System.out.println("=== Test 2: Blocked Seat (Row 13) ===");
        String ticket2 = bookingFacade.bookFlight(
                "Timur Serik",
                "KC101",
                "13C",
                250.0,
                1,
                15.0,
                "USD",
                "5500 1111 2222 3333"
        );
        System.out.println("Result 2: " + ticket2);
        System.out.println();

        System.out.println("=== Test 3: Payment Failure Rollback ===");
        String ticket3 = bookingFacade.bookFlight(
                "Dana Alimova",
                "KC101",
                "07D",
                400.0,
                1,
                18.0,
                "EUR",
                "1234"
        );
        System.out.println("Result 3: " + ticket3);
        System.out.println();

        System.out.println("=== Test 4: Phase 2 Silver Loyalty Tier ===");
        String ticket4 = bookingFacade.bookFlight(
                "Arman Kassym",
                "KC204",
                "04B",
                500.0,
                3,
                30.0,
                "USD",
                "4222 3333 4444 5555",
                "SILVER"
        );
        System.out.println("Result 4: " + ticket4);
    }
}
