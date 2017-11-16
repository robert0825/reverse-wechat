package com.tencent.mm.plugin.backup.i;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.jj;
import com.tencent.mm.g.a.jk;
import com.tencent.mm.g.a.jk.a;
import com.tencent.mm.g.a.y;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.w.c.a;
import com.tencent.mm.plugin.w.e.1;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class a
  implements aq
{
  private static boolean jiA;
  private static a jiz;
  private com.tencent.mm.sdk.b.c jiB;
  private com.tencent.mm.sdk.b.c jiC;
  private com.tencent.mm.sdk.b.c jiD;
  private com.tencent.mm.sdk.b.c jiE;
  private bt.a jiF;
  
  static
  {
    GMTrace.i(9421279199232L, 70194);
    jiA = false;
    GMTrace.o(9421279199232L, 70194);
  }
  
  public a()
  {
    GMTrace.i(9416447361024L, 70158);
    this.jiB = new com.tencent.mm.sdk.b.c() {};
    this.jiC = new com.tencent.mm.sdk.b.c() {};
    this.jiD = new com.tencent.mm.sdk.b.c() {};
    this.jiE = new com.tencent.mm.sdk.b.c() {};
    this.jiF = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(14720329318400L, 109675);
        w.i("MicroMsg.BackupCore.BackupToPc", "backupcore onrecieveMsg");
        g.ork.a(400L, 0L, 1L, false);
        String str = (String)bh.q(n.a(paramAnonymousa.gtM.tPY), "sysmsg").get(".sysmsg.MMBakChatNotify.url");
        if (bg.nm(str)) {
          w.e("MicroMsg.BackupCore.BackupToPc", "MMBakChatNotify url is null");
        }
        paramAnonymousa = new Intent().setClassName(com.tencent.mm.sdk.platformtools.ab.getContext(), "com.tencent.mm.plugin.backup.backuppcmodel.BackupPcService");
        Intent localIntent = bg.z(com.tencent.mm.sdk.platformtools.ab.getContext(), paramAnonymousa);
        if (localIntent != null) {
          paramAnonymousa = localIntent;
        }
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.ab.getContext().startService(paramAnonymousa.putExtra("url", str).putExtra("isFromWifi", true));
          GMTrace.o(14720329318400L, 109675);
          return;
        }
      }
    };
    w.i("MicroMsg.BackupCore", "BackupCore init");
    GMTrace.o(9416447361024L, 70158);
  }
  
  public static a agG()
  {
    GMTrace.i(9416715796480L, 70160);
    if (jiz == null) {
      jiz = new a();
    }
    a locala = jiz;
    GMTrace.o(9416715796480L, 70160);
    return locala;
  }
  
  public static void reset()
  {
    GMTrace.i(9419668586496L, 70182);
    if (com.tencent.mm.plugin.backup.a.e.aep())
    {
      jiA = true;
      GMTrace.o(9419668586496L, 70182);
      return;
    }
    jiz = null;
    com.tencent.mm.plugin.backup.a.a.aeb();
    com.tencent.mm.plugin.backup.a.e.aeq();
    GMTrace.o(9419668586496L, 70182);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(9420071239680L, 70185);
    b localb = b.agH();
    w.i("MicroMsg.BackupEventListener", "init addListener");
    localb.jiJ = new b.1(localb);
    com.tencent.mm.sdk.b.a.vgX.b(localb.jiJ);
    localb.jiK = new b.2(localb);
    com.tencent.mm.sdk.b.a.vgX.b(localb.jiK);
    localb.hPq = new b.3(localb);
    com.tencent.mm.sdk.b.a.vgX.b(localb.hPq);
    at.getSysCmdMsgExtension().a("MMBakChatNotify", this.jiF, true);
    com.tencent.mm.sdk.b.a.vgX.a(this.jiB);
    com.tencent.mm.sdk.b.a.vgX.a(this.jiC);
    com.tencent.mm.sdk.b.a.vgX.a(this.jiD);
    com.tencent.mm.sdk.b.a.vgX.a(this.jiE);
    GMTrace.o(9420071239680L, 70185);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(9420205457408L, 70186);
    GMTrace.o(9420205457408L, 70186);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(9419937021952L, 70184);
    GMTrace.o(9419937021952L, 70184);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(9420339675136L, 70187);
    b localb = b.agH();
    com.tencent.mm.sdk.b.a.vgX.c(localb.jiJ);
    com.tencent.mm.sdk.b.a.vgX.c(localb.jiK);
    com.tencent.mm.sdk.b.a.vgX.c(localb.hPq);
    at.getSysCmdMsgExtension().b("MMBakChatNotify", this.jiF, true);
    com.tencent.mm.sdk.b.a.vgX.c(this.jiB);
    com.tencent.mm.sdk.b.a.vgX.c(this.jiC);
    com.tencent.mm.sdk.b.a.vgX.c(this.jiD);
    com.tencent.mm.sdk.b.a.vgX.c(this.jiE);
    GMTrace.o(9420339675136L, 70187);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(9419802804224L, 70183);
    GMTrace.o(9419802804224L, 70183);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */