package LastTest;

import java.util.ArrayList;

public class ThongKe {
	static int thongketongsoluonghanghoa(ArrayList<HangHoa> dsHangHoa) {
		int tongsoluong = 0;
		for (HangHoa hangHoa : dsHangHoa) {
			tongsoluong = tongsoluong + hangHoa.soLuongTonKho;
		}
		return tongsoluong;
	}

	static double thongketonggiatrihanghoa(ArrayList<HangHoa> dsHangHoa) {
		double tonggiatri = 0;
		for (HangHoa hangHoa : dsHangHoa) {
			tonggiatri = tonggiatri + (hangHoa.giaNhap * hangHoa.soLuongTonKho);
		}
		return tonggiatri;

	}

	static int thongkesoluongtungloai(String loai, ArrayList<HangHoa> dsHangHoa) {
		int tongsoluong = 0;
		for (HangHoa hangHoa : dsHangHoa) {
			if(hangHoa.Loai.toLowerCase().equals(loai.toLowerCase())){
				tongsoluong = tongsoluong + hangHoa.soLuongTonKho;
			} 
				
			
		}
		return tongsoluong;
	}
}
