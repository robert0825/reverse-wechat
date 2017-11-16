package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.az.k;
import com.tencent.mm.sdk.platformtools.ab;

public class FTSSearchTabWebViewUI
  extends FTSBaseWebViewUI
{
  public FTSSearchTabWebViewUI()
  {
    GMTrace.i(12311792189440L, 91730);
    GMTrace.o(12311792189440L, 91730);
  }
  
  protected final String getHint()
  {
    GMTrace.i(12311926407168L, 91731);
    String str = getIntent().getStringExtra("key_search_input_hint");
    if (!TextUtils.isEmpty(str))
    {
      GMTrace.o(12311926407168L, 91731);
      return str;
    }
    int i = -1;
    switch (this.type)
    {
    }
    while (i < 0)
    {
      str = ab.getContext().getResources().getString(R.l.cUr);
      GMTrace.o(12311926407168L, 91731);
      return str;
      i = R.l.dWq;
      continue;
      i = R.l.dyw;
      continue;
      i = R.l.dWp;
      continue;
      i = R.l.dyv;
      continue;
      i = R.l.cRT;
      continue;
      i = R.l.dyr;
      continue;
      i = R.l.dys;
      continue;
      i = R.l.dyt;
      continue;
      i = R.l.dyu;
    }
    str = ab.getContext().getResources().getString(R.l.dWo, new Object[] { ab.getContext().getResources().getString(i) });
    GMTrace.o(12311926407168L, 91731);
    return str;
  }
  
  protected void onPause()
  {
    GMTrace.i(12312194842624L, 91733);
    super.onPause();
    k.KD();
    GMTrace.o(12312194842624L, 91733);
  }
  
  protected void onResume()
  {
    GMTrace.i(12312060624896L, 91732);
    super.onResume();
    k.KC();
    GMTrace.o(12312060624896L, 91732);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\fts\FTSSearchTabWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */