package com.schinkenbrot.Tables;

import com.schinkenbrot.Datasets.Dataset;
import com.schinkenbrot.Datasets.EpisodenDataset;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public class EpisodenTable extends Table
{
    public ArrayList<EpisodenDataset> datasets = new ArrayList<EpisodenDataset>();

    public void add(EpisodenDataset dataset)
    {
        this.datasets.add(dataset);
    }

    public void remove(EpisodenDataset dataset)
    {
        this.datasets.remove(dataset);
    }

    public void setDatasets(ArrayList<EpisodenDataset> datasets)
    {
        this.datasets = datasets;
    }

    public ArrayList<EpisodenDataset> getDatasets()
    {
        return datasets;
    }
}
