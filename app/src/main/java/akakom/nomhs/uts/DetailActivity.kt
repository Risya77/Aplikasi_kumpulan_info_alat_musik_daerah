package akakom.nomhs.uts

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.angklung))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewAsalDetail.text = intent.getStringExtra("asal")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

        fun finish() {
            super.finish()
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

    }



}