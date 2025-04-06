package viktalina;

import viktalina.data.Card;
import viktalina.data.MasterCard;
import viktalina.data.UnionPayCard;

import java.util.ArrayList;
import java.util.List;

import static viktalina.data.Country.RU;

public class Oоp {

public static void main(String[] args) {
  invoke(new UnionPayCard());
  List<String> aList = new ArrayList<>();

 /* Card visaCard = new VisaCard();
    visaCard.setBalance(100);
    visaCard.payInCountry(RU, 75); */
}


    public static void invoke (Card card){
      card.setBalance(100);
      card.payInCountry(RU, 75);


      System.out.println("Current balance: " + card.getBalance());

    }
}
