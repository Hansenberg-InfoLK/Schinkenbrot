package Interfaces.Connectable.Table;

import Datasets.LevelDataset;

import java.util.*;

/**
 * Created by David on 16.03.2016.
 */
public interface LevelTableConnectable
{
	public HashMap<Integer, LevelDataset> datasets = new HashMap<Integer, LevelDataset>();

	public void add(LevelDataset dataset);

	public void remove(LevelDataset dataset);

	public void setDatasets( HashMap<Integer, LevelDataset> datasets);

	public  HashMap<Integer, LevelDataset> getDatasets();
}
