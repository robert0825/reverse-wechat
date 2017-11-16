package c.t.m.g;

import java.util.ArrayList;
import java.util.List;

public final class du
{
  private static double[][] a;
  private static double b;
  private static double c;
  private static double d;
  private static double e;
  private static List<a> f;
  
  static
  {
    double[] arrayOfDouble1 = { 52.749594D, 119.919891D };
    double[] arrayOfDouble2 = { 49.95122D, 116.580048D };
    double[] arrayOfDouble3 = { 45.213004D, 112.009735D };
    double[] arrayOfDouble4 = { 42.714732D, 107.83493D };
    double[] arrayOfDouble5 = { 47.398349D, 82.961884D };
    double[] arrayOfDouble6 = { 44.964798D, 79.753876D };
    double[] arrayOfDouble7 = { 40.513799D, 73.689423D };
    double[] arrayOfDouble8 = { 36.5626D, 73.758774D };
    double[] arrayOfDouble9 = { 33.760882D, 76.457977D };
    double[] arrayOfDouble10 = { 31.989442D, 77.688446D };
    double[] arrayOfDouble11 = { 26.755421D, 92.118645D };
    double[] arrayOfDouble12 = { 27.936181D, 97.379379D };
    double[] arrayOfDouble13 = { 21.105D, 101.707993D };
    double[] arrayOfDouble14 = { 21.350781D, 107.684555D };
    double[] arrayOfDouble15 = { 16.762468D, 109.002914D };
    double[] arrayOfDouble16 = { 21.2689D, 112.782211D };
    double[] arrayOfDouble17 = { 27.76133D, 121.821041D };
    double[] arrayOfDouble18 = { 33.155948D, 120.999985D };
    double[] arrayOfDouble19 = { 39.842286D, 124.273911D };
    double[] arrayOfDouble20 = { 42.815551D, 131.197872D };
    double[] arrayOfDouble21 = { 45.02695D, 133.172836D };
    double[] arrayOfDouble22 = { 49.196064D, 130.536118D };
    double[] arrayOfDouble23 = { 53.13359D, 125.833969D };
    a = new double[][] { { 53.540307D, 122.380829D }, { 53.399707D, 120.821285D }, arrayOfDouble1, arrayOfDouble2, { 47.901614D, 115.437469D }, { 47.070122D, 118.381805D }, arrayOfDouble3, arrayOfDouble4, { 42.779275D, 100.100555D }, { 42.90816D, 96.49704D }, { 44.43378D, 95.442352D }, { 45.614037D, 91.091766D }, { 47.606163D, 91.003876D }, { 49.439557D, 87.180634D }, arrayOfDouble5, arrayOfDouble6, { 42.358544D, 79.885712D }, arrayOfDouble7, arrayOfDouble8, arrayOfDouble9, arrayOfDouble10, { 28.497661D, 84.280243D }, { 27.166695D, 88.394279D }, arrayOfDouble11, arrayOfDouble12, { 24.166802D, 97.115707D }, { 21.350781D, 99.972153D }, arrayOfDouble13, { 23.120154D, 105.355453D }, { 21.915019D, 106.646605D }, arrayOfDouble14, arrayOfDouble15, { 18.729502D, 111.174774D }, arrayOfDouble16, { 22.998852D, 117.176743D }, { 25.019304D, 119.973391D }, { 27.117813D, 120.890121D }, arrayOfDouble17, { 30.097613D, 123.451653D }, arrayOfDouble18, { 35.209722D, 120.143051D }, { 36.914764D, 122.913322D }, arrayOfDouble19, { 41.294317D, 128.272934D }, arrayOfDouble20, arrayOfDouble21, { 48.04871D, 135.040512D }, { 48.618385D, 134.337387D }, { 47.886881D, 131.700668D }, arrayOfDouble22, { 50.708634D, 127.613754D }, arrayOfDouble23, { 53.657661D, 123.329086D } };
    b = 360.0D;
    c = 360.0D;
    d = -360.0D;
    e = -360.0D;
    f = new ArrayList();
    a();
  }
  
  private static void a()
  {
    int i = 0;
    while (i < a.length)
    {
      double d1 = a[i][0];
      double d2 = a[i][1];
      if (d1 < c) {
        c = d1;
      }
      if (d1 > e) {
        e = d1;
      }
      if (d2 < b) {
        b = d2;
      }
      if (d2 > d) {
        d = d2;
      }
      f.add(new a(d1, d2));
      i += 1;
    }
  }
  
  public static boolean a(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 < c) || (paramDouble2 < b) || (paramDouble1 > e) || (paramDouble2 > d)) {
      return false;
    }
    Object localObject = (a)f.get(0);
    int m = f.size();
    int j = 0;
    int i = 1;
    while (i <= m)
    {
      a locala = (a)f.get(i % m);
      int k = j;
      if (paramDouble1 > Math.min(((a)localObject).a, locala.a))
      {
        k = j;
        if (paramDouble1 <= Math.max(((a)localObject).a, locala.a))
        {
          k = j;
          if (paramDouble2 <= Math.max(((a)localObject).b, locala.b))
          {
            k = j;
            if (((a)localObject).a != locala.a)
            {
              double d1 = (paramDouble1 - ((a)localObject).a) * (locala.b - ((a)localObject).b) / (locala.a - ((a)localObject).a);
              double d2 = ((a)localObject).b;
              if (((a)localObject).b != locala.b)
              {
                k = j;
                if (paramDouble2 > d1 + d2) {}
              }
              else
              {
                k = j + 1;
              }
            }
          }
        }
      }
      i += 1;
      localObject = locala;
      j = k;
    }
    if (j % 2 == 0) {}
    for (i = 0; i != 0; i = 1) {
      return true;
    }
    return false;
  }
  
  static final class a
  {
    double a;
    double b;
    
    public a(double paramDouble1, double paramDouble2)
    {
      this.a = paramDouble1;
      this.b = paramDouble2;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */