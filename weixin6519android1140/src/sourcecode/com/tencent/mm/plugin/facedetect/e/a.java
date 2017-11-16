package com.tencent.mm.plugin.facedetect.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.plugin.facedetect.model.d.b;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.plugin.mmsight.api.b.a;
import com.tencent.mm.plugin.mmsight.model.a.d.a;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public class a
{
  static final String kXF;
  public static final String kXG;
  static final String kXH;
  private static volatile a kXq;
  public com.tencent.mm.plugin.mmsight.model.a.d hwO;
  public com.tencent.mm.remoteservice.d kSj;
  public b kXA;
  public int kXB;
  public int kXC;
  public String kXD;
  public com.tencent.mm.plugin.mmsight.api.b kXE;
  public d.a kXI;
  public d.b kXJ;
  public af kXr;
  private final int kXs;
  private final int kXt;
  private final int kXu;
  public int kXv;
  public int kXw;
  public boolean kXx;
  public int kXy;
  public boolean kXz;
  public String mFilePath;
  public final Object mLock;
  
  static
  {
    GMTrace.i(5977654951936L, 44537);
    kXq = null;
    kXF = n.awv() + File.separator + "fdv_";
    kXG = n.awv() + File.separator + "video_temp_test.mp4";
    kXH = n.awv() + File.separator + "fdv_t_";
    GMTrace.o(5977654951936L, 44537);
  }
  
  private a()
  {
    GMTrace.i(5973225766912L, 44504);
    this.mLock = new Object();
    this.kXr = null;
    this.kXs = 960;
    this.kXt = 540;
    this.kXu = 15;
    this.kXv = a.kXZ;
    this.kXw = 0;
    this.kXx = false;
    this.kXy = 0;
    this.kXz = false;
    this.kXA = null;
    this.kXB = -1;
    this.kXC = -1;
    this.mFilePath = "";
    this.kXD = "";
    this.kSj = new com.tencent.mm.remoteservice.d(ab.getContext());
    this.kXE = com.tencent.mm.plugin.mmsight.api.b.mXe.Rg();
    this.kXI = new d.a()
    {
      public final void Rv()
      {
        GMTrace.i(5972420460544L, 44498);
        w.e("MicroMsg.FaceVideoRecorder", "hy: video capture error: %d", new Object[] { Integer.valueOf(1) });
        a.this.kXr.A(new Runnable()
        {
          /* Error */
          public final void run()
          {
            // Byte code:
            //   0: ldc2_w 40
            //   3: ldc 42
            //   5: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
            //   8: aload_0
            //   9: getfield 19	com/tencent/mm/plugin/facedetect/e/a$5$1:kXX	Lcom/tencent/mm/plugin/facedetect/e/a$5;
            //   12: getfield 46	com/tencent/mm/plugin/facedetect/e/a$5:kXR	Lcom/tencent/mm/plugin/facedetect/e/a;
            //   15: getfield 52	com/tencent/mm/plugin/facedetect/e/a:hwO	Lcom/tencent/mm/plugin/mmsight/model/a/d;
            //   18: ifnull +18 -> 36
            //   21: aload_0
            //   22: getfield 19	com/tencent/mm/plugin/facedetect/e/a$5$1:kXX	Lcom/tencent/mm/plugin/facedetect/e/a$5;
            //   25: getfield 46	com/tencent/mm/plugin/facedetect/e/a$5:kXR	Lcom/tencent/mm/plugin/facedetect/e/a;
            //   28: getfield 52	com/tencent/mm/plugin/facedetect/e/a:hwO	Lcom/tencent/mm/plugin/mmsight/model/a/d;
            //   31: invokeinterface 57 1 0
            //   36: aload_0
            //   37: getfield 19	com/tencent/mm/plugin/facedetect/e/a$5$1:kXX	Lcom/tencent/mm/plugin/facedetect/e/a$5;
            //   40: getfield 46	com/tencent/mm/plugin/facedetect/e/a$5:kXR	Lcom/tencent/mm/plugin/facedetect/e/a;
            //   43: invokevirtual 60	com/tencent/mm/plugin/facedetect/e/a:axc	()V
            //   46: aload_0
            //   47: getfield 19	com/tencent/mm/plugin/facedetect/e/a$5$1:kXX	Lcom/tencent/mm/plugin/facedetect/e/a$5;
            //   50: getfield 46	com/tencent/mm/plugin/facedetect/e/a$5:kXR	Lcom/tencent/mm/plugin/facedetect/e/a;
            //   53: getfield 64	com/tencent/mm/plugin/facedetect/e/a:mLock	Ljava/lang/Object;
            //   56: astore_1
            //   57: aload_1
            //   58: monitorenter
            //   59: aload_0
            //   60: getfield 19	com/tencent/mm/plugin/facedetect/e/a$5$1:kXX	Lcom/tencent/mm/plugin/facedetect/e/a$5;
            //   63: getfield 46	com/tencent/mm/plugin/facedetect/e/a$5:kXR	Lcom/tencent/mm/plugin/facedetect/e/a;
            //   66: getstatic 69	com/tencent/mm/plugin/facedetect/e/a$a:kYa	I
            //   69: putfield 72	com/tencent/mm/plugin/facedetect/e/a:kXv	I
            //   72: aload_1
            //   73: monitorexit
            //   74: invokestatic 78	com/tencent/mm/plugin/facedetect/model/FaceContextData:awb	()Lcom/tencent/mm/plugin/facedetect/model/FaceContextData;
            //   77: getfield 82	com/tencent/mm/plugin/facedetect/model/FaceContextData:kSI	J
            //   80: iconst_2
            //   81: aload_0
            //   82: getfield 21	com/tencent/mm/plugin/facedetect/e/a$5$1:jmi	I
            //   85: invokestatic 88	com/tencent/mm/plugin/facedetect/model/FaceDetectReporter:d	(JII)V
            //   88: ldc2_w 40
            //   91: ldc 42
            //   93: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
            //   96: return
            //   97: astore_1
            //   98: ldc 90
            //   100: ldc 92
            //   102: iconst_1
            //   103: anewarray 4	java/lang/Object
            //   106: dup
            //   107: iconst_0
            //   108: aload_1
            //   109: invokevirtual 96	java/lang/Exception:getMessage	()Ljava/lang/String;
            //   112: aastore
            //   113: invokestatic 102	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
            //   116: aload_0
            //   117: getfield 19	com/tencent/mm/plugin/facedetect/e/a$5$1:kXX	Lcom/tencent/mm/plugin/facedetect/e/a$5;
            //   120: getfield 46	com/tencent/mm/plugin/facedetect/e/a$5:kXR	Lcom/tencent/mm/plugin/facedetect/e/a;
            //   123: invokevirtual 60	com/tencent/mm/plugin/facedetect/e/a:axc	()V
            //   126: goto -80 -> 46
            //   129: astore_1
            //   130: aload_0
            //   131: getfield 19	com/tencent/mm/plugin/facedetect/e/a$5$1:kXX	Lcom/tencent/mm/plugin/facedetect/e/a$5;
            //   134: getfield 46	com/tencent/mm/plugin/facedetect/e/a$5:kXR	Lcom/tencent/mm/plugin/facedetect/e/a;
            //   137: invokevirtual 60	com/tencent/mm/plugin/facedetect/e/a:axc	()V
            //   140: aload_1
            //   141: athrow
            //   142: astore_2
            //   143: aload_1
            //   144: monitorexit
            //   145: aload_2
            //   146: athrow
            // Local variable table:
            //   start	length	slot	name	signature
            //   0	147	0	this	1
            //   97	12	1	localException	Exception
            //   129	15	1	localObject2	Object
            //   142	4	2	localObject3	Object
            // Exception table:
            //   from	to	target	type
            //   8	36	97	java/lang/Exception
            //   8	36	129	finally
            //   98	116	129	finally
            //   59	74	142	finally
            //   143	145	142	finally
          }
        });
        GMTrace.o(5972420460544L, 44498);
      }
    };
    this.kXJ = new d.b()
    {
      public final void aq(final byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(5978191822848L, 44541);
        w.v("MicroMsg.FaceVideoRecorder", "hy: on video data come");
        a.this.kXr.A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5978728693760L, 44545);
            SightVideoJNI.mirrorCameraData(paramAnonymousArrayOfByte, a.this.kXB, a.this.kXC, false);
            if (a.this.hwO.aPw() != null) {
              a.this.hwO.aPw().L(paramAnonymousArrayOfByte);
            }
            GMTrace.o(5978728693760L, 44545);
          }
        });
        GMTrace.o(5978191822848L, 44541);
      }
      
      public final com.tencent.mm.memory.a<byte[]> awa()
      {
        GMTrace.i(5978326040576L, 44542);
        j localj = j.naP;
        GMTrace.o(5978326040576L, 44542);
        return localj;
      }
    };
    this.kXr = new af("face_video_handler");
    GMTrace.o(5973225766912L, 44504);
  }
  
  public static a axb()
  {
    GMTrace.i(5973359984640L, 44505);
    if (kXq == null) {
      try
      {
        if (kXq == null) {
          kXq = new a();
        }
        a locala1 = kXq;
        GMTrace.o(5973359984640L, 44505);
        return locala1;
      }
      finally {}
    }
    a locala2 = kXq;
    GMTrace.o(5973359984640L, 44505);
    return locala2;
  }
  
  public final void a(final b paramb)
  {
    GMTrace.i(5973896855552L, 44509);
    this.kXr.A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5972823113728L, 44501);
        synchronized (a.this.mLock)
        {
          a.this.kXA = paramb;
          if (a.this.kXv == a.a.kXZ)
          {
            w.e("MicroMsg.FaceVideoRecorder", "hy: not initialized. should not happen");
            a.this.axc();
            if (a.this.kXA != null) {
              a.this.kXA.xB(null);
            }
            GMTrace.o(5972823113728L, 44501);
            return;
          }
          if ((a.this.kXv == a.a.kYe) || (a.this.kXv == a.a.kYa))
          {
            w.w("MicroMsg.FaceVideoRecorder", "hy: cancelled or not started capturing.");
            a.this.axc();
            if (a.this.kXA != null) {
              a.this.kXA.xB(null);
            }
            GMTrace.o(5972823113728L, 44501);
            return;
          }
          if (a.this.kXv == a.a.kYd)
          {
            w.i("MicroMsg.FaceVideoRecorder", "hy: already stopped");
            if (a.this.kXA != null) {
              a.this.kXA.xB(a.this.hwO.getFilePath());
            }
            GMTrace.o(5972823113728L, 44501);
            return;
          }
          if (a.this.kXv == a.a.kYc)
          {
            w.i("MicroMsg.FaceVideoRecorder", "hy: stopping. wait");
            GMTrace.o(5972823113728L, 44501);
            return;
          }
          w.i("MicroMsg.FaceVideoRecorder", "hy: stop record and release");
          com.tencent.mm.plugin.facedetect.model.d.avZ().b(a.this.kXJ);
          a.this.kXv = a.a.kYc;
          a.this.hwO.x(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5978997129216L, 44547);
              synchronized (a.this.mLock)
              {
                a.this.kXv = a.a.kYd;
                com.tencent.mm.loader.stub.b.deleteFile(a.this.kXD);
                if (a.this.kXA != null) {
                  a.this.kXA.xB(a.this.hwO.getFilePath());
                }
                GMTrace.o(5978997129216L, 44547);
                return;
              }
            }
          });
          GMTrace.o(5972823113728L, 44501);
          return;
        }
      }
    });
    GMTrace.o(5973896855552L, 44509);
  }
  
  public final void axc()
  {
    GMTrace.i(16030294343680L, 119435);
    com.tencent.mm.loader.stub.b.deleteFile(this.mFilePath);
    com.tencent.mm.loader.stub.b.deleteFile(this.kXD);
    GMTrace.o(16030294343680L, 119435);
  }
  
  public final c.a axd()
  {
    GMTrace.i(5973628420096L, 44507);
    if (this.hwO != null)
    {
      c.a locala = this.hwO.aPD();
      GMTrace.o(5973628420096L, 44507);
      return locala;
    }
    w.w("MicroMsg.FaceVideoRecorder", "hy: no media recorder");
    GMTrace.o(5973628420096L, 44507);
    return null;
  }
  
  public final void axe()
  {
    GMTrace.i(5973762637824L, 44508);
    this.kXr.A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5972152025088L, 44496);
        synchronized (a.this.mLock)
        {
          if (a.this.kXv == a.a.kXZ)
          {
            w.e("MicroMsg.FaceVideoRecorder", "hy: not started when cancel. should not happen");
            a.this.axc();
            GMTrace.o(5972152025088L, 44496);
            return;
          }
          w.i("MicroMsg.FaceVideoRecorder", "hy: cancel record");
          a.this.hwO.cancel();
          a.this.axc();
          com.tencent.mm.plugin.facedetect.model.d.avZ().b(a.this.kXJ);
          a.this.kXv = a.a.kYe;
          a.this.kSj.release();
          GMTrace.o(5972152025088L, 44496);
          return;
        }
      }
    });
    GMTrace.o(5973762637824L, 44508);
  }
  
  public final int axf()
  {
    GMTrace.i(19906770763776L, 148317);
    synchronized (this.mLock)
    {
      int i = this.kXv;
      GMTrace.o(19906770763776L, 148317);
      return i;
    }
  }
  
  public final boolean isStarted()
  {
    GMTrace.i(5973494202368L, 44506);
    synchronized (this.mLock)
    {
      if (this.kXv == a.kYb)
      {
        bool = true;
        GMTrace.o(5973494202368L, 44506);
        return bool;
      }
      boolean bool = false;
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(5978460258304L, 44543);
      kXZ = 1;
      kYa = 2;
      kYb = 3;
      kYc = 4;
      kYd = 5;
      kYe = 6;
      kYf = new int[] { kXZ, kYa, kYb, kYc, kYd, kYe };
      GMTrace.o(5978460258304L, 44543);
    }
  }
  
  public static abstract interface b
  {
    public abstract void xB(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */