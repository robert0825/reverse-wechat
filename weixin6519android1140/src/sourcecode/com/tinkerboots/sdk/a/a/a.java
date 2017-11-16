package com.tinkerboots.sdk.a.a;

import android.content.Context;
import com.tinkerboots.sdk.b.c;
import java.util.Map;

public class a
  implements b
{
  public boolean aHv()
  {
    Context localContext = com.tinkerboots.sdk.b.b.getContext();
    com.tencent.tinker.lib.d.a locala = com.tencent.tinker.lib.d.a.hQ(localContext);
    if (!com.tinkerboots.sdk.b.a.isConnected(localContext))
    {
      com.tencent.tinker.lib.e.a.i("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, not connect to internet", new Object[0]);
      return false;
    }
    if (com.tencent.tinker.lib.e.b.hS(localContext))
    {
      com.tencent.tinker.lib.e.a.i("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, tinker service is running", new Object[0]);
      return false;
    }
    if (!locala.qoU)
    {
      com.tencent.tinker.lib.e.a.i("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, only request on the main process", new Object[0]);
      return false;
    }
    if (c.csP())
    {
      com.tencent.tinker.lib.e.a.e("Tinker.PatchRequestCallback", "TinkerBootsRequestCallback: beforePatchRequest return false, is in ignore channel, current channel:%s", new Object[] { c.csO() });
      return false;
    }
    return true;
  }
  
  public void aHw() {}
  
  public void w(Map<String, String> paramMap) {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tinkerboots\sdk\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */