import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

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

    final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
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
  }
}
