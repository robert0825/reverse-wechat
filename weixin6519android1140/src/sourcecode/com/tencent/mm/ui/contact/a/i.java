package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;
import com.tencent.mm.plugin.selectcontact.a.h;

public final class i
  extends a
{
  public int qPV;
  a.a wVh;
  public boolean wVj;
  private b wVk;
  
  public i(int paramInt)
  {
    super(1, paramInt);
    GMTrace.i(1769526525952L, 13184);
    this.wVk = new b();
    this.wVh = new a();
    GMTrace.o(1769526525952L, 13184);
  }
  
  public final a.b PV()
  {
    GMTrace.i(1769794961408L, 13186);
    b localb = this.wVk;
    GMTrace.o(1769794961408L, 13186);
    return localb;
  }
  
  protected final a.a PW()
  {
    GMTrace.i(1769929179136L, 13187);
    a.a locala = this.wVh;
    GMTrace.o(1769929179136L, 13187);
    return locala;
  }
  
  public final void bz(Context paramContext)
  {
    GMTrace.i(1769660743680L, 13185);
    GMTrace.o(1769660743680L, 13185);
  }
  
  public final class a
    extends a.a
  {
    public TextView wVl;
    public ImageView wVm;
    
    public a()
    {
      super();
      GMTrace.i(1771137138688L, 13196);
      GMTrace.o(1771137138688L, 13196);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(1771271356416L, 13197);
      GMTrace.o(1771271356416L, 13197);
    }
    
    public final boolean PX()
    {
      GMTrace.i(1771674009600L, 13200);
      GMTrace.o(1771674009600L, 13200);
      return false;
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(1771405574144L, 13198);
      paramContext = LayoutInflater.from(paramContext).inflate(a.f.oFy, paramViewGroup, false);
      paramViewGroup = (i.a)i.this.wVh;
      paramViewGroup.wVl = ((TextView)paramContext.findViewById(a.e.oFj));
      paramViewGroup.wVm = ((ImageView)paramContext.findViewById(a.e.oFi));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(1771405574144L, 13198);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(1771539791872L, 13199);
      parama = (i.a)parama;
      parama1 = (i)parama1;
      paramContext = paramContext.getResources();
      if (i.this.wVj)
      {
        e.a(paramContext.getString(a.h.oFD, new Object[] { paramContext.getString(parama1.qPV) }), parama.wVl);
        parama.wVm.setRotation(0.0F);
        GMTrace.o(1771539791872L, 13199);
        return;
      }
      e.a(paramContext.getString(a.h.oFE), parama.wVl);
      parama.wVm.setRotation(180.0F);
      GMTrace.o(1771539791872L, 13199);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */