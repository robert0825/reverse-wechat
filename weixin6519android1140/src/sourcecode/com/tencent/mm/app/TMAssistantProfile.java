package com.tencent.mm.app;

import android.content.res.Configuration;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.sdk.platformtools.ab;

public class TMAssistantProfile
  extends e
{
  public static final String ess;
  
  static
  {
    GMTrace.i(12965432524800L, 96600);
    ess = ab.getPackageName() + ":TMAssistantDownloadSDKService";
    GMTrace.o(12965432524800L, 96600);
  }
  
  public TMAssistantProfile()
  {
    GMTrace.i(12964895653888L, 96596);
    GMTrace.o(12964895653888L, 96596);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(12965164089344L, 96598);
    GMTrace.o(12965164089344L, 96598);
  }
  
  public final void onCreate()
  {
    GMTrace.i(12965029871616L, 96597);
    com.tencent.mm.f.a.at(ab.getContext());
    j.bA(ess);
    k.setupBrokenLibraryHandler();
    k.b(com.tencent.mm.sdk.a.vgN, TMAssistantProfile.class.getClassLoader());
    m.a(this.app);
    GMTrace.o(12965029871616L, 96597);
  }
  
  public String toString()
  {
    GMTrace.i(12965298307072L, 96599);
    String str = ess;
    GMTrace.o(12965298307072L, 96599);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\app\TMAssistantProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */