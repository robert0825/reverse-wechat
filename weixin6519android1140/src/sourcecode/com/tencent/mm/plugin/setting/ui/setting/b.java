package com.tencent.mm.plugin.setting.ui.setting;

import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

final class b
{
  LinearLayout oLC;
  LinearLayout oLD;
  LinearLayout oLE;
  LinearLayout oLF;
  LinearLayout oLG;
  
  b()
  {
    GMTrace.i(4620445286400L, 34425);
    GMTrace.o(4620445286400L, 34425);
  }
  
  public final void Gm(String paramString)
  {
    GMTrace.i(4620579504128L, 34426);
    if (paramString.equals("downloading"))
    {
      this.oLC.setVisibility(0);
      this.oLD.setVisibility(8);
      this.oLE.setVisibility(8);
      this.oLF.setVisibility(8);
      this.oLG.setVisibility(8);
      GMTrace.o(4620579504128L, 34426);
      return;
    }
    if (paramString.equals("downloaded"))
    {
      this.oLC.setVisibility(8);
      this.oLD.setVisibility(0);
      this.oLE.setVisibility(8);
      this.oLF.setVisibility(8);
      this.oLG.setVisibility(8);
      GMTrace.o(4620579504128L, 34426);
      return;
    }
    if (paramString.equals("undownloaded"))
    {
      this.oLC.setVisibility(8);
      this.oLD.setVisibility(8);
      this.oLE.setVisibility(0);
      this.oLF.setVisibility(8);
      this.oLG.setVisibility(8);
      GMTrace.o(4620579504128L, 34426);
      return;
    }
    if (paramString.equals("using"))
    {
      this.oLC.setVisibility(8);
      this.oLD.setVisibility(8);
      this.oLE.setVisibility(8);
      this.oLF.setVisibility(0);
      this.oLG.setVisibility(8);
      GMTrace.o(4620579504128L, 34426);
      return;
    }
    if (paramString.equals("canceling"))
    {
      this.oLC.setVisibility(8);
      this.oLD.setVisibility(8);
      this.oLE.setVisibility(8);
      this.oLF.setVisibility(8);
      this.oLG.setVisibility(0);
      GMTrace.o(4620579504128L, 34426);
      return;
    }
    GMTrace.o(4620579504128L, 34426);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */