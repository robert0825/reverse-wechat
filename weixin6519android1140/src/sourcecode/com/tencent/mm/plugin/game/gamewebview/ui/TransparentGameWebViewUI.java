package com.tencent.mm.plugin.game.gamewebview.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.a;

@a(1)
public class TransparentGameWebViewUI
  extends GameWebViewUI
{
  public TransparentGameWebViewUI()
  {
    GMTrace.i(17995644534784L, 134078);
    GMTrace.o(17995644534784L, 134078);
  }
  
  protected final void MP()
  {
    GMTrace.i(17995778752512L, 134079);
    super.MP();
    this.lIW.setBackgroundColor(0);
    GMTrace.o(17995778752512L, 134079);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ui\TransparentGameWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */