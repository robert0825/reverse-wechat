package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.selectcontact.a.d;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;
import com.tencent.mm.plugin.selectcontact.a.h;

public final class j
  extends a
{
  private a wVo;
  b wVp;
  
  public j(int paramInt)
  {
    super(7, paramInt);
    GMTrace.i(16856672894976L, 125592);
    this.wVo = new a();
    this.wVp = new b();
    GMTrace.o(16856672894976L, 125592);
  }
  
  public final a.b PV()
  {
    GMTrace.i(16856941330432L, 125594);
    a locala = this.wVo;
    GMTrace.o(16856941330432L, 125594);
    return locala;
  }
  
  protected final a.a PW()
  {
    GMTrace.i(16857075548160L, 125595);
    b localb = this.wVp;
    GMTrace.o(16857075548160L, 125595);
    return localb;
  }
  
  public final void bz(Context paramContext)
  {
    GMTrace.i(16856807112704L, 125593);
    GMTrace.o(16856807112704L, 125593);
  }
  
  public final class a
    extends a.b
  {
    public a()
    {
      super();
      GMTrace.i(16856136024064L, 125588);
      GMTrace.o(16856136024064L, 125588);
    }
    
    public final boolean PX()
    {
      GMTrace.i(16856538677248L, 125591);
      GMTrace.o(16856538677248L, 125591);
      return false;
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(16856270241792L, 125589);
      paramContext = LayoutInflater.from(paramContext).inflate(a.f.oFz, paramViewGroup, false);
      paramViewGroup = (j.b)j.this.wVp;
      paramViewGroup.hqH = ((TextView)paramContext.findViewById(a.e.chT));
      paramViewGroup.hqF = paramContext.findViewById(a.e.cbB);
      paramViewGroup.hqJ = ((CheckBox)paramContext.findViewById(a.e.cbs));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(16856270241792L, 125589);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(16856404459520L, 125590);
      paramContext = (j.b)parama;
      paramContext.hqH.setText(a.h.oFL);
      paramContext.hqJ.setBackgroundResource(a.d.oFf);
      paramContext.hqJ.setChecked(paramBoolean2);
      paramContext.hqJ.setEnabled(true);
      paramContext.hqJ.setVisibility(0);
      paramContext.hqF.setBackgroundResource(a.d.aVP);
      GMTrace.o(16856404459520L, 125590);
    }
  }
  
  public final class b
    extends a.a
  {
    public View hqF;
    public TextView hqH;
    public CheckBox hqJ;
    
    public b()
    {
      super();
      GMTrace.i(16857209765888L, 125596);
      GMTrace.o(16857209765888L, 125596);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */