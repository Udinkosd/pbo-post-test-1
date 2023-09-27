NAMA ABDUL RAHMAN
NIM 2209116045
KELAS A22

### *Kelas Motorcycle*
#### *Implementasi Properti dan Kelas*
![image](https://github.com/Udinkosd/pbo-post-test-1/assets/126738691/42666b96-4f7b-4843-a0cf-0f3117f433a3)
Disini kita akan meggunakan kelas Motorcycle, yang dimana didalamnya terdapat beberapa properti yaitu merupakan informasi utama
dari sebuah motor, mulai dari brand, model, jenis mesin, hingga harga motor itu sendiri.

Public String Brand, yaitu properti yang berisikan informasi merek dari kelas motor.
Public String Model, yaitu properti jenis dari kelas motor, dalam kasus ini adalah CBR500R
Public String Mesin, yaitu properti mesin, dalam kasus ini adalah 500CC untuk CBR500R
Public Int Price, yaitu properti yang menjelaskan harga motor CBR500R

Adapun penggunakan string karena properti tersebut berisikan karakter huruf, text, lalu int karena pada properti price, hanya berisi
angka, lalu kode diawali dengan deklarasi "Public" agar kelas dan properti dapat diakses dari luar program, termasuk diluar _package_.

## **Implementasi Konstruktor**
![image](https://github.com/Udinkosd/pbo-post-test-1/assets/126738691/a85ed58a-1041-48a7-aa1e-8a32d158ae2b)
Kode di atas adalah konstruktor untuk kelas Motorcycle. Konstruktor ini memiliki empat parameter yang digunakan untuk menginisialisasi
properti-properti dalam objek Motorcycle, yaitu brand, model, machine, dan price. Setiap parameter di dalam konstruktor ini menerima
nilai dari luar saat objek Motorcycle dibuat menggunakan kata kunci _new_.

Konstruktor this.brand adalah pernyataan yang mengatur nilai properti brand dalam objek Motorcycle menjadi nilai yang diteruskan melalui
parameter brand. Hal ini berlaku kepada konstruktor lainnya, model, machine, dan price.

Adapun deklarasi _this__ digunakan untuk membedakan antara parameter-parameter konstruktor (misalnya, brand, model, dll.) dan properti
properti objek. Contohnya adalah saat kita memiliki parameter brand dan properti brand dengan nama yang sama, "this" membantu Java
memahami bahwa yang dimaksud adalah properti objek, bukan parameter konstruktor.

### *Kelas Posttest1*
![image](https://github.com/Udinkosd/pbo-post-test-1/assets/126738691/49412485-2cf2-4193-b129-320c53775410)
Lalu dikelas java yang lainnya, yaitu Posttest1.java, kita menggunakan _package_ untuk memanggil kelas lainnya, dalam kasus ini adalah 
kelas Motorcycle.

![image](https://github.com/Udinkosd/pbo-post-test-1/assets/126738691/3153cca4-fbce-43f1-aa23-a99cfe77baaf)
"Public static void main(String[] args)" adalah metode main, yang merupakan titik masuk utama untuk dari program kita. Semua kode di
dalam kelas ini, akan dieksekusi dari sini.

"Motorcycle motorcycle1 = new Motorcycle("Honda", "CBR500R", "500cc", 30000000)" adalah baris pertama yang membuat objek pertama
motorcycle1 dari kelas Motorcycle dengan menggunakan konstruktor. Objek ini berisi merek "Honda," model "CBR500R," mesin "500cc," dan
harga 30.000.000.

![image](https://github.com/Udinkosd/pbo-post-test-1/assets/126738691/98ca2729-82f3-4214-955e-677aa7f1785c)
ArrayList adalah deklarasi dan inisialisasi dari motorcycles. ArrayList ini digunakan untuk menyimpan objek-objek dari kelas Motorcycle.
Selanjutnya, setelah kita melakukan inisialisasi dengan ArrayList, maka kita dapat menambah objek didalam Array tersebut yaitu dengan
mengggunakan _add_. 

![image](https://github.com/Udinkosd/pbo-post-test-1/assets/126738691/0ba5ebfe-20cc-4a29-b2d0-2bcfb854b4ec)
Deklarasi _for_ digunakan untuk melakukan perulangan pada setiap elemen ArrayList yang telah kita buat sebelumnya.

