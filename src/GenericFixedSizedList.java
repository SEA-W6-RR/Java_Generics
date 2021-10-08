import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GenericFixedSizedList<T> {
    
    private List<T> genericList;

    public GenericFixedSizedList() {
        genericList = new ArrayList<>();;
    }

    public void addElement(T element) {
        if (genericList.size() < 5) {
            genericList.add(element);
        } else {
            System.out.println("So sorry, list's already full!  :-(  :-(");
        }
    }

    public void removeElement(T element) {
        genericList.remove(element);
    }

    public T getElement(int index) {
        return genericList.get(index);
    }

    public int size() {
        return genericList.size();
    }

    public boolean containsElement(T element) {
        return genericList.contains(element);
    }
}
