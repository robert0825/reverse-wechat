package com.tencent.mm.plugin.favorite.b;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.kn;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;

public final class aj
  implements w.a
{
  public static w lcI;
  private static aj lcJ;
  public int duration;
  public int eIv;
  public String path;
  
  static
  {
    GMTrace.i(6279376404480L, 46785);
    lcI = null;
    lcJ = null;
    GMTrace.o(6279376404480L, 46785);
  }
  
  public aj()
  {
    GMTrace.i(6278436880384L, 46778);
    GMTrace.o(6278436880384L, 46778);
  }
  
  public static aj ayu()
  {
    GMTrace.i(6278571098112L, 46779);
    if (lcJ == null) {
      lcJ = new aj();
    }
    aj localaj = lcJ;
    GMTrace.o(6278571098112L, 46779);
    return localaj;
  }
  
  public static w ayv()
  {
    GMTrace.i(6278705315840L, 46780);
    if (lcI == null) {
      lcI = new w();
    }
    w localw = lcI;
    GMTrace.o(6278705315840L, 46780);
    return localw;
  }
  
  public static w ayw()
  {
    GMTrace.i(6278839533568L, 46781);
    w localw = lcI;
    GMTrace.o(6278839533568L, 46781);
    return localw;
  }
  
  public final void aW(String paramString, int paramInt)
  {
    GMTrace.i(6278973751296L, 46782);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.WNNoteVoicePlayLogic", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 1);
    if (!bg.aq(paramString, "").equals(this.path)) {
      localBundle.putBoolean("result", true);
    }
    for (;;)
    {
      localBundle.putInt("position", paramInt);
      paramString = new kn();
      paramString.eOO.eOJ = localBundle;
      paramString.eOO.type = 4;
      a.vgX.m(paramString);
      GMTrace.o(6278973751296L, 46782);
      return;
      localBundle.putBoolean("result", false);
    }
  }
  
  public final void onFinish()
  {
    GMTrace.i(6279107969024L, 46783);
    lcI.ahO();
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 2);
    kn localkn = new kn();
    localkn.eOO.eOJ = localBundle;
    localkn.eOO.type = 4;
    a.vgX.m(localkn);
    GMTrace.o(6279107969024L, 46783);
  }
  
  public final void onPause()
  {
    GMTrace.i(6279242186752L, 46784);
    lcI.axW();
    Bundle localBundle = new Bundle();
    localBundle.putInt("actionCode", 3);
    kn localkn = new kn();
    localkn.eOO.eOJ = localBundle;
    localkn.eOO.type = 4;
    a.vgX.m(localkn);
    GMTrace.o(6279242186752L, 46784);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */