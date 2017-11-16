package com.tencent.mm.modelstat;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ba.b.1;
import com.tencent.mm.kernel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import junit.framework.Assert;

public class e
{
  private static e gXx;
  public int gXA;
  public int gXB;
  public int gXC;
  public ArrayList<Pair<Float, Float>> gXD;
  public ArrayList<Pair<Float, Float>> gXE;
  private int gXy;
  public int gXz;
  public long startTime;
  
  public e()
  {
    GMTrace.i(1374657970176L, 10242);
    this.startTime = 0L;
    this.gXy = -1;
    this.gXz = 20000;
    this.gXA = 3000;
    this.gXB = 1000;
    this.gXC = 20;
    this.gXD = new ArrayList();
    this.gXE = new ArrayList();
    GMTrace.o(1374657970176L, 10242);
  }
  
  public static e Mk()
  {
    GMTrace.i(1374792187904L, 10243);
    if (gXx == null) {}
    try
    {
      if (gXx == null) {
        gXx = new e();
      }
      e locale = gXx;
      GMTrace.o(1374792187904L, 10243);
      return locale;
    }
    finally {}
  }
  
  public static boolean n(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(16012711821312L, 119304);
    if (Math.abs(paramFloat1 - paramFloat2) < Math.pow(0.1D, 2.0D))
    {
      GMTrace.o(16012711821312L, 119304);
      return true;
    }
    GMTrace.o(16012711821312L, 119304);
    return false;
  }
  
