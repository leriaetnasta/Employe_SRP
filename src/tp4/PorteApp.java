package tp4;
public class PorteApp {

	public static void countfrequencies(String[] words) {
		for(int i = 0; i<words.length(); i++)
		{
			for (int j = i+1; j<words.length(); j++)
			{
				if(words[i].compareTo(words[j])>0)
				{
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
	}
}
