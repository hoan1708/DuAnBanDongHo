
package services;

import java.util.ArrayList;
import models.ChatLieuDay;

public interface IChatLieuDayService {
    void themMoiDongHo(ChatLieuDay chatLieuDay);
    void suaThongTinDongHo(ChatLieuDay chatLieuDay);
    ArrayList<ChatLieuDay> layThongTinCLD();
}
