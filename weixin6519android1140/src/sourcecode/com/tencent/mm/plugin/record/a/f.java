package com.tencent.mm.plugin.record.a;

import android.os.SystemClock;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class f<T extends a>
{
  private boolean ogV;
  public final int ogW;
  private final int ogX;
  private SparseArray<f<T>.b> ogY;
  private LinkedList<T> ogZ;
  private long oha;
  
  public f()
  {
    GMTrace.i(7515521679360L, 55995);
    this.ogV = false;
    this.ogY = new SparseArray();
    this.ogZ = new LinkedList();
    this.oha = 0L;
    this.ogW = 3;
    this.ogX = 300000;
    GMTrace.o(7515521679360L, 55995);
  }
  
  protected abstract void a(T paramT);
  
  public final void baF()
  {
    GMTrace.i(16040629108736L, 119512);
    if ((this.ogV) && (System.currentTimeMillis() - this.oha < 60000L))
    {
      w.d("MicroMsg.RecordMsgBaseService", "is working, return");
      GMTrace.o(16040629108736L, 119512);
      return;
    }
    this.oha = System.currentTimeMillis();
    if (this.ogZ.isEmpty())
    {
      localObject1 = baG().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (a)((Iterator)localObject1).next();
        localObject3 = (b)this.ogY.get(((a)localObject2).baI());
        if (localObject3 != null)
        {
          if ((((b)localObject3).hji < 0) && (SystemClock.elapsedRealtime() - ((b)localObject3).ohc < this.ogX)) {
            continue;
          }
          if (((b)localObject3).hji < 0) {
            ((b)localObject3).hji = this.ogW;
          }
        }
        for (;;)
        {
          w.d("MicroMsg.RecordMsgBaseService", "do add job from db, localId %d", new Object[] { Integer.valueOf(((a)localObject2).baI()) });
          if (this.ogZ.contains(localObject2)) {
            break;
          }
          this.ogZ.add(localObject2);
          break;
          localObject3 = new b();
          this.ogY.put(((a)localObject2).baI(), localObject3);
        }
      }
      w.i("MicroMsg.RecordMsgBaseService", "jobs list size is 0, new jobs list size[%d]", new Object[] { Integer.valueOf(this.ogZ.size()) });
    }
    if (this.ogZ.isEmpty())
    {
      w.i("MicroMsg.RecordMsgBaseService", "try to do job, but job list size is empty, return");
      finish();
      GMTrace.o(16040629108736L, 119512);
      return;
    }
    Object localObject3 = (a)this.ogZ.removeFirst();
    Object localObject2 = (b)this.ogY.get(((a)localObject3).baI());
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new b();
      this.ogY.put(((a)localObject3).baI(), localObject1);
    }
    ((b)localObject1).hji -= 1;
    if (((b)localObject1).hji < 0) {
      if (this.ogX <= SystemClock.elapsedRealtime() - ((b)localObject1).ohc) {}
    }
    for (int i = 0; i != 0; i = 1)
    {
      a((a)localObject3);
      this.ogV = true;
      GMTrace.o(16040629108736L, 119512);
      return;
      ((b)localObject1).hji = (this.ogW - 1);
      ((b)localObject1).ohc = SystemClock.elapsedRealtime();
    }
    run();
    GMTrace.o(16040629108736L, 119512);
  }
  
  protected abstract List<T> baG();
  
  protected final void baH()
  {
    GMTrace.i(7516058550272L, 55999);
    this.ogV = false;
    run();
    GMTrace.o(7516058550272L, 55999);
  }
  
  final void finish()
  {
    GMTrace.i(7516192768000L, 56000);
    this.ogZ.clear();
    this.ogY.clear();
    this.ogV = false;
    GMTrace.o(7516192768000L, 56000);
  }
  
  public final void run()
  {
    GMTrace.i(7515655897088L, 55996);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7512032018432L, 55969);
        f.this.baF();
        GMTrace.o(7512032018432L, 55969);
      }
      
      public final String toString()
      {
        GMTrace.i(7512166236160L, 55970);
        String str = super.toString() + "|tryDoJob";
        GMTrace.o(7512166236160L, 55970);
        return str;
      }
    });
    GMTrace.o(7515655897088L, 55996);
  }
  
  public static abstract interface a
  {
    public abstract int baI();
  }
  
  private final class b
  {
    int hji;
    long ohc;
    
    public b()
    {
      GMTrace.i(7514716372992L, 55989);
      this.ohc = SystemClock.elapsedRealtime();
      this.hji = f.this.ogW;
      GMTrace.o(7514716372992L, 55989);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */