package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.af.f;
import com.tencent.mm.af.i;
import com.tencent.mm.g.a.eo;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.s;

public final class b
{
  public static r hsU;
  public static boolean jqh;
  
  static
  {
    GMTrace.i(1963605360640L, 14630);
    jqh = false;
    hsU = null;
    GMTrace.o(1963605360640L, 14630);
  }
  
  public static void a(com.tencent.mm.af.d paramd, Activity paramActivity, com.tencent.mm.storage.x paramx, int paramInt)
  {
    GMTrace.i(1962531618816L, 14622);
    a(paramd, paramActivity, paramx, false, null, paramInt);
    GMTrace.o(1962531618816L, 14622);
  }
  
  public static void a(com.tencent.mm.af.d paramd, Activity paramActivity, com.tencent.mm.storage.x paramx, boolean paramBoolean)
  {
    GMTrace.i(1962800054272L, 14624);
    a(paramd, paramActivity, paramx, false, 0);
    GMTrace.o(1962800054272L, 14624);
  }
  
  public static void a(com.tencent.mm.af.d paramd, Activity paramActivity, com.tencent.mm.storage.x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool2 = true;
    GMTrace.i(1962934272000L, 14625);
    if ((paramd == null) || (paramActivity == null) || (paramx == null))
    {
      boolean bool1;
      if (paramd == null)
      {
        paramBoolean = true;
        if (paramActivity != null) {
          break label90;
        }
        bool1 = true;
        label37:
        if (paramx != null) {
          break label96;
        }
      }
      for (;;)
      {
        w.e("MicroMsg.BizContactDeleteUtil", "error args, %b, %b, %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        GMTrace.o(1962934272000L, 14625);
        return;
        paramBoolean = false;
        break;
        label90:
        bool1 = false;
        break label37;
        label96:
        bool2 = false;
      }
    }
    String str = paramx.field_username;
    paramx.uB();
    at.AR();
    com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.c(str, paramInt));
    if (s.fA(str))
    {
      at.AR();
      com.tencent.mm.y.c.yK().TK(str);
      at.AR();
      com.tencent.mm.y.c.yT().gI(str);
    }
    label440:
    for (;;)
    {
      if (com.tencent.mm.app.plugin.a.a.a(paramd))
      {
        paramd = new eo();
        paramd.eGl.eEs = str;
        com.tencent.mm.sdk.b.a.vgX.m(paramd);
      }
      paramd = com.tencent.mm.af.x.FF();
      if (!bg.nm(str)) {
        w.i("MicroMsg.BizKFStorage", "deleteKFWorker by brand username(u:%s, r:%d).", new Object[] { str, Integer.valueOf(paramd.fTZ.delete("BizKF", "brandUsername = ?", new String[] { str })) });
      }
      if (paramBoolean)
      {
        if (paramActivity.getIntent().getIntExtra("Kdel_from", -1) == 0)
        {
          paramd = new Intent(paramActivity, LauncherUI.class);
          paramd.addFlags(67108864);
          paramActivity.startActivity(paramd);
        }
        paramActivity.finish();
      }
      GMTrace.o(1962934272000L, 14625);
      return;
      jqh = false;
      paramActivity.getString(R.l.cUG);
      hsU = h.a(paramActivity, paramActivity.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1959176175616L, 14597);
          b.jqh = true;
          GMTrace.o(1959176175616L, 14597);
        }
      });
      bc.a local3 = new bc.a()
      {
        public final void Bk()
        {
          GMTrace.i(1909918269440L, 14230);
          com.tencent.mm.af.x.FG().iD(this.nOz);
          if (b.hsU != null)
          {
            b.hsU.dismiss();
            b.hsU = null;
          }
          GMTrace.o(1909918269440L, 14230);
        }
        
        public final boolean Bl()
        {
          GMTrace.i(1909784051712L, 14229);
          boolean bool = b.jqh;
          GMTrace.o(1909784051712L, 14229);
          return bool;
        }
      };
      at.AR();
      com.tencent.mm.y.c.yK().a(str, paramx);
      if (paramd.EF()) {
        f.iS(paramd.field_username);
      }
      for (;;)
      {
        if ((paramActivity == null) || (!paramBoolean)) {
          break label440;
        }
        paramActivity.setResult(-1, paramActivity.getIntent().putExtra("_delete_ok_", true));
        break;
        bc.a(str, local3);
        at.AR();
        com.tencent.mm.y.c.yP().TN(str);
      }
    }
  }
  
  public static void a(com.tencent.mm.af.d paramd, final Activity paramActivity, final com.tencent.mm.storage.x paramx, final boolean paramBoolean, final Runnable paramRunnable, final int paramInt)
  {
    GMTrace.i(1962665836544L, 14623);
    if ((paramd == null) || (paramActivity == null) || (paramx == null))
    {
      boolean bool1;
      if (paramd == null)
      {
        paramBoolean = true;
        if (paramActivity != null) {
          break label91;
        }
        bool1 = true;
        label34:
        if (paramx != null) {
          break label97;
        }
      }
      label91:
      label97:
      for (boolean bool2 = true;; bool2 = false)
      {
        w.e("MicroMsg.BizContactDeleteUtil", "bizInfo null : %s, context null : %s, ct null : %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        GMTrace.o(1962665836544L, 14623);
        return;
        paramBoolean = false;
        break;
        bool1 = false;
        break label34;
      }
    }
    if (paramd.EG()) {}
    for (String str = paramActivity.getString(R.l.dbA);; str = paramActivity.getString(R.l.dbB, new Object[] { paramx.vk() }))
    {
      h.a(paramActivity, str, "", paramActivity.getString(R.l.dkA), paramActivity.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1939177734144L, 14448);
          b.a(this.xfF, paramActivity, paramx, paramBoolean, paramInt);
          if (paramRunnable != null) {
            paramRunnable.run();
          }
          GMTrace.o(1939177734144L, 14448);
        }
      }, null);
      GMTrace.o(1962665836544L, 14623);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */