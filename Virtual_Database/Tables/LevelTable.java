package com.schinkenbrot.Tables;

import com.schinkenbrot.Datasets.EpisodenDataset;
import com.schinkenbrot.Datasets.LevelDataset;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public class LevelTable extends Table
{
    public ArrayList<LevelDataset> datasets = new ArrayList<LevelDataset>();

    public void add(LevelDataset dataset)
    {
        this.datasets.add(dataset);
    }

    public void remove(LevelDataset dataset)
    {
        this.datasets.remove(dataset);
    }

    public void setDatasets(ArrayList<LevelDataset> datasets)
    {
        this.datasets = datasets;
    }

    public ArrayList<LevelDataset> getDatasets()
    {
        return datasets;
    }
}
