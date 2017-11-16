package com.tencent.d.b.f;

import android.util.SparseArray;
import com.tencent.d.a.c.c;
import com.tencent.d.b.a.e;

public class f
{
  private static volatile f yba = null;
  public static volatile SparseArray<d> ybb = null;
  public final Object ybc = new Object();
  
  private f()
  {
    ybb = new SparseArray(5);
  }
  
  public static f cpS()
  {
    if (yba == null) {
      try
      {
        if (yba == null) {
          yba = new f();
        }
        f localf = yba;
        return localf;
      }
      finally {}
    }
    return yba;
  }
  
  public final boolean a(final d paramd, e parame)
  {
    int j;
    Object localObject;
    int i;
    if (!paramd.cpQ())
    {
      j = paramd.hashCode();
      localObject = this.ybc;
      i = 0;
    }
    for (;;)
    {
      try
      {
        if (i < ybb.size())
        {
          int k = ybb.keyAt(i);
          if (!((d)ybb.get(k)).getClass().getName().equals(paramd.getClass().getName())) {
            break label154;
          }
          c.w("Soter.SoterTaskManager", "soter: already such type of task. abandon add task", new Object[0]);
          parame.errCode = 26;
          parame.eAR = "add SOTER task to queue failed. check the logcat for further information";
          paramd.b(parame);
          return false;
        }
        ybb.put(j, paramd);
        g.cpU().v(new Runnable()
        {
          public final void run()
          {
            paramd.execute();
          }
        });
        return true;
      }
      finally {}
      c.d("Soter.SoterTaskManager", "soter: prepare eat execute.", new Object[0]);
      return false;
      label154:
      i += 1;
    }
  }
  
  public final void cpT()
  {
    int i = 0;
    synchronized (this.ybc)
    {
      c.i("Soter.SoterTaskManager", "soter: request cancel all", new Object[0]);
      if (ybb.size() != 0) {
        while (i < ybb.size())
        {
          final int j = ybb.keyAt(i);
          g.cpU().v(new Runnable()
          {
            public final void run()
            {
              d locald = (d)f.ybb.get(j);
              if (locald != null) {
                locald.cpR();
              }
            }
          });
          i += 1;
        }
      }
      ybb.clear();
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\b\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */