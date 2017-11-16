package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.plugin.report.service.f;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;

public final class m
{
  public boolean oaK;
  public Runnable vJY;
  
  public m()
  {
    GMTrace.i(14966081978368L, 111506);
    this.oaK = true;
    GMTrace.o(14966081978368L, 111506);
  }
  
  public final boolean a(final Activity paramActivity, final int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(19098243170304L, 142293);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (i = -1;; i = paramArrayOfInt.length)
      {
        w.w("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bQW() });
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14973329735680L, 111560);
            if (m.this.vJY != null) {
              m.this.vJY.run();
            }
            GMTrace.o(14973329735680L, 111560);
          }
          
          public final String toString()
          {
            GMTrace.i(14973463953408L, 111561);
            String str = super.toString() + "|onInitDelay";
            GMTrace.o(14973463953408L, 111561);
            return str;
          }
        }, 500L);
        GMTrace.o(19098243170304L, 142293);
        return true;
      }
    }
    w.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      GMTrace.o(19098243170304L, 142293);
      return false;
    case 32: 
    case 64: 
    case 96: 
      i = R.l.dNt;
      if (paramInt == 96)
      {
        i = R.l.dNs;
        if (paramArrayOfInt[0] != 0) {
          break label330;
        }
        if (paramInt != 32) {
          break label287;
        }
        d.oqe.a(462L, 0L, 1L, true);
        label247:
        if (this.vJY != null) {
          this.vJY.run();
        }
      }
      for (;;)
      {
        GMTrace.o(19098243170304L, 142293);
        return true;
        if (paramInt != 64) {
          break;
        }
        i = R.l.dNq;
        break;
        label287:
        if (paramInt == 96)
        {
          d.oqe.a(462L, 1L, 1L, true);
          p.aM(true);
          break label247;
        }
        d.oqe.a(462L, 2L, 1L, true);
        break label247;
        label330:
        h.a(paramActivity, paramActivity.getString(i), paramActivity.getString(R.l.dNu), paramActivity.getString(R.l.dFX), paramActivity.getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(14921119039488L, 111171);
            if (paramInt == 32) {
              d.oqe.a(462L, 3L, 1L, true);
            }
            for (;;)
            {
              Intent localIntent = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
              localIntent.addFlags(268435456);
              paramActivity.startActivity(localIntent);
              paramAnonymousDialogInterface.dismiss();
              MMAppMgr.a(paramActivity, true);
              paramActivity.finish();
              GMTrace.o(14921119039488L, 111171);
              return;
              if (paramInt == 96) {
                d.oqe.a(462L, 4L, 1L, true);
              } else {
                d.oqe.a(462L, 5L, 1L, true);
              }
            }
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(14992522870784L, 111703);
            if (paramInt == 32) {
              d.oqe.a(462L, 6L, 1L, true);
            }
            for (;;)
            {
              paramAnonymousDialogInterface.dismiss();
              MMAppMgr.a(paramActivity, true);
              paramActivity.finish();
              GMTrace.o(14992522870784L, 111703);
              return;
              if (paramInt == 96) {
                d.oqe.a(462L, 7L, 1L, true);
              } else {
                d.oqe.a(462L, 8L, 1L, true);
              }
            }
          }
        });
      }
    }
    int i = R.l.dNt;
    if (paramInt == 97)
    {
      i = R.l.dNs;
      if (paramArrayOfInt[0] != 0) {
        break label493;
      }
      if (paramInt != 33) {
        break label453;
      }
      d.oqe.a(462L, 9L, 1L, true);
    }
    for (;;)
    {
      GMTrace.o(19098243170304L, 142293);
      return true;
      if (paramInt != 70) {
        break;
      }
      i = R.l.dNq;
      break;
      label453:
      if (paramInt == 97)
      {
        d.oqe.a(462L, 10L, 1L, true);
      }
      else
      {
        d.oqe.a(462L, 11L, 1L, true);
        continue;
        label493:
        this.oaK = false;
        h.a(paramActivity, paramActivity.getString(i), paramActivity.getString(R.l.dNu), paramActivity.getString(R.l.dFX), paramActivity.getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(14967424155648L, 111516);
            if (paramInt == 33) {
              d.oqe.a(462L, 12L, 1L, true);
            }
            for (;;)
            {
              Intent localIntent = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
              localIntent.addFlags(268435456);
              paramActivity.startActivity(localIntent);
              paramAnonymousDialogInterface.dismiss();
              m.this.oaK = true;
              MMAppMgr.a(paramActivity, true);
              paramActivity.finish();
              GMTrace.o(14967424155648L, 111516);
              return;
              if (paramInt == 97) {
                d.oqe.a(462L, 13L, 1L, true);
              } else {
                d.oqe.a(462L, 14L, 1L, true);
              }
            }
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(14969840074752L, 111534);
            if (paramInt == 33) {
              d.oqe.a(462L, 15L, 1L, true);
            }
            for (;;)
            {
              paramAnonymousDialogInterface.dismiss();
              m.this.oaK = true;
              MMAppMgr.a(paramActivity, true);
              paramActivity.finish();
              GMTrace.o(14969840074752L, 111534);
              return;
              if (paramInt == 97) {
                d.oqe.a(462L, 16L, 1L, true);
              } else {
                d.oqe.a(462L, 17L, 1L, true);
              }
            }
          }
        });
      }
    }
  }
  
  public final boolean c(Activity paramActivity, Runnable paramRunnable)
  {
    GMTrace.i(20400020914176L, 151992);
    boolean bool = a.a(paramActivity, "android.permission.WRITE_EXTERNAL_STORAGE", 32, "", "");
    w.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper checkPermission checkStorage[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      this.vJY = paramRunnable;
      GMTrace.o(20400020914176L, 151992);
      return false;
    }
    bool = a.a(paramActivity, "android.permission.READ_PHONE_STATE", 96, "", "");
    w.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper checkPermission checkPhone[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      this.vJY = paramRunnable;
      GMTrace.o(20400020914176L, 151992);
      return false;
    }
    bool = a.a(paramActivity, "android.permission.ACCESS_COARSE_LOCATION", 64, "", "");
    w.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      this.vJY = paramRunnable;
      GMTrace.o(20400020914176L, 151992);
      return false;
    }
    w.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "start time check launcherUIOnCreate from begin time ==" + (System.currentTimeMillis() - LauncherUI.vJh));
    f.dh(LauncherUI.vJh);
    GMTrace.o(20400020914176L, 151992);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */