package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.lh;
import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.h.ac;
import com.tencent.mm.plugin.backup.h.r;
import com.tencent.mm.plugin.backup.h.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;

public final class e
  implements com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a.a, b.c
{
  private String errStr;
  public com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a jdY;
  public d jfF;
  public c jfI;
  public a jfJ;
  public e jfK;
  public d jfL;
  public f jfM;
  public com.tencent.mm.plugin.backup.bakoldlogic.c.d jfN;
  public int jfO;
  public String jfP;
  public String jfQ;
  public int jfR;
  public int jfS;
  private boolean jfT;
  
  public e()
  {
    GMTrace.i(14782337908736L, 110137);
    this.jfL = new d();
    this.jfM = new f();
    this.jfO = -1;
    this.errStr = "";
    this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdg;
    this.jfS = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jcZ;
    this.jfT = false;
    GMTrace.o(14782337908736L, 110137);
  }
  
  public static void a(int paramInt1, int paramInt2, s params)
  {
    GMTrace.i(14783948521472L, 110149);
    ac localac = new ac();
    localac.jgO = paramInt1;
    localac.jhA = paramInt2;
    localac.jiv = params;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", "send cmd resp, status:%d, cmd:%d (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), kM(paramInt1) });
      com.tencent.mm.plugin.backup.f.b.r(localac.toByteArray(), 4);
      GMTrace.o(14783948521472L, 110149);
      return;
    }
    catch (Exception params)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BakPcProcessMgr", params, "buf to PacketCommandResponse err", new Object[0]);
      GMTrace.o(14783948521472L, 110149);
    }
  }
  
  public static void agt()
  {
    GMTrace.i(14783545868288L, 110146);
    Intent localIntent = new Intent().setClassName(com.tencent.mm.sdk.platformtools.ab.getContext(), "com.tencent.mm.ui.LauncherUI");
    localIntent.addFlags(335544320);
    localIntent.putExtra("nofification_type", "back_to_pcmgr_error_notification");
    com.tencent.mm.sdk.platformtools.ab.getContext().startActivity(localIntent);
    GMTrace.o(14783545868288L, 110146);
  }
  
  public static void agv()
  {
    GMTrace.i(14784351174656L, 110152);
    lh locallh = new lh();
    com.tencent.mm.sdk.b.a.vgX.m(locallh);
    GMTrace.o(14784351174656L, 110152);
  }
  
  public static void kL(int paramInt)
  {
    GMTrace.i(14784082739200L, 110150);
    com.tencent.mm.plugin.backup.h.ab localab = new com.tencent.mm.plugin.backup.h.ab();
    localab.jgO = paramInt;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", "sendNormalReq cmd :%d (%s)", new Object[] { Integer.valueOf(paramInt), kM(paramInt) });
      com.tencent.mm.plugin.backup.f.b.r(localab.toByteArray(), 3);
      GMTrace.o(14784082739200L, 110150);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException, "buf to PacketCommandRequest err", new Object[0]);
      GMTrace.o(14784082739200L, 110150);
    }
  }
  
  private static String kM(int paramInt)
  {
    GMTrace.i(14784485392384L, 110153);
    switch (paramInt)
    {
    default: 
      GMTrace.o(14784485392384L, 110153);
      return String.valueOf(paramInt);
    case 0: 
      GMTrace.o(14784485392384L, 110153);
      return "AUTHORIZE";
    case 1: 
      GMTrace.o(14784485392384L, 110153);
      return "BACKUP_INFO";
    case 2: 
      GMTrace.o(14784485392384L, 110153);
      return "RESTORE_INFO";
    case 3: 
      GMTrace.o(14784485392384L, 110153);
      return "BACKUP_START";
    case 4: 
      GMTrace.o(14784485392384L, 110153);
      return "BACKUP_CANCEL";
    case 5: 
      GMTrace.o(14784485392384L, 110153);
      return "BACKUP_FINISH";
    case 6: 
      GMTrace.o(14784485392384L, 110153);
      return "RESTORE_START";
    case 7: 
      GMTrace.o(14784485392384L, 110153);
      return "RESTORE_CANCE";
    case 8: 
      GMTrace.o(14784485392384L, 110153);
      return "RESTORE_FINISH";
    case 9: 
      GMTrace.o(14784485392384L, 110153);
      return "BACKUP_PAUSE";
    case 10: 
      GMTrace.o(14784485392384L, 110153);
      return "RESTORE_PAUSE";
    case 11: 
      GMTrace.o(14784485392384L, 110153);
      return "BACKUP_RESUME";
    case 12: 
      GMTrace.o(14784485392384L, 110153);
      return "RESTORE_RESUME";
    case 13: 
      GMTrace.o(14784485392384L, 110153);
      return "MERGE_PROGRESS";
    case 14: 
      GMTrace.o(14784485392384L, 110153);
      return "LOGOFF";
    case 15: 
      GMTrace.o(14784485392384L, 110153);
      return "EXIT";
    case 16: 
      GMTrace.o(14784485392384L, 110153);
      return "SHOW_BACKUP_RESTORE";
    case 17: 
      GMTrace.o(14784485392384L, 110153);
      return "COMMAND_WECHAT_LEAVE";
    }
    GMTrace.o(14784485392384L, 110153);
    return "COMMAND_NOT_SUPPORT";
  }
  
  public final void F(int paramInt, String paramString)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(14783277432832L, 110144);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakPcProcessMgr", "callbackErr type:%d,  %s", new Object[] { Integer.valueOf(paramInt), paramString });
        if ((paramInt != 10006) && (paramInt != 10008)) {
          break label410;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakPcProcessMgr", "callbackErr socketClose");
        this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdg;
        this.jfS = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jcZ;
        agv();
        a.agk().agm().jfz = 2;
        a.agk().agm().BH();
        if (this.jfI != null) {
          this.jfI.onError(paramInt);
        }
        if (this.jfJ != null) {
          this.jfJ.onError(paramInt);
        }
        if (this.jfF != null) {
          this.jfF.onError(paramInt);
        }
        if (this.jfK == null) {
          break label410;
        }
        this.jfK.onError(paramInt);
      }
      finally {}
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakPcProcessMgr", "callbackErr ip not match or connect failed: %d", new Object[] { Integer.valueOf(paramInt) });
      a.agk().agm().jfz = 2;
      a.agk().agm().BH();
      agt();
      GMTrace.o(14783277432832L, 110144);
      return;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BakPcProcessMgr", "summerbak errtype:%d, authcallback[%s], operatorcallback[%s], eventCallback[%s]", new Object[] { Integer.valueOf(paramInt), this.jfJ, this.jfF, this.jfI });
      if (paramInt == 15)
      {
        if (this.jfJ != null) {
          this.jfJ.onError(paramInt);
        }
        if (this.jfF != null) {
          this.jfF.onError(paramInt);
        }
        if (this.jfI != null) {
          this.jfI.kO(paramInt);
        }
      }
      if (paramInt == -1)
      {
        if (this.jfJ != null)
        {
          this.jfJ.onError(paramInt);
          GMTrace.o(14783277432832L, 110144);
          continue;
        }
        if (this.jfF != null)
        {
          this.jfF.onError(paramInt);
          GMTrace.o(14783277432832L, 110144);
          continue;
        }
        if (this.jfI != null) {
          this.jfI.kO(paramInt);
        }
      }
      GMTrace.o(14783277432832L, 110144);
      continue;
      label410:
      if (paramInt != 10009) {
        if (paramInt != 10004) {}
      }
    }
  }
  
  /* Error */
  public final void a(d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 335
    //   5: ldc_w 337
    //   8: invokestatic 72	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_1
    //   12: ifnonnull +33 -> 45
    //   15: aload_0
    //   16: getfield 318	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfF	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e$d;
    //   19: instanceof 339
    //   22: ifeq +23 -> 45
    //   25: ldc 127
    //   27: ldc_w 341
    //   30: invokestatic 343	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   33: ldc2_w 335
    //   36: ldc_w 337
    //   39: invokestatic 105	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: ldc 127
    //   47: ldc_w 345
    //   50: iconst_1
    //   51: anewarray 4	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: aload_1
    //   57: aastore
    //   58: invokestatic 330	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: aload_0
    //   62: aload_1
    //   63: putfield 318	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfF	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e$d;
    //   66: aload_0
    //   67: getfield 77	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfL	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d;
    //   70: aload_1
    //   71: putfield 346	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jfF	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e$d;
    //   74: aload_0
    //   75: getfield 82	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfM	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f;
    //   78: aload_1
    //   79: putfield 347	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jfF	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e$d;
    //   82: ldc2_w 335
    //   85: ldc_w 337
    //   88: invokestatic 105	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   91: goto -49 -> 42
    //   94: astore_1
    //   95: aload_0
    //   96: monitorexit
    //   97: aload_1
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	e
    //   0	99	1	paramd	d
    // Exception table:
    //   from	to	target	type
    //   2	11	94	finally
    //   15	42	94	finally
    //   45	91	94	finally
  }
  
  /* Error */
  public final void a(r paramr)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 349
    //   5: ldc_w 351
    //   8: invokestatic 72	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 82	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfM	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f;
    //   15: ifnull +10 -> 25
    //   18: aload_0
    //   19: getfield 82	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfM	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f;
    //   22: invokevirtual 354	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:cancel	()V
    //   25: aload_0
    //   26: new 79	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f
    //   29: dup
    //   30: invokespecial 80	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:<init>	()V
    //   33: putfield 82	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfM	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f;
    //   36: aload_0
    //   37: getfield 82	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfM	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f;
    //   40: astore 4
    //   42: aload_1
    //   43: getfield 360	com/tencent/mm/plugin/backup/h/r:jhR	Ljava/util/LinkedList;
    //   46: astore 5
    //   48: aload_1
    //   49: getfield 363	com/tencent/mm/plugin/backup/h/r:jhS	Ljava/util/LinkedList;
    //   52: astore 6
    //   54: aload_1
    //   55: getfield 367	com/tencent/mm/plugin/backup/h/r:jhz	J
    //   58: lstore_2
    //   59: aload 4
    //   61: aload 5
    //   63: putfield 371	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jep	Ljava/util/List;
    //   66: aload 4
    //   68: aload 6
    //   70: putfield 374	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jfZ	Ljava/util/List;
    //   73: aload 4
    //   75: iconst_0
    //   76: putfield 377	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:eIE	Z
    //   79: aload 4
    //   81: iconst_0
    //   82: putfield 380	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:guN	Z
    //   85: aload 4
    //   87: getfield 384	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jdK	Ljava/util/HashSet;
    //   90: invokevirtual 389	java/util/HashSet:clear	()V
    //   93: aload 4
    //   95: iconst_0
    //   96: putfield 392	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jdN	Z
    //   99: aload 4
    //   101: iconst_0
    //   102: putfield 395	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jgb	Z
    //   105: aload 4
    //   107: iconst_0
    //   108: putfield 398	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:iWK	Z
    //   111: aload 4
    //   113: iconst_0
    //   114: putfield 401	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jga	I
    //   117: aload 4
    //   119: lconst_0
    //   120: putfield 404	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jgd	J
    //   123: aload 4
    //   125: lload_2
    //   126: putfield 407	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jgc	J
    //   129: iconst_0
    //   130: invokestatic 412	com/tencent/mm/plugin/backup/bakoldlogic/c/c:setProgress	(I)V
    //   133: aload_0
    //   134: getfield 82	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfM	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f;
    //   137: aload_0
    //   138: getfield 318	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfF	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e$d;
    //   141: putfield 347	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jfF	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e$d;
    //   144: ldc 127
    //   146: ldc_w 414
    //   149: iconst_3
    //   150: anewarray 4	java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: aload_1
    //   156: getfield 360	com/tencent/mm/plugin/backup/h/r:jhR	Ljava/util/LinkedList;
    //   159: invokevirtual 420	java/util/LinkedList:size	()I
    //   162: invokestatic 135	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: aastore
    //   166: dup
    //   167: iconst_1
    //   168: aload_1
    //   169: getfield 363	com/tencent/mm/plugin/backup/h/r:jhS	Ljava/util/LinkedList;
    //   172: invokevirtual 420	java/util/LinkedList:size	()I
    //   175: invokestatic 135	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   178: aastore
    //   179: dup
    //   180: iconst_2
    //   181: aload_1
    //   182: getfield 367	com/tencent/mm/plugin/backup/h/r:jhz	J
    //   185: invokestatic 425	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   188: aastore
    //   189: invokestatic 144	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: aload_0
    //   193: getfield 82	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e:jfM	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f;
    //   196: astore 4
    //   198: aload 4
    //   200: iconst_0
    //   201: putfield 428	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jfG	I
    //   204: aload 4
    //   206: getfield 374	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jfZ	Ljava/util/List;
    //   209: invokeinterface 431 1 0
    //   214: aload_1
    //   215: getfield 434	com/tencent/mm/plugin/backup/h/r:jhE	I
    //   218: if_icmplt +20 -> 238
    //   221: aload 4
    //   223: getfield 371	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f:jep	Ljava/util/List;
    //   226: invokeinterface 431 1 0
    //   231: aload_1
    //   232: getfield 437	com/tencent/mm/plugin/backup/h/r:jhD	I
    //   235: if_icmpge +49 -> 284
    //   238: iconst_3
    //   239: new 439	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f$2
    //   242: dup
    //   243: aload 4
    //   245: invokespecial 442	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f$2:<init>	(Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f;)V
    //   248: invokestatic 445	com/tencent/mm/plugin/backup/f/b:a	(ILcom/tencent/mm/ad/e;)V
    //   251: ldc_w 447
    //   254: ldc_w 449
    //   257: invokestatic 451	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   260: new 453	com/tencent/mm/plugin/backup/bakoldlogic/c/a
    //   263: dup
    //   264: iconst_2
    //   265: invokespecial 455	com/tencent/mm/plugin/backup/bakoldlogic/c/a:<init>	(I)V
    //   268: invokevirtual 459	com/tencent/mm/plugin/backup/bakoldlogic/c/a:afx	()Z
    //   271: pop
    //   272: ldc2_w 349
    //   275: ldc_w 351
    //   278: invokestatic 105	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   281: aload_0
    //   282: monitorexit
    //   283: return
    //   284: ldc_w 447
    //   287: ldc_w 461
    //   290: invokestatic 451	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   293: new 463	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f$1
    //   296: dup
    //   297: aload 4
    //   299: invokespecial 464	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f$1:<init>	(Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f;)V
    //   302: ldc_w 466
    //   305: invokestatic 472	com/tencent/mm/sdk/f/e:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   308: ldc2_w 349
    //   311: ldc_w 351
    //   314: invokestatic 105	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   317: goto -36 -> 281
    //   320: astore_1
    //   321: aload_0
    //   322: monitorexit
    //   323: aload_1
    //   324: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	325	0	this	e
    //   0	325	1	paramr	r
    //   58	68	2	l	long
    //   40	258	4	localf	f
    //   46	16	5	localLinkedList1	java.util.LinkedList
    //   52	17	6	localLinkedList2	java.util.LinkedList
    // Exception table:
    //   from	to	target	type
    //   2	25	320	finally
    //   25	238	320	finally
    //   238	281	320	finally
    //   284	317	320	finally
  }
  
  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    GMTrace.i(14783411650560L, 110145);
    if ((paramBoolean) && (paramArrayOfByte != null)) {
      F(paramInt1, new String(paramArrayOfByte));
    }
    if ((paramInt1 == 10001) || (paramInt1 == 10002))
    {
      a.agk().agm().jfz = 1;
      new com.tencent.mm.plugin.backup.bakoldlogic.b.a(a.agk().iVn, a.agk().iVo, com.tencent.mm.plugin.backup.a.e.aem(), a.agk().iVm, 0, -1).afx();
    }
    com.tencent.mm.plugin.backup.h.ab localab;
    if (paramInt1 == 3)
    {
      this.jfO = -1;
      localab = new com.tencent.mm.plugin.backup.h.ab();
    }
    for (;;)
    {
      try
      {
        localab.aD(paramArrayOfByte);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", "recv cmd:%d (%s)", new Object[] { Integer.valueOf(localab.jgO), kM(localab.jgO) });
        paramInt1 = localab.jgO;
        switch (paramInt1)
        {
        case 2: 
        case 5: 
        case 8: 
        case 13: 
        case 14: 
        default: 
          GMTrace.o(14783411650560L, 110145);
          return;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BakPcProcessMgr", paramArrayOfByte, "buf to PacketCommandReq error", new Object[0]);
      }
      if (!at.AU())
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BakPcProcessMgr", "acc is not ready, not support pcmgr's auth");
        a(localab.jgO, 1, null);
        GMTrace.o(14783411650560L, 110145);
        return;
      }
      this.jfO = localab.jgO;
      if (this.jfJ != null)
      {
        this.jfJ.agw();
        this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdh;
        this.jfS = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jcZ;
        GMTrace.o(14783411650560L, 110145);
        return;
        GMTrace.o(14783411650560L, 110145);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", "authCallback is null");
      paramArrayOfByte = new Intent().setClassName(com.tencent.mm.sdk.platformtools.ab.getContext(), "com.tencent.mm.ui.LauncherUI");
      paramArrayOfByte.addFlags(335544320);
      paramArrayOfByte.putExtra("nofification_type", "back_to_pcmgr_notification");
      paramArrayOfByte.putExtra("newPCBackup", false);
      com.tencent.mm.sdk.platformtools.ab.getContext().startActivity(paramArrayOfByte);
      continue;
      a.agk().agn().ago();
      a.agk().agm().BH();
      F(-1, null);
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakPcProcessMgr", "summerback new version not support old pc backup request toast upgrade pc");
      GMTrace.o(14783411650560L, 110145);
      return;
      this.jfS = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jda;
      this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdk;
      agv();
      a(localab.jgO, 0, null);
      com.tencent.mm.sdk.f.e.b(new d.1(this.jfL), "BakPCServer_startBak").start();
      GMTrace.o(14783411650560L, 110145);
      return;
      this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdg;
      this.jfS = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jcZ;
      agv();
      a(localab.jgO, 0, null);
      if (this.jfN != null)
      {
        this.jfN.cancel();
        this.jfN = null;
      }
      if (this.jfL != null) {
        this.jfL.cancel();
      }
      if (this.jdY != null)
      {
        this.jdY.cancel();
        this.jdY = null;
      }
      if (this.jfF != null)
      {
        this.jfF.agx();
        GMTrace.o(14783411650560L, 110145);
        return;
        this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdm;
        this.jfS = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdc;
        agv();
        this.jfO = localab.jgO;
        if (this.jfI != null) {
          this.jfI.kN(localab.jgO);
        }
        for (;;)
        {
          paramArrayOfByte = a.agk().agm();
          paramArrayOfByte.jfC += 1;
          com.tencent.mm.plugin.backup.g.a.afG().a(new com.tencent.mm.plugin.backup.g.a.a()
          {
            public final void run()
            {
              GMTrace.i(14780995731456L, 110127);
              s locals = new s();
              if (this.jco)
              {
                locals.jhw = this.dbSize;
                locals.jhU = (this.jcq - this.dbSize);
                locals.jhT = this.jcp;
                e locale = e.this;
                e.a(6, 0, locals);
                com.tencent.mm.plugin.backup.f.b.a(3, new e.2(locale));
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", "send restore info cmd");
                new com.tencent.mm.plugin.backup.bakoldlogic.c.a(2).afx();
                GMTrace.o(14780995731456L, 110127);
                return;
              }
              if ((this.dbSize > this.jcq) && (this.jcq > 0L))
              {
                locals.jhw = this.dbSize;
                locals.jhU = (this.jcq - this.dbSize);
              }
              e.a(6, 14, locals);
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakPcProcessMgr", "init TempDB error");
              GMTrace.o(14780995731456L, 110127);
            }
          }, false, 1);
          GMTrace.o(14783411650560L, 110145);
          return;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", "callback is null");
        }
        this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdg;
        this.jfS = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jcZ;
        agv();
        a(localab.jgO, 0, null);
        if (this.jfN != null)
        {
          this.jfN.cancel();
          this.jfN = null;
        }
        if (this.jfM != null) {
          this.jfM.cancel();
        }
        if (this.jfF != null)
        {
          this.jfF.agx();
          GMTrace.o(14783411650560L, 110145);
          return;
          a(localab.jgO, 0, null);
          if (this.jfL != null)
          {
            this.jfL.pause();
            GMTrace.o(14783411650560L, 110145);
            return;
            a(localab.jgO, 0, null);
            if (this.jfM != null)
            {
              this.jfM.pause();
              GMTrace.o(14783411650560L, 110145);
              return;
              a(localab.jgO, 0, null);
              if (this.jfL != null)
              {
                this.jfL.resume();
                GMTrace.o(14783411650560L, 110145);
                return;
                a(localab.jgO, 0, null);
                if (this.jfM != null)
                {
                  this.jfM.resume();
                  GMTrace.o(14783411650560L, 110145);
                  return;
                  a.agk().agn().ago();
                  a.agk().agm().BH();
                  F(15, null);
                  GMTrace.o(14783411650560L, 110145);
                  return;
                  a(localab.jgO, 0, null);
                  if (this.jfK != null) {
                    this.jfK.agy();
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final void aew()
  {
    GMTrace.i(14783008997376L, 110142);
    if (this.jfM.jgb)
    {
      f localf = this.jfM;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.RecoverPCServer", "startMerge");
      if (localf.iWK)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.RecoverPCServer", "hasStartMerge , return");
        GMTrace.o(14783008997376L, 110142);
        return;
      }
      localf.jfG = 0;
      a.agk().agl().jfS = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jde;
      localf.iWK = true;
      com.tencent.mm.plugin.backup.g.a.afG().a(new f.4(localf), false, -1);
      GMTrace.o(14783008997376L, 110142);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakPcProcessMgr", "startMerge err state");
    GMTrace.o(14783008997376L, 110142);
  }
  
  public final boolean agr()
  {
    try
    {
      GMTrace.i(14782740561920L, 110140);
      boolean bool = this.jfT;
      GMTrace.o(14782740561920L, 110140);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void ags()
  {
    try
    {
      GMTrace.i(18453192769536L, 137487);
      this.jfF = null;
      this.jfL.jfF = null;
      this.jfM.jfF = null;
      GMTrace.o(18453192769536L, 137487);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int agu()
  {
    GMTrace.i(14783680086016L, 110147);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", "getPCProgressPercent now progress:%d", new Object[] { Integer.valueOf(this.jfS) });
    int i;
    if ((this.jfS == com.tencent.mm.plugin.backup.bakoldlogic.a.c.jda) || (this.jfS == com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdb))
    {
      i = this.jfL.jdQ;
      GMTrace.o(14783680086016L, 110147);
      return i;
    }
    if ((this.jfS == com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdc) || (this.jfS == com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdd))
    {
      i = this.jfM.jge;
      GMTrace.o(14783680086016L, 110147);
      return i;
    }
    if ((this.jfS == com.tencent.mm.plugin.backup.bakoldlogic.a.c.jde) || (this.jfS == com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdf))
    {
      i = this.jfM.jga;
      GMTrace.o(14783680086016L, 110147);
      return i;
    }
    com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BakPcProcessMgr", "wrong operatorStatus");
    GMTrace.o(14783680086016L, 110147);
    return 0;
  }
  
  public final void bs(String paramString1, String paramString2)
  {
    GMTrace.i(14782472126464L, 110138);
    this.jfP = paramString1;
    this.jfQ = paramString2;
    GMTrace.o(14782472126464L, 110138);
  }
  
  public final void di(boolean paramBoolean)
  {
    try
    {
      GMTrace.i(14782606344192L, 110139);
      this.jfT = paramBoolean;
      GMTrace.o(14782606344192L, 110139);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void kK(int paramInt)
  {
    GMTrace.i(14783814303744L, 110148);
    if (paramInt == 0) {}
    for (this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdi; paramInt == 1; this.jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdg)
    {
      ac localac = new ac();
      localac.jgO = 0;
      localac.jhA = paramInt;
      try
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", "send auth cmd resp, status:%d", new Object[] { Integer.valueOf(localac.jhA) });
        com.tencent.mm.plugin.backup.f.b.r(localac.toByteArray(), 4);
        GMTrace.o(14783814303744L, 110148);
        return;
      }
      catch (Exception localException1)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException1, "buf to PacketCommandResponse err", new Object[0]);
        GMTrace.o(14783814303744L, 110148);
        return;
      }
    }
    com.tencent.mm.plugin.backup.h.q localq = new com.tencent.mm.plugin.backup.h.q();
    localq.jhL = 0L;
    localq.jhN = Build.MANUFACTURER;
    localq.jhn = Build.MODEL;
    localq.jhM = 0L;
    localq.jhO = Build.VERSION.RELEASE;
    Object localObject2 = com.tencent.mm.storage.w.ghv;
    Object localObject1 = localObject2;
    Object localObject3;
    if (new File(com.tencent.mm.compatible.util.e.ghx).exists())
    {
      localObject1 = localObject2;
      if (com.tencent.mm.compatible.util.f.ty())
      {
        localObject3 = new File(com.tencent.mm.compatible.util.e.ghz);
        if (!((File)localObject3).exists())
        {
          localObject1 = localObject2;
          if (!((File)localObject3).mkdirs()) {}
        }
        else
        {
          localObject1 = com.tencent.mm.compatible.util.e.ghz;
        }
      }
    }
    localq.jhK = ((String)localObject1);
    localq.jhJ = com.tencent.mm.y.q.zG();
    localq.jhI = com.tencent.mm.y.q.zE();
    localq.jhH = com.tencent.mm.protocal.d.tJC;
    try
    {
      localObject1 = com.tencent.mm.sdk.platformtools.ab.getContext().getPackageManager().getPackageInfo(com.tencent.mm.sdk.platformtools.ab.getContext().getPackageName(), 0);
      localq.jhH = (((PackageInfo)localObject1).versionName + ";" + ((PackageInfo)localObject1).versionCode + ";" + com.tencent.mm.protocal.d.tJC);
      com.tencent.mm.ac.n.Dh();
      localObject2 = com.tencent.mm.ac.d.hX(localq.jhI);
      localObject1 = null;
      if (localObject2 != null)
      {
        localObject3 = new ByteArrayOutputStream();
        ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)localObject3);
        localObject1 = ((ByteArrayOutputStream)localObject3).toByteArray();
      }
    }
    catch (Exception localException2)
    {
      try
      {
        ((ByteArrayOutputStream)localObject3).close();
        com.tencent.mm.ac.n.Dh();
        localObject2 = com.tencent.mm.ac.d.t(localq.jhI, true);
        if (localObject1 == null)
        {
          i = 0;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", ", bmHDPath:%s, bm.buf.len:%d", new Object[] { localObject2, Integer.valueOf(i) });
          if (!bg.bq((byte[])localObject1)) {
            localq.jhP = new com.tencent.mm.bm.b((byte[])localObject1);
          }
          localObject1 = com.tencent.mm.a.e.d((String)localObject2, 0, -1);
          if (!bg.bq((byte[])localObject1)) {
            localq.jhQ = new com.tencent.mm.bm.b((byte[])localObject1);
          }
          localObject1 = new ac();
          ((ac)localObject1).jgO = 0;
          ((ac)localObject1).jhA = paramInt;
          ((ac)localObject1).jis = localq;
        }
        try
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", "send auth cmd resp, status:%d", new Object[] { Integer.valueOf(((ac)localObject1).jhA) });
          com.tencent.mm.plugin.backup.f.b.r(((ac)localObject1).toByteArray(), 4);
          GMTrace.o(14783814303744L, 110148);
          return;
        }
        catch (Exception localException3)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException3, "buf to PacketCommandResponse err", new Object[0]);
          GMTrace.o(14783814303744L, 110148);
        }
        localException2 = localException2;
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException2, "get packageInfo failed", new Object[0]);
      }
      catch (Exception localException4)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException4, "close", new Object[0]);
          continue;
          int i = localException2.length;
        }
      }
    }
  }
  
  public final void m(int paramInt, long paramLong)
  {
    GMTrace.i(14784619610112L, 110154);
    if (this.jfF != null) {
      this.jfF.kP(paramInt);
    }
    com.tencent.mm.plugin.backup.h.ab localab = new com.tencent.mm.plugin.backup.h.ab();
    localab.jgO = 19;
    localab.jip = 0;
    localab.jiq = paramInt;
    localab.jir = paramLong;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakPcProcessMgr", "sendCalcuProcess cmd, progress :%d", new Object[] { Integer.valueOf(paramInt) });
      com.tencent.mm.plugin.backup.f.b.r(localab.toByteArray(), 3);
      GMTrace.o(14784619610112L, 110154);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException, "buf to PacketCommandRequest err", new Object[0]);
      GMTrace.o(14784619610112L, 110154);
    }
  }
  
  public final void pause()
  {
    GMTrace.i(14783143215104L, 110143);
    if (this.jfO == 1)
    {
      this.jfL.pause();
      GMTrace.o(14783143215104L, 110143);
      return;
    }
    if (this.jfO == 6) {
      this.jfM.pause();
    }
    GMTrace.o(14783143215104L, 110143);
  }
  
  public static abstract interface a
    extends e.b
  {
    public abstract void agw();
  }
  
  public static abstract interface b
  {
    public abstract void onError(int paramInt);
  }
  
  public static abstract interface c
    extends e.b
  {
    public abstract void kN(int paramInt);
    
    public abstract void kO(int paramInt);
  }
  
  public static abstract interface d
    extends e.b
  {
    public abstract void aeg();
    
    public abstract void aga();
    
    public abstract void agx();
    
    public abstract void kP(int paramInt);
    
    public abstract void kQ(int paramInt);
    
    public abstract void kR(int paramInt);
  }
  
  public static abstract interface e
    extends e.b
  {
    public abstract void agy();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcmodel\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */