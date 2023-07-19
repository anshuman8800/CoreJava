public class Main {
    public static void main(String[] args) {
        HourlyEmployee anny = new HourlyEmployee(
                "anny",
                "2000",
                "2023",
                101,
                "2020",
                2000
        );
        System.out.println(anny.toString());

        SalaryEmployee aniket = new SalaryEmployee(
                "aniket",
                "1999",
                "2024",
                102,
                "2015",
                300000,
                false
        );
        System.out.println(aniket.toString());
    }
}