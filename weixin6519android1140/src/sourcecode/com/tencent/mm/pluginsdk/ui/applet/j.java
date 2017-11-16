package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import java.util.List;

public final class j
  extends BaseAdapter
{
  private List<String> hqV;
  private Context mContext;
  private List<String> txQ;
  
  public j(Context paramContext, List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(967709818880L, 7210);
    this.mContext = paramContext;
    this.hqV = paramList2;
    this.txQ = paramList1;
    GMTrace.o(967709818880L, 7210);
  }
  
  private static a cW(View paramView)
  {
    GMTrace.i(968380907520L, 7215);
    a locala = new a();
    locala.hqG = ((ImageView)paramView.findViewById(R.h.bmh));
    locala.jUm = ((TextView)paramView.findViewById(R.h.bmk));
    paramView.setTag(locala);
    GMTrace.o(968380907520L, 7215);
    return locala;
  }
  
  public final int getCount()
  {
    GMTrace.i(967844036608L, 7211);
    int i = this.hqV.size();
    GMTrace.o(967844036608L, 7211);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(967978254336L, 7212);
    Object localObject = this.hqV.get(paramInt);
    GMTrace.o(967978254336L, 7212);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(968112472064L, 7213);
    long l = paramInt;
    GMTrace.o(968112472064L, 7213);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(968246689792L, 7214);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, R.i.crL, null);
      paramViewGroup = cW(paramView);
    }
    label254:
    label268:
    for (;;)
    {
      int i = this.hqV.size();
      if ((paramInt >= 0) && (paramInt < this.hqV.size()) && (paramInt < this.txQ.size()))
      {
        paramViewGroup.hqG.setVisibility(0);
        paramViewGroup.jUm.setVisibility(0);
        a.b.a(paramViewGroup.hqG, (String)this.txQ.get(paramInt));
        paramViewGroup.jUm.setText((CharSequence)this.hqV.get(paramInt));
        paramViewGroup.jUm.setText(((com.tencent.mm.plugin.emoji.b.a)h.h(com.tencent.mm.plugin.emoji.b.a.class)).a(this.mContext, (CharSequence)this.hqV.get(paramInt), paramViewGroup.jUm.getTextSize()));
        if ((this.hqV.size() <= 12) || (paramInt < this.hqV.size() - i % 4)) {
          break label254;
        }
        paramViewGroup.jUm.setPadding(0, 0, 0, com.tencent.mm.br.a.V(this.mContext, R.f.aPP));
      }
      for (;;)
      {
        GMTrace.o(968246689792L, 7214);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        if (paramViewGroup != null) {
          break label268;
        }
        paramViewGroup = cW(paramView);
        break;
        paramViewGroup.jUm.setPadding(0, 0, 0, 0);
      }
    }
  }
  
  private static final class a
  {
    public ImageView hqG;
    public TextView jUm;
    
    public a()
    {
      GMTrace.i(947845595136L, 7062);
      GMTrace.o(947845595136L, 7062);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */