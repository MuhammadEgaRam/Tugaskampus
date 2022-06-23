## **<center>Jobsheet Pertemuan 15</center>**

><p>Nama : Muhammad Ega Rama Fernanda<p>
>Kelas : 1F<p>
>Nomer Absen : 19<p>
>Prodi : D-IV Teknik Inormatika<p>
>Jurusan : Teknologi Inormasi<p>
><center> Politeknik Negeri Malang</center>


<br>

---
## **16.1. Tujuan Praktikum**
Setelah melakukan praktikum ini, mahasiswa mampu:
1. memahami bentuk-bentuk collection dan hierarkinya;
2. menerapkan collection sesuai dengan fungsi dan jenisnya;
3. menyelesaikan kasus menggunakan collection yang sesuai.

---
## **16.2. Kegiatan Praktikum 1**
#### **16.2.1. Percobaan 1**
Pada percobaan 1 ini akan dicontohkan penggunaan collection untuk menambahkan sebuah elemen, mengakses elemen, dan menghapus sebuah elemen.

1. Buatlah sebuah class ContohList yang main methode berisi kode program seperti di bawah ini<p>

    <img src = "Images/1.png"><p>

2. Tambahkan kode program untuk menggunakan collection dengan aturan penulisan kode program seperti berikut<p>

    <img src = "Images/2.png"><p>

    >Hasil Output :

    <img src = "Images/coba1.png"><p>

    >Source Code contohListMain :
    ```java
    package minggu16;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.ArrayList;
    /**
    *
    * @author EgaRam
    */
    public class contohList {
        public static void main(String[] args) {
            List l = new ArrayList();
            l.add(1);
            l.add(2);
            l.add(3);
            l.add("Cireng");
            System.out.printf("Elemen 0: %d total elemen : %d elemen terakhir : %s\n", l.get(0), l.size(), l.get(l.size() - 1));
            
            l.add(4);
            l.remove(0);
            System.out.printf("Elemen 0: %d total elemen : %d elemen terakhir : %s\n", l.get(0), l.size(), l.get(l.size() - 1));
            
            System.out.println("-------------------------------------------------------------------------------");
            
            List<String> names = new LinkedList<>();
            names.add("Noureen");
            names.add("Akhleema");
            names.add("Shannum");
            names.add("Uwais");
            names.add("Al-Qarni");
            
            System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", names.get(0), names.size(), names.get(names.size() - 1));
            names.set(0, "My kid");
            System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", names.get(0), names.size(), names.get(names.size() - 1));
            System.out.println("Names : " + names.toString());
        }
    }
    ```

---
#### **16.2.2. Verifikasi Hasil Percobaan**
Verifikasi hasil kompilasi kode program Anda dengan gambar berikut ini.

<img src = "Images/3.png"><p>

---
#### **16.2.3. Pertanyaan Percobaan**
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?

    >**Karena arraylist tersebut tidak terdapat kurung sudut yang menyimpan secara spesifik tipe data yang akan disimpan di dalamnya yang membuat Berbeda dengan array biasa, ArrayList memiliki sejumlah operasi yang lebih lengkap dan mudah digunakan dibandingkan dengan array biasa. ArrayList dapat menambah data baru secara dinamis tanpa harus menentukan ukurannya di awal**.

2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!

    <img src = "Images/coba3.png"><p>
    >**Pada gambar hanya menunjukan tipe data int, dan menambahkan data cireng akan langsung eror karena tipe data tersebut adalah String**.

3. Ubah kode pada baris kode 38 menjadi seperti ini<p>

    <img src = "Images/4.png"><p>

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya<p>

    <img src = "Images/5.png"><p>

5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!

    <img src = "Images/coba4.png"><p>
    >**Yang dapat saya jelaskan adalah kita dapat membatsi tipe data yang dimasukkan dengan perintah tandah panah yang didalamnya ada tipe data String, dan dengan menggunakan linkedlist kita dapat mengakses perintah push, getFirst, dan getLast**.

---
## **16.3. Kegiatan Praktikum 2**
#### **16.3.1. Tahapan Percobaan**
Pada praktikum 2 ini akan dibuat beberapa method untuk menampilkan beberapa cara yang dapat dilakukan untuk mengambil/menampilkan elemen pada sebuah collection. Silakan ikutilah Langkah-langkah di bawah ini

1. Buatlah class dengan nama LoopCollection serta tambahkan method main yang isinya adalah sebagai berikut.<p>

    <img src = "Images/6.png"><p>

2. Tambahkan potongan kode berikut ini dari yang sebelumnya agar proses menampilkan elemen pada sebuah stack bervariasi.<p>

    <img src = "Images/7.png"><p>

    >Hasil Output :

    <img src = "Images/coba2.png"><p>

    >Source Code LoopCollectionMain :
    ```java
    package minggu16.prak2;
    import java.util.Stack;
    import java.util.Iterator;
    /**
    *
    * @author EgaRam
    */
    public class LoopCollection {
        public static void main(String[] args) {
            Stack<String> fruits = new Stack<>();
            fruits.push("Banana");
            fruits.add("Orange");
            fruits.add("Watermelon");
            fruits.add("Leci");
            fruits.push("Salak");
            
            for(String fruit : fruits){
                System.out.printf("%s ", fruit);
            }
            
            System.out.println("\n" + fruits.toString());
            
            while(!fruits.empty()){
                System.out.printf("%s ", fruits.pop());
            }
            fruits.push("Melon");
            fruits.push("Durian");
            System.out.println("");
            for(Iterator<String> it = fruits.iterator(); it.hasNext();){
                String fruit = it.next();
                System.out.printf("%s ", fruit);
            }
            System.out.println("");
            fruits.stream().forEach(e -> {
                System.out.printf("%s ", e);
            });
            System.out.println("");
            for(int i = 0; i < fruits.size(); i++){
                System.out.printf("%s ", fruits.get(i));
            }
        }
    }
    ```

---
#### **16.3.2. Verifikasi Hasil Percobaan**
Verifikasi hasil kompilasi kode program Anda dengan gambar berikut ini.

<img src = "Images/8.png"><p>

---
#### **16.3.3. Pertanyaan Percobaan**
1. Apakah perbedaan fungsi push() dan add() pada objek fruits?

    >**Fungsi push dan add pada code diatas adalah untuk menambahkan element, yang membedakan adalah :**
    >- **Push merupakan fungsi dari stack dan;**
    >- **Kalau add ini adalah bukan fungsi dari ciri khas stack**.
2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?

    <img src = "Images/coba5.png"><p>
    >**Yang terjadi adalah data tersebut tidak akan ditampilkan pada output karena fungsi pushnya sudah dihilangkan**.
3. Jelaskan fungsi dari baris 46-49?

    >- **Pada baris 46 berfungsi untuk proses inisialisasi dan mengatur aturan perulangan sesuai perintah yang di instruksikan;**
    >- **pada baris 47 adalah untuk pembuatan variabel fruit untuk it.next yang berarti nanti akan melanjutkan data selanjutnya;**
    >- **lalu pada baris 48 berfungsi untuk mencetak variabel fruit**.**

4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?

    <img src = "Images/coba6.png"><p>
    >**Yang terjadi adalah error pada bagian fungsi push, empty, dan pop, karena pada list tidak terdapat fungsi push dan kawan-kawan dan hanya untuk fungsi stack**.

5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!

    >Hasil Output   :

    <img src = "Images/coba7.png"><p>

    >Source Code LoopCollectionMain :
    ```java
    package minggu16.prak2;
    import java.util.Stack;
    import java.util.Iterator;
    import java.util.List;
    /**
    *
    * @author EgaRam
    */
    public class LoopCollection {
        public static void main(String[] args) {
            Stack<String> fruits = new Stack<>();
            fruits.push("Banana");
            fruits.add("Orange");
            fruits.add("Watermelon");
            fruits.add("Leci");
            fruits.push("Salak");
            
            for(String fruit : fruits){
                System.out.printf("%s ", fruit);
            }
            
            System.out.println("\n" + fruits.toString());
            
            while(!fruits.empty()){
                System.out.printf("%s ", fruits.pop());
            }
            fruits.push("Melon");
            fruits.push("Strawberry");
            System.out.println("");
            for(Iterator<String> it = fruits.iterator(); it.hasNext();){
                String fruit = it.next();
                System.out.printf("%s ", fruit);
            }
            System.out.println("");
            fruits.stream().forEach(e -> {
                System.out.printf("%s ", e);
            });
            System.out.println("");
            for(int i = 0; i < fruits.size(); i++){
                System.out.printf("%s ", fruits.get(i));
            }
        }
    }
    ```

6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!

    >Hasil Output   :

    <img src = "Images/coba8.png"><p>

    >Source Code LoopCollectionMain :
    ```java
    package minggu16.prak2;
    import java.util.Stack;
    import java.util.Iterator;
    import java.util.Collections;
    /**
    *
    * @author EgaRam
    */
    public class LoopCollection {
        public static void main(String[] args) {
            Stack<String> fruits = new Stack<>();
            fruits.push("Banana");
            fruits.add("Orange");
            fruits.add("Watermelon");
            fruits.add("Leci");
            fruits.push("Salak");
            
            for(String fruit : fruits){
                System.out.printf("%s ", fruit);
            }
            
            System.out.println("\n" + fruits.toString());
            
            while(!fruits.empty()){
                System.out.printf("%s ", fruits.pop());
            }
            fruits.push("Melon");
            fruits.push("Strawberry");
            System.out.println("");
            for(Iterator<String> it = fruits.iterator(); it.hasNext();){
                String fruit = it.next();
                System.out.printf("%s ", fruit);
            }
            System.out.println("");
            fruits.stream().forEach(e -> {
                System.out.printf("%s ", e);
            });
            System.out.println("");
            for(int i = 0; i < fruits.size(); i++){
                System.out.printf("%s ", fruits.get(i));
            }
            System.out.println(" ");
            //Menambahkan data dengan sorting
            fruits.push("Mango");
            fruits.push("Guava");
            fruits.push("Avocado");
            
            System.out.println("\nData sudah tersorting");
            Collections.sort(fruits);
            Iterator i = fruits.iterator();
            
            while(i.hasNext()){
                System.out.println(i.next());
            }
        }
    }
    ```

---
## **16.4. Kegiatan Praktikum 3**
#### **16.4.1. Tahapan Percobaan**
Pada praktikum 3 ini dilakukan uji coba untuk mengimplementasikan sebuah collection untuk menampung objek yang dibuat sesuai kebutuhan. Objek tersebut adalah sebuah objek mahasiswa dengan fungsi-fungsi umum seperti menambahkan, menghapus, mengubah, dan mencari.

1. Buatlah sebuah class Mahasiswa dengan attribute, kontruktor, dan fungsi sebagai berikut.<p>

    <img src = "Images/9.png"><p>

2. Selanjutnya, buatlah sebuah class ListMahasiswa yang memiliki attribute seperti di bawah ini<p>

    <img src = "Images/10.png"><p>

3. **Method tambah()**, **hapus()**, **update()**, **dan tampil()** secara berurut dibuat agar bisa melakukan operasi-operasi seperti yang telah disebutkan.<p>

    <img src = "Images/11.png"><p>

4. Untuk proses hapus, update membutuhkan fungsi pencarian terlebih dahulu yang potongan kode programnya adalah sebagai berikut<p>

    <img src = "Images/12.png"><p>

5. Pada class yang sama, tambahkan main method seperti potongan program berikut dan amati hasilnya!<p>

    <img src = "Images/13.png"><p>

    >Hasil Output   :

    <img src = "Images/coba9.png"><p>

    >Source Code MahasiswaClass :
    ```java
    package minggu16.prak3;

    /**
    *
    * @author EgaRam
    */
    public class Mahasiswa {
        String nim;
        String nama;
        String notelp;
        
        public Mahasiswa(){
        }
        
        public Mahasiswa(String nim, String nama, String notelp){
            this.nim = nim;
            this.nama = nama;
            this.notelp = notelp;
        }
        
        @Override
        public String toString(){
            return "Mahasiswa{" + "nim = " +nim+ ", nama = " +nama+ ", notelp = " +notelp+ '}';
        }
    }
    ```

    >Source Code ListMahasiswaMain :
    ```java
    package minggu16.prak3;

    import java.util.List;
    import java.util.ArrayList;
    import java.util.Arrays;
    /**
    *
    * @author EgaRam
    */
    public class ListMahasiswa {
        List<Mahasiswa> mahasiswas = new ArrayList<>();
        
        public void tambah(Mahasiswa... mahasiswa){
            mahasiswas.addAll(Arrays.asList(mahasiswa));
        }
        public void hapus(int index){
            mahasiswas.remove(index);
        }
        public void update(int index, Mahasiswa mhs){
            mahasiswas.set(index, mhs);
        }
        public void tampil(){
            mahasiswas.stream().forEach(mhs ->{
                System.out.println("" +mhs.toString());
            });
        }
        int linearSearch(String nim){
            for(int i = 0; i < mahasiswas.size(); i++){
                if(nim.equals(mahasiswas.get(i).nim)){
                    return i;
                }
            }
            return -1;
        }
        
        public static void main(String[] args) {
            ListMahasiswa lm = new ListMahasiswa();
            Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
            Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
            Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
            //menambahkan objek mahasiswa
            lm.tambah(m, m1, m2);
            //menampilkan list mahasiswa
            lm.tampil();
            //update mahasiswa
            lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
            System.out.println("");
            lm.tampil();
        }
    }
    ```

---
#### **16.4.2. Verifikasi Hasil Percobaan**
Verifikasi hasil kompilasi kode program Anda dengan gambar berikut ini.

<img src = "Images/14.png"><p>

---
#### **16.4.3. Pertanyaan Percobaan**
1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?

    >**Pada fungsi tambah menggunakan konsep fungsi addAll dari collections dimana konsep ini memiliki kelebihan yaitu dapat menambahkan element tanpa ada batas jumlah element**.
2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!

    >Hasil Output   :

    <img src = "Images/coba10.png"><p>

    >Source Code MahasiswaClass :
    ```java
    package minggu16.prak3;

    /**
    *
    * @author EgaRam
    */
    public class Mahasiswa {
        String nim;
        String nama;
        String notelp;
        
        public Mahasiswa(){
        }
        
        public Mahasiswa(String nim, String nama, String notelp){
            this.nim = nim;
            this.nama = nama;
            this.notelp = notelp;
        }
        
        @Override
        public String toString(){
            return "Mahasiswa{" + "nim = " +nim+ ", nama = " +nama+ ", notelp = " +notelp+ '}';
        }
    }
    ```

    >Source Code ListMahasiswaMain :
    ```java
    package minggu16.prak3;

    import java.util.List;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.Comparator;
    /**
    *
    * @author EgaRam
    */
    public class ListMahasiswa {
        List<Mahasiswa> mahasiswas = new ArrayList<>();
        
        public void tambah(Mahasiswa... mahasiswa){
            mahasiswas.addAll(Arrays.asList(mahasiswa));
        }
        public void hapus(int index){
            mahasiswas.remove(index);
        }
        public void update(int index, Mahasiswa mhs){
            mahasiswas.set(index, mhs);
        }
        public void tampil(){
            mahasiswas.stream().forEach(mhs ->{
                System.out.println("" +mhs.toString());
            });
        }
        int linearSearch(String nim){
            for(int i = 0; i < mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                    return i;
                }
            }
            return -1;
        }
        int binarySearch(String nim){
            return Collections.binarySearch(mahasiswas, new Mahasiswa (nim, null, null), new Comparator<Mahasiswa>(){
                @Override
                public int compare(Mahasiswa o1, Mahasiswa o2){
                    return o1.nim.compareTo(o2.nim);
                }
            });
        }
        public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        System.out.println("Data Awal");
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("....................Menggunakan Linear Search.......................");
        System.out.println("--------------------------------------------------------------------");
        //update mahasiswa
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("....................Menggunakan Binary Search.......................");
        System.out.println("--------------------------------------------------------------------");
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
        }
    }
    ```

3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!

    >Hasil Output   :

    <img src = "Images/coba11.png"><p>

    >Source Code MahasiswaClass :
    ```java
    package minggu16.prak3;

    /**
    *
    * @author EgaRam
    */
    public class Mahasiswa {
        String nim;
        String nama;
        String notelp;
        
        public Mahasiswa(){
        }
        
        public Mahasiswa(String nim, String nama, String notelp){
            this.nim = nim;
            this.nama = nama;
            this.notelp = notelp;
        }
        
        @Override
        public String toString(){
            return "Mahasiswa{" + "nim = " +nim+ ", nama = " +nama+ ", notelp = " +notelp+ '}';
        }
    }
    ```

    >Source Code ListMahasiswaMain :
    ```java
    package minggu16.prak3;

    import java.util.List;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.Comparator;
    /**
    *
    * @author EgaRam
    */
    public class ListMahasiswa {
        List<Mahasiswa> mahasiswas = new ArrayList<>();
        
        public void tambah(Mahasiswa... mahasiswa){
            mahasiswas.addAll(Arrays.asList(mahasiswa));
        }
        public void hapus(int index){
            mahasiswas.remove(index);
        }
        public void update(int index, Mahasiswa mhs){
            mahasiswas.set(index, mhs);
        }
        public void tampil(){
            mahasiswas.stream().forEach(mhs ->{
                System.out.println("" +mhs.toString());
            });
        }
        int linearSearch(String nim){
            for(int i = 0; i < mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                    return i;
                }
            }
            return -1;
        }
        int binarySearch(String nim){
            return Collections.binarySearch(mahasiswas, new Mahasiswa (nim, null, null), new Comparator<Mahasiswa>(){
                @Override
                public int compare(Mahasiswa o1, Mahasiswa o2){
                    return o1.nim.compareTo(o2.nim);
                }
            });
        }
        public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        System.out.println("Data Awal");
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("....................Menggunakan Linear Search.......................");
        System.out.println("--------------------------------------------------------------------");
        //update mahasiswa
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("....................Menggunakan Binary Search.......................");
        System.out.println("--------------------------------------------------------------------");
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        //asc
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\n..........Data Diurutkan Secara Ascending Collections...........\n");
        System.out.println("--------------------------------------------------------------------");
        lm.ascSort();
        lm.tampil();
        
        //dsc
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\n.........Data Diurutkan Secara Descending Collections...........\n");
        System.out.println("--------------------------------------------------------------------");
        lm.dscSort();
        lm.tampil();
        }
    }
    ```

---
## **16.5. Tugas Praktikum**
1. Implementasikan stack menggunakan collection dengan contoh kasus tumpukan daftar film sesuai dengan fitur-fitur yang ditunjukkan pada gambar di bawah ini!

    **Ilustrasi Program**

    *Menu Awal dan Tambah Data (Push)*<p>

    <img src = "Images/17.png"><p>
    <img src = "Images/18.png"><p>

    >Hasil Output   :

    <img src = "Images/coba12.png"><p>
    <img src = "Images/coba13.png"><p>
    <img src = "Images/coba14.png"><p>

    >Source Code filmClass :
    ```java
    package minggu16.tugas1;

    /**
    *
    * @author EgaRam
    */
    public class film {
        String judul;
        String id;
        String tahun;
        String director;
        
        public film(){
        }
        
        public film(String judul, String id, String tahun, String director){
            this.judul = judul;
            this.id = id;
            this.tahun = tahun;
            this.director = director;
        }
        
        @Override
        public String toString(){
            return "film{" + "id = " +id+ ", judul = " +judul+ ", tahun = " +tahun+ ", director = " +director+'}';
        }
    }
    ```

    >Source Code filmMain :
    ```java
    package minggu16.tugas1;
    import java.util.Scanner;
    import java.util.Stack;
    /**
    *
    * @author EgaRam
    */


    public class filmMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Scanner in = new Scanner(System.in);
            Scanner rt = new Scanner(System.in);
            
            
            Stack<film> data = new Stack<>();
            
            char pilih;
            int menu;
            do {
                System.out.println("====================================");
                System.out.println("Data Film Layar Lebar Sepanjang Masa");
                System.out.println("====================================");
                System.out.println("1. Input Judul Film");
                System.out.println("2. Hapus Data Film Teratas");
                System.out.println("3. Cek Judul Film Teratas");
                System.out.println("4. Info semua Judul Film");
                System.out.println("5. Keluar");
                System.out.println("====================================\n");
                System.out.print("Masukkan Pilihan Menu (1-5): ");
                menu = in.nextInt();
                System.out.println("");
                if (menu < 1 || menu > 5) {
                    System.out.println("Masukkan Pilihan Menu Yang Benar!");
                }
                
                switch(menu){
                    case 1 : {
                        do{
                        System.out.println("=======================================");
                        System.out.print("ID Film\t\t: ");
                        String id = sc.nextLine();
                        System.out.print("Judul Film\t: ");
                        String judul = sc.nextLine();
                        System.out.print("Tahun Tayang\t: ");
                        String tahun = sc.nextLine();
                        System.out.print("Director\t\t: ");
                        String director = sc.nextLine();
                        film put = new film(id, judul, tahun, director);
                        data.push(put);
                        System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                        pilih = rt.next().charAt(0);
                        System.out.println("");
                    }while (pilih == 'y' || pilih == 'Y');
                }break;
                
                    case 2 : {
                        System.out.println("==========================================");
                        System.out.println("    Hasil Menghapus Data Film Terartas    ");
                        System.out.println("==========================================");
                        System.out.println(data.pop());
                        System.out.println("");
                    }break;
                    
                    case 3 : {
                        System.out.println("==========================================");
                        System.out.println("            Judul Film Teratas            ");
                        System.out.println("==========================================");
                        System.out.println(data.peek());
                        System.out.println("");
                    }break;
                    
                    case 4 : {
                        System.out.println("==========================================");
                        System.out.println("          Info Semua Judul Film           ");
                        System.out.println("==========================================");
                        for(int i = 0; i<data.size(); i++){
                            System.out.println(data.get(i));
                        }
                        System.out.println("");
                    }break;
                    
                    case 5 : {
                        System.out.print("Terimakasih");
                        System.exit(0);
                    }break;
            }
        }while(true);
    }
    }
    ```

2. Buatlah implementasi program daftar nilai mahasiswa semester, minimal memiliki 3 class yaitu Mahasiswa, Nilai, dan Mata Kuliah. Khusus untuk data Mahasiswa dan Mata Kuliah harus sudah diinisialisasi, sehingga ketika memasukkan data nilai data mahasiswa dan mata kuliah cukup menginputkan nim ataupun kode mata kuliah. Yang paling penting adalah antara objek mahasiswa, matakuliah, dan nilai harus saling terhubung.

    **Ilustrasi Program**

    *Menu Awal dan Tambah Data (Push)*<p>

    <img src = "Images/15.png"><p>
    <img src = "Images/16.png"><p>

    >Hasil Output   :

    <img src = "Images/coba15.png"><p>
    <img src = "Images/coba16.png"><p>
    <img src = "Images/coba17.png"><p>
    <img src = "Images/coba18.png"><p>
    <img src = "Images/coba19.png"><p>

    >Source Code MahasiswaClass :
    ```java
    package minggu16.tugas2;

    /**
    *
    * @author EgaRam
    */
    public class Mahasiswa {
        String nim;
        String nama;
        String notelp;
        
        public Mahasiswa(String nim, String nama, String notelp){
            this.nim = nim;
            this.nama = nama;
            this.notelp = notelp;
        }
        public String toString(){
            return String.format("%s\t%-15s\t%s", nim, nama, notelp);
        }
    }
    ```

    >Source Code mataKuliahClass :
    ```java
    package minggu16.tugas2;

    /**
    *
    * @author EgaRam
    */
    public class mataKuliah {
        String kode, namaMk;
        int sks;
        
        public mataKuliah(String kode, String namaMk, int sks){
            this.kode = kode;
            this.namaMk = namaMk;
            this.sks = sks;
        }
        public String toString(){
            return String.format("%s\t%-45s%s", kode, namaMk, sks);
        }       
    }
    ```

    >Source Code NilaiMain :
    ```java
    package minggu16.tugas2;
    import java.util.Scanner;
    import java.util.List;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Comparator;
    /**
    *
    * @author EgaRam
    */
    public class Nilai {
        String kodeN;
        double nilai;
        Mahasiswa mhs;
        mataKuliah mk;
        
        public Nilai(String kodeN, double nilai, Mahasiswa mhs, mataKuliah mk){
            this.kodeN = kodeN;
            this.nilai = nilai;
            this.mhs = mhs;
            this.mk = mk;
        }
        List<Mahasiswa> mhsA = new ArrayList<>();
        List<mataKuliah> matkulE = new ArrayList<>();
        
        public void tambahMhs(Mahasiswa... mahasiswa){
            mhsA.addAll(Arrays.asList(mahasiswa));
        }
        public void tambahMatkul(mataKuliah... matkul){
            matkulE.addAll(Arrays.asList(matkul));
        }
        public void tampilMhs(){
            mhsA.stream().forEach(mhs ->{
                System.out.println("" + mhs.toString());
            });
        }
        public void tampilMatkul(){
            matkulE.stream().forEach(mk ->{
                System.out.println("" + mk.toString());
            });
        }
        int linearSearchMhs(String nim){
            for(int i = 0; i < mhsA.size(); i++){
                if(nim.equals(mhsA.get(i).nim)){
                    return i;
                }
            }
            return -1;
        }
        int linearSearchMatkul(String matkul){
            for(int i = 0; i < matkulE.size(); i++){
                if(matkul.equals(matkulE.get(i).kode)){
                    return i;
                }
            }
            return -1;
        }
        Mahasiswa cariMhs(String nim){
            for(int i = 0; i < mhsA.size(); i++){
                if(nim.equals(mhsA.get(i).nim)){
                    return mhsA.get(i);
                }
            }
            return null;
        }
        mataKuliah cariMatkul(String matkul){
            for(int i = 0; i < matkulE.size(); i++){
                if(matkul.equals(matkulE.get(i).kode)){
                    return matkulE.get(i);
                }
            }
            return null;
        }
        public String toString(int idx1, int idx2){
            return mhsA.get(idx1).nim + "\t" + mhsA.get(idx1).nama + "\t" + matkulE.get(idx2).namaMk + "\t" + matkulE.get(idx2).sks + "\t";
        }
        static Comparator<Nilai> compNilai = (n1, n2) ->{
            if(n1.nilai < n2.nilai){
                return -1;
            }else if(n1.nilai > (n2).nilai){
                return 1;
            }else{
                return 0;
            }
        };
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Scanner se = new Scanner(System.in);
            Scanner sb = new Scanner(System.in);
            
            List<Nilai> noll = new ArrayList<>();
            Nilai n = new Nilai("", 0, null, null);
            
            Mahasiswa m1 = new Mahasiswa("20001", "Natasha", "021xxx");
            Mahasiswa m2 = new Mahasiswa("20002", "Amanda", "021xxx");
            Mahasiswa m3 = new Mahasiswa("20003", "Iqbal", "021xxx");
            Mahasiswa m4 = new Mahasiswa("20004", "Anggara", "021xxx");
            Mahasiswa m5 = new Mahasiswa("20005", "Guanna", "021xxx");
            Mahasiswa m6 = new Mahasiswa("20006", "Natasha", "021xxx");
            
            n.tambahMhs(m1, m2, m3, m4, m5, m6);
            
            mataKuliah mk1 = new mataKuliah("0001", "Internet of Things", 3);
            mataKuliah mk2 = new mataKuliah("0002", "Algoritma dan Struktur Data", 2);
            mataKuliah mk3 = new mataKuliah("0003", "Algoritma dan Pemrograman", 2);
            mataKuliah mk4 = new mataKuliah("0004", "Praktikum Algoritma dan Struktur Data", 3);
            mataKuliah mk5 = new mataKuliah("0005", "Algoritma dan Struktur Data", 3);
            
            n.tambahMatkul(mk1, mk2, mk3, mk4, mk5);
            
            Nilai n1 = null;
            String nimMhs, mkMhs;
            
            int menu;
            do {
                System.out.println("===============================================");
                System.out.println("Sistem Pengolahan Data Nilai Mahasiswa Semester");
                System.out.println("===============================================");
                System.out.println("1. Input Nilai");
                System.out.println("2. Tampil Nilai");
                System.out.println("3. Mencari Nilai Mahasiswa");
                System.out.println("4. Urut Data Nilai");
                System.out.println("5. Keluar");
                System.out.println("====================================\n");
                System.out.print("Masukkan Pilihan Menu (1-5): ");
                menu = se.nextInt();
                System.out.println("");

                switch(menu){
                    case 1 :
                        System.out.println("=======================================");
                        System.out.print("Kode\t: ");
                        String kd = sc.nextLine();
                        System.out.print("Nilai\t: ");
                        double nilMhs = sb.nextDouble();                                     
                        System.out.println("");
                        
                            System.out.println("========================================");
                            System.out.println("             Daftar Mahasiswa           ");
                            System.out.println("========================================");
                            System.out.println("NIM\tNama\t\tTelf");
                            n.tampilMhs();
                            System.out.print("Pilih Mahasiswa by NIM : ");
                            nimMhs = sc.nextLine();
                            Mahasiswa mhaSiswas;
                            mhaSiswas = n.cariMhs(nimMhs);
                            
                            System.out.println("========================================");
                            System.out.println("            Daftar Mata Kuliah          ");
                            System.out.println("========================================");
                            System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                            n.tampilMatkul();
                            System.out.print("Pilih Mata Kuliah by Kode : ");
                            mkMhs = sc.nextLine();
                            mataKuliah mtKuliah;
                            mtKuliah = n.cariMatkul(mkMhs);
                            
                            n1 = new Nilai(kd, nilMhs, mhaSiswas, mtKuliah);
                            
                            noll.add(n1);
                            System.out.println("");
                            break;
                                        
                    case 2 : 
                        System.out.println("========================================");
                        System.out.println("             Daftar Mahasiswa           ");
                        System.out.println("========================================");
                        System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                        for(int i = 0; i < noll.size(); i++){
                            n.linearSearchMhs(noll.get(i).mk.kode);
                            System.out.println(n.toString(n.linearSearchMhs(noll.get(i).mhs.nim), n.linearSearchMatkul(noll.get(i).mk.kode))+ noll.get(i).nilai);
                            }
                        System.out.println("");
                        break;
                        
                        
                    case 3:
                        System.out.println("========================================");
                        System.out.println("             Daftar Mahasiswa           ");
                        System.out.println("========================================");
                        System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                        int sks = 0;
                        for(int i=0; i<noll.size(); i++){
                            n.linearSearchMhs(noll.get(i).mhs.nim);
                            n.linearSearchMatkul(noll.get(i).mk.kode);
                            System.out.println(n.toString(n.linearSearchMhs(noll.get(i).mhs.nim), n.linearSearchMatkul(noll.get(i).mk.kode))+ noll.get(i).nilai);
                        }
                        System.out.print("Masukkan Data Mahasiswa NIM : ");
                        String input = sc.nextLine();
                        System.out.println("");
                        for (int i = 0; i < noll.size(); i++){
                            if(input.equalsIgnoreCase(noll.get(i).mhs.nim)){
                                sks += n.matkulE.get(i).sks;
                                n.linearSearchMhs(noll.get(i).mhs.nim);
                                n.linearSearchMatkul(noll.get(i).mk.kode);
                                System.out.println(n.toString(n.linearSearchMhs(noll.get(i).mhs.nim), n.linearSearchMatkul(noll.get(i).mk.kode)) + noll.get(i).nilai);    
                            }
                        }
                        System.out.println("Total SKS " + sks + " Telah Diambil");
                        System.out.println("");
                        break;
                        
                    case 4:
                        System.out.println("========================================");
                        System.out.println("             Daftar Mahasiswa           ");
                        System.out.println("========================================");
                        System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                        noll.sort(compNilai);
                        for (int i = 0; i < noll.size(); i++){
                            n.linearSearchMhs(noll.get(i).mhs.nim);
                            n.linearSearchMatkul(noll.get(i).mk.kode);
                            System.out.println(n.toString(n.linearSearchMhs(noll.get(i).mhs.nim), n.linearSearchMatkul(noll.get(i).mk.kode)) + noll.get(i).nilai);
                        }
                        System.out.println("");
                        break;
                        
                    case 5:
                        System.out.println("+=====================================+");
                        System.out.println("+             Terima Kasih            +");
                        System.out.println("+=====================================+");
                        break;
                    
                } 
            }while (menu < 5 && menu > 0);
        }
    }
    ```

---
=============Terimakasiih Banyak==============

---