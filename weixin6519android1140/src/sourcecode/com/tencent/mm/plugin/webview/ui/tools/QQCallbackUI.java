package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.MMActivity;

@JgClassChecked(author=20, fComment="checked", lastDate="20150202", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class QQCallbackUI
  extends MMActivity
{
  public QQCallbackUI()
  {
    GMTrace.i(12284948643840L, 91530);
    GMTrace.o(12284948643840L, 91530);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12285082861568L, 91531);
    GMTrace.o(12285082861568L, 91531);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12285217079296L, 91532);
    super.onCreate(paramBundle);
    finish();
    GMTrace.o(12285217079296L, 91532);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\QQCallbackUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */