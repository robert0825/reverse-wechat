package com.tencent.mm.console;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.g.a.ib;
import com.tencent.mm.g.a.ib.a;
import com.tencent.mm.modelmulti.q;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import java.util.HashMap;

public final class Shell
{
  public static HashMap<String, a> fTj;
  public static IntentFilter fTk;
  private static Runnable fTl;
  public Receiver fTi;
  
  static
  {
    GMTrace.i(428557205504L, 3193);
    fTj = new HashMap();
    fTk = new IntentFilter();
    a("wechat.shell.SET_NEXTRET", new a()
    {
      public final void m(Intent paramAnonymousIntent)
      {
        GMTrace.i(423054278656L, 3152);
        int i = paramAnonymousIntent.getIntExtra("type", Integer.MAX_VALUE);
        int j = paramAnonymousIntent.getIntExtra("error", 0);
        if ((i == Integer.MAX_VALUE) || (j == 0))
        {
          GMTrace.o(423054278656L, 3152);
          return;
        }
        w.w("MicroMsg.Shell", "kiro set Test.pushNextErrorRet(type=%d, err=%d)", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        com.tencent.mm.platformtools.r.bf(i, j);
        GMTrace.o(423054278656L, 3152);
      }
    });
    a("wechat.shell.SET_LOGLEVEL", new a()
    {
      public final void m(Intent paramAnonymousIntent)
      {
        GMTrace.i(420369924096L, 3132);
        int i = paramAnonymousIntent.getIntExtra("level", 0);
        w.w("MicroMsg.Shell", "kiro set Log.level=%d", new Object[] { Integer.valueOf(w.getLogLevel()) });
        w.Al(i);
        GMTrace.o(420369924096L, 3132);
      }
    });
    a("wechat.shell.SET_CDNTRANS", new a()
    {
      public final void m(Intent paramAnonymousIntent)
      {
        GMTrace.i(427617681408L, 3186);
        com.tencent.mm.platformtools.r.hkd = paramAnonymousIntent.getBooleanExtra("value", false);
        w.w("MicroMsg.Shell", "kiro set Test.forceCDNTrans=%b", new Object[] { Boolean.valueOf(com.tencent.mm.platformtools.r.hkd) });
        GMTrace.o(427617681408L, 3186);
      }
    });
    a("wechat.shell.SET_DKTEST", new a()
    {
      public final void m(Intent paramAnonymousIntent)
      {
        GMTrace.i(415538085888L, 3096);
        com.tencent.mm.platformtools.r.hkj = paramAnonymousIntent.getIntExtra("key", 0);
        com.tencent.mm.platformtools.r.hkk = paramAnonymousIntent.getIntExtra("val", 0);
        com.tencent.mm.platformtools.r.hkl = paramAnonymousIntent.getStringExtra("str");
        w.w("MicroMsg.Shell", "dkshell set [%d %d] [%s]", new Object[] { Integer.valueOf(com.tencent.mm.platformtools.r.hkj), Integer.valueOf(com.tencent.mm.platformtools.r.hkk), com.tencent.mm.platformtools.r.hkl });
        if (10009 == com.tencent.mm.platformtools.r.hkj)
        {
          int i = com.tencent.mm.platformtools.r.hkk;
          Shell.uv();
          GMTrace.o(415538085888L, 3096);
          return;
        }
        if ((10014 == com.tencent.mm.platformtools.r.hkj) && (ab.bPY()))
        {
          q.JF().a(7L, 1, "");
          GMTrace.o(415538085888L, 3096);
          return;
        }
        if ((10015 == com.tencent.mm.platformtools.r.hkj) && (ab.bPZ()))
        {
          paramAnonymousIntent = new gi();
          paramAnonymousIntent.eJt.type = 13;
          a.vgX.m(paramAnonymousIntent);
        }
        GMTrace.o(415538085888L, 3096);
      }
    });
    a("wechat.shell.NET_DNS_TEST", new a()
    {
      public final void m(Intent paramAnonymousIntent)
      {
        GMTrace.i(423322714112L, 3154);
        com.tencent.mm.platformtools.r.hki = paramAnonymousIntent.getIntExtra("value", 0);
        w.w("MicroMsg.Shell", "dkdnstd set Test.netDnsSimulateFault=%s", new Object[] { Integer.toBinaryString(com.tencent.mm.platformtools.r.hki) });
        GMTrace.o(423322714112L, 3154);
      }
    });
    a("wechat.shell.IDC_ERROR", new a()
    {
      public final void m(Intent paramAnonymousIntent)
      {
        GMTrace.i(422785843200L, 3150);
        com.tencent.mm.platformtools.r.hkm = paramAnonymousIntent.getStringExtra("errmsg");
        w.w("MicroMsg.Shell", "tiger set tigerIDCErrMsg =%s", new Object[] { com.tencent.mm.platformtools.r.hkm });
        GMTrace.o(422785843200L, 3150);
      }
    });
    a("wechat.shell.SET_DK_WT_TEST", new a()
    {
      public final void m(Intent paramAnonymousIntent)
      {
        GMTrace.i(421175230464L, 3138);
        com.tencent.mm.platformtools.r.hkn = paramAnonymousIntent.getStringExtra("acc");
        com.tencent.mm.platformtools.r.hko = paramAnonymousIntent.getStringExtra("pass");
        w.w("MicroMsg.Shell", "dkwt shell [%s %s]", new Object[] { com.tencent.mm.platformtools.r.hkn, com.tencent.mm.platformtools.r.hko });
        GMTrace.o(421175230464L, 3138);
      }
    });
    a("wechat.shell.SET_MUTE_ROOM_TEST", new a()
    {
      public final void m(Intent paramAnonymousIntent)
      {
        GMTrace.i(421443665920L, 3140);
        com.tencent.mm.platformtools.r.hkP = paramAnonymousIntent.getIntExtra("flag", 0);
        w.w("MicroMsg.Shell", "dkwt shell [%d]", new Object[] { Integer.valueOf(com.tencent.mm.platformtools.r.hkP) });
        GMTrace.o(421443665920L, 3140);
      }
    });
    a("wechat.shell.HOTPATCH_TEST", new a()
    {
      public final void m(Intent paramAnonymousIntent)
      {
        GMTrace.i(416074956800L, 3100);
        ib localib = new ib();
        localib.eLv.eLA = paramAnonymousIntent.getExtras().getString("path", "/data/local/tmp/test.apk");
        w.w("MicroMsg.Shell", "hotpatch test [%s]", new Object[] { localib.eLv.eLA });
        a.vgX.m(localib);
        GMTrace.o(416074956800L, 3100);
      }
    });
    a("wechat.shell.EXEC_SQL", new a()
    {
      public final void m(final Intent paramAnonymousIntent)
      {
        GMTrace.i(18811554103296L, 140157);
        if (!ab.bPY())
        {
          GMTrace.o(18811554103296L, 140157);
          return;
        }
        paramAnonymousIntent = paramAnonymousIntent.getExtras().getString("sql", null);
        if ((paramAnonymousIntent == null) || (paramAnonymousIntent.length() == 0))
        {
          GMTrace.o(18811554103296L, 140157);
          return;
        }
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            Object localObject4 = null;
            com.tencent.wcdb.Cursor localCursor = null;
            GMTrace.i(18811822538752L, 140159);
            at.AR();
            SQLiteDatabase localSQLiteDatabase = c.yH().bVk();
            Object localObject2 = localCursor;
            Object localObject1 = localObject4;
            for (;;)
            {
              long l;
              try
              {
                l = System.currentTimeMillis();
                localObject2 = localCursor;
                localObject1 = localObject4;
                localCursor = localSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, paramAnonymousIntent, null, null);
                localObject2 = localCursor;
                localObject1 = localCursor;
                localObject4 = localCursor.getColumnNames();
                if (localObject4 != null) {
                  continue;
                }
                i = 0;
                localObject2 = localCursor;
                localObject1 = localCursor;
                w.i("MicroMsg.Shell", "Executing SQL from shell: " + paramAnonymousIntent);
                if (i > 0)
                {
                  localObject2 = localCursor;
                  localObject1 = localCursor;
                  w.i("MicroMsg.Shell", " > " + TextUtils.join(" | ", (Object[])localObject4));
                }
                localObject2 = localCursor;
                localObject1 = localCursor;
                localObject4 = new StringBuilder(1024);
                localObject2 = localCursor;
                localObject1 = localCursor;
                if (!localCursor.moveToNext()) {
                  break label465;
                }
                localObject2 = localCursor;
                localObject1 = localCursor;
                ((StringBuilder)localObject4).setLength(0);
                localObject2 = localCursor;
                localObject1 = localCursor;
                ((StringBuilder)localObject4).append(" > ");
                j = 0;
                if (j >= i) {
                  break label444;
                }
                localObject2 = localCursor;
                localObject1 = localCursor;
                switch (localCursor.getType(j))
                {
                case 0: 
                  localObject2 = localCursor;
                  localObject1 = localCursor;
                  ((StringBuilder)localObject4).append(localCursor.getString(j));
                }
              }
              catch (RuntimeException localRuntimeException2)
              {
                int i;
                int j;
                localObject1 = localObject2;
                w.e("MicroMsg.Shell", "Failed to execute SQL '%s': %s", new Object[] { paramAnonymousIntent, localRuntimeException2.getMessage() });
                if (localObject2 == null) {
                  break label523;
                }
                ((android.database.Cursor)localObject2).close();
                GMTrace.o(18811822538752L, 140159);
                return;
                localObject2 = localRuntimeException2;
                localObject1 = localRuntimeException2;
                ((StringBuilder)localObject4).append("(blob)");
                continue;
              }
              finally
              {
                if (localObject1 == null) {
                  continue;
                }
                ((android.database.Cursor)localObject1).close();
              }
              localObject2 = localCursor;
              localObject1 = localCursor;
              ((StringBuilder)localObject4).append(" | ");
              j += 1;
              continue;
              localObject2 = localCursor;
              localObject1 = localCursor;
              i = localObject4.length;
              continue;
              localObject2 = localCursor;
              localObject1 = localCursor;
              ((StringBuilder)localObject4).append("(null)");
              continue;
              label444:
              RuntimeException localRuntimeException1 = localRuntimeException2;
              localObject1 = localRuntimeException2;
              w.i("MicroMsg.Shell", ((StringBuilder)localObject4).toString());
              continue;
              label465:
              localRuntimeException1 = localRuntimeException2;
              localObject1 = localRuntimeException2;
              w.i("MicroMsg.Shell", "Finish executing SQL in %d ms: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramAnonymousIntent });
              if (localRuntimeException2 != null)
              {
                localRuntimeException2.close();
                GMTrace.o(18811822538752L, 140159);
                return;
              }
              label523:
              GMTrace.o(18811822538752L, 140159);
              return;
            }
          }
        });
        GMTrace.o(18811554103296L, 140157);
      }
    });
    fTl = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18812090974208L, 140161);
        w.d("MicroMsg.Shell", "dkcrash begin tid:%d [%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName() });
        Object[] arrayOfObject = new Object[1];
        throw new NullPointerException();
      }
    };
    GMTrace.o(428557205504L, 3193);
  }
  
  public Shell()
  {
    GMTrace.i(428020334592L, 3189);
    this.fTi = null;
    GMTrace.o(428020334592L, 3189);
  }
  
  private static void a(String paramString, a parama)
  {
    GMTrace.i(428154552320L, 3190);
    fTk.addAction(paramString);
    fTj.put(paramString, parama);
    GMTrace.o(428154552320L, 3190);
  }
  
  public static void uv()
  {
    GMTrace.i(16009490595840L, 119280);
    GMTrace.o(16009490595840L, 119280);
  }
  
  public static class Receiver
    extends BroadcastReceiver
  {
    public Receiver()
    {
      GMTrace.i(426678157312L, 3179);
      GMTrace.o(426678157312L, 3179);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(426812375040L, 3180);
      paramContext = paramIntent.getAction();
      Shell.a locala = (Shell.a)Shell.fTj.get(paramContext);
      if (locala == null)
      {
        w.e("MicroMsg.Shell", "no action found for %s", new Object[] { paramContext });
        GMTrace.o(426812375040L, 3180);
        return;
      }
      w.e("MicroMsg.Shell", "shell action %s", new Object[] { paramContext });
      locala.m(paramIntent);
      GMTrace.o(426812375040L, 3180);
    }
  }
  
  public static abstract interface a
  {
    public abstract void m(Intent paramIntent);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\Shell.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */