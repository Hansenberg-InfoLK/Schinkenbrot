package Tables;

import Datasets.EpisodeDataset;
import Interfaces.Connectable.Table.EpisodenTableConnectable;

import java.util.ArrayList;

/**
 * Created by David on 16.03.2016.
 */
public class EpisodeTable extends Table implements EpisodenTableConnectable
{
	public ArrayList<EpisodeDataset> datasets = new ArrayList<EpisodeDataset>();

	public void add(EpisodeDataset dataset)
	{
		this.datasets.add(dataset);
	}

	public void remove(EpisodeDataset dataset)
	{
		this.datasets.remove(dataset);
	}

	public void setDatasets(ArrayList<EpisodeDataset> datasets)
	{
		this.datasets = datasets;
	}

	public ArrayList<EpisodeDataset> getDatasets()
	{
		return datasets;
	}
}
