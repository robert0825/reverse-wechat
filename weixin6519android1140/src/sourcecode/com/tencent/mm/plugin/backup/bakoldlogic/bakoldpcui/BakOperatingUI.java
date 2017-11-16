package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.f;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;

public class BakOperatingUI
  extends MMWizardActivity
  implements e.d
{
  private ae handler;
  private boolean iWS;
  private TextView jgA;
  private TextView jgB;
  private boolean jgC;
  private int jgD;
  private boolean jgE;
  private int jgu;
  private ProgressBar jgy;
  private TextView jgz;
  
  public BakOperatingUI()
  {
    GMTrace.i(14757373411328L, 109951);
    this.jgu = -1;
    this.iWS = false;
    this.jgy = null;
    this.jgz = null;
    this.jgA = null;
    this.jgB = null;
    this.handler = new ae(Looper.getMainLooper());
    this.jgC = false;
    this.jgD = 0;
    this.jgE = false;
    GMTrace.o(14757373411328L, 109951);
  }
  
  private void agD()
  {
    GMTrace.i(14757910282240L, 109955);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().pause();
    int i = R.l.cXT;
    Object localObject = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(14771063619584L, 110053);
        paramAnonymousDialogInterface = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl();
        paramAnonymousDialogInterface.jfL.cancel();
        paramAnonymousDialogInterface.jfM.cancel();
        if ((paramAnonymousDialogInterface.jfO == 1) || (paramAnonymousDialogInterface.jfS == com.tencent.mm.plugin.backup.bakoldlogic.a.c.jda)) {
          e.kL(4);
        }
        for (;;)
        {
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdg;
          paramAnonymousDialogInterface = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agm();
          paramAnonymousDialogInterface.jfE += 1;
          BakOperatingUI.b(BakOperatingUI.this);
          BakOperatingUI.g(BakOperatingUI.this);
          GMTrace.o(14771063619584L, 110053);
          return;
          if ((paramAnonymousDialogInterface.jfO == 6) || (paramAnonymousDialogInterface.jfS == com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdc) || (paramAnonymousDialogInterface.jfS == com.tencent.mm.plugin.backup.bakoldlogic.a.c.jde)) {
            e.kL(7);
          }
        }
      }
    };
    DialogInterface.OnClickListener local8 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(14767708176384L, 110028);
        paramAnonymousDialogInterface = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl();
        if (paramAnonymousDialogInterface.jfO == 1)
        {
          paramAnonymousDialogInterface.jfL.resume();
          GMTrace.o(14767708176384L, 110028);
          return;
        }
        if (paramAnonymousDialogInterface.jfO == 6)
        {
          paramAnonymousDialogInterface.jfM.resume();
          GMTrace.o(14767708176384L, 110028);
          return;
        }
        w.e("MicroMsg.BakPcProcessMgr", "cancel in error state, %d", new Object[] { Integer.valueOf(paramAnonymousDialogInterface.jfO) });
        GMTrace.o(14767708176384L, 110028);
      }
    };
    localObject = h.a(this, i, 0, R.l.cUW, R.l.cTJ, (DialogInterface.OnClickListener)localObject, local8);
    ((i)localObject).setCanceledOnTouchOutside(false);
    ((i)localObject).setCancelable(false);
    GMTrace.o(14757910282240L, 109955);
  }
  
  protected final void MP()
  {
    GMTrace.i(14757641846784L, 109953);
    oM(R.l.cYc);
    if (!this.iWS)
    {
      if (6 != this.jgu) {
        break label139;
      }
      a(0, getString(R.l.cXS), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(14774016409600L, 110075);
          if (BakOperatingUI.a(BakOperatingUI.this))
          {
            GMTrace.o(14774016409600L, 110075);
            return true;
          }
          BakOperatingUI.b(BakOperatingUI.this);
          BakOperatingUI.c(BakOperatingUI.this);
          GMTrace.o(14774016409600L, 110075);
          return true;
        }
      });
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(14762339467264L, 109988);
          if (BakOperatingUI.a(BakOperatingUI.this))
          {
            BakOperatingUI.e(BakOperatingUI.this);
            GMTrace.o(14762339467264L, 109988);
            return false;
          }
          BakOperatingUI.b(BakOperatingUI.this);
          BakOperatingUI.f(BakOperatingUI.this);
          GMTrace.o(14762339467264L, 109988);
          return true;
        }
      });
      this.jgy = ((ProgressBar)findViewById(R.h.bfS));
      this.jgy.setProgress(this.jgD);
      this.jgA = ((TextView)findViewById(R.h.bfZ));
      this.jgB = ((TextView)findViewById(R.h.bga));
      this.jgz = ((TextView)findViewById(R.h.bfT));
      GMTrace.o(14757641846784L, 109953);
      return;
      label139:
      if (1 == this.jgu) {
        a(0, getString(R.l.cXG), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(14771332055040L, 110055);
            if (BakOperatingUI.a(BakOperatingUI.this))
            {
              GMTrace.o(14771332055040L, 110055);
              return true;
            }
            BakOperatingUI.b(BakOperatingUI.this);
            BakOperatingUI.d(BakOperatingUI.this);
            GMTrace.o(14771332055040L, 110055);
            return true;
          }
        });
      } else {
        w.e("MicroMsg.BakOperatingUI", "BakOperatingUI operate type is invalid");
      }
    }
  }
  
  /* Error */
  public final void aeg()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 277
    //   5: ldc_w 279
    //   8: invokestatic 60	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 91	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:jgE	Z
    //   15: ifeq +15 -> 30
    //   18: ldc2_w 277
    //   21: ldc_w 279
    //   24: invokestatic 94	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield 64	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:iWS	Z
    //   35: ldc_w 268
    //   38: ldc_w 281
    //   41: iconst_1
    //   42: anewarray 283	java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: aload_0
    //   48: getfield 62	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:jgu	I
    //   51: invokestatic 289	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   54: aastore
    //   55: invokestatic 292	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: aload_0
    //   59: getfield 85	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:handler	Lcom/tencent/mm/sdk/platformtools/ae;
    //   62: new 16	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$12
    //   65: dup
    //   66: aload_0
    //   67: invokespecial 293	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$12:<init>	(Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI;)V
    //   70: invokevirtual 297	com/tencent/mm/sdk/platformtools/ae:post	(Ljava/lang/Runnable;)Z
    //   73: pop
    //   74: ldc2_w 277
    //   77: ldc_w 279
    //   80: invokestatic 94	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   83: goto -56 -> 27
    //   86: astore_1
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_1
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	BakOperatingUI
    //   86	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	27	86	finally
    //   30	83	86	finally
  }
  
  public final void aga()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(14758849806336L, 109962);
        w.d("MicroMsg.BakOperatingUI", "onNetFinish now cmd:%d", new Object[] { Integer.valueOf(this.jgu) });
        if (this.jgE)
        {
          GMTrace.o(14758849806336L, 109962);
          return;
        }
        if ((6 == this.jgu) || (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdd == com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfS))
        {
          this.jgu = 6;
          this.iWS = true;
          com.tencent.mm.plugin.backup.a.hnH.pu();
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().aew();
          this.handler.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(14767976611840L, 110030);
              if (6 == BakOperatingUI.j(BakOperatingUI.this))
              {
                BakOperatingUI.m(BakOperatingUI.this).post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(14774821715968L, 110081);
                    BakOperatingUI.this.lg(false);
                    if (BakOperatingUI.h(BakOperatingUI.this) != null) {
                      BakOperatingUI.h(BakOperatingUI.this).setProgress(0);
                    }
                    if (BakOperatingUI.k(BakOperatingUI.this) != null) {
                      BakOperatingUI.k(BakOperatingUI.this).setText(BakOperatingUI.this.getString(R.l.cXX));
                    }
                    if (BakOperatingUI.l(BakOperatingUI.this) != null) {
                      BakOperatingUI.l(BakOperatingUI.this).setText(BakOperatingUI.this.getString(R.l.cXW));
                    }
                    if (BakOperatingUI.i(BakOperatingUI.this) != null) {
                      BakOperatingUI.i(BakOperatingUI.this).setText(BakOperatingUI.this.getString(R.l.cXP) + "0%");
                    }
                    GMTrace.o(14774821715968L, 110081);
                  }
                });
                GMTrace.o(14767976611840L, 110030);
                return;
              }
              if (1 == BakOperatingUI.j(BakOperatingUI.this))
              {
                Intent localIntent = new Intent(BakOperatingUI.this, BakFinishUI.class);
                localIntent.putExtra("cmd", BakOperatingUI.j(BakOperatingUI.this));
                MMWizardActivity.A(BakOperatingUI.this, localIntent);
              }
              GMTrace.o(14767976611840L, 110030);
            }
          });
          GMTrace.o(14758849806336L, 109962);
          continue;
        }
      }
      finally {}
      tmp148_145[0] = Integer.valueOf(this.jgu);
      w.e("MicroMsg.BakOperatingUI", "onNetFinish now cmd:%d", tmp148_145);
    }
  }
  
  public final void agx()
  {
    GMTrace.i(14759386677248L, 109966);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14766902870016L, 110022);
        w.d("MicroMsg.BakOperatingUI", "BakOperatingUI onOperateCancel");
        BakOperatingUI.o(BakOperatingUI.this);
        GMTrace.o(14766902870016L, 110022);
      }
    });
    GMTrace.o(14759386677248L, 109966);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14757776064512L, 109954);
    int i = R.i.cpT;
    GMTrace.o(14757776064512L, 109954);
    return i;
  }
  
  public final void kP(final int paramInt)
  {
    GMTrace.i(14759520894976L, 109967);
    if (this.jgE)
    {
      GMTrace.o(14759520894976L, 109967);
      return;
    }
    w.d("MicroMsg.BakOperatingUI", "BakOperatingUI onPrepare percent:%d", new Object[] { Integer.valueOf(paramInt) });
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14768245047296L, 110032);
        if (BakOperatingUI.h(BakOperatingUI.this) != null) {
          BakOperatingUI.h(BakOperatingUI.this).setProgress(paramInt);
        }
        if ((BakOperatingUI.i(BakOperatingUI.this) != null) && (BakOperatingUI.k(BakOperatingUI.this) != null))
        {
          BakOperatingUI.i(BakOperatingUI.this).setText(BakOperatingUI.this.getString(R.l.cXQ) + paramInt + "%");
          BakOperatingUI.k(BakOperatingUI.this).setText(BakOperatingUI.this.getString(R.l.cXZ));
        }
        GMTrace.o(14768245047296L, 110032);
      }
    });
    GMTrace.o(14759520894976L, 109967);
  }
  
  /* Error */
  public final void kQ(final int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 354
    //   5: ldc_w 356
    //   8: invokestatic 60	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: ldc_w 268
    //   14: ldc_w 358
    //   17: iconst_2
    //   18: anewarray 283	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: iload_1
    //   24: invokestatic 289	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   27: aastore
    //   28: dup
    //   29: iconst_1
    //   30: aload_0
    //   31: getfield 91	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:jgE	Z
    //   34: invokestatic 363	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   37: aastore
    //   38: invokestatic 292	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: aload_0
    //   42: getfield 91	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:jgE	Z
    //   45: ifeq +15 -> 60
    //   48: ldc2_w 354
    //   51: ldc_w 356
    //   54: invokestatic 94	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: aload_0
    //   61: getfield 85	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:handler	Lcom/tencent/mm/sdk/platformtools/ae;
    //   64: new 32	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$9
    //   67: dup
    //   68: aload_0
    //   69: iload_1
    //   70: invokespecial 364	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$9:<init>	(Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI;I)V
    //   73: invokevirtual 297	com/tencent/mm/sdk/platformtools/ae:post	(Ljava/lang/Runnable;)Z
    //   76: pop
    //   77: ldc2_w 354
    //   80: ldc_w 356
    //   83: invokestatic 94	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   86: goto -29 -> 57
    //   89: astore_2
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_2
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	BakOperatingUI
    //   0	94	1	paramInt	int
    //   89	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	57	89	finally
    //   60	86	89	finally
  }
  
  /* Error */
  public final void kR(final int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 366
    //   5: ldc_w 368
    //   8: invokestatic 60	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 91	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:jgE	Z
    //   15: ifeq +15 -> 30
    //   18: ldc2_w 366
    //   21: ldc_w 368
    //   24: invokestatic 94	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: ldc_w 268
    //   33: ldc_w 370
    //   36: iconst_1
    //   37: anewarray 283	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: iload_1
    //   43: invokestatic 289	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: aastore
    //   47: invokestatic 292	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: aload_0
    //   51: getfield 85	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:handler	Lcom/tencent/mm/sdk/platformtools/ae;
    //   54: new 10	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$10
    //   57: dup
    //   58: aload_0
    //   59: iload_1
    //   60: invokespecial 371	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$10:<init>	(Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI;I)V
    //   63: invokevirtual 297	com/tencent/mm/sdk/platformtools/ae:post	(Ljava/lang/Runnable;)Z
    //   66: pop
    //   67: ldc2_w 366
    //   70: ldc_w 368
    //   73: invokestatic 94	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   76: goto -49 -> 27
    //   79: astore_2
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_2
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	BakOperatingUI
    //   0	84	1	paramInt	int
    //   79	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	27	79	finally
    //   30	76	79	finally
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14757507629056L, 109952);
    w.i("MicroMsg.BakOperatingUI", "onCreate");
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      w.i("MicroMsg.BakOperatingUI", "onCreate WizardRootKillSelf cmd:%d", new Object[] { Integer.valueOf(this.jgu) });
      GMTrace.o(14757507629056L, 109952);
      return;
    }
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().a(this);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().di(true);
    this.jgC = getIntent().getBooleanExtra("from_bak_banner", false);
    int i;
    if (this.jgC)
    {
      i = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfS;
      if ((com.tencent.mm.plugin.backup.bakoldlogic.a.c.jda == i) || (com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR == com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdj))
      {
        this.jgu = 1;
        this.jgD = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().agu();
      }
    }
    for (;;)
    {
      if ((this.jgu == 6) && (com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfM.jgb))
      {
        this.iWS = true;
        com.tencent.mm.plugin.backup.a.hnH.pu();
        com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().aew();
      }
      w.i("MicroMsg.BakOperatingUI", "before initView onCreate BakOperatingUI  nowCmd:%d fromBanner:%b status:%d opePercent:%d", new Object[] { Integer.valueOf(this.jgu), Boolean.valueOf(this.jgC), Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfS), Integer.valueOf(this.jgD) });
      MP();
      if (com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().jfR != com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdj) {
        break;
      }
      this.jgA.setText(getString(R.l.cXZ));
      this.jgz.setText(getString(R.l.cXQ) + this.jgD + "%");
      this.jgB.setText(getString(R.l.cXY));
      GMTrace.o(14757507629056L, 109952);
      return;
      if (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdc == i)
      {
        this.jgu = 6;
        this.jgD = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().agu();
      }
      else if (com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdd == i)
      {
        this.jgu = 6;
        this.iWS = true;
        com.tencent.mm.plugin.backup.a.hnH.pu();
        com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().aew();
        continue;
        this.jgu = getIntent().getIntExtra("cmd", 6);
      }
    }
    if (6 == this.jgu)
    {
      if (this.iWS)
      {
        this.jgA.setText(getString(R.l.cXX));
        this.jgB.setText(getString(R.l.cXW));
        this.jgz.setText(getString(R.l.cXP) + this.jgD + "%");
        GMTrace.o(14757507629056L, 109952);
        return;
      }
      this.jgA.setText(getString(R.l.cYa));
      this.jgz.setText(getString(R.l.cXR) + this.jgD + "%");
      this.jgB.setText(getString(R.l.cXY));
      GMTrace.o(14757507629056L, 109952);
      return;
    }
    if (1 == this.jgu)
    {
      this.jgA.setText(getString(R.l.cXV));
      this.jgz.setText(getString(R.l.cXO) + this.jgD + "%");
      this.jgB.setText(getString(R.l.cXY));
    }
    GMTrace.o(14757507629056L, 109952);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14758044499968L, 109956);
    super.onDestroy();
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().a(null);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().di(false);
    w.i("MicroMsg.BakOperatingUI", "BakOperatingUI onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.jgu) });
    GMTrace.o(14758044499968L, 109956);
  }
  
  public final void onError(final int paramInt)
  {
    GMTrace.i(14759252459520L, 109965);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14770795184128L, 110051);
        w.i("MicroMsg.BakOperatingUI", "BakOperatingUI onCloseSocket, %d", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt == 15)
        {
          BakOperatingUI.n(BakOperatingUI.this);
          GMTrace.o(14770795184128L, 110051);
          return;
        }
        Intent localIntent = new Intent(BakOperatingUI.this, BakConnErrorUI.class);
        MMWizardActivity.A(BakOperatingUI.this, localIntent);
        GMTrace.o(14770795184128L, 110051);
      }
    });
    GMTrace.o(14759252459520L, 109965);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        GMTrace.i(14759118241792L, 109964);
        if (paramInt == 4)
        {
          if (this.iWS)
          {
            agD();
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().pause();
            GMTrace.o(14759118241792L, 109964);
            return bool;
          }
          w.d("MicroMsg.BakOperatingUI", "onKeyDown keyCode == KeyEvent.KEYCODE_BACK  finishWizard cmd:%d", new Object[] { Integer.valueOf(this.jgu) });
          this.jgE = true;
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().di(false);
          Bh(1);
          GMTrace.o(14759118241792L, 109964);
          continue;
        }
        bool = super.onKeyDown(paramInt, paramKeyEvent);
      }
      finally {}
      GMTrace.o(14759118241792L, 109964);
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(14758447153152L, 109959);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().di(false);
    super.onPause();
    w.i("MicroMsg.BakOperatingUI", "onPause nowCmd:%d", new Object[] { Integer.valueOf(this.jgu) });
    GMTrace.o(14758447153152L, 109959);
  }
  
  protected void onResume()
  {
    GMTrace.i(14758312935424L, 109958);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().di(true);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.agk().agl().a(this);
    w.i("MicroMsg.BakOperatingUI", "onResume nowCmd:%d", new Object[] { Integer.valueOf(this.jgu) });
    super.onResume();
    GMTrace.o(14758312935424L, 109958);
  }
  
  public void onStart()
  {
    GMTrace.i(14758178717696L, 109957);
    super.onStart();
    GMTrace.o(14758178717696L, 109957);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcui\BakOperatingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */