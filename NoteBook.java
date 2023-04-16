import java.util.ArrayList;
import java.util.List;

public class NoteBook {

    public static List<Product> noteBook = new ArrayList<>();

    public NoteBook AddProduct(Product product) {
        noteBook.add(product);
        return this;
    }

    public static List<Product> GetNoteBook() {
        return noteBook;
    }

    public void FindNoteBook(int searchCriteria, int valueSeachCriteria) {
        for (int i = 0; i < NoteBook.GetNoteBook().size(); i++) {
            if (GetNoteBook().get(i).CreatListOperaion().get(searchCriteria - 1).equals(valueSeachCriteria)) {
                System.out.println(NoteBook.GetNoteBook().get(i).toString());
            }
        }
    }

    public void FindNoteBook(int searchCriteria, String valueSeachCriteria) {
        for (int i = 0; i < NoteBook.GetNoteBook().size(); i++) {
            if (GetNoteBook().get(i).CreatListOperaion().get(searchCriteria - 1).equals(valueSeachCriteria)) {
                System.out.println(NoteBook.GetNoteBook().get(i).toString());
            }
        }
    }
}
