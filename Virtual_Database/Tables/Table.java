package com.schinkenbrot.Tables;

import com.schinkenbrot.Datasets.Dataset;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public class Table
{
    public ArrayList<Dataset> datasets = new ArrayList<Dataset>();

    public void add(Dataset dataset)
    {
        this.datasets.add(dataset);
    }

    public void remove(Dataset dataset) {
        this.datasets.remove(dataset);
    }

}
