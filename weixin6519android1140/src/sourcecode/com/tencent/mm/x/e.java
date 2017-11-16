package com.tencent.mm.x;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.Map;

public final class e
  extends c
{
  public e()
  {
    GMTrace.i(16384897581056L, 122077);
    GMTrace.o(16384897581056L, 122077);
  }
  
  public final void a(StringBuilder paramStringBuilder, f.a parama, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2)
  {
    GMTrace.i(16385166016512L, 122079);
    byte[] arrayOfByte;
    if (!bg.nm(parama.appId))
    {
      paramString = parama.eTv;
      paramkeep_SceneResult = new bhf();
      if (paramString != null) {
        arrayOfByte = Base64.decode(paramString, 0);
      }
    }
    try
    {
      paramkeep_SceneResult.aD(arrayOfByte);
      paramkeep_SceneResult.uTd = new bhd();
      paramkeep_SceneResult.uTd.lMv = parama.appId;
      try
      {
        paramkeep_SceneResult = Base64.encodeToString(paramkeep_SceneResult.toByteArray(), 0);
        paramString = paramkeep_SceneResult;
        paramkeep_SceneResult = paramkeep_SceneResult.replace("\n", "");
        paramString = paramkeep_SceneResult;
      }
      catch (IOException paramkeep_SceneResult)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.AppContentStatExtStrPiece", paramkeep_SceneResult, "", new Object[0]);
        }
      }
      parama.eTv = paramString;
      paramStringBuilder.append("<statextstr>" + bg.Sw(parama.eTv) + "</statextstr>");
      GMTrace.o(16385166016512L, 122079);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AppContentStatExtStrPiece", localException, "", new Object[0]);
      }
    }
  }
  
  public final void a(Map<String, String> paramMap, f.a parama)
  {
    GMTrace.i(16385300234240L, 122080);
    GMTrace.o(16385300234240L, 122080);
  }
  
  public final c yw()
  {
    GMTrace.i(16385031798784L, 122078);
    e locale = new e();
    GMTrace.o(16385031798784L, 122078);
    return locale;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\x\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */