import java.util.Scanner;
import java.util.ArrayList;

public class ManageStudent {
    // Ứng dụng Quản lý Danh bạ / Học sinh
    // Mô tả: Tạo một chương trình cho phép lưu trữ danh sách học sinh hoặc số điện thoại bằng Mảng (Array).
    // Tính năng cần có (CRUD cơ bản):
    // Hiển thị menu lựa chọn (1. Thêm, 2. Sửa, 3. Xóa, 4. Xem, 5. Thoát) bằng vòng lặp while và switch...case.
    // Tìm kiếm học sinh ID.
    // Kỹ năng rèn luyện: Thao tác với mảng, xử lý chuỗi (String), chia nhỏ logic vào các Methods.
    // Làm sơ sơ để qua OOP

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> listId = new ArrayList<>();
    static ArrayList<String> listName = new ArrayList<>();
    static ArrayList<String> listClassName = new ArrayList<>();

    public static void showOneStudent(){

        System.out.print("Nhập ID cần xem thông tin: ");

        int idShow = sc.nextInt();
        sc.nextLine();

        boolean isFound = false;

        for (int i = 0; i < listId.size(); i++){

            if (idShow == listId.get(i)){

                isFound = true;
                System.out.println("ID: " + listId.get(i) + " - Tên: " + listName.get(i) + " - Lớp: " + listClassName.get(i));
                break;

            }

        }

        if (!isFound){

            System.out.println("Không tìm thấy ID");

        }

    }

    public static void addStudent(){

        System.out.println("Nhập ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập Tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập Lớp: ");
        String className = sc.nextLine();

        listId.add(id);
        listName.add(name);
        listClassName.add(className);

        System.out.println("Thêm thành công");

    }

    public static void updateStudent(){

        System.out.print("Nhập ID cần sửa thông tin: ");

        int idShow = sc.nextInt();
        sc.nextLine();

        boolean isFound = false;

        for (int i = 0; i < listId.size(); i++){

            if (idShow == listId.get(i)){

                isFound = true;
                System.out.println("Nhập Tên: ");
                String name = sc.nextLine();

                System.out.println("Nhập Lớp: ");
                String className = sc.nextLine();

                listName.set(i, name);
                listClassName.set(i, className);
                System.out.println("Sửa thành công");
                break;

            }

        }

        if (!isFound){

            System.out.println("Không tìm thấy ID");

        }

    }

    public static void deleteStudent(){

        System.out.print("Nhập ID cần xoá thông tin: ");

        int idShow = sc.nextInt();
        sc.nextLine();

        boolean isFound = false;

        for (int i = 0; i < listId.size(); i++){

            if (idShow == listId.get(i)){

                isFound = true;
                listId.remove(i);
                listName.remove(i);
                listClassName.remove(i);
                System.out.println("Xoá thành công");
                break;

            }

        }

        if (!isFound){

            System.out.println("Không tìm thấy ID");

        }

    }

    public static void main(String[] args){

        int choice;

        do {

            System.out.println("1. Xem thông tin học sinh");
            System.out.println("2. Thêm thông tin học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xoá thông tin học sinh");
            System.out.println("0. Thoát");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){

                case 1:
                    showOneStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Nhập đúng từ 0 đến 4");
            }

        } while (choice != 0);

        sc.close();

    }

}

