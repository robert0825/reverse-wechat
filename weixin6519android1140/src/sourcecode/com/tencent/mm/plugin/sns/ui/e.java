package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class e<T>
{
  private com.tencent.mm.sdk.platformtools.ae handler;
  List<Integer> pNQ;
  
  public e()
  {
    GMTrace.i(8586176495616L, 63972);
    this.handler = null;
    this.pNQ = new LinkedList();
    this.handler = com.tencent.mm.plugin.sns.model.ae.aDa();
    this.pNQ.clear();
    GMTrace.o(8586176495616L, 63972);
  }
  
  public final void bB(final List<T> paramList)
  {
    GMTrace.i(16046266253312L, 119554);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8565238530048L, 63816);
        e.this.bC(paramList);
        e locale = e.this;
        boolean bool = this.pNU;
        com.tencent.mm.plugin.sns.model.ae.biN().post(new e.3(locale, bool));
        GMTrace.o(8565238530048L, 63816);
      }
    });
    GMTrace.o(16046266253312L, 119554);
  }
  
  public abstract void bC(List<T> paramList);
  
  public abstract List<T> bmC();
  
  protected final void fL(final boolean paramBoolean)
  {
    GMTrace.i(8586310713344L, 63973);
    int i;
    if (paramBoolean)
    {
      i = 0;
      if (i == 1)
      {
        Iterator localIterator = this.pNQ.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (((Integer)localIterator.next()).intValue() != 1);
      }
    }
    else
    {
      for (int j = 1;; j = 0)
      {
        if (j == 0) {
          break label89;
        }
        w.e("MicroMsg.AdapterLoader", "thread is loading ui should be not load any");
        GMTrace.o(8586310713344L, 63973);
        return;
        i = 1;
        break;
      }
    }
    label89:
    if (!paramBoolean) {
      w.d("MicroMsg.AdapterLoader", "ui load");
    }
    while (this.pNQ.size() > 1)
    {
      GMTrace.o(8586310713344L, 63973);
      return;
      w.d("MicroMsg.AdapterLoader", "thread load" + this.pNQ.size());
    }
    this.pNQ.add(Integer.valueOf(i));
    if (paramBoolean)
    {
      com.tencent.mm.plugin.sns.model.ae.biN().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8688047751168L, 64731);
          List localList = e.this.bmC();
          e.this.bB(localList);
          GMTrace.o(8688047751168L, 64731);
        }
      });
      GMTrace.o(8586310713344L, 63973);
      return;
    }
    bB(bmC());
    GMTrace.o(8586310713344L, 63973);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */