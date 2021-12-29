package LastTest;

import java.util.ArrayList;
public class Data{

	public static ArrayList<HangHoa> danhsachHangHoa() {
		ArrayList<HangHoa> dsHangHoa = new ArrayList<HangHoa>();
		dsHangHoa.add(new HangHoa("Thực phẩm", "VN001", "Gạo Nhật Vua Gạo Shinichi", 10000, 23, "01/01/2021"));
		dsHangHoa.add(new HangHoa("Thực phẩm", "VN002", "Sữa bột Abbott Grow", 52500, 15, "02/01/2021"));
		dsHangHoa.add(new HangHoa("Thực phẩm", "VN003", "Nước suối LaVie", 6000, 100, "03/01/2021"));
		dsHangHoa.add(new HangHoa("Thực phẩm", "VN004", "Dưa hấu Long An", 10000, 250, "04/01/2021"));
		dsHangHoa.add(new HangHoa("Thực phẩm", "VN005", "Trứng vịt tươi sạch T.Food", 22000, 12, "05/01/2021"));
		dsHangHoa.add(new HangHoa("Thực phẩm", "VN006", "Mì Nongshim Chapaguri Ram-don", 5000, 10, "06/01/2021"));
		dsHangHoa.add(new HangHoa("Thực phẩm", "VN007", "Nước chấm Nam Ngư Đệ Nhị", 20000, 25, "07/01/2021"));
		dsHangHoa.add(new HangHoa("Thực phẩm", "VN008", "Ngũ cốc dinh dưỡng", 35000, 8, "08/01/2021"));
		dsHangHoa.add(new HangHoa("Thực phẩm", "VN009", "Bánh mì thịt", 18000, 500, "09/01/2021"));
		dsHangHoa.add(new HangHoa("Thực phẩm", "VN010", "Mứt Dâu", 56000, 42, "10/01/2021"));
		dsHangHoa.add(new HangHoa("Sành sứ", "VN011", "Chén sứ nhập khẩ", 80000, 180, "11/01/2021"));
		dsHangHoa.add(new HangHoa("Sành sứ", "VN012", "Dĩa sứ 10 cái", 200000, 50, "12/01/2021"));
		dsHangHoa.add(new HangHoa("Sành sứ", "VN013", "Muỗng Sứ 20 cái", 40000, 25, "13/01/2021"));
		dsHangHoa.add(new HangHoa("Sành sứ", "Vn014", "Ly sứ Nhật bản", 120000, 100, "14/01/2021"));
		dsHangHoa.add(new HangHoa("Sành sứ", "VN015", "Bát gốm Bát Tràng", 300000, 150, "15/01/2021"));
		dsHangHoa.add(new HangHoa("Sành sứ", "VN016", "Chậu hoa sứ", 480000, 1100, "16/01/2021"));
		dsHangHoa.add(new HangHoa("Sành sứ", "VN017", "Lọ hoa sứ", 170000, 200, "17/01/2021"));
		dsHangHoa.add(new HangHoa("Sành sứ", "VN018", "Chuông gió nhập khẩu", 20000, 100, "18/01/2021"));
		dsHangHoa.add(new HangHoa("Sành sứ", "VN019", "Bộ ấm trà", 25000, 100, "19/01/2021"));
		dsHangHoa.add(new HangHoa("Sành sứ", "VN020", "Đũa sứ 2 cái", 50000, 400, "20/01/2022"));
		dsHangHoa.add(new HangHoa("Điện máy", "VN021", "Tủ lạnh Samsung Inverter", 7000000, 200, "21/1/2021"));
		dsHangHoa.add(new HangHoa("Điện máy", "VN022", "Samsung Smart TV QLED", 210000, 100, "22/1/2021"));
		dsHangHoa.add(new HangHoa("Điện máy", "VN023", "Aqua Inverter 8.5 ", 8000000, 200, "23/1/2021"));
		dsHangHoa.add(new HangHoa("Điện máy", "VN024", "Quạt đứng Sharp", 1000000, 160, "24/1/2021"));
		dsHangHoa.add(new HangHoa("Điện máy", "VN025", "Daikin Inverter 2 HP", 210000, 300, "25/1/2021"));
		dsHangHoa.add(new HangHoa("Điện máy", "VN026", "Bếp âm Kalite", 8000000, 100, "26/1/2024"));
		dsHangHoa.add(new HangHoa("Điện máy", "VN027", "Nồi cơm điện tử Joyoung", 1200000, 230, "27/1/2021"));
		dsHangHoa.add(new HangHoa("Điện máy", "VN028", "Quạt mini OSMIA", 200000, 300, "28/1/2021"));
		dsHangHoa.add(new HangHoa("Điện máy", "VN029", "Bàn ủi hơi nước Philips Azur Elite", 3200000, 19, "29/1/2021"));
		dsHangHoa.add(new HangHoa("Điện máy", "VN030", "Máy xay đa năng Kangaroo", 500000, 101, "30/1/2021"));
		return dsHangHoa;
	}

	public static ArrayList<Menu> danhsachMenu() {
		// menu them, xoa, sua
		ArrayList<Menu> dsMenu = new ArrayList<Menu>();
		dsMenu.add(new Menu(1, "1. Thêm"));
		dsMenu.add(new Menu(2, "2. Xóa"));
		dsMenu.add(new Menu(3, "3. Sửa"));
		dsMenu.add(new Menu(4, "4. Tìm kiếm"));
		dsMenu.add(new Menu(5, "5. Sắp xếp"));
		dsMenu.add(new Menu(6, "6. Thống kê"));

		return dsMenu;

	}

	public static ArrayList<Menu> menuTimKiem() {
		ArrayList<Menu> dsmenutimkiem = new ArrayList<Menu>();
		dsmenutimkiem.add(new Menu(1, "1. Tìm kiếm theo loại"));
		dsmenutimkiem.add(new Menu(2, "2. Tìm kiếm theo giá"));
		dsmenutimkiem.add(new Menu(3, "3. Tìm kiếm theo mã"));
		dsmenutimkiem.add(new Menu(4, "4. Tìm kiếm theo ngày"));
		dsmenutimkiem.add(new Menu(5, "5. Tìm kiếm theo ngày ...đến ngày..."));
		dsmenutimkiem.add(new Menu(6, "6. Tìm kiếm theo giá ...đến giá..."));
		return dsmenutimkiem;
	}

	public static ArrayList<Menu> menuSapXep() {
		ArrayList<Menu> dsmenusapxep = new ArrayList<Menu>();
		dsmenusapxep.add(new Menu(1, ".1. Sắp xếp giá nhập tăng dần"));
		dsmenusapxep.add(new Menu(2, "2. Sắp xếp giá nhập giảm dần"));
		dsmenusapxep.add(new Menu(3, "3. Sắp xếp ngày nhập tăng dần"));
		dsmenusapxep.add(new Menu(4, "4. Sắp xếp ngày nhập giảm dần"));
		dsmenusapxep.add(new Menu(5, "5. Sắp xếp theo loại ngày"));
		dsmenusapxep.add(new Menu(6, "6. Sắp xếp theo giá ngày"));
		return dsmenusapxep;
	}
	
	public static ArrayList<Menu> danhsachMenuthongke() {
		ArrayList<Menu> dsmenuthongke = new ArrayList<Menu>();
		dsmenuthongke.add(new Menu(1, "1. Thống kê tổng số lượng hàng hóa"));
		dsmenuthongke.add(new Menu(2, "2. Thống kê tổng giá trị hàng hóa"));
		dsmenuthongke.add(new Menu(3, "3. Thống kê tổng số lượng từng loại hàng hóa"));
		return dsmenuthongke;
	}
}
