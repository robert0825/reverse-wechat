package c.t.m.g;

import android.text.TextUtils;

public final class ck
{
  public final cj a;
  public int b;
  String c;
  String d;
  public String e;
  String f;
  public String g;
  public String h;
  public String i;
  public String j;
  int k;
  int l;
  public long m;
  public volatile long n = 0L;
  public volatile long o = 0L;
  public volatile long p = 0L;
  public volatile String q = "";
  public String r;
  public String s = "6.1.2.2";
  private String t = "6.1.2.2";
  private String u = "170703";
  
  ck(cj paramcj)
  {
    this.a = paramcj;
  }
  
  public final String a()
  {
    if (TextUtils.isEmpty(this.c)) {
      return "0123456789ABCDEF";
    }
    return this.c;
  }
  
  public final String b()
  {
    if (TextUtils.isEmpty(this.d)) {
      return "0123456789ABCDEF";
    }
    return this.d;
  }
  
  public final String c()
  {
    if ((TextUtils.isEmpty(this.f)) || (this.f.contains("0000"))) {
      return "0123456789ABCDEF";
    }
    return this.f;
  }
  
  public final String d()
  {
    if (this.t == null) {
      return "None";
    }
    return this.t;
  }
  
  public final String e()
  {
    if (this.u == null) {
      return "None";
    }
    return this.u;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */