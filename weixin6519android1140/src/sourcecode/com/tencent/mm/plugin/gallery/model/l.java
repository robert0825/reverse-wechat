package com.tencent.mm.plugin.gallery.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashSet;

public final class l
{
  private int ihk;
  HashSet<g.a> lBT;
  public HashSet<g.b> lBU;
  public g lBV;
  public int lBW;
  
  public l()
  {
    GMTrace.i(11896790974464L, 88638);
    this.ihk = 3;
    this.lBW = 1;
    this.lBT = new HashSet();
    this.lBU = new HashSet();
    GMTrace.o(11896790974464L, 88638);
  }
  
  private void aDn()
  {
    GMTrace.i(11897059409920L, 88640);
    w.i("MicroMsg.MediaQueryService", "initQueryType: %d", new Object[] { Integer.valueOf(this.lBW) });
    switch (this.lBW)
    {
    default: 
      this.lBV = new i();
      GMTrace.o(11897059409920L, 88640);
      return;
    case 1: 
      this.lBV = new i();
      GMTrace.o(11897059409920L, 88640);
      return;
    case 2: 
      this.lBV = new n();
      GMTrace.o(11897059409920L, 88640);
      return;
    }
    this.lBV = new h();
    GMTrace.o(11897059409920L, 88640);
  }
  
  public final void a(g.a parama)
  {
    GMTrace.i(15617306394624L, 116358);
    this.lBT.add(parama);
    GMTrace.o(15617306394624L, 116358);
  }
  
  public final int aDo()
  {
    GMTrace.i(11897327845376L, 88642);
    w.i("MicroMsg.MediaQueryService", "getQuerySource, %d, %s", new Object[] { Integer.valueOf(this.ihk), bg.bQW() });
    int i = this.ihk;
    GMTrace.o(11897327845376L, 88642);
    return i;
  }
  
  public final int aDp()
  {
    GMTrace.i(11897462063104L, 88643);
    w.i("MicroMsg.MediaQueryService", "getQueryType, %d, %s", new Object[] { Integer.valueOf(this.lBW), bg.bQW() });
    int i = this.lBW;
    GMTrace.o(11897462063104L, 88643);
    return i;
  }
  
  public final void aDq()
  {
    GMTrace.i(15076677386240L, 112330);
    if (this.lBV == null)
    {
      w.f("MicroMsg.MediaQueryService", "media query not init, init again");
      aDn();
    }
    c.aCM().s(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11916923633664L, 88788);
        ArrayList localArrayList = l.this.lBV.aDf();
        l locall = l.this;
        g.a[] arrayOfa = new g.a[locall.lBT.size()];
        locall.lBT.toArray(arrayOfa);
        int j = arrayOfa.length;
        int i = 0;
        while (i < j)
        {
          arrayOfa[i].A(localArrayList);
          i += 1;
        }
        GMTrace.o(11916923633664L, 88788);
      }
      
      public final String toString()
      {
        GMTrace.i(11917057851392L, 88789);
        String str = super.toString() + "|queryAlbums";
        GMTrace.o(11917057851392L, 88789);
        return str;
      }
    });
    GMTrace.o(15076677386240L, 112330);
  }
  
  public final void b(g.a parama)
  {
    GMTrace.i(11897596280832L, 88644);
    this.lBT.remove(parama);
    GMTrace.o(11897596280832L, 88644);
  }
  
  public final void e(final String paramString, final int paramInt, final long paramLong)
  {
    GMTrace.i(11897730498560L, 88645);
    if (this.lBV == null)
    {
      w.f("MicroMsg.MediaQueryService", "media query not init, init again");
      aDn();
    }
    c.aCM().aCZ().removeCallbacksAndMessages(null);
    this.lBV.aDg();
    e locale = c.aCM();
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11900817506304L, 88668);
        l.this.lBV.a(paramString, paramInt, new g.c()
        {
          public final void a(ArrayList<GalleryItem.MediaItem> paramAnonymous2ArrayList, long paramAnonymous2Long)
          {
            GMTrace.i(11910883835904L, 88743);
            l locall = l.this;
            g.b[] arrayOfb = new g.b[locall.lBU.size()];
            locall.lBU.toArray(arrayOfb);
            int j = arrayOfb.length;
            int i = 0;
            while (i < j)
            {
              arrayOfb[i].a(paramAnonymous2ArrayList, paramAnonymous2Long);
              i += 1;
            }
            GMTrace.o(11910883835904L, 88743);
          }
        }, paramLong);
        GMTrace.o(11900817506304L, 88668);
      }
      
      public final String toString()
      {
        GMTrace.i(11900951724032L, 88669);
        String str = super.toString() + "|queryMediaInAlbums";
        GMTrace.o(11900951724032L, 88669);
        return str;
      }
    };
    locale.aCZ().post(paramString);
    GMTrace.o(11897730498560L, 88645);
  }
  
  public final void ok(int paramInt)
  {
    GMTrace.i(11896925192192L, 88639);
    this.lBW = paramInt;
    aDn();
    GMTrace.o(11896925192192L, 88639);
  }
  
  public final void ol(int paramInt)
  {
    GMTrace.i(11897193627648L, 88641);
    w.i("MicroMsg.MediaQueryService", "setQuerySource, %d, %s", new Object[] { Integer.valueOf(paramInt), bg.bQW() });
    this.ihk = paramInt;
    GMTrace.o(11897193627648L, 88641);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */