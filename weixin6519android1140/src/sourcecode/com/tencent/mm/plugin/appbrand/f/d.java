package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.g;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;

public final class d
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public com.tencent.mm.plugin.fts.a.a.i hWl;
  public List<String> hWm;
  public com.tencent.mm.plugin.appbrand.c.e hWn;
  public CharSequence hWo;
  private b hWp;
  a hWq;
  
  public d(int paramInt)
  {
    super(16, paramInt);
    GMTrace.i(10656082296832L, 79394);
    this.hWp = new b();
    this.hWq = new a();
    GMTrace.o(10656082296832L, 79394);
  }
  
  public final a.b Vu()
  {
    GMTrace.i(16548643209216L, 123297);
    b localb = this.hWp;
    GMTrace.o(16548643209216L, 123297);
    return localb;
  }
  
  protected final a.a Vv()
  {
    GMTrace.i(18199521263616L, 135597);
    a locala = this.hWq;
    GMTrace.o(18199521263616L, 135597);
    return locala;
  }
  
  public final String Vw()
  {
    GMTrace.i(10656484950016L, 79397);
    String str = this.hWn.appName;
    GMTrace.o(10656484950016L, 79397);
    return str;
  }
  
  public final int Vx()
  {
    GMTrace.i(10656619167744L, 79398);
    int i = this.hWl.lxn;
    GMTrace.o(10656619167744L, 79398);
    return i;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    int i = 1;
    boolean bool = false;
    GMTrace.i(16548508991488L, 123296);
    this.hWn = i.pX(this.hWl.lwH);
    if (this.hWn == null)
    {
      GMTrace.o(16548508991488L, 123296);
      return;
    }
    switch (this.hWl.gRk)
    {
    default: 
      i = 0;
      bool = false;
      if (i == 0) {
        break;
      }
    }
    for (this.hWo = ((g)h.h(g.class)).a(this.hWn.appName, this.hWm, bool, this.eQb);; this.hWo = ((g)h.h(g.class)).a(this.hWn.appName, this.hWm, this.eQb))
    {
      this.info = this.hWn.eAr;
      GMTrace.o(16548508991488L, 123296);
      return;
      bool = true;
      break;
    }
  }
  
  public final class a
    extends a.a
  {
    public TextView hWr;
    public TextView hWs;
    public View hqF;
    public ImageView hqG;
    public TextView hqH;
    
    public a()
    {
      super();
      GMTrace.i(10653263724544L, 79373);
      GMTrace.o(10653263724544L, 79373);
    }
  }
  
  public final class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(10653397942272L, 79374);
      GMTrace.o(10653397942272L, 79374);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(10653532160000L, 79375);
      paramContext = LayoutInflater.from(paramContext).inflate(o.g.hCP, paramViewGroup, false);
      paramViewGroup = (d.a)d.this.hWq;
      paramViewGroup.hqG = ((ImageView)paramContext.findViewById(o.f.bfq));
      paramViewGroup.hqH = ((TextView)paramContext.findViewById(o.f.chT));
      paramViewGroup.hqF = paramContext.findViewById(o.f.cay);
      paramViewGroup.hWr = ((TextView)paramContext.findViewById(o.f.hCs));
      paramViewGroup.hWs = ((TextView)paramContext.findViewById(o.f.hCB));
      paramContext.setTag(paramViewGroup);
      GMTrace.o(10653532160000L, 79375);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16549448515584L, 123303);
      paramContext = (d)paramVarArgs;
      parama = (d.a)parama;
      if (paramContext.hWn == null)
      {
        parama.hqF.setVisibility(8);
        GMTrace.o(16549448515584L, 123303);
        return;
      }
      parama.hqF.setVisibility(0);
      parama.hqH.setText(d.this.hWo);
      int k = d.this.hWn.hKs;
      long l = d.this.hWn.hML;
      int j = 0;
      int i = 0;
      if ((1L & l) > 0L)
      {
        j = 1;
        i = o.i.hGu;
        if ((j == 0) || (k != 0)) {
          break label252;
        }
        paramVarArgs = new ColorMatrix();
        paramVarArgs.setSaturation(0.0F);
        parama.hqG.setColorFilter(new ColorMatrixColorFilter(paramVarArgs));
        parama.hWr.setVisibility(0);
        parama.hWr.setText(i);
        label167:
        paramVarArgs = com.tencent.mm.plugin.appbrand.appcache.a.hW(d.this.hWn.hKs);
        if (!bg.nm(paramVarArgs)) {
          break label263;
        }
        parama.hWs.setVisibility(8);
      }
      for (;;)
      {
        b.CT().a(parama.hqG, paramContext.hWn.hMK, com.tencent.mm.modelappbrand.a.a.CS(), com.tencent.mm.modelappbrand.a.e.grO);
        GMTrace.o(16549448515584L, 123303);
        return;
        if ((l & 0x2) <= 0L) {
          break;
        }
        j = 1;
        i = o.i.hGt;
        break;
        label252:
        parama.hqG.setColorFilter(null);
        break label167;
        label263:
        parama.hWs.setText(paramVarArgs);
        parama.hWs.setVisibility(0);
      }
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16549582733312L, 123304);
      paramContext = (d)paramVarArgs;
      paramVarArgs = new qi();
      paramVarArgs.eUY.userName = paramContext.hWn.eAr;
      paramVarArgs.eUY.eVb = paramContext.hWn.hKs;
      paramVarArgs.eUY.eVe = true;
      paramVarArgs.eUY.scene = 1027;
      com.tencent.mm.sdk.b.a.vgX.m(paramVarArgs);
      GMTrace.o(16549582733312L, 123304);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */