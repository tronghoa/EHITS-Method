package A_Home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Connection.FileSystemConnectionOnGraph;

public class graph_export {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			String sCurrentLine;
			String[][] edges = new String[730774][2];
			br = new BufferedReader(
					new FileReader(
							"D:\\paper\\ACM-JEA-Journal Draff\\references\\experiment-master\\2006_edges.txt"));
			int count = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				edges[count][0] = sCurrentLine.split("\t")[0];
				edges[count][1] = sCurrentLine.split("\t")[1];
				count++;
			}
			System.out.println("->");
			String root = "4050";
			List<String> NodesList = new ArrayList<String>();
			List<Edge> EdgesList = new ArrayList<Edge>();
			for (int i = 0; i < edges.length; i++) {
				try {
					if (edges[i][0].equals(root) && !edges[i][1].equals(root)) {
						NodesList.add(edges[i][1]);
					}
				} catch (Exception ex) {
					continue;
				}
			}
			System.out.println("->");
			for (int i = 0; i < NodesList.size(); i++) {
				for (int j = 0; j < edges.length; j++) {
					try {
						if (edges[j][0].equals(NodesList.get(i))) {
							if (NodesList.contains(edges[j][1])
									&& !edges[i][1].equals(root)) {
								Edge e = new Edge();
								e.src = edges[j][0];
								e.des = edges[j][1];
								EdgesList.add(e);
							}
						}
					} catch (Exception ex) {
						continue;
					}
				}
			}
			System.out.println("->");
			String nodefile_content = getNodeFileContent(NodesList);
			String edgefile_content = "";
			for (int i = 0; i < EdgesList.size(); i++) {
				edgefile_content += EdgesList.get(i).src + "\t"
						+ EdgesList.get(i).des + "\n";
			}
			System.out.println("->");
			FileSystemConnectionOnGraph.writeToFile("D:\\paper\\ACM-JEA-Journal Draff\\references\\webspam-uk2006-2.0\\2006_web_nodes_"
					+ root + ".txt", nodefile_content);
			System.out.println("->");
			FileSystemConnectionOnGraph.writeToFile("D:\\paper\\ACM-JEA-Journal Draff\\references\\webspam-uk2006-2.0\\2006_web_edges_"
					+ root + ".txt", edgefile_content);
			System.out.println("->");
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

	public static String getNodeFileContent(List<String> NodesList) {
		BufferedReader br = null;
		try {
			String sCurrentLine;
			String[][] nodes = new String[11402][2];
			br = new BufferedReader(
					new FileReader(
							"D:\\paper\\ACM-JEA-Journal Draff\\references\\experiment-master\\2006_nodes.txt"));
			int count = 0;
			System.out.println("---->");
			while ((sCurrentLine = br.readLine()) != null) {
				nodes[count][0] = sCurrentLine.split("\t")[0];
				nodes[count][1] = sCurrentLine.split("\t")[1];
				count++;
			}
			System.out.println(count + "---" + nodes.length + "---->");
			String nodefile_content = "";
			for (int i = 0; i < nodes.length; i++) {
				for (int j = 0; j < NodesList.size(); j++) {
					try {
						if (nodes[i][0].equals(NodesList.get(j))) {
							nodefile_content += nodes[i][0] + "\t"
									+ nodes[i][1] + "\n";
						}
					} catch (Exception ex) {
						continue;
					}
				}
			}
			System.out.println("---->");
			return nodefile_content;
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
		return null;
	}
}

class Edge {
	public String des;
	public String src;
}