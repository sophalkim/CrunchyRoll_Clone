package ssk.project.crunchy_roll_clone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ListViewFragment2 extends Fragment {

    String[] items = {"Anime", "Drama", "Search", "Settings", "Help", "Login"};
    Integer[] images = {
            R.drawable.dragon_symbol,
            R.drawable.dragon_symbol,
            R.drawable.ab_solid_example,
            R.drawable.dragon_symbol,
            R.drawable.ab_background_textured_example,
            R.drawable.dragon_symbol
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listview_layout_fragment, null);
        ListView lv = (ListView) v.findViewById(R.id.listview);
        CustomArrayAdapter2 adapter = new CustomArrayAdapter2(getActivity(), items, images);
        lv.setAdapter(adapter);
        return v;
    }
}
