public class Main {

    public static void main(String[] args) {
        System.out.println("������������ ���������� ������� ��� �����: ");

        MagicBox<String> box1 = new MagicBox<>();
        box1.magicBox(new String[2]);
        System.out.println(box1.add("�������"));
        System.out.println(box1.add("����"));
        System.out.println(box1.add("������"));
        System.out.println((String) box1.pick());

        System.out.println();
        System.out.println("������������ ���������� ������� ��� �����: ");

        MagicBox<Integer> box2 = new MagicBox<>();
        box2.magicBox(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(box2.add(6));
        System.out.println((Integer) box2.pick());
    }
}
