package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelmulti.i;
import com.tencent.mm.pluginsdk.ui.applet.o.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.j.a.a;
import com.tencent.mm.ui.j.a.b;
import com.tencent.mm.ui.j.a.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class InviteFriendsBy3rdUI
  extends MMPreference
  implements com.tencent.mm.ad.e, a.a, a.b
{
  private static int quA;
  private static int quu;
  private static int quv;
  private static int quw;
  private static int qux;
  private static int quy;
  private static int quz;
  private int fromScene;
  private ProgressDialog htG;
  private ProgressBar lho;
  private ProgressDialog msk;
  private com.tencent.mm.ui.j.a qjk;
  private int quB;
  private Bitmap quC;
  private View quD;
  private ImageView quE;
  private EditText quF;
  private boolean quG;
  private boolean quH;
  
  static
  {
    GMTrace.i(5790823874560L, 43145);
    quu = 1;
    quv = 2;
    quw = 3;
    qux = 4;
    quy = 5;
    quz = 0;
    quA = 1;
    GMTrace.o(5790823874560L, 43145);
  }
  
  public InviteFriendsBy3rdUI()
  {
    GMTrace.i(5788407955456L, 43127);
    this.quB = 0;
    this.htG = null;
    this.msk = null;
    this.quC = null;
    this.quE = null;
    this.lho = null;
    this.quF = null;
    this.qjk = new com.tencent.mm.ui.j.a();
    this.quG = false;
    this.quH = false;
    GMTrace.o(5788407955456L, 43127);
  }
  
  /* Error */
  private static byte[] AC(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 125
    //   3: ldc 127
    //   5: invokestatic 73	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 133	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   11: pop
    //   12: invokestatic 139	com/tencent/mm/y/c:yU	()Ljava/lang/String;
    //   15: astore_1
    //   16: invokestatic 133	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   19: pop
    //   20: aload_1
    //   21: invokestatic 142	com/tencent/mm/y/c:yV	()Ljava/lang/String;
    //   24: ldc -112
    //   26: aload_0
    //   27: invokevirtual 150	java/lang/String:getBytes	()[B
    //   30: invokestatic 156	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   33: ldc -98
    //   35: invokestatic 164	com/tencent/mm/sdk/platformtools/h:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   38: astore_0
    //   39: new 166	java/io/RandomAccessFile
    //   42: dup
    //   43: aload_0
    //   44: ldc -88
    //   46: invokespecial 171	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   49: astore_1
    //   50: aload_1
    //   51: astore_0
    //   52: aload_1
    //   53: invokevirtual 175	java/io/RandomAccessFile:length	()J
    //   56: l2i
    //   57: newarray <illegal type>
    //   59: astore_2
    //   60: aload_1
    //   61: astore_0
    //   62: aload_1
    //   63: aload_2
    //   64: invokevirtual 179	java/io/RandomAccessFile:read	([B)I
    //   67: pop
    //   68: aload_1
    //   69: invokevirtual 182	java/io/RandomAccessFile:close	()V
    //   72: ldc2_w 125
    //   75: ldc 127
    //   77: invokestatic 90	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   80: aload_2
    //   81: areturn
    //   82: astore_2
    //   83: aconst_null
    //   84: astore_1
    //   85: aload_1
    //   86: astore_0
    //   87: ldc -72
    //   89: aload_2
    //   90: ldc -70
    //   92: iconst_0
    //   93: anewarray 188	java/lang/Object
    //   96: invokestatic 194	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   99: aload_1
    //   100: ifnull +7 -> 107
    //   103: aload_1
    //   104: invokevirtual 182	java/io/RandomAccessFile:close	()V
    //   107: ldc2_w 125
    //   110: ldc 127
    //   112: invokestatic 90	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   115: aconst_null
    //   116: areturn
    //   117: astore_1
    //   118: aconst_null
    //   119: astore_0
    //   120: aload_0
    //   121: ifnull +7 -> 128
    //   124: aload_0
    //   125: invokevirtual 182	java/io/RandomAccessFile:close	()V
    //   128: aload_1
    //   129: athrow
    //   130: astore_0
    //   131: goto -59 -> 72
    //   134: astore_0
    //   135: goto -28 -> 107
    //   138: astore_0
    //   139: goto -11 -> 128
    //   142: astore_1
    //   143: goto -23 -> 120
    //   146: astore_2
    //   147: goto -62 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	paramString	String
    //   15	89	1	localObject1	Object
    //   117	12	1	localObject2	Object
    //   142	1	1	localObject3	Object
    //   59	22	2	arrayOfByte	byte[]
    //   82	8	2	localException1	Exception
    //   146	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   39	50	82	java/lang/Exception
    //   39	50	117	finally
    //   68	72	130	java/lang/Exception
    //   103	107	134	java/lang/Exception
    //   124	128	138	java/lang/Exception
    //   52	60	142	finally
    //   62	68	142	finally
    //   87	99	142	finally
    //   52	60	146	java/lang/Exception
    //   62	68	146	java/lang/Exception
  }
  
  private static Bitmap aJt()
  {
    GMTrace.i(5790018568192L, 43139);
    Object localObject = AC(q.zE());
    if (localObject == null)
    {
      GMTrace.o(5790018568192L, 43139);
      return null;
    }
    localObject = com.tencent.mm.sdk.platformtools.d.bg((byte[])localObject);
    GMTrace.o(5790018568192L, 43139);
    return (Bitmap)localObject;
  }
  
  private static boolean ag(Context paramContext, String paramString)
  {
    GMTrace.i(5789347479552L, 43134);
    if (bg.nm(paramString))
    {
      GMTrace.o(5789347479552L, 43134);
      return false;
    }
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 8192);
      GMTrace.o(5789347479552L, 43134);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      GMTrace.o(5789347479552L, 43134);
    }
    return false;
  }
  
  private void k(final int paramInt, final String paramString1, String paramString2)
  {
    GMTrace.i(5789884350464L, 43138);
    this.quD = View.inflate(this.vKB.vKW, R.i.ctz, null);
    this.quF = ((EditText)this.quD.findViewById(R.h.bqa));
    this.quE = ((ImageView)this.quD.findViewById(R.h.bpY));
    this.lho = ((ProgressBar)this.quD.findViewById(R.h.bKF));
    ((View)this.quE.getParent()).setVisibility(8);
    this.quF.setText(paramString1);
    this.quC = aJt();
    if (this.quC == null)
    {
      Object localObject = q.zE();
      at.AR();
      localObject = new com.tencent.mm.ax.a((String)localObject, bg.e((Integer)c.xh().get(66561, null)));
      at.wS().a((k)localObject, 0);
      ((ProgressBar)this.quD.findViewById(R.h.bKF)).setVisibility(0);
    }
    for (;;)
    {
      com.tencent.mm.pluginsdk.ui.applet.e.a(this.vKB, paramString2, this.quD, getResources().getString(R.l.cUs), new o.b()
      {
        public final void fx(boolean paramAnonymousBoolean)
        {
          GMTrace.i(5786663124992L, 43114);
          if (paramAnonymousBoolean)
          {
            if (InviteFriendsBy3rdUI.b(InviteFriendsBy3rdUI.this) == null) {}
            for (String str = paramString1;; str = InviteFriendsBy3rdUI.b(InviteFriendsBy3rdUI.this).getText().toString())
            {
              InviteFriendsBy3rdUI.a(InviteFriendsBy3rdUI.this, paramInt, str);
              GMTrace.o(5786663124992L, 43114);
              return;
            }
          }
          GMTrace.o(5786663124992L, 43114);
        }
      });
      GMTrace.o(5789884350464L, 43138);
      return;
      if (this.quE != null) {
        this.quE.setImageBitmap(this.quC);
      }
    }
  }
  
  private void pB(int paramInt)
  {
    GMTrace.i(5789481697280L, 43135);
    h.a(this.vKB.vKW, paramInt, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5791092310016L, 43147);
        GMTrace.o(5791092310016L, 43147);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5775925706752L, 43034);
        GMTrace.o(5775925706752L, 43034);
      }
    });
    GMTrace.o(5789481697280L, 43135);
  }
  
  private void vS(int paramInt)
  {
    GMTrace.i(5789213261824L, 43133);
    final com.tencent.mm.modelmulti.f localf = new com.tencent.mm.modelmulti.f(paramInt);
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.bKJ), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(5774315094016L, 43022);
        at.wS().c(localf);
        GMTrace.o(5774315094016L, 43022);
      }
    });
    at.wS().a(localf, 0);
    GMTrace.o(5789213261824L, 43133);
  }
  
  public final int QI()
  {
    GMTrace.i(5788542173184L, 43128);
    int i = R.o.eoT;
    GMTrace.o(5788542173184L, 43128);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5789079044096L, 43132);
    w.i("MicroMsg.InviteFriendsBy3rdUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      com.tencent.mm.plugin.report.service.g.ork.i(14035, new Object[] { Integer.valueOf(this.quB), Integer.valueOf(quz), Integer.valueOf(this.fromScene) });
    }
    Object localObject1;
    label203:
    int i;
    if (paramk.getType() == 1803)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        h.h(this.vKB.vKW, R.l.dGA, R.l.cUG);
        GMTrace.o(5789079044096L, 43132);
        return;
      }
      paramString = (com.tencent.mm.modelmulti.f)paramk;
      if (!bg.nm(paramString.title)) {
        break label884;
      }
      localObject1 = null;
      paramString = (com.tencent.mm.modelmulti.f)paramk;
      if (!bg.nm(paramString.content)) {
        break label893;
      }
      paramString = null;
      Object localObject2 = q.zF();
      at.AR();
      String str = (String)c.xh().get(6, null);
      Object localObject3 = localObject2;
      if (bg.nm((String)localObject2)) {
        localObject3 = str;
      }
      i = ((com.tencent.mm.modelmulti.f)paramk).gMk;
      localObject2 = paramString;
      if ((i & 0x1) > 0)
      {
        localObject2 = localObject1;
        if (bg.nm((String)localObject1)) {
          localObject2 = String.format(getString(R.l.dDv), new Object[] { q.zG() });
        }
        localObject1 = paramString;
        if (bg.nm(paramString)) {
          localObject1 = String.format(getString(R.l.dDu), new Object[] { localObject3 });
        }
        paramString = new Intent("android.intent.action.SEND");
        paramString.putExtra("android.intent.extra.SUBJECT", (String)localObject2);
        paramString.putExtra("android.intent.extra.TEXT", (String)localObject1);
        paramString.setType("plain/text");
        startActivity(Intent.createChooser(paramString, getString(R.l.dDq)));
        com.tencent.mm.plugin.report.service.g.ork.i(14035, new Object[] { Integer.valueOf(this.quB), Integer.valueOf(quA), Integer.valueOf(this.fromScene) });
        localObject2 = localObject1;
      }
      paramString = (String)localObject2;
      if ((i & 0x2) > 0)
      {
        paramString = (String)localObject2;
        if (bg.nm((String)localObject2)) {
          paramString = String.format(getString(R.l.dDw), new Object[] { localObject3 });
        }
        localObject1 = new Intent("android.intent.action.VIEW");
        ((Intent)localObject1).putExtra("sms_body", paramString);
        ((Intent)localObject1).setType("vnd.android-dir/mms-sms");
        if (!bg.j(this, (Intent)localObject1)) {
          break label901;
        }
        startActivity((Intent)localObject1);
        label514:
        com.tencent.mm.plugin.report.service.g.ork.i(14035, new Object[] { Integer.valueOf(this.quB), Integer.valueOf(quA), Integer.valueOf(this.fromScene) });
      }
      localObject1 = paramString;
      if ((i & 0x4) > 0)
      {
        localObject1 = paramString;
        if (bg.nm(paramString)) {
          localObject1 = String.format(getString(R.l.dDw), new Object[] { localObject3 });
        }
        paramString = new Intent();
        paramString.setAction("android.intent.action.SEND");
        paramString.putExtra("android.intent.extra.TEXT", (String)localObject1);
        paramString.setType("text/plain");
        paramString.setPackage("com.whatsapp");
        startActivity(paramString);
        com.tencent.mm.plugin.report.service.g.ork.i(14035, new Object[] { Integer.valueOf(this.quB), Integer.valueOf(quA), Integer.valueOf(this.fromScene) });
      }
      localObject2 = localObject1;
      if ((i & 0x8) > 0)
      {
        paramString = (String)localObject1;
        if (bg.nm((String)localObject1))
        {
          if (!bg.nm(q.zF())) {
            break label915;
          }
          paramString = getString(R.l.dDt);
        }
        label726:
        localObject1 = getString(R.l.dDp);
        localObject2 = paramString;
        if (this.quH == true)
        {
          k(i, paramString, (String)localObject1);
          this.quH = false;
          localObject2 = paramString;
        }
      }
      if ((i & 0x10) > 0)
      {
        this.qjk.a(this);
        paramString = (String)localObject2;
        if (bg.nm((String)localObject2)) {
          if (!bg.nm(q.zF())) {
            break label939;
          }
        }
      }
    }
    label884:
    label893:
    label901:
    label915:
    label939:
    for (paramString = getString(R.l.dDt);; paramString = String.format(getString(R.l.dDs), new Object[] { q.zF() }))
    {
      localObject1 = getString(R.l.dDr);
      if (this.quG == true)
      {
        k(i, paramString, (String)localObject1);
        this.quG = false;
      }
      if (paramk.getType() != 1804) {
        break label1020;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label963;
      }
      h.h(this.vKB.vKW, R.l.dXF, R.l.cUG);
      GMTrace.o(5789079044096L, 43132);
      return;
      localObject1 = paramString.title;
      break;
      paramString = paramString.content;
      break label203;
      Toast.makeText(this, R.l.dWZ, 1).show();
      break label514;
      paramString = String.format(getString(R.l.dDs), new Object[] { q.zF() });
      break label726;
    }
    label963:
    h.bm(this, getResources().getString(R.l.div));
    com.tencent.mm.plugin.report.service.g.ork.i(14035, new Object[] { Integer.valueOf(this.quB), Integer.valueOf(quA), Integer.valueOf(this.fromScene) });
    label1020:
    if (paramk.getType() == 168)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        GMTrace.o(5789079044096L, 43132);
        return;
      }
      if (this.quE != null)
      {
        if (this.lho != null) {
          this.lho.setVisibility(8);
        }
        this.quE.setImageBitmap(aJt());
      }
    }
    GMTrace.o(5789079044096L, 43132);
  }
  
  public final void a(a.c paramc)
  {
    GMTrace.i(5789615915008L, 43136);
    if (this.msk != null) {
      this.msk.cancel();
    }
    switch (3.msI[paramc.ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(5789615915008L, 43136);
      return;
      pB(R.l.eeQ);
      GMTrace.o(5789615915008L, 43136);
      return;
      GMTrace.o(5789615915008L, 43136);
      return;
      pB(R.l.eeP);
    }
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(5788944826368L, 43131);
    if ("invite_friends_by_message".equals(paramPreference.hiu))
    {
      this.quB = quv;
      vS(2);
      GMTrace.o(5788944826368L, 43131);
      return true;
    }
    if ("invite_friends_by_mail".equals(paramPreference.hiu))
    {
      this.quB = quu;
      vS(1);
      GMTrace.o(5788944826368L, 43131);
      return true;
    }
    if ("invite_friends_by_whatsapp".equals(paramPreference.hiu))
    {
      this.quB = quw;
      vS(4);
      GMTrace.o(5788944826368L, 43131);
      return true;
    }
    if ("invite_friends_by_facebook".equals(paramPreference.hiu))
    {
      this.quB = qux;
      if (q.Af())
      {
        this.quH = true;
        vS(8);
      }
      for (;;)
      {
        GMTrace.o(5788944826368L, 43131);
        return true;
        h.a(this.vKB.vKW, R.l.dYR, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(5781294415872L, 43074);
            com.tencent.mm.bj.d.a(InviteFriendsBy3rdUI.this.vKB.vKW, ".ui.account.FacebookAuthUI", new Intent());
            GMTrace.o(5781294415872L, 43074);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(5792434487296L, 43157);
            GMTrace.o(5792434487296L, 43157);
          }
        });
      }
    }
    if ("invite_friends_by_twitter".equals(paramPreference.hiu))
    {
      this.quB = quy;
      if (this.qjk.ciQ())
      {
        this.quG = true;
        vS(16);
      }
      for (;;)
      {
        GMTrace.o(5788944826368L, 43131);
        return true;
        h.a(this.vKB.vKW, R.l.eaX, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(5786931560448L, 43116);
            paramAnonymousDialogInterface = InviteFriendsBy3rdUI.this;
            ActionBarActivity localActionBarActivity = InviteFriendsBy3rdUI.this.vKB.vKW;
            InviteFriendsBy3rdUI.this.vKB.vKW.getString(R.l.cUG);
            InviteFriendsBy3rdUI.a(paramAnonymousDialogInterface, h.a(localActionBarActivity, InviteFriendsBy3rdUI.this.vKB.vKW.getString(R.l.eeO), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(5787736866816L, 43122);
                GMTrace.o(5787736866816L, 43122);
              }
            }));
            InviteFriendsBy3rdUI.a(InviteFriendsBy3rdUI.this).a(InviteFriendsBy3rdUI.this, InviteFriendsBy3rdUI.this.vKB.vKW);
            GMTrace.o(5786931560448L, 43116);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(5785320947712L, 43104);
            GMTrace.o(5785320947712L, 43104);
          }
        });
      }
    }
    GMTrace.o(5788944826368L, 43131);
    return false;
  }
  
  public final void b(a.c paramc)
  {
    GMTrace.i(5789750132736L, 43137);
    GMTrace.o(5789750132736L, 43137);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5788676390912L, 43129);
    super.onCreate(paramBundle);
    oM(R.l.dvv);
    this.fromScene = getIntent().getIntExtra("Invite_friends", 4);
    int i = bg.getInt(com.tencent.mm.k.g.ut().getValue("InviteFriendsInviteFlags"), 0);
    paramBundle = this.wky;
    if ((i & 0x2) <= 0) {
      paramBundle.VH("invite_friends_by_message");
    }
    if ((i & 0x1) <= 0) {
      paramBundle.VH("invite_friends_by_mail");
    }
    if (((i & 0x4) <= 0) || (!ag(this.vKB.vKW, "com.whatsapp"))) {
      paramBundle.VH("invite_friends_by_whatsapp");
    }
    if (((i & 0x8) <= 0) || (!q.Ad())) {
      paramBundle.VH("invite_friends_by_facebook");
    }
    if ((i & 0x10) <= 0) {
      paramBundle.VH("invite_friends_by_twitter");
    }
    paramBundle.notifyDataSetChanged();
    at.wS().a(1803, this);
    at.wS().a(1804, this);
    at.wS().a(168, this);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5788005302272L, 43124);
        InviteFriendsBy3rdUI.this.finish();
        GMTrace.o(5788005302272L, 43124);
        return true;
      }
    });
    GMTrace.o(5788676390912L, 43129);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5788810608640L, 43130);
    at.wS().b(1803, this);
    at.wS().b(1804, this);
    at.wS().b(168, this);
    if (this.quB == 0) {
      com.tencent.mm.plugin.report.service.g.ork.i(14035, new Object[] { Integer.valueOf(this.quB), Integer.valueOf(quz), Integer.valueOf(this.fromScene) });
    }
    super.onDestroy();
    GMTrace.o(5788810608640L, 43130);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\pluginapp\InviteFriendsBy3rdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */