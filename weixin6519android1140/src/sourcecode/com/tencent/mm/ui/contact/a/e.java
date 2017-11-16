package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.selectcontact.a.c;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;

public class e
  extends a
{
  public CharSequence hqB;
  public String username;
  public CharSequence wUU;
  public int wUV;
  private b wUW;
  a wUX;
  
  public e(int paramInt)
  {
    super(4, paramInt);
    GMTrace.i(1770063396864L, 13188);
    this.wUV = 0;
    this.wUW = new b();
    this.wUX = new a();
    GMTrace.o(1770063396864L, 13188);
  }
  
  public final a.b PV()
  {
    GMTrace.i(1770331832320L, 13190);
    b localb = this.wUW;
    GMTrace.o(1770331832320L, 13190);
    return localb;
  }
  
  protected final a.a PW()
  {
    GMTrace.i(1770466050048L, 13191);
    a locala = this.wUX;
    GMTrace.o(1770466050048L, 13191);
    return locala;
  }
  
  public void bz(Context paramContext)
  {
    GMTrace.i(1770197614592L, 13189);
    if ((this.wUV != 0) && (this.wUU != null))
    {
      GMTrace.o(1770197614592L, 13189);
      return;
    }
    if (this.iBi == null)
    {
      this.hqB = "";
      this.username = "";
      GMTrace.o(1770197614592L, 13189);
      return;
    }
    this.hqB = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).c(this.iBi), com.tencent.mm.br.a.V(paramContext, a.c.aQF));
    this.username = this.iBi.field_username;
    GMTrace.o(1770197614592L, 13189);
  }
  
  public final class a
    extends a.a
  {
    public ImageView hqG;
    public TextView hqI;
    public CheckBox hqJ;
    public TextView jpV;
    
    public a()
    {
      super();
      GMTrace.i(1769258090496L, 13182);
      GMTrace.o(1769258090496L, 13182);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(1767781695488L, 13171);
      GMTrace.o(1767781695488L, 13171);
    }
    
    public final boolean PX()
    {
      GMTrace.i(1768184348672L, 13174);
      GMTrace.o(1768184348672L, 13174);
      return false;
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(1767915913216L, 13172);
      if (com.tencent.mm.br.a.ed(paramContext)) {}
      for (paramContext = LayoutInflater.from(paramContext).inflate(a.f.oFu, paramViewGroup, false);; paramContext = LayoutInflater.from(paramContext).inflate(a.f.oFt, paramViewGroup, false))
      {
        paramViewGroup = (e.a)e.this.wUX;
        paramViewGroup.hqG = ((ImageView)paramContext.findViewById(a.e.bfq));
        paramViewGroup.jpV = ((TextView)paramContext.findViewById(a.e.chT));
        paramViewGroup.hqI = ((TextView)paramContext.findViewById(a.e.bti));
        paramViewGroup.hqI.setVisibility(8);
        paramViewGroup.hqJ = ((CheckBox)paramContext.findViewById(a.e.cbs));
        paramContext.setTag(paramViewGroup);
        GMTrace.o(1767915913216L, 13172);
        return paramContext;
      }
    }
    
    public final void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(1768050130944L, 13173);
      paramContext = (e)parama1;
      parama = (e.a)parama;
      if ((e.this.wUV != 0) && (e.this.wUU != null))
      {
        parama.hqG.setImageResource(e.this.wUV);
        parama.jpV.setText(e.this.wUU);
        GMTrace.o(1768050130944L, 13173);
        return;
      }
      com.tencent.mm.plugin.fts.d.e.a(paramContext.hqB, parama.jpV);
      com.tencent.mm.pluginsdk.ui.a.b.a(parama.hqG, paramContext.username);
      if (e.this.wSC)
      {
        if (paramBoolean1)
        {
          parama.hqJ.setChecked(true);
          parama.hqJ.setEnabled(false);
        }
        for (;;)
        {
          parama.hqJ.setVisibility(0);
          GMTrace.o(1768050130944L, 13173);
          return;
          parama.hqJ.setChecked(paramBoolean2);
          parama.hqJ.setEnabled(true);
        }
      }
      parama.hqJ.setVisibility(8);
      GMTrace.o(1768050130944L, 13173);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */