package interfaces;

import matrix.NodeM;

public interface IGraphM<T> {
	
	public void addNodeM(T key);
	public void addEdge(T key, T key2, int dis);
	public NodeM<T> searchNodeM(T key);
	public void deleteNodeM(T key);
	public void deleteEdge(T key, T key2);
	public boolean adjacentNodeM(T key, T key2);
	public int getDistance(T key, T key2);

}
