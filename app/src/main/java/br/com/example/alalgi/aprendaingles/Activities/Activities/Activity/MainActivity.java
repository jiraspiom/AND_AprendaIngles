package br.com.example.alalgi.aprendaingles.Activities.Activities.Activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import br.com.example.alalgi.aprendaingles.Activities.Activities.Fragments.BichosFragment;
import br.com.example.alalgi.aprendaingles.Activities.Activities.Fragments.NumerosFragment;
import br.com.example.alalgi.aprendaingles.Activities.Activities.Fragments.VogaisFragment;
import br.com.example.alalgi.aprendaingles.R;

public class MainActivity extends AppCompatActivity {

    //private ViewPager viewPager;
    //private SmartTabLayout viewPagerTab;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Aprenda inglês");

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add(R.string.Bicho, BichosFragment.class)
                .add(R.string.Numero, NumerosFragment.class)
                .add(R.string.Vogais, VogaisFragment.class)
                .create());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.viewPagerTab);
        viewPagerTab.setViewPager(viewPager);


    }
}
