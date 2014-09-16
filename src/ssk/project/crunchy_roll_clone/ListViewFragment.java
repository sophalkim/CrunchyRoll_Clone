package ssk.project.crunchy_roll_clone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewFragment extends Fragment {

	String[] items = {"Anime", "Drama", "Search", "Settings", "Help", "Login"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.listview_layout_fragment, container);
		ListView lv = (ListView) v.findViewById(R.id.listview);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
		lv.setAdapter(adapter);
		return v;
	}
}
