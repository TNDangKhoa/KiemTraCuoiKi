package LastTest;

import java.util.ArrayList;
public class Data{

	public static ArrayList<HangHoa> danhsachHangHoa() {
		ArrayList<HangHoa> dsHangHoa = new ArrayList<HangHoa>();
		dsHangHoa.add(new HangHoa("Thuc pham", "HH001", "Mi ly", 10000, 23, "01/01/2021"));
		dsHangHoa.add(new HangHoa("Thuc pham", "HH002", "Sua bot", 52500, 15, "02/01/2021"));
		dsHangHoa.add(new HangHoa("Thuc pham", "HH003", "Nuoc suoi Aquafina", 6000, 100, "03/01/2021"));
		dsHangHoa.add(new HangHoa("Thuc pham", "HH004", "Dua hau LA", 10000, 250, "04/01/2021"));
		dsHangHoa.add(new HangHoa("Thuc pham", "HH005", "Trung vit T.Food", 22000, 12, "05/01/2021"));
		dsHangHoa.add(new HangHoa("Thuc pham", "HH006", "Mi Gau do", 5000, 10, "06/01/2021"));
		dsHangHoa.add(new HangHoa("Thuc pham", "HH007", "Nuoc mam Nam Ngu", 20000, 25, "07/01/2021"));
		dsHangHoa.add(new HangHoa("Thuc pham", "HH008", "Ngu coc", 35000, 8, "08/01/2021"));
		dsHangHoa.add(new HangHoa("Thuc pham", "HH009", "Bo dau phong", 18000, 500, "09/01/2021"));
		dsHangHoa.add(new HangHoa("Thuc pham", "HH010", "Mut dau", 56000, 42, "10/01/2021"));
		dsHangHoa.add(new HangHoa("Sanh su", "HH011", "Chen su nhap", 80000, 180, "11/01/2021"));
		dsHangHoa.add(new HangHoa("Sanh su", "HH012", "Bo dia su (10 cai)", 200000, 50, "12/01/2021"));
		dsHangHoa.add(new HangHoa("Sanh su", "HH013", "Muong su (20 cai)", 40000, 25, "13/01/2021"));
		dsHangHoa.add(new HangHoa("Sanh su", "HH014", "Ly su Nhat Ban", 120000, 100, "14/01/2021"));
		dsHangHoa.add(new HangHoa("Sanh su", "HH015", "Bat gom", 300000, 150, "15/01/2021"));
		dsHangHoa.add(new HangHoa("Sanh su", "HH016", "Chau hoa su", 480000, 1100, "16/01/2021"));
		dsHangHoa.add(new HangHoa("Sanh su", "HH017", "Lo hoa su", 170000, 200, "17/01/2021"));
		dsHangHoa.add(new HangHoa("Sanh su", "HH018", "Lu huong su", 20000, 100, "18/01/2021"));
		dsHangHoa.add(new HangHoa("Sanh su", "HH019", "Bo am tra", 25000, 100, "19/01/2021"));
		dsHangHoa.add(new HangHoa("Sanh su", "HH020", "Dua su", 50000, 400, "20/01/2022"));
		dsHangHoa.add(new HangHoa("Dien may", "HH021", "Tu lanh Samsung", 7000000, 200, "21/1/2021"));
		dsHangHoa.add(new HangHoa("Dien may", "HH022", "Samsung Smart TV", 210000, 100, "22/1/2021"));
		dsHangHoa.add(new HangHoa("Dien may", "HH023", "Aqua Inverter 8.5 ", 8000000, 200, "23/1/2021"));
		dsHangHoa.add(new HangHoa("Dien may", "HH024", "Quat dung Sharp", 1000000, 160, "24/1/2021"));
		dsHangHoa.add(new HangHoa("Dien may", "HH025", "Daikin Inverter 2 HP", 210000, 300, "25/1/2021"));
		dsHangHoa.add(new HangHoa("Dien may", "HH026", "Bep Kalite", 8000000, 100, "26/1/2024"));
		dsHangHoa.add(new HangHoa("Dien may", "HH027", "Noi com dien Joyoung", 1200000, 230, "27/1/2021"));
		dsHangHoa.add(new HangHoa("Dien may", "HH028", "Quat mini OSMIA", 200000, 300, "28/1/2021"));
		dsHangHoa.add(new HangHoa("Dien may", "HH029", "Ban ui hoi nuoc Philips", 3200000, 19, "29/1/2021"));
		dsHangHoa.add(new HangHoa("Dien may", "HH030", "May xay da nang Kangaroo", 500000, 101, "30/1/2021"));
		return dsHangHoa;
	}

	public static ArrayList<Menu> danhsachMenu() {
		// menu them, xoa, sua
		ArrayList<Menu> dsMenu = new ArrayList<Menu>();
		dsMenu.add(new Menu(1, "1. Them"));
		dsMenu.add(new Menu(2, "2. Xoa"));
		dsMenu.add(new Menu(3, "3. Sua"));
		dsMenu.add(new Menu(4, "4. Tim kiem"));
		dsMenu.add(new Menu(5, "5. Sap xep"));
		dsMenu.add(new Menu(6, "6. Thong ke"));

		return dsMenu;

	}

	public static ArrayList<Menu> menuTimKiem() {
		ArrayList<Menu> dsmenutimkiem = new ArrayList<Menu>();
		dsmenutimkiem.add(new Menu(1, "1. Tim kiem theo loai"));
		dsmenutimkiem.add(new Menu(2, "2. Tim kiem theo gia"));
		dsmenutimkiem.add(new Menu(3, "3. Tim kiem theo ma"));
		dsmenutimkiem.add(new Menu(4, "4. Tim kiem theo ngay"));
		dsmenutimkiem.add(new Menu(5, "5. Tim kiem tu ngay...den ngay..."));
		dsmenutimkiem.add(new Menu(6, "6. Tim kiem theo gia tu...den..."));
		return dsmenutimkiem;
	}

	public static ArrayList<Menu> menuSapXep() {
		ArrayList<Menu> dsmenusapxep = new ArrayList<Menu>();
		dsmenusapxep.add(new Menu(1, "1. Sap xep gia nhap tang dan"));
		dsmenusapxep.add(new Menu(2, "2. Sap xep gia nhap giam dan"));
		dsmenusapxep.add(new Menu(3, "3. Sap xep ngay nhap tang dan"));
		dsmenusapxep.add(new Menu(4, "4. Sap xep ngay nhap giam dan"));
		dsmenusapxep.add(new Menu(5, "5. Sap xep theo loai, ngay"));
		dsmenusapxep.add(new Menu(6, "6. Sap xep theo gia, ngay"));
		return dsmenusapxep;
	}
	
	public static ArrayList<Menu> danhsachMenuthongke() {
		ArrayList<Menu> dsmenuthongke = new ArrayList<Menu>();
		dsmenuthongke.add(new Menu(1, "1. Thong ke tong so luong hang hoa"));
		dsmenuthongke.add(new Menu(2, "2. Thong ke tong gia tri hang hoa"));
		dsmenuthongke.add(new Menu(3, "3. Thong ke tong so luong tung loai hang hoa"));
		return dsmenuthongke;
	}
}
