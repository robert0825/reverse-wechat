package com.tencent.mm.plugin.profile.ui;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class a
  extends o
  implements j
{
  ae handler;
  x iBi;
  private List<i> lzI;
  
  public a(l paraml, int paramInt, x paramx)
  {
    super(paraml, new ArrayList(), true, false, paramInt);
    GMTrace.i(6722697560064L, 50088);
    this.handler = new ae(Looper.getMainLooper());
    this.iBi = paramx;
    GMTrace.o(6722697560064L, 50088);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(18473996517376L, 137642);
    if (paramg.aGY == 0) {
      this.lzI = paramg.lxb;
    }
    notifyDataSetChanged();
    GMTrace.o(18473996517376L, 137642);
  }
  
  public final int getCount()
  {
    GMTrace.i(6722965995520L, 50090);
    if (this.lzI == null)
    {
      GMTrace.o(6722965995520L, 50090);
      return 0;
    }
    int i = this.lzI.size();
    GMTrace.o(6722965995520L, 50090);
    return i;
  }
  
  protected final com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(6722831777792L, 50089);
    e locale = new e(paramInt);
    at.AR();
    locale.iBi = c.yK().TE(((i)this.lzI.get(paramInt)).lwH);
    GMTrace.o(6722831777792L, 50089);
    return locale;
  }
  
  private final class a
    implements Comparator<i>
  {
    public a()
    {
      GMTrace.i(16180215545856L, 120552);
      GMTrace.o(16180215545856L, 120552);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */