package com.example.managecollection

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set fungsi klik untuk tombol kategori
        topCategory.setOnClickListener {
            Toast.makeText(this, "Top dipilih", Toast.LENGTH_SHORT).show()
            // Tambahkan fungsi untuk menampilkan kategori "Top"
        }

        skirtCategory.setOnClickListener {
            Toast.makeText(this, "Skirt dipilih", Toast.LENGTH_SHORT).show()
            // Tambahkan fungsi untuk menampilkan kategori "Skirt"
        }

        accessoriesCategory.setOnClickListener {
            Toast.makeText(this, "Accessories dipilih", Toast.LENGTH_SHORT).show()
            // Tambahkan fungsi untuk menampilkan kategori "Accessories"
        }

        cameraButton.setOnClickListener {
            Toast.makeText(this, "Kamera diklik", Toast.LENGTH_SHORT).show()
            // Tambahkan fungsi untuk membuka kamera atau pemilih gambar
        }
    }
}
