package LastTest;

import java.util.ArrayList;
import java.util.Scanner;

public class mainQuanLiBanHang{
	private static ArrayList<HangHoa> dshanghoa;
	public static void main(String[] args) {
		System.out.println("==========CHƯƠNG TRÌNH QUẢN LÝ HÀNG HÓA===========");
		System.out.println(">>>>>>>>>>>>>MENU<<<<<<<<<<<<<");
		dshanghoa = Data.danhsachHangHoa();
		ArrayList<Menu> dsmenu = Data.danhsachMenu();
		for (int i = 0; i < dsmenu.size(); i++) {
			System.out.println(dsmenu.get(i).tenMenu);

		}
		Scanner scanner = new Scanner(System.in);
		int suLuaChon;
		System.out.println("Lựa chọn Chức năng: ");
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
			timKiem(	);
			break;
		case 5:
			sapxep(dshanghoa);
			break;
		case 6:
			thongke(dshanghoa);
			break;

		default:
			System.out.println("Chưa hỗ trợ chức năng này");
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
			System.out.println("Chưa hỗ trợ chức năng này");
		}

		scanner.close();
	}

	private static void sapxep(ArrayList<HangHoa> dshanghoa) {
		System.out.println("Chọn kiểu sắp xếp");
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
			System.out.println("Chưa hỗ trợ chức năng này");
		}

		scanner.close();
	}

	private static void thongke(ArrayList<HangHoa> dshanghoa) {
		System.out.println("Chọn loại thống kê");
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
			System.out.println("Chưa hỗ trợ chức năng này");
		}

		scanner.close();
	}

//Chuc nang them
	static void them(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Bắt đầu chức năng thêm");
		System.out.println("Nhập thông tin hàng hóa");
		Scanner scanner = new Scanner(System.in);
		String loai;
		System.out.print("-Loại hàng hóa: ");
		loai = scanner.nextLine();

		String mahang;
		System.out.print("-Mã hàng hóa: ");
		mahang = scanner.nextLine();

		String tenhanghoa;
		System.out.print("-Tên hàng hóa: ");
		tenhanghoa = scanner.nextLine();

		double gianhap;
		System.out.print("-Giá nhập: ");
		gianhap = scanner.nextDouble();

		int soluongtonkho;
		System.out.print("-Số lượng tồn kho: ");
		soluongtonkho = scanner.nextInt();

		String ngaynhapkho;
		Scanner sc = new Scanner(System.in);
		System.out.print("-Ngày nhập kho: ");
		ngaynhapkho = sc.nextLine();
		sc.close();
		scanner.close();

		HangHoa hanghoathem = new HangHoa(loai, mahang, tenhanghoa, gianhap, soluongtonkho, ngaynhapkho);

		System.out.println("---Đã thêm vào thành công---");
		System.out.println("-Số lượng hàng hóa trước khi thêm là: " + dsHangHoa.size());

		dsHangHoa.add(hanghoathem);

		System.out.println("-Số lượng hàng hóa sau khi thêm là: " + dsHangHoa.size());

		System.out.println("Chi tiết hàng hóa đã thêm vào là:");
		System.out.println("Loại: " + hanghoathem.Loai);
		System.out.println("Mã hàng: " + hanghoathem.maHang);
		System.out.println("Tên hàng: " + hanghoathem.tenHangHoa);
		System.out.println("Giá Hàng: " + hanghoathem.giaNhap);
		System.out.println("Số lượng tồn kho: " + hanghoathem.soLuongTonKho);
		System.out.println("Ngày nhập kho: " + hanghoathem.ngayNhap);
	}

//Chuc nang xoa
	static void xoaHangHoa(ArrayList<HangHoa> dsHangHoa) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("---Tên hàng hóa cần xóa---");
		String tenhanghoa = scanner.nextLine();

		HangHoa hangHoa = SearchFunction.NameSearch(tenhanghoa, dsHangHoa);
		if (hangHoa != null) {
			if (dsHangHoa.remove(hangHoa)) {
				System.out.println("--Đã xóa thành công--");
			} else
				System.out.println("Xóa hàng hóa thất bại");
		} else
			System.out.println("Ko tìm thấy hàng hóa nào trong ds với tên " + tenhanghoa);
		scanner.close();
	}

