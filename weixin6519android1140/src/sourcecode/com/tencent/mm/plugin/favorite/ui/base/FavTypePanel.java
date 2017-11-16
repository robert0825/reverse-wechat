package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import java.util.List;

public class FavTypePanel
  extends LinearLayout
{
  private LinearLayout lgp;
  private View.OnClickListener lgu;
  public a lhg;
  
  public FavTypePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6446611693568L, 48031);
    this.lgu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6459765030912L, 48129);
        ImageButton localImageButton = (ImageButton)paramAnonymousView.findViewById(R.h.bzz);
        int i = ((Integer)paramAnonymousView.getTag(R.h.byH)).intValue();
        int j = ((Integer)paramAnonymousView.getTag(R.h.bzo)).intValue();
        if (j == 0)
        {
          localImageButton.setImageResource(FavTypePanel.nI(i));
          paramAnonymousView.setTag(R.h.bzo, Integer.valueOf(1));
          if (FavTypePanel.a(FavTypePanel.this) != null)
          {
            paramAnonymousView = FavTypePanel.a(FavTypePanel.this);
            if (1 != j) {
              break label139;
            }
          }
        }
        label139:
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousView.y(i, bool);
          GMTrace.o(6459765030912L, 48129);
          return;
          localImageButton.setImageResource(FavTypePanel.nJ(i));
          paramAnonymousView.setTag(R.h.bzo, Integer.valueOf(0));
          break;
        }
      }
    };
    this.lgp = this;
    a(this.lgp, R.k.cMt, R.l.duT, 5);
    a(this.lgp, R.k.cMr, R.l.duP, 2);
    a(this.lgp, R.k.cMx, R.l.duV, 3);
    a(this.lgp, R.k.cMp, R.l.duR, 7);
    a(this.lgp, R.k.cMv, R.l.duU, 4);
    GMTrace.o(6446611693568L, 48031);
  }
  
  private void a(LinearLayout paramLinearLayout, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(6447014346752L, 48034);
    View localView = View.inflate(getContext(), R.i.cwN, null);
    localView.setTag(R.h.byH, Integer.valueOf(paramInt3));
    localView.setTag(R.h.bzo, Integer.valueOf(1));
    localView.setOnClickListener(this.lgu);
    ((ImageButton)localView.findViewById(R.h.bzz)).setImageResource(paramInt1);
    ((TextView)localView.findViewById(R.h.bzA)).setText(paramInt2);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -2);
    localLayoutParams.weight = 1.0F;
    paramLinearLayout.addView(localView, localLayoutParams);
    GMTrace.o(6447014346752L, 48034);
  }
  
  private static int nG(int paramInt)
  {
    GMTrace.i(6446745911296L, 48032);
    switch (paramInt)
    {
    case 6: 
    default: 
      GMTrace.o(6446745911296L, 48032);
      return 0;
    case 5: 
      paramInt = R.k.cMt;
      GMTrace.o(6446745911296L, 48032);
      return paramInt;
    case 2: 
      paramInt = R.k.cMr;
      GMTrace.o(6446745911296L, 48032);
      return paramInt;
    case 7: 
      paramInt = R.k.cMp;
      GMTrace.o(6446745911296L, 48032);
      return paramInt;
    case 3: 
      paramInt = R.k.cMx;
      GMTrace.o(6446745911296L, 48032);
      return paramInt;
    }
    paramInt = R.k.cMv;
    GMTrace.o(6446745911296L, 48032);
    return paramInt;
  }
  
  private static int nH(int paramInt)
  {
    GMTrace.i(6446880129024L, 48033);
    switch (paramInt)
    {
    case 6: 
    default: 
      GMTrace.o(6446880129024L, 48033);
      return 0;
    case 5: 
      paramInt = R.k.cMu;
      GMTrace.o(6446880129024L, 48033);
      return paramInt;
    case 2: 
      paramInt = R.k.cMs;
      GMTrace.o(6446880129024L, 48033);
      return paramInt;
    case 7: 
      paramInt = R.k.cMq;
      GMTrace.o(6446880129024L, 48033);
      return paramInt;
    case 3: 
      paramInt = R.k.cMy;
      GMTrace.o(6446880129024L, 48033);
      return paramInt;
    }
    paramInt = R.k.cMw;
    GMTrace.o(6446880129024L, 48033);
    return paramInt;
  }
  
  public final void aD(List<Integer> paramList)
  {
    GMTrace.i(6447148564480L, 48035);
    int i = 0;
    if (i < this.lgp.getChildCount())
    {
      View localView = this.lgp.getChildAt(i);
      Integer localInteger = (Integer)localView.getTag(R.h.byH);
      if ((paramList != null) && (paramList.contains(localInteger)))
      {
        ((ImageButton)localView.findViewById(R.h.bzz)).setImageResource(nH(localInteger.intValue()));
        localView.setTag(R.h.bzo, Integer.valueOf(0));
      }
      for (;;)
      {
        i += 1;
        break;
        ((ImageButton)localView.findViewById(R.h.bzz)).setImageResource(nG(localInteger.intValue()));
        localView.setTag(R.h.bzo, Integer.valueOf(1));
      }
    }
    GMTrace.o(6447148564480L, 48035);
  }
  
  public static abstract interface a
  {
    public abstract void y(int paramInt, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\FavTypePanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */