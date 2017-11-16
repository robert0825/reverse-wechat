package com.tencent.mm.plugin.game.gamewebview.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;

public final class a
{
  boolean lIN;
  private String lIO;
  private String lIP;
  private String lIQ;
  private String lIR;
  private String lIS;
  private String lIT;
  private String lang;
  
  public a(Bundle paramBundle)
  {
    GMTrace.i(16991159058432L, 126594);
    this.lIN = paramBundle.getBoolean("close_window_confirm_dialog_switch");
    this.lIO = paramBundle.getString("close_window_confirm_dialog_title_cn");
    this.lIP = paramBundle.getString("close_window_confirm_dialog_title_eng");
    this.lIQ = paramBundle.getString("close_window_confirm_dialog_ok_cn");
    this.lIR = paramBundle.getString("close_window_confirm_dialog_ok_eng");
    this.lIS = paramBundle.getString("close_window_confirm_dialog_cancel_cn");
    this.lIT = paramBundle.getString("close_window_confirm_dialog_cancel_eng");
    this.lang = v.eq(ab.getContext());
    GMTrace.o(16991159058432L, 126594);
  }
  
  public final String aDX()
  {
    GMTrace.i(16991293276160L, 126595);
    if ("zh_CN".equals(this.lang))
    {
      str = this.lIO;
      GMTrace.o(16991293276160L, 126595);
      return str;
    }
    String str = this.lIP;
    GMTrace.o(16991293276160L, 126595);
    return str;
  }
  
  public final String aDY()
  {
    GMTrace.i(16991427493888L, 126596);
    if ("zh_CN".equals(this.lang))
    {
      str = this.lIQ;
      GMTrace.o(16991427493888L, 126596);
      return str;
    }
    String str = this.lIR;
    GMTrace.o(16991427493888L, 126596);
    return str;
  }
  
  public final String aDZ()
  {
    GMTrace.i(16991561711616L, 126597);
    if ("zh_CN".equals(this.lang))
    {
      str = this.lIS;
      GMTrace.o(16991561711616L, 126597);
      return str;
    }
    String str = this.lIT;
    GMTrace.o(16991561711616L, 126597);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */