package com.example.android.projectsix_tourguide2;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by StanleyPC on 15. 5. 2017.
 */

public class ResultAdapter extends ArrayAdapter<Result> {

    private int mItemColor;

    public ResultAdapter(Context context, ArrayList<Result> result, int itemColor) {
        super(context, 0, result);
        mItemColor = itemColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.main_item, parent, false);
        }

        Result currentResult = getItem(position);

        TextView mainHeader = (TextView) listItemView.findViewById(R.id.header);
        mainHeader.setText(currentResult.getMainHeader());

        TextView firstLineText = (TextView) listItemView.findViewById(R.id.first_line_text);
        firstLineText.setText(currentResult.getFirstLineText());

        TextView secondLineText = (TextView) listItemView.findViewById(R.id.second_line_text);
        secondLineText.setText(currentResult.getSecondLineText());

        TextView mainInformationText = (TextView) listItemView.findViewById(R.id.main_information_text);
        mainInformationText.setText(currentResult.getMainInformationText());

        ImageView mainImageView = (ImageView) listItemView.findViewById(R.id.main_image);
        mainImageView.setImageResource(currentResult.getMainImageView());

        ImageView firstSymbol = (ImageView) listItemView.findViewById(R.id.firstSymbol);
        firstSymbol.setImageResource(currentResult.getFirstSymbol());


        View textContainer = listItemView.findViewById(R.id.information_box);
        int color = ContextCompat.getColor(getContext(), mItemColor);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}