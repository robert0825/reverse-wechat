package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.os.Message;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.h.a;
import com.tencent.mm.e.b.j;
import com.tencent.mm.e.b.j.a;
import com.tencent.mm.plugin.wenote.model.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class k
{
  private static k scB;
  public long duration;
  public com.tencent.mm.compatible.util.b hez;
  public boolean jsG;
  public boolean jsH;
  public final aj jsN;
  private final ae jsP;
  public long jst;
  public Toast jsu;
  public TextView lhz;
  public j lkG;
  public long lkz;
  public String path;
  public String scA;
  public int scC;
  public a scD;
  public com.tencent.mm.plugin.wenote.model.a.k scE;
  public final ae scF;
  public com.tencent.mm.modelvoice.k scz;
  
  static
  {
    GMTrace.i(5659558936576L, 42167);
    scB = null;
    GMTrace.o(5659558936576L, 42167);
  }
  
  private k()
  {
    GMTrace.i(5657143017472L, 42149);
    this.jst = -1L;
    this.scA = "";
    this.path = "";
    this.scC = 0;
    this.scE = null;
    this.jsP = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(5656874582016L, 42147);
        super.handleMessage(paramAnonymousMessage);
        k.this.jsG = false;
        GMTrace.o(5656874582016L, 42147);
      }
    };
    this.scF = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(17238790766592L, 128439);
        if (k.this.scE.scW.booleanValue())
        {
          k.this.scD.bGW();
          k.this.scE.scW = Boolean.valueOf(false);
        }
        k.this.scE.sdt = ((int)com.tencent.mm.bf.b.aD(k.this.getDuration()));
        sendEmptyMessageDelayed(4096, 250L);
        GMTrace.o(17238790766592L, 128439);
      }
    };
    this.jsN = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(17243354169344L, 128473);
        if (k.this.jst == -1L) {
          k.this.jst = bg.Pw();
        }
        long l = bg.aI(k.this.jst);
        if ((l >= 3590000L) && (l <= 3600000L))
        {
          if (k.this.jsu != null) {
            break label184;
          }
          k.this.jsu = Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.cIg, new Object[] { Integer.valueOf((int)((3600000L - l) / 1000L)) }), 0);
        }
        for (;;)
        {
          k.this.jsu.show();
          if (l < 3600000L) {
            break;
          }
          w.v("MicroMsg.WNNoteVoiceLogic", "record stop on countdown");
          k.this.jsH = true;
          k.this.azk();
          if (k.this.scD != null) {
            k.this.scD.bGV();
          }
          GMTrace.o(17243354169344L, 128473);
          return false;
          label184:
          k.this.jsu.setText(ab.getContext().getString(R.l.cIg, new Object[] { Integer.valueOf((int)((3600000L - l) / 1000L)) }));
        }
        GMTrace.o(17243354169344L, 128473);
        return true;
      }
    }, true);
    this.hez = new com.tencent.mm.compatible.util.b(ab.getContext());
    GMTrace.o(5657143017472L, 42149);
  }
  
  public static k bGQ()
  {
    GMTrace.i(5657277235200L, 42150);
    if (scB == null) {
      scB = new k();
    }
    k localk = scB;
    GMTrace.o(5657277235200L, 42150);
    return localk;
  }
  
  public static k bGR()
  {
    GMTrace.i(17244025257984L, 128478);
    k localk = scB;
    GMTrace.o(17244025257984L, 128478);
    return localk;
  }
  
  public static void destroy()
  {
    GMTrace.i(17243891040256L, 128477);
    scB = null;
    GMTrace.o(17243891040256L, 128477);
  }
  
  public final void azk()
  {
    GMTrace.i(5657679888384L, 42153);
    if (!this.jsG)
    {
      GMTrace.o(5657679888384L, 42153);
      return;
    }
    this.scF.removeMessages(4096);
    if (this.scA.equals("speex"))
    {
      this.scz.qn();
      if (this.hez != null) {
        this.hez.tx();
      }
      this.duration = getDuration();
      if (this.duration >= 800L) {
        break label162;
      }
    }
    label162:
    for (int i = 1;; i = 0)
    {
      this.jsN.stopTimer();
      if (i != 0)
      {
        File localFile = new File(this.path);
        if (localFile.exists()) {
          localFile.delete();
        }
        this.jsP.sendEmptyMessageDelayed(0, 500L);
      }
      this.jsG = false;
      GMTrace.o(5657679888384L, 42153);
      return;
      this.lkG.qn();
      break;
    }
  }
  
  public final long getDuration()
  {
    GMTrace.i(5657814106112L, 42154);
    if (this.lkz == 0L)
    {
      GMTrace.o(5657814106112L, 42154);
      return 0L;
    }
    long l = bg.aI(this.lkz);
    GMTrace.o(5657814106112L, 42154);
    return l;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */