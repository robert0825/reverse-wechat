package com.tencent.mm.plugin.webview.modelcache;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e
{
  private final SparseArray<b<a>> rFI;
  
  public e()
  {
    GMTrace.i(12365613498368L, 92131);
    this.rFI = new SparseArray();
    GMTrace.o(12365613498368L, 92131);
  }
  
  public final boolean a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2)
  {
    GMTrace.i(12365881933824L, 92133);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (bg.nm(paramString3)) || ((paramInt2 != 2) && (paramInt2 != 1) && (paramInt2 != 3)))
    {
      GMTrace.o(12365881933824L, 92133);
      return false;
    }
    b localb;
    synchronized (this.rFI)
    {
      localb = (b)this.rFI.get(paramInt1);
      if (localb == null)
      {
        GMTrace.o(12365881933824L, 92133);
        return true;
      }
    }
    for (;;)
    {
      synchronized (localb.gCf)
      {
        if (localb.rFM.size() == 0)
        {
          GMTrace.o(12365881933824L, 92133);
          return true;
        }
        LinkedList localLinkedList = new LinkedList();
        paramInt1 = 0;
        if (paramInt1 < localb.rFM.size())
        {
          a locala = (a)localb.valueAt(paramInt1);
          if ((!bg.nl(locala.appId).equals(paramString1)) || (!bg.nl(locala.eYR).equals(paramString2)) || (!bg.nl(locala.eYS).equals(paramString3)) || (locala.eYT != paramInt2)) {
            break label303;
          }
          localLinkedList.add(Integer.valueOf(locala.key));
          break label303;
        }
        paramString1 = localLinkedList.iterator();
        if (paramString1.hasNext()) {
          localb.remove(((Integer)paramString1.next()).intValue());
        }
      }
      GMTrace.o(12365881933824L, 92133);
      return true;
      label303:
      paramInt1 += 1;
    }
  }
  
  public final boolean a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, String paramString4)
  {
    GMTrace.i(12366016151552L, 92134);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (bg.nm(paramString3)) || (bg.nm(paramString4)) || ((paramInt2 != 2) && (paramInt2 != 1) && (paramInt2 != 3)))
    {
      GMTrace.o(12366016151552L, 92134);
      return false;
    }
    b localb;
    synchronized (this.rFI)
    {
      localb = (b)this.rFI.get(paramInt1);
      if (localb == null)
      {
        GMTrace.o(12366016151552L, 92134);
        return true;
      }
    }
    for (;;)
    {
      synchronized (localb.gCf)
      {
        if (localb.rFM.size() == 0)
        {
          GMTrace.o(12366016151552L, 92134);
          return true;
        }
        LinkedList localLinkedList = new LinkedList();
        paramInt1 = 0;
        if (paramInt1 < localb.rFM.size())
        {
          a locala = (a)localb.valueAt(paramInt1);
          if ((!bg.nl(locala.appId).equals(paramString1)) || (!bg.nl(locala.eYR).equals(paramString2)) || (!bg.nl(locala.eYS).equals(paramString3)) || (!bg.nl(locala.rFL).equals(paramString4)) || (locala.eYT != paramInt2)) {
            break label327;
          }
          localLinkedList.add(Integer.valueOf(locala.key));
          break label327;
        }
        paramString1 = localLinkedList.iterator();
        if (paramString1.hasNext()) {
          localb.remove(((Integer)paramString1.next()).intValue());
        }
      }
      GMTrace.o(12366016151552L, 92134);
      return true;
      label327:
      paramInt1 += 1;
    }
  }
  
  public final List<c> l(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(12366150369280L, 92135);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (bg.nm(paramString3)) || (bg.nm(paramString4)))
    {
      GMTrace.o(12366150369280L, 92135);
      return null;
    }
    String str = p.Lw(paramString1);
    if (bg.nm(str))
    {
      GMTrace.o(12366150369280L, 92135);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    paramString1 = this.rFI;
    int i = 0;
    for (;;)
    {
      int j;
      try
      {
        if (i < this.rFI.size())
        {
          b localb = (b)this.rFI.valueAt(i);
          if (localb == null) {
            break label288;
          }
          byte[] arrayOfByte = localb.gCf;
          j = 0;
          try
          {
            if (j < localb.rFM.size())
            {
              a locala = (a)localb.valueAt(j);
              if ((!bg.nl(locala.rFL).equals(str)) || (!bg.nl(locala.appId).equals(paramString2)) || (!bg.nl(locala.eYR).equals(paramString3)) || (!bg.nl(locala.eYS).equals(paramString4))) {
                break label279;
              }
              localLinkedList.add(new c(locala.rFK, locala.rFJ));
              break label279;
            }
          }
          finally {}
        }
      }
      finally {}
      GMTrace.o(12366150369280L, 92135);
      return localLinkedList;
      label279:
      j += 1;
      continue;
      label288:
      i += 1;
    }
  }
  
  public final boolean xy(int paramInt)
  {
    GMTrace.i(12365747716096L, 92132);
    b localb;
    synchronized (this.rFI)
    {
      localb = (b)this.rFI.get(paramInt);
      this.rFI.remove(paramInt);
      if (localb == null) {}
    }
    synchronized (localb.gCf)
    {
      localb.rFM.clear();
      GMTrace.o(12365747716096L, 92132);
      return true;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  private static final class a
  {
    public final String appId;
    public final String eYR;
    public final String eYS;
    public final int eYT;
    public final int key;
    public final int rFJ;
    public final int rFK;
    public final String rFL;
  }
  
  private static final class b<T>
  {
    public final byte[] gCf;
    final SparseArray<T> rFM;
    
    public b()
    {
      GMTrace.i(12364539756544L, 92123);
      this.gCf = new byte[0];
      this.rFM = new SparseArray();
      GMTrace.o(12364539756544L, 92123);
    }
    
    public final void remove(int paramInt)
    {
      GMTrace.i(12364808192000L, 92125);
      this.rFM.remove(paramInt);
      GMTrace.o(12364808192000L, 92125);
    }
    
    public final T valueAt(int paramInt)
    {
      GMTrace.i(12364673974272L, 92124);
      Object localObject = this.rFM.valueAt(paramInt);
      GMTrace.o(12364673974272L, 92124);
      return (T)localObject;
    }
  }
  
  public static final class c
  {
    public final int rFJ;
    public final int rFK;
    
    public c(int paramInt1, int paramInt2)
    {
      GMTrace.i(12350446895104L, 92018);
      this.rFK = paramInt1;
      this.rFJ = paramInt2;
      GMTrace.o(12350446895104L, 92018);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */