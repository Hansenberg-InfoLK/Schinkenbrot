package Interfaces.Connectable.Table;

import Datasets.EpisodeDataset;

import java.util.*;

/**
 * Created by David on 16.03.2016.
 */
public interface EpisodenTableConnectable
{
	public HashMap<Integer, EpisodenDataset> datasets = new HashMap<Integer, EpisodenDataset>();

	public void add(EpisodenDataset dataset);

	public void remove(EpisodenDataset dataset);

	public void setDatasets(HashMap<Integer, EpisodenDataset> datasets);

	public HashMap<Integer, EpisodenDataset> getDatasets();
}
