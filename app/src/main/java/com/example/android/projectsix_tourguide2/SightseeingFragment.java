package com.example.android.projectsix_tourguide2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightseeingFragment extends Fragment {
    public SightseeingFragment() {
    }

    public static SightseeingFragment newInstance(){
        SightseeingFragment fragment = new SightseeingFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.final_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.sightseeing_name_1, R.string.sightseeing_open_1, R.string.sightseeing_entry_1, R.string.sightseeing_text_1, R.drawable.sightseeing_image_1, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.sightseeing_name_2, R.string.sightseeing_open_2, R.string.sightseeing_entry_2, R.string.sightseeing_text_2, R.drawable.sightseeing_image_2, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.sightseeing_name_3, R.string.sightseeing_open_3, R.string.sightseeing_entry_3, R.string.sightseeing_text_3, R.drawable.sightseeing_image_3, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.sightseeing_name_4, R.string.sightseeing_open_4, R.string.sightseeing_entry_4, R.string.sightseeing_text_4, R.drawable.sightseeing_image_4, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.sightseeing_name_5, R.string.sightseeing_open_5, R.string.sightseeing_entry_5, R.string.sightseeing_text_5, R.drawable.sightseeing_image_5, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.sightseeing_name_6, R.string.sightseeing_open_6, R.string.sightseeing_entry_6, R.string.sightseeing_text_6, R.drawable.sightseeing_image_6, R.drawable.ic_access_time_black_24dp));


        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categories);

        ListView listView = (ListView) rootView.findViewById(R.id.final_list);

        listView.setAdapter(adapter);

        return rootView;

    }
}