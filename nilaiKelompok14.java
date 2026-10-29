import java.util.Scanner;
public class nilaiKelompok14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus lebih dari 0.");
        } else {
            int nomorkelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;
            
           while (nomorkelompok <= jumlahKelompok) {
               System.out.println("Kelompok " + nomorkelompok + ":");
                double totalNilai = 0;
                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                  do {
                     System.out.print("nilai dari penilai " + j + ": ");
                     nilai = sc.nextInt();
                     if (nilai < 0 || nilai > 100) {
                        System.out.println("Nilai harus 0-100. Ulangi input!.");
                      } 
                  
                } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                    double rataNilai = totalNilai / jumlahPenilai;
                    System.out.println("Kelompok " + nomorkelompok + ": nilai rata-rata = " + rataNilai);

                    if (rataNilai > rataTertinggi) {
                        rataTertinggi = rataNilai;
                        kelompokTerbaik = nomorkelompok;
                    }


                    
                    
                }
                
                nomorkelompok++;
            }
            
            System.out.println("==============================");
            System.out.println("Kelompok terbaik : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }
        
        sc.close();
    }
}
