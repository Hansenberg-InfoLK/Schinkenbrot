package Interfaces.Connectable.Table;

import Datasets.EpisodeDataset;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public interface EpisodenTableConnectable
{
	public ArrayList<EpisodeDataset> datasets = new ArrayList<EpisodeDataset>();

	public void add(EpisodeDataset dataset);

	public void remove(EpisodeDataset dataset);

	public void setDatasets(ArrayList<EpisodeDataset> datasets);

	public ArrayList<EpisodeDataset> getDatasets();
}
