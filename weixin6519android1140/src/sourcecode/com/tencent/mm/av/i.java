package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.akt;
import com.tencent.mm.protocal.c.aku;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Deprecated
public final class i
  extends e.b
{
  private aku gPv;
  
  public i(List<a> paramList)
  {
    super(36);
    GMTrace.i(13241518391296L, 98657);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      localLinkedList.add(((a)localIterator.next()).gPw);
    }
    this.gPv = new aku();
    this.gPv.jhc = paramList.size();
    this.gPv.jhd = localLinkedList;
    this.mVj = this.gPv;
    GMTrace.o(13241518391296L, 98657);
  }
  
  public static final class a
  {
    akt gPw;
    private int key;
    private String value;
    
    public a()
    {
      GMTrace.i(13241786826752L, 98659);
      this.key = 0;
      this.value = "";
      this.gPw = new akt();
      this.gPw.oqG = 0;
      this.gPw.oqQ = "";
      GMTrace.o(13241786826752L, 98659);
    }
    
    public a(int paramInt, String paramString)
    {
      GMTrace.i(13241921044480L, 98660);
      this.key = paramInt;
      this.value = paramString;
      this.gPw = new akt();
      this.gPw.oqG = paramInt;
      this.gPw.oqQ = paramString;
      GMTrace.o(13241921044480L, 98660);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\av\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */