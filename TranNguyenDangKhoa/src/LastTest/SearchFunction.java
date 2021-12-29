package LastTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SearchFunction{

	static HangHoa NameSearch(String tenHangHoa, ArrayList<HangHoa> dsHangHoa) {
		for (HangHoa hangHoa : dsHangHoa)
			if (hangHoa.tenHangHoa.toLowerCase().equals(tenHangHoa.toLowerCase()))
				return hangHoa;
		return null;
	}

	static ArrayList<HangHoa> TypeSearch(String loai, ArrayList<HangHoa> dsHangHoa) {
		ArrayList<HangHoa> result = new ArrayList<>();
		for (int i = 0; i < dsHangHoa.size(); i++) {
			if (dsHangHoa.get(i).Loai.toLowerCase().equals(loai.toLowerCase())) {
				result.add(dsHangHoa.get(i));
			}

		}

		return result;
	}

	static ArrayList<HangHoa> PriceSearch(double giaNhap, ArrayList<HangHoa> dsHangHoa) {
		ArrayList<HangHoa> result = new ArrayList<>();
		for (int i = 0; i < dsHangHoa.size(); i++) {
			if (dsHangHoa.get(i).giaNhap == (giaNhap)) {
				result.add(dsHangHoa.get(i));
			}

		}
		return result;
	}

	static ArrayList<HangHoa> DateSearch(String ngayNhap, ArrayList<HangHoa> dsHangHoa) {
		ArrayList<HangHoa> result = new ArrayList<>();
		for (int i = 0; i < dsHangHoa.size(); i++) {
			if (dsHangHoa.get(i).ngayNhap.equals(ngayNhap)) {
				result.add(dsHangHoa.get(i));

			}
		}
		return result;

	}

	static HangHoa CodeSearch(String maHang, ArrayList<HangHoa> dsHangHoa) {
		HangHoa result = null;
		for (HangHoa hangHoa : dsHangHoa) {

			if (hangHoa.maHang.toLowerCase().equals(maHang.toLowerCase())) {
				result = hangHoa;
				break;
			}
		}
		return result;
	}

	static ArrayList<HangHoa> PriceRangeSearch(Double giaBatDau, double giaKetThuc,
			ArrayList<HangHoa> dsHangHoa) {
		ArrayList<HangHoa> result = new ArrayList<>();
		for (HangHoa hangHoa : dsHangHoa) {
			double gianhapkho = hangHoa.giaNhap;
			double giaDau = (giaBatDau);
			double giaCuoi = (giaKetThuc);
			if ((gianhapkho >= (giaDau)) && gianhapkho <= (giaCuoi)) {
				result.add(hangHoa);
			}
		}
		return result;
	}

	static ArrayList<HangHoa> DateRangeSearch(String ngaydau, String ngaycuoi, ArrayList<HangHoa> dsHangHoa) {
		ArrayList<HangHoa> result = new ArrayList<>();
		for (HangHoa hangHoa : dsHangHoa) {
			Date ngayNhap = DateConvert(hangHoa.ngayNhap);
			Date ngaybatdau = DateConvert(ngaydau);
			Date ngayketthuc = DateConvert(ngaycuoi);

			if (ngayNhap == null) {
				break;
			}

			if (ngaybatdau == null) {
				break;
			}

			if (ngayketthuc == null) {
				break;
			}

			if ((ngayNhap.equals(ngaybatdau) || ngayNhap.after(ngaybatdau))
					&& (ngayNhap.before(ngayketthuc) || ngayNhap.equals(ngayketthuc))) {
				result.add(hangHoa);
			}
		}
		return result;

	}

	private static Date DateConvert(String ngaynhap) {
		SimpleDateFormat simpledate = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return simpledate.parse(ngaynhap);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
