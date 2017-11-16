package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.media.ToneGenerator;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.h.a;
import com.tencent.mm.ad.h.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.masssend.a.a;
import com.tencent.mm.plugin.masssend.a.f;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.List;

public final class b
  implements com.tencent.mm.pluginsdk.ui.chat.b
{
  public r hsU;
  public final aj jsM;
  public final aj jsN;
  private final h.a jsQ;
  public ToneGenerator jss;
  public long jst;
  public Toast jsu;
  private Vibrator jsv;
  public MassSendMsgUI mTq;
  public ChatFooter mTr;
  public a mTs;
  private String mTt;
  private List<String> mTu;
  private boolean mTv;
  private final h.b mTw;
  
  public b(MassSendMsgUI paramMassSendMsgUI, ChatFooter paramChatFooter, String paramString, List<String> paramList, boolean paramBoolean)
  {
    GMTrace.i(11250129960960L, 83820);
    this.jst = -1L;
    this.hsU = null;
    this.jsM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11241540026368L, 83756);
        b.this.mTr.zt(b.this.mTs.getMaxAmplitude());
        GMTrace.o(11241540026368L, 83756);
        return true;
      }
    }, true);
    this.jsQ = new h.a()
    {
      public final void onError()
      {
        GMTrace.i(11228386689024L, 83658);
        b.this.mTs.reset();
        b.this.jsM.stopTimer();
        b.this.jsN.stopTimer();
        ad.RT("keep_app_silent");
        b.this.mTr.azl();
        w.v("MicroMsg.MassSendFooterEventImpl", "record stop on error");
        Toast.makeText(b.this.mTq, b.this.mTq.getString(R.l.dgX), 0).show();
        GMTrace.o(11228386689024L, 83658);
      }
    };
    this.mTw = new h.b()
    {
      public final void DB()
      {
        GMTrace.i(11237245059072L, 83724);
        b.this.mTr.bMf();
        GMTrace.o(11237245059072L, 83724);
      }
    };
    this.jsN = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11240734720000L, 83750);
        if (b.this.jst == -1L) {
          b.this.jst = bg.Pw();
        }
        long l = bg.aI(b.this.jst);
        int i;
        if ((l >= 50000L) && (l <= 60000L))
        {
          if (b.this.jsu != null) {
            break label204;
          }
          i = (int)((60000L - l) / 1000L);
          b.this.jsu = Toast.makeText(b.this.mTq, b.this.mTq.getResources().getQuantityString(R.j.cIg, i, new Object[] { Integer.valueOf(i) }), 0);
        }
        for (;;)
        {
          b.this.jsu.show();
          if (l < 60000L) {
            break;
          }
          w.v("MicroMsg.MassSendFooterEventImpl", "record stop on countdown");
          if (b.this.mTs.qt()) {
            b.this.aNE();
          }
          b.this.mTr.azl();
          aq.C(b.this.mTq, R.l.eev);
          GMTrace.o(11240734720000L, 83750);
          return false;
          label204:
          i = (int)((60000L - l) / 1000L);
          b.this.jsu.setText(b.this.mTq.getResources().getQuantityString(R.j.cIg, i, new Object[] { Integer.valueOf(i) }));
        }
        GMTrace.o(11240734720000L, 83750);
        return true;
      }
    }, true);
    this.mTq = paramMassSendMsgUI;
    this.mTr = paramChatFooter;
    this.mTt = paramString;
    this.mTu = paramList;
    this.mTv = paramBoolean;
    this.mTs = new a(paramMassSendMsgUI);
    this.mTs.a(this.jsQ);
    this.mTs.a(this.mTw);
    this.jss = new ToneGenerator(1, 60);
    this.jsv = ((Vibrator)paramMassSendMsgUI.getSystemService("vibrator"));
    GMTrace.o(11250129960960L, 83820);
  }
  
  public final boolean BM(final String paramString)
  {
    GMTrace.i(11250801049600L, 83825);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(11250801049600L, 83825);
      return false;
    }
    MassSendMsgUI.BQ(paramString);
    Object localObject = new a();
    ((a)localObject).mTa = this.mTt;
    ((a)localObject).mTb = this.mTu.size();
    ((a)localObject).filename = paramString;
    ((a)localObject).msgType = 1;
    paramString = new f((a)localObject, this.mTv);
    at.wS().a(paramString, 0);
    localObject = this.mTq;
    this.mTq.getString(R.l.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a((Context)localObject, this.mTq.getString(R.l.dXH), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11234963357696L, 83707);
        at.wS().c(paramString);
        if (b.this.hsU != null)
        {
          b.this.hsU.dismiss();
          b.this.hsU = null;
        }
        GMTrace.o(11234963357696L, 83707);
      }
    });
    GMTrace.o(11250801049600L, 83825);
    return true;
  }
  
  public final boolean aND()
  {
    GMTrace.i(11250264178688L, 83821);
    this.jsM.stopTimer();
    this.jsN.stopTimer();
    this.jst = -1L;
    if (this.mTs.qt())
    {
      aNE();
      this.mTr.azl();
    }
    for (;;)
    {
      at.pD().rh();
      GMTrace.o(11250264178688L, 83821);
      return false;
      this.mTr.bMd();
    }
  }
  
  public final void aNE()
  {
    GMTrace.i(11250398396416L, 83822);
    final Object localObject = new a();
    ((a)localObject).mTa = this.mTt;
    ((a)localObject).mTb = this.mTu.size();
    ((a)localObject).filename = this.mTs.euR;
    ((a)localObject).msgType = 34;
    ((a)localObject).mTc = this.mTs.eyI;
    localObject = new f((a)localObject, this.mTv);
    at.wS().a((k)localObject, 0);
    MassSendMsgUI localMassSendMsgUI = this.mTq;
    this.mTq.getString(R.l.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a(localMassSendMsgUI, this.mTq.getString(R.l.dXH), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11227849818112L, 83654);
        at.wS().c(localObject);
        if (b.this.hsU != null)
        {
          b.this.hsU.dismiss();
          b.this.hsU = null;
        }
        GMTrace.o(11227849818112L, 83654);
      }
    });
    GMTrace.o(11250398396416L, 83822);
  }
  
  public final boolean aNF()
  {
    GMTrace.i(11250532614144L, 83823);
    this.jsM.stopTimer();
    this.jsN.stopTimer();
    this.jst = -1L;
    this.mTr.azl();
    a locala = this.mTs;
    locala.qt();
    q.mQ(locala.euR);
    at.pD().rh();
    GMTrace.o(11250532614144L, 83823);
    return false;
  }
  
  public final boolean aNG()
  {
    GMTrace.i(11250666831872L, 83824);
    at.AR();
    if (!c.isSDCardAvailable())
    {
      u.fo(this.mTq);
      GMTrace.o(11250666831872L, 83824);
      return false;
    }
    this.jss.startTone(24);
    new ae().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11218588794880L, 83585);
        b.this.jss.stopTone();
        GMTrace.o(11218588794880L, 83585);
      }
    }, 200L);
    this.jsv.vibrate(50L);
    this.jsM.z(100L, 100L);
    this.jsN.z(200L, 200L);
    DisplayMetrics localDisplayMetrics = this.mTq.getResources().getDisplayMetrics();
    this.mTr.zs(localDisplayMetrics.heightPixels - this.mTr.getHeight());
    this.mTs.bS("_USER_FOR_THROWBOTTLE_");
    this.mTs.a(this.mTw);
    this.mTs.a(this.jsQ);
    at.pD().ri();
    GMTrace.o(11250666831872L, 83824);
    return false;
  }
  
  public final void aNH()
  {
    GMTrace.i(11250935267328L, 83826);
    GMTrace.o(11250935267328L, 83826);
  }
  
  public final void aNI()
  {
    GMTrace.i(11251069485056L, 83827);
    GMTrace.o(11251069485056L, 83827);
  }
  
  public final void aNJ()
  {
    GMTrace.i(11251203702784L, 83828);
    GMTrace.o(11251203702784L, 83828);
  }
  
  public final void fS(boolean paramBoolean)
  {
    GMTrace.i(11251606355968L, 83831);
    GMTrace.o(11251606355968L, 83831);
  }
  
  public final void onPause()
  {
    GMTrace.i(11251472138240L, 83830);
    this.jsM.stopTimer();
    this.jsN.stopTimer();
    this.jst = -1L;
    this.mTs.qt();
    at.pD().rh();
    GMTrace.o(11251472138240L, 83830);
  }
  
  public final void release()
  {
    GMTrace.i(11251337920512L, 83829);
    this.jss.release();
    GMTrace.o(11251337920512L, 83829);
  }
  
  final class a
    extends com.tencent.mm.e.b.h
  {
    String euR;
    
    public a(Context paramContext)
    {
      super(false);
      GMTrace.i(11229057777664L, 83663);
      GMTrace.o(11229057777664L, 83663);
    }
    
    public final String getFileName()
    {
      GMTrace.i(11229191995392L, 83664);
      String str = this.euR;
      GMTrace.o(11229191995392L, 83664);
      return str;
    }
    
    public final boolean qt()
    {
      GMTrace.i(11229326213120L, 83665);
      this.euR = super.getFileName();
      boolean bool = super.qt();
      super.reset();
      GMTrace.o(11229326213120L, 83665);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\masssend\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */