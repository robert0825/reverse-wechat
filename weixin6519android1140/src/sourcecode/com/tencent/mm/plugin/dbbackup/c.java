package com.tencent.mm.plugin.dbbackup;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.method.ScrollingMovementMethod;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bs;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteDebug.IOTraceStats;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class c
  implements a
{
  private d kcO;
  
  c(d paramd)
  {
    GMTrace.i(5137451974656L, 38277);
    this.kcO = paramd;
    GMTrace.o(5137451974656L, 38277);
  }
  
  private boolean b(final Context paramContext, String[] paramArrayOfString)
  {
    int j = 0;
    GMTrace.i(5137586192384L, 38278);
    final String str1 = com.tencent.mm.kernel.h.xy().cachePath;
    final Object localObject = str1 + "ctest/";
    str1 = str1 + "EnMicroMsg.db";
    final String str2 = (String)localObject + "EnMicroMsg.db";
    final String[] arrayOfString = new String[5];
    arrayOfString[0] = "";
    arrayOfString[1] = "-journal";
    arrayOfString[2] = "-wal";
    arrayOfString[3] = ".sm";
    arrayOfString[4] = ".bak";
    int i;
    if (paramArrayOfString.length > 1)
    {
      paramArrayOfString = paramArrayOfString[1];
      i = -1;
      switch (paramArrayOfString.hashCode())
      {
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          GMTrace.o(5137586192384L, 38278);
          return false;
          if (paramArrayOfString.equals("make-test"))
          {
            i = 0;
            continue;
            if (paramArrayOfString.equals("recover-test"))
            {
              i = 1;
              continue;
              if (paramArrayOfString.equals("clear-test")) {
                i = 2;
              }
            }
          }
          break;
        }
      }
      if (FileOp.aZ((String)localObject))
      {
        Toast.makeText(paramContext, "Corruption test database exists.\nClear or recover before creating a new one.", 1).show();
        GMTrace.o(5137586192384L, 38278);
        return true;
      }
      at.AR();
      com.tencent.mm.y.c.yH().bVk().close();
      FileOp.la((String)localObject);
      i = j;
      while (i < 5)
      {
        paramArrayOfString = arrayOfString[i];
        FileOp.al(str1 + paramArrayOfString, str2 + paramArrayOfString);
        i += 1;
      }
      MMAppMgr.a(paramContext, true);
      GMTrace.o(5137586192384L, 38278);
      return true;
      if (!FileOp.aZ((String)localObject))
      {
        Toast.makeText(paramContext, "Corruption test database not exist.", 0).show();
        GMTrace.o(5137586192384L, 38278);
        return true;
      }
      com.tencent.mm.ui.base.h.a(paramContext, "Do you really want to recover test database?\nYour current database WILL BE LOST.", null, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5140807417856L, 38302);
          at.AR();
          com.tencent.mm.y.c.yH().bVk().close();
          paramAnonymousDialogInterface = arrayOfString;
          int i = paramAnonymousDialogInterface.length;
          paramAnonymousInt = 0;
          while (paramAnonymousInt < i)
          {
            String str = paramAnonymousDialogInterface[paramAnonymousInt];
            FileOp.deleteFile(str1 + str);
            FileOp.al(str2 + str, str1 + str);
            paramAnonymousInt += 1;
          }
          FileOp.B(localObject, false);
          MMAppMgr.a(paramContext, true);
          GMTrace.o(5140807417856L, 38302);
        }
      }, null);
      GMTrace.o(5137586192384L, 38278);
      return true;
      if (!FileOp.aZ((String)localObject))
      {
        Toast.makeText(paramContext, "Corruption test database not exist.", 0).show();
        GMTrace.o(5137586192384L, 38278);
        return true;
      }
      com.tencent.mm.ui.base.h.a(paramContext, "Do you really want to clear test database?\nIt can't be recovered anymore.", null, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5143223336960L, 38320);
          FileOp.B(localObject, false);
          Toast.makeText(paramContext, "Corruption test database cleared.", 0).show();
          GMTrace.o(5143223336960L, 38320);
        }
      }, null);
      GMTrace.o(5137586192384L, 38278);
      return true;
    }
    localObject = new StringBuilder(512);
    str1 = com.tencent.mm.kernel.h.xy().xd();
    ((StringBuilder)localObject).append("Corrupted DB: ");
    if (str1 == null)
    {
      ((StringBuilder)localObject).append("not exist");
      paramArrayOfString = new TextView(paramContext);
      paramArrayOfString.setText((CharSequence)localObject);
      paramArrayOfString.setGravity(8388627);
      paramArrayOfString.setTextSize(1, 10.0F);
      paramArrayOfString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      paramArrayOfString.setTextColor(-16744704);
      paramArrayOfString.setTypeface(Typeface.MONOSPACE);
      paramArrayOfString.setMovementMethod(new ScrollingMovementMethod());
      i = paramContext.getResources().getDimensionPixelSize(R.f.aQq);
      paramArrayOfString.setPadding(i, i, i, i);
      com.tencent.mm.ui.base.h.a(paramContext, null, paramArrayOfString, null);
      GMTrace.o(5137586192384L, 38278);
      return true;
    }
    if (str1.contains("/ctest/")) {}
    for (paramArrayOfString = "test";; paramArrayOfString = "exists")
    {
      ((StringBuilder)localObject).append(paramArrayOfString);
      ((StringBuilder)localObject).append("\nCorrupted DB size: ").append(FileOp.kX(str1));
      ((StringBuilder)localObject).append("\nSaved master exists: ").append(FileOp.aZ(str1 + ".sm"));
      ((StringBuilder)localObject).append("\nContent backup exists: ").append(FileOp.aZ(str1 + ".bak"));
      break;
    }
  }
  
  private boolean cf(final Context paramContext)
  {
    GMTrace.i(15235188523008L, 113511);
    if (com.tencent.mm.kernel.h.xy().xd() == null)
    {
      Toast.makeText(paramContext, R.l.dQy, 1).show();
      GMTrace.o(15235188523008L, 113511);
      return true;
    }
    paramContext.getString(R.l.cUG);
    final r localr = com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dQx), false, null);
    final bs localbs = ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.b.class)).bIL();
    localbs.V(1800000L);
    this.kcO.b(new b()
    {
      public final void mr(final int paramAnonymousInt)
      {
        GMTrace.i(5138525716480L, 38285);
        localbs.BN();
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5130606870528L, 38226);
            if (c.1.this.kcQ != null) {
              c.1.this.kcQ.dismiss();
            }
            int i;
            switch (paramAnonymousInt)
            {
            case -1: 
            default: 
              i = R.l.dQw;
            }
            for (;;)
            {
              com.tencent.mm.ui.base.h.h(c.1.this.val$context, i, R.l.cUG);
              GMTrace.o(5130606870528L, 38226);
              return;
              i = R.l.dQA;
              continue;
              i = R.l.dQz;
              continue;
              i = R.l.dQy;
            }
          }
        });
        GMTrace.o(5138525716480L, 38285);
      }
    });
    GMTrace.o(15235188523008L, 113511);
    return true;
  }
  
  private static boolean cg(Context paramContext)
  {
    GMTrace.i(5137720410112L, 38279);
    int i = SQLiteDebug.getLastErrorLine();
    Object localObject1 = SQLiteDebug.getLastIOTraceStats();
    if ((localObject1 == null) || (((ArrayList)localObject1).isEmpty()))
    {
      GMTrace.o(5137720410112L, 38279);
      return true;
    }
    Object localObject2 = (SQLiteDebug.IOTraceStats)((ArrayList)localObject1).get(0);
    localObject1 = "";
    try
    {
      at.AR();
      int j = com.tencent.mm.y.c.ww();
      str1 = p.sZ();
      str1 = com.tencent.mm.a.g.n((str1 + j).getBytes()).substring(0, 7);
      localObject1 = str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str1;
        String str3;
        continue;
        String str2 = "";
      }
    }
    str3 = String.format("DB corrupted (line: %d, hash: %s) => %s", new Object[] { Integer.valueOf(i), localObject1, ((SQLiteDebug.IOTraceStats)localObject2).toString() });
    localObject1 = "";
    if (((SQLiteDebug.IOTraceStats)localObject2).lastReadPage != null) {
      localObject1 = Base64.encodeToString(((SQLiteDebug.IOTraceStats)localObject2).lastReadPage, 0);
    }
    if (((SQLiteDebug.IOTraceStats)localObject2).lastJournalReadPage != null)
    {
      str1 = Base64.encodeToString(((SQLiteDebug.IOTraceStats)localObject2).lastJournalReadPage, 0);
      localObject2 = new HashMap();
      ((HashMap)localObject2).put("lastReadPage", localObject1);
      ((HashMap)localObject2).put("lastJournalReadPage", str1);
      com.tencent.mm.plugin.report.service.g.ork.d("DBCorrupt", str3, (Map)localObject2);
      localObject1 = new TextView(paramContext);
      ((TextView)localObject1).setText(str3);
      ((TextView)localObject1).setGravity(8388627);
      ((TextView)localObject1).setTextSize(1, 10.0F);
      ((TextView)localObject1).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      ((TextView)localObject1).setTextColor(-16744704);
      ((TextView)localObject1).setTypeface(Typeface.MONOSPACE);
      ((TextView)localObject1).setMovementMethod(new ScrollingMovementMethod());
      i = paramContext.getResources().getDimensionPixelSize(R.f.aQq);
      ((TextView)localObject1).setPadding(i, i, i, i);
      com.tencent.mm.ui.base.h.a(paramContext, null, (View)localObject1, null);
      GMTrace.o(5137720410112L, 38279);
      return true;
    }
  }
  
  public final boolean a(Context paramContext, final String[] paramArrayOfString)
  {
    GMTrace.i(5137854627840L, 38280);
    final Object localObject = paramArrayOfString[0];
    int i = -1;
    switch (((String)localObject).hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        GMTrace.o(5137854627840L, 38280);
        return false;
        if (((String)localObject).equals("//recover"))
        {
          i = 0;
          continue;
          if (((String)localObject).equals("//post-recover"))
          {
            i = 1;
            continue;
            if (((String)localObject).equals("//backupdb"))
            {
              i = 2;
              continue;
              if (((String)localObject).equals("//recoverdb"))
              {
                i = 3;
                continue;
                if (((String)localObject).equals("//repairdb"))
                {
                  i = 4;
                  continue;
                  if (((String)localObject).equals("//corruptdb"))
                  {
                    i = 5;
                    continue;
                    if (((String)localObject).equals("//iotracedb")) {
                      i = 6;
                    }
                  }
                }
              }
            }
          }
        }
        break;
      }
    }
    final boolean bool = cf(paramContext);
    GMTrace.o(5137854627840L, 38280);
    return bool;
    at.AR();
    d.apt();
    Toast.makeText(paramContext, "Post recovery cleanup done.", 0).show();
    GMTrace.o(5137854627840L, 38280);
    return true;
    if ((paramArrayOfString.length > 1) && (paramArrayOfString[1].equals("cipher")))
    {
      at.AR();
      localObject = com.tencent.mm.y.c.xh();
      if (paramArrayOfString.length > 2)
      {
        paramArrayOfString = paramArrayOfString[2];
        i = -1;
      }
      switch (paramArrayOfString.hashCode())
      {
      default: 
        switch (i)
        {
        default: 
          label444:
          if (((t)localObject).getInt(237571, 0) != 0) {}
          break;
        }
        break;
      }
      for (bool = true;; bool = false)
      {
        Toast.makeText(paramContext, "Database backup with cipher: " + bool, 0).show();
        GMTrace.o(5137854627840L, 38280);
        return true;
        if (!paramArrayOfString.equals("yes")) {
          break;
        }
        i = 0;
        break;
        if (!paramArrayOfString.equals("on")) {
          break;
        }
        i = 1;
        break;
        if (!paramArrayOfString.equals("1")) {
          break;
        }
        i = 2;
        break;
        if (!paramArrayOfString.equals("no")) {
          break;
        }
        i = 3;
        break;
        if (!paramArrayOfString.equals("off")) {
          break;
        }
        i = 4;
        break;
        if (!paramArrayOfString.equals("0")) {
          break;
        }
        i = 5;
        break;
        ((t)localObject).setInt(237571, 0);
        ((t)localObject).kL(true);
        break label444;
        ((t)localObject).setInt(237571, 1);
        ((t)localObject).kL(true);
        break label444;
      }
    }
    if ((paramArrayOfString.length > 1) && (paramArrayOfString[1].equals("incremental"))) {}
    final long l;
    for (bool = true;; bool = false)
    {
      l = System.nanoTime();
      paramArrayOfString = com.tencent.mm.ui.base.h.a(paramContext, "Backing database up. Please wait...", false, null);
      if (this.kcO.a(bool, new b()
      {
        public final void mr(final int paramAnonymousInt)
        {
          GMTrace.i(5139599458304L, 38293);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5139331022848L, 38291);
              if (c.2.this.kcQ != null) {
                c.2.this.kcQ.dismiss();
              }
              String str;
              if (paramAnonymousInt == 0) {
                if (c.2.this.kcU)
                {
                  str = "incremental";
                  str = String.format("Database (%s) backup succeeded, elapsed %.2f seconds.", new Object[] { str, Float.valueOf((float)(System.nanoTime() - c.2.this.gHW) / 1.0E9F) });
                }
              }
              for (;;)
              {
                Toast.makeText(c.2.this.val$context, str, 0).show();
                GMTrace.o(5139331022848L, 38291);
                return;
                str = "new";
                break;
                if (paramAnonymousInt == 1) {
                  str = "Database backup canceled.";
                } else {
                  str = "Database backup failed.";
                }
              }
            }
          });
          GMTrace.o(5139599458304L, 38293);
        }
      })) {
        break;
      }
      if (paramArrayOfString != null) {
        paramArrayOfString.dismiss();
      }
      Toast.makeText(paramContext, "Database is busy.", 0).show();
      break;
    }
    if (paramArrayOfString.length > 1) {}
    for (paramArrayOfString = paramArrayOfString[1];; paramArrayOfString = null)
    {
      l = System.nanoTime();
      paramContext.getString(R.l.cUG);
      localObject = com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dQx), false, null);
      this.kcO.a(paramArrayOfString, new b()
      {
        public final void mr(final int paramAnonymousInt)
        {
          GMTrace.i(5131143741440L, 38230);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5142686466048L, 38316);
              if (c.3.this.kcQ != null) {
                c.3.this.kcQ.dismiss();
              }
              String str;
              if (paramAnonymousInt == 0) {
                str = String.format("Database recovery succeeded, elapsed %.2f seconds.", new Object[] { Float.valueOf((float)(System.nanoTime() - c.3.this.gHW) / 1.0E9F) });
              }
              for (;;)
              {
                Toast.makeText(c.3.this.val$context, str, 0).show();
                GMTrace.o(5142686466048L, 38316);
                return;
                if (paramAnonymousInt == 1) {
                  str = "Database recovery canceled.";
                } else {
                  str = "Database recovery failed.";
                }
              }
            }
          });
          GMTrace.o(5131143741440L, 38230);
        }
      });
      GMTrace.o(5137854627840L, 38280);
      return true;
    }
    if (paramArrayOfString.length > 1)
    {
      paramArrayOfString = paramArrayOfString[1];
      l = System.nanoTime();
      paramContext.getString(R.l.cUG);
      localObject = com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dQx), false, null);
      i = this.kcO.b(paramArrayOfString, new b()
      {
        public final void mr(final int paramAnonymousInt)
        {
          GMTrace.i(5142954901504L, 38318);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5140538982400L, 38300);
              if (c.4.this.kcQ != null) {
                c.4.this.kcQ.dismiss();
              }
              String str;
              if (paramAnonymousInt == 0) {
                str = String.format("Database recovery succeeded, elapsed %.2f seconds.", new Object[] { Float.valueOf((float)(System.nanoTime() - c.4.this.gHW) / 1.0E9F) });
              }
              for (;;)
              {
                Toast.makeText(c.4.this.val$context, str, 0).show();
                GMTrace.o(5140538982400L, 38300);
                return;
                if (paramAnonymousInt == 1) {
                  str = "Database recovery canceled.";
                } else {
                  str = "Database recovery failed.";
                }
              }
            }
          });
          GMTrace.o(5142954901504L, 38318);
        }
      });
      if (i != 0)
      {
        if (localObject != null) {
          ((ProgressDialog)localObject).dismiss();
        }
        switch (i)
        {
        default: 
          i = R.l.dQw;
        }
      }
    }
    for (;;)
    {
      Toast.makeText(paramContext, i, 1).show();
      GMTrace.o(5137854627840L, 38280);
      return true;
      paramArrayOfString = null;
      break;
      i = R.l.dQz;
      continue;
      i = R.l.dQy;
    }
    bool = b(paramContext, paramArrayOfString);
    GMTrace.o(5137854627840L, 38280);
    return bool;
    bool = cg(paramContext);
    GMTrace.o(5137854627840L, 38280);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\dbbackup\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */