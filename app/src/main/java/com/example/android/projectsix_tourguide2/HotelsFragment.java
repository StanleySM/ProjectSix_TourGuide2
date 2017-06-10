package com.example.android.projectsix_tourguide2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    public HotelsFragment() {
    }

    public static HotelsFragment newInstance(){
        HotelsFragment fragment = new HotelsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.final_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();
        result.add(new Result(R.string.hotel_name_1, R.string.hotel_score_1, R.string.hotel_entry_1, R.string.hotel_text_1, R.drawable.hotel_image_1, R.drawable.ic_star_rate_black_18dp));
        result.add(new Result(R.string.hotel_name_2, R.string.hotel_score_2, R.string.hotel_entry_2, R.string.hotel_text_2, R.drawable.hotel_image_2, R.drawable.ic_star_rate_black_18dp));
        result.add(new Result(R.string.hotel_name_3, R.string.hotel_score_3, R.string.hotel_entry_3, R.string.hotel_text_3, R.drawable.hotel_image_3, R.drawable.ic_star_rate_black_18dp));
        result.add(new Result(R.string.hotel_name_4, R.string.hotel_score_4, R.string.hotel_entry_4, R.string.hotel_text_4, R.drawable.hotel_image_4, R.drawable.ic_star_rate_black_18dp));
        result.add(new Result(R.string.hotel_name_5, R.string.hotel_score_5, R.string.hotel_entry_5, R.string.hotel_text_5, R.drawable.hotel_image_5, R.drawable.ic_star_rate_black_18dp));


        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categories);

        ListView listView = (ListView) rootView.findViewById(R.id.final_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
