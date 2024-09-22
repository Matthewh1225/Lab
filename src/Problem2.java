public class Problem2{
  public String convert(String date ){
    int length = date.length();
    
    int endOfMonth = date.indexOf(" ");
    String month = date.substring(0, endOfMonth);

    int endOfDay = date.indexOf(",");
    String day = date.substring(endOfMonth+1, endOfDay);

    int startOfYear = date.indexOf(",");
    String year = date.substring(startOfYear+1,length);

    String internationalDate = year + "-" + month + "-" + day;

    System.out.println(internationalDate);

    return internationalDate;
  } 
  public static void main(String[] args) {
    Problem2 date = new Problem2();
    date.convert("December 25,1998");

  }
}