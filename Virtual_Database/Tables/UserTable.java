package com.schinkenbrot.Tables;

import com.schinkenbrot.Datasets.LevelDataset;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public class UserTable extends Table
{
    public ArrayList<UserTable> datasets = new ArrayList<UserTable>();

    public void add(UserTable dataset)
    {
        this.datasets.add(dataset);
    }

    public void remove(UserTable dataset)
    {
        this.datasets.remove(dataset);
    }

    public void setDatasets(ArrayList<UserTable> datasets)
    {
        this.datasets = datasets;
    }

    public ArrayList<UserTable> getDatasets()
    {
        return datasets;
    }
}
