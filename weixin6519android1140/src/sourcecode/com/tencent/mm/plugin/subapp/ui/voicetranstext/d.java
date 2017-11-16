package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelvoice.MediaRecorder;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.modelvoice.h;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.protocal.c.bnv;

public final class d
{
  public static bnv av(int paramInt, String paramString)
  {
    GMTrace.i(5761698627584L, 42928);
    bnv localbnv = new bnv();
    switch (paramInt)
    {
    case 2: 
    case 3: 
    default: 
      localbnv.tRH = 0;
      localbnv.tRI = 0;
      localbnv.tRF = 0;
      localbnv.tRG = 0;
    }
    for (;;)
    {
      GMTrace.o(5761698627584L, 42928);
      return localbnv;
      localbnv.tRH = 8000;
      localbnv.tRI = 16;
      localbnv.tRF = 5;
      localbnv.tRG = 5;
      continue;
      localbnv.tRH = 16000;
      localbnv.tRI = 16;
      localbnv.tRF = 4;
      localbnv.tRG = 4;
      continue;
      localbnv.tRH = 16000;
      paramString = q.mK(paramString);
      if (paramString != null)
      {
        paramInt = MediaRecorder.SilkGetEncSampleRate(((h)paramString).bd(0, 1).buf);
        if (paramInt >= 8000) {
          localbnv.tRH = paramInt;
        }
      }
      localbnv.tRI = 16;
      localbnv.tRF = 6;
      localbnv.tRG = 6;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\voicetranstext\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */