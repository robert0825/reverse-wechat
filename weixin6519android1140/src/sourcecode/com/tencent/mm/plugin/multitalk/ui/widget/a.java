package com.tencent.mm.plugin.multitalk.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.a.d.a;
import com.tencent.mm.ui.contact.a.d.b;

public final class a
  extends d
{
  private a nnZ;
  
  public a(int paramInt)
  {
    super(paramInt);
    GMTrace.i(4780164382720L, 35615);
    this.nnZ = new a();
    GMTrace.o(4780164382720L, 35615);
  }
  
  public final com.tencent.mm.ui.contact.a.a.b PV()
  {
    GMTrace.i(4780298600448L, 35616);
    a locala = this.nnZ;
    GMTrace.o(4780298600448L, 35616);
    return locala;
  }
  
  public final class a
    extends d.b
  {
    public a()
    {
      super();
      GMTrace.i(4778822205440L, 35605);
      GMTrace.o(4778822205440L, 35605);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(4778956423168L, 35606);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cCC, paramViewGroup, false);
      paramViewGroup = (d.a)a.a(a.this);
      paramViewGroup.hqG = ((ImageView)paramContext.findViewById(R.h.bfq));
      paramViewGroup.hqH = ((TextView)paramContext.findViewById(R.h.chT));
      paramViewGroup.hqI = ((TextView)paramContext.findViewById(R.h.bti));
      paramViewGroup.hqF = paramContext.findViewById(R.h.cbB);
      paramViewGroup.hqJ = ((CheckBox)paramContext.findViewById(R.h.cbs));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(4778956423168L, 35606);
      return paramContext;
    }
    
    public final void a(Context paramContext, com.tencent.mm.ui.contact.a.a.a parama, com.tencent.mm.ui.contact.a.a parama1, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(4779090640896L, 35607);
      paramContext = (d.a)parama;
      parama = (d)parama1;
      if ((parama.username != null) && (parama.username.length() > 0))
      {
        com.tencent.mm.pluginsdk.ui.a.b.a(paramContext.hqG, parama.username);
        e.a(parama.hqB, paramContext.hqH);
        if (!a.this.wSC) {
          break label139;
        }
        if (!paramBoolean1) {
          break label119;
        }
        paramContext.hqJ.setChecked(true);
        paramContext.hqJ.setEnabled(false);
      }
      for (;;)
      {
        paramContext.hqJ.setVisibility(0);
        GMTrace.o(4779090640896L, 35607);
        return;
        paramContext.hqG.setImageResource(R.g.aVS);
        break;
        label119:
        paramContext.hqJ.setChecked(paramBoolean2);
        paramContext.hqJ.setEnabled(true);
      }
      label139:
      paramContext.hqJ.setVisibility(8);
      GMTrace.o(4779090640896L, 35607);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */