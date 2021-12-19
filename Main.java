public class Main {
    public static void main(String[] args) {
        task one = new task("NAME", "DESC", 2027, 11, 23, 12, 34, 00, "admin@admin.ru" );
        System.out.println(one.getDate());
        one.setDate(2023, 11, 23, 12, 34, 00);
        System.out.println(one.getDate());
    }
}
