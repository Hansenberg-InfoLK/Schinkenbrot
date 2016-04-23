package Interfaces.Connectable.Table;

import Datasets.UserDataset;

import java.util.*;

/**
 * Created by David on 16.03.2016.
 */
public interface UserTableConnectable
{
	public HashMap<UserDataset> datasets = new HashMap<UserDataset>();

	public void add(UserDataset dataset);

	public void remove(UserDataset dataset);

	public void setDatasets(HashMap<UserDataset> datasets);

	public HashMap<UserDataset> getDatasets();
}
