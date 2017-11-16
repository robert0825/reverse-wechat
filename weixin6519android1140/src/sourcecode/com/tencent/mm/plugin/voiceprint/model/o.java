package com.tencent.mm.plugin.voiceprint.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public final class o
{
  public k qCn;
  public aj qCo;
  public int qCp;
  public int qCq;
  
  public o()
  {
    GMTrace.i(12489362243584L, 93053);
    this.qCn = null;
    this.qCo = null;
    this.qCp = 0;
    this.qCq = 0;
    this.qCn = new k();
    this.qCo = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12489764896768L, 93056);
        o.this.qCp += 100;
        o.this.qCq += o.this.qCn.getMaxAmplitude() * 100 / 100;
        if (o.this.qCp >= 3000)
        {
          Object localObject = o.this;
          w.d("MicroMsg.VoicePrintNoiseDetector", "onDetectFinish");
          ((o)localObject).qCn.qn();
          ((o)localObject).qCo.stopTimer();
          ((o)localObject).qCq /= 30;
          if (((o)localObject).qCq >= 30) {}
          for (boolean bool = true;; bool = false)
          {
            w.d("MicroMsg.VoicePrintNoiseDetector", "average amplitude: %d, hasNoise:%b", new Object[] { Integer.valueOf(((o)localObject).qCq), Boolean.valueOf(bool) });
            localObject = new sd();
            ((sd)localObject).eWU.eWV = bool;
            a.vgX.m((b)localObject);
            GMTrace.o(12489764896768L, 93056);
            return false;
          }
        }
        GMTrace.o(12489764896768L, 93056);
        return true;
      }
    }, true);
    GMTrace.o(12489362243584L, 93053);
  }
  
  public final void reset()
  {
    GMTrace.i(12489496461312L, 93054);
    this.qCn.qn();
    w.d("MicroMsg.VoicePrintNoiseDetector", "stop record");
    this.qCo.stopTimer();
    this.qCp = 0;
    this.qCq = 0;
    GMTrace.o(12489496461312L, 93054);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */