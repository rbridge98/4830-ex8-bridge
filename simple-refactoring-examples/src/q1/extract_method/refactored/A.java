package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
	  containsLoop(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
	  containsLoop(edgeList, p);
      // other implementation
      return null;
   }

   // TODO: Your answer
   <Ne extends NodeEdge> void containsLoop(List<Ne> listIn, String p) {
	   for (Ne current : listIn) {
			if (current.contains(p))
				System.out.println(current);
		}
   }
}

class NodeEdge {
	String name;
	boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends NodeEdge {
	// empty
}

class Edge extends NodeEdge{
	// empty
}