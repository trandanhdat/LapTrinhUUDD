package baiUUDD;
import java.util.*;

public class DataInitializer {
    public static List<ClassRoom> initializeData() {
        List<ClassRoom> classRooms = new ArrayList<>();

        // Lớp CNTT1
        ClassRoom class1 = new ClassRoom("CNTT1");
        class1.addStudent(new Student("Nguyen", "Minh Hieu", "2003-03-27", "Ha Noi", "CNTT1",
                Map.of("Lập trình hướng đối tượng", 9, "Quản lý dự án", 8, "Học Máy", 8, "Cơ sở dữ liệu", 5, "Lập trình ứng dụng cho TBDĐ", 9)));
        
        class1.addStudent(new Student("Nguyen", "Anh Huy", "2003-02-01", "Hai Phong", "CNTT1",
                Map.of("Lập trình hướng đối tượng", 6, "Quản lý dự án", 7, "Học Máy", 6, "Cơ sở dữ liệu", 5, "Lập trình ứng dụng cho TBDĐ", 8)));

        class1.addStudent(new Student("Pham", "Thanh Long", "2002-06-10", "Ha Noi", "CNTT1",
                Map.of("Lập trình hướng đối tượng", 8, "Quản lý dự án", 7, "Học Máy", 9, "Cơ sở dữ liệu", 6, "Lập trình ứng dụng cho TBDĐ", 8)));

        class1.addStudent(new Student("Tran", "Van Khoa", "2002-09-15", "Bac Ninh", "CNTT1",
                Map.of("Lập trình hướng đối tượng", 7, "Quản lý dự án", 6, "Học Máy", 7, "Cơ sở dữ liệu", 8, "Lập trình ứng dụng cho TBDĐ", 6)));

        class1.addStudent(new Student("Le", "Thu Thao", "2003-11-22", "Hai Duong", "CNTT1",
                Map.of("Lập trình hướng đối tượng", 9, "Quản lý dự án", 9, "Học Máy", 8, "Cơ sở dữ liệu", 7, "Lập trình ứng dụng cho TBDĐ", 9)));

        classRooms.add(class1);

        // Lớp CNTT2
        ClassRoom class2 = new ClassRoom("CNTT2");
        class2.addStudent(new Student("Nguyen", "Duy Tuan", "2001-03-01", "Ha Noi", "CNTT2",
                Map.of("Lập trình hướng đối tượng", 7, "Quản lý dự án", 8, "Học Máy", 9, "Cơ sở dữ liệu", 8, "Lập trình ứng dụng cho TBDĐ", 3)));

        class2.addStudent(new Student("Pham", "Hoang Nam", "2002-05-20", "Vinh Phuc", "CNTT2",
                Map.of("Lập trình hướng đối tượng", 6, "Quản lý dự án", 5, "Học Máy", 6, "Cơ sở dữ liệu", 7, "Lập trình ứng dụng cho TBDĐ", 6)));

        class2.addStudent(new Student("Do", "Anh Duc", "2003-07-12", "Quang Ninh", "CNTT2",
                Map.of("Lập trình hướng đối tượng", 8, "Quản lý dự án", 9, "Học Máy", 9, "Cơ sở dữ liệu", 8, "Lập trình ứng dụng cho TBDĐ", 7)));

        class2.addStudent(new Student("Tran", "Thanh Tam", "2003-04-09", "Thanh Hoa", "CNTT2",
                Map.of("Lập trình hướng đối tượng", 7, "Quản lý dự án", 8, "Học Máy", 6, "Cơ sở dữ liệu", 5, "Lập trình ứng dụng cho TBDĐ", 9)));

        class2.addStudent(new Student("Bui", "Bao Ngoc", "2001-10-30", "Nam Dinh", "CNTT2",
                Map.of("Lập trình hướng đối tượng", 9, "Quản lý dự án", 8, "Học Máy", 8, "Cơ sở dữ liệu", 9, "Lập trình ứng dụng cho TBDĐ", 8)));

        classRooms.add(class2);

        // Lớp CNTT3
        ClassRoom class3 = new ClassRoom("CNTT3");
        class3.addStudent(new Student("Tran", "Van Long", "2002-05-15", "Nam Dinh", "CNTT3",
                Map.of("Lập trình hướng đối tượng", 5, "Quản lý dự án", 7, "Học Máy", 6, "Cơ sở dữ liệu", 5, "Lập trình ứng dụng cho TBDĐ", 6)));

        class3.addStudent(new Student("Le", "Thu Trang", "2003-07-10", "Hai Duong", "CNTT3",
                Map.of("Lập trình hướng đối tượng", 9, "Quản lý dự án", 9, "Học Máy", 9, "Cơ sở dữ liệu", 9, "Lập trình ứng dụng cho TBDĐ", 9)));

        class3.addStudent(new Student("Nguyen", "Xuan Minh", "2002-12-25", "Nghe An", "CNTT3",
                Map.of("Lập trình hướng đối tượng", 6, "Quản lý dự án", 6, "Học Máy", 7, "Cơ sở dữ liệu", 8, "Lập trình ứng dụng cho TBDĐ", 7)));

        class3.addStudent(new Student("Hoang", "Khanh Linh", "2003-08-18", "Da Nang", "CNTT3",
                Map.of("Lập trình hướng đối tượng", 8, "Quản lý dự án", 7, "Học Máy", 8, "Cơ sở dữ liệu", 9, "Lập trình ứng dụng cho TBDĐ", 9)));

        class3.addStudent(new Student("Pham", "Thanh Huyen", "2001-09-22", "Ha Noi", "CNTT3",
                Map.of("Lập trình hướng đối tượng", 7, "Quản lý dự án", 6, "Học Máy", 8, "Cơ sở dữ liệu", 6, "Lập trình ứng dụng cho TBDĐ", 7)));

        classRooms.add(class3);

        return classRooms;
    }
}
