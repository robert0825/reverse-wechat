package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import java.util.ArrayList;
import java.util.List;

public class ChattingUILayout
  extends BasePanelKeybordLayout
{
  private ChatFooterBottom tAL;
  
  public ChattingUILayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(968515125248L, 7216);
    GMTrace.o(968515125248L, 7216);
  }
  
  private ChatFooterBottom i(ViewGroup paramViewGroup)
  {
    GMTrace.i(968649342976L, 7217);
    if (this.tAL != null)
    {
      paramViewGroup = this.tAL;
      GMTrace.o(968649342976L, 7217);
      return paramViewGroup;
    }
    if ((paramViewGroup == null) || (paramViewGroup.getChildCount() <= 0))
    {
      paramViewGroup = this.tAL;
      GMTrace.o(968649342976L, 7217);
      return paramViewGroup;
    }
    int i = 0;
    while (i < paramViewGroup.getChildCount())
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ChatFooterBottom))
      {
        this.tAL = ((ChatFooterBottom)localView);
        paramViewGroup = this.tAL;
        GMTrace.o(968649342976L, 7217);
        return paramViewGroup;
      }
      if (((localView instanceof ViewGroup)) && (i((ViewGroup)localView) != null))
      {
        paramViewGroup = this.tAL;
        GMTrace.o(968649342976L, 7217);
        return paramViewGroup;
      }
      i += 1;
    }
    paramViewGroup = this.tAL;
    GMTrace.o(968649342976L, 7217);
    return paramViewGroup;
  }
  
  protected final List<View> aMU()
  {
    GMTrace.i(16679102840832L, 124269);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(i(this));
    GMTrace.o(16679102840832L, 124269);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\ChattingUILayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */