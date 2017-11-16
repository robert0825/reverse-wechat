package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.b;
import com.tencent.mm.compatible.d.b.a;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.loader.d;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.protocal.c.bof;
import com.tencent.mm.protocal.c.bpo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.e;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class v2protocal
{
  public static final int nlR;
  public static final int qJk;
  public static boolean qJl;
  public static int qwP;
  public int channelStrategy;
  public int defaultHeight;
  public int defaultWidth;
  public int[] field_ChannelReportDial;
  public int[] field_EngineAudioReportStat;
  public int[] field_SpeedTestSvrParaArray;
  public int field_audioDuration;
  public byte[] field_capInfo;
  int field_channelReportLength;
  int field_channelStatLength;
  public int field_connectingStatusKey;
  int field_engine2ndReportLength;
  int field_engine2ndStatLength;
  int field_engineQosStatLength;
  int field_engineVersionStatLength;
  public int[] field_jbmBitratRsSvrParamArray;
  public double[] field_jbmBitratRsSvrParamDoubleArray;
  public int field_jbmParamArraySize;
  public int field_jbmParamDoubleArraySize;
  public int field_localImgHeight;
  public int field_localImgWidth;
  public int field_mGetValidSample;
  int field_netFlowRecv;
  int field_netFlowSent;
  int field_newEngineExtStatLength;
  int field_newEngineReportLength;
  int field_newEngineStatLength;
  public byte[] field_peerId;
  public int field_pstnChannelInfoLength;
  public int field_pstnEngineInfoLength;
  public int[] field_punchSvrArray;
  public int field_realLinkQualityInfoBuffLen;
  public int field_recvVideoLen;
  public int field_relayDataSyncKey;
  public int[] field_relaySvrArray;
  public int[] field_relayTcpSvrArray;
  public int field_remoteImgHeight;
  public int field_remoteImgLength;
  public int field_remoteImgOrien;
  public int field_remoteImgWidth;
  public int field_sendVideoLen;
  int field_speedTestInfoLength;
  int field_statInfoLength;
  public int field_statusSyncKey;
  public int field_videoDuration;
  public int field_voipcsChannelInfoLength;
  public int field_voipcsEngineInfoLength;
  public long gGZ;
  private ae handler;
  public int mjF;
  public long mjG;
  public int mjI;
  public int mjN;
  public String mzB;
  public boolean ndo;
  public int netType;
  public int qJA;
  public int qJB;
  public int qJC;
  public int qJD;
  public int qJE;
  public int qJF;
  public int qJG;
  public int qJH;
  public int qJI;
  public int qJJ;
  public int qJK;
  public int qJL;
  public int qJM;
  public int qJN;
  public int qJO;
  public int qJP;
  public int qJQ;
  public int qJR;
  public int qJS;
  public int qJT;
  public int qJU;
  public int qJV;
  public int qJW;
  public int qJX;
  public int qJY;
  public int qJZ;
  public int qJm;
  public int qJn;
  public int qJo;
  public int qJp;
  public long qJq;
  public byte[] qJr;
  public byte[] qJs;
  public byte[] qJt;
  public int qJu;
  public byte[] qJv;
  public int qJw;
  public int qJx;
  public int qJy;
  public int qJz;
  public byte[] qKA;
  public int qKB;
  public int qKC;
  public int qKD;
  public int qKE;
  public int qKF;
  byte[] qKG;
  byte[] qKH;
  byte[] qKI;
  byte[] qKJ;
  byte[] qKK;
  byte[] qKL;
  byte[] qKM;
  public byte[] qKN;
  public byte[] qKO;
  public byte[] qKP;
  public byte[] qKQ;
  public int[] qKR;
  int qKS;
  public h qKT;
  public int qKa;
  public int qKb;
  public int qKc;
  public int qKd;
  public int qKe;
  public int qKf;
  public int qKg;
  public int qKh;
  public int[] qKi;
  public int qKj;
  public int qKk;
  public int qKl;
  public int qKm;
  public byte[] qKn;
  public int qKo;
  public int qKp;
  public int qKq;
  public int qKr;
  public byte[] qKs;
  public int qKt;
  public byte[] qKu;
  public byte[] qKv;
  public int qKw;
  public int qKx;
  public int qKy;
  public long qKz;
  
  static
  {
    GMTrace.i(5310995496960L, 39570);
    int i = com.tencent.mm.compatible.d.l.sK();
    if ((i & 0x400) != 0)
    {
      d.u(ab.getContext(), "libvoipCodec_v7a.so");
      k.b("voipMain", v2protocal.class.getClassLoader());
      i = com.tencent.mm.compatible.d.l.sK();
      qwP = i;
      if ((i & 0x400) == 0) {
        break label121;
      }
    }
    label121:
    for (i = 16000;; i = 8000)
    {
      nlR = i;
      qJk = i / 1000 * 20 * 2;
      qJl = false;
      GMTrace.o(5310995496960L, 39570);
      return;
      if ((i & 0x200) != 0)
      {
        d.u(ab.getContext(), "libvoipCodec.so");
        break;
      }
      d.u(ab.getContext(), "libvoipCodec_v5.so");
      break;
    }
  }
  
  public v2protocal(ae paramae)
  {
    GMTrace.i(5309250666496L, 39557);
    this.gGZ = 0L;
    this.defaultWidth = 320;
    this.defaultHeight = 240;
    this.netType = 0;
    this.qJm = 0;
    this.qJn = 0;
    this.mzB = "";
    this.qJo = 0;
    this.qJp = 0;
    this.mjF = 0;
    this.qJq = 0L;
    this.mjN = 0;
    this.mjG = 0L;
    this.mjI = 0;
    this.qJr = null;
    this.qJs = null;
    this.qJt = null;
    this.qJu = 0;
    this.qJv = null;
    this.channelStrategy = 0;
    this.qJw = 500;
    this.qJx = 30;
    this.qJy = 999;
    this.qJz = 0;
    this.qJA = 20;
    this.qJB = 0;
    this.qJC = 0;
    this.qJD = 0;
    this.qJE = 0;
    this.qJF = 0;
    this.qJG = 65536;
    this.qJH = 0;
    this.qJI = 0;
    this.qJJ = 7;
    this.qJK = 3;
    this.qJL = 3;
    this.qJM = 0;
    this.qJN = 0;
    this.qJO = -1;
    this.qJP = -1;
    this.qJQ = 0;
    this.qJR = 0;
    this.qJS = 0;
    this.qJT = 0;
    this.qJU = 100;
    this.qJV = 300;
    this.qJW = 1;
    this.qJX = 1;
    this.qJY = 0;
    this.qJZ = 1;
    this.qKa = 0;
    this.qKb = 0;
    this.qKc = 0;
    this.qKd = 0;
    this.qKe = 0;
    this.qKf = 0;
    this.qKg = 0;
    this.qKh = 0;
    this.qKi = null;
    this.field_punchSvrArray = null;
    this.field_relaySvrArray = null;
    this.field_relayTcpSvrArray = null;
    this.field_peerId = null;
    this.field_capInfo = null;
    this.field_ChannelReportDial = null;
    this.field_EngineAudioReportStat = null;
    this.field_SpeedTestSvrParaArray = null;
    this.field_mGetValidSample = 0;
    this.qKj = 0;
    this.qKk = 0;
    this.qKl = 0;
    this.qKm = 0;
    this.qKn = null;
    this.qKo = 0;
    this.qKp = 0;
    this.qKq = 0;
    this.qKr = 0;
    this.qKs = new byte['ל'];
    this.qKt = 0;
    this.qKu = null;
    this.qKv = null;
    this.qKw = 0;
    this.qKx = 0;
    this.qKy = 0;
    this.field_localImgWidth = 0;
    this.field_localImgHeight = 0;
    this.field_statusSyncKey = 0;
    this.field_relayDataSyncKey = 0;
    this.field_connectingStatusKey = 0;
    this.field_sendVideoLen = 100;
    this.field_realLinkQualityInfoBuffLen = 0;
    this.field_remoteImgLength = 0;
    this.field_remoteImgHeight = 0;
    this.field_remoteImgWidth = 0;
    this.field_remoteImgOrien = 0;
    this.field_recvVideoLen = 120;
    this.qKz = 0L;
    this.qKA = new byte[8];
    this.qKB = 0;
    this.qKC = 0;
    this.qKD = 0;
    this.qKE = 0;
    this.qKF = 0;
    this.qKG = new byte['က'];
    this.qKH = new byte['ࠀ'];
    this.qKI = new byte['ࠀ'];
    this.qKJ = new byte['က'];
    this.qKK = new byte['က'];
    this.qKL = new byte['ࠀ'];
    this.qKM = new byte['က'];
    this.qKN = new byte['ࠀ'];
    this.qKO = new byte['ࠀ'];
    this.qKP = new byte['ࠀ'];
    this.qKQ = new byte['ࠀ'];
    this.qKR = new int[30];
    this.field_statInfoLength = 0;
    this.field_speedTestInfoLength = 0;
    this.field_engineVersionStatLength = 0;
    this.field_engineQosStatLength = 0;
    this.field_channelStatLength = 0;
    this.field_channelReportLength = 0;
    this.field_newEngineStatLength = 0;
    this.field_newEngineReportLength = 0;
    this.field_netFlowSent = 0;
    this.field_netFlowRecv = 0;
    this.field_videoDuration = 0;
    this.field_audioDuration = 0;
    this.field_newEngineExtStatLength = 0;
    this.field_engine2ndStatLength = 0;
    this.field_engine2ndReportLength = 0;
    this.field_pstnChannelInfoLength = 0;
    this.field_pstnEngineInfoLength = 0;
    this.field_voipcsChannelInfoLength = 0;
    this.field_voipcsEngineInfoLength = 0;
    this.field_jbmBitratRsSvrParamArray = null;
    this.field_jbmParamArraySize = 0;
    this.field_jbmBitratRsSvrParamDoubleArray = null;
    this.field_jbmParamDoubleArraySize = 0;
    this.qKS = 0;
    this.qKT = new h();
    this.handler = null;
    this.ndo = false;
    this.handler = paramae;
    GMTrace.o(5309250666496L, 39557);
  }
  
  public static long aK(byte[] paramArrayOfByte)
  {
    GMTrace.i(5308445360128L, 39551);
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.order(ByteOrder.nativeOrder());
    long l = paramArrayOfByte.getLong();
    GMTrace.o(5308445360128L, 39551);
    return l;
  }
  
  public static String bvj()
  {
    GMTrace.i(5308311142400L, 39550);
    Object localObject2 = Build.MANUFACTURER;
    Object localObject1 = localObject2;
    if (((String)localObject2).contains(",")) {
      localObject1 = ((String)localObject2).replace(',', ' ');
    }
    Object localObject3 = Build.MODEL;
    localObject2 = localObject3;
    if (((String)localObject3).contains(",")) {
      localObject2 = ((String)localObject3).replace(',', ' ');
    }
    Object localObject4 = Build.VERSION.SDK;
    localObject3 = localObject4;
    if (((String)localObject4).contains(",")) {
      localObject3 = ((String)localObject4).replace(',', ' ');
    }
    String str = Build.VERSION.RELEASE;
    localObject4 = str;
    if (str.contains(",")) {
      localObject4 = ((String)localObject3).replace(',', ' ');
    }
    localObject1 = "," + (String)localObject1 + "," + (String)localObject2 + "," + (String)localObject3 + "," + (String)localObject4;
    GMTrace.o(5308311142400L, 39550);
    return (String)localObject1;
  }
  
  private String bvk()
  {
    GMTrace.i(5308579577856L, 39552);
    String str = "," + this.channelStrategy;
    GMTrace.o(5308579577856L, 39552);
    return str;
  }
  
  private String bvm()
  {
    GMTrace.i(5308848013312L, 39554);
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "usePreConnect:" + this.qJS);
    String str = "," + this.qJS;
    GMTrace.o(5308848013312L, 39554);
    return str;
  }
  
  private String bvn()
  {
    GMTrace.i(5308982231040L, 39555);
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "preConnectSuccess:" + this.qJT);
    String str = "," + this.qJT;
    GMTrace.o(5308982231040L, 39555);
    return str;
  }
  
  public static String bvp()
  {
    GMTrace.i(5310190190592L, 39564);
    GMTrace.o(5310190190592L, 39564);
    return "\000";
  }
  
  private native int forceredirect(int paramInt1, int paramInt2);
  
  private native int setsvraddr(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2);
  
  private native int uninit(int paramInt1, long paramLong, int paramInt2);
  
  public native int SendDTMF(int paramInt);
  
  public native int SendRUDP(byte[] paramArrayOfByte, int paramInt);
  
  public native int SetDTMFPayload(int paramInt);
  
  public native int StartSpeedTest(long paramLong, int paramInt);
  
  public native int StopSpeedTest();
  
  public final int a(bof parambof1, bof parambof2, bof parambof3, int paramInt1, int paramInt2)
  {
    GMTrace.i(5309653319680L, 39560);
    if ((parambof1 != null) && (parambof1.uYd > 0))
    {
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "forceRedirect: got relay svr addr from server");
      this.field_relaySvrArray = com.tencent.mm.plugin.voip.b.a.a(parambof1);
      if ((parambof2 == null) || (parambof2.uYd <= 0)) {
        break label151;
      }
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "forceRedirect: got punch svr addr from server");
      this.field_punchSvrArray = com.tencent.mm.plugin.voip.b.a.a(parambof2);
      label65:
      if ((parambof3 == null) || (parambof3.uYd <= 0)) {
        break label163;
      }
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "forceRedirect: got relay tcp svr addr from server");
      this.field_relayTcpSvrArray = com.tencent.mm.plugin.voip.b.a.a(parambof3);
    }
    for (;;)
    {
      paramInt1 = forceredirect(paramInt1, paramInt2);
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "v2protocal forceRedirect ret :" + paramInt1);
      GMTrace.o(5309653319680L, 39560);
      return paramInt1;
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "forceRedirect: [TRANSPORT]No relay svr ip");
      break;
      label151:
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "forceRedirect: No punch svr ip");
      break label65;
      label163:
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "forceRedirect: No relay tcp svr ip");
    }
  }
  
  public final int a(bof parambof1, bof parambof2, bof parambof3, bpo parambpo)
  {
    GMTrace.i(19596727812096L, 146007);
    if (parambof1.uYd > 0)
    {
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "setSvrAddr: got relay svr addr from server");
      this.field_relaySvrArray = com.tencent.mm.plugin.voip.b.a.a(parambof1);
      if (parambof2.uYd <= 0) {
        break label160;
      }
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "setSvrAddr: got punch svr addr from server");
      this.field_punchSvrArray = com.tencent.mm.plugin.voip.b.a.a(parambof2);
      label57:
      if (parambof3.uYd <= 0) {
        break label172;
      }
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "setSvrAddr:got tcpsvr addr from server");
      this.field_relayTcpSvrArray = com.tencent.mm.plugin.voip.b.a.a(parambof3);
    }
    for (;;)
    {
      int i = setsvraddr(parambpo.uZI, parambpo.uZJ, parambpo.uZK, parambpo.userName, parambpo.lnX);
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "v2protocal setsvraddr ret :" + i);
      GMTrace.o(19596727812096L, 146007);
      return i;
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "setSvrAddr: [TRANSPORT]No relay svr ip");
      break;
      label160:
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "setSvrAddr: No punch svr ip");
      break label57;
      label172:
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "setSvrAddr:no tcp svr addr ip");
    }
  }
  
  public native int app2EngineDataEx(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4);
  
  public native int app2EngineLinkQualityEx(int paramInt, byte[] paramArrayOfByte);
  
  public final int brY()
  {
    GMTrace.i(5309921755136L, 39562);
    this.netType = com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext());
    this.qJo = this.netType;
    if (this.netType == 5) {
      this.netType = 4;
    }
    boolean bool1;
    boolean bool2;
    label93:
    boolean bool3;
    label165:
    boolean bool4;
    label238:
    boolean bool5;
    label250:
    label289:
    label470:
    int n;
    int m;
    int i1;
    int i2;
    int k;
    label527:
    int j;
    if ((this.qJo >= 4) && ((qwP & 0x400) != 0) && ((qwP & 0xFF) >= 26))
    {
      bool1 = true;
      if ((!bool1) || ((qwP & 0xFF) < 30)) {
        break label749;
      }
      bool2 = true;
      if ((p.fQC.fPb <= 0) || (p.fQC.fOE.width < 480) || (p.fQC.fOE.height < 360) || (p.fQC.fOG.width < 480) || (p.fQC.fOG.height < 360)) {
        break label755;
      }
      bool3 = true;
      if ((p.fQC.fPb < 2) || (p.fQC.fOE.width < 640) || (p.fQC.fOE.height < 480) || (p.fQC.fOG.width < 640) || (p.fQC.fOG.height < 480)) {
        break label761;
      }
      bool4 = true;
      if (p.fQC.fPb != 0) {
        break label767;
      }
      bool5 = true;
      Object localObject = p.fQC;
      if (((bool1) || (bool3)) && (!bool5))
      {
        if (!bool4) {
          break label773;
        }
        this.defaultWidth = 640;
        this.defaultHeight = 480;
        qJl = true;
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "steve:Set Enable 480! " + this.defaultWidth + "x" + this.defaultHeight);
      }
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "steve: Android CPUFlag:" + (qwP & 0xFF) + ", 480x360 Enc flags: bEnable480FromLocal:" + bool1 + ", bEnable480FromSvr:" + bool3 + ", bDisable480FromSvr:" + bool5 + ", bEnable640FromLocal:" + bool2 + ", bEnable640FromSvr:" + bool4);
      this.qKi = new int[this.defaultWidth * this.defaultHeight];
      at.AR();
      this.qJn = c.ww();
      if ((qwP & 0x400) == 0) {
        break label790;
      }
      d.u(ab.getContext(), "libvoipCodec_v7a.so");
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v7a.so... ");
      n = Build.VERSION.SDK_INT;
      m = OpenGlRender.bvY();
      localObject = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
      i1 = ((Display)localObject).getWidth();
      i2 = ((Display)localObject).getHeight();
      if ((p.fQC.fPc & 0x10) == 0) {
        break label842;
      }
      k = 1;
      if ((p.fQC.fPc & 0x20) == 0) {
        break label847;
      }
      j = 1;
      label541:
      if ((p.fQC.fPc & 0xF) == 0) {
        break label852;
      }
      i = 1;
      label555:
      if (i == 0) {
        break label860;
      }
    }
    label749:
    label755:
    label761:
    label767:
    label773:
    label790:
    label842:
    label847:
    label852:
    label860:
    for (int i = 1;; i = 0)
    {
      if (k != 0) {
        i |= 0x2;
      }
      for (;;)
      {
        k = i;
        if (j != 0) {
          k = i | 0x4;
        }
        i = this.netType;
        j = this.defaultWidth;
        i = init(i | k << 8, 2, this.defaultHeight | j << 16, i1 << 16 | i2, this.qJn, qwP | m << 24 | n << 16, com.tencent.mm.compatible.util.e.ghu + "app_lib/", 0);
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "protocal init ret :" + i + ",uin= " + this.qJn + ", gl_vs:" + m + ", cpuFlag0=" + qwP);
        this.ndo = true;
        if (i < 0) {
          reset();
        }
        GMTrace.o(5309921755136L, 39562);
        return i;
        bool1 = false;
        break;
        bool2 = false;
        break label93;
        bool3 = false;
        break label165;
        bool4 = false;
        break label238;
        bool5 = false;
        break label250;
        this.defaultWidth = 480;
        this.defaultHeight = 360;
        break label289;
        if ((qwP & 0x200) != 0)
        {
          d.u(ab.getContext(), "libvoipCodec.so");
          com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec.so... ");
          break label470;
        }
        d.u(ab.getContext(), "libvoipCodec_v5.so");
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v5.so... ");
        break label470;
        k = 0;
        break label527;
        j = 0;
        break label541;
        i = 0;
        break label555;
      }
    }
  }
  
  public final String bvl()
  {
    GMTrace.i(5308713795584L, 39553);
    if (this.field_videoDuration == 0)
    {
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "captureFrames:" + this.qKB + ", videoduration: 0");
      GMTrace.o(5308713795584L, 39553);
      return ",0";
    }
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "capturefps:" + this.qKB / this.field_videoDuration + " framecount:" + this.qKB + " videoDuration:" + this.field_videoDuration);
    String str = "," + this.qKB / this.field_videoDuration;
    GMTrace.o(5308713795584L, 39553);
    return str;
  }
  
  public final String bvo()
  {
    GMTrace.i(5309116448768L, 39556);
    if (Build.VERSION.SDK_INT < 11)
    {
      this.qJK = 0;
      this.qJL = 2;
      if (p.fQD.fNO >= 0) {
        this.qJK = p.fQD.fNO;
      }
      if ((Build.VERSION.SDK_INT >= 11) && (com.tencent.mm.compatible.util.l.rG()) && (2 == p.fQL.fPx)) {
        this.qJL = 2;
      }
      if (p.fQD.fNP >= 0) {
        this.qJL = p.fQD.fNP;
      }
      if (Build.VERSION.SDK_INT >= 11) {
        break label294;
      }
      this.qJJ = 1;
      label107:
      if (p.fQD.fNp) {
        this.qJJ = 1;
      }
      if (p.fQD.fNN >= 0) {
        this.qJJ = p.fQD.fNN;
      }
      if (p.fQD.fNq <= 0) {
        break label303;
      }
      this.qJM = 3;
      this.qJN = 0;
    }
    for (;;)
    {
      if (p.fQD.fNR >= 0) {
        this.qJM = p.fQD.fNR;
      }
      if (p.fQD.fNS >= 0) {
        this.qJN = p.fQD.fNS;
      }
      String str = "," + this.qJK + "," + this.qJL + "," + this.qJJ + "," + this.qJM + "," + this.qJN;
      GMTrace.o(5309116448768L, 39556);
      return str;
      this.qJK = 3;
      this.qJL = 3;
      break;
      label294:
      this.qJJ = 7;
      break label107;
      label303:
      if (p.fQD.fNQ >= 0)
      {
        this.qJM = p.fQD.fNQ;
        this.qJN = p.fQD.fNQ;
      }
    }
  }
  
  public final String bvq()
  {
    long l3 = 0L;
    GMTrace.i(5310324408320L, 39565);
    if ((this.qJC == 0) && (this.qJD == 0))
    {
      this.qKT.qGv = 0;
      this.qKT.qGD = com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext());
      this.qKT.qGC = this.field_videoDuration;
      this.qKT.qGB = this.field_audioDuration;
      this.qJH = at.AS().ss();
      if ((this.qKT.qGL <= 0L) || (this.qKT.qGF <= this.qKT.qGL)) {
        break label1147;
      }
    }
    label1147:
    for (long l1 = this.qKT.qGF - this.qKT.qGL;; l1 = 0L)
    {
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "voipreport:acceptcalltime:" + l1);
      setJNIAppCmd(1, this.qKA, this.qKA.length);
      long l4 = aK(this.qKA);
      Object localObject1 = this.qKT;
      if ((l4 > this.qKT.qGJ) && (this.qKT.qGJ > 0L)) {}
      for (long l2 = l4 - this.qKT.qGJ;; l2 = 0L)
      {
        ((h)localObject1).qGM = l2;
        localObject1 = this.qKT;
        l2 = l3;
        if (l4 > this.qKT.qGL)
        {
          l2 = l3;
          if (this.qKT.qGL > 0L) {
            l2 = l4 - this.qKT.qGL;
          }
        }
        ((h)localObject1).qGN = l2;
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "voipreport:lCallerWaitTime:" + this.qKT.qGM + " lCalledWaitTime:" + this.qKT.qGN);
        int i = qwP;
        StringBuilder localStringBuilder = new StringBuilder().append(this.qJB).append(",").append(this.mjF).append(",").append(this.mjG).append(",").append(this.mjN).append(",").append(this.qKT.qGe).append(",").append(this.qKT.qGq).append(",").append(this.qKT.qGr).append(",").append(this.qKT.qGs).append(",").append(this.qKT.qGt).append(",").append(this.qKT.qGu).append(",").append(this.qKT.qGv).append(",").append(this.qKT.qGo).append(",").append(this.qKT.qGw).append(",").append(this.qKT.qGx).append(",").append(this.qKT.qGy).append(",").append(this.qKT.qGz).append(",").append(this.qKT.qGA).append(",").append(this.qKT.qGB).append(",").append(this.qKT.qGC).append(",").append(this.qKT.qGD).append(bvm()).append(bvn()).append(bvj()).append(",").append(this.qKT.qGE).append(",").append(this.qJG).append(",").append(this.qJH).append(",").append(l1).append(",").append(this.qKT.qGM).append(",").append(this.qKT.qGN).append(",").append(this.qJI).append(",").append(this.qJo).append(bvk()).append(",").append(i & 0xFF).append(",").append(this.qJO).append(",").append(this.qJP);
        Object localObject2 = Build.VERSION.INCREMENTAL;
        localObject1 = localObject2;
        if (((String)localObject2).contains(",")) {
          localObject1 = ((String)localObject2).replace(',', ' ');
        }
        String str = Build.DISPLAY;
        localObject2 = str;
        if (str.contains(",")) {
          localObject2 = str.replace(',', ' ');
        }
        localObject1 = new StringBuilder(",").append((String)localObject1).append(",").append((String)localObject2).toString() + "," + this.qKT.qGG + "," + this.qKT.qGI + "," + this.qKT.qGH;
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:initNetType:" + this.qJo);
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:NewDialStatString:" + (String)localObject1);
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:getChannelStrategyString:" + bvk());
        GMTrace.o(5310324408320L, 39565);
        return (String)localObject1;
        if ((this.qJD != 0) && (this.qJC != 0))
        {
          this.qKT.qGv = 3;
          break;
        }
        if (this.qJD != 0)
        {
          this.qKT.qGv = 1;
          break;
        }
        if (this.qJC == 0) {
          break;
        }
        this.qKT.qGv = 2;
        break;
      }
    }
  }
  
  public final String bvr()
  {
    GMTrace.i(5310458626048L, 39566);
    getChannelInfo(this.qKJ, this.qKJ.length, this.qKj, this.qKk, this.qKl, this.qKm);
    Object localObject = new StringBuilder().append(this.mjG).append(",").append(this.mjF).append(",").append(this.mjN).append(this.qKT.buc());
    h localh = this.qKT;
    localObject = new StringBuilder(",").append(localh.qGu).toString() + new String(this.qKJ, 0, this.field_channelStatLength);
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:oldChannelString: " + (String)localObject);
    getChannelReport(this.qKJ, this.qKJ.length);
    localObject = new String(this.qKJ, 0, this.field_channelReportLength);
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:newChannelString: " + (String)localObject);
    GMTrace.o(5310458626048L, 39566);
    return (String)localObject;
  }
  
  public final String bvs()
  {
    GMTrace.i(5310592843776L, 39567);
    getNewEngineInfo(this.qKK, this.qKK.length);
    getNewEngineExtInfo(this.qKL, this.qKL.length);
    String str = this.mjN + "," + this.mjG + this.qKT.buc() + "," + this.qJC + "," + this.qJD + bvl() + new String(this.qKK, 0, this.field_newEngineStatLength) + "," + this.qJE + "," + this.qJF + bvo() + new String(this.qKL, 0, this.field_newEngineExtStatLength);
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:oldNewEngineString:" + str);
    getNewEngineInfoReport(this.qKK, this.qKK.length);
    str = this.mjN + "," + this.mjG + this.qKT.buc() + "," + this.qJC + "," + this.qJD + bvl() + new String(this.qKK, 0, this.field_newEngineReportLength);
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:yaoyaoguoNewEngineString:" + str);
    GMTrace.o(5310592843776L, 39567);
    return str;
  }
  
  public final String bvt()
  {
    GMTrace.i(5310727061504L, 39568);
    getEngine2ndInfo(this.qKM, this.qKM.length);
    String str = this.mjG + "," + this.mjF + "," + this.mjN + new String(this.qKM, 0, this.field_engine2ndStatLength);
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:12805,oldEngine2ndString:" + str);
    getEngine2ndInfoReport(this.qKM, this.qKM.length);
    str = this.mjG + "," + this.mjF + "," + this.mjN + new String(this.qKM, 0, this.field_engine2ndReportLength);
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:12805,newEngine2ndString:" + str);
    GMTrace.o(5310727061504L, 39568);
    return str;
  }
  
  public native int doubleLinkSwitch(int paramInt);
  
  public native int exchangeCabInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int freeJNIReport();
  
  public native int getAVDuration(byte[] paramArrayOfByte, int paramInt);
  
  public native int getChannelInfo(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public native int getChannelReport(byte[] paramArrayOfByte, int paramInt);
  
  public native int getCurrentConnType();
  
  public native int getEngine2ndInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getEngine2ndInfoReport(byte[] paramArrayOfByte, int paramInt);
  
  public native int getEngineQosInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getEngineVersionInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getNewEngineExtInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getNewEngineInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getNewEngineInfoReport(byte[] paramArrayOfByte, int paramInt);
  
  public native int getPstnChannelInfo(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public native int getPstnEngineInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getStatInfo(byte[] paramArrayOfByte, int paramInt1, int[] paramArrayOfInt, int paramInt2);
  
  public native int getVoipcsChannelInfo(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public native int getVoipcsEngineInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getcurstrategy();
  
  public native int handleCommand(byte[] paramArrayOfByte, int paramInt);
  
  public final String iB(boolean paramBoolean)
  {
    GMTrace.i(5310055972864L, 39563);
    if (this.ndo)
    {
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "call protocalUninit now...needStatInfo=" + paramBoolean);
      this.field_ChannelReportDial = new int[6];
      this.field_ChannelReportDial[0] = this.qKT.qGo;
      this.field_ChannelReportDial[1] = this.qKT.qGu;
      this.field_ChannelReportDial[2] = this.qKj;
      this.field_ChannelReportDial[3] = this.qKk;
      this.field_ChannelReportDial[4] = this.qKl;
      this.field_ChannelReportDial[5] = this.qKm;
      this.field_EngineAudioReportStat = new int[8];
      bvo();
      this.field_EngineAudioReportStat[0] = this.qJE;
      this.field_EngineAudioReportStat[1] = this.qJF;
      this.field_EngineAudioReportStat[2] = this.qJK;
      this.field_EngineAudioReportStat[3] = this.qJL;
      this.field_EngineAudioReportStat[4] = this.qJJ;
      this.field_EngineAudioReportStat[5] = this.qJM;
      this.field_EngineAudioReportStat[6] = this.qJN;
      this.field_EngineAudioReportStat[7] = -1;
      this.ndo = false;
      uninit(this.mjF, this.mjG, this.mjN);
      qJl = false;
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "uninit over.");
      if (paramBoolean)
      {
        getStatInfo(this.qKG, this.qKG.length, this.qKR, 30);
        getEngineVersionInfo(this.qKH, this.qKH.length);
        getEngineQosInfo(this.qKI, this.qKI.length);
        Object localObject1 = new StringBuilder();
        long l = this.qJn;
        if (this.qJn < 0) {
          l = this.qJn + 4294967296L;
        }
        Object localObject2 = new StringBuilder().append(l).append(",").append(this.mjG).append(",").append(this.mjF).append(",").append(this.mjN).append(",");
        h localh = this.qKT;
        localObject2 = new StringBuilder().append(localh.qGe).append(",").append(localh.qGf).append(",").append(localh.qGg).append(",").append(localh.qGh).append(",").append(localh.qGi).append(",").append(localh.qGj).append(",").append(localh.qGk).append(",").append(localh.qGl).append(",").append(localh.qGm).append(",").append(localh.qGn).append(",").append(localh.qGo).toString();
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:DailStatString:" + (String)localObject2);
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(new String(this.qKG, 0, this.field_statInfoLength)).append(bvj()).append(bvk());
        localObject2 = this.qKT;
        localObject1 = ((StringBuilder)localObject1).append("," + ((h)localObject2).qGp).append(new String(this.qKH, 0, this.field_engineVersionStatLength)).append(bvl());
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "cpuCapacity:" + qwP);
        localObject1 = new StringBuilder(",").append(qwP).toString() + bvm() + bvn() + new String(this.qKI, 0, this.field_engineQosStatLength);
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "statInfoBuffer = " + new String(this.qKG, 0, this.field_statInfoLength));
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "engineVersionInfoBuffer = " + new String(this.qKH, 0, this.field_engineVersionStatLength));
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "engineQosInfoBuffer = " + new String(this.qKI, 0, this.field_engineQosStatLength));
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:StatString = " + (String)localObject1);
        ak.a.gmY.aI(this.field_netFlowRecv, this.field_netFlowSent);
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "voip net flow = " + (this.field_netFlowSent + this.field_netFlowRecv));
        GMTrace.o(5310055972864L, 39563);
        return (String)localObject1;
      }
    }
    GMTrace.o(5310055972864L, 39563);
    return "";
  }
  
  public native int init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString, int paramInt7);
  
  public native int isDCReady();
  
  public native int isDCSameLan();
  
  public native int isRelayConnReady();
  
  public int keep_onNotifyFromJni(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    GMTrace.i(5309384884224L, 39558);
    if (paramInt1 == 100)
    {
      com.tencent.mm.plugin.voip.b.a.a(paramArrayOfByte, "MicroMsg.Voip", paramInt2);
      GMTrace.o(5309384884224L, 39558);
      return 0;
    }
    if (paramInt1 == 101)
    {
      com.tencent.mm.plugin.voip.b.a.a(paramArrayOfByte, "MicroMsg.v2Core", paramInt2);
      GMTrace.o(5309384884224L, 39558);
      return 0;
    }
    Message localMessage = new Message();
    localMessage.what = 59998;
    localMessage.arg1 = paramInt1;
    localMessage.arg2 = paramInt2;
    localMessage.obj = paramArrayOfByte;
    this.handler.sendMessage(localMessage);
    GMTrace.o(5309384884224L, 39558);
    return 0;
  }
  
  public int keep_onNotifyFromJniInt(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    GMTrace.i(5309519101952L, 39559);
    if (paramArrayOfInt != null)
    {
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.VoipService", "callByJni : arg1:" + paramInt1 + " arg2:" + paramInt2);
      Message localMessage = new Message();
      localMessage.what = 59998;
      localMessage.arg1 = paramInt1;
      localMessage.arg2 = paramInt2;
      localMessage.obj = paramArrayOfInt;
      this.handler.sendMessage(localMessage);
    }
    GMTrace.o(5309519101952L, 39559);
    return 0;
  }
  
  public native int parseSyncKeyBuff(byte[] paramArrayOfByte, int paramInt);
  
  public native int playCallback(byte[] paramArrayOfByte, int paramInt);
  
  public final int qZ(int paramInt)
  {
    GMTrace.i(5305626787840L, 39530);
    paramInt = setAppCmd(paramInt, new byte[] { 0 }, 1);
    if (paramInt < 0) {
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "setAppCmd: type:" + paramInt + ":ret:" + paramInt);
    }
    GMTrace.o(5305626787840L, 39530);
    return paramInt;
  }
  
  public native int recordCallback(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public final void reset()
  {
    GMTrace.i(5310861279232L, 39569);
    com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "v2protocal reset!");
    this.field_punchSvrArray = null;
    this.field_relaySvrArray = null;
    this.field_relayTcpSvrArray = null;
    this.field_peerId = null;
    this.field_capInfo = null;
    this.mjF = 0;
    this.qJq = 0L;
    this.qJp = 0;
    this.mjN = 0;
    this.mjG = 0L;
    this.channelStrategy = 0;
    this.mjI = 0;
    this.gGZ = 0L;
    this.qJr = null;
    this.qJs = null;
    this.qJt = null;
    this.qJu = 0;
    this.qJv = null;
    this.qKm = 0;
    this.qKn = null;
    this.qKo = 0;
    this.qKp = 0;
    this.qKu = null;
    this.qKv = null;
    this.qKB = 0;
    this.qKC = 0;
    this.qKD = 0;
    this.qKE = 0;
    this.qKF = 0;
    this.field_videoDuration = 0;
    this.field_audioDuration = 0;
    this.qKS = 0;
    this.qJT = 0;
    this.qJS = 0;
    this.field_engineVersionStatLength = 0;
    this.field_engineQosStatLength = 0;
    this.field_statusSyncKey = 0;
    this.field_relayDataSyncKey = 0;
    this.field_connectingStatusKey = 0;
    this.qJE = 0;
    this.qJF = 0;
    this.qJG = 65536;
    this.qJH = 0;
    this.qJI = 0;
    this.qJP = -1;
    this.qJQ = 0;
    this.qKy = 0;
    this.qJm = 0;
    this.mzB = "";
    this.qKw = 0;
    this.qKx = 0;
    this.qKT.reset();
    this.qKT.bub();
    qJl = false;
    this.field_jbmBitratRsSvrParamArray = null;
    this.field_jbmParamArraySize = 0;
    this.field_jbmBitratRsSvrParamDoubleArray = null;
    this.field_jbmParamDoubleArraySize = 0;
    int i = freeJNIReport();
    com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "freeJNIReport : " + i + ". [0: null, no need to free, 1: free success!]");
    GMTrace.o(5310861279232L, 39569);
  }
  
  public native int setActive();
  
  public native int setAppCmd(int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  
  public native int setConfigConnect(int paramInt1, long paramLong1, int paramInt2, long paramLong2, byte[] paramArrayOfByte1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, byte[] paramArrayOfByte2, int paramInt8, int paramInt9, int paramInt10, int paramInt11, byte[] paramArrayOfByte3, int paramInt12, int paramInt13);
  
  public native int setInactive();
  
  public native int setJNIAppCmd(int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  
  public native int setNetSignalValue(int paramInt1, int paramInt2);
  
  public native int setSvrConfig(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
  
  public native int setjbmbitraterssvrparam();
  
  public native int startEngine();
  
  public native int videoDecode(int[] paramArrayOfInt);
  
  public native int videoEncodeToLocal(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int[] paramArrayOfInt);
  
  public native int videoEncodeToSend(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public native int videoRorate90D(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte2, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\v2protocal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */