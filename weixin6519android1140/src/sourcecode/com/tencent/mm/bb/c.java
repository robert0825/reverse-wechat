package com.tencent.mm.bb;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.e.c.d;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class c
  implements ar.a
{
  public BlockingQueue<g.a> gVV;
  public String mFileName;
  
  public c()
  {
    GMTrace.i(3498787733504L, 26068);
    this.mFileName = null;
    this.gVV = new ArrayBlockingQueue(1024);
    GMTrace.o(3498787733504L, 26068);
  }
  
  public final boolean Dj()
  {
    GMTrace.i(3498921951232L, 26069);
    w.d("MicroMsg.SpeexEncoderWorker", "doEncode");
    d locald = new d();
    String str = b.LW();
    try
    {
      w.i("MicroMsg.SpeexEncoderWorker", "path " + str);
      Object localObject = new File(str);
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdir();
      }
      locald.bU(str + this.mFileName + ".temp");
      while (this.gVV.size() > 0)
      {
        localObject = (g.a)this.gVV.poll();
        if ((((g.a)localObject).buf != null) && (((g.a)localObject).eyw > 0))
        {
          locald.a((g.a)localObject, 0, false);
          continue;
          GMTrace.o(3498921951232L, 26069);
        }
      }
    }
    catch (Exception localException1)
    {
      w.e("MicroMsg.SpeexEncoderWorker", "filename open failed, ", new Object[] { localException1 });
    }
    for (;;)
    {
      return true;
      localException1.qI();
      try
      {
        new File(str + this.mFileName + ".temp").renameTo(new File(str + this.mFileName + ".spx"));
        e.Me().start();
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.e("MicroMsg.SpeexEncoderWorker", "exception:%s", new Object[] { bg.f(localException2) });
        }
      }
    }
  }
  
  public final boolean Dk()
  {
    GMTrace.i(3499056168960L, 26070);
    GMTrace.o(3499056168960L, 26070);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bb\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */