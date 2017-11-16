package com.tencent.mm.plugin.sns.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.FileEntry;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.Iterator;
import java.util.List;

public final class aa
{
  public static boolean myS;
  public static char[] pto;
  public com.tencent.mm.sdk.platformtools.ae handler;
  public boolean ptl;
  public long ptm;
  public int ptn;
  
  static
  {
    int i = 0;
    GMTrace.i(8060177219584L, 60053);
    myS = false;
    pto = new char[36];
    int j = 48;
    while (j <= 57)
    {
      pto[i] = ((char)j);
      j += 1;
      i += 1;
    }
    j = 97;
    while (j <= 122)
    {
      pto[i] = ((char)j);
      j += 1;
      i += 1;
    }
    GMTrace.o(8060177219584L, 60053);
  }
  
  public aa()
  {
    GMTrace.i(8058969260032L, 60044);
    this.ptl = false;
    this.ptm = 0L;
    this.ptn = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8072256815104L, 60143);
        super.handleMessage(paramAnonymousMessage);
        if ((aa.this.ptn >= 5) || (System.currentTimeMillis() - aa.this.ptm > 300000L))
        {
          w.d("MicroMsg.RemoveSnsTask", "cleanCount: " + aa.this.ptn);
          aa.myS = false;
          GMTrace.o(8072256815104L, 60143);
          return;
        }
        if (aa.this.ptl)
        {
          GMTrace.o(8072256815104L, 60143);
          return;
        }
        if (aa.myS) {
          new aa.a(aa.this).m(new String[] { "" });
        }
        GMTrace.o(8072256815104L, 60143);
      }
    };
    GMTrace.o(8058969260032L, 60044);
  }
  
  public static boolean S(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(16041165979648L, 119516);
    paramString1 = FileOp.A(paramString1, true).iterator();
    while (paramString1.hasNext())
    {
      SFSContext.FileEntry localFileEntry = (SFSContext.FileEntry)paramString1.next();
      if (!myS)
      {
        w.d("MicroMsg.RemoveSnsTask", "broken here by ??");
        GMTrace.o(16041165979648L, 119516);
        return false;
      }
      if ((localFileEntry.name != null) && (!bg.nm(paramString2)) && (paramString3 != null) && ((localFileEntry.name.contains(paramString2)) || (localFileEntry.name.contains(paramString3)))) {
        w.d("MicroMsg.RemoveSnsTask", "do not delete my bg %s", new Object[] { paramString2 });
      } else if (bg.aH(localFileEntry.timestamp) > 604800000L) {
        FileOp.deleteFile(localFileEntry.name);
      }
    }
    GMTrace.o(16041165979648L, 119516);
    return true;
  }
  
  public static void b(PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(8059103477760L, 60045);
    if (paramPInt2.value + 1 >= 36)
    {
      paramPInt2.value = 0;
      paramPInt1.value = ((paramPInt1.value + 1) % 36);
      GMTrace.o(8059103477760L, 60045);
      return;
    }
    paramPInt2.value = ((paramPInt2.value + 1) % 36);
    GMTrace.o(8059103477760L, 60045);
  }
  
  public final class a
    extends com.tencent.mm.pluginsdk.model.k<String, String, Boolean>
  {
    private String amf;
    private SharedPreferences ghC;
    private String ptq;
    PInt ptr;
    PInt ptt;
    private String ptu;
    private String username;
    
    public a()
    {
      GMTrace.i(8111985262592L, 60439);
      this.ghC = null;
      this.ptq = "";
      this.amf = "";
      this.ptr = new PInt();
      this.ptt = new PInt();
      this.ghC = ab.getContext().getSharedPreferences("preferences_remove_task", 0);
      h.xz();
      if (!h.xw().wL())
      {
        GMTrace.o(8111985262592L, 60439);
        return;
      }
      this.username = q.zE();
      this.ptq = ("remove_key_base" + this.username);
      this.amf = ("remove_key" + this.username);
      h.xz();
      if (!h.xw().wL())
      {
        GMTrace.o(8111985262592L, 60439);
        return;
      }
      if (ae.biM())
      {
        GMTrace.o(8111985262592L, 60439);
        return;
      }
      if (ae.yH() == null)
      {
        GMTrace.o(8111985262592L, 60439);
        return;
      }
      if (ae.bjh() == null)
      {
        GMTrace.o(8111985262592L, 60439);
        return;
      }
      com.tencent.mm.plugin.sns.storage.k localk = ae.bjh().Iw(this.username);
      if (localk != null) {
        this.ptu = localk.field_bgId;
      }
      w.d("MicroMsg.RemoveSnsTask", "my bgid %s", new Object[] { this.ptu });
      aa.this.ptl = true;
      GMTrace.o(8111985262592L, 60439);
    }
    
    private Boolean biB()
    {
      GMTrace.i(8112119480320L, 60440);
      w.d("MicroMsg.RemoveSnsTask", "simpleCleans sns");
      if (!aa.myS)
      {
        GMTrace.o(8112119480320L, 60440);
        return Boolean.valueOf(false);
      }
      if (!aa.this.ptl)
      {
        GMTrace.o(8112119480320L, 60440);
        return Boolean.valueOf(false);
      }
      if (ae.biM())
      {
        aa.myS = false;
        GMTrace.o(8112119480320L, 60440);
        return Boolean.valueOf(false);
      }
      this.ptr.value = this.ghC.getInt(this.ptq, 0);
      this.ptt.value = this.ghC.getInt(this.amf, 0);
      String str = ae.getAccSnsPath();
      try
      {
        long l = System.currentTimeMillis();
        if (!aa.S(str + aa.pto[(this.ptr.value % 36)] + "/" + aa.pto[(this.ptt.value % 36)], this.ptu, this.username))
        {
          GMTrace.o(8112119480320L, 60440);
          return Boolean.valueOf(false);
        }
        w.d("MicroMsg.RemoveSnsTask", "clean sns uses time : " + (System.currentTimeMillis() - l) + " " + this.ptr.value + " " + this.ptt.value);
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      GMTrace.o(8112119480320L, 60440);
      return Boolean.valueOf(true);
    }
    
    public final com.tencent.mm.sdk.platformtools.ae biu()
    {
      GMTrace.i(8112253698048L, 60441);
      com.tencent.mm.sdk.platformtools.ae localae = ae.biP();
      GMTrace.o(8112253698048L, 60441);
      return localae;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */