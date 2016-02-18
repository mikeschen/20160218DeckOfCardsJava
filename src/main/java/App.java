import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import java.util.*;
import static spark.Spark.*;

public class App {
  public static void main(String [] args){

    String layout = "templates/layout.vtl";

get("/", (request, response) -> {
  HashMap<String,Object>model = new HashMap<String, Object>();
  model.put("template", "templates/index.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());

get("/success", (request, response) -> {
  HashMap<String, Object> model = new HashMap<String, Object>();
  Deck testDeck = new Deck();
  ArrayList<Card> fullDeck = testDeck.getCards();
  Card oneCard = fullDeck.get(0);
  Card twoCard = fullDeck.get(1);
  String playerOneCard = oneCard.name();
  String playerTwoCard = twoCard.name();
  model.put("playerOneCard", playerOneCard);
  model.put("playerTwoCard", playerTwoCard);
  model.put("template", "templates/success.vtl");
  return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());



  }
}
