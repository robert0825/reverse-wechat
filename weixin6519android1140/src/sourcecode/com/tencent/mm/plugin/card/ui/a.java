package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends BaseAdapter
{
  List<CardInfo> jCF;
  HashMap<String, Integer> jDD;
  Context mContext;
  
  public a(Context paramContext)
  {
    GMTrace.i(4984175329280L, 37135);
    this.jCF = new ArrayList();
    this.jDD = new HashMap();
    this.mContext = paramContext;
    GMTrace.o(4984175329280L, 37135);
  }
  
  public final int getCount()
  {
    GMTrace.i(4984309547008L, 37136);
    int i = this.jCF.size();
    GMTrace.o(4984309547008L, 37136);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(4984577982464L, 37138);
    long l = paramInt;
    GMTrace.o(4984577982464L, 37138);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(4984712200192L, 37139);
    CardInfo localCardInfo = lN(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, R.i.cqD, null);
      paramViewGroup = new a();
      paramViewGroup.jDt = ((RelativeLayout)paramView.findViewById(R.h.bjI));
      paramViewGroup.jDE = ((LinearLayout)paramView.findViewById(R.h.blO));
      paramViewGroup.jDu = ((ImageView)paramView.findViewById(R.h.bkx));
      paramViewGroup.jDv = ((TextView)paramView.findViewById(R.h.bjo));
      paramViewGroup.jDw = ((TextView)paramView.findViewById(R.h.bkW));
      paramViewGroup.jDx = ((TextView)paramView.findViewById(R.h.subtitle));
      paramViewGroup.jDz = ((TextView)paramView.findViewById(R.h.bkX));
      paramViewGroup.jDF = ((ImageView)paramView.findViewById(R.h.bkP));
      paramViewGroup.jDG = ((TextView)paramView.findViewById(R.h.bjJ));
      paramViewGroup.jDH = ((TextView)paramView.findViewById(R.h.blB));
      paramView.setTag(paramViewGroup);
      if (!localCardInfo.ajh()) {
        break label992;
      }
      paramViewGroup.jDu.setVisibility(0);
      paramViewGroup.jDw.setVisibility(0);
      paramViewGroup.jDx.setVisibility(0);
      paramViewGroup.jDz.setVisibility(8);
      paramViewGroup.jDv.setVisibility(0);
      paramViewGroup.jDv.setText(localCardInfo.ajv().jyT);
      if (!localCardInfo.aje()) {
        break label749;
      }
      if ((localCardInfo.ajv().tZI == null) || (localCardInfo.ajv().tZI.size() != 1)) {
        break label634;
      }
      paramViewGroup.jDw.setText(((np)localCardInfo.ajv().tZI.get(0)).title);
      label320:
      if (localCardInfo.ajv().uah != 1) {
        break label769;
      }
      paramViewGroup.jDF.setVisibility(0);
      label342:
      long l = ((CardInfo)localCardInfo).field_begin_time;
      if ((localCardInfo.getEndTime() <= 0L) || (l <= 0L)) {
        break label781;
      }
      paramViewGroup.jDx.setText(this.mContext.getString(R.l.del, new Object[] { l.ax(l) + "  -  " + l.ax(localCardInfo.getEndTime()) }));
      paramViewGroup.jDx.setVisibility(0);
      label439:
      paramInt = this.mContext.getResources().getDimensionPixelSize(R.f.aRn);
      m.a(paramViewGroup.jDu, localCardInfo.ajv().jxH, paramInt, R.g.aYg, true);
      if (localCardInfo.ajv().uaf != 1) {
        break label860;
      }
      paramViewGroup.jDu.setAlpha(255);
      paramViewGroup.jDH.setVisibility(8);
      paramViewGroup.jDw.setTextColor(this.mContext.getResources().getColor(R.e.aNe));
      paramViewGroup.jDv.setTextColor(this.mContext.getResources().getColor(R.e.aNe));
      paramViewGroup.jDx.setTextColor(this.mContext.getResources().getColor(R.e.aNR));
      label568:
      paramInt = ((Integer)this.jDD.get(localCardInfo.ajA())).intValue();
      if (paramInt != 1) {
        break label957;
      }
      paramViewGroup.jDG.setText("");
      paramViewGroup.jDG.setVisibility(8);
    }
    for (;;)
    {
      GMTrace.o(4984712200192L, 37139);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label634:
      if ((localCardInfo.ajv().tZI == null) || (localCardInfo.ajv().tZI.size() != 2)) {
        break label320;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(((np)localCardInfo.ajv().tZI.get(0)).title);
      localStringBuilder.append("-");
      localStringBuilder.append(((np)localCardInfo.ajv().tZI.get(1)).title);
      paramViewGroup.jDw.setText(localStringBuilder.toString());
      break label320;
      label749:
      paramViewGroup.jDw.setText(localCardInfo.ajv().title);
      break label320;
      label769:
      paramViewGroup.jDF.setVisibility(8);
      break label342;
      label781:
      if (localCardInfo.getEndTime() > 0L)
      {
        paramViewGroup.jDx.setText(this.mContext.getString(R.l.dek, new Object[] { l.ax(localCardInfo.getEndTime()) }));
        paramViewGroup.jDx.setVisibility(0);
        break label439;
      }
      paramViewGroup.jDx.setText("");
      paramViewGroup.jDx.setVisibility(8);
      break label439;
      label860:
      paramViewGroup.jDH.setText(localCardInfo.ajv().uag);
      paramViewGroup.jDu.setAlpha(90);
      paramViewGroup.jDH.setVisibility(0);
      paramViewGroup.jDw.setTextColor(this.mContext.getResources().getColor(R.e.aNR));
      paramViewGroup.jDv.setTextColor(this.mContext.getResources().getColor(R.e.aNR));
      paramViewGroup.jDx.setTextColor(this.mContext.getResources().getColor(R.e.aNR));
      break label568;
      label957:
      paramViewGroup.jDG.setText("x" + paramInt);
      paramViewGroup.jDG.setVisibility(0);
      continue;
      label992:
      paramViewGroup.jDu.setVisibility(8);
      paramViewGroup.jDw.setVisibility(8);
      paramViewGroup.jDv.setVisibility(8);
      paramViewGroup.jDx.setVisibility(8);
      paramViewGroup.jDH.setVisibility(8);
      paramViewGroup.jDG.setVisibility(8);
      paramViewGroup.jDz.setVisibility(0);
      paramViewGroup.jDt.setBackgroundColor(this.mContext.getResources().getColor(R.e.aNj));
      paramViewGroup.jDz.setText(this.mContext.getResources().getString(R.l.ddo));
    }
  }
  
  public final CardInfo lN(int paramInt)
  {
    GMTrace.i(4984443764736L, 37137);
    CardInfo localCardInfo = (CardInfo)this.jCF.get(paramInt);
    GMTrace.o(4984443764736L, 37137);
    return localCardInfo;
  }
  
  public final class a
  {
    public LinearLayout jDE;
    public ImageView jDF;
    public TextView jDG;
    public TextView jDH;
    public RelativeLayout jDt;
    public ImageView jDu;
    public TextView jDv;
    public TextView jDw;
    public TextView jDx;
    public TextView jDz;
    
    public a()
    {
      GMTrace.i(4958942396416L, 36947);
      GMTrace.o(4958942396416L, 36947);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */