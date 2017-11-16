package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.selectcontact.a.c;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;
import com.tencent.mm.plugin.selectcontact.a.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import java.util.HashMap;
import java.util.Map;

public final class a
  extends com.tencent.mm.ui.contact.a.a
{
  private static Map<String, c> woG;
  public CharSequence hqB;
  public long juT;
  public String username;
  public String woF;
  private b woH;
  a woI;
  
  static
  {
    GMTrace.i(2973862199296L, 22157);
    woG = new HashMap();
    GMTrace.o(2973862199296L, 22157);
  }
  
  public a(int paramInt)
  {
    super(4, paramInt);
    GMTrace.i(2973191110656L, 22152);
    this.juT = -1L;
    this.woH = new b();
    this.woI = new a();
    GMTrace.o(2973191110656L, 22152);
  }
  
  public static c VO(String paramString)
  {
    GMTrace.i(16020093796352L, 119359);
    if (paramString == null)
    {
      GMTrace.o(16020093796352L, 119359);
      return null;
    }
    if ((woG.containsKey(paramString)) && (woG.get(paramString) != null))
    {
      paramString = (c)woG.get(paramString);
      GMTrace.o(16020093796352L, 119359);
      return paramString;
    }
    Object localObject = new c.a();
    ((c.a)localObject).gKF = com.tencent.mm.api.a.bk(paramString);
    ((c.a)localObject).gKC = true;
    ((c.a)localObject).gKY = true;
    ((c.a)localObject).gKR = a.g.aVS;
    localObject = ((c.a)localObject).Jn();
    woG.put(paramString, localObject);
    GMTrace.o(16020093796352L, 119359);
    return (c)localObject;
  }
  
  public final com.tencent.mm.ui.contact.a.a.b PV()
  {
    GMTrace.i(2973459546112L, 22154);
    b localb = this.woH;
    GMTrace.o(2973459546112L, 22154);
    return localb;
  }
  
  protected final com.tencent.mm.ui.contact.a.a.a PW()
  {
    GMTrace.i(2973593763840L, 22155);
    a locala = this.woI;
    GMTrace.o(2973593763840L, 22155);
    return locala;
  }
  
  public final void bz(Context paramContext)
  {
    GMTrace.i(2973325328384L, 22153);
    this.hqB = h.c(paramContext, this.hqB, com.tencent.mm.br.a.V(paramContext, a.c.aQF));
    GMTrace.o(2973325328384L, 22153);
  }
  
  public final class a
    extends com.tencent.mm.ui.contact.a.a.a
  {
    public ImageView hqG;
    public TextView hqI;
    public TextView jpV;
    
    public a()
    {
      super();
      GMTrace.i(2990102544384L, 22278);
      GMTrace.o(2990102544384L, 22278);
    }
  }
  
  public final class b
    extends com.tencent.mm.ui.contact.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(2984733835264L, 22238);
      GMTrace.o(2984733835264L, 22238);
    }
    
    public final boolean PX()
    {
      GMTrace.i(2985136488448L, 22241);
      GMTrace.o(2985136488448L, 22241);
      return false;
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(2984868052992L, 22239);
      if (com.tencent.mm.br.a.ed(paramContext)) {}
      for (paramContext = LayoutInflater.from(paramContext).inflate(a.f.oFu, paramViewGroup, false);; paramContext = LayoutInflater.from(paramContext).inflate(a.f.oFt, paramViewGroup, false))
      {
        paramViewGroup = (a.a)a.this.woI;
        paramViewGroup.hqG = ((ImageView)paramContext.findViewById(a.e.bfq));
        paramViewGroup.jpV = ((TextView)paramContext.findViewById(a.e.chT));
        paramViewGroup.hqI = ((TextView)paramContext.findViewById(a.e.bti));
        paramViewGroup.hqI.setVisibility(8);
        paramContext.setTag(paramViewGroup);
        GMTrace.o(2984868052992L, 22239);
        return paramContext;
      }
    }
    
    public final void a(Context paramContext, com.tencent.mm.ui.contact.a.a.a parama, com.tencent.mm.ui.contact.a.a parama1, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(2985002270720L, 22240);
      paramContext = (a)parama1;
      parama = (a.a)parama;
      e.a(paramContext.hqB, parama.jpV);
      n.Jd().a(paramContext.woF, parama.hqG, a.VO(paramContext.username));
      GMTrace.o(2985002270720L, 22240);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */