package Interfaces.Connectable.Table;

import Datasets.UserDataset;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public interface UserTableConnectable
{
	public ArrayList<UserDataset> datasets = new ArrayList<UserDataset>();

	public void add(UserDataset dataset);

	public void remove(UserDataset dataset);

	public void setDatasets(ArrayList<UserDataset> datasets);

	public ArrayList<UserDataset> getDatasets();
}
