import java.util.Scanner;

/**
 * HomeWork6
 */
public class HomeWork6 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Привет в нашем магазине!");

        NoteBook notebook = new NoteBook();
        notebook.AddProduct(new Product("Huawei MateBook D", 256, 8, "Windows 11 Home", "Intel Core i3 1115G4"))
                .AddProduct(new Product("HIPER G16", 512, 16, "Windows 11 Professional", "Intel Core i7 11700"))
                .AddProduct(
                        new Product("ASUS A516JP-EJ461", 512, 16, "без операционной системы", "Intel Core i7 1065G7"))
                .AddProduct(new Product("MSI Sword 17 A11UD-809XRU", 512, 16, "Free DOS", "Intel Core i5 11400H"))
                .AddProduct(new Product("Digma EVE 15 P417", 128, 4, "Windows 10 Home", "Intel Pentium J3710"));

        System.out.println("Введите желаемые характеристики для поиска ноутбука.");
        System.out.println("Критериит для поска: ");
        System.out.println(Product.CreatMapCriteria().entrySet());
        System.out.print("Введите значение: ");
        int selectioNumber = in.nextInt();
        if (selectioNumber == 2 || selectioNumber == 3) {
            int valueSeachCriteria = in.nextInt();
            notebook.FindNoteBook(selectioNumber, valueSeachCriteria);
        } else if (selectioNumber == 1 || selectioNumber == 4 || selectioNumber == 5) {
            String valueSeachCriteria = in.next();
            notebook.FindNoteBook(selectioNumber, valueSeachCriteria);
        } else
            System.out.println("Не верное действие");
        in.close();
    }
}