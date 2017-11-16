package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.a.g;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.o;
import java.util.List;

public final class f
  extends BaseAdapter
{
  private static final String lMb;
  private Context mContext;
  n qim;
  
  static
  {
    GMTrace.i(18084362452992L, 134739);
    lMb = com.tencent.mm.loader.stub.a.ghz + "Game/HvMenu/";
    GMTrace.o(18084362452992L, 134739);
  }
  
  public f(Context paramContext)
  {
    GMTrace.i(18083691364352L, 134734);
    this.mContext = paramContext;
    GMTrace.o(18083691364352L, 134734);
  }
  
  public final int getCount()
  {
    GMTrace.i(18083825582080L, 134735);
    if (this.qim == null)
    {
      GMTrace.o(18083825582080L, 134735);
      return 0;
    }
    int i = this.qim.size();
    GMTrace.o(18083825582080L, 134735);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(18083959799808L, 134736);
    long l = paramInt;
    GMTrace.o(18083959799808L, 134736);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(18084094017536L, 134737);
    paramView = LayoutInflater.from(this.mContext).inflate(R.i.cyX, paramViewGroup, false);
    paramViewGroup = new a(paramView);
    o localo = (o)this.qim.wdA.get(paramInt);
    Object localObject1;
    if ((localo != null) && (localo.getItemId() != -1))
    {
      localObject1 = localo.getTitle().toString();
      if (!bg.nm((String)localObject1))
      {
        localObject1 = ((String)localObject1).split("__", 2);
        if (localObject1.length == 1)
        {
          paramViewGroup.ikm.setText(localObject1[0]);
          paramView.setTag(localo);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(18084094017536L, 134737);
      return paramView;
      paramViewGroup.ikm.setText(localObject1[0]);
      localObject1 = localObject1[1];
      if (((String)localObject1).startsWith("http"))
      {
        Object localObject2 = lMb + g.n(((String)localObject1).getBytes());
        c.a locala = new c.a();
        locala.gKC = true;
        locala.gKE = ((String)localObject2);
        localObject2 = locala.Jn();
        com.tencent.mm.ao.a.a.Jk().a((String)localObject1, paramViewGroup.iCr, (c)localObject2);
        break;
      }
      paramViewGroup.iCr.setImageResource(ab.getResources().getIdentifier((String)localObject1, "drawable", ab.getPackageName()));
      break;
      paramView.setTag(null);
    }
  }
  
  public final class a
  {
    ImageView iCr;
    TextView ikm;
    
    public a(View paramView)
    {
      GMTrace.i(18084496670720L, 134740);
      this.ikm = ((TextView)paramView.findViewById(R.h.title));
      this.iCr = ((ImageView)paramView.findViewById(R.h.icon));
      GMTrace.o(18084496670720L, 134740);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\menu\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */