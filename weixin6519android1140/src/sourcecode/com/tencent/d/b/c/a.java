package com.tencent.d.b.c;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.util.SparseArray;
import com.tencent.d.a.c.c;
import com.tencent.d.b.f.f;
import com.tencent.d.b.f.f.3;
import com.tencent.d.b.f.g;
import junit.framework.Assert;

public final class a
{
  public CancellationSignal yav = null;
  
  public a()
  {
    if (Build.VERSION.SDK_INT >= 16) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      cpM();
      return;
    }
  }
  
  public static void cpL()
  {
    int i = 0;
    f localf = f.cpS();
    synchronized (localf.ybc)
    {
      c.i("Soter.SoterTaskManager", "soter: request publish cancellation", new Object[0]);
      if (f.ybb.size() != 0) {
        while (i < f.ybb.size())
        {
          int j = f.ybb.keyAt(i);
          g.cpU().v(new f.3(localf, j));
          i += 1;
        }
      }
      return;
    }
  }
  
  @SuppressLint({"NewApi"})
  public final void cpM()
  {
    this.yav = new CancellationSignal();
  }
  
  @SuppressLint({"NewApi"})
  public final boolean nc(final boolean paramBoolean)
  {
    c.v("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!this.yav.isCanceled())
    {
      if (Build.VERSION.SDK_INT < 23)
      {
        g.cpU().v(new Runnable()
        {
          public final void run()
          {
            c.v("Soter.SoterFingerprintCanceller", "soter: enter worker thread. perform cancel", new Object[0]);
            a.this.yav.cancel();
            if (paramBoolean) {
              a.cpL();
            }
          }
        });
        return true;
      }
      g.cpU().v(new Runnable()
      {
        public final void run()
        {
          a.this.yav.cancel();
        }
      });
      g.cpU().k(new Runnable()
      {
        public final void run()
        {
          c.w("Soter.SoterFingerprintCanceller", "hy: waiting for %s ms not callback to system callback. cancel manually", new Object[] { Long.valueOf(350L) });
          a.cpL();
        }
      }, 350L);
      return true;
    }
    c.i("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new Object[0]);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\b\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */