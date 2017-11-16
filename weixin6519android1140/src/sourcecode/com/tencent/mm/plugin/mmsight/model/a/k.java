package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.j;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.storage.w.a;

public final class k
{
  private static k naQ;
  public SightParams naR;
  
  static
  {
    GMTrace.i(7364526735360L, 54870);
    naQ = new k();
    GMTrace.o(7364526735360L, 54870);
  }
  
  public k()
  {
    GMTrace.i(7363587211264L, 54863);
    GMTrace.o(7363587211264L, 54863);
  }
  
  public static k aPI()
  {
    GMTrace.i(7363721428992L, 54864);
    k localk = naQ;
    GMTrace.o(7363721428992L, 54864);
    return localk;
  }
  
  public static int aPJ()
  {
    GMTrace.i(7363989864448L, 54866);
    int i = j.mZc.videoBitrate;
    GMTrace.o(7363989864448L, 54866);
    return i;
  }
  
  public static int aPK()
  {
    GMTrace.i(7364124082176L, 54867);
    int i = j.mZc.mXB;
    GMTrace.o(7364124082176L, 54867);
    return i;
  }
  
  public static boolean aPL()
  {
    GMTrace.i(7364258299904L, 54868);
    if (CaptureMMProxy.getInstance().getInt(w.a.vvu, 0) == 1)
    {
      GMTrace.o(7364258299904L, 54868);
      return true;
    }
    GMTrace.o(7364258299904L, 54868);
    return false;
  }
  
  public static String aPM()
  {
    GMTrace.i(7364392517632L, 54869);
    switch (j.mZc.fQQ)
    {
    default: 
      GMTrace.o(7364392517632L, 54869);
      return "";
    case 2: 
      GMTrace.o(7364392517632L, 54869);
      return "ENCODER_MEDIACODEC";
    }
    GMTrace.o(7364392517632L, 54869);
    return "RECORDER_TYPE_FFMPEG";
  }
  
  public static d c(VideoTransPara paramVideoTransPara)
  {
    GMTrace.i(7363855646720L, 54865);
    Object localObject = null;
    switch (j.mZc.fQQ)
    {
    default: 
      paramVideoTransPara = (VideoTransPara)localObject;
    }
    for (;;)
    {
      GMTrace.o(7363855646720L, 54865);
      return paramVideoTransPara;
      paramVideoTransPara = new n(paramVideoTransPara);
      continue;
      paramVideoTransPara = new l(paramVideoTransPara);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */