package com.tencent.mm.compatible.d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class t
{
  public static boolean fRa;
  public String fRb;
  Map<String, String> fRc;
  public int fRd;
  
  static
  {
    GMTrace.i(13805098631168L, 102856);
    fRa = false;
    GMTrace.o(13805098631168L, 102856);
  }
  
  public t()
  {
    GMTrace.i(13804427542528L, 102851);
    this.fRb = "";
    this.fRc = null;
    this.fRd = 0;
    GMTrace.o(13804427542528L, 102851);
  }
  
  public static boolean tp()
  {
    GMTrace.i(13804695977984L, 102853);
    if (fRa)
    {
      fRa = false;
      GMTrace.o(13804695977984L, 102853);
      return true;
    }
    GMTrace.o(13804695977984L, 102853);
    return false;
  }
  
  public final void dP(String paramString)
  {
    GMTrace.i(13804830195712L, 102854);
    this.fRb = paramString;
    GMTrace.o(13804830195712L, 102854);
  }
  
  public final void er(int paramInt)
  {
    GMTrace.i(13804561760256L, 102852);
    this.fRd = paramInt;
    fRa = true;
    SharedPreferences.Editor localEditor = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "system_config_prefs", 4).edit();
    localEditor.putInt("update_swip_back_status", paramInt);
    localEditor.commit();
    w.v("MicroMsg.ManuFacturerInfo", "update mSwipBackStatus(%s)", new Object[] { Integer.valueOf(this.fRd) });
    GMTrace.o(13804561760256L, 102852);
  }
  
  public final void i(Map<String, String> paramMap)
  {
    GMTrace.i(13804964413440L, 102855);
    this.fRc = paramMap;
    GMTrace.o(13804964413440L, 102855);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\d\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */