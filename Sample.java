class Sample{
  public static void main(String args[]){
    int a=10,b=20,temp=0;
    System.out.println("before swap");
    System.out.println(a+" "+b);
    temp=a;
    a=b;
    b=temp;
    System.out.println("after swap");
    System.out.println(a+" "+b);
  }
}
