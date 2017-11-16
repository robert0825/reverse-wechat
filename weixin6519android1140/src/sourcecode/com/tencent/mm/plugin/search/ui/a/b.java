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
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.storage.x;
import java.util.List;

public abstract class b
  extends a
{
  public i hWl;
  public List<String> hWm;
  public x iBi;
  public CharSequence jvL;
  public CharSequence jvM;
  a oDX;
  public String username;
  
  public b(int paramInt)
  {
    super(1, paramInt);
    GMTrace.i(11845654020096L, 88257);
    this.oDX = new a();
    GMTrace.o(11845654020096L, 88257);
  }
  
  protected final a.a Vv()
  {
    GMTrace.i(18367964512256L, 136852);
    a locala = this.oDX;
    GMTrace.o(18367964512256L, 136852);
    return locala;
  }
  
  public final int Vx()
  {
    GMTrace.i(11845788237824L, 88258);
    int i = this.hWl.lxn;
    GMTrace.o(11845788237824L, 88258);
    return i;
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
      GMTrace.i(11850754293760L, 88295);
      GMTrace.o(11850754293760L, 88295);
    }
  }
  
  public abstract class b
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(11849143681024L, 88283);
      GMTrace.o(11849143681024L, 88283);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11849277898752L, 88284);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cxG, paramViewGroup, false);
      paramViewGroup = (b.a)b.this.oDX;
      paramViewGroup.hqG = ((ImageView)paramContext.findViewById(R.h.bfq));
      paramViewGroup.hqH = ((TextView)paramContext.findViewById(R.h.chT));
      paramViewGroup.hqI = ((TextView)paramContext.findViewById(R.h.bti));
      paramViewGroup.hqF = paramContext.findViewById(R.h.cay);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11849277898752L, 88284);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(16472675975168L, 122731);
      paramContext = (b.a)parama;
      parama = (b)paramVarArgs;
      ck(paramContext.hqF);
      com.tencent.mm.pluginsdk.ui.a.b.a(paramContext.hqG, parama.username);
      e.a(parama.jvL, paramContext.hqH);
      e.a(parama.jvM, paramContext.hqI);
      GMTrace.o(16472675975168L, 122731);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */