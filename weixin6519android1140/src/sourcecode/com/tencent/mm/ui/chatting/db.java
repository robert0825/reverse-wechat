package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.tools.i;
import com.tencent.mm.pluginsdk.ui.tools.i.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;

public final class db
{
  SharedPreferences ghC;
  long kCF;
  LinearLayout kuN;
  public Context mContext;
  public String nYj;
  public String nYk;
  public String nYl;
  ChatFooterCustom wAk;
  FrameLayout wAl;
  FrameLayout wAm;
  public TextView wAn;
  ImageView wAo;
  public a wAp;
  public int wAq;
  public boolean wAr;
  String wAs;
  String wAt;
  View.OnClickListener wAu;
  View.OnClickListener wAv;
  private i.a wAw;
  
  public db(ChatFooterCustom paramChatFooterCustom)
  {
    GMTrace.i(2264253071360L, 16870);
    this.kuN = null;
    this.wAp = a.wAA;
    this.wAq = -1;
    this.wAs = null;
    this.kCF = -1L;
    this.wAu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2172985016320L, 16190);
        new Intent().putExtra("composeType", 1);
        d.x(db.this.mContext, "qqmail", ".ui.ComposeUI");
        GMTrace.o(2172985016320L, 16190);
      }
    };
    this.wAv = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2168958484480L, 16160);
        switch (db.8.wAz[db.this.wAp.ordinal()])
        {
        }
        for (;;)
        {
          GMTrace.o(2168958484480L, 16160);
          return;
          com.tencent.mm.plugin.report.service.g.ork.i(11288, new Object[] { Integer.valueOf(6) });
          paramAnonymousView = db.this;
          if (!am.isConnected(paramAnonymousView.mContext))
          {
            h.a(paramAnonymousView.mContext, com.tencent.mm.br.a.X(paramAnonymousView.mContext, R.l.deL), "", com.tencent.mm.br.a.X(paramAnonymousView.mContext, R.l.deG), null);
            GMTrace.o(2168958484480L, 16160);
            return;
          }
          if (!am.isWifi(paramAnonymousView.mContext))
          {
            h.a(paramAnonymousView.mContext, R.l.deI, 0, R.l.deE, R.l.deD, new db.3(paramAnonymousView), null);
            GMTrace.o(2168958484480L, 16160);
            return;
          }
          h.a(paramAnonymousView.mContext, R.l.deJ, 0, R.l.deE, R.l.deD, new db.4(paramAnonymousView), null);
          GMTrace.o(2168958484480L, 16160);
          return;
          paramAnonymousView = db.this;
          w.i("MicroMsg.ChattingQQMailFooterHandler", "dz[cancelDownload]");
          f.apJ().bf(paramAnonymousView.kCF);
          paramAnonymousView.ccK();
          GMTrace.o(2168958484480L, 16160);
          return;
          com.tencent.mm.plugin.report.service.g.ork.i(11288, new Object[] { Integer.valueOf(7) });
          paramAnonymousView = db.this;
          w.i("MicroMsg.ChattingQQMailFooterHandler", "dz[installQQMail]");
          bg.i(paramAnonymousView.wAs, paramAnonymousView.mContext);
          GMTrace.o(2168958484480L, 16160);
          return;
          com.tencent.mm.plugin.report.service.g.ork.i(11288, new Object[] { Integer.valueOf(5) });
          db localdb = db.this;
          w.i("MicroMsg.ChattingQQMailFooterHandler", "dz[openQQMail]");
          w.i("MicroMsg.ChattingQQMailFooterHandler", "mQQMailScheme = %s", new Object[] { localdb.wAt });
          if (bg.nm(localdb.wAt)) {
            paramAnonymousView = localdb.mContext.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
          }
          for (;;)
          {
            w.i("MicroMsg.ChattingQQMailFooterHandler", "intent = %s", new Object[] { paramAnonymousView });
            com.tencent.mm.bv.a.post(new db.5(localdb, paramAnonymousView));
            GMTrace.o(2168958484480L, 16160);
            return;
            Intent localIntent = new Intent();
            localIntent.setData(Uri.parse(localdb.wAt));
            localIntent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 11) {
              localIntent.addFlags(32768);
            }
            paramAnonymousView = localIntent;
            if (!bg.j(localdb.mContext, localIntent)) {
              paramAnonymousView = localdb.mContext.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
            }
          }
          if (db.this.wAr) {
            db.this.ccL();
          }
        }
      }
    };
    this.wAw = new i.a()
    {
      public final void aYJ()
      {
        GMTrace.i(17904913350656L, 133402);
        db.this.wAn.setText(R.l.deO);
        GMTrace.o(17904913350656L, 133402);
      }
      
      public final void sT(int paramAnonymousInt)
      {
        GMTrace.i(17904779132928L, 133401);
        db.this.wAq = paramAnonymousInt;
        db.this.ccN();
        GMTrace.o(17904779132928L, 133401);
      }
    };
    this.mContext = paramChatFooterCustom.getContext();
    this.wAk = paramChatFooterCustom;
    GMTrace.o(2264253071360L, 16870);
  }
  
  final void ccJ()
  {
    GMTrace.i(2264387289088L, 16871);
    if (this.wAp == a.wAE)
    {
      this.wAo.setImageResource(R.k.cOj);
      GMTrace.o(2264387289088L, 16871);
      return;
    }
    this.wAo.setImageResource(R.k.cOk);
    GMTrace.o(2264387289088L, 16871);
  }
  
  public final void ccK()
  {
    GMTrace.i(2264521506816L, 16872);
    Object localObject;
    if (p.n(this.mContext, "com.tencent.androidqqmail")) {
      localObject = a.wAE;
    }
    for (;;)
    {
      this.wAp = ((a)localObject);
      ccJ();
      w.i("MicroMsg.ChattingQQMailFooterHandler", "dz[initRightBtnTv: status:%s]", new Object[] { this.wAp.toString() });
      switch (8.wAz[this.wAp.ordinal()])
      {
      default: 
        i.a(this.wAw);
        GMTrace.o(2264521506816L, 16872);
        return;
        this.ghC = this.mContext.getSharedPreferences("QQMAIL", 4);
        this.kCF = this.ghC.getLong("qqmail_downloadid", -1L);
        if (this.kCF < 0L)
        {
          if (bg.nm(this.nYj)) {
            localObject = a.wAF;
          } else {
            localObject = a.wAB;
          }
        }
        else
        {
          localObject = f.apJ().bg(this.kCF);
          int i = ((FileDownloadTaskInfo)localObject).status;
          this.wAs = ((FileDownloadTaskInfo)localObject).path;
          switch (i)
          {
          case 2: 
          default: 
            if (bg.nm(this.nYj)) {
              localObject = a.wAF;
            }
            break;
          case 3: 
            if (com.tencent.mm.a.e.aZ(this.wAs)) {
              localObject = a.wAD;
            } else if (bg.nm(this.nYj)) {
              localObject = a.wAF;
            } else {
              localObject = a.wAB;
            }
            break;
          case 1: 
            localObject = a.wAC;
            continue;
            localObject = a.wAB;
          }
        }
        break;
      }
    }
    this.wAn.setText(R.l.deH);
    GMTrace.o(2264521506816L, 16872);
    return;
    this.wAn.setText(R.l.deF);
    GMTrace.o(2264521506816L, 16872);
    return;
    i.a(this.wAw);
    GMTrace.o(2264521506816L, 16872);
  }
  
  public final void ccL()
  {
    GMTrace.i(16015798829056L, 119327);
    w.i("MicroMsg.ChattingQQMailFooterHandler", "dz[handleNoUrl]");
    h.a(this.mContext, com.tencent.mm.br.a.X(this.mContext, R.l.deK), "", com.tencent.mm.br.a.X(this.mContext, R.l.deG), null);
    GMTrace.o(16015798829056L, 119327);
  }
  
  public final void ccM()
  {
    GMTrace.i(16015933046784L, 119328);
    w.i("MicroMsg.ChattingQQMailFooterHandler", "dz[initQQMailDownloadUrlAndMD5]");
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: ldc2_w 37
        //   3: ldc 39
        //   5: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: aconst_null
        //   9: astore_2
        //   10: aconst_null
        //   11: astore 5
        //   13: new 41	java/net/URL
        //   16: dup
        //   17: aload_0
        //   18: getfield 19	com/tencent/mm/ui/chatting/db$6:wAx	Lcom/tencent/mm/ui/chatting/db;
        //   21: getfield 45	com/tencent/mm/ui/chatting/db:nYj	Ljava/lang/String;
        //   24: invokespecial 48	java/net/URL:<init>	(Ljava/lang/String;)V
        //   27: invokevirtual 52	java/net/URL:openConnection	()Ljava/net/URLConnection;
        //   30: checkcast 54	java/net/HttpURLConnection
        //   33: astore_3
        //   34: aload_3
        //   35: iconst_0
        //   36: invokevirtual 58	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
        //   39: aload_3
        //   40: invokevirtual 61	java/net/HttpURLConnection:connect	()V
        //   43: aload_0
        //   44: getfield 19	com/tencent/mm/ui/chatting/db$6:wAx	Lcom/tencent/mm/ui/chatting/db;
        //   47: aload_3
        //   48: ldc 63
        //   50: invokevirtual 67	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
        //   53: putfield 70	com/tencent/mm/ui/chatting/db:nYk	Ljava/lang/String;
        //   56: aload_3
        //   57: invokevirtual 74	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
        //   60: astore 4
        //   62: aload_3
        //   63: ldc 76
        //   65: iconst_m1
        //   66: invokevirtual 80	java/net/HttpURLConnection:getHeaderFieldInt	(Ljava/lang/String;I)I
        //   69: istore_1
        //   70: iload_1
        //   71: ifgt +32 -> 103
        //   74: ldc 82
        //   76: ldc 84
        //   78: invokestatic 90	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   81: aload 4
        //   83: invokevirtual 95	java/io/InputStream:close	()V
        //   86: aload_3
        //   87: ifnull +146 -> 233
        //   90: aload_3
        //   91: invokevirtual 98	java/net/HttpURLConnection:disconnect	()V
        //   94: ldc2_w 37
        //   97: ldc 39
        //   99: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   102: return
        //   103: iload_1
        //   104: newarray <illegal type>
        //   106: astore_2
        //   107: aload 4
        //   109: aload_2
        //   110: invokevirtual 102	java/io/InputStream:read	([B)I
        //   113: pop
        //   114: aload 4
        //   116: invokevirtual 95	java/io/InputStream:close	()V
        //   119: aload_0
        //   120: getfield 19	com/tencent/mm/ui/chatting/db$6:wAx	Lcom/tencent/mm/ui/chatting/db;
        //   123: getfield 106	com/tencent/mm/ui/chatting/db:mContext	Landroid/content/Context;
        //   126: ldc 108
        //   128: invokestatic 114	com/tencent/mm/a/l:l	(Landroid/content/Context;Ljava/lang/String;)Ljava/security/PublicKey;
        //   131: astore 4
        //   133: aload_2
        //   134: iconst_0
        //   135: invokestatic 120	android/util/Base64:decode	([BI)[B
        //   138: aload 4
        //   140: invokestatic 124	com/tencent/mm/a/l:a	([BLjava/security/PublicKey;)[B
        //   143: astore_2
        //   144: aload_0
        //   145: getfield 19	com/tencent/mm/ui/chatting/db$6:wAx	Lcom/tencent/mm/ui/chatting/db;
        //   148: new 126	java/lang/String
        //   151: dup
        //   152: aload_2
        //   153: invokespecial 129	java/lang/String:<init>	([B)V
        //   156: putfield 132	com/tencent/mm/ui/chatting/db:nYl	Ljava/lang/String;
        //   159: new 13	com/tencent/mm/ui/chatting/db$6$1
        //   162: dup
        //   163: aload_0
        //   164: invokespecial 135	com/tencent/mm/ui/chatting/db$6$1:<init>	(Lcom/tencent/mm/ui/chatting/db$6;)V
        //   167: invokestatic 141	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
        //   170: goto -84 -> 86
        //   173: astore 4
        //   175: aload_3
        //   176: astore_2
        //   177: ldc 82
        //   179: aload 4
        //   181: ldc -113
        //   183: iconst_0
        //   184: anewarray 4	java/lang/Object
        //   187: invokestatic 147	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   190: aload_3
        //   191: astore_2
        //   192: aload_0
        //   193: getfield 19	com/tencent/mm/ui/chatting/db$6:wAx	Lcom/tencent/mm/ui/chatting/db;
        //   196: invokevirtual 150	com/tencent/mm/ui/chatting/db:ccL	()V
        //   199: aload_3
        //   200: ifnull +33 -> 233
        //   203: aload_3
        //   204: invokevirtual 98	java/net/HttpURLConnection:disconnect	()V
        //   207: ldc2_w 37
        //   210: ldc 39
        //   212: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   215: return
        //   216: astore 4
        //   218: aload_2
        //   219: astore_3
        //   220: aload 4
        //   222: astore_2
        //   223: aload_3
        //   224: ifnull +7 -> 231
        //   227: aload_3
        //   228: invokevirtual 98	java/net/HttpURLConnection:disconnect	()V
        //   231: aload_2
        //   232: athrow
        //   233: ldc2_w 37
        //   236: ldc 39
        //   238: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   241: return
        //   242: astore_2
        //   243: goto -20 -> 223
        //   246: astore 4
        //   248: aload 5
        //   250: astore_3
        //   251: goto -76 -> 175
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	254	0	this	6
        //   69	35	1	i	int
        //   9	223	2	localObject1	Object
        //   242	1	2	localObject2	Object
        //   33	218	3	localObject3	Object
        //   60	79	4	localObject4	Object
        //   173	7	4	localException1	Exception
        //   216	5	4	localObject5	Object
        //   246	1	4	localException2	Exception
        //   11	238	5	localObject6	Object
        // Exception table:
        //   from	to	target	type
        //   34	70	173	java/lang/Exception
        //   74	86	173	java/lang/Exception
        //   103	170	173	java/lang/Exception
        //   13	34	216	finally
        //   177	190	216	finally
        //   192	199	216	finally
        //   34	70	242	finally
        //   74	86	242	finally
        //   103	170	242	finally
        //   13	34	246	java/lang/Exception
      }
    }, "QQMailDownloadUrlAndMD5");
    GMTrace.o(16015933046784L, 119328);
  }
  
  public final void ccN()
  {
    GMTrace.i(2264655724544L, 16873);
    if (this.wAq == 0)
    {
      this.wAn.setText(R.l.deO);
      GMTrace.o(2264655724544L, 16873);
      return;
    }
    if (this.wAq > 99)
    {
      this.wAn.setText(R.l.deN);
      GMTrace.o(2264655724544L, 16873);
      return;
    }
    this.wAn.setText(String.format(com.tencent.mm.br.a.X(this.mContext, R.l.deM), new Object[] { Integer.valueOf(this.wAq) }));
    GMTrace.o(2264655724544L, 16873);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(2270963957760L, 16920);
      wAA = new a("DEFAULT", 0);
      wAB = new a("NEED_DOWNLOAD", 1);
      wAC = new a("DOWNLOADING", 2);
      wAD = new a("NEED_INSTALL", 3);
      wAE = new a("INSTALLED", 4);
      wAF = new a("NO_URL", 5);
      wAG = new a[] { wAA, wAB, wAC, wAD, wAE, wAF };
      GMTrace.o(2270963957760L, 16920);
    }
    
    private a()
    {
      GMTrace.i(2270829740032L, 16919);
      GMTrace.o(2270829740032L, 16919);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */