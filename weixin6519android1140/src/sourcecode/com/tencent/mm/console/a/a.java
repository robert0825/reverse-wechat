package com.tencent.mm.console.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Process;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.az.g;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.protocal.c.apq;
import com.tencent.mm.protocal.c.apr;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements com.tencent.mm.pluginsdk.b.a
{
  static
  {
    GMTrace.i(419296182272L, 3124);
    b.a(new a(), new String[] { "//fts" });
    GMTrace.o(419296182272L, 3124);
  }
  
  public a()
  {
    GMTrace.i(418893529088L, 3121);
    GMTrace.o(418893529088L, 3121);
  }
  
  public static void init()
  {
    GMTrace.i(419027746816L, 3122);
    GMTrace.o(419027746816L, 3122);
  }
  
  private static void x(Context paramContext, String paramString)
  {
    GMTrace.i(16432544874496L, 122432);
    TextView localTextView = new TextView(paramContext);
    localTextView.setText(paramString);
    localTextView.setGravity(19);
    localTextView.setTextSize(1, 10.0F);
    localTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    localTextView.setTextColor(-16711936);
    localTextView.setTypeface(Typeface.MONOSPACE);
    int i = paramContext.getResources().getDimensionPixelSize(R.f.aQq);
    localTextView.setPadding(i, i, i, i);
    com.tencent.mm.ui.base.h.a(paramContext, null, localTextView, null);
    GMTrace.o(16432544874496L, 122432);
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    GMTrace.i(419161964544L, 3123);
    if (w.getLogLevel() > 1)
    {
      GMTrace.o(419161964544L, 3123);
      return false;
    }
    if (paramArrayOfString.length < 2)
    {
      GMTrace.o(419161964544L, 3123);
      return true;
    }
    Object localObject1 = paramArrayOfString[1];
    int i = -1;
    switch (((String)localObject1).hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(419161964544L, 3123);
      return true;
      if (!((String)localObject1).equals("msbiz")) {
        break;
      }
      i = 0;
      break;
      if (!((String)localObject1).equals("deletedb")) {
        break;
      }
      i = 1;
      break;
      if (!((String)localObject1).equals("copydb")) {
        break;
      }
      i = 2;
      break;
      if (!((String)localObject1).equals("corrupt")) {
        break;
      }
      i = 3;
      break;
      if (!((String)localObject1).equals("clearconfig")) {
        break;
      }
      i = 4;
      break;
      if (!((String)localObject1).equals("info")) {
        break;
      }
      i = 5;
      break;
      if (!((String)localObject1).equals("insert")) {
        break;
      }
      i = 6;
      break;
      localObject1 = g.KB();
      paramArrayOfString = new StringBuilder();
      localObject1 = ((apr)localObject1).jhd.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (apq)((Iterator)localObject1).next();
        paramArrayOfString.append(String.format("%s | %.2f | %s", new Object[] { r.fs(((apq)localObject2).tRz), Double.valueOf(((apq)localObject2).uFo), n.ac("yyyy-MM-dd HH:mm", ((apq)localObject2).uFp / 1000L) }));
        paramArrayOfString.append("\n");
      }
      x(paramContext, paramArrayOfString.toString());
      continue;
      at.AR();
      c.xh().a(w.a.vyG, Integer.valueOf(0));
      at.AR();
      paramContext = new File(c.zn(), "FTS5IndexMicroMsg.db");
      if (paramContext.exists()) {
        paramContext.delete();
      }
      Process.killProcess(Process.myPid());
      continue;
      at.AR();
      paramContext = new File(c.zn(), "FTS5IndexMicroMsg.db");
      paramArrayOfString = new File("/sdcard/IndexMicroMsg.db");
      if (paramArrayOfString.exists()) {
        paramArrayOfString.delete();
      }
      FileOp.o(paramContext.getAbsolutePath(), paramArrayOfString.getAbsolutePath());
      continue;
      paramContext = new f();
      paramContext.lwS = 65522;
      ((l)com.tencent.mm.kernel.h.j(l.class)).search(10000, paramContext);
      continue;
      paramContext = w.a.vxj;
      paramArrayOfString = w.a.vxk;
      localObject1 = w.a.vxl;
      Object localObject2 = w.a.vxm;
      w.a locala1 = w.a.vxn;
      w.a locala2 = w.a.vxo;
      w.a locala3 = w.a.vxp;
      w.a locala4 = w.a.vxq;
      w.a locala5 = w.a.vxr;
      w.a locala6 = w.a.vxs;
      w.a locala7 = w.a.vxt;
      w.a locala8 = w.a.vxu;
      w.a locala9 = w.a.vxv;
      w.a locala10 = w.a.vxw;
      w.a locala11 = w.a.vxx;
      w.a locala12 = w.a.vxy;
      w.a locala13 = w.a.vxz;
      w.a locala14 = w.a.vxA;
      w.a locala15 = w.a.vxB;
      w.a locala16 = w.a.vxC;
      w.a locala17 = w.a.vxD;
      w.a locala18 = w.a.vxE;
      w.a locala19 = w.a.vxF;
      w.a locala20 = w.a.vxG;
      w.a locala21 = w.a.vxH;
      w.a locala22 = w.a.vxI;
      i = 0;
      while (i < 26)
      {
        w.a locala23 = new w.a[] { paramContext, paramArrayOfString, localObject1, localObject2, locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10, locala11, locala12, locala13, locala14, locala15, locala16, locala17, locala18, locala19, locala20, locala21, locala22 }[i];
        at.AR();
        c.xh().a(locala23, "");
        i += 1;
      }
      paramArrayOfString = new File(com.tencent.mm.loader.stub.a.ghz, "FTS5IndexMicroMsgInfo.txt");
      if (!paramArrayOfString.exists()) {
        continue;
      }
      try
      {
        x(paramContext, FileOp.be(paramArrayOfString.getAbsolutePath()));
      }
      catch (IOException paramContext) {}
      continue;
      paramContext = new f();
      paramContext.lwS = 65521;
      paramContext.lwV = 100;
      if (paramArrayOfString.length > 2) {}
      try
      {
        paramContext.lwV = Integer.valueOf(paramArrayOfString[2]).intValue();
        ((l)com.tencent.mm.kernel.h.j(l.class)).search(10000, paramContext);
      }
      catch (Exception paramArrayOfString)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */