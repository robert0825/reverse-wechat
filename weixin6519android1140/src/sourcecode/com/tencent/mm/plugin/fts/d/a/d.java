package com.tencent.mm.plugin.fts.d.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.j.d;
import com.tencent.mm.plugin.fts.d.j.e;
import com.tencent.mm.plugin.fts.d.j.f;
import com.tencent.mm.plugin.fts.d.j.g;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends a
{
  public String lAr;
  private b lAs;
  private a lAt;
  
  public d(int paramInt)
  {
    super(12, paramInt);
    GMTrace.i(16704469991424L, 124458);
    this.lAs = new b();
    this.lAt = new a();
    this.lzW = true;
    GMTrace.o(16704469991424L, 124458);
  }
  
  public final a.b Vu()
  {
    GMTrace.i(16704738426880L, 124460);
    b localb = this.lAs;
    GMTrace.o(16704738426880L, 124460);
    return localb;
  }
  
  protected final a.a Vv()
  {
    GMTrace.i(18565130354688L, 138321);
    a locala = this.lAt;
    GMTrace.o(18565130354688L, 138321);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16704604209152L, 124459);
    parama = e.oc(this.lzX);
    if (parama == null) {}
    for (this.lAr = "";; this.lAr = paramContext.getResources().getString(j.g.lzU, new Object[] { parama }))
    {
      w.i("MicroMsg.FTS.FTSMoreButtonDataItem", "fillDataItem: tip=%s", new Object[] { this.lAr });
      GMTrace.o(16704604209152L, 124459);
      return;
    }
  }
  
  public final class a
    extends a.a
  {
    public View hqF;
    public ImageView iub;
    public TextView lAu;
    
    public a()
    {
      super();
      GMTrace.i(16707288563712L, 124479);
      GMTrace.o(16707288563712L, 124479);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(16705006862336L, 124462);
      GMTrace.o(16705006862336L, 124462);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(16705141080064L, 124463);
      paramContext = LayoutInflater.from(paramContext).inflate(j.e.cxW, paramViewGroup, false);
      paramViewGroup = new d.a(d.this);
      paramViewGroup.lAu = ((TextView)paramContext.findViewById(j.d.chy));
      paramViewGroup.iub = ((ImageView)paramContext.findViewById(j.d.bGr));
      paramViewGroup.hqF = paramContext.findViewById(j.d.cay);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(16705141080064L, 124463);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(16705275297792L, 124464);
      paramContext = (d.a)parama;
      parama = (d)paramVarArgs;
      ck(paramContext.hqF);
      paramContext.lAu.setText(parama.lAr);
      paramContext.iub.setImageResource(j.f.cMG);
      GMTrace.o(16705275297792L, 124464);
    }
    
    public final boolean a(Context paramContext, a paramVarArgs)
    {
      GMTrace.i(16705409515520L, 124465);
      paramVarArgs = new Intent();
      paramVarArgs.putExtra("detail_query", d.this.eQb);
      paramVarArgs.putExtra("detail_type", d.this.lzX);
      paramVarArgs.putExtra("Search_Scene", d.this.lzo);
      com.tencent.mm.bj.d.b(paramContext, "search", ".ui.FTSDetailUI", paramVarArgs);
      GMTrace.o(16705409515520L, 124465);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\fts\d\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */