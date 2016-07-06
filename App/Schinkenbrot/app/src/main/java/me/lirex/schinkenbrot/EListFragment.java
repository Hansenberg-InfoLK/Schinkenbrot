package me.lirex.schinkenbrot;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EListFragment extends ListFragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    ArrayList<Integer> ids;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        Bundle args = getArguments();
        String[] content = args.getStringArray("listEntries");
        ids = args.getIntegerArrayList("ids");

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        ListView lv = (ListView) view.findViewById(android.R.id.list);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            lv.setAdapter(new ArrayAdapter<String>(getContext(), R.layout.item_list, content));
        }

        return view;

        /**
         * Inflate the layout for this fragment
         * return inflater.inflate(R.layout.fragment_list_list, container, false);
         */
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(getContext(), EpisodeEditorActivity.class);
        intent.putExtra("id", ids.get(position));
        startActivity(intent);
    }
}
