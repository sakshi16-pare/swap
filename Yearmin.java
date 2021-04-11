Public class yearmin{
Public static void main (string [] arts){
Double d = 60*24*365;
System.out.println("enter minutes: ");
Scanner sc=new scanner (System.in);
Double min=sc.nextDouble();
Long y = (long) (min/ d);
Int day=(int)(min/60/24)%365;
System.out.println((double) min +"minutes" +y+ "years" +day+ "days");
}}
