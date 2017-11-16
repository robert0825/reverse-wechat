package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;
import com.tencent.mm.plugin.selectcontact.a.h;

public final class h
  extends a
{
  public CharSequence lAm;
  private b wVg;
  a.a wVh;
  
  public h(int paramInt)
  {
    super(6, paramInt);
    GMTrace.i(1775297888256L, 13227);
    this.wVg = new b();
    this.wVh = new a();
    GMTrace.o(1775297888256L, 13227);
  }
  
  public final a.b PV()
  {
    GMTrace.i(1775566323712L, 13229);
    b localb = this.wVg;
    GMTrace.o(1775566323712L, 13229);
    return localb;
  }
  
  protected final a.a PW()
  {
    GMTrace.i(1775700541440L, 13230);
    a.a locala = this.wVh;
    GMTrace.o(1775700541440L, 13230);
    return locala;
  }
  
  public final void bz(Context paramContext)
  {
    GMTrace.i(1775432105984L, 13228);
    this.lAm = f.a(paramContext.getString(a.h.dWd), paramContext.getString(a.h.dWc), com.tencent.mm.plugin.fts.d.b.a.d(this.eQb, this.eQb)).lAJ;
    GMTrace.o(1775432105984L, 13228);
  }
  
  public final class a
    extends a.a
  {
    public TextView lAp;
    
    public a()
    {
      super();
      GMTrace.i(1769392308224L, 13183);
      GMTrace.o(1769392308224L, 13183);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(1766707953664L, 13163);
      GMTrace.o(1766707953664L, 13163);
    }
    
    public final boolean PX()
    {
      GMTrace.i(1767110606848L, 13166);
      GMTrace.o(1767110606848L, 13166);
      return false;
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(1766842171392L, 13164);
      paramContext = LayoutInflater.from(paramContext).inflate(a.f.oFx, paramViewGroup, false);
      paramViewGroup = (h.a)h.this.wVh;
      paramViewGroup.lAp = ((TextView)paramContext.findViewById(a.e.bHq));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(1766842171392L, 13164);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(1766976389120L, 13165);
      paramContext = (h.a)parama;
      e.a(h.this.lAm, paramContext.lAp);
      GMTrace.o(1766976389120L, 13165);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\contact\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */