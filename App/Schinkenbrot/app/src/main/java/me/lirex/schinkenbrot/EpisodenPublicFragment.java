package me.lirex.schinkenbrot;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EpisodenPublicFragment extends Fragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        String[] content = {"Hallo", "Maria"};

        View view = inflater.inflate(R.layout.fragment_episoden_public, container, false);
        ListView lv = (ListView) view.findViewById(R.id.eppulist);
        lv.setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, content));
        return view;

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_episoden_public, container, false);
    }
}
