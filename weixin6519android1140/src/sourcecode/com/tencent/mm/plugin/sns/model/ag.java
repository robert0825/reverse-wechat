package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class ag
  implements com.tencent.mm.plugin.sns.storage.g
{
  public HashMap<String, k> pvm;
  
  public ag()
  {
    GMTrace.i(8060311437312L, 60054);
    this.pvm = new HashMap();
    GMTrace.o(8060311437312L, 60054);
  }
  
  public final k Ht(String paramString)
  {
    GMTrace.i(8060445655040L, 60055);
    paramString = (k)this.pvm.get(paramString);
    GMTrace.o(8060445655040L, 60055);
    return paramString;
  }
  
  public final boolean a(final k paramk)
  {
    GMTrace.i(8060848308224L, 60058);
    if ((paramk == null) || (bg.nm(paramk.field_userName)))
    {
      GMTrace.o(8060848308224L, 60058);
      return false;
    }
    ae.biN().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8090376208384L, 60278);
        ag.this.pvm.put(paramk.field_userName, paramk);
        GMTrace.o(8090376208384L, 60278);
      }
    });
    GMTrace.o(8060848308224L, 60058);
    return true;
  }
  
  public final boolean bju()
  {
    GMTrace.i(8060579872768L, 60056);
    ae.biN().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8127957172224L, 60558);
        if (ag.this.pvm.size() > 50) {
          ag.this.uu(10);
        }
        GMTrace.o(8127957172224L, 60558);
      }
    });
    GMTrace.o(8060579872768L, 60056);
    return true;
  }
  
  public final boolean bjv()
  {
    GMTrace.i(8060714090496L, 60057);
    ae.biN().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8091718385664L, 60288);
        ag.this.uu(ag.this.pvm.size());
        GMTrace.o(8091718385664L, 60288);
      }
    });
    GMTrace.o(8060714090496L, 60057);
    return true;
  }
  
  public final void uu(int paramInt)
  {
    GMTrace.i(16041300197376L, 119517);
    if ((this.pvm == null) || (this.pvm.size() == 0))
    {
      w.i("MicroMsg.SnsExtCache", "nothing need to pushto snsext");
      GMTrace.o(16041300197376L, 119517);
      return;
    }
    long l2 = System.currentTimeMillis();
    long l1;
    int i;
    if (ae.yH() != null)
    {
      l1 = ae.yH().cE(Thread.currentThread().getId());
      i = 1;
    }
    for (;;)
    {
      w.d("MicroMsg.SnsExtCache", "writeNums " + paramInt + " " + l1);
      Object localObject1 = new LinkedList();
      Object localObject2 = this.pvm.keySet().iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        ((LinkedList)localObject1).add((String)((Iterator)localObject2).next());
      } while (((LinkedList)localObject1).size() < paramInt);
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if ((this.pvm.containsKey(localObject2)) && (!ae.biM()))
        {
          ae.bjh().b((k)this.pvm.get(localObject2));
          this.pvm.remove(localObject2);
        }
      }
      if (i != 0) {
        ae.yH().aL(l1);
      }
      w.d("MicroMsg.SnsExtCache", "wirtes times : " + (System.currentTimeMillis() - l2));
      GMTrace.o(16041300197376L, 119517);
      return;
      i = 0;
      l1 = 0L;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */