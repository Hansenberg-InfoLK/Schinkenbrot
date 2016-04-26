package Interfaces.Connectable.Table;

import Datasets.UserDataset;

import java.util.*;

/**
 * Created by David on 16.03.2016.
 */
public interface UserTableConnectable
{
	public HashMap<Integer, UserDataset> datasets = new HashMap<Integer, UserDataset>();

	public void add(UserDataset dataset);

	public void remove(UserDataset dataset);

	public void setDatasets(HashMap<Integer, UserDataset> datasets);

	public HashMap<Integer, UserDataset> getDatasets();
}
