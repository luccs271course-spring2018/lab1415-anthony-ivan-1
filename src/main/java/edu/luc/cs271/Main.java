import java.util.*;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.graph.*;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.*;

public class Main {

  public static void main(String[] args) {

    CountryCodes county = new CountryCodes();
    String[] country = county.countries();

    final SimpleGraph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
    myMap.addVertex(country[0]);
    myMap.addVertex(country[1]);
    myMap.addVertex(country[2]);
    myMap.addVertex(country[3]);
    myMap.addVertex(country[4]);
    myMap.addVertex(country[5]);
    myMap.addVertex(country[6]);
    myMap.addVertex(country[7]);
    myMap.addVertex(country[8]);
    myMap.addVertex(country[9]);

    // Germany
    myMap.addEdge(country[0], country[1]);
    myMap.addEdge(country[2], country[1]);
    myMap.addEdge(country[3], country[1]);
    myMap.addEdge(country[4], country[1]);
    myMap.addEdge(country[5], country[1]);
    myMap.addEdge(country[6], country[1]);
    myMap.addEdge(country[7], country[1]);
    myMap.addEdge(country[8], country[1]);
    myMap.addEdge(country[9], country[1]);
    // Czechia
    myMap.addEdge(country[3], country[2]);
    myMap.addEdge(country[0], country[2]);
    // Austria
    myMap.addEdge(country[9], country[0]);
    // France
    myMap.addEdge(country[9], country[8]);
    myMap.addEdge(country[7], country[8]);
    myMap.addEdge(country[6], country[8]);
    // Belgium
    myMap.addEdge(country[5], country[6]);
    myMap.addEdge(country[7], country[6]);

    // Graph print
    System.out.println("Graph to String:");
    System.out.println(myMap.toString());

    System.out.println("\n**Germany Start Point**");
    // BreadthFirst
    System.out.println("\nBreadthFirst:");
    final Iterator<String> bf = new BreadthFirstIterator<>(myMap, country[1]);
    while (bf.hasNext()) {
      final String Country = bf.next();
      System.out.println(Country);
    }

    // ClosestFirst
    System.out.println("\nClosestFirst:");
    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, country[1]);
    while (cf.hasNext()) {
      final String Country = cf.next();
      System.out.println(Country);
    }

    // DepthFirst
    System.out.println("\nDepthFirst:");
    final Iterator<String> df = new DepthFirstIterator<>(myMap, country[1]);
    while (df.hasNext()) {
      final String Country = df.next();
      System.out.println(Country);
    }

    // RandomWalk
    System.out.println("\nRandomWalk:");
    final Iterator<String> rw = new RandomWalkIterator<>(myMap, country[1], false, 10);
    while (rw.hasNext()) {
      final String Country = rw.next();
      System.out.println(Country);
    }

    System.out.println("\n**Alternate Start Point**");
    // BreadthFirst
    System.out.println("\nBreadthFirst:");
    final Iterator<String> bf2 = new BreadthFirstIterator<>(myMap, country[8]);
    while (bf2.hasNext()) {
      final String Country = bf2.next();
      System.out.println(Country);
    }

    // ClosestFirst
    System.out.println("\nClosestFirst:");
    final Iterator<String> cf2 = new ClosestFirstIterator<>(myMap, country[8]);
    while (cf2.hasNext()) {
      final String Country = cf2.next();
      System.out.println(Country);
    }

    // DepthFirst
    System.out.println("\nDepthFirst:");
    final Iterator<String> df2 = new DepthFirstIterator<>(myMap, country[8]);
    while (df2.hasNext()) {
      final String Country = df2.next();
      System.out.println(Country);
    }

    // RandomWalk
    System.out.println("\nRandomWalk:");
    final Iterator<String> rw2 = new RandomWalkIterator<>(myMap, country[8], false, 10);
    while (rw2.hasNext()) {
      final String Country = rw2.next();
      System.out.println(Country);
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
