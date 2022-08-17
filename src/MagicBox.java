import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public void magicBox(T[] items) {
        this.items = items;
    }

    int emptyCell = 0;

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                emptyCell++;
                return true;
            }
        }
        return false;
    }

    public <T> T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна и осталось заполнить ещё ячейки в количестве " + (items.length - emptyCell));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return (T) items[randomInt];
    }
}
