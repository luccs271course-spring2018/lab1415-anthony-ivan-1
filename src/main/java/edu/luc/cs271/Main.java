import java.util.*;
import org.jgrapht.graph.*;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.*;

public class Main {

  static final String AT = "Austria";
  static final String DE = "Germany";
  static final String CZ = "Czechia";
  static final String PL = "Poland";
  static final String DK = "Denmark";
  static final String NL = "Netherlands";
  static final String BL = "Belgium";
  static final String LU = "Luxembourg";
  static final String FR = "France";
  static final String CH = "Switzerland";

  public static void main(String[] args) {

    final SimpleGraph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
    myMap.addVertex(AT);
    myMap.addVertex(DE);
    myMap.addVertex(CZ);
    myMap.addVertex(PL);
    myMap.addVertex(DK);
    myMap.addVertex(NL);
    myMap.addVertex(BL);
    myMap.addVertex(LU);
    myMap.addVertex(FR);
    myMap.addVertex(CH);

    // Germany
    myMap.addEdge(AT, DE);
    myMap.addEdge(CZ, DE);
    myMap.addEdge(PL, DE);
    myMap.addEdge(DK, DE);
    myMap.addEdge(NL, DE);
    myMap.addEdge(BL, DE);
    myMap.addEdge(LU, DE);
    myMap.addEdge(FR, DE);
    myMap.addEdge(CH, DE);
    // Czechia
    myMap.addEdge(PL, CZ);
    myMap.addEdge(AT, CZ);
    // Austria
    myMap.addEdge(CH, AT);
    // France
    myMap.addEdge(CH, FR);
    myMap.addEdge(LU, FR);
    myMap.addEdge(BL, FR);
    // Belgium
    myMap.addEdge(NL, BL);
    myMap.addEdge(LU, BL);

    // Graph print
    System.out.println("Graph to String:");
    System.out.println(myMap.toString());

    // BreadthFirst
    System.out.println("\nBreadthFirst:");
    final Iterator<String> bf = new BreadthFirstIterator<>(myMap, DE);
    while (bf.hasNext()) {
      final String country = bf.next();
      System.out.println(country);
    }

    // ClosestFirst
    System.out.println("\nClosestFirst:");
    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, DE);
    while (cf.hasNext()) {
      final String country = cf.next();
      System.out.println(country);
    }

    // DepthFirst
    System.out.println("\nDepthFirst:");
    final Iterator<String> df = new DepthFirstIterator<>(myMap, DE);
    while (df.hasNext()) {
      final String country = df.next();
      System.out.println(country);
    }

    // RandomWalk
    System.out.println("\nRandomWalk:");
    final Iterator<String> rw = new RandomWalkIterator<>(myMap, DE, false, 10);
    while (rw.hasNext()) {
      final String country = rw.next();
      System.out.println(country);
    }
  }
}
