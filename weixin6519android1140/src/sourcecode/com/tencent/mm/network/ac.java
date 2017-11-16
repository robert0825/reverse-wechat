package com.tencent.mm.network;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class ac
  extends i.a
{
  private aj gsj;
  private int hhM;
  private long hhN;
  private int hhO;
  private final RemoteCallbackList<n> hhP;
  
  public ac()
  {
    GMTrace.i(13705374859264L, 102113);
    this.hhM = 4;
    this.hhO = 0;
    this.hhP = new RemoteCallbackList();
    this.gsj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(13702153633792L, 102089);
        int i = ac.b(ac.this).beginBroadcast();
        w.i("MicroMsg.NetworkEvent", "listeners ct : %d", new Object[] { Integer.valueOf(i) });
        i -= 1;
        for (;;)
        {
          if (i >= 0)
          {
            n localn = (n)ac.b(ac.this).getBroadcastItem(i);
            try
            {
              localn.db(ac.c(ac.this));
              i -= 1;
            }
            catch (RemoteException localRemoteException)
            {
              for (;;)
              {
                w.e("MicroMsg.NetworkEvent", "exception:%s", new Object[] { bg.f(localRemoteException) });
              }
            }
          }
        }
        ac.b(ac.this).finishBroadcast();
        GMTrace.o(13702153633792L, 102089);
        return false;
      }
    }, false);
    GMTrace.o(13705374859264L, 102113);
  }
  
  public final int OC()
  {
    GMTrace.i(13705509076992L, 102114);
    if (0L > bg.aG(this.hhN)) {}
    for (int i = 5;; i = this.hhM)
    {
      w.i("MicroMsg.NetworkEvent", "getNowStatus = %d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(13705509076992L, 102114);
      return i;
    }
  }
  
  public final void OD()
  {
    GMTrace.i(13705911730176L, 102117);
    this.hhP.kill();
    GMTrace.o(13705911730176L, 102117);
  }
  
  public final long OE()
  {
    GMTrace.i(13706180165632L, 102119);
    long l = this.hhN;
    GMTrace.o(13706180165632L, 102119);
    return l;
  }
  
  public final boolean c(n paramn)
  {
    GMTrace.i(13705643294720L, 102115);
    try
    {
      this.hhP.register(paramn);
      GMTrace.o(13705643294720L, 102115);
      return true;
    }
    catch (Exception paramn)
    {
      for (;;)
      {
        w.e("MicroMsg.NetworkEvent", "addListener %s", new Object[] { paramn });
        w.e("MicroMsg.NetworkEvent", "exception:%s", new Object[] { bg.f(paramn) });
      }
    }
  }
  
  public final boolean d(n paramn)
  {
    boolean bool1 = false;
    GMTrace.i(13705777512448L, 102116);
    try
    {
      boolean bool2 = this.hhP.unregister(paramn);
      bool1 = bool2;
    }
    catch (Exception paramn)
    {
      for (;;)
      {
        w.e("MicroMsg.NetworkEvent", "removeListener %s", new Object[] { paramn });
        w.e("MicroMsg.NetworkEvent", "exception:%s", new Object[] { bg.f(paramn) });
      }
    }
    GMTrace.o(13705777512448L, 102116);
    return bool1;
  }
  
  public final void hy(int paramInt)
  {
    int j = 0;
    GMTrace.i(13706045947904L, 102118);
    w.i("MicroMsg.NetworkEvent", "networkChange : %d", new Object[] { Integer.valueOf(paramInt) });
    int i;
    if (paramInt == this.hhM) {
      i = j;
    }
    while (i == 0)
    {
      GMTrace.o(13706045947904L, 102118);
      return;
      if (3 == paramInt)
      {
        i = j;
        if (this.hhM == 2)
        {
          this.hhM = paramInt;
          i = 1;
        }
      }
      else
      {
        if (2 == paramInt)
        {
          i = j;
          if (this.hhM == 0) {
            continue;
          }
          i = j;
          if (this.hhM == 1) {
            continue;
          }
          this.hhO += 1;
          if (this.hhO > 0)
          {
            this.hhM = 2;
            i = 1;
          }
        }
        else if (4 == paramInt)
        {
          this.hhO = 0;
          this.hhM = 4;
          i = 1;
          continue;
        }
        this.hhM = paramInt;
        i = 1;
      }
    }
    if ((paramInt != 0) && (paramInt != 6))
    {
      GMTrace.o(13706045947904L, 102118);
      return;
    }
    this.gsj.z(1000L, 1000L);
    GMTrace.o(13706045947904L, 102118);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */