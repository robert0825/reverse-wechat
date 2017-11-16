package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.az.k;

public class FTSWebViewUI
  extends FTSBaseWebViewUI
{
  public FTSWebViewUI()
  {
    GMTrace.i(12304410214400L, 91675);
    GMTrace.o(12304410214400L, 91675);
  }
  
  protected final void aaO()
  {
    GMTrace.i(12304678649856L, 91677);
    super.aaO();
    k.gR(this.scene);
    GMTrace.o(12304678649856L, 91677);
  }
  
  protected final String getHint()
  {
    GMTrace.i(12304544432128L, 91676);
    String str = getString(R.l.cUr);
    GMTrace.o(12304544432128L, 91676);
    return str;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12305081303040L, 91680);
    super.onDestroy();
    k.KE();
    k.KF();
    GMTrace.o(12305081303040L, 91680);
  }
  
  protected void onPause()
  {
    GMTrace.i(12304947085312L, 91679);
    super.onPause();
    k.KD();
    GMTrace.o(12304947085312L, 91679);
  }
  
  protected void onResume()
  {
    GMTrace.i(12304812867584L, 91678);
    super.onResume();
    k.KC();
    GMTrace.o(12304812867584L, 91678);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\fts\FTSWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */