package akakom.nomhs.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.kolintang,"Kolintang","Sulawesi Utara",
            "Kolintang adalah salah satu alat musik tradisional masyarakat Minahasa di Sulawesi Utara." +
                    "Alat musik ini terbuat dari kayu khusus yang disusun dan dimainkan dengan cara dipukul"+
                    "Sekilas Kolintang ini hampir sama dengan alat musik Gambang dari Jawa,"+
                    "namun yang membedakan adalah nada yang dihasilkan lebih lengkap dan cara memainkannya sedikit berbeda."))

        data?.add(DataModel(R.drawable.angklung,"Angklung","Jawa Barat",
            "Angklung merupakan salah satu alat musik tradisional Indonesia, tepatnya berasal dari Jawa Barat." +
                    "Angklung alat musik tradisional yang terbuat dari bambu." +
                    "Di mana cara memainkannya dengan digoyangkan, sehingga menghasilkan nada.")
        )

        data?.add(DataModel(R.drawable.saron,"Saron","Jawa, Bali", "Saron merupakan alat musik tradisional daerah Jawa dan Bali."+
                "Saron juga merupakan salah satu instrumen gamelan yang termasuk keluarga balungan."+
                "Saron terbuat dari perunggu dan memainkannya dengan cara dipukul menggunakan palu."))

        data?.add(DataModel(R.drawable.kendang,"Kendang","Jawa Tengah", "Kendhang, atau gendang adalah instrumen dalam gamelan yang salah satu fungsi utamanya mengatur irama."+
                "Instrument ini dibunyikan dengan tangan, tanpa alat bantu."+
                "Jenis kendhang yang kecil disebut ketipung, yang menengah disebut kendhang ciblon/kebar."+
                "Pasangan ketipung ada satu lagi bernama rony gedhe, biasa disebut kendhang kalih."))

        data?.add(DataModel(R.drawable.sasando,"Sasando","Nusa Tenggara Timur", "Sasandu (bahasa Rote) Sasando (bahasa Kupang) adalah "+
                "alat musik berdawai yang dimainkan dengan cara memetik dengan jari-jemari tangan. "+
                "Sasando merupakan alat musik tradisional dari kebudayaan Rote."+
                "Alat musik Sasando bentuknya sederhana bagian utamanya berbentuk tabung panjang dari bambu,"+
                "bagian tengah melingkar dari atas ke bawah diberi penyangga"))

        data?.add(DataModel(R.drawable.siter,"Siter","Jawa Tengah", "Siter merupakan"+
                " sebuah alat musik yang dimainkan dengan cara dipetik."+
                "Biasanya terdapat dalam gabungan alat music tradisional gamelan Jawa."+
                "Siter memiliki hubungan juga dengan kecapi di gamelan Sunda. "))

        data?.add(DataModel(R.drawable.kecapi,"Kecapi","Jawa Barat", "kecapi merupakan"+
                " suatu alat musik tradisional yang asalnya dari daerah Sunda, Jawa Barat."+
                " Jenis alat musik kordofon yang pertama adalah kecapi."+
                "Kecapi sendiri merupakan suatu alat musik yang cara memainkannya adalah dipetik."+
                "Alat musik kecapi ini berasal dari provinsi Jawa Barat."))


        data?.add(DataModel(R.drawable.rebab,"Rebab","Jawa Barat", "Rebab adalah salah satu alat musik melodi "+
                "yang banyak digunakan dalam kesenian Melayu, khususnya Sumatera, Jawa, dan Kalimantan. "+
                "Rebab tergolong instrument “kordofon” dimana sumber bunyinya berasal dari dawai atau senar"+
                " yang dimainkan dengan cara digesek." ))

        //Set data to Adapter
        recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("asal", item?.asal)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}