//Chuc nang sua
	static void sua(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting edit function");

		Scanner scanner = new Scanner(System.in);

		System.out.println("---Tên hàng hóa cần sửa---");

		String tenhanghoa = scanner.nextLine();

		HangHoa hangHoa = SearchFunction.NameSearch(tenhanghoa, dsHangHoa);

		if (hangHoa != null) {
			System.out.println("Hàng hóa trước khi sửa là: " + hangHoa.tenHangHoa);
			int vitri = dsHangHoa.indexOf(hangHoa);
			System.out.println("---Nhập tên hàng hóa mới:");
			hangHoa.tenHangHoa = scanner.nextLine();
			dsHangHoa.set(vitri, hangHoa);
			System.out.println("---Hàng hóa sau khi sửa là: " + dsHangHoa.get(vitri).tenHangHoa);
		} else {
			System.out.println("Cập nhật hàng hóa thất bại");
		}
		scanner.close();
	}

//Chuc nang tim kiem theo loai	
	static void TypeSearch(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting type search");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Loại hàng hóa cần tìm là:    ");
		String loai = scanner.nextLine();

		ArrayList<HangHoa> dsTimkiem = SearchFunction.TypeSearch(loai, dsHangHoa);
		if (!dsTimkiem.isEmpty()) {
			System.out.println("Đã tìm thấy hàng hóa theo loại nhập " + loai);
			for (HangHoa hangHoa : dsTimkiem)
				System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
						+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho);
		} else
			System.out.println("Không tìm thấy hàng hóa cần tìm ");
		scanner.close();
	}

//Chuc nang tim kiem theo gia
	static void PriceSearch(ArrayList<HangHoa> dsHangHoa) {

		System.out.println("Starting price search");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Giá hàng hóa cần tìm là:    ");
		double gianhap = scanner.nextDouble();
		ArrayList<HangHoa> dsKetqua = SearchFunction.PriceSearch(gianhap, dsHangHoa);
		if (dsKetqua.isEmpty()) {
			System.out.println("Không tìm thấy hàng hóa cần tìm ");
		} else {
			System.out.println("Đã tìm thấy hàng hóa theo giá vừa nhập " + gianhap);
			for (HangHoa hangHoa : dsKetqua) {
				System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
						+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho);

			}
		}
		scanner.close();
	}

//Tim theo ngay	
	static void DateSearch(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Bắt đầu chức năng tìm kiếm theo ngày");
		Scanner scanner = new Scanner(System.in);
		String ngaynhapkho;
		System.out.println("Nhập ngày hàng hóa là:    ");
		ngaynhapkho = scanner.nextLine();
		ArrayList<HangHoa> dsKetqua = SearchFunction.DateSearch(ngaynhapkho, dsHangHoa);
		if (dsKetqua.isEmpty()) {
			System.out.println("Không tìm thấy hàng hóa cần tìm ");
		} else {
			System.out.println("Đã tìm thấy hàng hóa theo ngày vừa nhập " + ngaynhapkho);
			for (HangHoa hangHoa : dsKetqua) {
				System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
						+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho + " - " + hangHoa.ngayNhap);
			}
		}
		scanner.close();
	}

//Tim theo ma	
	static void CodeSearch(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Bắt đầu chức năng tìm kiếm theo mã");
		Scanner scanner = new Scanner(System.in);
		String mahang;
		System.out.println("Nhập mã hàng hóa cần tìm(VN001=>VN030) ");
		mahang = scanner.nextLine();
		HangHoa hangHoa = SearchFunction.CodeSearch(mahang, dsHangHoa);
		if (hangHoa != null) {
			System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
					+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho + " - " + hangHoa.ngayNhap);
		} else {
			System.out.println("Không tìm thấy hàng hóa với mã là " + mahang);
		}
		scanner.close();
	}

//Chuc nang tim kiem theo khoang ngay	
	static void DateRangeSearch(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Starting date range search");
		Scanner scanner = new Scanner(System.in);
		String ngaydau;
		System.out.println("Nhập ngày bắt đầu theo định dạng (dd/mm/yyyy): ");
		ngaydau = scanner.nextLine();
		String ngaycuoi;
		System.out.println("Nhập ngày kết thúc theo định dạng (dd/mm/yyyy): ");
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
		System.out.println("Bắt đầu chức năng tìm kiếm theo khoảng giá");
		{
			Scanner scanner = new Scanner(System.in);
			double giadau;
			System.out.println("Nhập giá bắt đầu: ");
			giadau = scanner.nextDouble();
			double giacuoi;
			System.out.println("Nhập giá kết thúc: ");
			giacuoi = scanner.nextDouble();
			ArrayList<HangHoa> dsKetqua = SearchFunction.PriceRangeSearch(giadau, giacuoi, dsHangHoa);
			for (HangHoa hangHoa : dsKetqua) {
				System.out.println(hangHoa.Loai + " - " + hangHoa.maHang + " - " + hangHoa.tenHangHoa + " - "
						+ hangHoa.giaNhap + " - " + hangHoa.soLuongTonKho + " - " + hangHoa.ngayNhap);
			}
		}
	}

//chuc nang sap xep
	static void sapxepgianhaptangdan(ArrayList<HangHoa> dsHanghoa) {
		System.out.println("Danh sách hàng hóa sau khi xắp xếp giá nhập tăng dần");
		ArrayList<HangHoa> dsSapxep = SapXep.sapxepgianhaptangdan(dsHanghoa);
		for (HangHoa hangHoa : dsSapxep) {
			System.out.println("Hang hoa: " + hangHoa.tenHangHoa + " - " + hangHoa.giaNhap);
		}
	}

//Chuc nang sap xep theo gia giam dan
	static void sapxepgianhapgiamdan(ArrayList<HangHoa> dsHanghoa) {
		System.out.println("Danh sách hàng hóa sau khi xắp xếp giá nhập giảm dần");
		ArrayList<HangHoa> dsSapxep = SapXep.sapxepgianhapgiamdan(dsHanghoa);
		for (HangHoa hangHoa : dsSapxep) {
			System.out.println("Hang hoa: " + hangHoa.tenHangHoa + " - " + hangHoa.giaNhap);
		}
	}

//Chuc nang sap xep theo ngay tnag dan
	static void sapxepngaynhaptangdan(ArrayList<HangHoa> dsHanghoa) {
		System.out.println("Danh sách hàng hóa sau khi xắp xếp ngày nhập tăng dần");
		ArrayList<HangHoa> dsSapxep = SapXep.sapxepngaynhaptangdan(dsHanghoa);
		for (HangHoa hangHoa : dsSapxep) {
			System.out
					.println("Hang hoa: " + hangHoa.tenHangHoa + " - " + hangHoa.giaNhap + " - " + hangHoa.ngayNhap);
		}
	}

//Chuc nang sap xep theo ngay giam dan
	static void sapxepngaynhapgiamdan(ArrayList<HangHoa> dsHanghoa) {
		System.out.println("Danh sách hàng hóa sau khi xắp xếp ngày nhập giảm dần");
		ArrayList<HangHoa> dsSapxep = SapXep.sapxepngaynhapgiamdan(dsHanghoa);
		for (HangHoa hangHoa : dsSapxep) {
			System.out
					.println("Hang hoa: " + hangHoa.tenHangHoa + " - " + hangHoa.giaNhap + " - " + hangHoa.ngayNhap);
		}
	}

//Chuc nang sap xep theo loai ngay
	static void sapxeptheoloaingay(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Bắt đầu chức năng sắp xếp theo loại và ngày");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Loại hàng hóa cần sắp xếp là: ");
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
		System.out.println("Bắt đầu chức năng sắp xếp theo giá và ngày");
		Scanner scanner = new Scanner(System.in);
		double giadau;
		System.out.println("Nhập giá bắt đầu: ");
		giadau = scanner.nextDouble();
		double giacuoi;
		System.out.println("Nhập giá kết thúc: ");
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
		System.out.println("Tổng số lượng hàng hóa là: " + ThongKe.thongketongsoluonghanghoa(dsHangHoa));

	}

	static void thongketonggiatrihanghoa(ArrayList<HangHoa> dsHangHoa) {
		System.out.println("Tổng giá trị hàng hóa là: " + ThongKe.thongketonggiatrihanghoa(dsHangHoa));
	}

	static void thongkesoluongtungloai(ArrayList<HangHoa> dsHanghoa) {
		System.out.println(
				"Số lượng hàng hóa của loại thực phẩm là:" + ThongKe.thongkesoluongtungloai("Thực phẩm", dsHanghoa));
		System.out.println(
				"Số lượng hàng hóa của loại Sành sứ là:" + ThongKe.thongkesoluongtungloai("Sành sứ", dsHanghoa));
		System.out.println(
				"Số lượng hàng hóa của loại điện máy là:" + ThongKe.thongkesoluongtungloai("Điện máy", dsHanghoa));
	}

}