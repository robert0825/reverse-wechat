package com.tencent.mm.plugin.appbrand.c;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.protocal.c.blb;
import com.tencent.mm.protocal.c.bue;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class f
  extends j
{
  public static final String[] hIQ;
  public final g hKn;
  public final c hMO;
  public volatile int hMP;
  
  static
  {
    GMTrace.i(10020292919296L, 74657);
    hIQ = new String[] { i.a(a.hJW, "AppBrandStarApp") };
    GMTrace.o(10020292919296L, 74657);
  }
  
  public f(g paramg)
  {
    GMTrace.i(10019487612928L, 74651);
    this.hMP = 10;
    this.hKn = paramg;
    this.hMO = new c(paramg);
    GMTrace.o(10019487612928L, 74651);
  }
  
  public final boolean aa(String paramString, int paramInt)
  {
    Object localObject = null;
    GMTrace.i(10019756048384L, 74653);
    if (bg.nm(paramString)) {}
    for (paramString = (String)localObject; paramString == null; paramString = this.hKn.query("AppBrandStarApp", null, String.format(Locale.US, "%s=? and %s=?", new Object[] { "username", "versionType" }), new String[] { paramString, String.valueOf(paramInt) }, null, null, null))
    {
      GMTrace.o(10019756048384L, 74653);
      return false;
    }
    boolean bool = paramString.moveToFirst();
    paramString.close();
    GMTrace.o(10019756048384L, 74653);
    return bool;
  }
  
  public final void c(j.a parama)
  {
    GMTrace.i(18848061325312L, 140429);
    a(parama, d.xB().ngv.getLooper());
    GMTrace.o(18848061325312L, 140429);
  }
  
  public final boolean h(final String paramString, final int paramInt, boolean paramBoolean)
  {
    GMTrace.i(10019890266112L, 74654);
    if (bg.nm(paramString))
    {
      GMTrace.o(10019890266112L, 74654);
      return false;
    }
    final a locala = new a();
    locala.field_username = paramString;
    locala.field_versionType = paramInt;
    boolean bool = false;
    if (this.hMO.b(locala, new String[] { "versionType", "username" }))
    {
      this.hMO.b(locala, false, a.hIO);
      if (!aa(paramString, paramInt)) {
        a("single", 5, locala);
      }
    }
    else
    {
      bool = true;
    }
    if ((bool) && (paramBoolean))
    {
      m localm = new m(1003, false, paramInt, 1, 2, paramString, 1, null);
      localm.hNm = new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(10023514144768L, 74681);
          if (((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (((blb)paramAnonymousb.gtD.gtK).ucB.kBk != 0)) && (f.this.hKn.isOpen()))
          {
            f.this.hMO.a(locala, false);
            if (f.this.aa(paramString, paramInt)) {
              f.this.a("single", 2, locala);
            }
          }
          GMTrace.o(10023514144768L, 74681);
          return 0;
        }
      };
      localm.Dy();
    }
    GMTrace.o(10019890266112L, 74654);
    return bool;
  }
  
  public final b<ArrayList> ig(int paramInt)
  {
    Object localObject1 = null;
    GMTrace.i(16371207372800L, 121975);
    int i = paramInt;
    if (paramInt == 0) {
      i = b.hMU;
    }
    Object localObject2 = this.hKn;
    Object localObject3 = String.format(Locale.US, "%s desc limit %d offset 0", new Object[] { "updateTime", Integer.valueOf(this.hMP) });
    localObject2 = ((g)localObject2).query("AppBrandStarApp", new String[] { "username", "versionType" }, null, null, null, null, (String)localObject3);
    if (localObject2 == null)
    {
      GMTrace.o(16371207372800L, 121975);
      return null;
    }
    if (b.hMV == i) {
      if (((Cursor)localObject2).moveToLast())
      {
        localObject3 = new LinkedList();
        localObject1 = new a();
        label133:
        do
        {
          ((a)localObject1).b((Cursor)localObject2);
          ((List)localObject3).add(q.a(String.format(Locale.US, "$%s$%d@starapp", new Object[] { ((a)localObject1).field_username, Integer.valueOf(((a)localObject1).field_versionType) }), ((a)localObject1).field_username, ((a)localObject1).field_versionType, -1L));
          if (b.hMV != i) {
            break;
          }
        } while (((Cursor)localObject2).moveToPrevious());
      }
    }
    for (;;)
    {
      localObject1 = new ArrayList(((List)localObject3).size());
      ((ArrayList)localObject1).addAll((Collection)localObject3);
      do
      {
        ((Cursor)localObject2).close();
        GMTrace.o(16371207372800L, 121975);
        return (b<ArrayList>)localObject1;
      } while (!((Cursor)localObject2).moveToFirst());
      break;
      if (((Cursor)localObject2).moveToNext()) {
        break label133;
      }
    }
  }
  
  public static final class a
    extends com.tencent.mm.g.b.k
  {
    static final String[] hIO;
    static final c.a hJW;
    
    static
    {
      int i = 0;
      GMTrace.i(10017071693824L, 74633);
      hIO = new String[] { "username", "versionType" };
      Object localObject1 = new c.a();
      ((c.a)localObject1).gZM = new Field[3];
      ((c.a)localObject1).columns = new String[4];
      Object localObject2 = new StringBuilder();
      ((c.a)localObject1).columns[0] = "username";
      ((c.a)localObject1).vmt.put("username", "TEXT");
      ((StringBuilder)localObject2).append(" username TEXT");
      ((StringBuilder)localObject2).append(", ");
      ((c.a)localObject1).columns[1] = "versionType";
      ((c.a)localObject1).vmt.put("versionType", "INTEGER");
      ((StringBuilder)localObject2).append(" versionType INTEGER");
      ((StringBuilder)localObject2).append(", ");
      ((c.a)localObject1).columns[2] = "updateTime";
      ((c.a)localObject1).vmt.put("updateTime", "LONG");
      ((StringBuilder)localObject2).append(" updateTime LONG");
      ((c.a)localObject1).columns[3] = "rowid";
      ((c.a)localObject1).vmu = ((StringBuilder)localObject2).toString();
      hJW = (c.a)localObject1;
      localObject1 = " PRIMARY KEY ( ";
      localObject2 = hIO;
      int j = localObject2.length;
      while (i < j)
      {
        localObject3 = localObject2[i];
        localObject1 = (String)localObject1 + ", " + (String)localObject3;
        i += 1;
      }
      localObject1 = ((String)localObject1).replaceFirst(",", "");
      localObject1 = (String)localObject1 + " )";
      localObject2 = new StringBuilder();
      Object localObject3 = hJW;
      ((c.a)localObject3).vmu = (((c.a)localObject3).vmu + "," + (String)localObject1);
      GMTrace.o(10017071693824L, 74633);
    }
    
    public a()
    {
      GMTrace.i(10016803258368L, 74631);
      GMTrace.o(10016803258368L, 74631);
    }
    
    protected final c.a uw()
    {
      GMTrace.i(10016937476096L, 74632);
      c.a locala = hJW;
      GMTrace.o(10016937476096L, 74632);
      return locala;
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(16370536284160L, 121970);
      hMU = 1;
      hMV = 2;
      hMW = new int[] { hMU, hMV };
      GMTrace.o(16370536284160L, 121970);
    }
  }
  
  private static final class c
    extends i<f.a>
  {
    c(g paramg)
    {
      super(f.a.hJW, "AppBrandStarApp", f.a.eZt);
      GMTrace.i(10023245709312L, 74679);
      GMTrace.o(10023245709312L, 74679);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */