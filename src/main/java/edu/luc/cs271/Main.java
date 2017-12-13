import java.util.*;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.alg.interfaces.*;
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

    System.out.println("\n**Germany Start Point**");
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

    System.out.println("\n**Alternate Start Point**");
    // BreadthFirst
    System.out.println("\nBreadthFirst:");
    final Iterator<String> bf2 = new BreadthFirstIterator<>(myMap, FR);
    while (bf2.hasNext()) {
      final String country = bf2.next();
      System.out.println(country);
    }

    // ClosestFirst
    System.out.println("\nClosestFirst:");
    final Iterator<String> cf2 = new ClosestFirstIterator<>(myMap, FR);
    while (cf2.hasNext()) {
      final String country = cf2.next();
      System.out.println(country);
    }

    // DepthFirst
    System.out.println("\nDepthFirst:");
    final Iterator<String> df2 = new DepthFirstIterator<>(myMap, FR);
    while (df2.hasNext()) {
      final String country = df2.next();
      System.out.println(country);
    }

    // RandomWalk
    System.out.println("\nRandomWalk:");
    final Iterator<String> rw2 = new RandomWalkIterator<>(myMap, FR, false, 10);
    while (rw2.hasNext()) {
      final String country = rw2.next();
      System.out.println(country);
    }

    // GreedyColoring

    System.out.println("\nGreedyColoring: ");
    GreedyColoring<String, DefaultEdge> gc = new GreedyColoring<String, DefaultEdge>(myMap);
    final Iterator<Map.Entry<String, Integer>> gcIterator =
        gc.getColoring().getColors().entrySet().iterator();
    while (gcIterator.hasNext()) {
      final Map.Entry<String, Integer> color = gcIterator.next();
      System.out.println(color.getKey() + " = " + color.getValue());
    }
  }
}
