package com.tencent.d.b.f;

import android.util.SparseArray;
import com.tencent.d.a.c.c;
import com.tencent.d.b.a.b;
import com.tencent.d.b.a.e;

public abstract class d
{
  boolean yaE = false;
  public b yaR;
  
  final void b(final e parame)
  {
    f localf;
    for (;;)
    {
      try
      {
        if (this.yaE)
        {
          c.w("Soter.BaseSoterTask", "soter: warning: already removed the task!", new Object[0]);
          return;
        }
        localf = f.cpS();
        if (this != null)
        {
          ??? = Integer.valueOf(hashCode());
          c.i("Soter.SoterTaskManager", "soter: removing task: %d", new Object[] { ??? });
          if (this != null) {
            break;
          }
          c.e("Soter.SoterTaskManager", "soter: task is null", new Object[0]);
          g.cpU().t(new Runnable()
          {
            public final void run()
            {
              d locald = d.this;
              e locale = parame;
              if ((locald.yaR != null) && (!locald.yaE))
              {
                locald.yaR.a(locale);
                locald.yaE = true;
              }
            }
          });
        }
        else
        {
          ??? = "null";
        }
      }
      finally {}
    }
    for (;;)
    {
      synchronized (localf.ybc)
      {
        if (f.ybb.get(hashCode()) == null) {
          c.i("Soter.SoterTaskManager", "soter: no such task: %d. maybe this task did not pass preExecute", new Object[] { Integer.valueOf(hashCode()) });
        }
      }
      f.ybb.remove(hashCode());
    }
  }
  
  abstract boolean cpQ();
  
  abstract void cpR();
  
  abstract void execute();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\b\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */