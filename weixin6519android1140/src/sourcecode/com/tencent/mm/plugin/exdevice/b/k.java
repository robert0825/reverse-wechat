package com.tencent.mm.plugin.exdevice.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.bp;
import com.tencent.mm.plugin.exdevice.i.h;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.ahb;
import com.tencent.mm.protocal.c.bbn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;
import java.util.HashMap;
import junit.framework.Assert;

public final class k
  implements com.tencent.mm.ad.e
{
  public static k kwY;
  public final HashMap<Long, e> kwX;
  public HashMap<String, Integer> kwZ;
  public com.tencent.mm.sdk.platformtools.ae mHandler;
  
  static
  {
    GMTrace.i(11204361715712L, 83479);
    kwY = null;
    GMTrace.o(11204361715712L, 83479);
  }
  
  private k()
  {
    GMTrace.i(11203690627072L, 83474);
    this.kwX = new HashMap();
    this.mHandler = null;
    this.kwZ = new HashMap();
    this.mHandler = new a(at.xB().ngv.getLooper());
    GMTrace.o(11203690627072L, 83474);
  }
  
  public static k ats()
  {
    GMTrace.i(11203556409344L, 83473);
    if (kwY != null)
    {
      localk = kwY;
      GMTrace.o(11203556409344L, 83473);
      return localk;
    }
    k localk = new k();
    kwY = localk;
    GMTrace.o(11203556409344L, 83473);
    return localk;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11203824844800L, 83475);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "******onSceneEnd******\r\n errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    b localb = new b();
    localb.kwP = paramInt2;
    localb.kxb = paramInt1;
    localb.kxc = paramString;
    localb.kxd = paramk;
    this.mHandler.obtainMessage(2, localb).sendToTarget();
    GMTrace.o(11203824844800L, 83475);
  }
  
  private final class a
    extends com.tencent.mm.sdk.platformtools.ae
  {
    public a(Looper paramLooper)
    {
      super();
      GMTrace.i(11199395659776L, 83442);
      GMTrace.o(11199395659776L, 83442);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(11199529877504L, 83443);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "handleMessage msg.what = %d", new Object[] { Integer.valueOf(paramMessage.what) });
      long l;
      switch (paramMessage.what)
      {
      default: 
        com.tencent.mm.sdk.platformtools.w.f("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "unknown message type = %d", new Object[] { Integer.valueOf(paramMessage.what) });
        GMTrace.o(11199529877504L, 83443);
        return;
      case 1: 
        localObject2 = (f)paramMessage.obj;
        if (!u.aus().bL(((c)localObject2).joF))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "This device send other cmd before do auth, device id = %d", new Object[] { Long.valueOf(((c)localObject2).joF) });
          ((f)localObject2).b(-2, "", new byte[0]);
          paramMessage = new h((f)localObject2);
          u.aut().a(paramMessage);
          GMTrace.o(11199529877504L, 83443);
          return;
        }
        if ((-5 == paramMessage.arg1) || (-3 == paramMessage.arg1) || (-4 == paramMessage.arg1))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Error Code = %d, reply errorcode to device and close channel", new Object[] { Integer.valueOf(paramMessage.arg1) });
          ((f)localObject2).b(-1, "", new byte[0]);
          paramMessage = new h((f)localObject2);
          u.aut().a(paramMessage);
          GMTrace.o(11199529877504L, 83443);
          return;
        }
        com.tencent.mm.plugin.exdevice.h.b localb = ad.atR().wS(((c)localObject2).joF);
        if (localb == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
          GMTrace.o(11199529877504L, 83443);
          return;
        }
        l = localb.fsC;
        if (System.currentTimeMillis() / 1000L < l)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "device has been blocked");
          ((f)localObject2).b(-5, "Device Is Block", null);
          paramMessage = new h((f)localObject2);
          u.aut().a(paramMessage);
          GMTrace.o(11199529877504L, 83443);
          return;
        }
        l = k.f.atv();
        com.tencent.mm.plugin.exdevice.e.k localk = (com.tencent.mm.plugin.exdevice.e.k)((f)localObject2).atq();
        if (localk == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SendDataToManufacturerSvr Request parse failed!!!, Tell device before stop this task");
          ((f)localObject2).b(-4, "Decode failed", null);
          paramMessage = new h((f)localObject2);
          u.aut().a(paramMessage);
          GMTrace.o(11199529877504L, 83443);
          return;
        }
        localObject1 = (Integer)k.this.kwZ.get(localb.field_deviceID);
        paramMessage = (Message)localObject1;
        if (localObject1 == null) {
          paramMessage = Integer.valueOf(0);
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SendDataDirection = %s", new Object[] { paramMessage });
        if (paramMessage.intValue() == 0)
        {
          if (localk.jib == 10001)
          {
            ad.auc();
            com.tencent.mm.plugin.exdevice.model.e.c(localb.field_deviceID, localb.field_brandName, localk.jgP.toByteArray());
            GMTrace.o(11199529877504L, 83443);
            return;
          }
          paramMessage = new com.tencent.mm.plugin.exdevice.model.w(((c)localObject2).joF, localb.field_deviceType, localb.field_deviceID, l, bg.Pv(), localk.jgP.toByteArray(), localk.jib);
          at.wS().a(paramMessage, 0);
          paramMessage = new k.d(k.this, l);
          k.this.mHandler.postDelayed(paramMessage, 30000L);
          localObject1 = new k.e();
          ((k.e)localObject1).a((f)localObject2);
          ((k.e)localObject1).a(paramMessage);
          ((k.e)localObject1).kxh = 0;
          k.this.kwX.put(Long.valueOf(l), localObject1);
          GMTrace.o(11199529877504L, 83443);
          return;
        }
        if ((paramMessage.intValue() & 0x1) != 0)
        {
          ad.auc();
          com.tencent.mm.plugin.exdevice.model.e.c(localb.field_deviceID, localb.field_brandName, localk.jgP.toByteArray());
        }
        if ((paramMessage.intValue() & 0x2) != 0)
        {
          paramMessage = new com.tencent.mm.plugin.exdevice.model.w(((c)localObject2).joF, localb.field_deviceType, localb.field_deviceID, l, bg.Pv(), localk.jgP.toByteArray(), localk.jib);
          at.wS().a(paramMessage, 0);
          paramMessage = new k.d(k.this, l);
          k.this.mHandler.postDelayed(paramMessage, 30000L);
          localObject1 = new k.e();
          ((k.e)localObject1).a((f)localObject2);
          ((k.e)localObject1).a(paramMessage);
          ((k.e)localObject1).kxh = 0;
          k.this.kwX.put(Long.valueOf(l), localObject1);
        }
        GMTrace.o(11199529877504L, 83443);
        return;
      case 2: 
        paramMessage = (k.b)paramMessage.obj;
        if ((paramMessage.kxb == 0) && (paramMessage.kwP == 0))
        {
          GMTrace.o(11199529877504L, 83443);
          return;
        }
        localObject1 = (com.tencent.mm.plugin.exdevice.model.w)paramMessage.kxd;
        Assert.assertNotNull(((com.tencent.mm.plugin.exdevice.model.w)localObject1).kzP);
        l = ((bbn)((com.tencent.mm.plugin.exdevice.model.w)localObject1).kzP.gtC.gtK).uOL.uwB;
        localObject1 = (k.e)k.this.kwX.get(Long.valueOf(l));
        if (localObject1 == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = %d", new Object[] { Long.valueOf(l) });
          GMTrace.o(11199529877504L, 83443);
          return;
        }
        localObject2 = ((k.e)localObject1).att();
        switch (paramMessage.kwP)
        {
        }
        for (int i = -1;; i = -5)
        {
          ((f)localObject2).b(i, paramMessage.kxc, null);
          paramMessage = new h(((k.e)localObject1).att());
          u.aut().a(paramMessage);
          k.this.mHandler.removeCallbacks(((k.e)localObject1).atu());
          k.this.kwX.remove(Long.valueOf(l));
          GMTrace.o(11199529877504L, 83443);
          return;
        }
      case 0: 
        l = ((Long)paramMessage.obj).longValue();
        paramMessage = (k.e)k.this.kwX.get(Long.valueOf(l));
        if (paramMessage == null)
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId(%d), or response has been send", new Object[] { Long.valueOf(l) });
          GMTrace.o(11199529877504L, 83443);
          return;
        }
        paramMessage.att().b(-1, "", null);
        paramMessage = new h(paramMessage.att());
        u.aut().a(paramMessage);
        k.this.kwX.remove(Long.valueOf(l));
        GMTrace.o(11199529877504L, 83443);
        return;
      }
      paramMessage = (k.c)paramMessage.obj;
      Object localObject1 = (k.e)k.this.kwX.get(Long.valueOf(paramMessage.mSessionId));
      if (localObject1 == null)
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = %d", new Object[] { Long.valueOf(paramMessage.mSessionId) });
        GMTrace.o(11199529877504L, 83443);
        return;
      }
      ((k.e)localObject1).kxf.b(0, "", paramMessage.jkV);
      Object localObject2 = new h(((k.e)localObject1).att());
      u.aut().a((com.tencent.mm.plugin.exdevice.model.ae)localObject2);
      k.this.mHandler.removeCallbacks(((k.e)localObject1).atu());
      k.this.kwX.remove(Long.valueOf(paramMessage.mSessionId));
      GMTrace.o(11199529877504L, 83443);
    }
  }
  
  private static final class b
  {
    public int kwP;
    public int kxb;
    public String kxc;
    public com.tencent.mm.ad.k kxd;
    
    public b()
    {
      GMTrace.i(11202482667520L, 83465);
      this.kwP = 0;
      this.kxb = 0;
      this.kxc = null;
      this.kxd = null;
      GMTrace.o(11202482667520L, 83465);
    }
  }
  
  private static final class c
  {
    public byte[] jkV;
    public long mSessionId;
    
    public c()
    {
      GMTrace.i(11201006272512L, 83454);
      this.mSessionId = 0L;
      this.jkV = null;
      GMTrace.o(11201006272512L, 83454);
    }
  }
  
  private final class d
    implements Runnable
  {
    private long kxe;
    
    public d(long paramLong)
    {
      GMTrace.i(11198187700224L, 83433);
      this.kxe = -1L;
      if (paramLong >= 0L) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        this.kxe = paramLong;
        GMTrace.o(11198187700224L, 83433);
        return;
      }
    }
    
    public final void run()
    {
      GMTrace.i(11198321917952L, 83434);
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Time Out Sequnence(%d)", new Object[] { Long.valueOf(this.kxe) });
      k.this.mHandler.obtainMessage(0, Long.valueOf(this.kxe)).sendToTarget();
      GMTrace.o(11198321917952L, 83434);
    }
  }
  
  private static final class e
  {
    public f kxf;
    private k.d kxg;
    int kxh;
    
    public e()
    {
      GMTrace.i(11202751102976L, 83467);
      this.kxf = null;
      this.kxg = null;
      this.kxh = 0;
      GMTrace.o(11202751102976L, 83467);
    }
    
    public final void a(f paramf)
    {
      GMTrace.i(11202885320704L, 83468);
      Assert.assertNotNull(paramf);
      this.kxf = paramf;
      GMTrace.o(11202885320704L, 83468);
    }
    
    public final void a(k.d paramd)
    {
      GMTrace.i(11203019538432L, 83469);
      Assert.assertNotNull(paramd);
      this.kxg = paramd;
      GMTrace.o(11203019538432L, 83469);
    }
    
    public final f att()
    {
      GMTrace.i(11203153756160L, 83470);
      Assert.assertNotNull(this.kxf);
      f localf = this.kxf;
      GMTrace.o(11203153756160L, 83470);
      return localf;
    }
    
    public final k.d atu()
    {
      GMTrace.i(11203287973888L, 83471);
      Assert.assertNotNull(this.kxg);
      k.d locald = this.kxg;
      GMTrace.o(11203287973888L, 83471);
      return locald;
    }
  }
  
  public static final class f
  {
    private static f kxj;
    private long kxi;
    
    static
    {
      GMTrace.i(11201543143424L, 83458);
      kxj = null;
      GMTrace.o(11201543143424L, 83458);
    }
    
    public f()
    {
      GMTrace.i(11201274707968L, 83456);
      SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("exdevice_pref", 0);
      if (localSharedPreferences != null)
      {
        l = localSharedPreferences.getLong("local_message_seq", 0L);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.Util", "lasted seq id is %d", new Object[] { Long.valueOf(l) });
      }
      this.kxi = l;
      GMTrace.o(11201274707968L, 83456);
    }
    
    public static long atv()
    {
      GMTrace.i(11201408925696L, 83457);
      if (kxj == null) {
        kxj = new f();
      }
      Object localObject = kxj;
      if (Long.MAX_VALUE == ((f)localObject).kxi)
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.MMSendDataToManufacturerLogic", "Sequence Data-overrun!!!");
        ((f)localObject).kxi = 0L;
      }
      long l = ((f)localObject).kxi + 1L;
      ((f)localObject).kxi = l;
      localObject = ab.getContext().getSharedPreferences("exdevice_pref", 0);
      if (localObject != null)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.Util", "save locall seq id : %d", new Object[] { Long.valueOf(l) });
        ((SharedPreferences)localObject).edit().putLong("local_message_seq", l).commit();
      }
      GMTrace.o(11201408925696L, 83457);
      return l;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */