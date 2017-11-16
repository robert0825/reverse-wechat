package com.tencent.mm.plugin.mmsight.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.v;
import com.tencent.mm.plugin.mmsight.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  implements v
{
  public m()
  {
    GMTrace.i(7339159584768L, 54681);
    GMTrace.o(7339159584768L, 54681);
  }
  
  public final void mB(String paramString)
  {
    GMTrace.i(7339293802496L, 54682);
    final r localr = o.Nh().mh(paramString);
    if (localr == null)
    {
      GMTrace.o(7339293802496L, 54682);
      return;
    }
    o.Nh();
    final String str = s.mk(paramString);
    anf localanf = localr.hcF;
    VideoTransPara localVideoTransPara = com.tencent.mm.modelcontrol.d.Gv().Gw();
    if (localanf != null)
    {
      w.i("MicroMsg.MMSightVideoMsgSendCallback", "beforeVideoSend count %d filename %s filePath %s", new Object[] { Integer.valueOf(localanf.uCa), paramString, str });
      if (localanf.uCa > 1)
      {
        t.mp(paramString);
        GMTrace.o(7339293802496L, 54682);
        return;
      }
    }
    boolean bool2 = l.a(str, localVideoTransPara, localanf, new d()
    {
      public final boolean aNY()
      {
        GMTrace.i(7331777609728L, 54626);
        w.i("MicroMsg.MMSightVideoMsgSendCallback", "iUpdateVideoFile1 %s", new Object[] { str });
        int i = s.mm(str);
        localr.gsL = i;
        localr.eQl = 32;
        o.Nh().b(localr);
        GMTrace.o(7331777609728L, 54626);
        return true;
      }
    });
    if (localanf != null)
    {
      w.i("MicroMsg.MMSightVideoMsgSendCallback", "filename: %s need ret: %s", new Object[] { paramString, Boolean.valueOf(bool2) });
      if (bool2) {
        break label310;
      }
    }
    label310:
    for (boolean bool1 = true;; bool1 = false)
    {
      localanf.uCd = bool1;
      localr.hcF = localanf;
      localr.eQl = 536870912;
      o.Nh().b(localr);
      if (!bool2) {
        break label349;
      }
      if (localanf != null)
      {
        localanf.uCa += 1;
        localr.hcF = localanf;
      }
      localr.eQl = 536870912;
      o.Nh().b(localr);
      c.qB(localr.hcw);
      if (l.b(str, localVideoTransPara, localanf, new d()
      {
        public final boolean aNY()
        {
          GMTrace.i(7337414754304L, 54668);
          c.qC(localr.hcw);
          w.i("MicroMsg.MMSightVideoMsgSendCallback", "iUpdateVideoFile2 %s", new Object[] { str });
          int i = s.mm(str);
          localr.gsL = i;
          localr.eQl = 32;
          o.Nh().b(localr);
          GMTrace.o(7337414754304L, 54668);
          return true;
        }
      }) >= 0) {
        break;
      }
      w.i("MicroMsg.MMSightRecorderIDKeyStat", "mark720CapturePostCompressFailed");
      g.ork.a(440L, 45L, 1L, false);
      t.mp(paramString);
      GMTrace.o(7339293802496L, 54682);
      return;
    }
    if (localanf != null)
    {
      localanf.uCd = true;
      localr.hcF = localanf;
      localr.eQl = 536870912;
      o.Nh().b(localr);
    }
    label349:
    GMTrace.o(7339293802496L, 54682);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */