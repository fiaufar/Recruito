package id.ac.binus.recruito.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import id.ac.binus.recruito.R;

public class GenderAdapter extends ArrayAdapter<String> {
    @NonNull
    @Override
    public View getView(int Position, @Nullable View ConvertView, @NonNull ViewGroup Parent) {
        return initView(Position, ConvertView, Parent);
    }

    @Override
    public View getDropDownView(int Position, @Nullable View ConvertView, @NonNull ViewGroup Parent) {
        return initView(Position, ConvertView, Parent);
    }

    public GenderAdapter(@NonNull Context context, ArrayList<String> Gender) {
        super(context, 0, Gender);
    }

    private View initView(int Position, View ConvertView, ViewGroup Parent){
        if(ConvertView == null){
            ConvertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_spinner_row, Parent, false
            );
        }

        TextView CategoryName = ConvertView.findViewById(R.id.text_view_category);

        String CurrentItem = getItem(Position);

        if(CurrentItem != null) {
            CategoryName.setText(CurrentItem);
        }

        return ConvertView;

    }

}
