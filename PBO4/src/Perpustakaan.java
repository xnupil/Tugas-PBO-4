import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    public Object nama;
    List<Buku> listBuku;

    Perpustakaan() {
        listBuku = new ArrayList<>();
    }

    void inputBuku(String idBuku, String judul, int stock){
        Buku buku1 = new Buku(idBuku, judul, stock);
        listBuku.add(buku1);
    }

    void cekBuku(String idBukuYangDiCari) {
        for(int i= 0; i < listBuku.size(); i++){
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.idBuku.equals(idBukuYangDiCari)) {
                if (currentBuku.bisaDipinjam()) {
                    System.out.println("-Buku " + currentBuku.judul + " Bisa Dipinjam");
                }
                else {
                    System.out.println("-Buku " + currentBuku.judul + " Tidak Bisa Dipinjam");
                }
            }
        }
    }


    void cekDataBukuAdaAtauTidak(String idBukuYangDiCari) {
        boolean bukuDitemukan = false;
        for (int i = 0; i < listBuku.size(); i++) {
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.idBuku.equals(idBukuYangDiCari)) {
                if (currentBuku.bisaDipinjam()){
                    bukuDitemukan = true;
                    break;
                }
            }
        }
        if (bukuDitemukan) {
            System.out.println("-Buku dengan ID " + idBukuYangDiCari + " ditemukan di perpustakaan.");
        } else {
            System.out.println("-Buku dengan ID " + idBukuYangDiCari + " tidak ditemukan di perpustakaan.");
        }
    }

    void cariBuku(String keyword) {
        boolean bukuDitemukan = false;
        for (int i = 0; i < listBuku.size(); i++) {
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.judul.toLowerCase().contains(keyword.toLowerCase())) {
                if (currentBuku.bisaDipinjam()) {
                    if (!bukuDitemukan) {
                        System.out.println("-Buku yang ditemukan:");
                        bukuDitemukan = true;
                    }
                    System.out.println(currentBuku.judul);
                }
            }
        }
        if (!bukuDitemukan) {
            System.out.println("-Buku dengan keyword " + keyword + " tidak ditemukan.");
        }
    }

}