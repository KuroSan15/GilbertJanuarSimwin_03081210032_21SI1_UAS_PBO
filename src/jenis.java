import java.util.Scanner;
public class jenis extends pembayaran{
    Scanner temp = new Scanner(System.in);

    public int hitung(int durasi)
    {
        System.out.println("Masukkan jenis kamar[Standard/Sharing/Superior] : ");
        String jenis = temp.next();
        if (jenis.equals("Standard"))
        {
            int tagihan=300000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        else if (jenis.equals("Sharing"))
        {
            int tagihan=100000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        else if (jenis.equals("Superior"))
        {
            int tagihan=600000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        return durasi;
    }
    public void hitung (String jenis,int a)
    {
        
        if (jenis.equals("Card"))
        {
            double diskon = 1.02*a;
            System.out.println("Tagihan setelah diskon : "+diskon);
        }
        else if (jenis.equals("Cardless"))
        {
            double diskon = 0.97*a;
            System.out.println("Total setelah diskon: "+diskon);
        }
        
    }
    //shell sort
    public void sort(int arrayToSort[]) {
        int n = arrayToSort.length;
    
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
    }
    int x=0;
    
    public void simpandata()
    {
        for(int i=0;i<1;i++)
        {
            x++;
            
        }
        
        System.out.println("Apakah anda ingin menggunakan sort [y/n]? ");  
        String jwb = temp.next();
        if (jwb.equals("y"))
        {  
            System.out.println("Silahkan masukkan jumlah data yang akan disimpan : "); 
            int n= temp.nextInt(); 
            int[] array = new int[n];
            System.out.println("Silahkan masukkan total yang akan disimpan : ");  
            for(int i=0;i<n;i++)
        {
            array[i]=temp.nextInt();
        }
            System.out.println("Data yang sudah disimpan (Disusun dari nominal kecil)");
            sort(array);
        for (int i=0;i<array.length;++i)
        {
            System.out.println(""+array[i]);
        } 
        }
        else
        {
            System.out.println("Terima Kasih ");  
        }
      
    }
    
    public  void jenispembayarn()
    {
     
        System.out.println("Masukkan durasi penginapan : ");
        int durasi = temp.nextInt();
        hitung(durasi);
        System.out.println("Masukkan jenis pembayaran[Card/Cardless] : ");
        String jenis1 = temp.next();
        System.out.println("Tagihan anda : ");
        int tagihan = temp.nextInt();
        hitung(jenis1,tagihan);
        simpandata();
        
}
}
