package com.tencent.mm.vending.base;

import android.os.Handler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.f.a;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b<_Struct, _Change>
  extends Vending<_Struct, Integer, _Change>
{
  public int mCount;
  public int xxd;
  private a xxe;
  
  public b()
  {
    GMTrace.i(256355860480L, 1910);
    this.xxd = 5;
    this.mCount = 0;
    this.xxe = new a();
    GMTrace.o(256355860480L, 1910);
  }
  
  private void eM(int paramInt1, int paramInt2)
  {
    GMTrace.i(257161166848L, 1916);
    int i;
    int j;
    if (paramInt1 >= paramInt2)
    {
      i = 1;
      j = Math.min(paramInt1, paramInt2);
      paramInt1 = Math.max(paramInt1, paramInt2);
    }
    for (;;)
    {
      int k;
      synchronized (this.xxe)
      {
        Object localObject1 = this.xxe;
        if (!((a)localObject1).fUo)
        {
          ((a)localObject1).set(j, paramInt1);
          ((a)localObject1).fUo = true;
          localObject1 = new int[] { j, paramInt1 };
          if (localObject1 != null) {
            break label274;
          }
          GMTrace.o(257161166848L, 1916);
          return;
          i = 0;
          break;
        }
        paramInt2 = ((a)localObject1).Vu;
        k = ((a)localObject1).Vv;
        if (paramInt2 > paramInt1) {
          break label503;
        }
        if (k < j)
        {
          break label503;
          ((a)localObject1).set(j, paramInt1);
          localObject1 = new int[] { j, paramInt1 };
          continue;
        }
        if (j < paramInt2)
        {
          if (paramInt1 > k)
          {
            ((a)localObject1).set(j, paramInt1);
            localObject1 = new int[] { j, paramInt2 - 1, k + 1, paramInt1 };
            continue;
          }
          ((a)localObject1).set(j, k);
          localObject1 = new int[] { j, paramInt2 - 1 };
          continue;
        }
        if (paramInt1 <= k) {
          break label522;
        }
        ((a)localObject1).set(paramInt2, paramInt1);
        localObject1 = new int[] { k + 1, paramInt1 };
      }
      label274:
      if (i != 0) {
        paramInt1 = localObject2.length - 2;
      }
      for (;;)
      {
        label292:
        label318:
        label334:
        Vending.f localf;
        Integer localInteger;
        if (i != 0)
        {
          if (paramInt1 < 0) {
            break label418;
          }
          k = localObject2[paramInt1];
          int m = localObject2[(paramInt1 + 1)];
          int n = Math.abs(k - m);
          paramInt2 = 0;
          if (paramInt2 > n) {
            break label485;
          }
          if (i == 0) {
            break label428;
          }
          j = m - paramInt2;
          localf = getLoader();
          localInteger = Integer.valueOf(j);
          if (localf.hKZ.get()) {}
        }
        synchronized (localf.xxk)
        {
          Vending.f.b localb = (Vending.f.b)localf.xxi.get(localInteger);
          if ((localb != null) && (localb != Vending.f.b.xxm))
          {
            paramInt2 += 1;
            break label318;
            paramInt1 = 0;
            continue;
            if (paramInt1 < localObject2.length) {
              break label292;
            }
            label418:
            GMTrace.o(257161166848L, 1916);
            return;
            label428:
            j = k + paramInt2;
            break label334;
          }
          localf.xxi.put(localInteger, Vending.f.b.xxn);
          localf.mVendingHandler.sendMessage(localf.mVendingHandler.obtainMessage(0, localInteger));
        }
        label485:
        if (i != 0) {
          paramInt1 -= 2;
        } else {
          paramInt1 += 2;
        }
      }
      label503:
      if (paramInt2 <= paramInt1 + 1) {
        if (k < j - 1)
        {
          continue;
          label522:
          Object localObject4 = null;
        }
      }
    }
  }
  
  public final void EA(int paramInt)
  {
    GMTrace.i(256624295936L, 1912);
    if (this.mCount == 0)
    {
      a.e("Vending.ForwardVending", "the count is 0, why call null?", new Object[0]);
      GMTrace.o(256624295936L, 1912);
      return;
    }
    super.request(Integer.valueOf(paramInt));
    GMTrace.o(256624295936L, 1912);
  }
  
  public abstract int cjV();
  
  public final <T> T get(int paramInt)
  {
    GMTrace.i(256490078208L, 1911);
    if (this.mCount == 0)
    {
      a.e("Vending.ForwardVending", "mCount is 0, why call get()?", new Object[0]);
      GMTrace.o(256490078208L, 1911);
      return null;
    }
    Object localObject = super.get(Integer.valueOf(paramInt));
    GMTrace.o(256490078208L, 1911);
    return (T)localObject;
  }
  
  protected void loaderClear()
  {
    GMTrace.i(257295384576L, 1917);
    synchronized (this.xxe)
    {
      a locala2 = this.xxe;
      locala2.Vu = -1;
      locala2.Vv = -1;
      locala2.fUo = false;
      GMTrace.o(257295384576L, 1917);
      return;
    }
  }
  
  protected void synchronizing(int paramInt, Object paramObject)
  {
    GMTrace.i(257026949120L, 1915);
    this.mCount = cjV();
    a.i("Vending.ForwardVending", "the count %s", new Object[] { Integer.valueOf(this.mCount) });
    GMTrace.o(257026949120L, 1915);
  }
  
  public abstract _Struct vz(int paramInt);
  
  private static final class a
  {
    public int Vu;
    public int Vv;
    boolean fUo;
    
    public a()
    {
      GMTrace.i(255953207296L, 1907);
      this.Vu = -1;
      this.Vv = -1;
      this.fUo = false;
      GMTrace.o(255953207296L, 1907);
    }
    
    final void set(int paramInt1, int paramInt2)
    {
      GMTrace.i(256087425024L, 1908);
      this.Vu = paramInt1;
      this.Vv = paramInt2;
      GMTrace.o(256087425024L, 1908);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\vending\base\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */