package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.f;
import java.util.List;

public final class a
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public List<String> hWm;
  public CharSequence oDT;
  private b oDU;
  private a oDV;
  
  public a(int paramInt)
  {
    super(10, paramInt);
    GMTrace.i(11849546334208L, 88286);
    this.oDU = new b();
    this.oDV = new a();
    GMTrace.o(11849546334208L, 88286);
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a.b Vu()
  {
    GMTrace.i(16473615499264L, 122738);
    b localb = this.oDU;
    GMTrace.o(16473615499264L, 122738);
    return localb;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a.a Vv()
  {
    GMTrace.i(18366488117248L, 136841);
    a locala = this.oDV;
    GMTrace.o(18366488117248L, 136841);
    return locala;
  }
  
  public final void a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16473481281536L, 122737);
    this.oDT = f.a(paramContext.getResources().getString(R.l.dym), "", com.tencent.mm.plugin.fts.d.b.a.d(this.eQb, this.eQb)).lAJ;
    GMTrace.o(16473481281536L, 122737);
  }
  
  public final class a
    extends com.tencent.mm.plugin.fts.d.a.a.a
  {
    public View hqF;
    public ImageView iub;
    public TextView lAu;
    
    public a()
    {
      super();
      GMTrace.i(11850620076032L, 88294);
      GMTrace.o(11850620076032L, 88294);
    }
  }
  
  public final class b
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(11846190891008L, 88261);
      GMTrace.o(11846190891008L, 88261);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11846325108736L, 88262);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cxX, paramViewGroup, false);
      paramViewGroup = new a.a(a.this);
      paramViewGroup.iub = ((ImageView)paramContext.findViewById(R.h.bGr));
      paramViewGroup.lAu = ((TextView)paramContext.findViewById(R.h.chy));
      paramViewGroup.hqF = paramContext.findViewById(R.h.cay);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11846325108736L, 88262);
      return paramContext;
    }
    
    public final void a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16472407539712L, 122729);
      paramContext = (a.a)parama;
      ck(paramContext.hqF);
      e.a(a.this.oDT, paramContext.lAu);
      paramContext.iub.setImageResource(R.k.cOC);
      GMTrace.o(16472407539712L, 122729);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16472541757440L, 122730);
      GMTrace.o(16472541757440L, 122730);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */