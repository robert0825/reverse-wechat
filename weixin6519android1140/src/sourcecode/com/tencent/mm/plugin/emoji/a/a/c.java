package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.d;
import com.tencent.mm.plugin.emoji.model.e;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.storage.ak;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c
  implements Cloneable, Iterable<f>
{
  HashMap<String, ak> khv;
  protected HashMap<String, ak> khw;
  public boolean khx;
  protected ArrayList<f> mItemList;
  
  public c()
  {
    GMTrace.i(11346364071936L, 84537);
    this.khv = new HashMap();
    this.khw = new HashMap();
    this.khx = q.zQ();
    GMTrace.o(11346364071936L, 84537);
  }
  
  public c(e parame) {}
  
  public c(List<f> paramList)
  {
    this();
    GMTrace.i(11346498289664L, 84538);
    if (paramList == null)
    {
      GMTrace.o(11346498289664L, 84538);
      return;
    }
    this.mItemList = new ArrayList();
    this.mItemList.addAll(paramList);
    GMTrace.o(11346498289664L, 84538);
  }
  
  public final c aqo()
  {
    GMTrace.i(11347035160576L, 84542);
    for (;;)
    {
      c localc3;
      try
      {
        localc3 = (c)super.clone();
        localc1 = localc3;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException1)
      {
        c localc1;
        Object localObject = null;
        continue;
      }
      try
      {
        if (this.mItemList != null)
        {
          localc3.mItemList = ((ArrayList)this.mItemList.clone());
          localc1 = localc3;
        }
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2)
      {
        c localc2 = localc3;
      }
    }
    GMTrace.o(11347035160576L, 84542);
    return localc1;
  }
  
  public void aqp()
  {
    GMTrace.i(11347974684672L, 84549);
    if (this.mItemList == null)
    {
      GMTrace.o(11347974684672L, 84549);
      return;
    }
    if (h.arn().kkm == null)
    {
      GMTrace.o(11347974684672L, 84549);
      return;
    }
    Iterator localIterator = this.mItemList.iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      Object localObject2 = localf.khA;
      if (localObject2 != null)
      {
        Object localObject1 = h.arn();
        localObject2 = ((rh)localObject2).tRS;
        localObject1 = (Integer)((d)localObject1).kkm.get(localObject2);
        if (localObject1 == null) {}
        for (int i = -1;; i = ((Integer)localObject1).intValue())
        {
          if (i >= 0)
          {
            localf.dB(6);
            localf.rr = i;
          }
          if ((i >= 0) || (localf.mStatus != 6)) {
            break;
          }
          localf.dB(3);
          break;
        }
      }
    }
    GMTrace.o(11347974684672L, 84549);
  }
  
  public void clear()
  {
    GMTrace.i(11346095636480L, 84535);
    if (this.mItemList != null)
    {
      this.mItemList.clear();
      this.mItemList = null;
    }
    if (this.khv != null)
    {
      this.khv.clear();
      this.khv = null;
    }
    if (this.khw != null)
    {
      this.khw.clear();
      this.khw = null;
    }
    GMTrace.o(11346095636480L, 84535);
  }
  
  public Iterator<f> iterator()
  {
    GMTrace.i(11347840466944L, 84548);
    a locala = new a();
    GMTrace.o(11347840466944L, 84548);
    return locala;
  }
  
  public final f mF(int paramInt)
  {
    GMTrace.i(11346766725120L, 84540);
    if ((this.mItemList == null) || (this.mItemList.size() <= paramInt) || (paramInt < 0))
    {
      GMTrace.o(11346766725120L, 84540);
      return null;
    }
    if (this.mItemList == null)
    {
      GMTrace.o(11346766725120L, 84540);
      return null;
    }
    f localf = (f)this.mItemList.get(paramInt);
    GMTrace.o(11346766725120L, 84540);
    return localf;
  }
  
  public void notifyDataSetChanged()
  {
    GMTrace.i(11347169378304L, 84543);
    if (this.mItemList == null)
    {
      GMTrace.o(11347169378304L, 84543);
      return;
    }
    this.khw = h.arl().kjz.bUB();
    Iterator localIterator = this.mItemList.iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      Object localObject = localf.khA;
      if (localObject != null)
      {
        if (com.tencent.mm.plugin.emoji.h.a.d((rh)localObject))
        {
          if (com.tencent.mm.plugin.emoji.h.a.asF()) {}
          for (int i = 7;; i = 3)
          {
            localf.dB(i);
            break;
          }
        }
        localObject = ((rh)localObject).tRS;
        localf.a(this.khx, vL((String)localObject), vJ((String)localObject));
      }
    }
    aqp();
    GMTrace.o(11347169378304L, 84543);
  }
  
  public final int size()
  {
    GMTrace.i(11346632507392L, 84539);
    if (this.mItemList == null)
    {
      GMTrace.o(11346632507392L, 84539);
      return 0;
    }
    int i = this.mItemList.size();
    GMTrace.o(11346632507392L, 84539);
    return i;
  }
  
  public final f vH(String paramString)
  {
    GMTrace.i(11346900942848L, 84541);
    if (this.mItemList != null)
    {
      Iterator localIterator = this.mItemList.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        rh localrh = localf.khA;
        if ((localrh != null) && (localrh.tRS != null) && (localrh.tRS.equals(paramString)))
        {
          GMTrace.o(11346900942848L, 84541);
          return localf;
        }
      }
    }
    GMTrace.o(11346900942848L, 84541);
    return null;
  }
  
  public final void vI(String paramString)
  {
    GMTrace.i(11347303596032L, 84544);
    f localf = vH(paramString);
    if (localf == null)
    {
      GMTrace.o(11347303596032L, 84544);
      return;
    }
    localf.dB(-1);
    localf.a(this.khx, vL(paramString), vJ(paramString));
    GMTrace.o(11347303596032L, 84544);
  }
  
  public final boolean vJ(String paramString)
  {
    GMTrace.i(11347437813760L, 84545);
    if (this.khw == null)
    {
      GMTrace.o(11347437813760L, 84545);
      return false;
    }
    boolean bool = this.khw.containsKey(paramString);
    GMTrace.o(11347437813760L, 84545);
    return bool;
  }
  
  public final ak vK(String paramString)
  {
    GMTrace.i(11347572031488L, 84546);
    ak localak2 = vL(paramString);
    ak localak1 = localak2;
    if (localak2 == null)
    {
      localak1 = new ak(paramString);
      this.khv.put(paramString, localak1);
    }
    GMTrace.o(11347572031488L, 84546);
    return localak1;
  }
  
  public final ak vL(String paramString)
  {
    GMTrace.i(11347706249216L, 84547);
    paramString = (ak)this.khv.get(paramString);
    GMTrace.o(11347706249216L, 84547);
    return paramString;
  }
  
  private final class a
    implements Iterator<f>
  {
    private int mIndex;
    
    public a()
    {
      GMTrace.i(11354417135616L, 84597);
      this.mIndex = 0;
      GMTrace.o(11354417135616L, 84597);
    }
    
    public final boolean hasNext()
    {
      GMTrace.i(11354551353344L, 84598);
      if (this.mIndex < c.this.size())
      {
        GMTrace.o(11354551353344L, 84598);
        return true;
      }
      GMTrace.o(11354551353344L, 84598);
      return false;
    }
    
    public final void remove()
    {
      GMTrace.i(11354685571072L, 84599);
      GMTrace.o(11354685571072L, 84599);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */