package curso.edith.mypromedioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCalcular:Button = findViewById(R.id.btnCalcular)
        botonCalcular.setOnClickListener { realizarCalculo() }
    }

    private fun realizarCalculo() {
        val campoNombre:EditText = findViewById(R.id.txtName)
        val campoNota1:EditText = findViewById(R.id.txtNumber1)
        val campoNota2:EditText = findViewById(R.id.txtNumber2)
        val campoNota3:EditText = findViewById(R.id.txtNumber3)
        val campoResultado:TextView = findViewById(R.id.txtResult)

        val nombre:String = campoNombre.text.toString()
        val nota1:Double = campoNota1.text.toString().toDouble()
        val nota2:Double = campoNota2.text.toString().toDouble()
        val nota3:Double = campoNota3.text.toString().toDouble()

        val prom:Double = (nota1 + nota2 + nota3) / 3

        var result = ""

        if (prom > 3.5){
            result = "Gano con promedio de $prom"
        } else {
            result = "Perdio con promedio de $prom"
        }

        campoResultado.text = "Hola $nombre usted $result"

        Toast.makeText(this, result, Toast.LENGTH_LONG).show()

    }
}