import java.util.*;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.graph.*;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.*;

public class Main {

<<<<<<< HEAD
  
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
=======
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
>>>>>>> origin

    // Graph print
    System.out.println("Graph to String:");
    System.out.println(myMap.toString());

    System.out.println("\n**Germany Start Point**");
    // BreadthFirst
    System.out.println("\nBreadthFirst:");
<<<<<<< HEAD
    final Iterator<String> bf = new BreadthFirstIterator<>(myMap, country[1]);
    while (bf.hasNext()) {
      final String Country = bf.next();
      System.out.println(Country);
=======
    final Iterator<String> bf = new BreadthFirstIterator<>(myMap, DE);
    while (bf.hasNext()) {
      final String country = bf.next();
      System.out.println(country);
>>>>>>> origin
    }

    // ClosestFirst
    System.out.println("\nClosestFirst:");
<<<<<<< HEAD
    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, country[1]);
    while (cf.hasNext()) {
      final String Country = cf.next();
      System.out.println(Country);
=======
    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, DE);
    while (cf.hasNext()) {
      final String country = cf.next();
      System.out.println(country);
>>>>>>> origin
    }

    // DepthFirst
    System.out.println("\nDepthFirst:");
<<<<<<< HEAD
    final Iterator<String> df = new DepthFirstIterator<>(myMap, country[1]);
    while (df.hasNext()) {
      final String Country = df.next();
      System.out.println(Country);
=======
    final Iterator<String> df = new DepthFirstIterator<>(myMap, DE);
    while (df.hasNext()) {
      final String country = df.next();
      System.out.println(country);
>>>>>>> origin
    }

    // RandomWalk
    System.out.println("\nRandomWalk:");
<<<<<<< HEAD
    final Iterator<String> rw = new RandomWalkIterator<>(myMap, country[1], false, 10);
    while (rw.hasNext()) {
      final String Country = rw.next();
      System.out.println(Country);
=======
    final Iterator<String> rw = new RandomWalkIterator<>(myMap, DE, false, 10);
    while (rw.hasNext()) {
      final String country = rw.next();
      System.out.println(country);
>>>>>>> origin
    }

    System.out.println("\n**Alternate Start Point**");
    // BreadthFirst
    System.out.println("\nBreadthFirst:");
<<<<<<< HEAD
    final Iterator<String> bf2 = new BreadthFirstIterator<>(myMap, country[8]);
    while (bf2.hasNext()) {
      final String Country = bf2.next();
      System.out.println(Country);
=======
    final Iterator<String> bf2 = new BreadthFirstIterator<>(myMap, FR);
    while (bf2.hasNext()) {
      final String country = bf2.next();
      System.out.println(country);
>>>>>>> origin
    }

    // ClosestFirst
    System.out.println("\nClosestFirst:");
<<<<<<< HEAD
    final Iterator<String> cf2 = new ClosestFirstIterator<>(myMap, country[8]);
    while (cf2.hasNext()) {
      final String Country = cf2.next();
      System.out.println(Country);
=======
    final Iterator<String> cf2 = new ClosestFirstIterator<>(myMap, FR);
    while (cf2.hasNext()) {
      final String country = cf2.next();
      System.out.println(country);
>>>>>>> origin
    }

    // DepthFirst
    System.out.println("\nDepthFirst:");
<<<<<<< HEAD
    final Iterator<String> df2 = new DepthFirstIterator<>(myMap, country[8]);
    while (df2.hasNext()) {
      final String Country = df2.next();
      System.out.println(Country);
=======
    final Iterator<String> df2 = new DepthFirstIterator<>(myMap, FR);
    while (df2.hasNext()) {
      final String country = df2.next();
      System.out.println(country);
>>>>>>> origin
    }

    // RandomWalk
    System.out.println("\nRandomWalk:");
<<<<<<< HEAD
    final Iterator<String> rw2 = new RandomWalkIterator<>(myMap, country[8], false, 10);
    while (rw2.hasNext()) {
      final String Country = rw2.next();
      System.out.println(Country);
=======
    final Iterator<String> rw2 = new RandomWalkIterator<>(myMap, FR, false, 10);
    while (rw2.hasNext()) {
      final String country = rw2.next();
      System.out.println(country);
>>>>>>> origin
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
