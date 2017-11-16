package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.h;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;

public class GameMessageListContainerView
  extends LinearLayout
{
  private Context mContext;
  
  public GameMessageListContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12743033749504L, 94943);
    this.mContext = paramContext;
    GMTrace.o(12743033749504L, 94943);
  }
  
  public final void a(q paramq, LinkedList<q.h> paramLinkedList, int paramInt1, int paramInt2, f<String, Bitmap> paramf)
  {
    GMTrace.i(12743302184960L, 94945);
    if ((paramq == null) || (bg.cc(paramLinkedList)))
    {
      setVisibility(8);
      GMTrace.o(12743302184960L, 94945);
      return;
    }
    setVisibility(0);
    int i;
    int j;
    label65:
    GameMessageListUserIconView localGameMessageListUserIconView;
    if (paramInt1 > paramLinkedList.size())
    {
      i = 1;
      j = this.mContext.getResources().getDimensionPixelSize(R.f.aPv);
      if (getChildCount() >= i) {
        break label159;
      }
      localGameMessageListUserIconView = new GameMessageListUserIconView(this.mContext);
      if (getChildCount() > 0) {
        localGameMessageListUserIconView.setPadding(0, j, 0, 0);
      }
      if (localGameMessageListUserIconView.maf == null) {
        break label137;
      }
      localGameMessageListUserIconView.maf.lNQ = paramInt2;
    }
    for (;;)
    {
      addView(localGameMessageListUserIconView);
      break label65;
      i = 2;
      break;
      label137:
      localGameMessageListUserIconView.maf = new r(localGameMessageListUserIconView.mContext, paramInt2);
    }
    label159:
    paramInt2 = 0;
    if (paramInt2 < getChildCount())
    {
      if (paramInt2 < i)
      {
        getChildAt(paramInt2).setVisibility(0);
        localGameMessageListUserIconView = (GameMessageListUserIconView)getChildAt(paramInt2);
        LinkedList localLinkedList = new LinkedList();
        j = paramInt2 * paramInt1;
        while ((j < (paramInt2 + 1) * paramInt1) && (j < paramLinkedList.size()))
        {
          localLinkedList.add(paramLinkedList.get(j));
          j += 1;
        }
        localGameMessageListUserIconView.a(paramq, localLinkedList, paramf);
      }
      for (;;)
      {
        paramInt2 += 1;
        break;
        getChildAt(paramInt2).setVisibility(8);
      }
    }
    GMTrace.o(12743302184960L, 94945);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12743167967232L, 94944);
    super.onFinishInflate();
    GMTrace.o(12743167967232L, 94944);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameMessageListContainerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */