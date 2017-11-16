package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.d.h;
import java.util.LinkedList;

public class GameListSocialView
  extends LinearLayout
{
  public GameListSocialView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12728404017152L, 94834);
    GMTrace.o(12728404017152L, 94834);
  }
  
  public final void I(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(12728672452608L, 94836);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0) || (paramLinkedList.size() % 2 != 0))
    {
      setVisibility(8);
      GMTrace.o(12728672452608L, 94836);
      return;
    }
    setVisibility(0);
    if (getChildCount() < paramLinkedList.size() / 2)
    {
      int j = paramLinkedList.size() / 2;
      int k = getChildCount();
      i = 0;
      while (i < j - k)
      {
        inflate(getContext(), R.i.cyV, this);
        i += 1;
      }
    }
    int i = 0;
    if (i < getChildCount())
    {
      if (i < paramLinkedList.size() / 2) {
        getChildAt(i).setVisibility(0);
      }
      for (;;)
      {
        i += 1;
        break;
        getChildAt(i).setVisibility(8);
      }
    }
    i = 0;
    while (i < paramLinkedList.size() / 2)
    {
      Object localObject = getChildAt(i);
      TextView localTextView = (TextView)((View)localObject).findViewById(R.h.bEY);
      localObject = (TextView)((View)localObject).findViewById(R.h.bEZ);
      localTextView.setText(h.b(getContext(), (CharSequence)paramLinkedList.get(i * 2), localTextView.getTextSize()));
      ((TextView)localObject).setText(h.b(getContext(), (CharSequence)paramLinkedList.get(i * 2 + 1), ((TextView)localObject).getTextSize()));
      i += 1;
    }
    GMTrace.o(12728672452608L, 94836);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12728538234880L, 94835);
    super.onFinishInflate();
    GMTrace.o(12728538234880L, 94835);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameListSocialView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */