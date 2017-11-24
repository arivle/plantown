/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author acer
 */
public class datagame {

    private static AudioClip musik;
    
    //help
    
    boolean sudahsiram = true;
    boolean sudahobat1 = true;
    boolean sudahobat2 = true;
    boolean sudahpupuk = true;
    boolean sudahpanen = true;
    boolean sudahtangan = true;
    
    boolean sudahjagung = true;
    
    boolean panenjagung = false;
    
    boolean jagunghidup=true;
//jagung
    String tunasjagung = "/gambar/tunasjagung.gif";
    String jagung1 = "/gambar/jagung1.gif";
    String jagung2 = "/gambar/jagung2.gif";
    String jagung3 = "/gambar/jagung3.gif";
//tebu
    String tunastebu = "/gambar/tunasTebu.gif";
    String tebu1 = "/gambar/tebu1.gif";
    String tebu2 = "/gambar/tebu2.gif";
    String tebu3 = "/gambar/tebu3.gif";
//tembakau
    String tunastembakau = "/gambar/bako.gif";
    String tembakau1 = "/gambar/tembakau1.gif";
    String tembakau2 = "/gambar/tembakau2.gif";
    String tembakau3 = "/gambar/tembakau3.gif";
//perawatan
    String siram = "/gambar/siram.gif";
    String obat1 = "/gambar/semprot.gif";
    String obat2 = "/gambar/semprotKuning.gif";
    String pupuk = "/gambar/pupuk1.gif";
    String kosong = "/gambar/emptybox.png";
    String tangan = "/gambar/glove.gif";
    String panen = "/gambar/panen.gif";
//popup perawatan
    String popupsiram = "/gambar/popupMintaAir.gif";
    String Popuppupuk = "/gambar/popupMintaPupuk.gif";
    String popupobat1 = "/gambar/popupMintaObatCair.gif";
    String popupobat2 = "/gambar/popupMintaObatCair2.gif";
    String popuprawat = "/gambar/popupMintarawat.gif";
    String popuppanen = "/gambar/popupmintapanen.gif";
//popup emot
    String popupsedih = "/gambar/popupSedih.gif";
    String popupsenyum = "/gambar/popupSenyum.gif";
    String popupsakit = "/gambar/popupSakit.gif";
//nyawa
    String health4 = "/gambar/health4.png";
    String health3 = "/gambar/health3.png";
    String health2 = "/gambar/health2.png";
    String health1 = "/gambar/health1.png";

    //percakapan
    String awalmain = "Hai kita pak Planto dan bu Planty, kita punya bibit jagung. Tolong rawat hingga siap untuk di panen ya !!";
    String requestair = "Wah tanamannya haus, click icon (pemberi air) ini untuk membuatnya segar kembali ";
    String requestpupuk = "Tanaman jagungnya tumbuh dengan baik, ia butuh (pupuk) untuk bisa bertambah tinggi dan besar.";
    String requestobat1 = "Tanamannya sakit , Dia di serang hama , tolong beri (obat 1) untuk membuatnya kembali sehat.";
    String requestobat2 = "Tanaman kritis, hama berbahaya menyerang. tolong beri (obat 2) kalau tidak dia akan mati.";
    String requesttangan = "Tanaman sudah bertumbuh dengan baik sekali, Beri ia sentuhan(tangan) kasih sayangmu ";
    String requestpanen = "Yeayyyy, Selamat tanaman anda sudah siap untuk dipanen, Panen ia dengan (sabit) segera .. Terimakasih";
    String salahrequest = "yahhh , hati mu berkurang, jangan sampai salah merawat nanti tanamanmu bisa mati";
    String benarruequest = "Pintar sekali, tanaman terawat dengan baikk... lanjutkannn";
    String Stockhabis = "wahhhh stok (.....) mu habis , pergilah ke (shop) untuk menambahnya dan kembalilah segera untuk merawart tanamanmu kembali.";
    String tutupjagung = "Terimakasih sudah membantu merawat tanaman jagung kami, lanjutkan untuk merawat tanaman tebu kami";
    String bukatebu = "Selamat datang di tanaman kami yang kedua. Terimakasih sudah merawat tanaman jagung kami. Anda sangat berbakat. Sekarang bisakah anda merawat tanaman tebu kami ? pasti bisa. Semangat !!";
    String tutuptebu = "Yeyyyy, anda memang terbaik. Tanaman tebu kami dirawat dengan sangat baik. Untuk itu bisakah anda merawat 1 tanaman kami lagi ? selamat ke kebun selanjutnya !!";
    String bukatembakau = "Yeyyyy, anda sudah sampai di tanaman terakhir kami, Kami sangat senang karena 2 tanaman kami di rawat dengan sangat baik. Ini tanaman terakhir kami, Tolong rawat dengan sangat baik seperti tebu dan jagung yaa.... Selamat bermain...";
    String tutuptembakau = "Tanaman terakhir kami sudah berhasil anda rawat dengan baik.. Selamat anda sudah menyelesaikan 3 tanaman kami dan score anda (...) sangat baikk.... Terimakasih";
    String kembalikemap = "Permainan anda selesai, anda sangat pintar dalam merawat tanaman, Sekarang anda sudah bisa mencoba untuk merawat tanaman di rumah .... Terima kasih.";

    int jumlahair = 0;
    int jumlahpupuk = 0;
    int jumlahobat1 = 0;
    int jumlahobat2 = 0;
    int jumlahpanenjagung = 0;
    int jumlahpanentebu = 0;
    int jumlahpanentembakau = 0;
}
