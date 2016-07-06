package me.lirex.schinkenbrot;

import android.content.Context;
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

public class EListFragment extends ListFragment
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
        Bundle args = getArguments();
        String[] content = args.getStringArray("listEntries");
        int[] ids = args.getIntArray("ids");

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        ListView lv = (ListView) view.findViewById(android.R.id.list);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            lv.setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, content));
        }

        AdapterView.OnItemClickListener ls = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Log.d("Tag", String.valueOf(position));

                Context context = getContext();
                CharSequence text = String.valueOf(position);
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        };
        lv.setOnItemClickListener(ls);

        return view;

        /**
         * Inflate the layout for this fragment
         * return inflater.inflate(R.layout.fragment_list_list, container, false);
         */
    }
}
