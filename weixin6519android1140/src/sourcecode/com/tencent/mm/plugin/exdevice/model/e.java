package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.af.d.b;
import com.tencent.mm.af.d.b.a;
import com.tencent.mm.g.a.ct;
import com.tencent.mm.g.a.cu;
import com.tencent.mm.g.a.cw;
import com.tencent.mm.g.a.cx;
import com.tencent.mm.g.a.cy;
import com.tencent.mm.g.a.cz;
import com.tencent.mm.g.a.da;
import com.tencent.mm.g.a.db;
import com.tencent.mm.g.a.dc;
import com.tencent.mm.g.a.dd;
import com.tencent.mm.g.a.dd.a;
import com.tencent.mm.g.a.de;
import com.tencent.mm.g.a.de.a;
import com.tencent.mm.g.a.df;
import com.tencent.mm.g.a.dg;
import com.tencent.mm.g.a.dg.a;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dj;
import com.tencent.mm.g.a.dp;
import com.tencent.mm.g.a.dr;
import com.tencent.mm.g.a.ds;
import com.tencent.mm.g.a.dt;
import com.tencent.mm.g.a.du;
import com.tencent.mm.g.a.du.a;
import com.tencent.mm.g.a.dv;
import com.tencent.mm.g.a.dw;
import com.tencent.mm.g.a.dw.a;
import com.tencent.mm.g.a.dy;
import com.tencent.mm.g.a.dy.a;
import com.tencent.mm.g.a.dz;
import com.tencent.mm.g.a.ea;
import com.tencent.mm.g.a.ec;
import com.tencent.mm.g.a.ed;
import com.tencent.mm.g.a.ee;
import com.tencent.mm.g.a.ef;
import com.tencent.mm.g.a.eg;
import com.tencent.mm.g.a.ei;
import com.tencent.mm.g.a.ej;
import com.tencent.mm.g.a.ek;
import com.tencent.mm.g.a.el;
import com.tencent.mm.g.a.em;
import com.tencent.mm.g.a.en;
import com.tencent.mm.g.a.eo;
import com.tencent.mm.g.a.hq;
import com.tencent.mm.g.a.hq.b;
import com.tencent.mm.g.a.ix;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.g.a.ks;
import com.tencent.mm.g.a.ku;
import com.tencent.mm.g.a.kx;
import com.tencent.mm.g.a.qq;
import com.tencent.mm.g.a.qr;
import com.tencent.mm.g.a.qv;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.bp;
import com.tencent.mm.plugin.exdevice.i.j;
import com.tencent.mm.plugin.exdevice.service.ExDeviceService;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.t.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.pluginsdk.p.aa;
import com.tencent.mm.pluginsdk.p.w.a;
import com.tencent.mm.protocal.c.aat;
import com.tencent.mm.protocal.c.aav;
import com.tencent.mm.protocal.c.aaw;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  public com.tencent.mm.sdk.b.c jiK;
  List<b> kxN;
  Map<String, b> kxO;
  public com.tencent.mm.sdk.b.c kxP;
  public com.tencent.mm.sdk.b.c kxQ;
  public com.tencent.mm.sdk.b.c kxR;
  public com.tencent.mm.sdk.b.c kxS;
  public com.tencent.mm.sdk.b.c kxT;
  public com.tencent.mm.sdk.b.c kxU;
  public com.tencent.mm.sdk.b.c kxV;
  public com.tencent.mm.sdk.b.c kxW;
  public com.tencent.mm.sdk.b.c kxX;
  public com.tencent.mm.sdk.b.c kxY;
  public com.tencent.mm.sdk.b.c kxZ;
  public com.tencent.mm.sdk.b.c kyA;
  public com.tencent.mm.sdk.b.c kyB;
  ExdeviceWCLanSDKUtil kyC;
  g kyD;
  private final long kyE;
  private boolean kyF;
  private c kyG;
  public com.tencent.mm.sdk.b.c kya;
  public com.tencent.mm.sdk.b.c kyb;
  public com.tencent.mm.sdk.b.c kyc;
  public com.tencent.mm.sdk.b.c kyd;
  public com.tencent.mm.sdk.b.c kye;
  public com.tencent.mm.sdk.b.c kyf;
  public com.tencent.mm.sdk.b.c kyg;
  public com.tencent.mm.sdk.b.c kyh;
  public com.tencent.mm.sdk.b.c kyi;
  public com.tencent.mm.sdk.b.c kyj;
  public com.tencent.mm.sdk.b.c kyk;
  public com.tencent.mm.sdk.b.c kyl;
  public com.tencent.mm.sdk.b.c kym;
  public com.tencent.mm.sdk.b.c kyn;
  public com.tencent.mm.sdk.b.c kyo;
  public com.tencent.mm.sdk.b.c kyp;
  public com.tencent.mm.sdk.b.c kyq;
  public com.tencent.mm.sdk.b.c kyr;
  public com.tencent.mm.sdk.b.c kys;
  public com.tencent.mm.sdk.b.c kyt;
  public com.tencent.mm.sdk.b.c kyu;
  public com.tencent.mm.sdk.b.c kyv;
  public com.tencent.mm.sdk.b.c kyw;
  public com.tencent.mm.sdk.b.c kyx;
  public com.tencent.mm.sdk.b.c kyy;
  public com.tencent.mm.sdk.b.c kyz;
  com.tencent.mm.sdk.platformtools.ae mHandler;
  
  public e()
  {
    GMTrace.i(10924786188288L, 81396);
    this.kxP = new com.tencent.mm.sdk.b.c() {};
    this.kxQ = new com.tencent.mm.sdk.b.c() {};
    this.kxR = new com.tencent.mm.sdk.b.c() {};
    this.kxS = new com.tencent.mm.sdk.b.c() {};
    this.kxT = new com.tencent.mm.sdk.b.c() {};
    this.kxU = new com.tencent.mm.sdk.b.c() {};
    this.kxV = new com.tencent.mm.sdk.b.c() {};
    this.kxW = new com.tencent.mm.sdk.b.c() {};
    this.kxX = new com.tencent.mm.sdk.b.c() {};
    this.kxY = new com.tencent.mm.sdk.b.c() {};
    this.kxZ = new com.tencent.mm.sdk.b.c() {};
    this.kya = new com.tencent.mm.sdk.b.c() {};
    this.kyb = new com.tencent.mm.sdk.b.c() {};
    this.kyc = new com.tencent.mm.sdk.b.c() {};
    this.kyd = new com.tencent.mm.sdk.b.c() {};
    this.kye = new com.tencent.mm.sdk.b.c() {};
    this.kyf = new com.tencent.mm.sdk.b.c() {};
    this.kyg = new com.tencent.mm.sdk.b.c() {};
    this.kyh = new com.tencent.mm.sdk.b.c() {};
    this.kyi = new com.tencent.mm.sdk.b.c() {};
    this.kyj = new com.tencent.mm.sdk.b.c() {};
    this.kyk = new com.tencent.mm.sdk.b.c() {};
    this.kyl = new com.tencent.mm.sdk.b.c() {};
    this.kym = new com.tencent.mm.sdk.b.c() {};
    this.kyn = new com.tencent.mm.sdk.b.c() {};
    this.kyo = new com.tencent.mm.sdk.b.c() {};
    this.kyp = new com.tencent.mm.sdk.b.c() {};
    this.jiK = new com.tencent.mm.sdk.b.c() {};
    this.kyq = new com.tencent.mm.sdk.b.c() {};
    this.kyr = new com.tencent.mm.sdk.b.c() {};
    this.kys = new com.tencent.mm.sdk.b.c() {};
    this.kyt = new com.tencent.mm.sdk.b.c() {};
    this.kyu = new com.tencent.mm.sdk.b.c() {};
    this.kyv = new com.tencent.mm.sdk.b.c() {};
    this.kyw = new com.tencent.mm.sdk.b.c() {};
    this.kyx = new com.tencent.mm.sdk.b.c() {};
    this.kyy = new com.tencent.mm.sdk.b.c() {};
    this.kyz = new com.tencent.mm.sdk.b.c() {};
    this.kyA = new com.tencent.mm.sdk.b.c() {};
    this.kyB = new com.tencent.mm.sdk.b.c() {};
    this.kyE = 300000L;
    this.kyF = false;
    this.kxN = new LinkedList();
    this.kxO = new HashMap();
    HandlerThread localHandlerThread = com.tencent.mm.sdk.f.e.SV("wifi_device_heart_beat");
    localHandlerThread.start();
    this.mHandler = new com.tencent.mm.sdk.platformtools.ae(localHandlerThread.getLooper());
    GMTrace.o(10924786188288L, 81396);
  }
  
  public static void U(String paramString, boolean paramBoolean)
  {
    GMTrace.i(10928544284672L, 81424);
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnDeviceBindStateChange. deviceId=%s, isBound=%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    dr localdr = new dr();
    localdr.eFv.esG = paramString;
    localdr.eFv.eEp = paramBoolean;
    com.tencent.mm.sdk.b.a.vgX.a(localdr, Looper.getMainLooper());
    GMTrace.o(10928544284672L, 81424);
  }
  
  static int a(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    GMTrace.i(10925725712384L, 81403);
    int i = -1;
    if (bg.nl(paramb.field_connProto).contains("1")) {
      i = 1;
    }
    for (;;)
    {
      GMTrace.o(10925725712384L, 81403);
      return i;
      if (bg.nl(paramb.field_connProto).contains("3")) {
        i = 0;
      }
    }
  }
  
  private b a(String paramString, b paramb)
  {
    GMTrace.i(10928946937856L, 81427);
    paramString = (b)this.kxO.put(paramString, paramb);
    GMTrace.o(10928946937856L, 81427);
    return paramString;
  }
  
  public static void aR(String paramString, int paramInt)
  {
    GMTrace.i(10928275849216L, 81422);
    kx localkx = new kx();
    localkx.ePc.op = 1;
    localkx.ePc.eMz = paramString;
    localkx.ePc.eMw = paramInt;
    com.tencent.mm.sdk.b.a.vgX.a(localkx, Looper.getMainLooper());
    GMTrace.o(10928275849216L, 81422);
  }
  
  public static boolean atB()
  {
    GMTrace.i(10926799454208L, 81411);
    Object localObject = ad.atR().aux();
    if (((LinkedList)localObject).isEmpty())
    {
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "get harddevice info is null or empty");
      GMTrace.o(10926799454208L, 81411);
      return false;
    }
    ad.atY().mW(2);
    localObject = ((LinkedList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.exdevice.h.b localb = (com.tencent.mm.plugin.exdevice.h.b)((Iterator)localObject).next();
      at.AR();
      x localx = com.tencent.mm.y.c.yK().TE(localb.field_brandName);
      if ((localx == null) || (!com.tencent.mm.l.a.eE(localx.field_type)))
      {
        w.e("MicroMsg.exdevice.ExdeviceEventManager", "%s is not my contact now, may be has been deleted", new Object[] { localb.field_brandName });
      }
      else if ((localb.field_connStrategy & 0x4) == 0)
      {
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "Connect Strategy is %d, no need to sync in main ui", new Object[] { Integer.valueOf(localb.field_connStrategy) });
      }
      else
      {
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "now try to connect %s", new Object[] { localb.field_brandName });
        ad.atY().a(localb.field_brandName, localb.field_mac, 0, true);
      }
    }
    GMTrace.o(10926799454208L, 81411);
    return true;
  }
  
  public static boolean atC()
  {
    GMTrace.i(16060224897024L, 119658);
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "receive StopAllChannelEvent");
    ad.atY();
    d.ea(false);
    ad.atY().atA();
    GMTrace.o(16060224897024L, 119658);
    return true;
  }
  
  private static boolean atD()
  {
    GMTrace.i(10927202107392L, 81414);
    if (!com.tencent.mm.plugin.g.a.e.a.cc(ab.getContext()))
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "now sdk version not support ble device : %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      GMTrace.o(10927202107392L, 81414);
      return false;
    }
    if (!com.tencent.mm.plugin.g.a.e.a.ahp())
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "Bluetooth is not open, Just leave");
      GMTrace.o(10927202107392L, 81414);
      return false;
    }
    GMTrace.o(10927202107392L, 81414);
    return true;
  }
  
  public static boolean atE()
  {
    GMTrace.i(10927336325120L, 81415);
    w.d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTScanDevice");
    if (!atD())
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "isBTOpenAndBLESupported return false");
      GMTrace.o(10927336325120L, 81415);
      return false;
    }
    ad.aud().atH();
    GMTrace.o(10927336325120L, 81415);
    return true;
  }
  
  public static boolean atF()
  {
    GMTrace.i(10929081155584L, 81428);
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "Wechat exit, stop ExDeviceService.");
    Context localContext = ab.getContext();
    try
    {
      ad.atY().atA();
      localContext.stopService(new Intent(localContext, ExDeviceService.class));
      GMTrace.o(10929081155584L, 81428);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.w("MicroMsg.exdevice.ExDeviceServiceHelper", "unbindService() Service is not start by bindService.%s", new Object[] { localException.getMessage() });
        w.printErrStackTrace("MicroMsg.exdevice.ExDeviceServiceHelper", localException, "", new Object[0]);
      }
    }
  }
  
  public static void b(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(10928141631488L, 81421);
    kx localkx = new kx();
    localkx.ePc.op = 2;
    localkx.ePc.eMz = paramString1;
    localkx.ePc.eFl = paramInt;
    localkx.ePc.url = paramString2;
    localkx.ePc.esG = paramString3;
    com.tencent.mm.sdk.b.a.vgX.a(localkx, Looper.getMainLooper());
    GMTrace.o(10928141631488L, 81421);
  }
  
  public static boolean b(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    GMTrace.i(10927873196032L, 81419);
    Object localObject;
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (bg.bq(paramArrayOfByte)))
    {
      localObject = paramString1;
      if (bg.nm(paramString1)) {
        localObject = "null";
      }
      paramString1 = paramString2;
      if (bg.nm(paramString2)) {
        paramString1 = "null";
      }
      if (bg.bq(paramArrayOfByte)) {}
      for (i = 0;; i = paramArrayOfByte.length)
      {
        w.e("MicroMsg.exdevice.ExdeviceEventManager", "input error. mac = %s, brandName = %s, dataLen = %d", new Object[] { localObject, paramString1, Integer.valueOf(i) });
        GMTrace.o(10927873196032L, 81419);
        return false;
      }
    }
    String str;
    if (bg.nm(paramString1))
    {
      localObject = "null";
      if (!bg.nm(paramString2)) {
        break label235;
      }
      str = "null";
      label137:
      if (!bg.bq(paramArrayOfByte)) {
        break label241;
      }
    }
    label235:
    label241:
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      w.d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTUploadDataToServer. mac = %s, brandName = %s, dataLen = %d", new Object[] { localObject, str, Integer.valueOf(i) });
      long l = com.tencent.mm.plugin.exdevice.j.b.xh(paramString1);
      localObject = ad.atR().bR(l);
      if (localObject != null) {
        break label247;
      }
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "device(mac=%s) not found in brand(brandName=%s)", new Object[] { paramString1, paramString2 });
      GMTrace.o(10927873196032L, 81419);
      return false;
      localObject = paramString1;
      break;
      str = paramString2;
      break label137;
    }
    label247:
    paramString1 = com.tencent.mm.plugin.g.a.b.a.a.aa(paramArrayOfByte);
    if (1L != paramString1.jlY)
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "not step profile type %d != %d", new Object[] { Long.valueOf(1L), Long.valueOf(paramString1.jlY) });
      GMTrace.o(10927873196032L, 81419);
      return false;
    }
    paramString1 = (com.tencent.mm.plugin.g.a.b.a.f)paramString1;
    paramString2 = Calendar.getInstance();
    paramString2.set(11, 0);
    paramString2.set(12, 0);
    paramString2.set(13, 0);
    i = (int)(paramString2.getTimeInMillis() / 1000L);
    int j = (int)(System.currentTimeMillis() / 1000L);
    ((com.tencent.mm.plugin.sport.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.sport.b.b.class)).a(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceID, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceType, i, j, paramString1.jnM, "");
    GMTrace.o(10927873196032L, 81419);
    return true;
  }
  
  public static void c(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    GMTrace.i(10928410066944L, 81423);
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnRecvDataFromDevice. deviceId=%s, brandName=%s", new Object[] { paramString1, paramString2 });
    ds localds = new ds();
    localds.eFw.esG = paramString1;
    localds.eFw.eEs = paramString2;
    localds.eFw.data = paramArrayOfByte;
    com.tencent.mm.sdk.b.a.vgX.a(localds, Looper.getMainLooper());
    GMTrace.o(10928410066944L, 81423);
  }
  
  public static boolean d(com.tencent.mm.sdk.b.b paramb)
  {
    GMTrace.i(10925457276928L, 81401);
    paramb = (dd)paramb;
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "handleGetDeviceInfosEvent: brandName=%s, context=%s", new Object[] { paramb.eEF.eEs, paramb.eEF.context });
    LinkedList localLinkedList = ad.atR().wV(paramb.eEF.eEs);
    JSONArray localJSONArray = new JSONArray();
    label228:
    for (;;)
    {
      try
      {
        Iterator localIterator = localLinkedList.iterator();
        JSONObject localJSONObject;
        if (localIterator.hasNext())
        {
          com.tencent.mm.plugin.exdevice.h.b localb = (com.tencent.mm.plugin.exdevice.h.b)localIterator.next();
          if (localLinkedList.isEmpty()) {
            continue;
          }
          localJSONObject = new JSONObject();
          localJSONObject.put("deviceId", localb.field_deviceID);
          if (!u.aus().bF(localb.field_mac)) {
            break label228;
          }
          localJSONObject.put("state", "connected");
          localJSONArray.put(localJSONObject);
        }
        localJSONObject.put("state", "disconnected");
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.exdevice.ExdeviceEventManager", "Ex in handleGetDeviceInfosEvent, %s", new Object[] { localException.getMessage() });
        paramb.eEG.eEH = localJSONArray;
        paramb.eEG.eEu = true;
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "GetDeviceInfos: %s", new Object[] { localJSONArray.toString() });
        GMTrace.o(10925457276928L, 81401);
        return true;
      }
    }
  }
  
  public static boolean e(com.tencent.mm.sdk.b.b paramb)
  {
    GMTrace.i(10925591494656L, 81402);
    paramb = (dy)paramb;
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "handleSendDataToDeviceEvent: brandName=%s, deviceId=%s", new Object[] { paramb.eFF.eEs, paramb.eFF.esG });
    if (bg.bq(paramb.eFF.data))
    {
      paramb.eFG.eEu = false;
      GMTrace.o(10925591494656L, 81402);
      return false;
    }
    Object localObject = ad.atR().wT(paramb.eFF.esG);
    if (localObject == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "hdInfo error");
      paramb.eFG.eEu = false;
      GMTrace.o(10925591494656L, 81402);
      return false;
    }
    if (!u.aus().bF(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_mac))
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "haven't connect");
      paramb.eFG.eEu = false;
      GMTrace.o(10925591494656L, 81402);
      return false;
    }
    if (!u.aus().bL(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_mac))
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "haven't authed");
      paramb.eFG.eEu = false;
      GMTrace.o(10925591494656L, 81402);
      return false;
    }
    if (aa.atO().kzq) {
      aa.atO().mX(a((com.tencent.mm.plugin.exdevice.h.b)localObject));
    }
    localObject = new com.tencent.mm.plugin.exdevice.i.g(paramb.eFF.data, 10001, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_mac);
    u.aut().a((ae)localObject);
    paramb.eFG.eEu = true;
    GMTrace.o(10925591494656L, 81402);
    return true;
  }
  
  static boolean e(String paramString, List<com.tencent.mm.plugin.exdevice.h.b> paramList)
  {
    GMTrace.i(10925188841472L, 81399);
    boolean bool1 = false;
    String str = Uri.parse(paramString).getHost();
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "is url...");
    paramString = null;
    Iterator localIterator = paramList.iterator();
    Object localObject;
    if (localIterator.hasNext())
    {
      localObject = (com.tencent.mm.plugin.exdevice.h.b)localIterator.next();
      paramList = ((bp)localObject).fsL;
      localObject = ((bp)localObject).fsM;
      if ((localObject == null) || (((String)localObject).length() <= 0) || (paramList == null) || (!paramList.contains("wxmsg_url"))) {
        break label220;
      }
    }
    label208:
    label220:
    label223:
    for (;;)
    {
      try
      {
        paramList = new JSONObject((String)localObject).getJSONArray("wxmsg_url");
        paramString = paramList;
        int j = paramString.length();
        i = 0;
        if (i >= j) {
          break label223;
        }
      }
      catch (JSONException paramList)
      {
        try
        {
          bool2 = paramString.getString(i).equals(str);
          if (!bool2) {
            continue;
          }
          bool1 = true;
          bool2 = bool1;
          if (bool1) {
            break label208;
          }
        }
        catch (JSONException paramList)
        {
          int i;
          w.printErrStackTrace("MicroMsg.exdevice.ExdeviceEventManager", paramList, "", new Object[0]);
          i += 1;
        }
        paramList = paramList;
        w.printErrStackTrace("MicroMsg.exdevice.ExdeviceEventManager", paramList, "", new Object[0]);
        continue;
        continue;
      }
      boolean bool2 = bool1;
      GMTrace.o(10925188841472L, 81399);
      return bool2;
    }
  }
  
  static boolean f(String paramString, List<com.tencent.mm.plugin.exdevice.h.b> paramList)
  {
    GMTrace.i(10925323059200L, 81400);
    if (paramString == null)
    {
      GMTrace.o(10925323059200L, 81400);
      return false;
    }
    Object localObject = new hq();
    ((hq)localObject).eKU.eEM = paramString;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((hq)localObject).eKV.eKW;
    int i = ((biz)localObject).uUc.ueV;
    boolean bool;
    if (i == 1)
    {
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "is photo...");
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject = ((com.tencent.mm.plugin.exdevice.h.b)paramList.next()).fsL;
        if ((localObject != null) && (((String)localObject).contains("wxmsg_image"))) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "isSupportsSnsInfo = " + bool + ", snsLocalId = " + paramString);
      GMTrace.o(10925323059200L, 81400);
      return bool;
      bool = false;
      continue;
      if (i == 4)
      {
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "is music...");
        paramList = paramList.iterator();
        for (;;)
        {
          if (paramList.hasNext())
          {
            localObject = ((com.tencent.mm.plugin.exdevice.h.b)paramList.next()).fsL;
            if ((localObject != null) && (((String)localObject).contains("wxmsg_music")))
            {
              bool = true;
              break;
            }
          }
        }
        bool = false;
      }
      else if (i == 15)
      {
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "is sight...");
        paramList = paramList.iterator();
        for (;;)
        {
          if (paramList.hasNext())
          {
            localObject = ((com.tencent.mm.plugin.exdevice.h.b)paramList.next()).fsL;
            if ((localObject != null) && (((String)localObject).contains("wxmsg_video")))
            {
              bool = true;
              break;
            }
          }
        }
        bool = false;
      }
      else if (i == 3)
      {
        bool = e(((biz)localObject).uUc.lPM, paramList);
      }
      else
      {
        bool = false;
      }
    }
  }
  
  static boolean wC(String paramString)
  {
    GMTrace.i(10926128365568L, 81406);
    paramString = com.tencent.mm.af.f.iK(paramString);
    if (paramString == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "bizInfo is null");
      GMTrace.o(10926128365568L, 81406);
      return false;
    }
    paramString = paramString.bq(false);
    if ((paramString == null) || (paramString.EZ() == null) || (!paramString.EZ().Fi()))
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "this is not hardware biz");
      GMTrace.o(10926128365568L, 81406);
      return false;
    }
    GMTrace.o(10926128365568L, 81406);
    return true;
  }
  
  public static boolean wD(String paramString)
  {
    GMTrace.i(10927470542848L, 81416);
    w.d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTDisconnectDevice, mac(%s).", new Object[] { paramString });
    if (!atD())
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "isBTOpenAndBLESupported return false");
      GMTrace.o(10927470542848L, 81416);
      return false;
    }
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "mac is null or nil");
      GMTrace.o(10927470542848L, 81416);
      return false;
    }
    ad.aud();
    h.bv(com.tencent.mm.plugin.exdevice.j.b.xh(paramString));
    GMTrace.o(10927470542848L, 81416);
    return true;
  }
  
  public final boolean K(int paramInt, String paramString)
  {
    GMTrace.i(10927067889664L, 81413);
    w.v("MicroMsg.exdevice.ExdeviceEventManager", "handleInChattingUI.");
    Object localObject1 = com.tencent.mm.af.f.iK(paramString);
    if (localObject1 == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "bizInfo is null");
      GMTrace.o(10927067889664L, 81413);
      return false;
    }
    localObject1 = ((com.tencent.mm.af.d)localObject1).bq(false);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = ((d.b)localObject1).EZ();
      if ((localObject2 != null) && (((d.b.a)localObject2).Fi())) {}
    }
    else
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "this is not hardware biz");
      GMTrace.o(10927067889664L, 81413);
      return false;
    }
    localObject1 = ad.atR().wV(paramString);
    Object localObject3;
    if (((d.b.a)localObject2).gwv == 1)
    {
      localObject2 = ad.atR().aux();
      if (((List)localObject2).size() != 0)
      {
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (com.tencent.mm.plugin.exdevice.h.b)((Iterator)localObject2).next();
          w.i("MicroMsg.exdevice.ExdeviceEventManager", "BLE hard device info, mac(%s), deviceId(%s), deviceType(%s), SimpleProtol(%d)", new Object[] { Long.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject3).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject3).field_deviceID, ((com.tencent.mm.plugin.exdevice.h.b)localObject3).field_deviceType, Long.valueOf(((bp)localObject3).fsK) });
          if (0L != (((bp)localObject3).fsK & 1L)) {
            ((List)localObject1).add(localObject3);
          }
        }
      }
    }
    if (localObject1 == null)
    {
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "handleInChattingUI, hdInfo is null.");
      GMTrace.o(10927067889664L, 81413);
      return false;
    }
    if (((List)localObject1).size() == 0)
    {
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "handleInChattingUI, hdInfo size is 0.");
      GMTrace.o(10927067889664L, 81413);
      return true;
    }
    localObject1 = ((List)localObject1).iterator();
    int j = 0;
    int i = 0;
    int k;
    for (;;)
    {
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (com.tencent.mm.plugin.exdevice.h.b)((Iterator)localObject1).next();
        if (localObject2 == null)
        {
          w.e("MicroMsg.exdevice.ExdeviceEventManager", "hdInfo error");
        }
        else if (bg.nl(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connProto).contains("4"))
        {
          w.i("MicroMsg.exdevice.ExdeviceEventManager", "%s, Wifi biz, continue.", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName });
        }
        else if ((((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connStrategy & 0x10) != 0)
        {
          w.i("MicroMsg.exdevice.ExdeviceEventManager", "%s, Connect stragegy(%d) ignore connection on chat, continue!!!", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, Integer.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connStrategy) });
        }
        else if (bg.nl(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connProto).contains("1"))
        {
          k = j + 1;
          if (!com.tencent.mm.plugin.g.a.e.a.ahn())
          {
            w.e("MicroMsg.exdevice.ExdeviceEventManager", "%s, device is BC, but you phone not support BC.", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName });
            j = k;
            continue;
          }
          j = i;
          i = k;
          k = 1;
        }
      }
    }
    for (;;)
    {
      label506:
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "receive ExDeviceOpInChattingUIEventListener, op(%d), brandName(%s), connProto(%s),", new Object[] { Integer.valueOf(paramInt), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connProto });
      if (paramInt == 0)
      {
        localObject3 = ad.atY();
        long l = ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac;
        w.i("MicroMsg.exdevice.ExdeviceConnectManager", "StopSyncTimer, device Id = %d", new Object[] { Long.valueOf(l) });
        if (((d)localObject3).kxx.containsKey(Long.valueOf(l)))
        {
          w.i("MicroMsg.exdevice.ExdeviceConnectManager", "Switch from main view to chatting view before exdevice sync timeout, just stop MTimerHandler");
          localObject3 = (aj)((d)localObject3).kxx.remove(Long.valueOf(l));
          if (localObject3 == null) {
            break label791;
          }
          ((aj)localObject3).stopTimer();
        }
        for (;;)
        {
          if (u.aus().bF(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac))
          {
            w.i("MicroMsg.exdevice.ExdeviceEventManager", "Enter chatting ui, find this deivce has been connected aready, device name = %s, device id = %d", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, Long.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac) });
            if (u.aus().bL(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac))
            {
              w.i("MicroMsg.exdevice.ExdeviceEventManager", "This device is auth aready");
              b(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_url, 2, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID);
              k = i;
              i = j;
              j = k;
              break;
              if (!bg.nl(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connProto).contains("3")) {
                break label1371;
              }
              i += 1;
              if (!com.tencent.mm.plugin.g.a.e.a.cc(ab.getContext()))
              {
                w.e("MicroMsg.exdevice.ExdeviceEventManager", "device is BLE, but you phone not support BLE.");
                break;
              }
              k = 0;
              m = j;
              j = i;
              i = m;
              break label506;
              label791:
              w.e("MicroMsg.exdevice.ExdeviceConnectManager", "Remove deviceId(%d) from syncTimeOutMap failed!!!", new Object[] { Long.valueOf(l) });
              continue;
            }
            w.i("MicroMsg.exdevice.ExdeviceEventManager", "This device has been connected but not auth yet.");
            k = i;
            i = j;
            j = k;
            break;
          }
        }
        if (!com.tencent.mm.plugin.exdevice.service.d.cl(ab.getContext()))
        {
          w.e("MicroMsg.exdevice.ExdeviceEventManager", "service not running");
          k = i;
          i = j;
          j = k;
          break;
        }
        if (f.b((com.tencent.mm.plugin.exdevice.h.b)localObject2))
        {
          w.i("MicroMsg.exdevice.ExdeviceEventManager", "Connect simple device, mac(%s), brandName(%s)", new Object[] { com.tencent.mm.plugin.exdevice.j.b.bS(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName });
          a(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName + ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac, new a(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, com.tencent.mm.plugin.exdevice.j.b.bS(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_url, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID));
          wE(com.tencent.mm.plugin.exdevice.j.b.bS(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac));
          k = i;
          i = j;
          j = k;
          break;
        }
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "Connect AirSync device, mac(%s), brandName(%s)", new Object[] { com.tencent.mm.plugin.exdevice.j.b.bS(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName });
        ad.atY().mW(1);
        ad.atY().a(Long.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connStrategy);
        ad.atY().a(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac, k);
        k = i;
        i = j;
        j = k;
        break;
      }
      if (paramInt == 1)
      {
        if (f.b((com.tencent.mm.plugin.exdevice.h.b)localObject2))
        {
          a(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName + ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac, new a(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, com.tencent.mm.plugin.exdevice.j.b.bS(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_url, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID));
          wE(com.tencent.mm.plugin.exdevice.j.b.bS(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac));
          k = i;
          i = j;
          j = k;
          break;
        }
        ad.atY().a(Long.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connStrategy);
        ad.atY().a(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac, k);
        k = i;
        i = j;
        j = k;
        break;
      }
      if (paramInt == 2)
      {
        if (f.b((com.tencent.mm.plugin.exdevice.h.b)localObject2))
        {
          wD(com.tencent.mm.plugin.exdevice.j.b.bS(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac));
          k = i;
          i = j;
          j = k;
          break;
        }
        ad.atY();
        d.bv(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac);
      }
      k = i;
      i = j;
      j = k;
      break;
      if (j + i > 0) {
        if (!com.tencent.mm.plugin.g.a.e.a.ahp())
        {
          w.w("MicroMsg.exdevice.ExdeviceEventManager", "System bluetooth is close");
          aR(paramString, 0);
        }
      }
      for (;;)
      {
        GMTrace.o(10927067889664L, 81413);
        return true;
        if ((i > 0) && (j == 0) && (!com.tencent.mm.plugin.g.a.e.a.cc(ab.getContext())))
        {
          aR(paramString, 1);
          continue;
          aR(paramString, -1);
        }
      }
      label1371:
      int m = j;
      k = -1;
      j = i;
      i = m;
    }
  }
  
  final boolean a(com.tencent.mm.plugin.exdevice.h.b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(10926262583296L, 81407);
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "handleSwitchViewEvent");
    if (paramb == null)
    {
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "HardDeviceInfo is null.");
      GMTrace.o(10926262583296L, 81407);
      return false;
    }
    String str = paramb.field_brandName;
    f.a locala = u.aus().bH(paramb.field_mac);
    if (locala == null)
    {
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "can not find the hardevice connect state");
      GMTrace.o(10926262583296L, 81407);
      return false;
    }
    if (locala.eFl == 2)
    {
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "notify the connect device %s", new Object[] { str });
      localObject = new j(paramInt1, paramInt2, paramb.field_mac);
      u.aut().a((ae)localObject);
    }
    Object localObject = ad.atY();
    if (paramInt1 == 1) {}
    for (paramInt2 = 1;; paramInt2 = 0)
    {
      ((d)localObject).mW(paramInt2);
      if (paramInt1 != 2) {
        break;
      }
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "now exit chattingui, do not notify change the subtitle");
      localObject = ad.atY();
      long l = paramb.field_mac;
      localObject = (aj)((d)localObject).kxw.remove(Long.valueOf(l));
      if (localObject != null) {
        ((aj)localObject).stopTimer();
      }
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "Device close strategy(%d)", new Object[] { Integer.valueOf(paramb.field_closeStrategy) });
      if (((paramb.field_closeStrategy & 0x1) != 0) || (!u.aus().bL(locala.kDc)) || ((2 != locala.eFl) && (locala.eFl != 0)))
      {
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "now the device is not auth or not connect  or closeStrategy is to close after exit, try to stop connetct, connet state is %d, device is %s", new Object[] { Integer.valueOf(locala.eFl), str });
        if (u.aut().kxo != null) {
          u.aut().kxo.bN(locala.kDc);
        }
      }
      if (f.b(paramb))
      {
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "try to disconnect simpleBTDevice(%s).", new Object[] { Long.valueOf(paramb.field_mac) });
        wD(com.tencent.mm.plugin.exdevice.j.b.bS(paramb.field_mac));
      }
      GMTrace.o(10926262583296L, 81407);
      return true;
    }
    if ((2 != locala.eFl) && (p.aa.tmk != null) && (p.aa.tmk.bBq()))
    {
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "getWearCommand is null or wear has connected in the brandName.");
      GMTrace.o(10926262583296L, 81407);
      return false;
    }
    GMTrace.o(10926262583296L, 81407);
    return true;
  }
  
  public final boolean a(b paramb)
  {
    GMTrace.i(10928678502400L, 81425);
    if ((paramb == null) || (this.kxN.contains(paramb)))
    {
      GMTrace.o(10928678502400L, 81425);
      return false;
    }
    boolean bool = this.kxN.add(paramb);
    GMTrace.o(10928678502400L, 81425);
    return bool;
  }
  
  public final boolean b(b paramb)
  {
    GMTrace.i(10928812720128L, 81426);
    if ((paramb != null) && (this.kxN.remove(paramb)))
    {
      GMTrace.o(10928812720128L, 81426);
      return true;
    }
    GMTrace.o(10928812720128L, 81426);
    return false;
  }
  
  public final boolean c(com.tencent.mm.sdk.b.b paramb)
  {
    GMTrace.i(10925054623744L, 81398);
    paramb = (de)paramb;
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "ExDeviceGetLanDeviceInfosEvent: brandName=%s, context=%s", new Object[] { paramb.eEI.eEs, paramb.eEI.context });
    if (!wC(paramb.eEI.eEs))
    {
      paramb.eEJ.eEH = null;
      paramb.eEJ.eEu = false;
      GMTrace.o(10925054623744L, 81398);
      return true;
    }
    LinkedList localLinkedList = ad.atR().wV(paramb.eEI.eEs);
    JSONArray localJSONArray = new JSONArray();
    label289:
    for (;;)
    {
      try
      {
        Iterator localIterator = localLinkedList.iterator();
        JSONObject localJSONObject;
        if (localIterator.hasNext())
        {
          com.tencent.mm.plugin.exdevice.h.b localb = (com.tencent.mm.plugin.exdevice.h.b)localIterator.next();
          if ((localLinkedList.isEmpty()) || (!bg.nl(localb.field_connProto).contains("4"))) {
            continue;
          }
          localJSONObject = new JSONObject();
          localJSONObject.put("deviceId", localb.field_deviceID);
          if (!this.kyC.wG(localb.field_deviceID)) {
            break label289;
          }
          localJSONObject.put("state", "connected");
          localJSONArray.put(localJSONObject);
        }
        localJSONObject.put("state", "disconnected");
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.exdevice.ExdeviceEventManager", "Ex in handleGetDeviceInfosEvent, %s", new Object[] { localException.getMessage() });
        paramb.eEJ.eEH = localJSONArray;
        paramb.eEJ.eEu = true;
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "GetDeviceInfos: %s", new Object[] { localJSONArray.toString() });
        GMTrace.o(10925054623744L, 81398);
        return true;
      }
    }
  }
  
  public final boolean f(final com.tencent.mm.sdk.b.b paramb)
  {
    GMTrace.i(10925859930112L, 81404);
    paramb = (dg)paramb;
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "handleGetTicketEvent: brandName=%s, deviceId=%s, type=%d", new Object[] { paramb.eEQ.eEs, paramb.eEQ.esG, Integer.valueOf(paramb.eEQ.type) });
    Object localObject2 = new aat();
    ((aat)localObject2).urq = paramb.eEQ.type;
    ((aat)localObject2).urr = 0;
    ((aat)localObject2).tUb = new agx();
    ((aat)localObject2).tUb.jhl = paramb.eEQ.esG;
    ((aat)localObject2).tUb.tSz = paramb.eEQ.eEs;
    Object localObject1 = new LinkedList();
    ((LinkedList)localObject1).add(localObject2);
    localObject2 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(16664741543936L, 124162);
        if ((paramAnonymousk != null) && (paramAnonymousk.getType() == 543))
        {
          at.wS().b(543, this);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.exdevice.ExdeviceEventManager", "getTicketSceneEndImpl errType = [%s], errCode = [%s]， errMsg = [%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            paramb.eER.eET = true;
            paramb.eER.eEU = null;
            if (paramb.eDO != null) {
              paramb.eDO.run();
            }
            GMTrace.o(16664741543936L, 124162);
            return;
          }
          w.i("MicroMsg.exdevice.ExdeviceEventManager", "getTicketSceneEndImpl errType = [%s], errCode = [%s]， errMsg = [%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          paramAnonymousString = (z)paramAnonymousk;
          if ((paramAnonymousString.kzP == null) || (paramAnonymousString.kzP.gtD.gtK == null)) {}
          aaw localaaw;
          for (paramAnonymousString = null;; paramAnonymousString = (aav)paramAnonymousString.kzP.gtD.gtK)
          {
            Iterator localIterator = paramAnonymousString.uru.iterator();
            paramAnonymousInt1 = 0;
            for (;;)
            {
              if (!localIterator.hasNext()) {
                break label417;
              }
              localaaw = (aaw)localIterator.next();
              if (localaaw != null)
              {
                paramAnonymousk = null;
                paramAnonymousString = null;
                if (localaaw.tUb != null)
                {
                  paramAnonymousk = localaaw.tUb.jhl;
                  paramAnonymousString = localaaw.tUb.tSz;
                }
                if ((localaaw.tST == 0) && (!bg.nm(localaaw.ugx))) {
                  break;
                }
                w.e("MicroMsg.exdevice.ExdeviceEventManager", "deviceId(%s) get ticket fail. ret=%d, ticket=%s", new Object[] { paramAnonymousk, Integer.valueOf(localaaw.tST), localaaw.ugx });
              }
            }
          }
          w.i("MicroMsg.exdevice.ExdeviceEventManager", "GetHardDeviceOperTicket end. deviceId=%s, deviceType=%s, ticket=%s, oper=%d", new Object[] { paramAnonymousk, paramAnonymousString, localaaw.ugx, Integer.valueOf(localaaw.urq) });
          paramb.eER.eET = true;
          paramb.eER.eEU = localaaw.ugx;
          if (paramb.eDO == null) {
            break label527;
          }
          paramb.eDO.run();
          paramAnonymousInt1 = 1;
        }
        label417:
        label527:
        for (;;)
        {
          break;
          if (paramAnonymousInt1 == 0)
          {
            paramb.eER.eET = true;
            paramb.eER.eEU = null;
            if (paramb.eDO != null) {
              paramb.eDO.run();
            }
          }
          GMTrace.o(16664741543936L, 124162);
          return;
          paramb.eER.eET = true;
          paramb.eER.eEU = null;
          if (paramb.eDO != null) {
            paramb.eDO.run();
          }
          GMTrace.o(16664741543936L, 124162);
          return;
        }
      }
    };
    localObject1 = new z((LinkedList)localObject1, paramb.eEQ.eEs, paramb.eEQ.eES);
    at.wS().a(543, (com.tencent.mm.ad.e)localObject2);
    if (!at.wS().a((com.tencent.mm.ad.k)localObject1, 0))
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "MMCore.getNetSceneQueue().doScene failed!!!");
      at.wS().b(543, (com.tencent.mm.ad.e)localObject2);
      paramb.eER.eET = true;
      paramb.eER.eEU = null;
      if (paramb.eDO != null) {
        paramb.eDO.run();
      }
      GMTrace.o(10925859930112L, 81404);
      return true;
    }
    GMTrace.o(10925859930112L, 81404);
    return false;
  }
  
  final boolean f(List<com.tencent.mm.plugin.exdevice.h.b> paramList, int paramInt)
  {
    GMTrace.i(10926396801024L, 81408);
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "handleWifiDeviceSwitchViewEvent");
    if (paramList.size() == 0)
    {
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "HardDeviceInfo is null or nil.");
      GMTrace.o(10926396801024L, 81408);
      return false;
    }
    int i = -1;
    switch (paramInt)
    {
    default: 
      paramInt = i;
    }
    for (;;)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Object localObject = (com.tencent.mm.plugin.exdevice.h.b)paramList.next();
        localObject = new com.tencent.mm.plugin.exdevice.i.k(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceType, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceID, paramInt);
        u.aut().a((ae)localObject);
      }
      if (this.kyF) {
        this.mHandler.removeCallbacks(this.kyG);
      }
      this.kyG = new c(paramList);
      this.mHandler.postDelayed(this.kyG, 300000L);
      this.kyF = true;
      paramInt = 2;
      continue;
      if (this.kyF)
      {
        this.mHandler.removeCallbacks(this.kyG);
        this.kyF = false;
      }
      paramInt = 0;
    }
    GMTrace.o(10926396801024L, 81408);
    return true;
  }
  
  public final boolean g(com.tencent.mm.sdk.b.b paramb)
  {
    GMTrace.i(10925994147840L, 81405);
    paramb = (dw)paramb;
    w.i("MicroMsg.exdevice.ExdeviceEventManager", "handleScanDeviceEvent: brandName=%s, op=%s, btVersion=%s", new Object[] { paramb.eFA.eEs, Boolean.valueOf(paramb.eFA.eEt), Integer.valueOf(paramb.eFA.eFC) });
    int j = paramb.eFA.eFC;
    int i = j;
    if (j != 0)
    {
      i = j;
      if (j != 1)
      {
        if (!com.tencent.mm.plugin.g.a.e.a.cc(ab.getContext())) {
          break label203;
        }
        w.w("MicroMsg.exdevice.ExdeviceEventManager", "invalid btVersion %s, use defalut BLE", new Object[] { Integer.valueOf(j) });
        i = 0;
      }
    }
    aa localaa;
    Object localObject2;
    if (paramb.eFA.eEt)
    {
      localaa = aa.atO();
      ??? = paramb.eFA.eEs;
      localObject2 = new aa.a()
      {
        public final void a(String paramAnonymousString, byte[] paramAnonymousArrayOfByte, boolean paramAnonymousBoolean)
        {
          GMTrace.i(16665009979392L, 124164);
          w.i("MicroMsg.exdevice.ExdeviceEventManager", "OnScanDevice %s", new Object[] { paramAnonymousString });
          if (paramAnonymousArrayOfByte == null) {
            w.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnScanDeviceResult. deviceId=%s, isCompleted=%s", new Object[] { paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
          }
          for (;;)
          {
            dt localdt = new dt();
            localdt.eFx.eFo = paramAnonymousArrayOfByte;
            localdt.eFx.esG = paramAnonymousString;
            localdt.eFx.eFp = paramAnonymousBoolean;
            com.tencent.mm.sdk.b.a.vgX.a(localdt, Looper.getMainLooper());
            GMTrace.o(16665009979392L, 124164);
            return;
            w.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnScanDeviceResult. deviceId=%s, base64(broadcastData)=%s, isCompleted=%s", new Object[] { paramAnonymousString, Base64.encodeToString(paramAnonymousArrayOfByte, 0), Boolean.valueOf(paramAnonymousBoolean) });
          }
        }
      };
      w.i("MicroMsg.exdevice.ScanDeviceLogic", "startScanDevice, brandName=%s", new Object[] { ??? });
      if (bg.nm((String)???)) {
        w.i("MicroMsg.exdevice.ScanDeviceLogic", "brand name is null");
      }
    }
    for (;;)
    {
      paramb.eFB.eEu = true;
      GMTrace.o(10925994147840L, 81405);
      return true;
      label203:
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "invalid btVersion %s, return fail", new Object[] { Integer.valueOf(j) });
      paramb.eFB.eEu = false;
      GMTrace.o(10925994147840L, 81405);
      return false;
      localaa.kyK = ((String)???);
      localaa.kAe = ((aa.a)localObject2);
      localaa.kAf.clear();
      ??? = localaa.kAg.iterator();
      while (((Iterator)???).hasNext())
      {
        localObject2 = (com.tencent.mm.ad.k)((Iterator)???).next();
        if (localObject2 != null) {
          at.wS().c((com.tencent.mm.ad.k)localObject2);
        }
      }
      localaa.kAg.clear();
      synchronized (aa.gwY)
      {
        aa.kAh.clear();
        if (!localaa.kzq)
        {
          localaa.kzq = true;
          at.wS().a(542, localaa);
          ad.atY().a(i, localaa);
          w.i("MicroMsg.exdevice.ScanDeviceLogic", "should start scan, startTimer");
          localaa.ikv.z(12000L, 12000L);
        }
      }
      w.w("MicroMsg.exdevice.ScanDeviceLogic", "still scanning. just change brand name and callback");
      continue;
      aa.atO().mX(i);
    }
  }
  
  public final void j(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(10928007413760L, 81420);
    LinkedList localLinkedList;
    synchronized (this.kxN)
    {
      localLinkedList = new LinkedList(this.kxN);
      ??? = localLinkedList.iterator();
      if (((Iterator)???).hasNext()) {
        ((b)((Iterator)???).next()).k(paramString1, paramString2, paramBoolean);
      }
    }
    localLinkedList.clear();
    ??? = this.kxO.values().iterator();
    while (((Iterator)???).hasNext()) {
      ((b)((Iterator)???).next()).k(paramString1, paramString2, paramBoolean);
    }
    w.d("MicroMsg.exdevice.ExdeviceEventManager", "simple BT on scan result: broadcastName=" + paramString1 + ", mac=" + paramString2 + ", isCompleted=" + paramBoolean);
    ??? = new ei();
    ((ei)???).eGc.eFW = paramString1;
    ((ei)???).eGc.mac = paramString2;
    ((ei)???).eGc.eFp = paramBoolean;
    com.tencent.mm.sdk.b.a.vgX.a((com.tencent.mm.sdk.b.b)???, Looper.getMainLooper());
    GMTrace.o(10928007413760L, 81420);
  }
  
  public final boolean m(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(10927738978304L, 81418);
    if ((bg.nm(paramString)) || (bg.bq(paramArrayOfByte)))
    {
      if (bg.nm(paramString))
      {
        paramString = "null";
        if (!bg.bq(paramArrayOfByte)) {
          break label85;
        }
      }
      label85:
      for (i = 0;; i = paramArrayOfByte.length)
      {
        w.e("MicroMsg.exdevice.ExdeviceEventManager", "input error. mac = %s, dataLen = %d", new Object[] { paramString, Integer.valueOf(i) });
        GMTrace.o(10927738978304L, 81418);
        return false;
        paramString = "mac";
        break;
      }
    }
    String str;
    if (bg.nm(paramString))
    {
      str = "null";
      if (!bg.bq(paramArrayOfByte)) {
        break label185;
      }
    }
    long l;
    label185:
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTSendDataToDevice. mac = %s, dataLen = %d", new Object[] { str, Integer.valueOf(i) });
      l = com.tencent.mm.plugin.exdevice.j.b.xh(paramString);
      paramString = ad.aud().kzr.bI(l);
      if (paramString != null) {
        break label191;
      }
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "can not find the hardevice connect state");
      GMTrace.o(10927738978304L, 81418);
      return false;
      str = paramString;
      break;
    }
    label191:
    if (paramString.eFl != 2)
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "device is not connected.");
      GMTrace.o(10927738978304L, 81418);
      return false;
    }
    ad.aud();
    boolean bool = h.a(l, paramArrayOfByte, new t.a()
    {
      public final void b(long paramAnonymousLong, int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
      {
        GMTrace.i(16665144197120L, 124165);
        Object localObject1 = paramAnonymousString;
        if (paramAnonymousString == null) {
          localObject1 = "null";
        }
        w.d("MicroMsg.exdevice.ExdeviceEventManager", "onSendEnd. mac=%d, errType=%d, errCode=%d, errMsg=%s", new Object[] { Long.valueOf(paramAnonymousLong), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), localObject1 });
        localObject1 = e.this;
        paramAnonymousString = com.tencent.mm.plugin.exdevice.j.b.bS(paramAnonymousLong);
        boolean bool;
        if (paramAnonymousInt2 == 0) {
          bool = true;
        }
        LinkedList localLinkedList;
        for (;;)
        {
          w.d("MicroMsg.exdevice.ExdeviceEventManager", "notifySimpleBTOnSend, mac : %s, isSucc : %s", new Object[] { paramAnonymousString, Boolean.valueOf(bool) });
          if (bool) {
            break label246;
          }
          synchronized (((e)localObject1).kxN)
          {
            localLinkedList = new LinkedList(((e)localObject1).kxN);
            ??? = localLinkedList.iterator();
            while (((Iterator)???).hasNext())
            {
              ((e.b)((Iterator)???).next()).b(paramAnonymousString, null, false);
              continue;
              bool = false;
            }
          }
        }
        localLinkedList.clear();
        localObject1 = ((e)localObject1).kxO.values().iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((e.b)((Iterator)localObject1).next()).b(paramAnonymousString, null, false);
        }
        label246:
        GMTrace.o(16665144197120L, 124165);
      }
    });
    GMTrace.o(10927738978304L, 81418);
    return bool;
  }
  
  public final boolean wE(String paramString)
  {
    GMTrace.i(10927604760576L, 81417);
    w.d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTConnectDevice");
    if (!atD())
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "isBTOpenAndBLESupported return false");
      GMTrace.o(10927604760576L, 81417);
      return false;
    }
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.exdevice.ExdeviceEventManager", "mac is null or nil");
      GMTrace.o(10927604760576L, 81417);
      return false;
    }
    ad.aud().a(com.tencent.mm.plugin.exdevice.j.b.xh(paramString), new h.a()
    {
      public final void a(long paramAnonymousLong1, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, long paramAnonymousLong2)
      {
        GMTrace.i(16664875761664L, 124163);
        w.d("MicroMsg.exdevice.ExdeviceEventManager", "mac=%d, oldState=%d, newState=%d, errCode=%d, profileType=%d", new Object[] { Long.valueOf(paramAnonymousLong1), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3), Long.valueOf(paramAnonymousLong2) });
        Object localObject1 = e.this;
        String str1 = com.tencent.mm.plugin.exdevice.j.b.bS(paramAnonymousLong1);
        LinkedList localLinkedList;
        synchronized (((e)localObject1).kxN)
        {
          localLinkedList = new LinkedList(((e)localObject1).kxN);
          ??? = localLinkedList.iterator();
          if (((Iterator)???).hasNext()) {
            ((e.b)((Iterator)???).next()).d(str1, paramAnonymousInt2, paramAnonymousLong2);
          }
        }
        localLinkedList.clear();
        localObject1 = ((e)localObject1).kxO.values().iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((e.b)((Iterator)localObject1).next()).d(str2, paramAnonymousInt2, paramAnonymousLong2);
        }
        localObject1 = new eg();
        ((eg)localObject1).eGa.mac = str2;
        ((eg)localObject1).eGa.eFl = paramAnonymousInt2;
        ((eg)localObject1).eGa.eFX = paramAnonymousLong2;
        com.tencent.mm.sdk.b.a.vgX.a((com.tencent.mm.sdk.b.b)localObject1, Looper.getMainLooper());
        GMTrace.o(16664875761664L, 124163);
      }
    });
    GMTrace.o(10927604760576L, 81417);
    return true;
  }
  
  public final class a
    implements e.b
  {
    private String aKJ;
    private String kyK;
    private String kyL;
    private String mURL;
    
    public a(String paramString1, String paramString2, String paramString3, String paramString4)
    {
      GMTrace.i(10953106128896L, 81607);
      this.kyK = paramString1;
      this.aKJ = paramString2;
      this.mURL = paramString3;
      this.kyL = paramString4;
      w.d("MicroMsg.exdevice.ExdeviceEventManager", "brandName : %s, mac : %s.", new Object[] { paramString1, paramString2 });
      GMTrace.o(10953106128896L, 81607);
    }
    
    public final void b(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
    {
      GMTrace.i(10953374564352L, 81609);
      if ((this.aKJ == null) || (!this.aKJ.equals(paramString)))
      {
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "onRecvFromDevice, mac(%s) is null or not correct.(mac : %s, succ : %s)", new Object[] { this.aKJ, paramString, Boolean.valueOf(paramBoolean) });
        GMTrace.o(10953374564352L, 81609);
        return;
      }
      if ((paramBoolean) && (paramArrayOfByte != null)) {
        try
        {
          ad.auc();
          if (!e.b(this.aKJ, this.kyK, paramArrayOfByte))
          {
            w.w("MicroMsg.exdevice.ExdeviceEventManager", "The parser isn't a correct type.");
            GMTrace.o(10953374564352L, 81609);
            return;
          }
          GMTrace.o(10953374564352L, 81609);
          return;
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.exdevice.ExdeviceEventManager", "Read data from bytes failed.");
        }
      }
      GMTrace.o(10953374564352L, 81609);
    }
    
    public final void d(String paramString, int paramInt, long paramLong)
    {
      GMTrace.i(10953508782080L, 81610);
      if ((this.aKJ == null) || (!this.aKJ.equals(paramString)))
      {
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, mac(%s) is null or not correct.(mac : %s, state : %s, type : %s)", new Object[] { this.aKJ, paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
        GMTrace.o(10953508782080L, 81610);
        return;
      }
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "mac(%s), connectState(%s), profileType(%s)", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      switch (paramInt)
      {
      case 3: 
      default: 
        w.d("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, out of range(mac : %s, state : %s, type : %s).", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
        e.b(this.kyK, this.mURL, -1, this.kyL);
        GMTrace.o(10953508782080L, 81610);
        return;
      case 2: 
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device connected now start send data to it.(mac : %s)", new Object[] { paramString });
        e.b(this.kyK, this.mURL, 2, this.kyL);
        paramString = new com.tencent.mm.plugin.g.a.b.a.f();
        paramString.jmF = com.tencent.mm.plugin.g.a.b.a.f.jnK;
        paramString.jmG = 2;
        ad.auc().m(this.aKJ, com.tencent.mm.plugin.exdevice.j.b.aW(paramString));
        GMTrace.o(10953508782080L, 81610);
        return;
      case 1: 
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device is connectiong.(mac: %s)", new Object[] { paramString });
        e.b(this.kyK, this.mURL, 1, this.kyL);
        GMTrace.o(10953508782080L, 81610);
        return;
      case 4: 
        e.b(this.kyK, this.mURL, 4, this.kyL);
        w.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device disconnected.(mac : %s)", new Object[] { paramString });
        GMTrace.o(10953508782080L, 81610);
        return;
      }
      e.b(this.kyK, this.mURL, 0, this.kyL);
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device state none.(mac : %s)", new Object[] { paramString });
      GMTrace.o(10953508782080L, 81610);
    }
    
    public final void k(String paramString1, String paramString2, boolean paramBoolean)
    {
      GMTrace.i(10953240346624L, 81608);
      if ((this.aKJ == null) || (!this.aKJ.equals(paramString2)))
      {
        w.d("MicroMsg.exdevice.ExdeviceEventManager", "onScanResult, mac(%s) is null or not correct.(mac : %s, isCompleted : %s)", new Object[] { this.aKJ, paramString2, Boolean.valueOf(paramBoolean) });
        GMTrace.o(10953240346624L, 81608);
        return;
      }
      GMTrace.o(10953240346624L, 81608);
    }
  }
  
  public static abstract interface b
  {
    public abstract void b(String paramString, byte[] paramArrayOfByte, boolean paramBoolean);
    
    public abstract void d(String paramString, int paramInt, long paramLong);
    
    public abstract void k(String paramString1, String paramString2, boolean paramBoolean);
  }
  
  private final class c
    implements Runnable
  {
    List<com.tencent.mm.plugin.exdevice.h.b> gpV;
    
    public c()
    {
      GMTrace.i(10973775659008L, 81761);
      List localList;
      this.gpV = localList;
      GMTrace.o(10973775659008L, 81761);
    }
    
    public final void run()
    {
      GMTrace.i(10973909876736L, 81762);
      w.i("MicroMsg.exdevice.ExdeviceEventManager", "Wifi device heart beat");
      if ((this.gpV != null) && (this.gpV.size() > 0))
      {
        Iterator localIterator = this.gpV.iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (com.tencent.mm.plugin.exdevice.h.b)localIterator.next();
          localObject = new com.tencent.mm.plugin.exdevice.i.k(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceType, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceID, 1);
          u.aut().a((ae)localObject);
        }
        e.this.mHandler.postDelayed(this, 300000L);
      }
      GMTrace.o(10973909876736L, 81762);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */