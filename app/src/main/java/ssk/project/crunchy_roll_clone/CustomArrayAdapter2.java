package ssk.project.crunchy_roll_clone;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomArrayAdapter2 extends ArrayAdapter {

    private final Activity context;
    private final String[] wordList;
    private final Integer[] images;

    public CustomArrayAdapter2(Activity context, String[] wordList, Integer[] images) {
        super(context, R.layout.list_single, wordList);
        this.context = context;
        this.wordList = wordList;
        this.images = images;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_single, null, true);
        TextView textTitle = (TextView) rowView.findViewById(R.id.text);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
        textTitle.setText(wordList[position]);
        imageView.setImageResource(images[position]);
        return rowView;
    }

}
