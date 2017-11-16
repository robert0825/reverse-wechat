package com.tencent.mm.plugin.fts.d.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.j.c;
import com.tencent.mm.plugin.fts.d.j.d;
import com.tencent.mm.plugin.fts.d.j.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class b
  extends a
{
  public String lAh;
  private b lAi;
  private a lAj;
  
  public b(int paramInt)
  {
    super(0, paramInt);
    GMTrace.i(16707959652352L, 124484);
    this.lAi = new b();
    this.lAj = new a();
    GMTrace.o(16707959652352L, 124484);
  }
  
  public a.b Vu()
  {
    GMTrace.i(16708228087808L, 124486);
    b localb = this.lAi;
    GMTrace.o(16708228087808L, 124486);
    return localb;
  }
  
  public a.a Vv()
  {
    GMTrace.i(18564861919232L, 138319);
    a locala = this.lAj;
    GMTrace.o(18564861919232L, 138319);
    return locala;
  }
  
  public void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16708093870080L, 124485);
    this.lAh = bg.aq(e.oc(this.lzX), "");
    w.i("MicroMsg.FTS.FTSHeaderDataItem", "fillingDataItem: header=%s", new Object[] { this.lAh });
    GMTrace.o(16708093870080L, 124485);
  }
  
  public final class a
    extends a.a
  {
    public View hqF;
    public TextView jUf;
    public View lAk;
    
    public a()
    {
      super();
      GMTrace.i(16704872644608L, 124461);
      GMTrace.o(16704872644608L, 124461);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(16707422781440L, 124480);
      GMTrace.o(16707422781440L, 124480);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(16707556999168L, 124481);
      paramContext = LayoutInflater.from(paramContext).inflate(j.e.cxM, paramViewGroup, false);
      paramViewGroup = (b.a)b.this.Vv();
      paramViewGroup.jUf = ((TextView)paramContext.findViewById(j.d.bGb));
      paramViewGroup.lAk = paramContext.findViewById(j.d.bST);
      paramViewGroup.hqF = paramContext.findViewById(j.d.cay);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(16707556999168L, 124481);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(16707691216896L, 124482);
      paramContext = (b.a)parama;
      e.a(b.this.lAh, paramContext.jUf);
      if (b.this.position == 0) {
        paramContext.lAk.setVisibility(8);
      }
      for (;;)
      {
        paramContext.hqF.setBackgroundResource(j.c.aXD);
        GMTrace.o(16707691216896L, 124482);
        return;
        paramContext.lAk.setVisibility(0);
      }
    }
    
    public final boolean a(Context paramContext, a paramVarArgs)
    {
      GMTrace.i(16707825434624L, 124483);
      GMTrace.o(16707825434624L, 124483);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\fts\d\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */