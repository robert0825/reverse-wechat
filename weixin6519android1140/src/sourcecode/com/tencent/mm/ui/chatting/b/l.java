package com.tencent.mm.ui.chatting.b;

import android.annotation.TargetApi;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

@TargetApi(11)
public final class l
{
  public static void a(ListView paramListView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(19195685240832L, 143019);
    if (paramListView == null)
    {
      GMTrace.o(19195685240832L, 143019);
      return;
    }
    w.i("MicroMsg.ChattingUI.ScrollController", "setSelectionFromTop position %s smooth %s", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean) });
    paramListView.setItemChecked(paramInt1, true);
    paramListView.setSelectionFromTop(paramInt1, paramInt2);
    GMTrace.o(19195685240832L, 143019);
  }
  
  public static void a(ListView paramListView, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(19195551023104L, 143018);
    if (paramListView == null)
    {
      GMTrace.o(19195551023104L, 143018);
      return;
    }
    w.i("MicroMsg.ChattingUI.ScrollController", "setSelection position %s smooth %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    paramListView.setItemChecked(paramInt, true);
    paramListView.setSelection(paramInt);
    GMTrace.o(19195551023104L, 143018);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */