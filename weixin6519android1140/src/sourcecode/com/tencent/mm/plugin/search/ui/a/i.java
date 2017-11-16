package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.q;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;

public final class i
  extends f
{
  public String oEA;
  private a oEB;
  public q oEz;
  
  public i(int paramInt)
  {
    super(paramInt);
    GMTrace.i(16470528491520L, 122715);
    this.oEB = new a();
    GMTrace.o(16470528491520L, 122715);
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a.b Vu()
  {
    GMTrace.i(16470662709248L, 122716);
    a locala = this.oEB;
    GMTrace.o(16470662709248L, 122716);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16470796926976L, 122717);
    super.a(paramContext, parama, paramVarArgs);
    at.AR();
    paramContext = c.yK().TE(this.hWl.eDs);
    if (paramContext == null)
    {
      this.oEA = r.fs(this.hWl.lwH);
      GMTrace.o(16470796926976L, 122717);
      return;
    }
    if (bg.nm(paramContext.field_conRemark))
    {
      if (this.oEz != null)
      {
        paramContext = this.oEz.fs(this.hWl.eDs);
        if (!bg.nm(paramContext))
        {
          this.oEA = paramContext;
          GMTrace.o(16470796926976L, 122717);
          return;
        }
        this.oEA = r.fr(this.hWl.eDs);
        GMTrace.o(16470796926976L, 122717);
        return;
      }
      this.oEA = r.fr(this.hWl.eDs);
      GMTrace.o(16470796926976L, 122717);
      return;
    }
    this.oEA = paramContext.field_conRemark;
    GMTrace.o(16470796926976L, 122717);
  }
  
  public final class a
    extends f.b
  {
    public a()
    {
      super();
      GMTrace.i(16473749716992L, 122739);
      GMTrace.o(16473749716992L, 122739);
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(16473883934720L, 122740);
      paramContext = (i)paramVarArgs;
      parama = (f.a)parama;
      ck(parama.hqF);
      if (bg.nm(paramContext.hWl.eDs)) {
        com.tencent.mm.pluginsdk.ui.a.b.a(parama.hqG, paramContext.hWl.lwH);
      }
      for (;;)
      {
        e.a(paramContext.oEA, parama.jpV);
        e.a(paramContext.hqC, parama.jRv);
        GMTrace.o(16473883934720L, 122740);
        return;
        com.tencent.mm.pluginsdk.ui.a.b.a(parama.hqG, paramContext.hWl.eDs);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */