package com.example.android.projectsix_tourguide2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyTripFragment extends Fragment {
    public FamilyTripFragment() {
    }

    public static FamilyTripFragment newInstance(){
        FamilyTripFragment fragment = new FamilyTripFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.final_list, container, false);

        final ArrayList<Result> result = new ArrayList<Result>();

        result.add(new Result(R.string.familyTrip_name_1, R.string.familyTrip_open_1, R.string.familyTrip_entry_1, R.string.familyTrip_text_1, R.drawable.image_family_trip_1, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.familyTrip_name_2, R.string.familyTrip_open_2, R.string.familyTrip_entry_2, R.string.familyTrip_text_2, R.drawable.image_family_trip_2, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.familyTrip_name_3, R.string.familyTrip_open_3, R.string.familyTrip_entry_3, R.string.familyTrip_text_3, R.drawable.image_family_trip_3, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.familyTrip_name_4, R.string.familyTrip_open_1, R.string.familyTrip_entry_4, R.string.familyTrip_text_4, R.drawable.image_family_trip_4, R.drawable.ic_access_time_black_24dp));
        result.add(new Result(R.string.familyTrip_name_5, R.string.familyTrip_open_5, R.string.familyTrip_entry_5, R.string.familyTrip_text_5, R.drawable.image_family_trip_5, R.drawable.ic_access_time_black_24dp));

        ResultAdapter adapter = new ResultAdapter(getActivity(), result, R.color.categories);
        ListView listView = (ListView) rootView.findViewById(R.id.final_list);
        listView.setAdapter(adapter);
        return rootView;
    }

}