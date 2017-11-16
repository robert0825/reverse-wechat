package com.tencent.mm.plugin.a;

import com.tencent.gmtrace.GMTrace;

public final class g
{
  public long hns;
  public int hnt;
  public int id;
  public int size;
  public long start;
  
  public g()
  {
    GMTrace.i(17457699880960L, 130070);
    GMTrace.o(17457699880960L, 130070);
  }
  
  public final String toString()
  {
    GMTrace.i(17457834098688L, 130071);
    String str = " id: " + this.id + " start: " + this.start + " size: " + this.size + " sampleTime: " + this.hns + " sampleFlag: " + this.hnt;
    GMTrace.o(17457834098688L, 130071);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */