package com.example.jadirider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Plat2motor extends AppCompatActivity {
    RecyclerView recyclepl;
    List<platn>lispl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plat2motor);
        inidummypl();
        recyclepl = findViewById(R.id.recypl);
        Adapterpln adapterln = new Adapterpln(this,lispl);
        recyclepl.setAdapter(adapterln);
        recyclepl.setLayoutManager(new LinearLayoutManager(this));
    }

    private void inidummypl() {
        lispl = new ArrayList<>();
        lispl.add(new platn("1. A","Plat A untuk kendaraan dari Banten."));
        lispl.add(new platn("2. B","Plat B untuk kendaraan dari DKI Jakarta, Bekasi dan Depok."));
        lispl.add(new platn("3. AA","Plat AA untuk kendaraan dari Kedu, Purworejo, Temanggung, Magelang, Wonosobo, dan Kebumen."));
        lispl.add(new platn("4. AD","Plat AD untuk kendaraan dari Boyolali, Klaten, Wonogiri, Sukoharjo, Surakarta, Karanganyar, dan Sragen."));
        lispl.add(new platn("5. K","Plat K untuk kendaraan dari daerah Cepu, Pati, Kudus, Jepara, Grobogan, Rembang, dan Blora."));
        lispl.add(new platn("6. R","Plat R untuk kendaraan dari Banjarnegara, Banyumas, Cilacap, dan Purbalingga."));
        lispl.add(new platn("7. G","Plat G untuk kendaraan dari Brebes, Pemalang, Batang, Tegal, dan Pekalongan."));
        lispl.add(new platn("8. H","Plat H untuk kendaraan dari Salatiga, Semarang, Kendal, dan Demak."));
        lispl.add(new platn("9. AB","Plat AB untuk kendaraan dari Daerah Istimewa Yogyakarta ."));
        lispl.add(new platn("10. D","Plat D untuk kendaraan dari Bandung, Bandung Barat, dan Cimahi."));
        lispl.add(new platn("11. F","Plat F untuk kendaraan dari Bogor, Sukabumi, dan Cianjur."));
        lispl.add(new platn("12. E","Plat E untuk kendaraan dari Kuningan, Cirebon, Majalengka, dan Indramayu."));
        lispl.add(new platn("13. Z","Plat Z untuk kendaraan dari Banjar, Garut, Ciamis, Tasikmalaya, dan Sumedang."));
        lispl.add(new platn("14. T","Plat T untuk kendaraan dari Subang, Purwakarta, dan Karawang."));
        lispl.add(new platn("15. BA","Plat BA untuk kendaraan dari Provinsi Sumatra Barat."));
        lispl.add(new platn("16. BB","Plat BB untuk kendaraan dari Provinsi Sumatra Utara bagian barat."));
        lispl.add(new platn("17. BD","Plat BD untuk kendaraan dari Bengkulu ."));
        lispl.add(new platn("18. BE","Plat BE untuk kendaraan dari Lampung."));
        lispl.add(new platn("19. BG","Plat BG untuk kendaraan dari Sumatra Selatan."));
        lispl.add(new platn("20. BH","Plat BH untuk kendaraan dari Jambi."));
        lispl.add(new platn("21. BK","Plat BK untuk kendaraan dari Sumatra Utara bagian timur."));
        lispl.add(new platn("22. BL","Plat BL untuk kendaraan dari Aceh."));
        lispl.add(new platn("23. BM","Plat BM untuk kendaraan dari Riau."));
        lispl.add(new platn("24. BN","Plat BN untuk kendaraan dari Bangka Belitung."));
        lispl.add(new platn("25. BP","Plat BP untuk kendaraan dari Kepulauan Riau."));
        lispl.add(new platn("26. DK","Plat DK untuk kendaraan dari Bali."));

    }
}