  public final void a(final int paramInt1, final boolean paramBoolean1, final boolean paramBoolean2, final float paramFloat1, final float paramFloat2, final int paramInt2)
  {
    GMTrace.i(1374926405632L, 10244);
    w.i("MicroMsg.IndoorReporter", "report scene:%d agps:%b mars:%b lon:%f lat:%f acc:%d", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt2) });
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      com.tencent.mm.kernel.h.xw();
      if (!a.wF()) {}
    }
    else
    {
      GMTrace.o(1374926405632L, 10244);
      return;
    }
    com.tencent.mm.ba.b localb = com.tencent.mm.ba.b.KM();
    int i;
    if (paramBoolean2)
    {
      i = 1;
      if (com.tencent.mm.kernel.h.xw().wL())
      {
        com.tencent.mm.kernel.h.xw();
        if (!a.wF()) {
          break label177;
        }
      }
    }
    for (;;)
    {
      if ((this.gXE.size() != 0) || (this.gXD.size() != 0) || (lE(com.tencent.mm.k.g.ut().getValue("AndroidIndoorSensorReport")))) {
        break label214;
      }
      GMTrace.o(1374926405632L, 10244);
      return;
      i = 0;
      break;
      label177:
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xB().A(new b.1(localb, i, paramFloat1, paramFloat2, paramInt1, paramInt2, 0, "", ""));
    }
    label214:
    if (!com.tencent.mm.sdk.a.b.bPq())
    {
      com.tencent.mm.kernel.h.xw();
      i = com.tencent.mm.a.h.aw(a.ww() + 5, 100);
      if (i > this.gXy)
      {
        com.tencent.mm.kernel.h.xw();
        w.d("MicroMsg.IndoorReporter", "report uin:%s hash:%d config:%d", new Object[] { Long.valueOf(new o(a.ww()).longValue()), Integer.valueOf(i), Integer.valueOf(this.gXy) });
        GMTrace.o(1374926405632L, 10244);
        return;
      }
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1394790629376L, 10392);
        for (;;)
        {
          try
          {
            boolean bool;
            if (com.tencent.mm.kernel.h.xw().wL())
            {
              com.tencent.mm.kernel.h.xw();
              bool = a.wF();
              if (!bool) {}
            }
            else
            {
              GMTrace.o(1394790629376L, 10392);
              return;
            }
            long l = bg.Pv();
            if ((e.this.startTime != 0L) && (l - e.this.startTime < 1800000L))
            {
              w.e("MicroMsg.IndoorReporter", "Ignore this Report,Another Report is Running & not timeout:%d.", new Object[] { Long.valueOf(l - e.this.startTime) });
              GMTrace.o(1394790629376L, 10392);
              return;
            }
            if (paramBoolean2)
            {
              localObject1 = e.this.gXD;
              break label754;
              if (i >= ((List)localObject1).size()) {
                break label748;
              }
              if ((!e.n(paramFloat1, ((Float)((Pair)((List)localObject1).get(i)).first).floatValue())) || (!e.n(paramFloat2, ((Float)((Pair)((List)localObject1).get(i)).second).floatValue()))) {
                break label759;
              }
              localObject1 = (Pair)((List)localObject1).get(i);
              if (localObject1 == null)
              {
                w.d("MicroMsg.IndoorReporter", "Ignore this report, no hit any Point");
                GMTrace.o(1394790629376L, 10392);
              }
            }
            else
            {
              localObject1 = e.this.gXE;
              break label754;
            }
            e.this.startTime = l;
            final Object localObject3 = new StringBuilder();
            com.tencent.mm.kernel.h.xw();
            localObject3 = new o(a.ww()).toString() + "_" + e.this.startTime;
            final Object localObject1 = new StringBuilder().append(((Pair)localObject1).first).append(",").append(((Pair)localObject1).second).append(",").append(paramInt1).append(",");
            final e.c localc;
            final Object localObject4;
            if (paramBoolean1)
            {
              i = 1;
              if (paramBoolean2)
              {
                j = 10;
                localObject1 = j + i + "," + paramFloat1 + "," + paramFloat2 + ",0," + paramInt2 + "," + e.this.startTime + ",";
                localc = new e.c(e.this);
                localObject4 = ab.getContext();
                i = e.this.gXA;
                j = e.this.gXC;
                if (localc.aKk == null) {
                  localc.aKk = ((WifiManager)((Context)localObject4).getSystemService("wifi"));
                }
                localc.gYe = i;
                localc.gXC = j;
                localc.startTime = bg.Pv();
                localc.gYf = true;
                localc.thread.start();
                localObject4 = new e.b(e.this);
                bool = ((e.b)localObject4).s(ab.getContext(), e.this.gXB);
                if (bool) {
                  continue;
                }
                w.e("MicroMsg.IndoorReporter", "Ignore this report. Error:start wifi:%b sensor:%b  ", new Object[] { Boolean.valueOf(true), Boolean.valueOf(bool) });
                ((e.b)localObject4).Ml();
                localc.Ml();
                com.tencent.mm.plugin.report.service.g.ork.A(13381, (String)localObject1 + (String)localObject3 + ",-10002,ERROR:StartFailed.");
                GMTrace.o(1394790629376L, 10392);
              }
            }
            else
            {
              i = 2;
              continue;
            }
            int j = 20;
            continue;
            com.tencent.mm.kernel.h.xz();
            new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
            {
              boolean gXL;
              
              public final boolean pM()
              {
                GMTrace.i(1390764097536L, 10362);
                boolean bool = l.cR(ab.getContext());
                long l1 = bg.Pv();
                long l2 = l1 - e.this.startTime;
                if (l2 <= e.this.gXz)
                {
                  if (bool)
                  {
                    this.gXL = false;
                    GMTrace.o(1390764097536L, 10362);
                    return true;
                  }
                  if (!this.gXL)
                  {
                    this.gXL = true;
                    GMTrace.o(1390764097536L, 10362);
                    return true;
                  }
                }
                w.i("MicroMsg.IndoorReporter", "Stop Now goingbg:%b fg:%b runtime:%d", new Object[] { Boolean.valueOf(this.gXL), Boolean.valueOf(bool), Long.valueOf(l2) });
                e.this.startTime = 0L;
                String str = localObject4.Ml();
                Object localObject = localc.Ml();
                try
                {
                  StringBuilder localStringBuilder;
                  if ((bg.nm(str)) || (bg.nm((String)localObject)))
                  {
                    w.e("MicroMsg.IndoorReporter", "get Res Failed [%s][%s]", new Object[] { str, localObject });
                    localObject = com.tencent.mm.plugin.report.service.g.ork;
                    localStringBuilder = new StringBuilder().append(localObject1).append(localObject3);
                    if (!bg.nm(str)) {}
                    for (str = ",-10011,ERROR:StopFailed.";; str = ",-10012,ERROR:StopFailed.")
                    {
                      ((com.tencent.mm.plugin.report.service.g)localObject).A(13381, str);
                      GMTrace.o(1390764097536L, 10362);
                      return false;
                    }
                  }
                  localObject = str + (String)localObject;
                  int j = (int)Math.ceil(((String)localObject).length() / 5400.0D);
                  int i = 0;
                  if (i < j)
                  {
                    localStringBuilder = new StringBuilder().append(localObject1).append(localObject3).append("_").append(l1).append("_").append(j).append("_");
                    if (l2 > e.this.gXz) {}
                    for (str = "1";; str = "2")
                    {
                      str = str + "," + (i + 1) + "," + ((String)localObject).substring(i * 5400, Math.min((i + 1) * 5400, ((String)localObject).length()));
                      w.i("MicroMsg.IndoorReporter", "reportKV [%d/%d] res:%d kv:%d [%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(((String)localObject).length()), Integer.valueOf(str.length()), str });
                      com.tencent.mm.plugin.report.service.g.ork.A(13381, str);
                      i += 1;
                      break;
                    }
                  }
                  return false;
                }
                catch (Exception localException)
                {
                  w.e("MicroMsg.IndoorReporter", "reprot Stop exception:%s", new Object[] { localException.getMessage() });
                  GMTrace.o(1390764097536L, 10362);
                }
              }
            }, true).z(3000L, 3000L);
            GMTrace.o(1394790629376L, 10392);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.IndoorReporter", "reprot Start exception:%s", new Object[] { localException.getMessage() });
            GMTrace.o(1394790629376L, 10392);
            return;
          }
          label748:
          Object localObject2 = null;
          continue;
          label754:
          int i = 0;
          continue;
          label759:
          i += 1;
        }
      }
    });
    GMTrace.o(1374926405632L, 10244);
  }
  
  public final boolean lE(String paramString)
  {
    GMTrace.i(1375060623360L, 10245);
    if (bg.nm(paramString))
    {
      GMTrace.o(1375060623360L, 10245);
      return false;
    }
    for (;;)
    {
      int j;
      int i;
      try
      {
        String[] arrayOfString1 = paramString.split(",");
        this.gXy = bg.getInt(arrayOfString1[0], -1);
        if (this.gXy > 101) {
          Assert.assertTrue(false);
        }
        this.gXz = bg.getInt(arrayOfString1[1], 20000);
        this.gXA = bg.getInt(arrayOfString1[2], 3000);
        this.gXB = bg.getInt(arrayOfString1[3], 1000);
        this.gXC = bg.getInt(arrayOfString1[4], 20);
        j = bg.getInt(arrayOfString1[5], 0);
        i = 0;
        if (i < j)
        {
          String[] arrayOfString2 = arrayOfString1[(i + 6)].split(";");
          if ("1".equals(arrayOfString2[0])) {
            this.gXD.add(new Pair(Float.valueOf(bg.SB(arrayOfString2[1])), Float.valueOf(bg.SB(arrayOfString2[2]))));
          } else {
            this.gXE.add(new Pair(Float.valueOf(bg.SB(arrayOfString2[1])), Float.valueOf(bg.SB(arrayOfString2[2]))));
          }
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.IndoorReporter", "parseConfig e:%s  [%s]", new Object[] { localException.getMessage(), paramString });
        GMTrace.o(1375060623360L, 10245);
        return false;
      }
      w.i("MicroMsg.IndoorReporter", "parseConfig: max:%d wifiFreq:%d sensorFreq:%d maxWifiCount:%d cnt:%d mars:%d earth:%d", new Object[] { Integer.valueOf(this.gXz), Integer.valueOf(this.gXA), Integer.valueOf(this.gXB), Integer.valueOf(this.gXC), Integer.valueOf(j), Integer.valueOf(this.gXD.size()), Integer.valueOf(this.gXE.size()) });
      GMTrace.o(1375060623360L, 10245);
      return true;
      i += 1;
    }
  }
  
  static final class a
  {
    public int accuracy;
    public float[] values;
    
    public a(SensorEvent paramSensorEvent)
    {
      GMTrace.i(16866873442304L, 125668);
      this.accuracy = 0;
      if (paramSensorEvent != null)
      {
        this.accuracy = paramSensorEvent.accuracy;
        this.values = new float[paramSensorEvent.values.length];
        System.arraycopy(paramSensorEvent.values, 0, this.values, 0, paramSensorEvent.values.length);
      }
      GMTrace.o(16866873442304L, 125668);
    }
  }
  
  final class b
  {
    private SensorManager gXR;
    public long gXS;
    e.a gXT;
    e.a gXU;
    e.a gXV;
    private Long gXW;
    ArrayList<Long> gXX;
    ArrayList<e.a> gXY;
    ArrayList<e.a> gXZ;
    ArrayList<e.a> gYa;
    ArrayList<float[]> gYb;
    private SensorEventListener gYc;
    long goZ;
    private HandlerThread handlerThread;
    
    b()
    {
      GMTrace.i(1397206548480L, 10410);
      this.gXS = 0L;
      this.handlerThread = null;
      this.gXT = null;
      this.gXU = null;
      this.gXV = null;
      this.gXW = null;
      this.goZ = 0L;
      this.gXX = new ArrayList();
      this.gXY = new ArrayList();
      this.gXZ = new ArrayList();
      this.gYa = new ArrayList();
      this.gYb = new ArrayList();
      this.gYc = new SensorEventListener()
      {
        public final void onAccuracyChanged(Sensor paramAnonymousSensor, int paramAnonymousInt)
        {
          GMTrace.i(1391569403904L, 10368);
          GMTrace.o(1391569403904L, 10368);
        }
        
        public final void onSensorChanged(SensorEvent paramAnonymousSensorEvent)
        {
          GMTrace.i(1391703621632L, 10369);
          if (paramAnonymousSensorEvent == null)
          {
            GMTrace.o(1391703621632L, 10369);
            return;
          }
          long l1 = bg.Pv();
          if (paramAnonymousSensorEvent.sensor.getType() == 1) {
            e.b.this.gXT = new e.a(paramAnonymousSensorEvent);
          }
          for (;;)
          {
            long l2 = l1 - e.b.this.goZ;
            if ((e.b.this.gXT != null) && (e.b.this.gXU != null) && (e.b.this.gXV != null) && ((l2 > e.b.this.gXS) || (l2 < 0L)))
            {
              paramAnonymousSensorEvent = new float[9];
              SensorManager.getRotationMatrix(paramAnonymousSensorEvent, null, e.b.this.gXT.values, e.b.this.gXU.values);
              float[] arrayOfFloat = new float[3];
              SensorManager.getOrientation(paramAnonymousSensorEvent, arrayOfFloat);
              e.b.this.goZ = l1;
              e.b.this.gXX.add(Long.valueOf(l1));
              e.b.this.gXY.add(e.b.this.gXT);
              e.b.this.gXZ.add(e.b.this.gXU);
              e.b.this.gYa.add(e.b.this.gXV);
              e.b.this.gYb.add(arrayOfFloat);
              int i = e.b.this.gXY.size() - 1;
              w.i("MicroMsg.IndoorReporter", "RES ,  %d  acc[%d,%f,%f,%f]  ", new Object[] { Integer.valueOf(e.b.this.gXY.size()), Integer.valueOf(((e.a)e.b.this.gXY.get(i)).accuracy), Float.valueOf(((e.a)e.b.this.gXY.get(i)).values[0]), Float.valueOf(((e.a)e.b.this.gXY.get(i)).values[1]), Float.valueOf(((e.a)e.b.this.gXY.get(i)).values[2]) });
              w.v("MicroMsg.IndoorReporter", "Res:%d acc[%d,%f,%f,%f] mag[%d,%f,%f,%f] gyr[%d,%f,%f,%f] ori[%f,%f,%f]", new Object[] { Long.valueOf(l2), Integer.valueOf(e.b.this.gXT.accuracy), Float.valueOf(e.b.this.gXT.values[0]), Float.valueOf(e.b.this.gXT.values[1]), Float.valueOf(e.b.this.gXT.values[2]), Integer.valueOf(e.b.this.gXU.accuracy), Float.valueOf(e.b.this.gXU.values[0]), Float.valueOf(e.b.this.gXU.values[1]), Float.valueOf(e.b.this.gXU.values[2]), Integer.valueOf(e.b.this.gXV.accuracy), Float.valueOf(e.b.this.gXV.values[0]), Float.valueOf(e.b.this.gXV.values[1]), Float.valueOf(e.b.this.gXV.values[2]), Float.valueOf(arrayOfFloat[0]), Float.valueOf(arrayOfFloat[1]), Float.valueOf(arrayOfFloat[2]) });
            }
            GMTrace.o(1391703621632L, 10369);
            return;
            if (paramAnonymousSensorEvent.sensor.getType() == 2) {
              e.b.this.gXU = new e.a(paramAnonymousSensorEvent);
            } else if (paramAnonymousSensorEvent.sensor.getType() == 4) {
              e.b.this.gXV = new e.a(paramAnonymousSensorEvent);
            }
          }
        }
      };
      GMTrace.o(1397206548480L, 10410);
    }
    
    private static String a(e.a parama)
    {
      GMTrace.i(16866739224576L, 125667);
      try
      {
        new String();
        parama = String.format("%d;%.3f;%.3f;%.3f;", new Object[] { Integer.valueOf(parama.accuracy), Float.valueOf(parama.values[0]), Float.valueOf(parama.values[1]), Float.valueOf(parama.values[2]) });
        GMTrace.o(16866739224576L, 125667);
        return parama;
      }
      catch (Exception parama)
      {
        GMTrace.o(16866739224576L, 125667);
      }
      return "0;0;0;0;";
    }
    
    public final String Ml()
    {
      GMTrace.i(1397474983936L, 10412);
      try
      {
        if (this.gXR != null)
        {
          this.gXR.unregisterListener(this.gYc);
          this.gXR = null;
        }
        try
        {
          if (this.handlerThread != null)
          {
            this.handlerThread.quit();
            this.handlerThread = null;
          }
          w.i("MicroMsg.IndoorReporter", "stop sampling Res Count: %d", new Object[] { Integer.valueOf(this.gXX.size()) });
          String str = this.gXW + ";" + this.gXX.size() + ";#";
          int i = 0;
          while (i < this.gXX.size())
          {
            str = str + (((Long)this.gXX.get(i)).longValue() - this.gXW.longValue()) + ";";
            str = str + a((e.a)this.gXY.get(i));
            w.i("MicroMsg.IndoorReporter", "%d accResArr [%d,%f,%f,%f]  %s", new Object[] { Integer.valueOf(i), Integer.valueOf(((e.a)this.gXY.get(i)).accuracy), Float.valueOf(((e.a)this.gXY.get(i)).values[0]), Float.valueOf(((e.a)this.gXY.get(i)).values[1]), Float.valueOf(((e.a)this.gXY.get(i)).values[2]), a((e.a)this.gXY.get(i)) });
            str = str + a((e.a)this.gYa.get(i));
            str = str + a((e.a)this.gXZ.get(i));
            str = str + String.format("%.3f;%.3f;%.3f;#", new Object[] { Float.valueOf(((float[])this.gYb.get(i))[0]), Float.valueOf(((float[])this.gYb.get(i))[1]), Float.valueOf(((float[])this.gYb.get(i))[2]) });
            i += 1;
          }
          w.i("MicroMsg.IndoorReporter", "stop  Res: %d [%s]", new Object[] { Integer.valueOf(str.length()), str });
          GMTrace.o(1397474983936L, 10412);
          return str;
        }
        catch (Exception localException1)
        {
          for (;;) {}
        }
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
    }
    
    public final boolean s(Context paramContext, int paramInt)
    {
      GMTrace.i(1397340766208L, 10411);
      try
      {
        if (this.gXR == null) {
          this.gXR = ((SensorManager)paramContext.getSystemService("sensor"));
        }
        if (this.handlerThread == null)
        {
          this.handlerThread = com.tencent.mm.sdk.f.e.cK("MicroMsg.IndoorReporter", 1);
          this.handlerThread.start();
        }
        paramContext = new Handler(this.handlerThread.getLooper());
        bool1 = this.gXR.registerListener(this.gYc, this.gXR.getDefaultSensor(1), 3, paramContext);
        boolean bool2 = this.gXR.registerListener(this.gYc, this.gXR.getDefaultSensor(4), 3, paramContext);
        boolean bool3 = this.gXR.registerListener(this.gYc, this.gXR.getDefaultSensor(2), 3, paramContext);
        if ((!bool1) || (!bool2) || (!bool3)) {
          break label226;
        }
        bool1 = true;
      }
      catch (Exception paramContext)
      {
        try
        {
          for (;;)
          {
            boolean bool1;
            if (this.gXR == null) {
              break label179;
            }
            this.gXR.unregisterListener(this.gYc);
            this.gXR = null;
            try
            {
              if (this.handlerThread == null) {
                break label199;
              }
              this.handlerThread.quit();
              this.handlerThread = null;
              this.gXS = paramInt;
              this.gXW = Long.valueOf(bg.Pv());
              GMTrace.o(1397340766208L, 10411);
              return bool1;
              bool1 = false;
              continue;
              paramContext = paramContext;
              w.e("MicroMsg.IndoorReporter", "start except:%s", new Object[] { paramContext.getMessage() });
              bool1 = false;
            }
            catch (Exception paramContext)
            {
              for (;;) {}
            }
          }
        }
        catch (Exception paramContext)
        {
          for (;;) {}
        }
      }
      if (bool1) {}
    }
  }
  
  final class c
  {
    public WifiManager aKk;
    public int gXC;
    public int gYe;
    public boolean gYf;
    public List<String> gYg;
    public long startTime;
    Thread thread;
    
    c()
    {
      GMTrace.i(1378281848832L, 10269);
      this.gYe = 0;
      this.gXC = 0;
      this.gYf = false;
      this.startTime = 0L;
      this.gYg = new ArrayList();
      this.thread = com.tencent.mm.sdk.f.e.b(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1394522193920L, 10390);
          w.i("MicroMsg.IndoorReporter", "start wifi");
          for (;;)
          {
            int k;
            int i;
            try
            {
              if (!e.c.this.gYf) {
                break label419;
              }
              long l = bg.Pv();
              List localList = e.c.this.aKk.getScanResults();
              Object localObject1 = "";
              if ((localList == null) || (localList.size() <= 0)) {
                break label432;
              }
              Collections.sort(localList, new Comparator() {});
              k = 0;
              i = 0;
              j = i;
              localObject2 = localObject1;
              if (k < localList.size())
              {
                localObject2 = (ScanResult)localList.get(k);
                if ((localObject2 == null) || (bg.nm(((ScanResult)localObject2).BSSID)) || (bg.nm(((ScanResult)localObject2).SSID))) {
                  break label429;
                }
                String str = ((ScanResult)localObject2).SSID.replace(";", "").replace(" ", "").replace(",", "").replace("#", "");
                localObject2 = (String)localObject1 + str + ";" + ((ScanResult)localObject2).BSSID + ";" + ((ScanResult)localObject2).level + ";";
                i += 1;
                if (i >= e.c.this.gXC) {
                  break label448;
                }
                localObject1 = localObject2;
                break label441;
              }
              localObject1 = new StringBuilder().append(l - e.c.this.startTime).append(";");
              if (localList != null)
              {
                i = localList.size();
                localObject1 = i + ";" + j + ";" + (String)localObject2;
                w.i("MicroMsg.IndoorReporter", "%d %s", new Object[] { Integer.valueOf(((String)localObject1).length()), localObject1 });
                e.c.this.gYg.add(localObject1);
                e.c.this.aKk.startScan();
                Thread.sleep(e.c.this.gYe);
                continue;
              }
              i = 0;
            }
            catch (Exception localException)
            {
              w.e("MicroMsg.IndoorReporter", "Except:%s", new Object[] { localException.getMessage() });
              GMTrace.o(1394522193920L, 10390);
              return;
            }
            continue;
            label419:
            GMTrace.o(1394522193920L, 10390);
            return;
            label429:
            break label441;
            label432:
            int j = 0;
            Object localObject2 = localException;
            continue;
            label441:
            k += 1;
            continue;
            label448:
            j = i;
          }
        }
      }, "MicroMsg.IndoorReporter_WIFI_Scan");
      GMTrace.o(1378281848832L, 10269);
    }
    
    public final String Ml()
    {
      GMTrace.i(1378416066560L, 10270);
      this.gYf = false;
      try
      {
        if ((this.thread != null) && (this.thread.isAlive())) {
          this.thread.join(500L);
        }
        String str = this.gYg.size() + ";#";
        int i = 0;
        while (i < this.gYg.size())
        {
          str = str + (String)this.gYg.get(i) + "#";
          i += 1;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.IndoorReporter", "stop, join Thread failed:%s ", new Object[] { localException.getMessage() });
        }
        GMTrace.o(1378416066560L, 10270);
        return localException;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */