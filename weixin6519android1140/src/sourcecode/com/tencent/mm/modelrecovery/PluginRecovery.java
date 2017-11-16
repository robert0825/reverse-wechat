package com.tencent.mm.modelrecovery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.g.a.mp.a;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.recovery.RecoveryContext;
import com.tencent.recovery.RecoveryLogic;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.log.RecoveryLog.RecoveryLogImpl;
import com.tencent.recovery.option.CommonOptions.Builder;
import com.tencent.recovery.wx.WXConstantsRecovery;
import com.tencent.recovery.wx.service.WXRecoveryHandleService;
import com.tencent.recovery.wx.service.WXRecoveryUploadService;
import com.tencent.recovery.wx.util.WXUtil;
import java.io.File;

public class PluginRecovery
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.kernel.api.bucket.c
{
  private com.tencent.mm.sdk.b.c<mp> gQx;
  private RecoveryLog.RecoveryLogImpl gQy;
  private BroadcastReceiver sU;
  
  static
  {
    GMTrace.i(4515352805376L, 33642);
    GMTrace.o(4515352805376L, 33642);
  }
  
  public PluginRecovery()
  {
    GMTrace.i(4514413281280L, 33635);
    this.gQx = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(mp paramAnonymousmp)
      {
        GMTrace.i(17959137312768L, 133806);
        switch (paramAnonymousmp.eRJ.action)
        {
        }
        for (;;)
        {
          GMTrace.o(17959137312768L, 133806);
          return false;
          a.Km();
          continue;
          paramAnonymousmp = ab.getContext();
          CommonOptions.Builder localBuilder = new CommonOptions.Builder();
          localBuilder.xPL = WXRecoveryHandleService.class.getName();
          localBuilder.xPM = WXRecoveryUploadService.class.getName();
          localBuilder.clientVersion = "0x26051334";
          localBuilder.xPH = String.format("file:///sdcard/test-recovery.conf", new Object[0]);
          localBuilder.lOv = WXUtil.fT(paramAnonymousmp);
          RecoveryLogic.a(paramAnonymousmp, localBuilder.cnm(), new RecoveryContext());
          continue;
          paramAnonymousmp = ab.getContext();
          localBuilder = new CommonOptions.Builder();
          localBuilder.xPL = WXRecoveryHandleService.class.getName();
          localBuilder.xPM = WXRecoveryUploadService.class.getName();
          localBuilder.clientVersion = "0x26051334";
          localBuilder.xPH = "http://dldir1.qq.com/weixin/android/recovery-0x26032011.conf";
          localBuilder.lOv = WXUtil.fT(paramAnonymousmp);
          RecoveryLogic.a(paramAnonymousmp, localBuilder.cnm(), new RecoveryContext());
        }
      }
    };
    this.sU = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(4513071104000L, 33625);
        if (paramAnonymousIntent != null)
        {
          if ("com.tecent.recovery.intent.action.LOG".equals(paramAnonymousIntent.getAction()))
          {
            PluginRecovery.this.postLog();
            GMTrace.o(4513071104000L, 33625);
            return;
          }
          if ("com.tecent.mm.intent.action.RECOVERY_STATUS_UPLOAD".equals(paramAnonymousIntent.getAction())) {
            PluginRecovery.this.postReport();
          }
        }
        GMTrace.o(4513071104000L, 33625);
      }
    };
    this.gQy = new RecoveryLog.RecoveryLogImpl()
    {
      public final void Kl()
      {
        GMTrace.i(18825512747008L, 140261);
        GMTrace.o(18825512747008L, 140261);
      }
      
      public final void d(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(17959539965952L, 133809);
        w.d(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
        GMTrace.o(17959539965952L, 133809);
      }
      
      public final void e(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(17960076836864L, 133813);
        w.e(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
        GMTrace.o(17960076836864L, 133813);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(17959808401408L, 133811);
        w.i(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
        GMTrace.o(17959808401408L, 133811);
      }
      
      public final void printErrStackTrace(String paramAnonymousString1, Throwable paramAnonymousThrowable, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(17960211054592L, 133814);
        w.printErrStackTrace(paramAnonymousString1, paramAnonymousThrowable, paramAnonymousString2, paramAnonymousVarArgs);
        GMTrace.o(17960211054592L, 133814);
      }
      
      public final void v(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(17959674183680L, 133810);
        w.v(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
        GMTrace.o(17959674183680L, 133810);
      }
      
      public final void w(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(17959942619136L, 133812);
        w.w(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
        GMTrace.o(17959942619136L, 133812);
      }
    };
    GMTrace.o(4514413281280L, 33635);
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(4514681716736L, 33637);
    RecoveryLog.a(this.gQy);
    long l;
    if (parame.eR(":sandbox"))
    {
      l = System.currentTimeMillis();
      parame = new IntentFilter();
      parame.addAction("com.tecent.recovery.intent.action.LOG");
      parame.addAction("com.tecent.mm.intent.action.RECOVERY_STATUS_UPLOAD");
      ab.getContext().registerReceiver(this.sU, parame);
      parame = new File(WXConstantsRecovery.xPX);
      if (!parame.exists()) {
        parame.mkdir();
      }
      parame = new File(parame, "version.info");
      if (parame.exists()) {
        parame.delete();
      }
    }
    try
    {
      FileOp.j(parame.getAbsolutePath(), Integer.toHexString(com.tencent.mm.protocal.d.tJC).getBytes());
      w.i("MicroMsg.Recovery.PluginRecovery", "add recovery intent filter and save client verison file %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(4514681716736L, 33637);
      return;
    }
    catch (Exception parame)
    {
      for (;;) {}
    }
  }
  
  public void dependency()
  {
    GMTrace.i(4514547499008L, 33636);
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    GMTrace.o(4514547499008L, 33636);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(4514815934464L, 33638);
    GMTrace.o(4514815934464L, 33638);
  }
  
  public void installed()
  {
    GMTrace.i(14521284427776L, 108192);
    GMTrace.o(14521284427776L, 108192);
  }
  
  public void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(4514950152192L, 33639);
    this.gQx.bPu();
    GMTrace.o(4514950152192L, 33639);
  }
  
  public void onAccountRelease()
  {
    GMTrace.i(4515084369920L, 33640);
    this.gQx.dead();
    GMTrace.o(4515084369920L, 33640);
  }
  
  public void postLog()
  {
    GMTrace.i(17958868877312L, 133804);
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17958734659584L, 133803);
        w.i("MicroMsg.Recovery.PluginRecovery", "postLog");
        a.Km();
        GMTrace.o(17958734659584L, 133803);
      }
    }, "RecoveryWriteLogThread");
    GMTrace.o(17958868877312L, 133804);
  }
  
  public void postReport()
  {
    GMTrace.i(17959003095040L, 133805);
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17958600441856L, 133802);
        w.i("MicroMsg.Recovery.PluginRecovery", "postReport");
        b.reportStatus();
        GMTrace.o(17958600441856L, 133802);
      }
    }, "RecoveryReportStatusThread");
    GMTrace.o(17959003095040L, 133805);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelrecovery\PluginRecovery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */