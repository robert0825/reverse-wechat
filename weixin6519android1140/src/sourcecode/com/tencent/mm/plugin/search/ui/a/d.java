package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.c;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.f;
import java.util.List;

public final class d
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public int actionType;
  public i hWl;
  public List<String> hWm;
  public CharSequence ljw;
  public String ljz;
  public CharSequence oEd;
  public String oEe;
  public c oEf;
  private b oEg;
  a oEh;
  
  public d(int paramInt)
  {
    super(3, paramInt);
    GMTrace.i(11852364906496L, 88307);
    this.actionType = -1;
    this.oEg = new b();
    this.oEh = new a();
    GMTrace.o(11852364906496L, 88307);
  }
  
  public final a.b Vu()
  {
    GMTrace.i(16473347063808L, 122736);
    b localb = this.oEg;
    GMTrace.o(16473347063808L, 122736);
    return localb;
  }
  
  protected final a.a Vv()
  {
    GMTrace.i(18366756552704L, 136843);
    a locala = this.oEh;
    GMTrace.o(18366756552704L, 136843);
    return locala;
  }
  
  public final String Vw()
  {
    GMTrace.i(11852767559680L, 88310);
    String str = this.oEf.field_title;
    GMTrace.o(11852767559680L, 88310);
    return str;
  }
  
  public final int Vx()
  {
    GMTrace.i(11852901777408L, 88311);
    int i = this.hWl.lxn;
    GMTrace.o(11852901777408L, 88311);
    return i;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    boolean bool2 = true;
    GMTrace.i(16473212846080L, 122735);
    this.oEf = ((c)this.hWl.userData);
    if (this.oEf == null)
    {
      GMTrace.o(16473212846080L, 122735);
      return;
    }
    this.ljw = this.oEf.field_title;
    this.oEd = this.oEf.field_tag;
    this.ljz = this.oEf.field_iconPath;
    this.oEe = this.oEf.field_androidUrl;
    this.actionType = this.oEf.field_actionType;
    boolean bool1;
    switch (this.hWl.gRk)
    {
    default: 
      GMTrace.o(16473212846080L, 122735);
      return;
    case 3: 
      bool1 = true;
    }
    for (;;)
    {
      this.ljw = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.ljw, this.eQb, this.hWm, bool2, bool1)).lAJ;
      GMTrace.o(16473212846080L, 122735);
      return;
      this.oEd = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.oEd, this.eQb, this.hWm)).lAJ;
      break;
      bool1 = false;
      continue;
      bool2 = false;
      bool1 = false;
    }
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
      GMTrace.i(11852230688768L, 88306);
      GMTrace.o(11852230688768L, 88306);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(11847398850560L, 88270);
      GMTrace.o(11847398850560L, 88270);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11847533068288L, 88271);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cxG, paramViewGroup, false);
      int i = paramViewGroup.getPaddingLeft();
      int j = paramViewGroup.getPaddingRight();
      paramContext.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(paramViewGroup.getWidth(), 1073741824), i + j, -1), View.MeasureSpec.makeMeasureSpec(-2, 1073741824));
      paramViewGroup = (d.a)d.this.oEh;
      paramViewGroup.hqG = ((ImageView)paramContext.findViewById(R.h.bfq));
      paramViewGroup.hqH = ((TextView)paramContext.findViewById(R.h.chT));
      paramViewGroup.hqI = ((TextView)paramContext.findViewById(R.h.bti));
      paramViewGroup.hqF = paramContext.findViewById(R.h.cay);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11847533068288L, 88271);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16471199580160L, 122720);
      parama = (d.a)parama;
      paramVarArgs = (d)paramVarArgs;
      ck(parama.hqF);
      e.a(d.this.ljw, parama.hqH);
      e.a(d.this.oEd, parama.hqI);
      e.a(paramContext, parama.hqG, null, paramVarArgs.ljz, R.k.cMF);
      GMTrace.o(16471199580160L, 122720);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16471333797888L, 122721);
      paramVarArgs = (d)paramVarArgs;
      a(d.this.eQb, paramVarArgs.hWl);
      if (((com.tencent.mm.plugin.appbrand.k.d)h.h(com.tencent.mm.plugin.appbrand.k.d.class)).rc(paramVarArgs.oEf.field_url))
      {
        GMTrace.o(16471333797888L, 122721);
        return true;
      }
      Intent localIntent;
      if (paramVarArgs.oEf.field_actionType == 2)
      {
        localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramVarArgs.oEf.field_url);
        com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
        GMTrace.o(16471333797888L, 122721);
        return true;
      }
      if (!com.tencent.mm.plugin.search.a.a.F(paramContext, paramVarArgs.oEf.field_featureId))
      {
        localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramVarArgs.oEf.field_updateUrl);
        com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      }
      GMTrace.o(16471333797888L, 122721);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */