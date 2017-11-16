package com.tencent.mm.app;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.boot.a.a;
import com.tencent.mm.kernel.a.a;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.modelrecovery.PluginRecovery;
import com.tencent.mm.plugin.auth.PluginAuth;
import com.tencent.mm.plugin.bbom.PluginBigBallOfMud;
import com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.report.PluginReport;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.g.d.b;

public final class g
  extends com.tencent.mm.kernel.a.e
{
  private boolean esp;
  
  public g(boolean paramBoolean)
  {
    GMTrace.i(19121999708160L, 142470);
    this.esp = paramBoolean;
    GMTrace.o(19121999708160L, 142470);
  }
  
  public final void a(com.tencent.mm.kernel.b.e parame, final com.tencent.mm.vending.h.d paramd, d.b paramb)
  {
    GMTrace.i(14279558299648L, 106391);
    if (!this.esp)
    {
      if (i.esv == null) {
        i.esv = new i("initThread");
      }
      paramd = i.esv;
      if ((paramd.esw != null) && (paramd.esw.isAlive())) {
        break label97;
      }
      w.e("MicroMsg.InitThreadController", "setHighPriority failed thread is dead");
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xz().a(new com.tencent.mm.kernel.api.h()
      {
        public final void as(boolean paramAnonymousBoolean)
        {
          GMTrace.i(19119718006784L, 142453);
          GMTrace.o(19119718006784L, 142453);
        }
        
        public final void pe()
        {
          GMTrace.i(19119583789056L, 142452);
          paramd.esw.quit();
          com.tencent.mm.kernel.h.xz().b(this);
          GMTrace.o(19119583789056L, 142452);
        }
      });
      paramd = paramd.esx;
      super.a(parame, paramd, paramb);
      GMTrace.o(14279558299648L, 106391);
      return;
      label97:
      int i = paramd.esw.getThreadId();
      try
      {
        if (-8 != Process.getThreadPriority(i)) {
          break label163;
        }
        w.w("MicroMsg.InitThreadController", "setHighPriority No Need.");
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.InitThreadController", "thread:%d setHighPriority failed", new Object[] { Integer.valueOf(i) });
        w.printErrStackTrace("MicroMsg.InitThreadController", localException, "", new Object[0]);
      }
      continue;
      label163:
      Process.setThreadPriority(i, -8);
      w.i("MicroMsg.InitThreadController", "InitThreadController:%d setHighPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
    }
  }
  
  public final void pc()
  {
    GMTrace.i(14279155646464L, 106388);
    super.pc();
    ab.getContext().getSystemService("audio");
    a.a("Hello WeChat, DefaultBootStep load debugger and init xlog...", new Object[0]);
    j.bA(((f)com.tencent.mm.kernel.h.xv().wZ()).fXf);
    m.d(a.a.class);
    m.bE("com.tencent.mm.boot");
    GMTrace.o(14279155646464L, 106388);
  }
  
  public final void pd()
  {
    GMTrace.i(14279289864192L, 106389);
    com.tencent.mm.kernel.h.xu().fYI = n.class;
    f(PluginZero.class);
    f(PluginMessengerFoundation.class);
    f(PluginReport.class);
    f(PluginAuth.class);
    f(PluginBigBallOfMud.class);
    f(PluginRecovery.class);
    eQ("com.tencent.mm.plugin.bbom.PluginBigBallOfMudAsync");
    eQ("com.tencent.mm.plugin.performance.PluginPerformance");
    eQ("com.tencent.mm.plugin.comm.PluginComm");
    eQ("com.tencent.mm.plugin.chatroom.PluginChatroom");
    eQ("com.tencent.mm.plugin.audio.PluginVoice");
    eQ("com.tencent.mm.plugin.biz.PluginBiz");
    eQ("com.tencent.mm.plugin.notification.PluginNotification");
    eQ("com.tencent.mm.plugin.messenger.PluginMessenger");
    eQ("com.tencent.mm.plugin.welab.PluginWelab");
    eQ("com.tencent.mm.insane_statistic.PluginInsaneStatistic");
    eQ("com.tencent.mm.plugin.appbrand.app.PluginAppBrand");
    eQ("com.tencent.mm.plugin.appbrand.compat.PluginAppBrandCompat");
    eQ("com.tencent.mm.plugin.uishow.PluginUIShow");
    eQ("com.tencent.mm.plugin.emoji.PluginEmoji");
    eQ("com.tencent.mm.plugin.video.PluginVideo");
    eQ("com.tencent.mm.plugin.sport.PluginSport");
    eQ("com.tencent.mm.plugin.hardwareopt.PluginHardwareOpt");
    eQ("com.tencent.mm.plugin.fts.PluginFTS");
    eQ("com.tencent.mm.plugin.sns.PluginSns");
    eQ("com.tencent.mm.plugin.downloader.PluginDownloader");
    eQ("com.tencent.mm.plugin.fav.PluginFavorite");
    eQ("com.tencent.mm.plugin.music.PluginMusic");
    eQ("com.tencent.mm.plugin.MMPhotoEditPlugin");
    eQ("com.tencent.mm.plugin.facedetect.PluginFace");
    eQ("com.tencent.mm.plugin.soter.PluginSoter");
    eQ("com.tencent.mm.plugin.walletlock.PluginWalletLock");
    eQ("com.tencent.mm.plugin.wxpay.PluginWxPay");
    eQ("com.tencent.mm.plugin.wxpaysdk.PluginWxPaySdk");
    eQ("com.tencent.mm.plugin.wxpayapi.PluginWxPayApi");
    eQ("com.tencent.mm.plugin.mmsight.PluginMMSight");
    eQ("com.tencent.mm.plugin.secinforeport.PluginSecInfoReport");
    eQ("com.tencent.mm.plugin.normsg.PluginNormsg");
    GMTrace.o(14279289864192L, 106389);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\app\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */