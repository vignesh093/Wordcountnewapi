import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class Wordmappernewapi extends Mapper<LongWritable,Text,Text,IntWritable> 
{
	public void map(LongWritable key,Text value,Context context) throws IOException,InterruptedException
	{
		String holder = value.toString();
		for(String sing:holder.split(" "))
		{
			if(sing.length() > 0)
			{
				context.write(new Text(sing), new IntWritable(1));
			}
		}
		
	}

}
