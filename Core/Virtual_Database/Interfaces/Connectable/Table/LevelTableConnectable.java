package Interfaces.Connectable.Table;

import Datasets.LevelDataset;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public interface LevelTableConnectable
{
	public ArrayList<LevelDataset> datasets = new ArrayList<LevelDataset>();

	public void add(LevelDataset dataset);

	public void remove(LevelDataset dataset);

	public void setDatasets(ArrayList<LevelDataset> datasets);

	public ArrayList<LevelDataset> getDatasets();
}
