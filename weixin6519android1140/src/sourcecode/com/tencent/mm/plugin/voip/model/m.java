package com.tencent.mm.plugin.voip.model;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ic;
import com.tencent.mm.g.a.si;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.voip.ui.VideoActivity;
import com.tencent.mm.protocal.c.akw;
import com.tencent.mm.protocal.c.bii;
import com.tencent.mm.protocal.c.bmx;
import com.tencent.mm.protocal.c.boi;
import com.tencent.mm.protocal.c.bph;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class m
{
  private static final com.tencent.mm.a.f<Integer, i.a> gli;
  public String eDs;
  public boolean ewE;
  public aj nmC;
  private com.tencent.mm.network.n ovf;
  public String qHD;
  public n qIe;
  public j qIf;
  public boolean qIg;
  public boolean qIh;
  private long qIi;
  public Map<Integer, Long> qIj;
  public int qIk;
  public long qIl;
  public long qIm;
  public Point qIn;
  public boolean qIo;
  public boolean qIp;
  public boolean qIq;
  public bph qIr;
  public long qIs;
  List<a> qIt;
  
  static
  {
    GMTrace.i(5273146097664L, 39288);
    gli = new com.tencent.mm.a.f(5);
    GMTrace.o(5273146097664L, 39288);
  }
  
  public m()
  {
    GMTrace.i(5266569428992L, 39239);
    this.ewE = false;
    this.qIg = false;
    this.qIh = false;
    this.eDs = null;
    this.qIi = 0L;
    this.qIj = new HashMap();
    this.qIk = -1;
    this.qIl = 0L;
    this.qIm = 0L;
    this.qIo = false;
    this.qIp = false;
    this.qIq = false;
    this.qIr = null;
    this.qIs = 0L;
    this.qHD = null;
    this.ovf = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(5259187453952L, 39184);
        w.d("MicroMsg.Voip.VoipService", "network status change from " + paramAnonymousInt);
        if ((m.this.ewE) && (paramAnonymousInt == 4))
        {
          localObject = m.this.qIe.qDX;
          if (((e)localObject).qFB == 0) {
            ((e)localObject).qFB = ((e)localObject).qFr.qJo;
          }
          paramAnonymousInt = com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext());
          if (paramAnonymousInt != ((e)localObject).qFB) {
            com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "steve: onVoipLocalNetTypeChange: local network type change from " + ((e)localObject).qFB + " to " + paramAnonymousInt);
          }
        }
        try
        {
          byte[] arrayOfByte = new byte[4];
          arrayOfByte[0] = ((byte)paramAnonymousInt);
          int i = ((e)localObject).qFr.setAppCmd(301, arrayOfByte, 4);
          if (i < 0) {
            com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetLocalNetType] update local network type" + paramAnonymousInt + "fail:" + i + ", [roomid=" + ((e)localObject).qFr.mjN + ", roomkey=" + ((e)localObject).qFr.mjG + "]");
          }
          bmx localbmx = new bmx();
          localbmx.uWZ = 3;
          localbmx.uXa = new com.tencent.mm.bm.b(arrayOfByte, 0, 1);
          ((e)localObject).qFr.SendRUDP(localbmx.toByteArray(), localbmx.toByteArray().length);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "onVoipLocalNetTypeChange Error");
          }
        }
        ((e)localObject).qFB = paramAnonymousInt;
        Object localObject = m.this.qIe;
        new com.tencent.mm.plugin.voip.model.a.h(((n)localObject).qDX.qFr.mjF, ((n)localObject).qDX.qFr.mjG, ((n)localObject).qDX.qFr.mjN, 0, 0, null).bvg();
        GMTrace.o(5259187453952L, 39184);
      }
    };
    this.nmC = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5261334937600L, 39200);
        w.v("MicroMsg.Voip.VoipService", "voip repeat check is foreground");
        if (m.this.qIr == null)
        {
          m.this.qIs = 0L;
          m.this.nmC.stopTimer();
          GMTrace.o(5261334937600L, 39200);
          return false;
        }
        if (m.cR(ab.getContext()))
        {
          m.this.N(m.this.qIr.uhU, m.this.qIr.uhV);
          m.this.a(m.this.qIr);
          m.this.qIr = null;
          m.this.qIs = 0L;
          m.this.nmC.stopTimer();
          com.tencent.mm.plugin.report.service.g.ork.a(500L, 5L, 1L, false);
          GMTrace.o(5261334937600L, 39200);
          return false;
        }
        if (System.currentTimeMillis() - m.this.qIs < 60000L)
        {
          GMTrace.o(5261334937600L, 39200);
          return true;
        }
        m.this.qIr = null;
        m.this.qIs = 0L;
        m.this.nmC.stopTimer();
        GMTrace.o(5261334937600L, 39200);
        return false;
      }
    }, true);
    this.qIt = null;
    this.qIe = new n();
    this.ewE = false;
    this.qIg = false;
    this.qIh = false;
    this.eDs = null;
    this.qHD = null;
    at.a(this.ovf);
    GMTrace.o(5266569428992L, 39239);
  }
  
  private static byte[] J(Map<Integer, Long> paramMap)
  {
    GMTrace.i(5268180041728L, 39251);
    bii localbii = new bii();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      akw localakw = new akw();
      localakw.oqG = localInteger.intValue();
      localakw.uzX = ((Long)paramMap.get(localInteger)).intValue();
      localLinkedList.push(localakw);
    }
    localbii.uPQ = localLinkedList;
    localbii.uPP = localLinkedList.size();
    try
    {
      paramMap = localbii.toByteArray();
      GMTrace.o(5268180041728L, 39251);
      return paramMap;
    }
    catch (IOException paramMap)
    {
      w.printErrStackTrace("MicroMsg.Voip.VoipService", paramMap, "", new Object[0]);
      GMTrace.o(5268180041728L, 39251);
    }
    return null;
  }
  
  public static i.a JO(String paramString)
  {
    GMTrace.i(5267911606272L, 39249);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(5267911606272L, 39249);
      return null;
    }
    int i = paramString.hashCode();
    i.a locala = (i.a)gli.get(Integer.valueOf(i));
    if (locala != null)
    {
      GMTrace.o(5267911606272L, 39249);
      return locala;
    }
    locala = new i.a();
    if (!locala.parse(paramString))
    {
      GMTrace.o(5267911606272L, 39249);
      return null;
    }
    gli.m(Integer.valueOf(i), locala);
    GMTrace.o(5267911606272L, 39249);
    return locala;
  }
  
  public static void a(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(5271669702656L, 39277);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    long l = System.currentTimeMillis();
    paramContext = new ic();
    paramContext.eLB.eLE = false;
    paramContext.eLB.eLD = l;
    paramContext.eLB.eLC = localContext;
    com.tencent.mm.sdk.b.a.vgX.m(paramContext);
    w.i("MicroMsg.Voip.VoipService", "start VideoActivity");
    paramContext = new Intent(localContext, VideoActivity.class);
    paramContext.putExtra("Voip_User", paramString);
    paramContext.putExtra("Voip_Outcall", paramBoolean1);
    paramContext.putExtra("Voip_VideoCall", paramBoolean2);
    paramContext.putExtra("Voip_LastPage_Hash", l);
    if (paramBoolean3)
    {
      paramContext.setFlags(603979776);
      paramContext.addFlags(268435456);
    }
    localContext.startActivity(paramContext);
    GMTrace.o(5271669702656L, 39277);
  }
  
  private static Map<Integer, Long> aI(byte[] paramArrayOfByte)
  {
    GMTrace.i(5268045824000L, 39250);
    if (bg.bq(paramArrayOfByte))
    {
      GMTrace.o(5268045824000L, 39250);
      return null;
    }
    try
    {
      paramArrayOfByte = (bii)new bii().aD(paramArrayOfByte);
      if (paramArrayOfByte == null)
      {
        GMTrace.o(5268045824000L, 39250);
        return null;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      GMTrace.o(5268045824000L, 39250);
      return null;
    }
    w.d("MicroMsg.Voip.VoipService", "dkpush : keyCount:" + paramArrayOfByte.uPP);
    LinkedList localLinkedList = paramArrayOfByte.uPQ;
    if (localLinkedList.size() != paramArrayOfByte.uPP)
    {
      GMTrace.o(5268045824000L, 39250);
      return null;
    }
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramArrayOfByte.uPP)
    {
      localHashMap.put(Integer.valueOf(((akw)localLinkedList.get(i)).oqG), Long.valueOf(0xFFFFFFFF & ((akw)localLinkedList.get(i)).uzX));
      i += 1;
    }
    if (localHashMap.size() != paramArrayOfByte.uPP)
    {
      GMTrace.o(5268045824000L, 39250);
      return null;
    }
    GMTrace.o(5268045824000L, 39250);
    return localHashMap;
  }
  
  private static String aJ(byte[] paramArrayOfByte)
  {
    GMTrace.i(5268314259456L, 39252);
    String str1 = "";
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str3 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      String str2 = str3;
      if (str3.length() == 1) {
        str2 = "0" + str3;
      }
      str1 = str1 + str2.toUpperCase();
      i += 1;
    }
    GMTrace.o(5268314259456L, 39252);
    return str1;
  }
  
  private static void buI()
  {
    GMTrace.i(5267374735360L, 39245);
    si localsi = new si();
    localsi.eXf.eHJ = 7;
    com.tencent.mm.sdk.b.a.vgX.m(localsi);
    GMTrace.o(5267374735360L, 39245);
  }
  
  public static void buR()
  {
    GMTrace.i(5271401267200L, 39275);
    GMTrace.o(5271401267200L, 39275);
  }
  
  public static void buS()
  {
    GMTrace.i(5271535484928L, 39276);
    GMTrace.o(5271535484928L, 39276);
  }
  
  public static boolean cR(Context paramContext)
  {
    GMTrace.i(5271938138112L, 39279);
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      w.d("MicroMsg.Voip.VoipService", "topActivity:" + ((ComponentName)localObject).flattenToString());
      if (!((ComponentName)localObject).getPackageName().equals(paramContext.getPackageName()))
      {
        w.i("MicroMsg.Voip.VoipService", "is in backGround.");
        GMTrace.o(5271938138112L, 39279);
        return false;
      }
    }
    if (((KeyguardManager)ab.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode())
    {
      GMTrace.o(5271938138112L, 39279);
      return false;
    }
    w.i("MicroMsg.Voip.VoipService", "is in foreGround.");
    GMTrace.o(5271938138112L, 39279);
    return true;
  }
  
  public static float iA(boolean paramBoolean)
  {
    GMTrace.i(5271803920384L, 39278);
    float f1 = 0.74766356F;
    float f2 = f1;
    for (;;)
    {
      try
      {
        localObject = d.btG();
        if (!paramBoolean) {
          continue;
        }
        f2 = f1;
        localObject = ((m)localObject).qIe.qDX.qFr.field_capInfo;
        f2 = f1;
        if (localObject != null)
        {
          f2 = f1;
          localObject = ByteBuffer.wrap((byte[])localObject);
          f2 = f1;
          if (((ByteBuffer)localObject).getInt() > 65535)
          {
            f2 = f1;
            ((ByteBuffer)localObject).order(ByteOrder.LITTLE_ENDIAN);
          }
          f2 = f1;
          ((ByteBuffer)localObject).getShort();
          f2 = f1;
          ((ByteBuffer)localObject).getShort();
          f2 = f1;
          float f3 = ((ByteBuffer)localObject).getInt() / 100.0F;
          if (f3 != 0.0F) {
            f1 = f3;
          }
          f2 = f1;
          w.d("MicroMsg.Voip.VoipService", "use rate: %s, changed: %s", new Object[] { Float.valueOf(f1), Boolean.valueOf(paramBoolean) });
          f2 = f1;
        }
      }
      catch (Exception localException)
      {
        Object localObject;
        w.e("MicroMsg.Voip.VoipService", "update failed: " + localException.getMessage());
        continue;
      }
      GMTrace.o(5271803920384L, 39278);
      return f2;
      f2 = f1;
      localObject = ((m)localObject).qIe.qDX.qFr.qJs;
    }
  }
  
  public static byte[] y(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(5268582694912L, 39254);
    byte[] arrayOfByte = new byte[paramInt];
    int i = 12;
    while (i < paramInt + 12)
    {
      arrayOfByte[(i - 12)] = paramArrayOfByte[i];
      i += 1;
    }
    GMTrace.o(5268582694912L, 39254);
    return arrayOfByte;
  }
  
  public final void JP(final String paramString)
  {
    GMTrace.i(14694559514624L, 109483);
    int i = 0;
    while (i < 2)
    {
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14694827950080L, 109485);
          if (m.this.qIf != null)
          {
            j localj = m.this.qIf;
            String str = paramString;
            if (localj.qGZ != null)
            {
              localj.qHD = str;
              localj.qGZ.JP(str);
            }
          }
          GMTrace.o(14694827950080L, 109485);
        }
      }, 1000L);
      i += 1;
    }
    GMTrace.o(14694559514624L, 109483);
  }
  
  public final void N(final int paramInt, final long paramLong)
  {
    GMTrace.i(5267508953088L, 39246);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5266435211264L, 39238);
        w.i("MicroMsg.Voip.VoipService", "onDelayInvite, roomId:%s, roomKey:%s", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
        if ((!com.tencent.mm.k.f.tL()) && (!m.cR(ab.getContext())))
        {
          w.i("MicroMsg.Voip.VoipService", "background now and notification Is closed.");
          GMTrace.o(5266435211264L, 39238);
          return;
        }
        if (m.this.qIe.buU())
        {
          w.i("MicroMsg.Voip.VoipService", "room is ready, ingore the msg");
          GMTrace.o(5266435211264L, 39238);
          return;
        }
        new com.tencent.mm.plugin.voip.model.a.e(paramInt, paramLong, "").bvg();
        GMTrace.o(5266435211264L, 39238);
      }
    });
    GMTrace.o(5267508953088L, 39246);
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, boolean paramBoolean)
  {
    GMTrace.i(20669127458816L, 153997);
    g localg = this.qIe.qDX.qFt;
    int i;
    if (localg.qFN == g.qFM)
    {
      i = 1;
      if (paramBoolean) {
        break label68;
      }
    }
    label68:
    for (int j = 1;; j = 0)
    {
      if ((j & i) == 0) {
        break label74;
      }
      GMTrace.o(20669127458816L, 153997);
      return -1;
      i = 0;
      break;
    }
    label74:
    if (!localg.qDX.qFr.ndo)
    {
      GMTrace.o(20669127458816L, 153997);
      return -1;
    }
    paramInt1 = localg.qDX.qFr.videoEncodeToLocal(paramArrayOfByte, paramInt1, paramInt3, paramInt4, paramInt2, 0, 75, paramArrayOfInt);
    GMTrace.o(20669127458816L, 153997);
    return paramInt1;
  }
  
  /* Error */
  public final int a(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    // Byte code:
    //   0: ldc2_w 631
    //   3: ldc_w 633
    //   6: invokestatic 64	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: lconst_0
    //   10: lstore 20
    //   12: lconst_0
    //   13: lstore 12
    //   15: lconst_0
    //   16: lstore 22
    //   18: aload_0
    //   19: getfield 140	com/tencent/mm/plugin/voip/model/m:qIe	Lcom/tencent/mm/plugin/voip/model/n;
    //   22: getfield 511	com/tencent/mm/plugin/voip/model/n:qDX	Lcom/tencent/mm/plugin/voip/model/e;
    //   25: getfield 636	com/tencent/mm/plugin/voip/model/e:qFv	[B
    //   28: invokestatic 638	com/tencent/mm/plugin/voip/model/m:aI	([B)Ljava/util/Map;
    //   31: astore 24
    //   33: aload 24
    //   35: ifnonnull +323 -> 358
    //   38: ldc -35
    //   40: ldc_w 640
    //   43: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: lconst_0
    //   47: lstore 16
    //   49: lconst_0
    //   50: lstore 18
    //   52: lconst_0
    //   53: lstore 14
    //   55: ldc -35
    //   57: new 368	java/lang/StringBuilder
    //   60: dup
    //   61: ldc_w 642
    //   64: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: lload 18
    //   69: invokevirtual 645	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   72: ldc_w 647
    //   75: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: lload 16
    //   80: invokevirtual 645	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   83: ldc_w 649
    //   86: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: lload 14
    //   91: invokevirtual 645	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   94: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   100: new 651	com/tencent/mm/protocal/c/bpd
    //   103: dup
    //   104: invokespecial 652	com/tencent/mm/protocal/c/bpd:<init>	()V
    //   107: aload_1
    //   108: invokevirtual 653	com/tencent/mm/protocal/c/bpd:aD	([B)Lcom/tencent/mm/bm/a;
    //   111: checkcast 651	com/tencent/mm/protocal/c/bpd
    //   114: astore 24
    //   116: iconst_0
    //   117: istore 5
    //   119: lload 22
    //   121: lstore 10
    //   123: lload 20
    //   125: lstore 8
    //   127: iload 5
    //   129: aload 24
    //   131: getfield 656	com/tencent/mm/protocal/c/bpd:uYR	Ljava/util/LinkedList;
    //   134: invokevirtual 212	java/util/LinkedList:size	()I
    //   137: if_icmpge +1053 -> 1190
    //   140: aload 24
    //   142: getfield 656	com/tencent/mm/protocal/c/bpd:uYR	Ljava/util/LinkedList;
    //   145: iload 5
    //   147: invokevirtual 387	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   150: checkcast 658	com/tencent/mm/protocal/c/bpc
    //   153: astore 25
    //   155: aload 25
    //   157: getfield 661	com/tencent/mm/protocal/c/bpc:uei	I
    //   160: iconst_1
    //   161: if_icmpne +472 -> 633
    //   164: new 663	com/tencent/mm/protocal/c/bqc
    //   167: dup
    //   168: invokespecial 664	com/tencent/mm/protocal/c/bqc:<init>	()V
    //   171: aload 25
    //   173: getfield 668	com/tencent/mm/protocal/c/bpc:tTe	Lcom/tencent/mm/protocal/c/azp;
    //   176: getfield 674	com/tencent/mm/protocal/c/azp:uNP	Lcom/tencent/mm/bm/b;
    //   179: getfield 679	com/tencent/mm/bm/b:tJp	[B
    //   182: invokevirtual 680	com/tencent/mm/protocal/c/bqc:aD	([B)Lcom/tencent/mm/bm/a;
    //   185: checkcast 663	com/tencent/mm/protocal/c/bqc
    //   188: astore_1
    //   189: aload_1
    //   190: ifnull +420 -> 610
    //   193: ldc -35
    //   195: new 368	java/lang/StringBuilder
    //   198: dup
    //   199: ldc_w 682
    //   202: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   205: aload_1
    //   206: getfield 685	com/tencent/mm/protocal/c/bqc:jhA	I
    //   209: invokevirtual 377	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   212: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   215: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   218: lload 8
    //   220: aload 25
    //   222: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   225: i2l
    //   226: lcmp
    //   227: ifge +1185 -> 1412
    //   230: aload 25
    //   232: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   235: i2l
    //   236: lstore 6
    //   238: lload 6
    //   240: lstore 8
    //   242: aload 25
    //   244: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   247: i2l
    //   248: lload 18
    //   250: lcmp
    //   251: ifle +367 -> 618
    //   254: ldc -35
    //   256: new 368	java/lang/StringBuilder
    //   259: dup
    //   260: ldc_w 688
    //   263: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   266: aload 25
    //   268: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   271: invokevirtual 377	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   274: ldc_w 690
    //   277: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: lload 18
    //   282: invokevirtual 645	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   285: ldc_w 692
    //   288: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: aload_1
    //   292: getfield 685	com/tencent/mm/protocal/c/bqc:jhA	I
    //   295: invokevirtual 377	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   298: ldc_w 694
    //   301: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   307: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   310: aload_0
    //   311: getfield 140	com/tencent/mm/plugin/voip/model/m:qIe	Lcom/tencent/mm/plugin/voip/model/n;
    //   314: getfield 511	com/tencent/mm/plugin/voip/model/n:qDX	Lcom/tencent/mm/plugin/voip/model/e;
    //   317: getfield 698	com/tencent/mm/plugin/voip/model/e:qFu	Lcom/tencent/mm/plugin/voip/model/o;
    //   320: aload_1
    //   321: iconst_1
    //   322: invokevirtual 703	com/tencent/mm/plugin/voip/model/o:a	(Lcom/tencent/mm/protocal/c/bqc;I)V
    //   325: lload 6
    //   327: lstore 20
    //   329: lload 10
    //   331: lstore 22
    //   333: lload 12
    //   335: lstore 6
    //   337: iload 5
    //   339: iconst_1
    //   340: iadd
    //   341: istore 5
    //   343: lload 20
    //   345: lstore 8
    //   347: lload 6
    //   349: lstore 12
    //   351: lload 22
    //   353: lstore 10
    //   355: goto -228 -> 127
    //   358: aload 24
    //   360: invokeinterface 163 1 0
    //   365: invokeinterface 169 1 0
    //   370: astore 25
    //   372: lconst_0
    //   373: lstore 10
    //   375: lconst_0
    //   376: lstore 8
    //   378: lconst_0
    //   379: lstore 6
    //   381: aload 25
    //   383: invokeinterface 175 1 0
    //   388: ifeq +1031 -> 1419
    //   391: aload 25
    //   393: invokeinterface 179 1 0
    //   398: checkcast 181	java/lang/Integer
    //   401: astore 26
    //   403: aload 24
    //   405: aload 26
    //   407: invokeinterface 195 2 0
    //   412: checkcast 197	java/lang/Long
    //   415: astore 27
    //   417: aload 26
    //   419: invokevirtual 188	java/lang/Integer:intValue	()I
    //   422: tableswitch	default:+26->448, 1:+66->488, 2:+76->498, 3:+86->508
    //   448: ldc -35
    //   450: new 368	java/lang/StringBuilder
    //   453: dup
    //   454: ldc_w 705
    //   457: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   460: aload 26
    //   462: invokevirtual 188	java/lang/Integer:intValue	()I
    //   465: invokevirtual 377	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   468: ldc_w 707
    //   471: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: aload 27
    //   476: invokevirtual 710	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   479: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   482: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   485: goto -104 -> 381
    //   488: aload 27
    //   490: invokevirtual 713	java/lang/Long:longValue	()J
    //   493: lstore 10
    //   495: goto -114 -> 381
    //   498: aload 27
    //   500: invokevirtual 713	java/lang/Long:longValue	()J
    //   503: lstore 8
    //   505: goto -124 -> 381
    //   508: aload 27
    //   510: invokevirtual 713	java/lang/Long:longValue	()J
    //   513: lstore 6
    //   515: goto -134 -> 381
    //   518: astore 24
    //   520: ldc -35
    //   522: aload 24
    //   524: ldc -33
    //   526: iconst_0
    //   527: anewarray 4	java/lang/Object
    //   530: invokestatic 229	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   533: aload_1
    //   534: invokestatic 715	com/tencent/mm/plugin/voip/model/m:aJ	([B)Ljava/lang/String;
    //   537: astore 24
    //   539: ldc -35
    //   541: new 368	java/lang/StringBuilder
    //   544: dup
    //   545: ldc_w 717
    //   548: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   551: aload_1
    //   552: arraylength
    //   553: invokevirtual 377	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   556: ldc_w 719
    //   559: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   562: aload 24
    //   564: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   567: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   570: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   573: ldc2_w 631
    //   576: ldc_w 633
    //   579: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   582: iconst_0
    //   583: ireturn
    //   584: astore_1
    //   585: ldc -35
    //   587: ldc_w 721
    //   590: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   593: ldc -35
    //   595: aload_1
    //   596: ldc -33
    //   598: iconst_0
    //   599: anewarray 4	java/lang/Object
    //   602: invokestatic 229	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   605: aconst_null
    //   606: astore_1
    //   607: goto -418 -> 189
    //   610: ldc -35
    //   612: ldc_w 721
    //   615: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   618: lload 8
    //   620: lstore 20
    //   622: lload 12
    //   624: lstore 6
    //   626: lload 10
    //   628: lstore 22
    //   630: goto -293 -> 337
    //   633: aload 25
    //   635: getfield 661	com/tencent/mm/protocal/c/bpc:uei	I
    //   638: iconst_2
    //   639: if_icmpne +337 -> 976
    //   642: new 723	com/tencent/mm/protocal/c/bpr
    //   645: dup
    //   646: invokespecial 724	com/tencent/mm/protocal/c/bpr:<init>	()V
    //   649: aload 25
    //   651: getfield 668	com/tencent/mm/protocal/c/bpc:tTe	Lcom/tencent/mm/protocal/c/azp;
    //   654: getfield 674	com/tencent/mm/protocal/c/azp:uNP	Lcom/tencent/mm/bm/b;
    //   657: getfield 679	com/tencent/mm/bm/b:tJp	[B
    //   660: invokevirtual 725	com/tencent/mm/protocal/c/bpr:aD	([B)Lcom/tencent/mm/bm/a;
    //   663: checkcast 723	com/tencent/mm/protocal/c/bpr
    //   666: astore_1
    //   667: aload_1
    //   668: ifnull +285 -> 953
    //   671: ldc -35
    //   673: new 368	java/lang/StringBuilder
    //   676: dup
    //   677: ldc_w 727
    //   680: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   683: aload_1
    //   684: getfield 730	com/tencent/mm/protocal/c/bpr:jib	I
    //   687: invokevirtual 377	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   690: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   693: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   696: lload 12
    //   698: aload 25
    //   700: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   703: i2l
    //   704: lcmp
    //   705: ifge +700 -> 1405
    //   708: aload 25
    //   710: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   713: i2l
    //   714: lstore 6
    //   716: aload 25
    //   718: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   721: i2l
    //   722: lload 16
    //   724: lcmp
    //   725: ifle +174 -> 899
    //   728: ldc -35
    //   730: new 368	java/lang/StringBuilder
    //   733: dup
    //   734: ldc_w 732
    //   737: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   740: aload 25
    //   742: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   745: invokevirtual 377	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   748: ldc_w 734
    //   751: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   754: lload 16
    //   756: invokevirtual 645	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   759: ldc_w 694
    //   762: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   765: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   768: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   771: aload_1
    //   772: getfield 730	com/tencent/mm/protocal/c/bpr:jib	I
    //   775: iconst_5
    //   776: if_icmpne +54 -> 830
    //   779: aload_0
    //   780: getfield 140	com/tencent/mm/plugin/voip/model/m:qIe	Lcom/tencent/mm/plugin/voip/model/n;
    //   783: getfield 511	com/tencent/mm/plugin/voip/model/n:qDX	Lcom/tencent/mm/plugin/voip/model/e;
    //   786: getfield 698	com/tencent/mm/plugin/voip/model/e:qFu	Lcom/tencent/mm/plugin/voip/model/o;
    //   789: aload_1
    //   790: invokevirtual 737	com/tencent/mm/plugin/voip/model/o:a	(Lcom/tencent/mm/protocal/c/bpr;)V
    //   793: lload 8
    //   795: lstore 20
    //   797: lload 10
    //   799: lstore 22
    //   801: goto -464 -> 337
    //   804: astore_1
    //   805: ldc -35
    //   807: ldc_w 739
    //   810: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   813: ldc -35
    //   815: aload_1
    //   816: ldc -33
    //   818: iconst_0
    //   819: anewarray 4	java/lang/Object
    //   822: invokestatic 229	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   825: aconst_null
    //   826: astore_1
    //   827: goto -160 -> 667
    //   830: aload_1
    //   831: getfield 730	com/tencent/mm/protocal/c/bpr:jib	I
    //   834: iconst_1
    //   835: if_icmpne +28 -> 863
    //   838: aload_0
    //   839: getfield 140	com/tencent/mm/plugin/voip/model/m:qIe	Lcom/tencent/mm/plugin/voip/model/n;
    //   842: getfield 511	com/tencent/mm/plugin/voip/model/n:qDX	Lcom/tencent/mm/plugin/voip/model/e;
    //   845: getfield 698	com/tencent/mm/plugin/voip/model/e:qFu	Lcom/tencent/mm/plugin/voip/model/o;
    //   848: aload_1
    //   849: invokevirtual 742	com/tencent/mm/plugin/voip/model/o:b	(Lcom/tencent/mm/protocal/c/bpr;)V
    //   852: lload 8
    //   854: lstore 20
    //   856: lload 10
    //   858: lstore 22
    //   860: goto -523 -> 337
    //   863: ldc -35
    //   865: new 368	java/lang/StringBuilder
    //   868: dup
    //   869: ldc_w 744
    //   872: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   875: aload_1
    //   876: getfield 730	com/tencent/mm/protocal/c/bpr:jib	I
    //   879: invokevirtual 377	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   882: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   885: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   888: lload 8
    //   890: lstore 20
    //   892: lload 10
    //   894: lstore 22
    //   896: goto -559 -> 337
    //   899: ldc -35
    //   901: new 368	java/lang/StringBuilder
    //   904: dup
    //   905: ldc_w 746
    //   908: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   911: aload 25
    //   913: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   916: invokevirtual 377	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   919: ldc_w 748
    //   922: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   925: lload 16
    //   927: invokevirtual 645	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   930: ldc_w 694
    //   933: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   936: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   939: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   942: lload 8
    //   944: lstore 20
    //   946: lload 10
    //   948: lstore 22
    //   950: goto -613 -> 337
    //   953: ldc -35
    //   955: ldc_w 739
    //   958: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   961: lload 8
    //   963: lstore 20
    //   965: lload 12
    //   967: lstore 6
    //   969: lload 10
    //   971: lstore 22
    //   973: goto -636 -> 337
    //   976: lload 8
    //   978: lstore 20
    //   980: lload 12
    //   982: lstore 6
    //   984: lload 10
    //   986: lstore 22
    //   988: aload 25
    //   990: getfield 661	com/tencent/mm/protocal/c/bpc:uei	I
    //   993: iconst_3
    //   994: if_icmpne -657 -> 337
    //   997: new 670	com/tencent/mm/protocal/c/azp
    //   1000: dup
    //   1001: invokespecial 749	com/tencent/mm/protocal/c/azp:<init>	()V
    //   1004: aload 25
    //   1006: getfield 668	com/tencent/mm/protocal/c/bpc:tTe	Lcom/tencent/mm/protocal/c/azp;
    //   1009: getfield 674	com/tencent/mm/protocal/c/azp:uNP	Lcom/tencent/mm/bm/b;
    //   1012: getfield 679	com/tencent/mm/bm/b:tJp	[B
    //   1015: invokevirtual 753	com/tencent/mm/protocal/c/azp:bf	([B)Lcom/tencent/mm/protocal/c/azp;
    //   1018: astore_1
    //   1019: lload 8
    //   1021: lstore 20
    //   1023: lload 12
    //   1025: lstore 6
    //   1027: lload 10
    //   1029: lstore 22
    //   1031: aload_1
    //   1032: ifnull -695 -> 337
    //   1035: lload 10
    //   1037: aload 25
    //   1039: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   1042: i2l
    //   1043: lcmp
    //   1044: ifge +354 -> 1398
    //   1047: aload 25
    //   1049: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   1052: i2l
    //   1053: lstore 6
    //   1055: aload 25
    //   1057: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   1060: i2l
    //   1061: lload 14
    //   1063: lcmp
    //   1064: ifle +93 -> 1157
    //   1067: ldc -35
    //   1069: new 368	java/lang/StringBuilder
    //   1072: dup
    //   1073: ldc_w 755
    //   1076: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1079: aload 25
    //   1081: getfield 686	com/tencent/mm/protocal/c/bpc:oqG	I
    //   1084: invokevirtual 377	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1087: ldc_w 757
    //   1090: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1093: lload 14
    //   1095: invokevirtual 645	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1098: ldc_w 694
    //   1101: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1104: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1107: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1110: aload_0
    //   1111: getfield 140	com/tencent/mm/plugin/voip/model/m:qIe	Lcom/tencent/mm/plugin/voip/model/n;
    //   1114: getfield 511	com/tencent/mm/plugin/voip/model/n:qDX	Lcom/tencent/mm/plugin/voip/model/e;
    //   1117: getfield 698	com/tencent/mm/plugin/voip/model/e:qFu	Lcom/tencent/mm/plugin/voip/model/o;
    //   1120: aload_1
    //   1121: invokevirtual 761	com/tencent/mm/plugin/voip/model/o:c	(Lcom/tencent/mm/protocal/c/azp;)V
    //   1124: aload_0
    //   1125: getfield 110	com/tencent/mm/plugin/voip/model/m:qIr	Lcom/tencent/mm/protocal/c/bph;
    //   1128: ifnull +29 -> 1157
    //   1131: aload_1
    //   1132: getfield 674	com/tencent/mm/protocal/c/azp:uNP	Lcom/tencent/mm/bm/b;
    //   1135: invokevirtual 762	com/tencent/mm/bm/b:toByteArray	()[B
    //   1138: invokestatic 768	com/tencent/mm/plugin/voip/b/a:aL	([B)I
    //   1141: sipush 255
    //   1144: iand
    //   1145: iconst_1
    //   1146: if_icmpne +11 -> 1157
    //   1149: aload_0
    //   1150: getfield 110	com/tencent/mm/plugin/voip/model/m:qIr	Lcom/tencent/mm/protocal/c/bph;
    //   1153: iconst_1
    //   1154: putfield 773	com/tencent/mm/protocal/c/bph:uYQ	I
    //   1157: lload 6
    //   1159: lstore 22
    //   1161: lload 8
    //   1163: lstore 20
    //   1165: lload 12
    //   1167: lstore 6
    //   1169: goto -832 -> 337
    //   1172: astore_1
    //   1173: ldc -35
    //   1175: aload_1
    //   1176: ldc -33
    //   1178: iconst_0
    //   1179: anewarray 4	java/lang/Object
    //   1182: invokestatic 229	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1185: aconst_null
    //   1186: astore_1
    //   1187: goto -168 -> 1019
    //   1190: lload 8
    //   1192: lload 18
    //   1194: lcmp
    //   1195: ifle +196 -> 1391
    //   1198: lload 12
    //   1200: lload 16
    //   1202: lcmp
    //   1203: ifle +181 -> 1384
    //   1206: lload 10
    //   1208: lload 14
    //   1210: lcmp
    //   1211: ifle +166 -> 1377
    //   1214: new 93	java/util/HashMap
    //   1217: dup
    //   1218: invokespecial 94	java/util/HashMap:<init>	()V
    //   1221: astore_1
    //   1222: aload_1
    //   1223: iconst_1
    //   1224: invokestatic 248	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1227: lload 8
    //   1229: invokestatic 392	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1232: invokeinterface 396 3 0
    //   1237: pop
    //   1238: aload_1
    //   1239: iconst_2
    //   1240: invokestatic 248	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1243: lload 12
    //   1245: invokestatic 392	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1248: invokeinterface 396 3 0
    //   1253: pop
    //   1254: aload_1
    //   1255: iconst_3
    //   1256: invokestatic 248	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1259: lload 10
    //   1261: invokestatic 392	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1264: invokeinterface 396 3 0
    //   1269: pop
    //   1270: aload_1
    //   1271: invokestatic 775	com/tencent/mm/plugin/voip/model/m:J	(Ljava/util/Map;)[B
    //   1274: astore_1
    //   1275: iload_2
    //   1276: aload_0
    //   1277: getfield 140	com/tencent/mm/plugin/voip/model/m:qIe	Lcom/tencent/mm/plugin/voip/model/n;
    //   1280: getfield 511	com/tencent/mm/plugin/voip/model/n:qDX	Lcom/tencent/mm/plugin/voip/model/e;
    //   1283: getfield 517	com/tencent/mm/plugin/voip/model/e:qFr	Lcom/tencent/mm/plugin/voip/model/v2protocal;
    //   1286: getfield 778	com/tencent/mm/plugin/voip/model/v2protocal:mjF	I
    //   1289: if_icmpne +77 -> 1366
    //   1292: lload_3
    //   1293: aload_0
    //   1294: getfield 140	com/tencent/mm/plugin/voip/model/m:qIe	Lcom/tencent/mm/plugin/voip/model/n;
    //   1297: getfield 511	com/tencent/mm/plugin/voip/model/n:qDX	Lcom/tencent/mm/plugin/voip/model/e;
    //   1300: getfield 517	com/tencent/mm/plugin/voip/model/e:qFr	Lcom/tencent/mm/plugin/voip/model/v2protocal;
    //   1303: getfield 781	com/tencent/mm/plugin/voip/model/v2protocal:mjG	J
    //   1306: lcmp
    //   1307: ifne +59 -> 1366
    //   1310: aload_0
    //   1311: getfield 140	com/tencent/mm/plugin/voip/model/m:qIe	Lcom/tencent/mm/plugin/voip/model/n;
    //   1314: getfield 511	com/tencent/mm/plugin/voip/model/n:qDX	Lcom/tencent/mm/plugin/voip/model/e;
    //   1317: aload_1
    //   1318: putfield 636	com/tencent/mm/plugin/voip/model/e:qFv	[B
    //   1321: ldc -35
    //   1323: new 368	java/lang/StringBuilder
    //   1326: dup
    //   1327: ldc_w 783
    //   1330: invokespecial 373	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1333: lload 8
    //   1335: invokevirtual 645	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1338: ldc_w 785
    //   1341: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1344: lload 12
    //   1346: invokevirtual 645	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1349: ldc_w 785
    //   1352: invokevirtual 412	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1355: lload 10
    //   1357: invokevirtual 645	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1360: invokevirtual 381	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1363: invokestatic 384	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1366: ldc2_w 631
    //   1369: ldc_w 633
    //   1372: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1375: iconst_0
    //   1376: ireturn
    //   1377: lload 14
    //   1379: lstore 10
    //   1381: goto -167 -> 1214
    //   1384: lload 16
    //   1386: lstore 12
    //   1388: goto -182 -> 1206
    //   1391: lload 18
    //   1393: lstore 8
    //   1395: goto -197 -> 1198
    //   1398: lload 10
    //   1400: lstore 6
    //   1402: goto -347 -> 1055
    //   1405: lload 12
    //   1407: lstore 6
    //   1409: goto -693 -> 716
    //   1412: lload 8
    //   1414: lstore 6
    //   1416: goto -1178 -> 238
    //   1419: lload 6
    //   1421: lstore 14
    //   1423: lload 8
    //   1425: lstore 16
    //   1427: lload 10
    //   1429: lstore 18
    //   1431: goto -1376 -> 55
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1434	0	this	m
    //   0	1434	1	paramArrayOfByte	byte[]
    //   0	1434	2	paramInt	int
    //   0	1434	3	paramLong	long
    //   117	225	5	i	int
    //   236	1184	6	l1	long
    //   125	1299	8	l2	long
    //   121	1307	10	l3	long
    //   13	1393	12	l4	long
    //   53	1369	14	l5	long
    //   47	1379	16	l6	long
    //   50	1380	18	l7	long
    //   10	1154	20	l8	long
    //   16	1144	22	l9	long
    //   31	373	24	localObject1	Object
    //   518	5	24	localException	Exception
    //   537	26	24	str	String
    //   153	927	25	localObject2	Object
    //   401	60	26	localInteger	Integer
    //   415	94	27	localLong	Long
    // Exception table:
    //   from	to	target	type
    //   100	116	518	java/lang/Exception
    //   164	189	584	java/io/IOException
    //   642	667	804	java/io/IOException
    //   997	1019	1172	java/io/IOException
  }
  
  public final void a(bph parambph)
  {
    GMTrace.i(5267643170816L, 39247);
    if ((!com.tencent.mm.k.f.tL()) && (!cR(ab.getContext())))
    {
      w.i("MicroMsg.Voip.VoipService", "NotificationConfig.isNewVoipMsgNotification() is false and is not in foreground, now return.");
      if ((this.qIr == null) && (this.nmC.bQn()))
      {
        w.i("MicroMsg.Voip.VoipService", "voipGetRoomInfoResp is null and time is stopped.");
        this.qIr = parambph;
        this.nmC.z(2000L, 2000L);
        this.qIs = System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g.ork.a(500L, 4L, 1L, false);
      }
      GMTrace.o(5267643170816L, 39247);
      return;
    }
    String str = parambph.uYY;
    Object localObject1 = q.zE();
    int j = parambph.uYQ;
    w.i("MicroMsg.Voip.VoipService", "doTaskCallin self:%s talker:%s type:%d roomid:%d", new Object[] { localObject1, str, Integer.valueOf(j), Integer.valueOf(parambph.uhU) });
    if (this.qIe.btN())
    {
      n.a(parambph.uhU, parambph.uhV, 2, null, null, str);
      w.d("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because voip busy:roomid " + parambph.uhU);
      com.tencent.mm.plugin.report.service.g.ork.a(11525, true, true, new Object[] { Integer.valueOf(parambph.uhU), Long.valueOf(parambph.uhV), Integer.valueOf(parambph.uYQ), Integer.valueOf(2), Integer.valueOf(com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext())), Long.valueOf(System.currentTimeMillis()) });
      com.tencent.mm.plugin.report.service.g.ork.a(11526, true, true, new Object[] { Integer.valueOf(d.btG().qIe.qDX.qFr.mjF), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(7) });
      GMTrace.o(5267643170816L, 39247);
      return;
    }
    if (n.buV())
    {
      n.a(parambph.uhU, parambph.uhV, 3, null, null, str);
      w.e("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because telephone busy:roomid " + parambph.uhU);
      com.tencent.mm.plugin.report.service.g.ork.a(11525, true, true, new Object[] { Integer.valueOf(parambph.uhU), Long.valueOf(parambph.uhV), Integer.valueOf(parambph.uYQ), Integer.valueOf(3), Integer.valueOf(com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext())), Long.valueOf(System.currentTimeMillis()) });
      com.tencent.mm.plugin.report.service.g.ork.a(11526, true, true, new Object[] { Integer.valueOf(d.btG().qIe.qDX.qFr.mjF), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(7) });
      GMTrace.o(5267643170816L, 39247);
      return;
    }
    this.qIe.buW();
    localObject1 = this.qIe;
    int i;
    if (((n)localObject1).qDX.btN())
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to setInviteContent during calling, status =" + ((n)localObject1).qDX.mStatus);
      i = 0;
    }
    while (i == 0)
    {
      w.e("MicroMsg.Voip.VoipService", "doTaskCallin setInviteContent failed!");
      com.tencent.mm.plugin.report.service.g.ork.a(11525, true, true, new Object[] { Integer.valueOf(parambph.uhU), Long.valueOf(parambph.uhV), Integer.valueOf(parambph.uYQ), Integer.valueOf(5), Integer.valueOf(com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext())), Long.valueOf(System.currentTimeMillis()) });
      com.tencent.mm.plugin.report.service.g.ork.a(11526, true, true, new Object[] { Integer.valueOf(d.btG().qIe.qDX.qFr.mjF), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(7) });
      GMTrace.o(5267643170816L, 39247);
      return;
      if (parambph == null)
      {
        i = 0;
      }
      else
      {
        ((n)localObject1).qDX.qFr.qKT.qGp = parambph.uYQ;
        w.d("MicroMsg.Voip.VoipServiceEx", "iRoomType " + ((n)localObject1).qDX.qFr.qKT.qGp);
        if (((n)localObject1).qDX.qFr.ndo)
        {
          com.tencent.mm.plugin.voip.b.a.dX("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.tC() + "v2protocal already init.");
          ((n)localObject1).qDX.qFr.iB(false);
          ((n)localObject1).qDX.qFr.reset();
        }
        Object localObject2 = ((n)localObject1).qDX;
        ((e)localObject2).qFw = parambph;
        ((e)localObject2).qFr.mzB = ((e)localObject2).qFw.uYY;
        ((e)localObject2).qFr.mjF = ((e)localObject2).qFw.uhU;
        ((e)localObject2).qFr.mjG = ((e)localObject2).qFw.uhV;
        ((e)localObject2).qFr.mjN = 1;
        ((e)localObject2).qFr.qJp = 0;
        ((e)localObject2).mStatus = 3;
        if ((com.tencent.mm.plugin.voip.b.d.bvM()) || (com.tencent.mm.p.a.vq()) || (com.tencent.mm.plugin.voip.b.d.bvP()))
        {
          w.e("MicroMsg.Voip.VoipServiceEx", "setInviteContent, reject, pstn/multitak/f2f talking");
          if (com.tencent.mm.plugin.voip.b.d.bvM())
          {
            n.a(parambph.uhU, parambph.uhV, 2, null, null, parambph.uYY);
            i = 0;
          }
          else
          {
            ((n)localObject1).buY();
            if (parambph.uYQ == 0)
            {
              i = 1;
              label1068:
              localObject2 = parambph.uYY;
              if (i == 0) {
                break label1111;
              }
            }
            label1111:
            for (localObject1 = au.vBm;; localObject1 = au.vBl)
            {
              l.a((String)localObject2, (String)localObject1, 0, 6, ab.getContext().getString(R.l.ehB));
              break;
              i = 0;
              break label1068;
            }
          }
        }
        else if (((n)localObject1).qDX.qFr.brY() < 0)
        {
          com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to init v2protocol.");
          i = 0;
        }
        else
        {
          com.tencent.mm.plugin.report.service.g.ork.a(11524, true, true, new Object[] { Integer.valueOf(parambph.uhU), Long.valueOf(parambph.uhV), Integer.valueOf(parambph.uYQ), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
          ((n)localObject1).qDX.qFs.bup();
          i = 1;
        }
      }
    }
    localObject1 = ab.getContext();
    at.AR();
    if (c.yK().TE(str) == null)
    {
      n.a(parambph.uhU, parambph.uhV, 4, null, null, str);
      w.d("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because talker nil:roomid " + parambph.uhU);
      com.tencent.mm.plugin.report.service.g.ork.a(11525, true, true, new Object[] { Integer.valueOf(parambph.uhU), Long.valueOf(parambph.uhV), Integer.valueOf(parambph.uYQ), Integer.valueOf(4), Integer.valueOf(com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext())), Long.valueOf(System.currentTimeMillis()) });
      com.tencent.mm.plugin.report.service.g.ork.a(11526, true, true, new Object[] { Integer.valueOf(d.btG().qIe.qDX.qFr.mjF), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(7) });
      GMTrace.o(5267643170816L, 39247);
      return;
    }
    if ((1 == j) || (j == 0)) {
      if (j != 0) {
        break label1655;
      }
    }
    label1655:
    for (boolean bool = true;; bool = false)
    {
      a((Context)localObject1, str, false, bool, true);
      if (this.qIe != null)
      {
        localObject1 = this.qIe;
        ((n)localObject1).qIz = parambph.uhU;
        if (!((n)localObject1).qIK.bQn()) {
          ((n)localObject1).qIK.stopTimer();
        }
        ((n)localObject1).qIK.z(70000L, 70000L);
      }
      w.d("MicroMsg.Voip.VoipService", "doTaskCallin invite startActivity VideoActivity");
      n.a(parambph.uhU, parambph.uhV, 1, this.qIe.qDX.qFr.field_peerId, this.qIe.qDX.qFr.field_capInfo, str);
      com.tencent.mm.plugin.report.service.g.ork.a(11525, true, true, new Object[] { Integer.valueOf(parambph.uhU), Long.valueOf(parambph.uhV), Integer.valueOf(parambph.uYQ), Integer.valueOf(1), Integer.valueOf(com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext())), Long.valueOf(System.currentTimeMillis()) });
      GMTrace.o(5267643170816L, 39247);
      return;
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    GMTrace.i(5266837864448L, 39241);
    w.i("MicroMsg.Voip.VoipService", "setCalling " + paramBoolean1 + "  videoCall " + paramBoolean2);
    this.ewE = paramBoolean1;
    if (paramBoolean2)
    {
      this.qIg = paramBoolean1;
      this.qIe.qDX.qFr.qJB = 0;
    }
    for (;;)
    {
      this.eDs = paramString;
      GMTrace.o(5266837864448L, 39241);
      return;
      this.qIe.qDX.qFr.qJB = 1;
      this.qIh = paramBoolean1;
    }
  }
  
  public final void aC(Context paramContext, String paramString)
  {
    GMTrace.i(5267106299904L, 39243);
    w.i("MicroMsg.Voip.VoipService", "startVoiceCall, toUser:" + paramString);
    if ((bg.nm(paramString)) || (System.currentTimeMillis() - this.qIi < 2000L))
    {
      GMTrace.o(5267106299904L, 39243);
      return;
    }
    if (System.currentTimeMillis() - this.qIl < this.qIm)
    {
      w.i("MicroMsg.Voip.VoipService", "fail! cuz overloadInterval fail!");
      com.tencent.mm.ui.base.h.a(paramContext, R.l.eiW, R.l.ejq, null);
      GMTrace.o(5267106299904L, 39243);
      return;
    }
    this.qIi = System.currentTimeMillis();
    at.AR();
    if (c.yK().TE(paramString) == null)
    {
      GMTrace.o(5267106299904L, 39243);
      return;
    }
    a(paramContext, paramString, true, false, false);
    buI();
    GMTrace.o(5267106299904L, 39243);
  }
  
  public final void aD(Context paramContext, String paramString)
  {
    GMTrace.i(5267240517632L, 39244);
    w.i("MicroMsg.Voip.VoipService", "startVideoCall, toUser:" + paramString);
    if ((bg.nm(paramString)) || (System.currentTimeMillis() - this.qIi < 2000L))
    {
      GMTrace.o(5267240517632L, 39244);
      return;
    }
    if (System.currentTimeMillis() - this.qIl < this.qIm)
    {
      w.i("MicroMsg.Voip.VoipService", "fail! cuz overloadInterval fail!");
      com.tencent.mm.ui.base.h.a(paramContext, R.l.eiW, R.l.ejq, null);
      GMTrace.o(5267240517632L, 39244);
      return;
    }
    this.qIi = System.currentTimeMillis();
    at.AR();
    if (c.yK().TE(paramString) == null)
    {
      GMTrace.o(5267240517632L, 39244);
      return;
    }
    a(paramContext, paramString, true, true, false);
    buI();
    GMTrace.o(5267240517632L, 39244);
  }
  
  public final int btE()
  {
    GMTrace.i(5269790654464L, 39263);
    g localg = this.qIe.qDX.qFt;
    if (localg.qFL != null)
    {
      int i = localg.qFL.btE();
      GMTrace.o(5269790654464L, 39263);
      return i;
    }
    GMTrace.o(5269790654464L, 39263);
    return 0;
  }
  
  public final int buJ()
  {
    GMTrace.i(5268851130368L, 39256);
    n localn = this.qIe;
    w.i("MicroMsg.Voip.VoipServiceEx", "hangUp");
    if (localn.qDX.qFr.mjF == 0)
    {
      localn.qDX.qFt.btZ();
      localn.reset();
      GMTrace.o(5268851130368L, 39256);
      return 0;
    }
    localn.qDX.qFr.qKT.qGe = localn.qDX.btL();
    int i = localn.buZ();
    GMTrace.o(5268851130368L, 39256);
    return i;
  }
  
  public final int buK()
  {
    GMTrace.i(15363634888704L, 114468);
    int i = this.qIe.qDX.qFr.mjF;
    GMTrace.o(15363634888704L, 114468);
    return i;
  }
  
  public final long buL()
  {
    GMTrace.i(5269253783552L, 39259);
    long l = this.qIe.qDX.qFr.mjG;
    GMTrace.o(5269253783552L, 39259);
    return l;
  }
  
  public final long buM()
  {
    GMTrace.i(5269388001280L, 39260);
    long l = this.qIe.qDX.qFr.qJB;
    GMTrace.o(5269388001280L, 39260);
    return l;
  }
  
  public final boolean buN()
  {
    GMTrace.i(5269522219008L, 39261);
    boolean bool = this.qIe.qDX.btS();
    GMTrace.o(5269522219008L, 39261);
    return bool;
  }
  
  public final boolean buO()
  {
    GMTrace.i(5269656436736L, 39262);
    boolean bool = this.qIe.qDX.btT();
    GMTrace.o(5269656436736L, 39262);
    return bool;
  }
  
  public final void buP()
  {
    GMTrace.i(5270059089920L, 39265);
    w.d("MicroMsg.Voip.VoipService", "devin: setCallResult: %d", new Object[] { Integer.valueOf(1) });
    this.qIe.qDX.qFr.qKT.qGq = 1;
    GMTrace.o(5270059089920L, 39265);
  }
  
  public final boolean buQ()
  {
    GMTrace.i(5271267049472L, 39274);
    n localn = this.qIe;
    if (localn.qIy != null)
    {
      boolean bool = localn.qIy.bwb();
      GMTrace.o(5271267049472L, 39274);
      return bool;
    }
    GMTrace.o(5271267049472L, 39274);
    return true;
  }
  
  public final void buT()
  {
    GMTrace.i(16563944030208L, 123411);
    this.qIe.qII.z(1000L, 1000L);
    GMTrace.o(16563944030208L, 123411);
  }
  
  public final void jdMethod_do(int paramInt1, int paramInt2)
  {
    GMTrace.i(5270864396288L, 39271);
    n localn = this.qIe;
    if ((localn.qIy != null) && (paramInt1 > 0)) {
      localn.qIy.d(paramInt1, false, paramInt2);
    }
    GMTrace.o(5270864396288L, 39271);
  }
  
  protected final void finalize()
  {
    GMTrace.i(5266703646720L, 39240);
    this.qIe.stop();
    this.qIe = null;
    at.b(this.ovf);
    super.finalize();
    GMTrace.o(5266703646720L, 39240);
  }
  
  public final boolean it(boolean paramBoolean)
  {
    GMTrace.i(5270327525376L, 39267);
    g localg = this.qIe.qDX.qFt;
    if (localg.qFL != null)
    {
      paramBoolean = localg.qFL.it(paramBoolean);
      GMTrace.o(5270327525376L, 39267);
      return paramBoolean;
    }
    GMTrace.o(5270327525376L, 39267);
    return false;
  }
  
  public final int iy(boolean paramBoolean)
  {
    GMTrace.i(5270461743104L, 39268);
    e locale = this.qIe.qDX;
    if (paramBoolean) {}
    for (int i = locale.qFr.qZ(412);; i = locale.qFr.qZ(413))
    {
      if (i < 0) {
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "voipContext tryMuteMicrophone ret:" + i);
      }
      GMTrace.o(5270461743104L, 39268);
      return i;
    }
  }
  
  public final int iz(boolean paramBoolean)
  {
    GMTrace.i(5270595960832L, 39269);
    e locale = this.qIe.qDX;
    if (paramBoolean) {}
    for (int i = locale.qFr.qZ(401);; i = locale.qFr.qZ(402))
    {
      if (i < 0) {
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipContext", "voipContext trySwitchSpeakerPhone ret:" + i);
      }
      GMTrace.o(5270595960832L, 39269);
      return i;
    }
  }
  
  public final void k(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(5270730178560L, 39270);
    n localn = this.qIe;
    if ((localn.qIy != null) && (paramInt1 > 0)) {
      localn.qIy.m(paramInt1, paramInt2, paramBoolean);
    }
    GMTrace.o(5270730178560L, 39270);
  }
  
  public final void stopRing()
  {
    GMTrace.i(5271132831744L, 39273);
    n localn = this.qIe;
    if (localn.qIy != null) {
      localn.qIy.stop();
    }
    GMTrace.o(5271132831744L, 39273);
  }
  
  public final void v(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(5266972082176L, 39242);
    this.qIp = paramBoolean1;
    this.qIq = paramBoolean2;
    w.d("MicroMsg.Voip.VoipService", "isMinimize: %b, miniOnlyHideVoip: %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    GMTrace.o(5266972082176L, 39242);
  }
  
  public final int w(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(5268716912640L, 39255);
    n localn = this.qIe;
    localn.bvb();
    if (!localn.qIK.bQn()) {
      localn.qIK.stopTimer();
    }
    h localh = localn.qDX.qFr.qKT;
    localh.qGL = System.currentTimeMillis();
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.VoipDailReport", "devin:acceptCallTime:" + localh.qGL);
    w.i("MicroMsg.Voip.VoipServiceEx", "accept onlyAudio:" + paramBoolean1);
    if (!localn.qDX.btM())
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to accept with calling, status =" + localn.qDX.mStatus);
      GMTrace.o(5268716912640L, 39255);
      return -1;
    }
    if (localn.qDX.qFr.mjF == 0)
    {
      com.tencent.mm.plugin.voip.b.a.dU("MicroMsg.Voip.VoipServiceEx", "Failed to accept with roomid = 0. ");
      GMTrace.o(5268716912640L, 39255);
      return -1;
    }
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.tC() + "accept invite, roomid:" + localn.qDX.qFr.mjF);
    localn.qIJ.z(50000L, 50000L);
    localn.qDX.qFr.qKT.bua();
    new com.tencent.mm.plugin.voip.model.a.b(1, localn.qDX.qFr.netType, localn.qDX.qFr.mjF, localn.qDX.qFr.field_peerId, localn.qDX.qFr.field_capInfo, localn.qDX.qFr.mjG, paramBoolean1, paramBoolean2).bvg();
    localn.qDX.dB(4);
    localn.qDX.qFt.qFN = 1;
    localn.qDX.eQN = true;
    GMTrace.o(5268716912640L, 39255);
    return 0;
  }
  
  public final void wg(int paramInt)
  {
    GMTrace.i(5268985348096L, 39257);
    this.qIe.qDX.wg(paramInt);
    GMTrace.o(5268985348096L, 39257);
  }
  
  public final void wq(int paramInt)
  {
    GMTrace.i(5267777388544L, 39248);
    if ((this.qIt == null) || (this.qIt.isEmpty()))
    {
      GMTrace.o(5267777388544L, 39248);
      return;
    }
    Iterator localIterator = this.qIt.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if ((locala != null) && (locala.qIv != null) && (locala.qIv.uhU == paramInt))
      {
        locala.qIw = true;
        GMTrace.o(5267777388544L, 39248);
        return;
      }
    }
    GMTrace.o(5267777388544L, 39248);
  }
  
  public final void wr(int paramInt)
  {
    GMTrace.i(5269924872192L, 39264);
    w.d("MicroMsg.Voip.VoipService", "devin: camera errcode: %d", new Object[] { Integer.valueOf(paramInt) });
    this.qIe.qDX.qFr.qJC = Math.abs(paramInt);
    GMTrace.o(5269924872192L, 39264);
  }
  
  public final void ws(int paramInt)
  {
    GMTrace.i(5270998614016L, 39272);
    n localn = this.qIe;
    if ((localn.qIy != null) && (paramInt > 0)) {
      localn.qIy.b(paramInt, false, 0, false);
    }
    GMTrace.o(5270998614016L, 39272);
  }
  
  public final void wt(int paramInt)
  {
    GMTrace.i(5272072355840L, 39280);
    e locale = this.qIe.qDX;
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "zhengxue: audio device occupied stat sync stat " + paramInt + " app 1");
    try
    {
      Object localObject = new byte[4];
      localObject[0] = ((byte)paramInt);
      locale.qFr.setJNIAppCmd(2, (byte[])localObject, 4);
      localObject = new boi();
      ((boi)localObject).uYw = paramInt;
      ((boi)localObject).uYx = 1;
      bmx localbmx = new bmx();
      localbmx.uWZ = 4;
      localbmx.uXa = new com.tencent.mm.bm.b(((boi)localObject).toByteArray(), 0, 1);
      locale.qFr.SendRUDP(localbmx.toByteArray(), localbmx.toByteArray().length);
      GMTrace.o(5272072355840L, 39280);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip.VoipContext", "onAudioDevOccupiedStat Error");
      GMTrace.o(5272072355840L, 39280);
    }
  }
  
  public final class a
  {
    bph qIv;
    boolean qIw;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */