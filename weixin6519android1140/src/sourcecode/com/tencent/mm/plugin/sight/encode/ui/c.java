package com.tencent.mm.plugin.sight.encode.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.a.a.a;
import com.tencent.mm.ui.contact.a.a.b;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.a.d.a;
import com.tencent.mm.ui.contact.a.d.b;
import com.tencent.mm.ui.contact.l;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends o
{
  public static boolean oVy;
  public static boolean oVz;
  List<String> oVw;
  private boolean oVx;
  
  static
  {
    GMTrace.i(9299409502208L, 69286);
    oVy = true;
    oVz = false;
    GMTrace.o(9299409502208L, 69286);
  }
  
  public c(l paraml)
  {
    super(paraml, new ArrayList(), true, true);
    GMTrace.i(9298335760384L, 69278);
    this.oVx = true;
    this.oVx = true;
    this.oVw = null;
    GMTrace.o(9298335760384L, 69278);
  }
  
  public static boolean GE(String paramString)
  {
    GMTrace.i(9298738413568L, 69281);
    if (bg.nm(paramString))
    {
      GMTrace.o(9298738413568L, 69281);
      return false;
    }
    boolean bool = paramString.endsWith("@sns.tencent");
    GMTrace.o(9298738413568L, 69281);
    return bool;
  }
  
  public static boolean GF(String paramString)
  {
    GMTrace.i(9298872631296L, 69282);
    if (bg.nm(paramString))
    {
      GMTrace.o(9298872631296L, 69282);
      return false;
    }
    boolean bool = paramString.endsWith("@search.tencent");
    GMTrace.o(9298872631296L, 69282);
    return bool;
  }
  
  public static boolean GG(String paramString)
  {
    GMTrace.i(9299006849024L, 69283);
    if (bg.nm(paramString))
    {
      GMTrace.o(9299006849024L, 69283);
      return false;
    }
    boolean bool = paramString.endsWith("@draft.tencent");
    GMTrace.o(9299006849024L, 69283);
    return bool;
  }
  
  public final boolean bhh()
  {
    GMTrace.i(15404034424832L, 114769);
    boolean bool = this.oVx;
    GMTrace.o(15404034424832L, 114769);
    return bool;
  }
  
  public final int getCount()
  {
    GMTrace.i(9298469978112L, 69279);
    if (this.oVw == null)
    {
      GMTrace.o(9298469978112L, 69279);
      return 0;
    }
    int i = this.oVw.size();
    GMTrace.o(9298469978112L, 69279);
    return i;
  }
  
  protected final com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(9298604195840L, 69280);
    if (this.oVw == null)
    {
      GMTrace.o(9298604195840L, 69280);
      return null;
    }
    if ((paramInt < 0) || (paramInt >= getCount()))
    {
      w.e("MicroMsg.MainSightSelectContactAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(9298604195840L, 69280);
      return null;
    }
    a locala = new a(paramInt);
    Object localObject = (String)this.oVw.get(paramInt);
    if (GE((String)localObject)) {
      localObject = new x("@sns.tencent");
    }
    for (;;)
    {
      locala.iBi = ((x)localObject);
      locala.wSC = this.oVx;
      GMTrace.o(9298604195840L, 69280);
      return locala;
      if (GF((String)localObject))
      {
        localObject = new x("@search.tencent");
      }
      else if (GG((String)localObject))
      {
        localObject = new x("@draft.tencent");
      }
      else
      {
        at.AR();
        localObject = com.tencent.mm.y.c.yK().TE((String)this.oVw.get(paramInt));
      }
    }
  }
  
  public final class a
    extends d
  {
    public a(int paramInt)
    {
      super();
      GMTrace.i(9343164481536L, 69612);
      GMTrace.o(9343164481536L, 69612);
    }
    
    public final a.b PV()
    {
      GMTrace.i(9343298699264L, 69613);
      b localb = new b();
      GMTrace.o(9343298699264L, 69613);
      return localb;
    }
    
    protected final a.a PW()
    {
      GMTrace.i(9343432916992L, 69614);
      a locala = new a();
      GMTrace.o(9343432916992L, 69614);
      return locala;
    }
    
    public final class a
      extends d.a
    {
      public View oUu;
      public View oVB;
      
      public a()
      {
        super();
        GMTrace.i(9299812155392L, 69289);
        GMTrace.o(9299812155392L, 69289);
      }
    }
    
    public final class b
      extends d.b
    {
      public b()
      {
        super();
        GMTrace.i(9329742708736L, 69512);
        GMTrace.o(9329742708736L, 69512);
      }
      
      public final View a(Context paramContext, ViewGroup paramViewGroup)
      {
        GMTrace.i(9329876926464L, 69513);
        paramContext = LayoutInflater.from(paramContext).inflate(R.i.cGI, paramViewGroup, false);
        paramViewGroup = (c.a.a)c.a.this.PW();
        paramViewGroup.hqG = ((ImageView)paramContext.findViewById(R.h.bfq));
        paramViewGroup.hqH = ((TextView)paramContext.findViewById(R.h.chT));
        paramViewGroup.hqI = ((TextView)paramContext.findViewById(R.h.bti));
        paramViewGroup.hqF = paramContext.findViewById(R.h.cbB);
        paramViewGroup.hqJ = ((CheckBox)paramContext.findViewById(R.h.cbs));
        paramViewGroup.oUu = paramContext.findViewById(R.h.bIX);
        paramViewGroup.oVB = paramContext.findViewById(R.h.caP);
        paramContext.setTag(paramViewGroup);
        paramViewGroup.hqH.setTextColor(-1);
        paramViewGroup = (AbsListView.LayoutParams)paramContext.getLayoutParams();
        paramViewGroup.width = -1;
        paramContext.setLayoutParams(paramViewGroup);
        paramContext.setBackgroundResource(R.e.black);
        GMTrace.o(9329876926464L, 69513);
        return paramContext;
      }
      
      public final void a(Context paramContext, a.a parama, com.tencent.mm.ui.contact.a.a parama1, boolean paramBoolean1, boolean paramBoolean2)
      {
        GMTrace.i(9330011144192L, 69514);
        x localx = parama1.iBi;
        c.a.a locala = (c.a.a)parama;
        locala.hqF.setVisibility(0);
        locala.oVB.setVisibility(8);
        locala.oUu.setVisibility(8);
        if (c.GG(localx.field_username))
        {
          locala.hqG.setImageResource(R.k.cOL);
          locala.hqH.setText(R.l.edb);
          locala.hqI.setText(R.l.ecZ);
          locala.hqI.setVisibility(0);
          locala.hqJ.setEnabled(false);
          if (c.oVz)
          {
            locala.hqF.setBackgroundResource(R.g.bar);
            locala.hqJ.setVisibility(0);
            locala.hqJ.setBackgroundResource(R.k.cON);
            locala.oUu.setVisibility(0);
          }
          for (;;)
          {
            parama = c.this;
            c.d(paramContext, locala.hqF);
            parama = locala.hqG.getLayoutParams();
            parama.width = com.tencent.mm.br.a.V(paramContext, R.f.aSO);
            parama.height = com.tencent.mm.br.a.V(paramContext, R.f.aSO);
            locala.hqG.setLayoutParams(parama);
            parama = (LinearLayout.LayoutParams)locala.hqJ.getLayoutParams();
            parama.height = com.tencent.mm.br.a.V(paramContext, R.f.aSP);
            parama.width = com.tencent.mm.br.a.V(paramContext, R.f.aSP);
            parama.setMargins(parama.leftMargin, parama.topMargin, 0, parama.bottomMargin);
            locala.hqJ.setLayoutParams(parama);
            GMTrace.o(9330011144192L, 69514);
            return;
            locala.hqF.setBackgroundResource(R.g.bas);
            locala.hqJ.setVisibility(8);
            locala.hqJ.setBackgroundResource(R.k.cOO);
            locala.oUu.setVisibility(8);
          }
        }
        if (c.GE(localx.field_username))
        {
          locala.hqG.setImageResource(R.k.cOM);
          locala.hqJ.setVisibility(8);
          locala.hqH.setText(paramContext.getString(R.l.ede));
          locala.hqI.setVisibility(8);
          if (c.oVy)
          {
            locala.hqF.setBackgroundResource(R.g.bas);
            locala.oUu.setVisibility(8);
            parama = c.this;
            c.d(paramContext, locala.hqF);
          }
        }
        for (;;)
        {
          parama = locala.hqG.getLayoutParams();
          parama.width = com.tencent.mm.br.a.V(paramContext, R.f.aSO);
          parama.height = com.tencent.mm.br.a.V(paramContext, R.f.aSO);
          locala.hqG.setLayoutParams(parama);
          parama = (LinearLayout.LayoutParams)locala.hqJ.getLayoutParams();
          parama.height = com.tencent.mm.br.a.V(paramContext, R.f.aSP);
          parama.width = com.tencent.mm.br.a.V(paramContext, R.f.aSP);
          parama.setMargins(parama.leftMargin, parama.topMargin, 0, parama.bottomMargin);
          locala.hqJ.setLayoutParams(parama);
          locala.hqJ.setBackgroundResource(R.g.baq);
          GMTrace.o(9330011144192L, 69514);
          return;
          locala.hqF.setBackgroundResource(R.g.bar);
          locala.oUu.setVisibility(0);
          break;
          if (c.GF(localx.field_username))
          {
            locala.hqF.setVisibility(8);
            locala.oVB.setVisibility(0);
            GMTrace.o(9330011144192L, 69514);
            return;
          }
          super.a(paramContext, parama, parama1, paramBoolean1, paramBoolean2);
          locala.hqF.setBackgroundResource(R.g.bas);
          parama = c.this;
          c.d(paramContext, locala.hqF);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\encode\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */