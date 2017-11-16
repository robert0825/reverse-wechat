package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.a.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.List;

public final class b
  extends BaseAdapter
{
  private Context context;
  List<k> dataList;
  int mode;
  
  public b(Context paramContext, int paramInt)
  {
    GMTrace.i(15038962204672L, 112049);
    this.dataList = new ArrayList();
    this.context = paramContext;
    this.mode = paramInt;
    GMTrace.o(15038962204672L, 112049);
  }
  
  public final void PU()
  {
    GMTrace.i(15039096422400L, 112050);
    this.dataList.clear();
    GMTrace.o(15039096422400L, 112050);
  }
  
  public final int getCount()
  {
    GMTrace.i(5631775866880L, 41960);
    int i = this.dataList.size();
    GMTrace.o(5631775866880L, 41960);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(5631910084608L, 41961);
    Object localObject = this.dataList.get(paramInt);
    GMTrace.o(5631910084608L, 41961);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(5632044302336L, 41962);
    long l = paramInt;
    GMTrace.o(5632044302336L, 41962);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5632178520064L, 41963);
    View localView = paramView;
    if (paramView == null)
    {
      localView = v.fb(this.context).inflate(a.g.sLv, paramViewGroup, false);
      localView.setTag(new a(localView));
    }
    a locala = (a)localView.getTag();
    k localk = (k)getItem(paramInt);
    locala.hqg.setImageResource(a.h.sQy);
    a.b.g(locala.hqg, localk.tMa, a.h.sQy);
    locala.hqi.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, localk.title, locala.hqi.getTextSize()));
    paramViewGroup = ((a)com.tencent.mm.kernel.h.h(a.class)).fs(localk.tMa);
    if (!bg.nm(paramViewGroup))
    {
      paramView = paramViewGroup;
      if (!paramViewGroup.endsWith("@chatroom")) {}
    }
    else
    {
      paramView = this.context.getString(a.i.sRe);
    }
    locala.hqh.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, paramView, locala.hqh.getTextSize()));
    if (this.mode == 2)
    {
      locala.hqj.setText(localk.tMm);
      locala.hqk.setText(String.format("%s%s", new Object[] { Float.valueOf((float)localk.eYB / 100.0F), this.context.getString(a.i.sRF) }));
      locala.hql.setVisibility(0);
      if (this.mode != 2) {
        break label410;
      }
      switch (localk.state)
      {
      default: 
        locala.hql.setVisibility(4);
      }
    }
    for (;;)
    {
      GMTrace.o(5632178520064L, 41963);
      return localView;
      locala.hqj.setText(localk.tMj);
      break;
      locala.hql.setText(a.i.sRs);
      locala.hql.setTextColor(this.context.getResources().getColor(a.c.slZ));
      continue;
      locala.hql.setText(a.i.sRq);
      locala.hql.setTextColor(this.context.getResources().getColor(a.c.slZ));
      continue;
      label410:
      switch (localk.state)
      {
      default: 
        locala.hql.setVisibility(4);
        break;
      case 1: 
        locala.hql.setText(a.i.sRr);
        locala.hql.setTextColor(this.context.getResources().getColor(a.c.slZ));
        break;
      case 2: 
        locala.hql.setText(a.i.sRp);
        locala.hql.setTextColor(this.context.getResources().getColor(a.c.slZ));
        break;
      case 3: 
        locala.hql.setText(a.i.sRn);
        locala.hql.setTextColor(this.context.getResources().getColor(a.c.aOL));
        break;
      case 4: 
        locala.hql.setText(a.i.sRo);
        locala.hql.setTextColor(this.context.getResources().getColor(a.c.aOL));
      }
    }
  }
  
  private final class a
  {
    public ImageView hqg;
    public TextView hqh;
    public TextView hqi;
    public TextView hqj;
    public TextView hqk;
    public TextView hql;
    
    public a(View paramView)
    {
      GMTrace.i(5617011916800L, 41850);
      this.hqg = ((ImageView)paramView.findViewById(a.f.spp));
      this.hqh = ((TextView)paramView.findViewById(a.f.spq));
      this.hqi = ((TextView)paramView.findViewById(a.f.spt));
      this.hqj = ((TextView)paramView.findViewById(a.f.spr));
      this.hqk = ((TextView)paramView.findViewById(a.f.spo));
      this.hql = ((TextView)paramView.findViewById(a.f.sps));
      GMTrace.o(5617011916800L, 41850);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */