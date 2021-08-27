import java.io.IOException;
import java.util.HashMap;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class IIReducer extends Reducer<Text, Text, Text, Text> {
//input is intermediate key value pair , which is the word, list of document names
	public void reduce(Text key, Iterable<Text> values, Context context)
			throws IOException, InterruptedException {
		StringBuilder stb = new StringBuilder();
		HashMap<String, Integer> fileFreq = new HashMap<String, Integer>();

		for (Text val : values) {
			Integer count = fileFreq.get(val.toString());
			if (count == null) {
				count = 0;
			}
			fileFreq.put(val.toString(), count + 1);
		}
		context.write(key, new Text(fileFreq.toString()));//within a document word frequency is updated
	}
}
