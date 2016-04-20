package Tables;

import Datasets.UserDataset;
import Interfaces.Connectable.Table.UserTableConnectable;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public class UserTable extends Table implements UserTableConnectable
{
    public ArrayList<UserDataset> datasets = new ArrayList<UserDataset>();

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

    public ArrayList<UserDataset> getDatasets()
    {
        return datasets;
    }
}
