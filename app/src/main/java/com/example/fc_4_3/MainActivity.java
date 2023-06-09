package com.example.fc_4_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();
        itemList.add(new Item("Роза", R.drawable.rose, "Собирательное название видов и сортов представителей рода Шипо́вник (лат. Rósa), выращиваемых человеком и растущих в дикой природе. Бо́льшая часть сортов роз получена в результате длительной селекции путём многократных повторных скрещиваний и отбора. Некоторые сорта являются формами дикорастущих видов."));
        itemList.add(new Item("Папоротник", R.drawable.fern, "Многолетние сосудистые растения, в жизненном цикле которых преобладает листостебельный спорофит. У папоротников развиты все вегетативные органы — стебель, листья и корень. Мощное корневище позволяет папоротникам размножаться его частями."));
        itemList.add(new Item("Орхидея", R.drawable.orchid, "Красивоцветущие растения из семейства орхи́дные, или ятры́шниковые. Орхидеи относятся к крупнейшему и очень древнему семейству однодольных растений, возникшему ещё в позднемеловой период существования жизни на Земле."));
        itemList.add(new Item("Берёза", R.drawable.beresa, "Высокорослое дерево, достигает в высоту от 30 до 45 м, при этом диаметр ствола колеблется от 40 до 70 см, но встречаются и более крупные экземпляры. Рост в высоту прекращается примерно в 60 лет. Продолжительность жизни составляет в среднем 100-120 лет, бывают отдельные экземпляры-долгожители (до 400 лет)."));
        itemList.add(new Item("Бамбук", R.drawable.bamb, "Род многолетних вечнозелёных растений семейства Злаки (Poaceae), из подсемейства Бамбуковые (Bambuseae). Род включает в себя около 140 видов, растущих, в основном, в тропических и субтропических регионах Азии, особенно распространены во влажных тропиках."));
        itemList.add(new Item("Василёк", R.drawable.vas, "Однолетнее или двулетнее растение с прямым стеблем высотой до 50—80 см. Бывают белые, голубые, жёлтые, розовые, фиолетовые, синие, красные и бордовые. Цветёт василёк с июня и до поздней осени."));
        itemList.add(new Item("Вишня", R.drawable.vish, "Дерево или кустарник, достигает до 10 м в высоту. Листья черешковые, широкоэллиптические, заострённые, тёмно-зелёные сверху, снизу светлее, достигают в длину 8 см. Цветки белого цвета, собраны в зонтиках по 2—3 цветка. Чашелистиков и лепестков по пять, тычинок 15—20, пестик один."));
        itemList.add(new Item("Виноград", R.drawable.grap, "Род лазящих растений, лиан семейства виноградовых. Эти вьющиеся растения могут достигать длины 30–40 м. Листья винограда простые зубчатые, 3–5-лопастные, цветки мелкие, зеленоватые, душистые. Плоды винограда – сочные ягоды, собранные в гроздья."));
        itemList.add(new Item("Герань", R.drawable.ger, "Род семейства Гераниевые. Всего известно более 400 видов трав и полукустарников, рассеянных по всему миру (в тропическом поясе — только в горах). Цветки имеют пять лепестков и окрашены в белый, розовый, фиолетовый или синий цвет, часто с характерными прожилками."));


        itemAdapter = new ItemAdapter(this, itemList);
        recyclerView.setAdapter(itemAdapter);
    }
}
