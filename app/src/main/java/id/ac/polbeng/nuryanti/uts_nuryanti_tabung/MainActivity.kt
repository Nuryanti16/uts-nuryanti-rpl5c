package id.ac.polbeng.nuryanti.uts_nuryanti_tabung

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.nuryanti.uts_nuryanti_tabung.databinding.ActivityMainBinding
import kotlin.math.PI
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    // Deklarasi untuk View Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set listener untuk tombol hitung
        binding.calculateButton.setOnClickListener {
            calculateCylinder()
        }
    }

    private fun calculateCylinder() {
        // Ambil nilai dari input
        val radius = binding.inputRadius.text.toString().toDouble()
        val height = binding.inputHeight.text.toString().toDouble()

        // Hitung volume dan luas permukaan
        val volume = PI * radius.pow(2) * height
        val surfaceArea = 2 * PI * radius * (radius + height)

        // Tampilkan hasil
        binding.resultVolume.text = "Volume: %.2f".format(volume)
        binding.resultSurfaceArea.text = "Luas Permukaan: %.2f".format(surfaceArea)
    }
}