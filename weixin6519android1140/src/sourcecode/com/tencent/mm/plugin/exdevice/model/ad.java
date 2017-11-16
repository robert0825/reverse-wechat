package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.os.Message;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.compatible.a.a.a;
import com.tencent.mm.g.a.db;
import com.tencent.mm.plugin.exdevice.b.k;
import com.tencent.mm.plugin.exdevice.b.k.c;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class ad
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private b kAA;
  private com.tencent.mm.plugin.exdevice.h.c kAB;
  private com.tencent.mm.plugin.exdevice.f.b.b.d kAC;
  private com.tencent.mm.plugin.exdevice.f.b.b.a kAD;
  private com.tencent.mm.plugin.exdevice.f.b.b.b kAE;
  private com.tencent.mm.plugin.exdevice.f.b.b.e kAF;
  private e kAG;
  private d kAH;
  private com.tencent.mm.plugin.exdevice.f.b.c kAI;
  private com.tencent.mm.plugin.exdevice.f.b.a kAJ;
  private com.tencent.mm.plugin.exdevice.f.a.c kAK;
  private com.tencent.mm.ao.a.a kAL;
  private com.tencent.mm.ao.a.a.c kAM;
  private af kAN;
  private h kAO;
  private bt.a kAP;
  m.b kAQ;
  private ab kAz;
  
  static
  {
    GMTrace.i(10940355444736L, 81512);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("HARDDEVICEINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(10979412803584L, 81803);
        String[] arrayOfString = com.tencent.mm.plugin.exdevice.h.c.fTX;
        GMTrace.o(10979412803584L, 81803);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("HARDDEVICERANKINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(10950824427520L, 81590);
        String[] arrayOfString = com.tencent.mm.plugin.exdevice.f.b.b.d.fTX;
        GMTrace.o(10950824427520L, 81590);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("HARDDEVICERANKFOLLOWINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(10961024974848L, 81666);
        String[] arrayOfString = com.tencent.mm.plugin.exdevice.f.b.b.a.fTX;
        GMTrace.o(10961024974848L, 81666);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("HARDDEVICELIKEINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(10961830281216L, 81672);
        String[] arrayOfString = com.tencent.mm.plugin.exdevice.f.b.b.e.fTX;
        GMTrace.o(10961830281216L, 81672);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("HARDDEVICECHAMPIONINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(10980218109952L, 81809);
        String[] arrayOfString = com.tencent.mm.plugin.exdevice.f.b.b.b.fTX;
        GMTrace.o(10980218109952L, 81809);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("HARDDEVICERANKDETAILINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(10984915730432L, 81844);
        String[] arrayOfString = com.tencent.mm.plugin.exdevice.f.b.b.c.fTX;
        GMTrace.o(10984915730432L, 81844);
        return arrayOfString;
      }
    });
    GMTrace.o(10940355444736L, 81512);
  }
  
  public ad()
  {
    GMTrace.i(10937402654720L, 81490);
    this.kAz = new ab();
    this.kAL = null;
    this.kAM = null;
    this.kAP = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(10973238788096L, 81757);
        Object localObject1;
        Object localObject2;
        long l;
        if (ad.atX() != null)
        {
          ad.atX();
          paramAnonymousa = paramAnonymousa.gtM;
          w.i("MicroMsg.exdevice.ExDeviceWifiStatusMessageHandler", "parseMessageFromServer");
          localObject1 = com.tencent.mm.platformtools.n.a(paramAnonymousa.tPY);
          if (bg.nm((String)localObject1)) {
            w.e("MicroMsg.exdevice.ExDeviceWifiStatusMessageHandler", "msg content is null");
          }
          int i;
          do
          {
            do
            {
              do
              {
                i = 0;
                if (i != 0) {
                  break label934;
                }
                paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.tPY);
                if (!bg.nm(paramAnonymousa)) {
                  break;
                }
                w.e("MicroMsg.exdevice.ExDeviceMessageService", "msg content is null");
                GMTrace.o(10973238788096L, 81757);
                return;
                localObject1 = bh.q((String)localObject1, "sysmsg");
              } while ((localObject1 == null) || (((Map)localObject1).size() <= 0));
              localObject2 = (String)((Map)localObject1).get(".sysmsg.$type");
            } while ((bg.nm((String)localObject2)) || (!((String)localObject2).equalsIgnoreCase("wcdevicemsg")));
            String str1 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.ToUserName");
            String str2 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.FromUserName");
            l = bg.getLong((String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.CreateTime"), -1L);
            localObject2 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.MsgType");
            String str3 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.DeviceType");
            String str4 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.DeviceID");
            i = bg.getInt((String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.DeviceStatus"), -1);
            w.i("MicroMsg.exdevice.ExDeviceWifiStatusMessageHandler", "parseMessageFromServer:tousr=" + str1 + ",fromuser=" + str2 + ",createtime=" + l + ",msgtype=" + (String)localObject2 + ",devicetype=" + str3 + ",deviceid=" + str4 + ",devicestatus=" + i);
            localObject1 = ad.atR().wT(str4);
          } while ((localObject1 == null) || (!bg.nl(((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_connProto).contains("4")) || (!bg.nl((String)localObject2).contains("device_status")));
          if (i != 0)
          {
            ad.auc();
            e.b(((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_url, 2, ((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_deviceID);
          }
          for (;;)
          {
            i = 1;
            break;
            ad.auc();
            e.b(((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_url, 4, ((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_deviceID);
          }
          localObject1 = bh.q(paramAnonymousa, "sysmsg");
          if ((localObject1 == null) || (((Map)localObject1).size() <= 0))
          {
            w.e("MicroMsg.exdevice.ExDeviceMessageService", "receiveMessage, no sysmsg");
            GMTrace.o(10973238788096L, 81757);
            return;
          }
          paramAnonymousa = (String)((Map)localObject1).get(".sysmsg.$type");
          if ((bg.nm(paramAnonymousa)) || (!paramAnonymousa.equalsIgnoreCase("wcdevicemsg")))
          {
            w.e("MicroMsg.exdevice.ExDeviceMessageService", "receiveMessage, type not wcdevicemsg");
            GMTrace.o(10973238788096L, 81757);
            return;
          }
          paramAnonymousa = bg.nl((String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.MsgType"));
          w.i("MicroMsg.exdevice.ExDeviceMessageService", "newXml wcdevicemsg msgType = %s", new Object[] { paramAnonymousa });
          if (paramAnonymousa.equals("device_relation"))
          {
            paramAnonymousa = new db();
            paramAnonymousa.eEA.eEB = true;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousa);
            GMTrace.o(10973238788096L, 81757);
            return;
          }
          localObject2 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.Content");
          w.i("MicroMsg.exdevice.ExDeviceMessageService", "contentBase64 = %s", new Object[] { localObject2 });
          if (bg.nm((String)localObject2))
          {
            w.e("MicroMsg.exdevice.ExDeviceMessageService", "Fuck off: contentBase64 is null");
            GMTrace.o(10973238788096L, 81757);
            return;
          }
          try
          {
            paramAnonymousa = Base64.decode((String)localObject2, 0);
            if (bg.bq(paramAnonymousa))
            {
              w.e("MicroMsg.exdevice.ExDeviceMessageService", "null == decodedContent");
              GMTrace.o(10973238788096L, 81757);
              return;
            }
          }
          catch (Exception paramAnonymousa)
          {
            w.e("MicroMsg.exdevice.ExDeviceMessageService", "decode failed!!! %s", new Object[] { paramAnonymousa.getMessage() });
            w.printErrStackTrace("MicroMsg.exdevice.ExDeviceMessageService", paramAnonymousa, "", new Object[0]);
            GMTrace.o(10973238788096L, 81757);
            return;
          }
          l = bg.getLong((String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.SessionID"), -1L);
          localObject1 = (String)((Map)localObject1).get(".sysmsg.wcdevicemsg.xml.DeviceID");
          w.i("MicroMsg.exdevice.ExDeviceMessageService", "------NewXml Receive------sessionId = %d, deviceId = %s, message content = %s, length = %d", new Object[] { Long.valueOf(l), localObject1, localObject2, Integer.valueOf(paramAnonymousa.length) });
          localObject1 = ad.atR().wT((String)localObject1);
          if (localObject1 == null)
          {
            w.e("MicroMsg.exdevice.ExDeviceMessageService", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
            GMTrace.o(10973238788096L, 81757);
            return;
          }
          if (0L == l)
          {
            paramAnonymousa = new com.tencent.mm.plugin.exdevice.i.g(paramAnonymousa, 0, ((com.tencent.mm.plugin.exdevice.h.b)localObject1).field_mac);
            u.aut().a(paramAnonymousa);
            GMTrace.o(10973238788096L, 81757);
            return;
          }
          localObject1 = k.ats();
          w.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Recivce sendDataToManufacturerResponse, sessionId = %d", new Object[] { Long.valueOf(l) });
          if (l < 0L) {
            break label943;
          }
        }
        label934:
        label943:
        for (boolean bool = true;; bool = false)
        {
          Assert.assertTrue(bool);
          localObject2 = new k.c();
          ((k.c)localObject2).mSessionId = l;
          ((k.c)localObject2).jkV = paramAnonymousa;
          ((k)localObject1).mHandler.obtainMessage(3, localObject2).sendToTarget();
          GMTrace.o(10973238788096L, 81757);
          return;
        }
      }
    };
    this.kAQ = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, final Object paramAnonymousObject)
      {
        GMTrace.i(10965588377600L, 81700);
        try
        {
          if (!at.AU())
          {
            w.w("MicroMsg.exdevice.SubCoreExDevice", "onNotifyChange,acc has not ready");
            GMTrace.o(10965588377600L, 81700);
            return;
          }
          if ((paramAnonymousObject instanceof String)) {
            at.xB().h(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(10942771363840L, 81530);
                String str = (String)paramAnonymousObject;
                if (ad.atT().wN(str))
                {
                  at.AR();
                  if (!com.tencent.mm.y.c.yK().TA(str)) {
                    at.wS().a(new com.tencent.mm.plugin.exdevice.f.a.h(str, null), 0);
                  }
                }
                GMTrace.o(10942771363840L, 81530);
              }
            }, 2000L);
          }
          GMTrace.o(10965588377600L, 81700);
          return;
        }
        catch (Exception paramAnonymousm)
        {
          w.e("MicroMsg.exdevice.SubCoreExDevice", "ap : onNotifyChange exception %s", new Object[] { paramAnonymousm.getMessage() });
          GMTrace.o(10965588377600L, 81700);
        }
      }
    };
    if (this.kAH == null) {
      this.kAH = new d();
    }
    if (this.kAG == null) {
      this.kAG = new e();
    }
    w.i("MicroMsg.exdevice.SubCoreExDevice", "create SubCoreExDevice.");
    com.tencent.mm.sdk.b.a.vgX.b(this.kAG.kyq);
    GMTrace.o(10937402654720L, 81490);
  }
  
  private static ad atQ()
  {
    GMTrace.i(10937671090176L, 81492);
    ad localad2 = (ad)at.AK().gZ("plugin.exdevice");
    ad localad1 = localad2;
    if (localad2 == null)
    {
      w.w("MicroMsg.exdevice.SubCoreExDevice", "not found in MMCore, new one");
      localad1 = new ad();
      at.AK().a("plugin.exdevice", localad1);
    }
    GMTrace.o(10937671090176L, 81492);
    return localad1;
  }
  
  public static com.tencent.mm.plugin.exdevice.h.c atR()
  {
    GMTrace.i(10937805307904L, 81493);
    com.tencent.mm.kernel.h.xw().wG();
    if (atQ().kAB == null)
    {
      localObject = atQ();
      at.AR();
      ((ad)localObject).kAB = new com.tencent.mm.plugin.exdevice.h.c(com.tencent.mm.y.c.yH());
    }
    Object localObject = atQ().kAB;
    GMTrace.o(10937805307904L, 81493);
    return (com.tencent.mm.plugin.exdevice.h.c)localObject;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.b.d atS()
  {
    GMTrace.i(10937939525632L, 81494);
    com.tencent.mm.kernel.h.xw().wG();
    if (atQ().kAC == null)
    {
      localObject = atQ();
      at.AR();
      ((ad)localObject).kAC = new com.tencent.mm.plugin.exdevice.f.b.b.d(com.tencent.mm.y.c.yH());
    }
    Object localObject = atQ().kAC;
    GMTrace.o(10937939525632L, 81494);
    return (com.tencent.mm.plugin.exdevice.f.b.b.d)localObject;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.b.a atT()
  {
    GMTrace.i(10938073743360L, 81495);
    com.tencent.mm.kernel.h.xw().wG();
    if (atQ().kAD == null)
    {
      localObject = atQ();
      at.AR();
      ((ad)localObject).kAD = new com.tencent.mm.plugin.exdevice.f.b.b.a(com.tencent.mm.y.c.yH());
    }
    Object localObject = atQ().kAD;
    GMTrace.o(10938073743360L, 81495);
    return (com.tencent.mm.plugin.exdevice.f.b.b.a)localObject;
  }
  
  public static com.tencent.mm.ao.a.a atU()
  {
    GMTrace.i(10938207961088L, 81496);
    if (atQ().kAL == null) {
      atQ().kAL = com.tencent.mm.ao.n.Jd();
    }
    com.tencent.mm.ao.a.a locala = atQ().kAL;
    GMTrace.o(10938207961088L, 81496);
    return locala;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.b.b atV()
  {
    GMTrace.i(10938476396544L, 81498);
    com.tencent.mm.kernel.h.xw().wG();
    if (atQ().kAE == null)
    {
      localObject = atQ();
      at.AR();
      ((ad)localObject).kAE = new com.tencent.mm.plugin.exdevice.f.b.b.b(com.tencent.mm.y.c.yH());
    }
    Object localObject = atQ().kAE;
    GMTrace.o(10938476396544L, 81498);
    return (com.tencent.mm.plugin.exdevice.f.b.b.b)localObject;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.b.e atW()
  {
    GMTrace.i(10938610614272L, 81499);
    com.tencent.mm.kernel.h.xw().wG();
    if (atQ().kAF == null)
    {
      localObject = atQ();
      at.AR();
      ((ad)localObject).kAF = new com.tencent.mm.plugin.exdevice.f.b.b.e(com.tencent.mm.y.c.yH());
    }
    Object localObject = atQ().kAF;
    GMTrace.o(10938610614272L, 81499);
    return (com.tencent.mm.plugin.exdevice.f.b.b.e)localObject;
  }
  
  public static b atX()
  {
    GMTrace.i(10938744832000L, 81500);
    com.tencent.mm.kernel.h.xw().wG();
    if (atQ().kAA == null) {
      atQ().kAA = new b();
    }
    b localb = atQ().kAA;
    GMTrace.o(10938744832000L, 81500);
    return localb;
  }
  
  public static d atY()
  {
    GMTrace.i(10938879049728L, 81501);
    if (atQ().kAH == null) {
      atQ().kAH = new d();
    }
    d locald = atQ().kAH;
    GMTrace.o(10938879049728L, 81501);
    return locald;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.c atZ()
  {
    GMTrace.i(10939013267456L, 81502);
    if (atQ().kAI == null) {
      atQ().kAI = new com.tencent.mm.plugin.exdevice.f.b.c();
    }
    com.tencent.mm.plugin.exdevice.f.b.c localc = atQ().kAI;
    GMTrace.o(10939013267456L, 81502);
    return localc;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.a aua()
  {
    GMTrace.i(10939147485184L, 81503);
    if (atQ().kAJ == null) {
      atQ().kAJ = new com.tencent.mm.plugin.exdevice.f.b.a();
    }
    com.tencent.mm.plugin.exdevice.f.b.a locala = atQ().kAJ;
    GMTrace.o(10939147485184L, 81503);
    return locala;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.a.c aub()
  {
    GMTrace.i(10939281702912L, 81504);
    if (atQ().kAK == null) {
      atQ().kAK = new com.tencent.mm.plugin.exdevice.f.a.c();
    }
    com.tencent.mm.plugin.exdevice.f.a.c localc = atQ().kAK;
    GMTrace.o(10939281702912L, 81504);
    return localc;
  }
  
  public static e auc()
  {
    GMTrace.i(10939415920640L, 81505);
    if (atQ().kAG == null) {
      atQ().kAG = new e();
    }
    e locale = atQ().kAG;
    GMTrace.o(10939415920640L, 81505);
    return locale;
  }
  
  public static h aud()
  {
    GMTrace.i(10940087009280L, 81510);
    if (atQ().kAO == null) {
      atQ().kAO = new h();
    }
    h localh = atQ().kAO;
    GMTrace.o(10940087009280L, 81510);
    return localh;
  }
  
  public static com.tencent.mm.ao.a.a.c wI(String paramString)
  {
    GMTrace.i(10938342178816L, 81497);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.exdevice.SubCoreExDevice", "newImageOptions failed, url is null or nil, return default.");
      paramString = atQ();
      if (paramString.kAM == null)
      {
        c.a locala = new c.a();
        com.tencent.mm.ao.n.Je();
        locala.gKX = null;
        locala.gKJ = 640;
        locala.gKI = 640;
        locala.gKA = false;
        locala.gKC = true;
        paramString.kAM = locala.Jn();
      }
      paramString = atQ().kAM;
      GMTrace.o(10938342178816L, 81497);
      return paramString;
    }
    paramString = new c.a();
    paramString.gKJ = 640;
    paramString.gKI = 640;
    paramString.gKA = false;
    paramString.gKB = true;
    at.AR();
    paramString.gKF = com.tencent.mm.y.c.yU();
    paramString = paramString.Jn();
    GMTrace.o(10938342178816L, 81497);
    return paramString;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(10939684356096L, 81507);
    at.AR();
    com.tencent.mm.y.c.yK().a(this.kAQ);
    Object localObject = k.ats();
    at.wS().a(538, (com.tencent.mm.ad.e)localObject);
    this.kAN = new af();
    com.tencent.mm.sdk.b.a.vgX.b(this.kAz);
    at.getSysCmdMsgExtension().a("wcdevicemsg", this.kAP, true);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxR);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxS);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxT);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kym);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxQ);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxP);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxU);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxV);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxW);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyn);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxX);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxY);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kxZ);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyb);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kya);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyf);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyd);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kye);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyg);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyo);
    com.tencent.mm.sdk.b.a.vgX.b(auc().jiK);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyc);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyh);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyi);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyj);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyk);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyx);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyy);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyz);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyB);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyA);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyr);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kys);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyt);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyu);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyv);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyw);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyp);
    com.tencent.mm.sdk.b.a.vgX.b(auc().kyq);
    localObject = i.kzF;
    w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "addSceneEndListener");
    at.wS().a(539, (com.tencent.mm.ad.e)localObject);
    com.tencent.mm.compatible.a.a.a(19, new a.a()
    {
      public final void run()
      {
        GMTrace.i(10966930554880L, 81710);
        ad localad = ad.this;
        try
        {
          com.tencent.mm.sdk.platformtools.af.i(new ad.2(localad), 30000L);
          GMTrace.o(10966930554880L, 81710);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.exdevice.SubCoreExDevice", "[hakon][step] exception in deviceFeaturesKVStat, %s", new Object[] { localException.getMessage() });
          w.printErrStackTrace("MicroMsg.exdevice.SubCoreExDevice", localException, "", new Object[0]);
          GMTrace.o(10966930554880L, 81710);
        }
      }
    });
    GMTrace.o(10939684356096L, 81507);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(10939818573824L, 81508);
    GMTrace.o(10939818573824L, 81508);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(10939550138368L, 81506);
    GMTrace.o(10939550138368L, 81506);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(10939952791552L, 81509);
    at.AR();
    com.tencent.mm.y.c.yK().b(this.kAQ);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kxR);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kxS);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kxT);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kym);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyo);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kxQ);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kxP);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kxU);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kxV);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kxW);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyn);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyx);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyy);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyz);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyB);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyA);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyr);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kys);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyt);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyu);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyv);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyw);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kxY);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyp);
    com.tencent.mm.sdk.b.a.vgX.c(auc().kyq);
    w.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "releaseAllSharePreferences");
    Object localObject1 = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localObject1 == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
      localObject1 = u.aus();
      w.i("MicroMsg.exdevice.ExdeviceInfoManager", "delAllDeviceAuthFlag");
      if (((f)localObject1).kDb != null) {
        break label604;
      }
      w.e("MicroMsg.exdevice.ExdeviceInfoManager", "null == exdeviceInfoList");
    }
    for (;;)
    {
      localObject1 = k.ats();
      at.wS().b(538, (com.tencent.mm.ad.e)localObject1);
      k.kwY = null;
      com.tencent.mm.sdk.b.a.vgX.c(this.kAz);
      at.getSysCmdMsgExtension().b("wcdevicemsg", this.kAP, true);
      com.tencent.mm.sdk.b.a.vgX.c(auc().kxX);
      if (atQ().kAA != null) {
        atQ();
      }
      localObject1 = i.kzF;
      w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "removeSceneEndListener");
      at.wS().b(539, (com.tencent.mm.ad.e)localObject1);
      localObject1 = atQ().kAH;
      if ((((d)localObject1).kxw == null) || (((d)localObject1).kxw.isEmpty())) {
        break label669;
      }
      Object localObject2 = ((d)localObject1).kxw.entrySet().iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((aj)((Map.Entry)((Iterator)localObject2).next()).getValue()).stopTimer();
      }
      if (((SharedPreferences)localObject1).edit().clear().commit()) {
        break;
      }
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().clear().commit() Failed!!!");
      break;
      label604:
      localObject1 = ((f)localObject1).kDb.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        f.a locala = (f.a)((Map.Entry)localObject2).getValue();
        locala.kDf = false;
        ((Map.Entry)localObject2).setValue(locala);
      }
    }
    ((d)localObject1).kxw.clear();
    label669:
    if (atQ().kAI != null)
    {
      localObject1 = atQ().kAI;
      at.wS().b(1042, (com.tencent.mm.ad.e)localObject1);
      at.wS().b(1041, (com.tencent.mm.ad.e)localObject1);
      at.wS().b(1043, (com.tencent.mm.ad.e)localObject1);
      at.wS().b(1040, (com.tencent.mm.ad.e)localObject1);
    }
    if (atQ().kAL != null) {
      atQ().kAL.detach();
    }
    localObject1 = this.kAN;
    com.tencent.mm.sdk.b.a.vgX.c(((af)localObject1).fJv);
    GMTrace.o(10939952791552L, 81509);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(10937536872448L, 81491);
    HashMap localHashMap = fIv;
    GMTrace.o(10937536872448L, 81491);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */