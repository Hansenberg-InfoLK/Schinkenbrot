package Tables;

import Datasets.LevelDataset;
import Interfaces.Connectable.Table.LevelTableConnectable;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public class LevelTable extends Table implements LevelTableConnectable
{
    public HashMap<Integer, LevelDataset> datasets = new HashMap<Integer, LevelDataset>();

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

    public HashMap<Integer, LevelDataset> getDatasets()
    {
        return datasets;
    }
}
