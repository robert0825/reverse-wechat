package com.tencent.mm.vending.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public abstract class b<_Struct, _Item>
  extends com.tencent.mm.vending.base.b<_Struct, Cursor>
{
  public Cursor AE;
  protected Map<Integer, _Item> jxc;
  public int mCount;
  public a xwF;
  protected _Item xwG;
  
  public b(_Item param_Item)
  {
    GMTrace.i(248168579072L, 1849);
    this.AE = null;
    this.jxc = null;
    this.xwG = param_Item;
    this.mCount = -1;
    cjU();
    GMTrace.o(248168579072L, 1849);
  }
  
  private Cursor getCursor()
  {
    GMTrace.i(248302796800L, 1850);
    if ((this.AE == null) || (this.AE.isClosed())) {
      Assert.assertNotNull(this.AE);
    }
    Cursor localCursor = this.AE;
    GMTrace.o(248302796800L, 1850);
    return localCursor;
  }
  
  public abstract _Item a(_Item param_Item, Cursor paramCursor);
  
  public final void aJe()
  {
    GMTrace.i(248705449984L, 1853);
    if (this.jxc != null) {
      this.jxc.clear();
    }
    if (this.AE != null) {
      this.AE.close();
    }
    this.mCount = -1;
    GMTrace.o(248705449984L, 1853);
  }
  
  public abstract Cursor bpF();
  
  public final void cjU()
  {
    GMTrace.i(248973885440L, 1855);
    if (this.jxc == null) {
      this.jxc = new HashMap();
    }
    GMTrace.o(248973885440L, 1855);
  }
  
  public final int cjV()
  {
    GMTrace.i(249108103168L, 1856);
    if (this.mCount < 0) {
      this.mCount = getCursor().getCount();
    }
    int i = this.mCount;
    GMTrace.o(249108103168L, 1856);
    return i;
  }
  
  public void destroyAsynchronous()
  {
    GMTrace.i(248571232256L, 1852);
    aJe();
    GMTrace.o(248571232256L, 1852);
  }
  
  public final _Item getItem(int paramInt)
  {
    GMTrace.i(249242320896L, 1857);
    if (this.jxc != null)
    {
      localObject = this.jxc.get(Integer.valueOf(paramInt));
      if (localObject != null)
      {
        GMTrace.o(249242320896L, 1857);
        return (_Item)localObject;
      }
    }
    if ((paramInt < 0) || (!getCursor().moveToPosition(paramInt)))
    {
      GMTrace.o(249242320896L, 1857);
      return null;
    }
    if (this.jxc == null)
    {
      localObject = a(this.xwG, getCursor());
      GMTrace.o(249242320896L, 1857);
      return (_Item)localObject;
    }
    Object localObject = a(null, getCursor());
    this.jxc.put(Integer.valueOf(paramInt), localObject);
    GMTrace.o(249242320896L, 1857);
    return (_Item)localObject;
  }
  
  public static abstract interface a
  {
    public abstract void bnk();
    
    public abstract void bnl();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\vending\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */