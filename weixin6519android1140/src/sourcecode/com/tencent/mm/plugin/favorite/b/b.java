package com.tencent.mm.plugin.favorite.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class b
  extends i<a>
{
  public static final String[] fTX;
  public e fTZ;
  private List<a> gEV;
  
  static
  {
    GMTrace.i(6274007695360L, 46745);
    fTX = new String[] { i.a(a.fTp, "FavCdnInfo") };
    GMTrace.o(6274007695360L, 46745);
  }
  
  public b(e parame)
  {
    super(parame, a.fTp, "FavCdnInfo", null);
    GMTrace.i(6272262864896L, 46732);
    this.gEV = new LinkedList();
    this.fTZ = parame;
    GMTrace.o(6272262864896L, 46732);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(6271994429440L, 46730);
    this.gEV.add(parama);
    GMTrace.o(6271994429440L, 46730);
  }
  
  public final void a(j paramj)
  {
    GMTrace.i(6272933953536L, 46737);
    long l = bg.Pv();
    paramj = "update FavCdnInfo set status = 1,modifyTime = " + l + " where favLocalId = " + paramj.field_localId + " and type = 0" + " and status <> 3";
    this.fTZ.eZ("FavCdnInfo", paramj);
    GMTrace.o(6272933953536L, 46737);
  }
  
  public final boolean a(a parama)
  {
    int i = 0;
    GMTrace.i(6272397082624L, 46733);
    if (parama == null)
    {
      GMTrace.o(6272397082624L, 46733);
      return false;
    }
    if (super.b(parama))
    {
      a[] arrayOfa = new a[this.gEV.size()];
      this.gEV.toArray(arrayOfa);
      int j = arrayOfa.length;
      while (i < j)
      {
        a locala = arrayOfa[i];
        if (locala != null) {
          locala.b(parama);
        }
        i += 1;
      }
      GMTrace.o(6272397082624L, 46733);
      return true;
    }
    GMTrace.o(6272397082624L, 46733);
    return false;
  }
  
  public final boolean a(a parama, String... paramVarArgs)
  {
    int i = 0;
    GMTrace.i(6272531300352L, 46734);
    if (super.c(parama, paramVarArgs))
    {
      paramVarArgs = new a[this.gEV.size()];
      this.gEV.toArray(paramVarArgs);
      int j = paramVarArgs.length;
      while (i < j)
      {
        paramVarArgs[i].b(parama);
        i += 1;
      }
      GMTrace.o(6272531300352L, 46734);
      return true;
    }
    GMTrace.o(6272531300352L, 46734);
    return false;
  }
  
  public final void b(a parama)
  {
    GMTrace.i(6272128647168L, 46731);
    this.gEV.remove(parama);
    GMTrace.o(6272128647168L, 46731);
  }
  
  public final boolean b(a parama, String... paramVarArgs)
  {
    int i = 0;
    GMTrace.i(6272665518080L, 46735);
    if (super.a(parama, paramVarArgs))
    {
      paramVarArgs = new a[this.gEV.size()];
      this.gEV.toArray(paramVarArgs);
      int j = paramVarArgs.length;
      while (i < j)
      {
        paramVarArgs[i].b(parama);
        i += 1;
      }
      GMTrace.o(6272665518080L, 46735);
      return true;
    }
    GMTrace.o(6272665518080L, 46735);
    return false;
  }
  
  public final List<a> cc(long paramLong)
  {
    GMTrace.i(6273068171264L, 46738);
    ArrayList localArrayList = new ArrayList();
    Object localObject = "select * from FavCdnInfo where favLocalId = " + paramLong;
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (localObject != null)
    {
      while (((Cursor)localObject).moveToNext())
      {
        a locala = new a();
        locala.b((Cursor)localObject);
        localArrayList.add(locala);
      }
      ((Cursor)localObject).close();
    }
    w.v("MicroMsg.FavCdnStorage", "getInfos size:%d", new Object[] { Integer.valueOf(localArrayList.size()) });
    GMTrace.o(6273068171264L, 46738);
    return localArrayList;
  }
  
  public final void cd(long paramLong)
  {
    GMTrace.i(6273202388992L, 46739);
    String str = String.format("delete from %s where %s = %d and %s = %d", new Object[] { "FavCdnInfo", "favLocalId", Long.valueOf(paramLong), "type", Integer.valueOf(0) });
    this.fTZ.eZ("FavCdnInfo", str);
    GMTrace.o(6273202388992L, 46739);
  }
  
  public final boolean ce(long paramLong)
  {
    GMTrace.i(6273470824448L, 46741);
    a locala = new a();
    locala.field_favLocalId = paramLong;
    boolean bool = b(locala, new String[] { "favLocalId" });
    GMTrace.o(6273470824448L, 46741);
    return bool;
  }
  
  public final int m(long paramLong, int paramInt)
  {
    GMTrace.i(6273336606720L, 46740);
    Object localObject = "select status from FavCdnInfo where favLocalId = " + paramLong + " and type = " + paramInt;
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (localObject == null)
    {
      GMTrace.o(6273336606720L, 46740);
      return 3;
    }
    if (!((Cursor)localObject).moveToFirst())
    {
      ((Cursor)localObject).close();
      GMTrace.o(6273336606720L, 46740);
      return 3;
    }
    paramInt = 1;
    int i = 1;
    int j = 1;
    int k;
    int m;
    int n;
    do
    {
      int i1 = ((Cursor)localObject).getInt(0);
      if (i1 == 1)
      {
        ((Cursor)localObject).close();
        GMTrace.o(6273336606720L, 46740);
        return 1;
      }
      k = j;
      if (i1 != 4) {
        k = 0;
      }
      m = i;
      if (i1 != 2) {
        m = 0;
      }
      n = paramInt;
      if (i1 != 3) {
        n = 0;
      }
      paramInt = n;
      i = m;
      j = k;
    } while (((Cursor)localObject).moveToNext());
    ((Cursor)localObject).close();
    if (m != 0)
    {
      GMTrace.o(6273336606720L, 46740);
      return 2;
    }
    if (k != 0)
    {
      GMTrace.o(6273336606720L, 46740);
      return 4;
    }
    if (n != 0)
    {
      GMTrace.o(6273336606720L, 46740);
      return 3;
    }
    GMTrace.o(6273336606720L, 46740);
    return 0;
  }
  
  public final a xE(String paramString)
  {
    Object localObject = null;
    GMTrace.i(6272799735808L, 46736);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FavCdnStorage", "md5 null");
      GMTrace.o(6272799735808L, 46736);
      return null;
    }
    paramString = "select * from FavCdnInfo where dataId = '" + paramString + "'";
    Cursor localCursor = this.fTZ.a(paramString, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(6272799735808L, 46736);
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new a();
      paramString.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(6272799735808L, 46736);
    return paramString;
  }
  
  public static abstract interface a
  {
    public abstract void b(a parama);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */