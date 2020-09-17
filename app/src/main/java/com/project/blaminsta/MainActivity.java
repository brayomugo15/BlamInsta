package com.project.blaminsta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    int [] POST_IMAGE = {R.drawable.wallpaper_1, R.drawable.wallpaper_2, R.drawable.wallpaper_3, R.drawable.wallpaper_4};
    int [] POST_ICON = {R.drawable.celeb_larry, R.drawable.celeb_njugush, R.drawable.celeb_rubadiri, R.drawable.celeb_sarah};
    String [] POST_NAME = {"Larry Madowo", "Njugush", "Victoria Rubadiri", "Sarah Hassan"};
    String [] POST_DESCRIPTION = {"What a lovely day", "Huku ni kunoma", "Wow, such beauty", "This is new guys!!!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return POST_IMAGE.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.image_layout, null);

            TextView post_name = view1.findViewById(R.id.post_name);
            TextView post_description = view1.findViewById(R.id.post_description);
            ImageView post_image = view1.findViewById(R.id.post_image);
            de.hdodenhof.circleimageview.CircleImageView post_icon = view1.findViewById(R.id.post_icon);

            post_name.setText(POST_NAME[i]);
            post_description.setText(POST_DESCRIPTION[i]);
            post_icon.setImageResource(POST_ICON[i]);
            post_image.setImageResource(POST_IMAGE[i]);

            return view1;
        }
    }
}
