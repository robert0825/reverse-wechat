package com.tencent.pb.common.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.tencent.pb.common.c.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import junit.framework.Assert;

public final class e
  implements b
{
  private static e xKA = null;
  public Vector<d> guu = new Vector();
  public Vector<d> guv = new Vector();
  private final Handler handler = new Handler(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      e.this.a((d)paramAnonymousMessage.obj);
    }
  };
  public final SparseArray<Set<b>> xKB = new SparseArray();
  private d xKC = null;
  
  private void DR()
  {
    if (this.guv.size() > 0)
    {
      d locald = (d)this.guv.get(0);
      int i = 1;
      while (i < this.guv.size())
      {
        this.guv.get(i);
        i += 1;
      }
      if (cmD())
      {
        this.guv.remove(locald);
        a(locald, 0);
      }
    }
  }
  
  private void a(final d paramd, int paramInt)
  {
    if (cmD())
    {
      this.guu.add(paramd);
      if (paramd.xKt == null)
      {
        c.k("MicroMsg.Voip", new Object[] { paramd.xKr, "dosene reqData is null cmd=" + paramd.xKv });
        paramInt = -1;
        if (paramInt < 0)
        {
          c.k("MicroMsg.Voip", new Object[] { "doSceneImp do scene failed, ret %d,", Integer.valueOf(paramInt) });
          this.handler.post(new Runnable()
          {
            public final void run()
            {
              e.this.guu.remove(paramd);
              e.this.a(2, -1, "doScene failed", paramd);
            }
          });
        }
      }
    }
    for (;;)
    {
      DR();
      return;
      paramd.xKs = this;
      i locali = new i(paramd);
      paramInt = f.cmF().a(null, locali, paramd.xKv, paramd.cmB(), paramd.xKt, paramd.xKw);
      if (paramInt >= 0) {
        paramd.mHandler.postDelayed(paramd.guP, 60000L);
      }
      c.d("MicroMsg.Voip", new Object[] { "NETTASK_SEND dosene:cmd ", paramd.cmB(), Integer.valueOf(paramInt) });
      break;
      this.guv.add(paramd);
    }
  }
  
  public static e cmC()
  {
    if (xKA == null) {}
    try
    {
      if (xKA == null) {
        xKA = new e();
      }
      return xKA;
    }
    finally {}
  }
  
  private boolean cmD()
  {
    return this.guu.size() < 20;
  }
  
  public final void a(final int paramInt1, final int paramInt2, final String paramString, final d paramd)
  {
    this.guu.remove(paramd);
    DR();
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        Set localSet = (Set)e.this.xKB.get(paramd.getType());
        if ((localSet != null) && (localSet.size() > 0))
        {
          Object localObject = new HashSet();
          ((Set)localObject).addAll(localSet);
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            b localb = (b)((Iterator)localObject).next();
            if ((localb != null) && (localSet.contains(localb))) {
              localb.a(paramInt1, paramInt2, paramString, paramd);
            }
          }
        }
      }
    });
  }
  
  public final void a(int paramInt, b paramb)
  {
    if (this.xKB.get(paramInt) == null) {
      this.xKB.put(paramInt, new HashSet());
    }
    if (!((Set)this.xKB.get(paramInt)).contains(paramb)) {
      ((Set)this.xKB.get(paramInt)).add(paramb);
    }
  }
  
  public final boolean a(d paramd)
  {
    if (!h.isNetworkConnected())
    {
      int i = paramd.getType();
      if ((i == 102) || (i == 104) || (i == 103))
      {
        c.k("MicroMsg.Voip", new Object[] { "doScene do retain mReissueNetScene" });
        this.xKC = paramd;
      }
    }
    Assert.assertTrue(true);
    if (paramd == null) {
      return false;
    }
    a(paramd, 0);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\pb\common\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */