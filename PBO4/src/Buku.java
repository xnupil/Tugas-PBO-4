public class Buku {
        String idBuku;
        String judul;
        double rate;
        int jumlahStock;
        int totalRate;
        int totalReviewer;

        public Buku(String idBuku, String judul, int stock) {
            this.idBuku = idBuku;
            this.judul = judul;
            this.jumlahStock = stock;
        }

        Boolean bisaDipinjam(){
            if (jumlahStock > 0) {
                return true;
            }
            else {
                return false;
            }
        }

        int dendaPerHari() {
            if (rate >= 4.0){
                return 3000;
            } else if (rate >=  3.0) {
                return 2000;
            }
            else {
                return 1000;
            }
        }

    }
