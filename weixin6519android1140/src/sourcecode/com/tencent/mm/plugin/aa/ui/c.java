package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.contact.a.a.a;
import com.tencent.mm.y.q;
import java.util.regex.Pattern;

public final class c
  extends com.tencent.mm.ui.contact.a.a
{
  private static final Pattern hqA;
  public CharSequence hqB;
  public CharSequence hqC;
  private b hqD;
  a hqE;
  public String username;
  
  static
  {
    GMTrace.i(5631507431424L, 41958);
    hqA = Pattern.compile(",");
    GMTrace.o(5631507431424L, 41958);
  }
  
  public c(int paramInt)
  {
    super(2, paramInt);
    GMTrace.i(5630970560512L, 41954);
    this.hqD = new b();
    this.hqE = new a();
    GMTrace.o(5630970560512L, 41954);
  }
  
  public final com.tencent.mm.ui.contact.a.a.b PV()
  {
    GMTrace.i(5631238995968L, 41956);
    b localb = this.hqD;
    GMTrace.o(5631238995968L, 41956);
    return localb;
  }
  
  protected final a.a PW()
  {
    GMTrace.i(5631373213696L, 41957);
    a locala = this.hqE;
    GMTrace.o(5631373213696L, 41957);
    return locala;
  }
  
  public final void bz(Context paramContext)
  {
    GMTrace.i(5631104778240L, 41955);
    if (this.iBi == null)
    {
      w.i("MicroMsg.ContactDataItem", "filling dataItem Occur Error Contact is null, position=%d", new Object[] { Integer.valueOf(this.position) });
      GMTrace.o(5631104778240L, 41955);
      return;
    }
    this.username = this.iBi.field_username;
    if (bg.nm(this.eCK)) {}
    for (String str1 = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).c(this.iBi);; str1 = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).F(this.iBi.field_username, this.eCK))
    {
      String str2 = str1;
      if (q.zE().equals(this.username)) {
        str2 = str1 + paramContext.getString(a.i.sRt);
      }
      this.hqB = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, str2, com.tencent.mm.br.a.V(paramContext, a.d.aQF));
      GMTrace.o(5631104778240L, 41955);
      return;
    }
  }
  
  public final class a
    extends a.a
  {
    public View hqF;
    public ImageView hqG;
    public TextView hqH;
    public TextView hqI;
    public CheckBox hqJ;
    
    public a()
    {
      super();
      GMTrace.i(5626809810944L, 41923);
      GMTrace.o(5626809810944L, 41923);
    }
  }
  
  public final class b
    extends com.tencent.mm.ui.contact.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(5619293618176L, 41867);
      GMTrace.o(5619293618176L, 41867);
    }
    
    public final boolean PX()
    {
      GMTrace.i(5619696271360L, 41870);
      GMTrace.o(5619696271360L, 41870);
      return false;
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(5619427835904L, 41868);
      if (com.tencent.mm.br.a.ed(paramContext)) {}
      for (paramViewGroup = LayoutInflater.from(paramContext).inflate(a.g.oFu, paramViewGroup, false);; paramViewGroup = LayoutInflater.from(paramContext).inflate(a.g.oFt, paramViewGroup, false))
      {
        c.a locala = (c.a)c.this.hqE;
        locala.hqG = ((ImageView)paramViewGroup.findViewById(a.f.bfq));
        locala.hqH = ((TextView)paramViewGroup.findViewById(a.f.chT));
        locala.hqI = ((TextView)paramViewGroup.findViewById(a.f.bti));
        locala.hqF = paramViewGroup.findViewById(a.f.cbB);
        locala.hqJ = ((CheckBox)paramViewGroup.findViewById(a.f.cbs));
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)locala.hqJ.getLayoutParams();
        localLayoutParams.leftMargin = paramContext.getResources().getDimensionPixelSize(a.d.snf);
        localLayoutParams.rightMargin = paramContext.getResources().getDimensionPixelSize(a.d.sng);
        locala.hqJ.setLayoutParams(localLayoutParams);
        paramViewGroup.setTag(locala);
        GMTrace.o(5619427835904L, 41868);
        return paramViewGroup;
      }
    }
    
    public final void a(Context paramContext, a.a parama, com.tencent.mm.ui.contact.a.a parama1, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(5619562053632L, 41869);
      parama = (c.a)parama;
      parama1 = (c)parama1;
      if ((parama1.username != null) && (parama1.username.length() > 0))
      {
        com.tencent.mm.pluginsdk.ui.a.b.a(parama.hqG, parama1.username);
        if (bg.L(parama1.hqB)) {
          break label218;
        }
        parama.hqH.setText(parama1.hqB);
        parama.hqH.setVisibility(0);
        label75:
        if (bg.L(parama1.hqC)) {
          break label230;
        }
        parama.hqI.setText(parama1.hqC);
        parama.hqI.setVisibility(0);
        label104:
        if (!c.this.wSC) {
          break label262;
        }
        if (!paramBoolean1) {
          break label242;
        }
        parama.hqJ.setChecked(true);
        parama.hqJ.setEnabled(false);
        label135:
        parama.hqJ.setVisibility(0);
        label143:
        if (!c.this.jug) {
          break label274;
        }
        parama.hqF.setBackgroundResource(a.e.aVP);
      }
      for (;;)
      {
        if (parama1.iBi.field_deleteFlag == 1)
        {
          parama.hqI.setVisibility(0);
          parama.hqI.setText(paramContext.getString(a.i.sRa));
        }
        GMTrace.o(5619562053632L, 41869);
        return;
        parama.hqG.setImageResource(a.e.aVS);
        break;
        label218:
        parama.hqH.setVisibility(8);
        break label75;
        label230:
        parama.hqI.setVisibility(8);
        break label104;
        label242:
        parama.hqJ.setChecked(paramBoolean2);
        parama.hqJ.setEnabled(true);
        break label135;
        label262:
        parama.hqJ.setVisibility(8);
        break label143;
        label274:
        parama.hqF.setBackgroundResource(a.e.aVO);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */