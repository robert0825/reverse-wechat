package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.wxpay.a.d;
import java.util.Iterator;
import java.util.LinkedList;

public class FavourLayout
  extends LinearLayout
{
  public FavourLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(18038459990016L, 134397);
    GMTrace.o(18038459990016L, 134397);
  }
  
  public FavourLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18038594207744L, 134398);
    GMTrace.o(18038594207744L, 134398);
  }
  
  public final void ap(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(18038728425472L, 134399);
    removeAllViews();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      String str = (String)paramLinkedList.next();
      TextView localTextView = new TextView(getContext());
      localTextView.setText(str);
      localTextView.setTextColor(Color.parseColor("#ff891e"));
      localTextView.setTextSize(0, a.V(getContext(), a.d.snb));
      addView(localTextView);
    }
    GMTrace.o(18038728425472L, 134399);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\view\FavourLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */