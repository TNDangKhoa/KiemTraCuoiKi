package LastTest;

import java.util.ArrayList;
import java.util.Scanner;

public class mainQuanLiBanHang{
	private static ArrayList<HangHoa> dshanghoa;
	public static void main(String[] args) {
		System.out.println("==========CHUONG TRINH QUAN LY HANG HOA===========");
		System.out.println("------------MENU CHUC NANG-------------");
		dshanghoa = Data.danhsachHangHoa();
		ArrayList<Menu> dsmenu = Data.danhsachMenu();
		for (int i = 0; i < dsmenu.size(); i++) {
			System.out.println(dsmenu.get(i).tenMenu);

		}
		Scanner scanner = new Scanner(System.in);
		int suLuaChon;
		System.out.println("Choose searching type!: ");
		suLuaChon = scanner.nextInt();
		ArrayList<HangHoa> dshanghoa = Data.danhsachHangHoa();
		switch (suLuaChon) {
		case 1:
			them(dshanghoa);
			break;
		case 2:
			xoaHangHoa(dshanghoa);
			break;
		case 3:
			sua(dshanghoa);
			break;
		case 4:
			timKiem();
			break;
		case 5:
			sapxep(dshanghoa);
			break;
		case 6:
			thongke(dshanghoa);
			break;

		default:
			System.out.println("khong co! ket thuc chuong trinh...");
		}

		scanner.close();
	}

	private static void timKiem() {
		System.out.println("Choose searching type!");
		ArrayList<Menu> dsmenutimkiem = Data.menuTimKiem();
		for (int i = 0; i < dsmenutimkiem.size(); i++) {
			System.out.println(dsmenutimkiem.get(i).tenMenu);
		}
		Scanner scanner = new Scanner(System.in);
		int luachon;
		luachon = scanner.nextInt();
		switch (luachon) {
		case 1:
			TypeSearch(dshanghoa);
			break;
		case 2:
			PriceSearch(dshanghoa);
			break;
		case 3:
			CodeSearch(dshanghoa);
			break;
		case 4:
			DateSearch(dshanghoa);
			break;
		case 5:
			DateRangeSearch(dshanghoa);
			break;
		case 6:
			PriceRangeSearch(dshanghoa);
			break;

		default:
			System.out.println("khong co! ket thuc chuong trinh...");
		}

		scanner.close();
	}

	private static void sapxep(ArrayList<HangHoa> dshanghoa) {
		System.out.println("Chon kieu sap xep");
		ArrayList<Menu> dsmenusapxep = Data.menuSapXep();
		for (int i = 0; i < dsmenusapxep.size(); i++) {
			System.out.println(dsmenusapxep.get(i).tenMenu);
		}
		Scanner scanner = new Scanner(System.in);
		int luachon;
		luachon = scanner.nextInt();
		switch (luachon) {
		case 1:
			sapxepgianhaptangdan(dshanghoa);
			break;
		case 2:
			sapxepgianhapgiamdan(dshanghoa);
			break;
		case 3:
			sapxepngaynhaptangdan(dshanghoa);
			break;
		case 4:
			sapxepngaynhapgiamdan(dshanghoa);
			break;
		case 5:
			sapxeptheoloaingay(dshanghoa);
			break;
		case 6:
			sapxeptheogiangay(dshanghoa);
			break;
		default:
			System.out.println("khong co! ket thuc chuong trinh...");
		}

		scanner.close();
	}

	private static void thongke(ArrayList<HangHoa> dshanghoa) {
		System.out.println("Chon loai thong ke");
		ArrayList<Menu> dsmenuthongke = Data.danhsachMenuthongke();
		for (int i = 0; i < dsmenuthongke.size(); i++) {
			System.out.println(dsmenuthongke.get(i).tenMenu);
		}
		Scanner scanner = new Scanner(System.in);
		int luachon;
		luachon = scanner.nextInt();
		switch (luachon) {
		case 1:
			thongketongsoluonghanghoa(dshanghoa);
			break;
		case 2:
			thongketonggiatrihanghoa(dshanghoa);
			break;
		case 3:
			thongkesoluongtungloai(dshanghoa);
			break;
		default:
			System.out.println("khong co! ket thuc chuong trinh...");
		}

		scanner.close();
	}

//Chuc nang them
	static void them(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting add function");
		System.out.println("Nhap thong tin hang hoa");
		Scanner scanner = new Scanner(System.in);
		String loai;
		System.out.print("-Loai hang: ");
		loai = scanner.nextLine();

		String mahang;
		System.out.print("-Ma hang: ");
		mahang = scanner.nextLine();

		String tenhanghoa;
		System.out.print("-Ten hang: ");
		tenhanghoa = scanner.nextLine();

		double gianhap;
		System.out.print("-Gia: ");
		gianhap = scanner.nextDouble();

		int soluongtonkho;
		System.out.print("-So luong ton kho: ");
		soluongtonkho = scanner.nextInt();

		String ngaynhapkho;
		Scanner sc = new Scanner(System.in);
		System.out.print("-Ngay nhap kho: ");
		ngaynhapkho = sc.nextLine();
		sc.close();
		scanner.close();

		HangHoa hanghoathem = new HangHoa(loai, mahang, tenhanghoa, gianhap, soluongtonkho, ngaynhapkho);

		System.out.println("---Thanh cong---");
		System.out.println("-So luong hang hoa truoc khi them: " + dsHangHoa.size());

		dsHangHoa.add(hanghoathem);

		System.out.println("-So luong hang hoa sau khi them: " + dsHangHoa.size());

		System.out.println("Chi tiet hang hoa da them:");
		System.out.println("Loai: " + hanghoathem.Loai);
		System.out.println("Ma hang: " + hanghoathem.maHang);
		System.out.println("Ten hang: " + hanghoathem.tenHangHoa);
		System.out.println("Gia hang: " + hanghoathem.giaNhap);
		System.out.println("So luong ton kho: " + hanghoathem.soLuongTonKho);
		System.out.println("Ngay nhap kho: " + hanghoathem.ngayNhap);
	}

//Chuc nang xoa
	static void xoaHangHoa(ArrayList<HangHoa> dsHangHoa) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("------Ten hang hoa can xoa------");
		String tenhanghoa = scanner.nextLine();

		HangHoa hangHoa = SearchFunction.NameSearch(tenhanghoa, dsHangHoa);
		if (hangHoa != null) {
			if (dsHangHoa.remove(hangHoa)) {
				System.out.println("--Thanh cong--");
			} else
				System.out.println("That bai...");
		} else
			System.out.println("Khong tim thay hang hoa nao trong danh sach co ten " + tenhanghoa);
		scanner.close();
	}

//Chuc nang sua
	static void sua(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting edit function");

		Scanner scanner = new Scanner(System.in);

		System.out.println("------Ten hang hoa can sua------");

		String tenhanghoa = scanner.nextLine();

		HangHoa hangHoa = SearchFunction.NameSearch(tenhanghoa, dsHangHoa);

		if (hangHoa != null) {
			System.out.println("Ten hang truoc khi sua: " + hangHoa.tenHangHoa);
			int vitri = dsHangHoa.indexOf(hangHoa);
			System.out.println("-Nhap ten moi:");
			hangHoa.tenHangHoa = scanner.nextLine();
			dsHangHoa.set(vitri, hangHoa);
			System.out.println("-Ten hang sau khi sua: " + dsHangHoa.get(vitri).tenHangHoa);
		} else {
			System.out.println("Cap nhat that bai...");
		}
		scanner.close();
	}

//Chuc nang tim kiem theo loai	
	static void TypeSearch(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting type search");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Loai hang hoa can tim?:    ");
		String loai = scanner.nextLine();

		ArrayList<HangHoa> dsTimkiem = SearchFunction.TypeSearch(loai, dsHangHoa);
		if (!dsTimkiem.isEmpty()) {
			System.out.println("Da tim thay hang hoa theo loai da nhap: " + loai);
			for (HangHoa hangHoa : dsTimkiem)
				System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
						+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho);
		} else
			System.out.println("Khong tim thay hang hoa can tim");
		scanner.close();
	}

//Chuc nang tim kiem theo gia
	static void PriceSearch(ArrayList<HangHoa> dsHangHoa) {

		System.out.println("Starting price search");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Gia hang can tim:    ");
		double gianhap = scanner.nextDouble();
		ArrayList<HangHoa> dsKetqua = SearchFunction.PriceSearch(gianhap, dsHangHoa);
		if (dsKetqua.isEmpty()) {
			System.out.println("Khong tim thay!");
		} else {
			System.out.println("Da tim thay hang theo gia vua nhap: " + gianhap);
			for (HangHoa hangHoa : dsKetqua) {
				System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
						+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho);

			}
		}
		scanner.close();
	}

//Tim theo ngay	
	static void DateSearch(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting date search");
		Scanner scanner = new Scanner(System.in);
		String ngaynhapkho;
		System.out.println("Ngay nhap hang hoa?:    ");
		ngaynhapkho = scanner.nextLine();
		ArrayList<HangHoa> dsKetqua = SearchFunction.DateSearch(ngaynhapkho, dsHangHoa);
		if (dsKetqua.isEmpty()) {
			System.out.println("Khong tim thay");
		} else {
			System.out.println("Da tim thay hang hoa theo ngay vua nhap" + ngaynhapkho);
			for (HangHoa hangHoa : dsKetqua) {
				System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
						+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho + " - " + hangHoa.ngayNhap);
			}
		}
		scanner.close();
	}

//Tim theo ma	
	static void CodeSearch(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting code search");
		Scanner scanner = new Scanner(System.in);
		String mahang;
		System.out.println("Nhap ma hang can tim(HH001=>HH030) ");
		mahang = scanner.nextLine();
		HangHoa hangHoa = SearchFunction.CodeSearch(mahang, dsHangHoa);
		if (hangHoa != null) {
			System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
					+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho + " - " + hangHoa.ngayNhap);
		} else {
			System.out.println("Khong tim thay hang voi ma " + mahang);
		}
		scanner.close();
	}

//Chuc nang tim kiem theo khoang ngay	
	static void DateRangeSearch(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting date range search");
		Scanner scanner = new Scanner(System.in);
		String ngaydau;
		System.out.println("Nhap ngay dau (dd/mm/yyyy): ");
		ngaydau = scanner.nextLine();
		String ngaycuoi;
		System.out.println("Nhap ngay cuoi(dd/mm/yyyy): ");
		ngaycuoi = scanner.nextLine();
		ArrayList<HangHoa> dsKetqua = SearchFunction.DateRangeSearch(ngaydau, ngaycuoi, dsHangHoa);
		for (HangHoa hangHoa : dsKetqua) {
			System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
					+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho + " - " + hangHoa.ngayNhap);

		}
		scanner.close();

	}

//Tim Khoang gia	
	static void PriceRangeSearch(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting price range search");
		{
			Scanner scanner = new Scanner(System.in);
			double giadau;
			System.out.println("Nhap gia dau: ");
			giadau = scanner.nextDouble();
			double giacuoi;
			System.out.println("Nhap gia cuoi: ");
			giacuoi = scanner.nextDouble();
			ArrayList<HangHoa> dsKetqua = SearchFunction.PriceRangeSearch(giadau, giacuoi, dsHangHoa);
			for (HangHoa hangHoa : dsKetqua) {
				System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
						+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho + " - " + hangHoa.ngayNhap);
			}
		}
	}

//chuc nang sap xep tang dan
	static void sapxepgianhaptangdan(ArrayList<HangHoa> dsHanghoa) {
		System.out.println("DS hang hoa theo gia nhap tang dan");
		ArrayList<HangHoa> dsSapxep = SapXep.sapxepgianhaptangdan(dsHanghoa);
		for (HangHoa hangHoa : dsSapxep) {
			System.out.println("Hang hoa: " + hangHoa.tenHangHoa + " - " + hangHoa.giaNhap);
		}
	}

//Chuc nang sap xep theo gia giam dan
	static void sapxepgianhapgiamdan(ArrayList<HangHoa> dsHanghoa) {
		System.out.println("DS hang hoa theo gia nhap giam dan");
		ArrayList<HangHoa> dsSapxep = SapXep.sapxepgianhapgiamdan(dsHanghoa);
		for (HangHoa hangHoa : dsSapxep) {
			System.out.println("Hang hoa: " + hangHoa.tenHangHoa + " - " + hangHoa.giaNhap);
		}
	}

//Chuc nang sap xep theo ngay tnag dan
	static void sapxepngaynhaptangdan(ArrayList<HangHoa> dsHanghoa) {
		System.out.println("DS hang hoa theo ngay nhap tang dan");
		ArrayList<HangHoa> dsSapxep = SapXep.sapxepngaynhaptangdan(dsHanghoa);
		for (HangHoa hangHoa : dsSapxep) {
			System.out
					.println("Hang hoa: " + hangHoa.tenHangHoa + " - " + hangHoa.giaNhap + " - " + hangHoa.ngayNhap);
		}
	}

//Chuc nang sap xep theo ngay giam dan
	static void sapxepngaynhapgiamdan(ArrayList<HangHoa> dsHanghoa) {
		System.out.println("DS hang hoa theo ngay nhap giam dan");
		ArrayList<HangHoa> dsSapxep = SapXep.sapxepngaynhapgiamdan(dsHanghoa);
		for (HangHoa hangHoa : dsSapxep) {
			System.out
					.println("Hang hoa: " + hangHoa.tenHangHoa + " - " + hangHoa.giaNhap + " - " + hangHoa.ngayNhap);
		}
	}

//Chuc nang sap xep theo loai ngay
	static void sapxeptheoloaingay(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting arrange by date and price");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Loai hang hoa can sap xep: ");
		String loai = scanner.nextLine();
		ArrayList<HangHoa> dstimkiem = SearchFunction.TypeSearch(loai, dsHangHoa);
		for (HangHoa hangHoa : dstimkiem) {
			System.out
					.println("Hang hoa: " + hangHoa.tenHangHoa + " - " + hangHoa.giaNhap + " - " + hangHoa.ngayNhap);
		}
		scanner.close();
	}

//Chuc nang sap xep theo gia ngay
	static void sapxeptheogiangay(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting arrange by date and price");
		Scanner scanner = new Scanner(System.in);
		double giadau;
		System.out.println("Nhap gia bat dau: ");
		giadau = scanner.nextDouble();
		double giacuoi;
		System.out.println("Nhap gia ket thuc: ");
		giacuoi = scanner.nextDouble();
		ArrayList<HangHoa> dstimkiem = SearchFunction.PriceRangeSearch(giadau, giacuoi, dsHangHoa);
		for (HangHoa hangHoa : dstimkiem) {
			System.out
					.println("Hang hoa: " + hangHoa.tenHangHoa + " - " + hangHoa.giaNhap + " - " + hangHoa.ngayNhap);
		}
		scanner.close();
	}

//Chuc nang thong ke hang hoa
	static void thongketongsoluonghanghoa(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Tong so luong hang hoa: " + ThongKe.thongketongsoluonghanghoa(dsHangHoa));

	}

	static void thongketonggiatrihanghoa(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Tong gia tri hang hoa: " + ThongKe.thongketonggiatrihanghoa(dsHangHoa));
	}

	static void thongkesoluongtungloai(ArrayList<HangHoa> dsHanghoa) {
		System.out.println(
				"So luong hang hoa theo loai thuc pham:" + ThongKe.thongkesoluongtungloai("Thực phẩm", dsHanghoa));
		System.out.println(
				"So luong hang hoa theo loai sanh su:" + ThongKe.thongkesoluongtungloai("Sành sứ", dsHanghoa));
		System.out.println(
				"So luong hang hoa theo loai dien may:" + ThongKe.thongkesoluongtungloai("Điện máy", dsHanghoa));
	}

}