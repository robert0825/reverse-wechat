package com.tencent.mm.storage;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.f;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.List;

public final class g
  extends i<f>
{
  public static final String[] fTX;
  private com.tencent.mm.bu.g goN;
  SparseArray<String> vpo;
  
  static
  {
    GMTrace.i(1570481635328L, 11701);
    fTX = new String[] { i.a(f.qM(), "AddContactAntispamTicket") };
    GMTrace.o(1570481635328L, 11701);
  }
  
  public g(e parame)
  {
    super(parame, f.qM(), "AddContactAntispamTicket", null);
    GMTrace.i(1569810546688L, 11696);
    this.vpo = new SparseArray();
    this.goN = ((com.tencent.mm.bu.g)parame);
    GMTrace.o(1569810546688L, 11696);
  }
  
  public final String Th(String paramString)
  {
    GMTrace.i(1570347417600L, 11700);
    if (bg.nm(paramString))
    {
      GMTrace.o(1570347417600L, 11700);
      return null;
    }
    Object localObject = (String)this.vpo.get(paramString.hashCode());
    if (!bg.nm((String)localObject))
    {
      GMTrace.o(1570347417600L, 11700);
      return (String)localObject;
    }
    localObject = new a();
    ((a)localObject).field_userName = paramString;
    if (b((c)localObject, new String[] { "userName" }))
    {
      paramString = ((a)localObject).field_userName;
      int i = ((a)localObject).field_scene;
      fd(paramString, ((a)localObject).field_ticket);
      paramString = ((a)localObject).field_ticket;
      GMTrace.o(1570347417600L, 11700);
      return paramString;
    }
    GMTrace.o(1570347417600L, 11700);
    return null;
  }
  
  public final void cd(List<f> paramList)
  {
    GMTrace.i(1570078982144L, 11698);
    if (paramList.size() == 0)
    {
      GMTrace.o(1570078982144L, 11698);
      return;
    }
    long l = this.goN.cE(Thread.currentThread().getId());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      a((f)paramList.next());
    }
    this.goN.aL(l);
    GMTrace.o(1570078982144L, 11698);
  }
  
  public final void fd(String paramString1, String paramString2)
  {
    GMTrace.i(1570213199872L, 11699);
    if (bg.nm(paramString1))
    {
      GMTrace.o(1570213199872L, 11699);
      return;
    }
    this.vpo.put(paramString1.hashCode(), paramString2);
    GMTrace.o(1570213199872L, 11699);
  }
  
  public final void t(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(1569944764416L, 11697);
    if (bg.nm(paramString1))
    {
      GMTrace.o(1569944764416L, 11697);
      return;
    }
    a locala = new a();
    locala.field_userName = paramString1;
    locala.field_scene = paramInt;
    locala.field_ticket = paramString2;
    a(locala);
    fd(paramString1, paramString2);
    GMTrace.o(1569944764416L, 11697);
  }
  
  public static final class a
    extends f
  {
    public a()
    {
      GMTrace.i(1565918232576L, 11667);
      GMTrace.o(1565918232576L, 11667);
    }
    
    protected final c.a uw()
    {
      GMTrace.i(1566052450304L, 11668);
      c.a locala = f.qM();
      GMTrace.o(1566052450304L, 11668);
      return locala;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */