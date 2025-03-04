# LAB-OOP-01-2025
## Repositori Pengumpulan Tugas Praktikum OOP 2025

### Persyaratan Awal:
- Buat akun GitHub jika belum memiliki ([Daftar GitHub](https://github.com/)).
- Pastikan Git sudah terinstall di komputer Anda.

---

## **Alur Pengumpulan Tugas ke Repositori Ini**

### 1. **Fork Repositori**
Fork repositori ini ke akun GitHub Anda dengan menekan tombol **Fork** di kanan atas halaman repositori.

### 2. **Clone Repositori Hasil Fork**
Unduh repositori hasil fork ke komputer Anda dengan menjalankan perintah berikut:

```sh
   git clone https://github.com/YOUR_USERNAME/LAB-OOP-01-2025.git
```

Gantilah `YOUR_USERNAME` dengan username GitHub Anda.

---

### 3. **Struktur Folder dalam Repositori**
Setiap mahasiswa wajib mengikuti struktur folder berikut:
- Buat folder dengan nama **NIM** di dalam repositori.
- Di dalam folder **NIM**, buat folder baru untuk setiap praktikum dengan format: `Praktikum-n` _(n = nomor praktikum)_.

Contoh pembuatan folder:
```sh
mkdir "NIM"
cd "NIM"
mkdir "Praktikum-1"
cd "Praktikum-1"
```

Simpan seluruh file tugas untuk praktikum ke-`n` dalam folder **Praktikum-n**.

---

### 4. **Menambahkan dan Mengubah File**
Setiap kali menambahkan atau mengubah file, lakukan proses **commit** dengan pesan yang deskriptif.

```sh
# Menambahkan semua perubahan
git add .
# atau menambahkan file tertentu
git add "Praktikum-1/NIM/NamaFile.py"
```

Lakukan commit dengan pesan yang jelas:
```sh
git commit -m "Menambahkan solusi soal 1 pada Praktikum-1"
```

---

### 5. **Push Perubahan ke GitHub**
Setelah asistensi dan tugas disetujui, lakukan **push** ke repositori GitHub Anda:
```sh
git push origin NAMA_BRANCH
```

Jika belum menghubungkan Git dengan akun GitHub Anda, masukkan username dan personal access token sebagai password.

#### **Cara Membuat Personal Access Token (PAT):**
1. Klik foto profil GitHub Anda di pojok kanan atas.
2. Pilih **Settings**.
3. Gulir ke bawah dan pilih **Developer settings**.
4. Pilih **Personal access tokens**.
5. Klik **Generate new token**.
6. Masukkan catatan (contoh: `Token for LAB-OOP-01-2025`).
7. Atur masa berlaku token.
8. Pada bagian **Select scopes**, centang **repo**.
9. Klik **Generate new token**.
10. Salin dan simpan token, karena hanya bisa dilihat sekali.

---

### 6. **Membuat Pull Request (PR)**
1. Buka repositori hasil fork di akun GitHub Anda.
2. Pastikan semua perubahan sudah terdorong dengan benar.
3. Pilih tab **Pull request**.
4. Klik **New pull request**.
5. Pastikan perubahan sudah sesuai dan klik **Create pull request**.
6. Tambahkan deskripsi tugas dan submit PR Anda.

---

## **Hal-Hal yang Harus Diperhatikan**
✅ **Ikuti format pengumpulan sesuai aturan di atas.**
✅ **Satu Soal, Satu File.**
✅ **Satu Praktikum, Satu Folder.**
✅ **Program berjalan dengan baik dan benar berdasarkan ketentuan tugas.**
✅ **Tugas sudah di-asistensikan dan mendapat ACC.**

Pastikan Anda mengikuti semua prosedur agar tugas dapat dinilai dengan baik.

---

_Selamat mengerjakan dan semoga sukses!_ 🚀

