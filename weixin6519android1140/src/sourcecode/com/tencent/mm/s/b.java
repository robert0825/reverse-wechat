package com.tencent.mm.s;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public final class b
{
  private Random fUA;
  t fUB;
  SparseArray<a> fUw;
  HashMap<w.a, a> fUx;
  SparseArray<b> fUy;
  HashMap<w.a, b> fUz;
  
  public b()
  {
    GMTrace.i(14594701524992L, 108739);
    this.fUw = new SparseArray();
    this.fUx = new HashMap();
    this.fUy = new SparseArray();
    this.fUz = new HashMap();
    this.fUA = new Random();
    this.fUB = null;
    GMTrace.o(14594701524992L, 108739);
  }
  
  private a b(w.a parama)
  {
    GMTrace.i(14595506831360L, 108745);
    String str = (String)this.fUB.get(parama, null);
    if (str == null)
    {
      GMTrace.o(14595506831360L, 108745);
      return null;
    }
    String[] arrayOfString = str.split("\\|");
    if (arrayOfString.length != 3)
    {
      w.e("MicroMsg.NewBadgeDecoder", "loadDataSource array.length != 3 content %s", new Object[] { str });
      GMTrace.o(14595506831360L, 108745);
      return null;
    }
    try
    {
      parama = a(parama, Integer.valueOf(arrayOfString[0]).intValue(), unescape(arrayOfString[1]), unescape(arrayOfString[2]));
      GMTrace.o(14595506831360L, 108745);
      return parama;
    }
    catch (Exception parama)
    {
      w.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bg.f(parama) });
      w.e("MicroMsg.NewBadgeDecoder", "loadDataSource exception content %s", new Object[] { str });
      GMTrace.o(14595506831360L, 108745);
    }
    return null;
  }
  
  private b c(w.a parama)
  {
    GMTrace.i(14595775266816L, 108747);
    String str = (String)this.fUB.get(parama, null);
    if (str == null)
    {
      parama = d(parama);
      GMTrace.o(14595775266816L, 108747);
      return parama;
    }
    String[] arrayOfString = str.split("\\|");
    if (arrayOfString.length % 2 != 0)
    {
      w.e("MicroMsg.NewBadgeDecoder", "loadWatcher array.length %% 2 != 0 content %s", new Object[] { str });
      GMTrace.o(14595775266816L, 108747);
      return null;
    }
    try
    {
      parama = d(parama);
      int i = 0;
      while (i < arrayOfString.length)
      {
        parama.fUF.put(arrayOfString[i], unescape(arrayOfString[(i + 1)]));
        i += 2;
      }
      GMTrace.o(14595775266816L, 108747);
      return parama;
    }
    catch (Exception parama)
    {
      w.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bg.f(parama) });
      w.e("MicroMsg.NewBadgeDecoder", "loadWatcher exception content %s", new Object[] { str });
      GMTrace.o(14595775266816L, 108747);
    }
    return null;
  }
  
  private a eL(int paramInt)
  {
    GMTrace.i(14595372613632L, 108744);
    String str = (String)this.fUB.get(paramInt, null);
    if (str == null)
    {
      GMTrace.o(14595372613632L, 108744);
      return null;
    }
    Object localObject = str.split("\\|");
    if (localObject.length != 3)
    {
      w.e("MicroMsg.NewBadgeDecoder", "loadDataSource array.length != 3 content %s", new Object[] { str });
      GMTrace.o(14595372613632L, 108744);
      return null;
    }
    try
    {
      localObject = a(paramInt, Integer.valueOf(localObject[0]).intValue(), unescape(localObject[1]), unescape(localObject[2]));
      GMTrace.o(14595372613632L, 108744);
      return (a)localObject;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bg.f(localException) });
      w.e("MicroMsg.NewBadgeDecoder", "loadDataSource exception content %s", new Object[] { str });
      GMTrace.o(14595372613632L, 108744);
    }
    return null;
  }
  
  private b eM(int paramInt)
  {
    GMTrace.i(14595641049088L, 108746);
    Object localObject = (String)this.fUB.get(paramInt, null);
    if (localObject == null)
    {
      localObject = eN(paramInt);
      GMTrace.o(14595641049088L, 108746);
      return (b)localObject;
    }
    String[] arrayOfString = ((String)localObject).split("\\|");
    if (arrayOfString.length % 2 != 0)
    {
      w.e("MicroMsg.NewBadgeDecoder", "loadWatcher array.length %% 2 != 0 content %s", new Object[] { localObject });
      GMTrace.o(14595641049088L, 108746);
      return null;
    }
    try
    {
      b localb = eN(paramInt);
      paramInt = 0;
      while (paramInt < arrayOfString.length)
      {
        localb.fUE.put(Integer.valueOf(arrayOfString[paramInt]).intValue(), unescape(arrayOfString[(paramInt + 1)]));
        paramInt += 2;
      }
      GMTrace.o(14595641049088L, 108746);
      return localb;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bg.f(localException) });
      w.e("MicroMsg.NewBadgeDecoder", "loadWatcher exception content %s", new Object[] { localObject });
      GMTrace.o(14595641049088L, 108746);
    }
    return null;
  }
  
  private static String ej(String paramString)
  {
    GMTrace.i(14594835742720L, 108740);
    paramString = paramString.replaceAll("\\|", "%7C");
    GMTrace.o(14594835742720L, 108740);
    return paramString;
  }
  
  private static String unescape(String paramString)
  {
    GMTrace.i(14594969960448L, 108741);
    paramString = paramString.replaceAll("%7C", "|");
    GMTrace.o(14594969960448L, 108741);
    return paramString;
  }
  
  final a a(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    GMTrace.i(14596312137728L, 108751);
    a locala = new a();
    locala.fUs = paramInt1;
    locala.type = paramInt2;
    locala.value = paramString1;
    locala.eEU = paramString2;
    GMTrace.o(14596312137728L, 108751);
    return locala;
  }
  
  final a a(w.a parama, int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(14596446355456L, 108752);
    a locala = new a();
    locala.fUt = parama;
    locala.type = paramInt;
    locala.value = paramString1;
    locala.eEU = paramString2;
    GMTrace.o(14596446355456L, 108752);
    return locala;
  }
  
  public final a a(w.a parama1, w.a parama2, int paramInt)
  {
    GMTrace.i(16744735309824L, 124758);
    w.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSourceKey %s, watcherKey %s, type %d", new Object[] { parama1, parama2, Integer.valueOf(paramInt) });
    a locala = e(parama1);
    if (locala == null)
    {
      w.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSource == null");
      GMTrace.o(16744735309824L, 124758);
      return null;
    }
    if ((locala.type & paramInt) == 0)
    {
      w.d("MicroMsg.NewBadgeDecoder", "[alex] peek, dataSource.type is wrong");
      GMTrace.o(16744735309824L, 124758);
      return null;
    }
    parama2 = f(parama2);
    if (parama2 != null)
    {
      String str = (String)parama2.fUF.get(parama1.name());
      if ((str != null) && (str.equals(locala.eEU)))
      {
        GMTrace.o(16744735309824L, 124758);
        return null;
      }
      if (str == null)
      {
        str = vJ();
        parama2.fUF.put(parama1.name(), str);
        a(parama2);
      }
      GMTrace.o(16744735309824L, 124758);
      return locala;
    }
    w.e("MicroMsg.NewBadgeDecoder", "[carl] peek, watcher == null");
    GMTrace.o(16744735309824L, 124758);
    return null;
  }
  
  final void a(a parama)
  {
    GMTrace.i(14595104178176L, 108742);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(parama.type);
    localStringBuffer.append("|");
    localStringBuffer.append(ej(parama.value));
    localStringBuffer.append("|");
    localStringBuffer.append(ej(parama.eEU));
    if (parama.fUt != null)
    {
      this.fUB.a(parama.fUt, localStringBuffer.toString());
      GMTrace.o(14595104178176L, 108742);
      return;
    }
    this.fUB.set(parama.fUs, localStringBuffer.toString());
    GMTrace.o(14595104178176L, 108742);
  }
  
  final void a(b paramb)
  {
    GMTrace.i(14595238395904L, 108743);
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject1;
    if (paramb.fUv != null)
    {
      localObject1 = paramb.fUF.entrySet().iterator();
      i = 0;
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        String str = (String)((Map.Entry)localObject2).getKey();
        localObject2 = (String)((Map.Entry)localObject2).getValue();
        if (i != 0) {
          localStringBuffer.append("|");
        }
        localStringBuffer.append(str);
        localStringBuffer.append("|");
        localStringBuffer.append(ej((String)localObject2));
        i += 1;
      }
      this.fUB.a(paramb.fUv, localStringBuffer.toString());
      GMTrace.o(14595238395904L, 108743);
      return;
    }
    int i = 0;
    while (i < paramb.fUE.size())
    {
      int j = paramb.fUE.keyAt(i);
      localObject1 = (String)paramb.fUE.get(j);
      if (i != 0) {
        localStringBuffer.append("|");
      }
      localStringBuffer.append(j);
      localStringBuffer.append("|");
      localStringBuffer.append(ej((String)localObject1));
      i += 1;
    }
    this.fUB.set(paramb.fUD, localStringBuffer.toString());
    GMTrace.o(14595238395904L, 108743);
  }
  
  final b d(w.a parama)
  {
    GMTrace.i(14596177920000L, 108750);
    b localb = new b();
    localb.fUv = parama;
    GMTrace.o(14596177920000L, 108750);
    return localb;
  }
  
  public final a e(w.a parama)
  {
    GMTrace.i(14596714790912L, 108754);
    a locala2 = (a)this.fUx.get(parama);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala2 = b(parama);
      locala1 = locala2;
      if (locala2 != null)
      {
        this.fUx.put(parama, locala2);
        locala1 = locala2;
      }
    }
    GMTrace.o(14596714790912L, 108754);
    return locala1;
  }
  
  final b eN(int paramInt)
  {
    GMTrace.i(14596043702272L, 108749);
    b localb = new b();
    localb.fUD = paramInt;
    GMTrace.o(14596043702272L, 108749);
    return localb;
  }
  
  public final a eO(int paramInt)
  {
    GMTrace.i(14596580573184L, 108753);
    a locala2 = (a)this.fUw.get(paramInt);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala2 = eL(paramInt);
      locala1 = locala2;
      if (locala2 != null)
      {
        this.fUw.put(paramInt, locala2);
        locala1 = locala2;
      }
    }
    GMTrace.o(14596580573184L, 108753);
    return locala1;
  }
  
  final b eP(int paramInt)
  {
    GMTrace.i(14596849008640L, 108755);
    b localb2 = (b)this.fUy.get(paramInt);
    b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = eM(paramInt);
      if (localb1 == null)
      {
        w.e("MicroMsg.NewBadgeDecoder", "[carl] loadWatcher watcher == null");
        GMTrace.o(14596849008640L, 108755);
        return null;
      }
      this.fUy.put(paramInt, localb1);
    }
    GMTrace.o(14596849008640L, 108755);
    return localb1;
  }
  
  final b f(w.a parama)
  {
    GMTrace.i(16744601092096L, 124757);
    b localb2 = (b)this.fUz.get(parama);
    b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = c(parama);
      if (localb1 == null)
      {
        w.e("MicroMsg.NewBadgeDecoder", "[carl] loadWatcher watcher == null");
        GMTrace.o(16744601092096L, 124757);
        return null;
      }
      this.fUz.put(parama, localb1);
    }
    GMTrace.o(16744601092096L, 124757);
    return localb1;
  }
  
  public final a p(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(14596983226368L, 108756);
    w.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSourceId %d, watcherId %d, type %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    a locala = eO(paramInt1);
    if (locala == null)
    {
      w.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSource == null");
      GMTrace.o(14596983226368L, 108756);
      return null;
    }
    if ((locala.type & paramInt3) == 0)
    {
      w.d("MicroMsg.NewBadgeDecoder", "[alex] peek, dataSource.type is wrong");
      GMTrace.o(14596983226368L, 108756);
      return null;
    }
    b localb = eP(paramInt2);
    if (localb != null)
    {
      String str = (String)localb.fUE.get(paramInt1);
      if ((str != null) && (str.equals(locala.eEU)))
      {
        GMTrace.o(14596983226368L, 108756);
        return null;
      }
      if (str == null)
      {
        str = vJ();
        localb.fUE.put(paramInt1, str);
        a(localb);
      }
      GMTrace.o(14596983226368L, 108756);
      return locala;
    }
    w.e("MicroMsg.NewBadgeDecoder", "[carl] peek, watcher == null");
    GMTrace.o(14596983226368L, 108756);
    return null;
  }
  
  final String vJ()
  {
    GMTrace.i(14595909484544L, 108748);
    String str = String.format("%d%04d", new Object[] { Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.fUA.nextInt(Math.abs(this.fUA.nextInt(Integer.MAX_VALUE))) % 10000) });
    GMTrace.o(14595909484544L, 108748);
    return str;
  }
  
  public final class a
  {
    String eEU;
    int fUs;
    w.a fUt;
    int type;
    public String value;
    
    public a()
    {
      GMTrace.i(14594030436352L, 108734);
      GMTrace.o(14594030436352L, 108734);
    }
  }
  
  public final class b
  {
    int fUD;
    SparseArray<String> fUE;
    HashMap<String, String> fUF;
    w.a fUv;
    
    public b()
    {
      GMTrace.i(14593493565440L, 108730);
      this.fUE = new SparseArray();
      this.fUF = new HashMap();
      GMTrace.o(14593493565440L, 108730);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\s\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */