package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.j.c;
import com.tencent.mm.plugin.fts.d.j.d;
import com.tencent.mm.y.r;

public final class j
  extends b
{
  public int count;
  public String eDs;
  private a oED;
  b oEE;
  
  public j(int paramInt)
  {
    super(paramInt);
    GMTrace.i(11848472592384L, 88278);
    this.oED = new a();
    this.oEE = new b();
    GMTrace.o(11848472592384L, 88278);
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a.b Vu()
  {
    GMTrace.i(18366890770432L, 136844);
    a locala = this.oED;
    GMTrace.o(18366890770432L, 136844);
    return locala;
  }
  
  protected final a.a Vv()
  {
    GMTrace.i(18367024988160L, 136845);
    b localb = this.oEE;
    GMTrace.o(18367024988160L, 136845);
    return localb;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16470931144704L, 122718);
    parama = TextUtils.ellipsize(r.fs(this.eDs), d.b.lzw, 500.0F, TextUtils.TruncateAt.MIDDLE);
    this.lAh = paramContext.getString(R.l.dWG, new Object[] { parama });
    GMTrace.o(16470931144704L, 122718);
  }
  
  public final class a
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public a()
    {
      super();
      GMTrace.i(18367293423616L, 136847);
      GMTrace.o(18367293423616L, 136847);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(18367427641344L, 136848);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cxY, paramViewGroup, false);
      paramViewGroup = (j.b)j.this.oEE;
      paramViewGroup.jUf = ((TextView)paramContext.findViewById(j.d.bGb));
      paramViewGroup.hqF = paramContext.findViewById(j.d.cay);
      paramViewGroup.hqG = ((ImageView)paramContext.findViewById(R.h.bfq));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(18367427641344L, 136848);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(18367561859072L, 136849);
      paramContext = (j.b)parama;
      e.a(j.this.lAh, paramContext.jUf);
      paramContext.hqF.setBackgroundResource(j.c.aXD);
      com.tencent.mm.pluginsdk.ui.a.b.a(paramContext.hqG, j.this.eDs);
      GMTrace.o(18367561859072L, 136849);
    }
    
    public final boolean a(Context paramContext, a paramVarArgs)
    {
      GMTrace.i(18367696076800L, 136850);
      GMTrace.o(18367696076800L, 136850);
      return false;
    }
  }
  
  public final class b
    extends a.a
  {
    public View hqF;
    public ImageView hqG;
    public TextView jUf;
    
    public b()
    {
      super();
      GMTrace.i(18366622334976L, 136842);
      GMTrace.o(18366622334976L, 136842);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */