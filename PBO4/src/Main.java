public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan1 = new Perpustakaan();
        perpustakaan1.nama = "Perpusatakan";

        perpustakaan1.inputBuku("B1", "Naruto", 3);
        perpustakaan1.inputBuku("B2", "One Piece", 0);
        perpustakaan1.inputBuku("B4", "Blackpink", 1);

        perpustakaan1.cekBuku("B1");
        perpustakaan1.cekBuku("B2");
        perpustakaan1.cekBuku("B4");

        perpustakaan1.cekDataBukuAdaAtauTidak("B3");
        perpustakaan1.cekDataBukuAdaAtauTidak("B2");
        perpustakaan1.cekDataBukuAdaAtauTidak("B1");
        perpustakaan1.cekDataBukuAdaAtauTidak("B4");

        perpustakaan1.cariBuku("Dragon ball");
        perpustakaan1.cariBuku("Attack on titan");
        perpustakaan1.cariBuku("Blackpink");
    }
}