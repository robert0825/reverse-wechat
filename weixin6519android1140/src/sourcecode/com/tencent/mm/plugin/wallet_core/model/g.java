package com.tencent.mm.plugin.wallet_core.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.c.b;

public final class g
{
  public int rft;
  public String rfu;
  public int rfv;
  public String rfw;
  public int rfx;
  public b rfy;
  
  public g()
  {
    GMTrace.i(6908052242432L, 51469);
    this.rft = 0;
    this.rfu = "";
    this.rfv = 0;
    this.rfw = "";
    this.rfx = 0;
    this.rfy = new b();
    GMTrace.o(6908052242432L, 51469);
  }
  
  public g(Bundle paramBundle)
  {
    GMTrace.i(6908186460160L, 51470);
    this.rft = 0;
    this.rfu = "";
    this.rfv = 0;
    this.rfw = "";
    this.rfx = 0;
    this.rfy = new b();
    this.rft = paramBundle.getInt("key_is_gen_cert", 0);
    this.rfv = paramBundle.getInt("key_is_hint_crt", 0);
    this.rfx = paramBundle.getInt("key_is_ignore_cert", 0);
    this.rfu = paramBundle.getString("key_crt_token", "");
    this.rfw = paramBundle.getString("key_crt_wording", "");
    this.rfy = new b(this.rfw);
    GMTrace.o(6908186460160L, 51470);
  }
  
  public final boolean byk()
  {
    GMTrace.i(6908320677888L, 51471);
    if ((this.rfv != 0) && (!bg.nm(this.rfw)))
    {
      GMTrace.o(6908320677888L, 51471);
      return true;
    }
    GMTrace.o(6908320677888L, 51471);
    return false;
  }
  
  public final boolean byl()
  {
    GMTrace.i(6908454895616L, 51472);
    if (this.rft == 1)
    {
      GMTrace.o(6908454895616L, 51472);
      return true;
    }
    GMTrace.o(6908454895616L, 51472);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */