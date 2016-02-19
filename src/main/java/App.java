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
  Card oneCard = testDeck.getCards().get(0);
  Card twoCard = testDeck.getCards().get(1);
  int oneCardValue = Arrays.asList(Deck.VALUES).indexOf(oneCard.getValue());
  int twoCardValue = Arrays.asList(Deck.VALUES).indexOf(twoCard.getValue());
  int oneCardSuit = Arrays.asList(Deck.SUITS).indexOf(oneCard.getSuit());
  int twoCardSuit = Arrays.asList(Deck.SUITS).indexOf(twoCard.getSuit());
  String playerOneCard = oneCard.name();
  String playerTwoCard = twoCard.name();
  model.put("oneCardSuit", oneCardSuit);
  model.put("twoCardSuit", twoCardSuit);
  model.put("oneCardValue", oneCardValue);
  model.put("twoCardValue", twoCardValue);
  model.put("playerOneCard", playerOneCard);
  model.put("playerTwoCard", playerTwoCard);
  model.put("template", "templates/success.vtl");
  return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());



  }
}
