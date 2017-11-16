package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.model.ad;
import com.tencent.mm.plugin.game.model.ad.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.List;

public final class h
  extends BaseAdapter
{
  int CH;
  int lNQ;
  private ad lWh;
  private Context mContext;
  
  public h(Context paramContext)
  {
    GMTrace.i(12767461376000L, 95125);
    this.mContext = paramContext;
    GMTrace.o(12767461376000L, 95125);
  }
  
  private void f(ViewGroup paramViewGroup)
  {
    GMTrace.i(12768266682368L, 95131);
    paramViewGroup.setClipChildren(false);
    int i = 0;
    while (i < paramViewGroup.getChildCount())
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup))
      {
        ((ViewGroup)localView).setClipChildren(false);
        f((ViewGroup)localView);
      }
      i += 1;
    }
    GMTrace.o(12768266682368L, 95131);
  }
  
  public final void a(ad paramad)
  {
    GMTrace.i(12767595593728L, 95126);
    this.lWh = paramad;
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12773501173760L, 95170);
        h.this.notifyDataSetChanged();
        GMTrace.o(12773501173760L, 95170);
      }
    });
    GMTrace.o(12767595593728L, 95126);
  }
  
  public final int getCount()
  {
    GMTrace.i(12767729811456L, 95127);
    if (this.lWh == null)
    {
      GMTrace.o(12767729811456L, 95127);
      return 0;
    }
    int i = this.lWh.lOa.size();
    GMTrace.o(12767729811456L, 95127);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(12767864029184L, 95128);
    Object localObject = this.lWh.lOa.get(paramInt);
    GMTrace.o(12767864029184L, 95128);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(12767998246912L, 95129);
    long l = paramInt;
    GMTrace.o(12767998246912L, 95129);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12768132464640L, 95130);
    Object localObject1;
    Object localObject2;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.mContext).inflate(this.CH, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.lWj = ((TextView)paramView.findViewById(R.h.bDD));
      paramViewGroup.gDc = ((ImageView)paramView.findViewById(R.h.bDA));
      paramViewGroup.iCs = ((TextView)paramView.findViewById(R.h.bDC));
      paramViewGroup.lWk = ((TextView)paramView.findViewById(R.h.bDF));
      paramViewGroup.lWl = ((TextView)paramView.findViewById(R.h.bDE));
      paramViewGroup.lWm = ((GameDetailRankLikeView)paramView.findViewById(R.h.bDB));
      paramViewGroup.lWm.lNQ = this.lNQ;
      f((ViewGroup)paramView);
      paramView.setTag(paramViewGroup);
      localObject1 = (ad.a)getItem(paramInt);
      paramViewGroup.lWj.setText(((ad.a)localObject1).lOb);
      a.b.a(paramViewGroup.gDc, ((ad.a)localObject1).eQu, 0.5F, false);
      at.AR();
      localObject2 = c.yK().TE(((ad.a)localObject1).eQu);
      if (localObject2 == null) {
        break label330;
      }
      localObject2 = new SpannableString(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, ((x)localObject2).vk(), paramViewGroup.iCs.getTextSize()));
      paramViewGroup.iCs.setText((CharSequence)localObject2);
      label257:
      if (!bg.nm(((ad.a)localObject1).tag)) {
        break label343;
      }
      paramViewGroup.lWk.setVisibility(8);
      label277:
      if (bg.nm(((ad.a)localObject1).lOe)) {
        break label366;
      }
      paramViewGroup.lWl.setText(((ad.a)localObject1).lOe);
      paramViewGroup.lWm.setVisibility(8);
    }
    for (;;)
    {
      GMTrace.o(12768132464640L, 95130);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label330:
      paramViewGroup.iCs.setText("");
      break label257;
      label343:
      paramViewGroup.lWk.setVisibility(0);
      paramViewGroup.lWk.setText(((ad.a)localObject1).tag);
      break label277;
      label366:
      paramViewGroup.lWl.setText(((ad.a)localObject1).lxd);
      localObject1 = paramViewGroup.lWm;
      localObject2 = this.lWh;
      ((GameDetailRankLikeView)localObject1).lWn = ((ad)localObject2);
      ((GameDetailRankLikeView)localObject1).hyD = ((ad)localObject2).hyD;
      ((GameDetailRankLikeView)localObject1).lWo = ((ad.a)((ad)localObject2).lOa.get(paramInt));
      ((GameDetailRankLikeView)localObject1).aGz();
      paramViewGroup.lWm.setVisibility(0);
    }
  }
  
  private final class a
  {
    public ImageView gDc;
    public TextView iCs;
    public TextView lWj;
    public TextView lWk;
    public TextView lWl;
    public GameDetailRankLikeView lWm;
    
    public a()
    {
      GMTrace.i(12684112166912L, 94504);
      GMTrace.o(12684112166912L, 94504);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */