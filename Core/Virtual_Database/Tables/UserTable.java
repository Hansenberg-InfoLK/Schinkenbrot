package Tables;

import Datasets.UserDataset;
import Interfaces.Connectable.Table.UserTableConnectable;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public class UserTable extends Table implements UserTableConnectable
{
    public HashMap<Integer, UserDataset> datasets = new HashMap<Integer, UserDataset>();

    public void add(UserDataset dataset)
    {
        this.datasets.add(dataset);
    }

    public void remove(UserDataset dataset)
    {
        this.datasets.remove(dataset);
    }

    public void setDatasets(ArrayList<UserDataset> datasets)
    {
        this.datasets = datasets;
    }

    public HashMap<Integer, UserDataset> getDatasets()
    {
        return datasets;
    }
}
