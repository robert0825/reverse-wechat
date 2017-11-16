package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class j
  extends a
{
  int pGG;
  
  public j(Context paramContext, s params, ViewGroup paramViewGroup)
  {
    super(paramContext, params, paramViewGroup);
    GMTrace.i(8232244346880L, 61335);
    this.pGG = 0;
    GMTrace.o(8232244346880L, 61335);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8232512782336L, 61337);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8232512782336L, 61337);
      return false;
    }
    try
    {
      paramJSONObject.put("clickCount", this.pGG);
      GMTrace.o(8232512782336L, 61337);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.Sns.AdLandingPageBtnBaseComp", paramJSONObject, "", new Object[0]);
      GMTrace.o(8232512782336L, 61337);
    }
    return false;
  }
  
  protected final void bkP()
  {
    GMTrace.i(8232378564608L, 61336);
    this.pGG += 1;
    GMTrace.o(8232378564608L, 61336);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */