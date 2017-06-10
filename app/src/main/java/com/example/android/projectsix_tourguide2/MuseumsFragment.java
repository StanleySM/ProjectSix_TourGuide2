package com.example.android.projectsix_tourguide2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {
    public MuseumsFragment() {
    }

    public static MuseumsFragment newInstance(){
        MuseumsFragment fragment = new MuseumsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.final_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.museum_name_1, R.string.museum_open_1, R.string.museum_entry_1, R.string.museum_text_1, R.drawable.museum_image_1, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.museum_name_2, R.string.museum_open_2, R.string.museum_entry_2, R.string.museum_text_2, R.drawable.museum_image_2, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.museum_name_3, R.string.museum_open_3, R.string.museum_entry_3, R.string.museum_text_3, R.drawable.museum_image_3, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.museum_name_4, R.string.museum_open_4, R.string.museum_entry_4, R.string.museum_text_4, R.drawable.museum_image_4, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.museum_name_5, R.string.museum_open_5, R.string.museum_entry_5, R.string.museum_text_5, R.drawable.museum_image_5, R.drawable.ic_access_time_black_24dp));


        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categories);

        ListView listView = (ListView) rootView.findViewById(R.id.final_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}