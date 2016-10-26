package A_Home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//import Connection.FileSystemConnectionOnGraph;

public class build_maps {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(
					new FileReader(
							"D:\\paper\\ACM-JEA-Journal Draff\\references\\webspam-uk2006-2.0\\original_2006_edges.txt"));
			// String edge_file_content = "";
			while ((sCurrentLine = br.readLine()) != null) {
				if (sCurrentLine.contains(":")) {
					String src = sCurrentLine.split(" -> ")[0];
					String[] deslist = sCurrentLine.split(" -> ")[1].split(" ");
					for (int i = 0; i < deslist.length; i++) {
						System.out.println(src + "\t"
								+ deslist[i].split(":")[0]);
						// edge_file_content += src + "\t"
						// + deslist[i].split(":")[0] + "\n";
					}
				}
			}
			// FileSystemConnectionOnGraph.writeToFile("D:\\paper\\ACM-JEA-Journal Draff\\references\\webspam-uk2006-2.0\\2006_edges.txt",
			// edge_file_content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
