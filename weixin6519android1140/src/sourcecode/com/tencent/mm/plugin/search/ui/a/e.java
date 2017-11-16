package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.pluginsdk.model.app.an;
import java.util.List;

public final class e
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public com.tencent.mm.plugin.fts.a.a.i hWl;
  public List<String> hWm;
  public String ied;
  public com.tencent.mm.pluginsdk.model.app.f lUp;
  public String ljz;
  public CharSequence oEj;
  public String oEk;
  private b oEl;
  a oEm;
  
  public e(int paramInt)
  {
    super(5, paramInt);
    GMTrace.i(16471736451072L, 122724);
    this.oEl = new b();
    this.oEm = new a();
    GMTrace.o(16471736451072L, 122724);
  }
  
  public final a.b Vu()
  {
    GMTrace.i(16472004886528L, 122726);
    b localb = this.oEl;
    GMTrace.o(16472004886528L, 122726);
    return localb;
  }
  
  protected final a.a Vv()
  {
    GMTrace.i(18367830294528L, 136851);
    a locala = this.oEm;
    GMTrace.o(18367830294528L, 136851);
    return locala;
  }
  
  public final String Vw()
  {
    GMTrace.i(16472139104256L, 122727);
    String str = this.lUp.field_appName;
    GMTrace.o(16472139104256L, 122727);
    return str;
  }
  
  public final int Vx()
  {
    GMTrace.i(16472273321984L, 122728);
    int i = this.hWl.lxn;
    GMTrace.o(16472273321984L, 122728);
    return i;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16471870668800L, 122725);
    this.lUp = an.aWy().Ox(this.hWl.lwH);
    this.oEj = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.lUp.field_appName, this.eQb, this.hWm)).lAJ;
    this.oEk = this.lUp.fdO;
    an.aWy();
    this.ljz = com.tencent.mm.pluginsdk.model.app.i.cC(this.lUp.field_appId, 1);
    this.ied = this.lUp.field_appIconUrl;
    GMTrace.o(16471870668800L, 122725);
  }
  
  public final class a
    extends a.a
  {
    public View hqF;
    public ImageView hqG;
    public TextView hqH;
    public TextView hqI;
    
    public a()
    {
      super();
      GMTrace.i(16474957676544L, 122748);
      GMTrace.o(16474957676544L, 122748);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(16475360329728L, 122751);
      GMTrace.o(16475360329728L, 122751);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(16475494547456L, 122752);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cxL, paramViewGroup, false);
      paramViewGroup = (e.a)e.this.oEm;
      paramViewGroup.hqG = ((ImageView)paramContext.findViewById(R.h.bfq));
      paramViewGroup.hqH = ((TextView)paramContext.findViewById(R.h.chT));
      paramViewGroup.hqI = ((TextView)paramContext.findViewById(R.h.bti));
      paramViewGroup.hqF = paramContext.findViewById(R.h.cay);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(16475494547456L, 122752);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16475628765184L, 122753);
      paramVarArgs = (e)paramVarArgs;
      parama = (e.a)parama;
      parama.hqH.setText(e.this.oEj);
      com.tencent.mm.plugin.fts.d.e.a(e.this.oEk, parama.hqI);
      com.tencent.mm.plugin.fts.d.e.a(paramContext, parama.hqG, paramVarArgs.ied, paramVarArgs.ljz, R.k.cMF, 0, 0);
      GMTrace.o(16475628765184L, 122753);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16475762982912L, 122754);
      paramVarArgs = (e)paramVarArgs;
      gk localgk = new gk();
      localgk.eJy.context = paramContext;
      localgk.eJy.actionCode = 2;
      localgk.eJy.appId = paramVarArgs.lUp.field_appId;
      localgk.eJy.extMsg = "search_src=40";
      localgk.eJy.scene = 4;
      com.tencent.mm.sdk.b.a.vgX.m(localgk);
      GMTrace.o(16475762982912L, 122754);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */