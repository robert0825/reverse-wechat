package com.tencent.mm.plugin.mmsight.model;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.c;
import com.tencent.mm.compatible.d.c.a.a;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.d.s;
import com.tencent.mm.g.a.lm;
import com.tencent.mm.g.a.lm.b;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.a.k;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.t.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class e
  implements SensorEventListener
{
  private static int mXZ;
  static boolean mYB;
  private SensorManager aDS;
  public Camera fPj;
  private Context mContext;
  private int mXS;
  public int mXT;
  public p mXU;
  private boolean mXV;
  private boolean mXW;
  public boolean mXX;
  private int mXY;
  private boolean mYA;
  Camera.AutoFocusCallback mYC;
  public c mYD;
  public boolean mYE;
  c.a.a mYa;
  private Sensor mYb;
  private float mYc;
  private float mYd;
  private float mYe;
  public Point mYf;
  public Point mYg;
  public Point mYh;
  private int mYi;
  public byte[] mYj;
  public boolean mYk;
  public com.tencent.mm.plugin.base.model.a mYl;
  public boolean mYm;
  public List<f> mYn;
  public boolean mYo;
  public a mYp;
  public b mYq;
  public b mYr;
  public b mYs;
  public b mYt;
  public b mYu;
  public b mYv;
  private VideoTransPara mYw;
  public volatile byte[] mYx;
  public volatile boolean mYy;
  public boolean mYz;
  private int scene;
  
  static
  {
    GMTrace.i(7330569650176L, 54617);
    mXZ = Integer.MAX_VALUE;
    mYB = true;
    GMTrace.o(7330569650176L, 54617);
  }
  
  public e(VideoTransPara paramVideoTransPara, int paramInt)
  {
    GMTrace.i(7325603594240L, 54580);
    this.mXS = -1;
    this.mXT = -1;
    this.mXV = false;
    this.mXW = false;
    this.fPj = null;
    this.mXX = false;
    this.mXY = 0;
    this.mYc = 0.0F;
    this.mYd = 0.0F;
    this.mYe = 0.0F;
    this.mContext = null;
    this.mYf = null;
    this.mYg = null;
    this.mYh = null;
    this.mYi = 0;
    this.mYk = false;
    this.mYl = new com.tencent.mm.plugin.base.model.a();
    this.mYm = false;
    this.mYn = new ArrayList();
    this.mYo = false;
    this.mYp = a.mYG;
    this.mYq = new b("prevcameraCallback");
    this.mYr = new b("cameraCallback");
    this.mYs = new b("cameraPreviewCallback");
    this.mYt = new b("cameraCropCallback");
    this.mYu = new b("mirrorCameraCallback");
    this.mYv = new b("finishCallbackTimeCallback");
    this.scene = 0;
    this.mYx = null;
    this.mYy = false;
    this.mYz = false;
    this.mYA = false;
    this.mYC = new Camera.AutoFocusCallback()
    {
      public final void onAutoFocus(boolean paramAnonymousBoolean, Camera paramAnonymousCamera)
      {
        GMTrace.i(7332046045184L, 54628);
        w.v("MicroMsg.MMSightCamera", "auto focus callback success %s, status: %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), e.this.mYp });
        e.mYB = true;
        GMTrace.o(7332046045184L, 54628);
      }
    };
    this.mYD = new c(Looper.getMainLooper());
    this.mYE = true;
    this.mXU = p.aPm();
    this.mYw = paramVideoTransPara;
    this.scene = paramInt;
    GMTrace.o(7325603594240L, 54580);
  }
  
  @TargetApi(14)
  private static boolean a(Camera paramCamera)
  {
    GMTrace.i(7326274682880L, 54585);
    if (paramCamera == null)
    {
      GMTrace.o(7326274682880L, 54585);
      return false;
    }
    try
    {
      w.i("MicroMsg.MMSightCameraSetting", "safeSetMetering");
      Camera.Parameters localParameters = paramCamera.getParameters();
      if (localParameters.getMaxNumMeteringAreas() > 0)
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(new Camera.Area(new Rect(64536, 64536, 1000, 1000), 600));
        localParameters.setMeteringAreas(localArrayList);
      }
      paramCamera.setParameters(localParameters);
      GMTrace.o(7326274682880L, 54585);
      return true;
    }
    catch (Exception paramCamera)
    {
      w.i("MicroMsg.MMSightCameraSetting", "safeSetMetering Exception, %s, %s", new Object[] { Looper.myLooper(), paramCamera.getMessage() });
      GMTrace.o(7326274682880L, 54585);
    }
    return false;
  }
  
  private boolean a(Camera paramCamera, int paramInt, float paramFloat, boolean paramBoolean)
  {
    GMTrace.i(20189701734400L, 150425);
    if ((paramCamera == null) || (paramInt <= 0))
    {
      GMTrace.o(20189701734400L, 150425);
      return false;
    }
    for (;;)
    {
      Camera.Parameters localParameters;
      Point localPoint;
      int i;
      Object localObject1;
      label197:
      label215:
      Object localObject2;
      try
      {
        localParameters = paramCamera.getParameters();
        localPoint = new Point(paramInt, (int)(paramInt / paramFloat));
        float f = 1.0F / paramFloat;
        if (paramFloat < 1.0F)
        {
          i = paramInt;
          w.i("MicroMsg.MMSightCamera", "safeSetPreviewSizeWithLimitAndRatio, shortSize: %s, displayRatio: %s", new Object[] { Integer.valueOf(i), Float.valueOf(paramFloat) });
          if (paramFloat <= 1.0F) {
            break label621;
          }
          w.i("MicroMsg.MMSightCamera", "displayRatio bigger than 1, crop width first");
          if (this.mYa.eSp == 90) {
            break label768;
          }
          if (this.mYa.eSp != 270) {
            break label786;
          }
          break label768;
          localObject1 = g.c(localParameters, localPoint, i, bool);
          if ((localObject1 == null) || (((g.b)localObject1).mYQ == null))
          {
            w.i("MicroMsg.MMSightCamera", "find with crop width failed, try crop height");
            if (this.mYa.eSp == 90) {
              break label774;
            }
            if (this.mYa.eSp != 270) {
              break label792;
            }
            break label774;
            localObject1 = g.a(localParameters, localPoint, i, bool);
            this.mYz = false;
            if (localObject1 != null)
            {
              localObject2 = localObject1;
              if (((g.b)localObject1).mYQ != null) {}
            }
            else
            {
              w.e("MicroMsg.MMSightCamera", "fuck, preview size still null!!");
              if (this.mYa.eSp == 90) {
                break label780;
              }
              if (this.mYa.eSp != 270) {
                break label822;
              }
              break label780;
              label269:
              localObject2 = g.d(localParameters, localPoint, paramInt, bool);
              this.mYz = false;
            }
            if ((localObject2 == null) || (((g.b)localObject2).mYQ == null)) {
              continue;
            }
            localObject1 = ((g.b)localObject2).mYQ;
            this.mXU.kXB = ((Point)localObject1).x;
            this.mXU.kXC = ((Point)localObject1).y;
            this.mYg = ((Point)localObject1);
            this.mYh = null;
            if (!paramBoolean)
            {
              if ((j.mZc.fQQ != 2) || (com.tencent.mm.plugin.mmsight.d.qE(this.mYg.y))) {
                break label757;
              }
              paramInt = com.tencent.mm.plugin.mmsight.d.qF(this.mYg.y);
              if (Math.abs(paramInt - this.mYg.y) > 16) {
                break label746;
              }
              w.i("MicroMsg.MMSightCamera", "padding 16 for encode video best size: %s, alignY: %s", new Object[] { this.mYg, Integer.valueOf(paramInt) });
              this.mYf = new Point(this.mYg.x, this.mYg.y);
              this.mYg.y = paramInt;
              this.mYk = true;
              this.mYj = new byte[this.mYg.x * this.mYg.y * 3 / 2];
            }
            label487:
            w.i("MicroMsg.MMSightCameraSetting", "final set camera preview size: %s, encodeVideoBestSize: %s, cropSize: %s, cropWidth: %s", new Object[] { localObject1, this.mYg, this.mYh, Boolean.valueOf(this.mYz) });
            localParameters.setPreviewSize(this.mXU.kXB, this.mXU.kXC);
            paramCamera.setParameters(localParameters);
            GMTrace.o(20189701734400L, 150425);
            return true;
          }
        }
        else
        {
          f = paramInt / f;
          i = Math.round(f);
          continue;
        }
        this.mYz = true;
        continue;
        w.i("MicroMsg.MMSightCamera", "displayRatio smaller than 1, crop height first");
      }
      catch (Exception paramCamera)
      {
        w.e("MicroMsg.MMSightCamera", "safeSetPreviewSizeWithLimit error: %s", new Object[] { paramCamera.getMessage() });
        GMTrace.o(20189701734400L, 150425);
        return false;
      }
      label621:
      if (this.mYa.eSp != 90)
      {
        if (this.mYa.eSp != 270) {
          break label810;
        }
        break label798;
        label658:
        localObject2 = g.a(localParameters, localPoint, i, bool);
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((g.b)localObject2).mYQ != null) {
            continue;
          }
        }
        w.i("MicroMsg.MMSightCamera", "find with crop height failed, try crop widht");
        if (this.mYa.eSp == 90) {
          break label804;
        }
        if (this.mYa.eSp != 270) {
          break label816;
        }
        break label804;
      }
      for (;;)
      {
        localObject1 = g.c(localParameters, localPoint, i, bool);
        this.mYz = true;
        break label215;
        label746:
        j.b(this.mYg);
        break label487;
        label757:
        j.b(this.mYg);
        break label487;
        label768:
        bool = true;
        break;
        label774:
        bool = true;
        break label197;
        label780:
        bool = true;
        break label269;
        label786:
        bool = false;
        break;
        label792:
        bool = false;
        break label197;
        label798:
        bool = true;
        break label658;
        label804:
        bool = true;
        continue;
        label810:
        bool = false;
        break label658;
        label816:
        bool = false;
      }
      label822:
      boolean bool = false;
    }
  }
  
  private boolean a(Camera paramCamera, boolean paramBoolean)
  {
    GMTrace.i(7326140465152L, 54584);
    if (paramCamera == null)
    {
      GMTrace.o(7326140465152L, 54584);
      return false;
    }
    for (;;)
    {
      Point localPoint;
      Object localObject1;
      try
      {
        Camera.Parameters localParameters = paramCamera.getParameters();
        localPoint = com.tencent.mm.plugin.mmsight.d.cN(this.mContext);
        Object localObject2;
        Object localObject3;
        if (this.mYE)
        {
          localObject1 = a.aOR();
          localObject2 = localParameters.getSupportedPreviewSizes();
          localObject3 = localParameters.getSupportedPictureSizes();
          i = this.mYa.eSp;
          if (bg.nm(((a)localObject1).mXn)) {
            ((a)localObject1).mXn = com.tencent.mm.plugin.mmsight.d.aV((List)localObject2);
          }
          if (bg.nm(((a)localObject1).mXo)) {
            ((a)localObject1).mXo = com.tencent.mm.plugin.mmsight.d.aV((List)localObject3);
          }
          ((a)localObject1).eSp = i;
          ((a)localObject1).mXJ = 1;
          if (paramBoolean)
          {
            if (this.mYa.eSp == 90) {
              break label1878;
            }
            if (this.mYa.eSp == 270)
            {
              break label1878;
              j.a(localParameters, bool);
            }
          }
          else
          {
            k.aPI();
            i = k.aPK();
            if (this.mYa.eSp == 90) {
              break label1884;
            }
            if (this.mYa.eSp != 270) {
              break label1115;
            }
            break label1884;
            localObject1 = g.b(localParameters, localPoint, i, bool);
            j.a((g.b)localObject1);
            localPoint = ((g.b)localObject1).mYQ;
            if (localPoint == null) {
              com.tencent.mm.plugin.report.service.g.ork.a(440L, 140L, 0L, false);
            }
            if (localPoint != null)
            {
              this.mXU.kXB = localPoint.x;
              this.mXU.kXC = localPoint.y;
              this.mYg = localPoint;
            }
            localObject2 = this.mContext;
            if (this.mYa.eSp == 90) {
              break label1890;
            }
            if (this.mYa.eSp != 270) {
              break label1121;
            }
            break label1890;
            bool = com.tencent.mm.plugin.mmsight.d.a((Context)localObject2, localPoint, bool);
            w.i("MicroMsg.MMSightCameraSetting", "checkIfNeedUsePreviewLarge, needCrop: %s", new Object[] { Boolean.valueOf(bool) });
            if (bool)
            {
              if (j.mZc.fQQ != 2) {
                break label1127;
              }
              this.mYh = ((g.b)localObject1).mYS;
              this.mYg = new Point(this.mYh.x, this.mYh.y);
              this.mYi = (this.mYh.x * this.mYh.y * 3 / 2);
              w.i("MicroMsg.MMSightCameraSetting", "cropSize: %s", new Object[] { this.mYh });
            }
            if (j.mZc.mZn)
            {
              j = 1;
              i = 1;
              if ((this.mYa.eSp != 90) && (this.mYa.eSp != 270)) {
                break label1363;
              }
              if ((localPoint.y < this.mYw.width) || (localPoint.x < this.mYw.height))
              {
                i = 0;
                w.w("MicroMsg.MMSightCamera", "previewSize %s not support", new Object[] { localPoint });
              }
              if (i != 0)
              {
                if (j.mZc.mXB != 1080) {
                  break label1191;
                }
                if (this.mYh != null) {
                  break label1139;
                }
                j = localPoint.x / 2;
                if (this.mYh != null) {
                  break label1153;
                }
                i = localPoint.y / 2;
                if (this.mYh != null) {
                  break label1167;
                }
                k = localPoint.x;
                k = com.tencent.mm.plugin.mmsight.d.cs(j, k);
                if (this.mYh != null) {
                  break label1179;
                }
                j = localPoint.y;
                this.mYg = new Point(k, com.tencent.mm.plugin.mmsight.d.cs(i, j));
              }
            }
            localObject1 = a.aOR();
            localObject2 = this.mYh;
            localObject3 = this.mYg;
            ((a)localObject1).mXw = -1;
            ((a)localObject1).mXv = -1;
            ((a)localObject1).mXs = -1;
            ((a)localObject1).mXr = -1;
            ((a)localObject1).mXu = -1;
            ((a)localObject1).mXt = -1;
            if (localPoint != null)
            {
              ((a)localObject1).mXt = localPoint.x;
              ((a)localObject1).mXu = localPoint.y;
            }
            if (localObject2 != null)
            {
              ((a)localObject1).mXr = ((Point)localObject2).x;
              ((a)localObject1).mXs = ((Point)localObject2).y;
            }
            if (localObject3 != null)
            {
              ((a)localObject1).mXv = ((Point)localObject3).x;
              ((a)localObject1).mXw = ((Point)localObject3).y;
            }
            if (!paramBoolean) {
              break label1773;
            }
            if ((bool) || (j.mZc.fQQ != 2) || (com.tencent.mm.plugin.mmsight.d.qE(this.mYg.y))) {
              break label1762;
            }
            i = com.tencent.mm.plugin.mmsight.d.qF(this.mYg.y);
            if (Math.abs(i - this.mYg.y) > 16) {
              break label1751;
            }
            w.i("MicroMsg.MMSightCamera", "padding 16 for encode video best size: %s, alignY: %s", new Object[] { this.mYg, Integer.valueOf(i) });
            this.mYf = new Point(this.mYg.x, this.mYg.y);
            this.mYg.y = i;
            this.mYk = true;
            this.mYj = new byte[this.mYg.x * this.mYg.y * 3 / 2];
            w.i("MicroMsg.MMSightCameraSetting", "final set camera preview size: %s, encodeVideoBestSize: %s, cropSize: %s", new Object[] { localPoint, this.mYg, this.mYh });
            localParameters.setPreviewSize(this.mXU.kXB, this.mXU.kXC);
            paramCamera.setParameters(localParameters);
            GMTrace.o(7326140465152L, 54584);
            return true;
          }
        }
        else
        {
          localObject1 = a.aOR();
          localObject2 = localParameters.getSupportedPreviewSizes();
          localObject3 = localParameters.getSupportedPictureSizes();
          i = this.mYa.eSp;
          if (bg.nm(((a)localObject1).mXp)) {
            ((a)localObject1).mXp = com.tencent.mm.plugin.mmsight.d.aV((List)localObject2);
          }
          if (bg.nm(((a)localObject1).mXq)) {
            ((a)localObject1).mXq = com.tencent.mm.plugin.mmsight.d.aV((List)localObject3);
          }
          ((a)localObject1).eSp = i;
          ((a)localObject1).mXJ = 2;
          continue;
        }
        bool = false;
      }
      catch (Exception paramCamera)
      {
        w.i("MicroMsg.MMSightCameraSetting", "setPreviewSize Exception, %s, %s", new Object[] { Looper.myLooper(), paramCamera.getMessage() });
        GMTrace.o(7326140465152L, 54584);
        return false;
      }
      continue;
      label1115:
      boolean bool = false;
      continue;
      label1121:
      bool = false;
      continue;
      label1127:
      this.mYh = ((g.b)localObject1).mYR;
      continue;
      label1139:
      int j = this.mYh.x / 2;
      continue;
      label1153:
      int i = this.mYh.y / 2;
      continue;
      label1167:
      int k = this.mYh.x;
      continue;
      label1179:
      j = this.mYh.y;
      continue;
      label1191:
      if (j.mZc.mXB == 720)
      {
        float f;
        if (this.mYh == null)
        {
          f = localPoint.x * 0.75F;
          label1221:
          k = (int)f;
          if (this.mYh != null) {
            break label1323;
          }
          f = localPoint.y * 0.75F;
          label1243:
          j = (int)f;
          if (this.mYh != null) {
            break label1339;
          }
          i = localPoint.x;
          label1261:
          k = com.tencent.mm.plugin.mmsight.d.cs(k, i);
          if (this.mYh != null) {
            break label1351;
          }
        }
        label1323:
        label1339:
        label1351:
        for (i = localPoint.y;; i = this.mYh.y)
        {
          this.mYg = new Point(k, com.tencent.mm.plugin.mmsight.d.cs(j, i));
          break;
          f = this.mYh.x * 0.75F;
          break label1221;
          f = this.mYh.y * 0.75F;
          break label1243;
          i = this.mYh.x;
          break label1261;
        }
        label1363:
        if (localPoint.x >= this.mYw.width)
        {
          i = j;
          if (localPoint.y >= this.mYw.height) {}
        }
        else
        {
          i = 0;
          w.w("MicroMsg.MMSightCamera", "previewSize %s not support", new Object[] { localPoint });
        }
        if (i != 0)
        {
          if (j.mZc.mXB == 1080)
          {
            if (this.mYh == null)
            {
              j = localPoint.y / 2;
              label1451:
              if (this.mYh != null) {
                break label1541;
              }
              i = localPoint.x / 2;
              label1467:
              if (this.mYh != null) {
                break label1555;
              }
              k = localPoint.y;
              label1481:
              k = com.tencent.mm.plugin.mmsight.d.cs(j, k);
              if (this.mYh != null) {
                break label1567;
              }
            }
            label1541:
            label1555:
            label1567:
            for (j = localPoint.x;; j = this.mYh.x)
            {
              this.mYg = new Point(k, com.tencent.mm.plugin.mmsight.d.cs(i, j));
              break;
              j = this.mYh.y / 2;
              break label1451;
              i = this.mYh.x / 2;
              break label1467;
              k = this.mYh.y;
              break label1481;
            }
          }
          if (j.mZc.mXB == 720)
          {
            if (this.mYh == null)
            {
              f = localPoint.y * 0.75F;
              label1609:
              k = (int)f;
              if (this.mYh != null) {
                break label1711;
              }
              f = localPoint.x * 0.75F;
              label1631:
              j = (int)f;
              if (this.mYh != null) {
                break label1727;
              }
              i = localPoint.y;
              label1649:
              k = com.tencent.mm.plugin.mmsight.d.cs(k, i);
              if (this.mYh != null) {
                break label1739;
              }
            }
            label1711:
            label1727:
            label1739:
            for (i = localPoint.x;; i = this.mYh.x)
            {
              this.mYg = new Point(k, com.tencent.mm.plugin.mmsight.d.cs(j, i));
              break;
              f = this.mYh.y * 0.75F;
              break label1609;
              f = this.mYh.x * 0.75F;
              break label1631;
              i = this.mYh.y;
              break label1649;
            }
            label1751:
            j.b(this.mYg);
            continue;
            label1762:
            j.b(this.mYg);
            continue;
            label1773:
            if ((!bool) && (j.mZc.fQQ == 2) && (!com.tencent.mm.plugin.mmsight.d.qE(this.mYg.y)) && (this.mYk) && (this.mYj != null) && (this.mYf.y == this.mYg.y))
            {
              i = com.tencent.mm.plugin.mmsight.d.qF(this.mYg.y);
              if (this.mYj.length == this.mYg.x * i * 3 / 2)
              {
                this.mYg.y = i;
                continue;
                label1878:
                bool = true;
                continue;
                label1884:
                bool = true;
                continue;
                label1890:
                bool = true;
              }
            }
          }
        }
      }
    }
  }
  
  private void aOX()
  {
    GMTrace.i(20189970169856L, 150427);
    if (this.fPj != null) {
      try
      {
        Object localObject = this.fPj.getParameters();
        w.i("MicroMsg.MMSightCamera", "setPreviewCallbackImpl");
        int i = this.mXU.kXB;
        int j = this.mXU.kXC;
        j = ImageFormat.getBitsPerPixel(((Camera.Parameters)localObject).getPreviewFormat()) * (i * j) / 8;
        i = 0;
        while (i < 5)
        {
          localObject = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(j));
          this.fPj.addCallbackBuffer((byte[])localObject);
          i += 1;
        }
        this.mYq.reset();
        this.mYr.reset();
        this.mYs.reset();
        this.mYt.reset();
        this.mYu.reset();
        this.mYv.reset();
        this.mYl = new com.tencent.mm.plugin.base.model.a();
        this.fPj.setPreviewCallbackWithBuffer(new Camera.PreviewCallback()
        {
          public final void onPreviewFrame(byte[] paramAnonymousArrayOfByte, Camera paramAnonymousCamera)
          {
            GMTrace.i(7376203677696L, 54957);
            if (!e.this.mYo)
            {
              w.i("MicroMsg.MMSightCamera", "onPreviewFrame: %s %s", new Object[] { paramAnonymousArrayOfByte, e.this.fPj });
              e.this.mYo = true;
            }
            if ((paramAnonymousArrayOfByte == null) || (paramAnonymousArrayOfByte.length <= 0))
            {
              w.e("MicroMsg.MMSightCamera", "onPreviewFrame, frame data is null!!");
              e.this.aOY();
              GMTrace.o(7376203677696L, 54957);
              return;
            }
            paramAnonymousCamera = e.this.mYl;
            if (paramAnonymousCamera.jiP == 0)
            {
              paramAnonymousCamera.jiO += 1;
              paramAnonymousCamera.jiN = bg.Sy(l.sN());
            }
            paramAnonymousCamera.jiP += 1;
            int i;
            Object localObject;
            long l1;
            long l2;
            int j;
            boolean bool;
            if (paramAnonymousCamera.jiP >= 90)
            {
              i = 0;
              paramAnonymousCamera.jiP = i;
              if ((e.this.mYy) || (e.this.mYn == null) || (e.this.mYn.size() <= 0)) {
                break label871;
              }
              if (e.this.mYh == null) {
                break label499;
              }
              localObject = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(e.this.mYh.x * e.this.mYh.y * 3 / 2));
              e.this.mYs.cS(1L);
              l1 = bg.Pw();
              SightVideoJNI.cropCameraData(paramAnonymousArrayOfByte, (byte[])localObject, e.this.mXU.kXB, e.this.mXU.kXC, e.this.mYh.y);
              l2 = bg.aI(l1);
              e.this.mYt.cS(l2);
              if (!e.this.mYE)
              {
                l1 = bg.Pw();
                i = e.this.mYh.x;
                j = e.this.mYh.y;
                if ((e.this.mYa.eSp != 270) && (e.this.mYa.eSp != 90)) {
                  break label493;
                }
                bool = true;
                label368:
                SightVideoJNI.mirrorCameraData((byte[])localObject, i, j, bool);
                l2 = bg.aI(l1);
                e.this.mYu.cS(l2);
              }
              bool = e.this.ax((byte[])localObject);
              l1 = bg.aI(l1);
              if (bool) {
                e.this.mYv.cS(l1);
              }
            }
            for (;;)
            {
              label432:
              e.this.mYx = ((byte[])localObject);
              if (e.this.mYp == e.a.mYG) {
                e.this.mYr.cS(1L);
              }
              for (;;)
              {
                e.this.fPj.addCallbackBuffer(paramAnonymousArrayOfByte);
                GMTrace.o(7376203677696L, 54957);
                return;
                i = paramAnonymousCamera.jiP;
                break;
                label493:
                bool = false;
                break label368;
                label499:
                l1 = bg.Pw();
                label571:
                label668:
                byte[] arrayOfByte;
                if (!e.this.mYE)
                {
                  i = e.this.mXU.kXB;
                  j = e.this.mXU.kXC;
                  if ((e.this.mYa.eSp == 270) || (e.this.mYa.eSp == 90))
                  {
                    bool = true;
                    SightVideoJNI.mirrorCameraData(paramAnonymousArrayOfByte, i, j, bool);
                    l2 = bg.aI(l1);
                    e.this.mYu.cS(l2);
                  }
                }
                else
                {
                  if ((!e.this.mYk) || (e.this.mYj == null)) {
                    break label828;
                  }
                  SightVideoJNI.paddingYuvData16(paramAnonymousArrayOfByte, e.this.mYj, e.this.mYg.x, e.this.mYf.y, e.this.mYg.y);
                  paramAnonymousCamera = e.this.mYj;
                  bool = e.this.ax(paramAnonymousCamera);
                  l1 = bg.aI(l1);
                  if (bool) {
                    e.this.mYv.cS(l1);
                  }
                  if (e.this.mYk)
                  {
                    arrayOfByte = paramAnonymousArrayOfByte;
                    if (e.this.mYj != null) {}
                  }
                  else
                  {
                    arrayOfByte = paramAnonymousArrayOfByte;
                    if (bool) {
                      arrayOfByte = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(paramAnonymousArrayOfByte.length));
                    }
                  }
                  localObject = paramAnonymousCamera;
                  paramAnonymousArrayOfByte = arrayOfByte;
                  if (!e.this.mYk) {
                    break label432;
                  }
                  localObject = paramAnonymousCamera;
                  paramAnonymousArrayOfByte = arrayOfByte;
                  if (e.this.mYj == null) {
                    break label432;
                  }
                  localObject = e.this;
                  if (!bool) {
                    break label833;
                  }
                }
                label828:
                label833:
                for (paramAnonymousArrayOfByte = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(e.this.mYj.length));; paramAnonymousArrayOfByte = e.this.mYj)
                {
                  ((e)localObject).mYj = paramAnonymousArrayOfByte;
                  localObject = paramAnonymousCamera;
                  paramAnonymousArrayOfByte = arrayOfByte;
                  break;
                  bool = false;
                  break label571;
                  paramAnonymousCamera = paramAnonymousArrayOfByte;
                  break label668;
                }
                if (e.this.mYp == e.a.mYH) {
                  e.this.mYq.cS(1L);
                }
              }
              label871:
              localObject = paramAnonymousArrayOfByte;
            }
          }
        });
        GMTrace.o(20189970169856L, 150427);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MMSightCamera", "setPreviewCallbackImpl error: %s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(20189970169856L, 150427);
  }
  
  private static boolean b(Camera paramCamera)
  {
    GMTrace.i(7326543118336L, 54587);
    if (paramCamera == null)
    {
      GMTrace.o(7326543118336L, 54587);
      return false;
    }
    try
    {
      w.i("MicroMsg.MMSightCameraSetting", "safeSetPreviewFormat");
      Camera.Parameters localParameters = paramCamera.getParameters();
      List localList = localParameters.getSupportedPreviewFormats();
      if ((localList == null) || (!localList.contains(Integer.valueOf(17)))) {
        w.e("MicroMsg.MMSightCameraSetting", "not support YCbCr_420_SP");
      }
      localParameters.setPreviewFormat(17);
      paramCamera.setParameters(localParameters);
      GMTrace.o(7326543118336L, 54587);
      return true;
    }
    catch (Exception paramCamera)
    {
      w.i("MicroMsg.MMSightCameraSetting", "setPreviewFormat Exception, %s, %s", new Object[] { Looper.myLooper(), paramCamera.getMessage() });
      GMTrace.o(7326543118336L, 54587);
    }
    return false;
  }
  
  private static boolean b(Camera paramCamera, boolean paramBoolean)
  {
    GMTrace.i(7326408900608L, 54586);
    if (paramCamera == null)
    {
      GMTrace.o(7326408900608L, 54586);
      return false;
    }
    Camera.Parameters localParameters;
    label247:
    List localList2;
    do
    {
      for (;;)
      {
        try
        {
          localParameters = paramCamera.getParameters();
          if (!paramBoolean) {
            break label247;
          }
          if (com.tencent.mm.compatible.d.p.fQC.fOP > 0)
          {
            w.i("MicroMsg.MMSightCameraSetting", "set frame rate > 0, do not try set preview frame rate");
            w.i("MicroMsg.MMSightCameraSetting", "use fix mode %B, supported preview frame rates %s", new Object[] { Boolean.valueOf(paramBoolean), localParameters.getSupportedPreviewFrameRates() });
            paramCamera.setParameters(localParameters);
            GMTrace.o(7326408900608L, 54586);
            return true;
          }
          if (localParameters == null)
          {
            w.e("MicroMsg.MMSightCamera", "trySetPreviewFrameRateParameters error, p is null!");
            continue;
          }
          try
          {
            List localList1 = localParameters.getSupportedPreviewFrameRates();
            if ((localList1 == null) || (localList1.size() <= 0)) {
              continue;
            }
            i = Math.min(30, ((Integer)Collections.max(localList1)).intValue());
            localParameters.setPreviewFrameRate(i);
            w.i("MicroMsg.MMSightCameraSetting", "set preview frame rate %d", new Object[] { Integer.valueOf(i) });
          }
          catch (Exception localException1)
          {
            w.i("MicroMsg.MMSightCameraSetting", "trySetPreviewFrameRateParameters Exception, %s, %s", new Object[] { Looper.myLooper(), localException1.getMessage() });
          }
        }
        catch (Exception paramCamera)
        {
          w.i("MicroMsg.MMSightCameraSetting", "setPreviewFrameRate Exception, %s, %s", new Object[] { Looper.myLooper(), paramCamera.getMessage() });
          GMTrace.o(7326408900608L, 54586);
          return false;
        }
        continue;
        if (com.tencent.mm.compatible.d.p.fQC.fOP <= 0) {
          break;
        }
        w.i("MicroMsg.MMSightCameraSetting", "set frame rate > 0, do not try set preview fps range");
      }
      localList2 = localParameters.getSupportedPreviewFpsRange();
    } while ((localList2 == null) || (localList2.size() == 0));
    int j = Integer.MIN_VALUE;
    int i = Integer.MIN_VALUE;
    int n = 0;
    int i6 = localList2.size();
    int i3 = 0;
    for (;;)
    {
      int i2;
      int i1;
      int i4;
      int m;
      if (i3 < i6)
      {
        int[] arrayOfInt = (int[])localList2.get(i3);
        i2 = i;
        i1 = j;
        if (arrayOfInt != null)
        {
          i2 = i;
          i1 = j;
          if (arrayOfInt.length > 1)
          {
            int i5 = arrayOfInt[0];
            i4 = arrayOfInt[1];
            w.i("MicroMsg.MMSightCamera", "dkfps %d:[%d %d]", new Object[] { Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i4) });
            i2 = i;
            i1 = j;
            if (i5 >= 0)
            {
              i2 = i;
              i1 = j;
              if (i4 >= i5)
              {
                k = i;
                m = j;
                if (i4 < i) {
                  break label590;
                }
                k = i;
                m = j;
                if (n != 0) {
                  break label590;
                }
                k = i4;
                m = i5;
                break label590;
              }
            }
          }
        }
      }
      else
      {
        w.i("MicroMsg.MMSightCameraSetting", "dkfps get fit  [%d %d], max target fps %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(30) });
        if ((j == Integer.MAX_VALUE) || (i == Integer.MAX_VALUE)) {
          break;
        }
        try
        {
          localParameters.setPreviewFpsRange(j, i);
          w.i("MicroMsg.MMSightCameraSetting", "set fps range %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        }
        catch (Exception localException2)
        {
          w.i("MicroMsg.MMSightCameraSetting", "trySetPreviewFpsRangeParameters Exception, %s, %s", new Object[] { Looper.myLooper(), localException2.getMessage() });
        }
        break;
      }
      label590:
      do
      {
        i = n;
        j = i2;
        k = i1;
        break;
        i2 = k;
        i1 = m;
      } while (i4 < 30000);
      i = 1;
      j = k;
      int k = m;
      i3 += 1;
      n = i;
      i = j;
      j = k;
    }
  }
  
  private static boolean c(Camera paramCamera)
  {
    GMTrace.i(7326677336064L, 54588);
    if (paramCamera == null)
    {
      GMTrace.o(7326677336064L, 54588);
      return false;
    }
    for (;;)
    {
      Camera.Parameters localParameters;
      List localList;
      try
      {
        localParameters = paramCamera.getParameters();
        localList = localParameters.getSupportedFocusModes();
        if ((localList != null) && (localList.contains("continuous-picture")))
        {
          w.i("MicroMsg.MMSightCameraSetting", "support continuous picture");
          localParameters.setFocusMode("continuous-picture");
          paramCamera.setParameters(localParameters);
          GMTrace.o(7326677336064L, 54588);
          return true;
        }
        if ((localList != null) && (localList.contains("continuous-video")))
        {
          w.i("MicroMsg.MMSightCameraSetting", "support continuous video");
          localParameters.setFocusMode("continuous-video");
          continue;
        }
        if (localList == null) {
          break label186;
        }
      }
      catch (Exception paramCamera)
      {
        w.i("MicroMsg.MMSightCameraSetting", "setFocusMode Exception, %s, %s", new Object[] { Looper.myLooper(), paramCamera.getMessage() });
        GMTrace.o(7326677336064L, 54588);
        return false;
      }
      if (localList.contains("auto"))
      {
        w.i("MicroMsg.MMSightCameraSetting", "support auto focus");
        localParameters.setFocusMode("auto");
      }
      else
      {
        label186:
        w.i("MicroMsg.MMSightCameraSetting", "not support continuous video or auto focus");
      }
    }
  }
  
  private static void d(Camera paramCamera)
  {
    GMTrace.i(20190238605312L, 150429);
    try
    {
      Camera.Parameters localParameters = paramCamera.getParameters();
      if (localParameters.isZoomSupported()) {
        localParameters.setZoom(0);
      }
      paramCamera.setParameters(localParameters);
      GMTrace.o(20190238605312L, 150429);
      return;
    }
    catch (Exception paramCamera)
    {
      w.e("MicroMsg.MMSightCamera", "safeResetZoom error: %s", new Object[] { paramCamera.getMessage() });
      GMTrace.o(20190238605312L, 150429);
    }
  }
  
  public final int a(SurfaceTexture paramSurfaceTexture, int paramInt, float paramFloat, boolean paramBoolean)
  {
    GMTrace.i(20190104387584L, 150428);
    long l = bg.Pw();
    this.mYo = false;
    w.i("MicroMsg.MMSightCamera", "start preview, previewing %B, %s %s", new Object[] { Boolean.valueOf(this.mXX), Looper.myLooper(), paramSurfaceTexture });
    if (this.mXX)
    {
      GMTrace.o(20190104387584L, 150428);
      return 0;
    }
    if (paramSurfaceTexture == null)
    {
      paramInt = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(20190104387584L, 150428);
      return 0 - paramInt;
    }
    w.i("MicroMsg.MMSightCamera", "this texture %s", new Object[] { paramSurfaceTexture });
    for (;;)
    {
      try
      {
        a(this.fPj, paramInt, paramFloat, paramBoolean);
        if (k.aPI().naR == null) {
          break label669;
        }
        localInteger = Integer.valueOf(k.aPI().naR.mWW);
        if (com.tencent.mm.compatible.d.p.fQC.fOU == 1)
        {
          str = "Range";
          if (com.tencent.mm.compatible.d.p.fQC.fOV != 1) {
            break label686;
          }
          paramBoolean = true;
          if (com.tencent.mm.compatible.d.p.fQC.fOW != 1) {
            break label692;
          }
          bool1 = true;
          if (com.tencent.mm.compatible.d.p.fQC.fOX != 1) {
            break label698;
          }
          bool2 = true;
          if (com.tencent.mm.compatible.d.p.fQC.fOY != 1) {
            break label704;
          }
          bool3 = true;
          w.i("MicroMsg.MMSightCamera", "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", new Object[] { localInteger, str, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
          if ((com.tencent.mm.compatible.d.p.fQC.fOU == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 1)))
          {
            b(this.fPj, false);
            if ((com.tencent.mm.compatible.d.p.fQC.fOV == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 2))) {
              b(this.fPj);
            }
            if ((com.tencent.mm.compatible.d.p.fQJ.fQY != -1) && (com.tencent.mm.compatible.d.p.fQJ.fQY == 1) && (com.tencent.mm.compatible.util.d.ev(14))) {
              a(this.fPj);
            }
            if ((com.tencent.mm.compatible.d.p.fQC.fOX == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 4))) {
              c(this.fPj);
            }
            if ((com.tencent.mm.compatible.d.p.fQC.fOY == 1) && (localInteger.intValue() != 0)) {
              localInteger.intValue();
            }
            d(this.fPj);
            aOX();
            this.fPj.setPreviewTexture(paramSurfaceTexture);
            this.fPj.startPreview();
            if (!j.mZc.mZo) {
              break label652;
            }
            if ((com.tencent.mm.compatible.d.p.fQC.fOX == 0) && (this.aDS != null) && (this.mYb != null)) {
              this.aDS.registerListener(this, this.mYb, 2);
            }
            this.mXX = true;
            w.i("MicroMsg.MMSightCamera", "start preview end, use %dms %s", new Object[] { Long.valueOf(bg.aI(l)), Looper.myLooper() });
            GMTrace.o(20190104387584L, 150428);
            return 0;
          }
        }
        else
        {
          if (com.tencent.mm.compatible.d.p.fQC.fOT != 1) {
            break label678;
          }
          str = "Fix";
          continue;
        }
        if ((com.tencent.mm.compatible.d.p.fQC.fOT != 1) || ((localInteger.intValue() != 0) && (localInteger.intValue() != 5))) {
          continue;
        }
        b(this.fPj, true);
        continue;
        this.aDS.registerListener(this, this.mYb, 2);
      }
      catch (Exception paramSurfaceTexture)
      {
        w.e("MicroMsg.MMSightCamera", "start preview FAILED, %s, %s", new Object[] { Looper.myLooper(), paramSurfaceTexture.getMessage() });
        paramInt = com.tencent.mm.compatible.util.g.tA();
        GMTrace.o(20190104387584L, 150428);
        return 0 - paramInt;
      }
      label652:
      continue;
      label669:
      Integer localInteger = Integer.valueOf(0);
      continue;
      label678:
      String str = "Error";
      continue;
      label686:
      paramBoolean = false;
      continue;
      label692:
      boolean bool1 = false;
      continue;
      label698:
      boolean bool2 = false;
      continue;
      label704:
      boolean bool3 = false;
    }
  }
  
  @TargetApi(11)
  public final int a(SurfaceTexture paramSurfaceTexture, boolean paramBoolean)
  {
    GMTrace.i(7326811553792L, 54589);
    long l = bg.Pw();
    this.mYo = false;
    w.i("MicroMsg.MMSightCamera", "start preview, previewing %B, %s %s autoConfig %s", new Object[] { Boolean.valueOf(this.mXX), Looper.myLooper(), paramSurfaceTexture, Boolean.valueOf(paramBoolean) });
    if (this.mXX)
    {
      GMTrace.o(7326811553792L, 54589);
      return 0;
    }
    int i;
    if (paramSurfaceTexture == null)
    {
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(7326811553792L, 54589);
      return 0 - i;
    }
    w.i("MicroMsg.MMSightCamera", "this texture %s", new Object[] { paramSurfaceTexture });
    for (;;)
    {
      try
      {
        a(this.fPj, paramBoolean);
        if (k.aPI().naR == null) {
          break label671;
        }
        localInteger = Integer.valueOf(k.aPI().naR.mWW);
        if (com.tencent.mm.compatible.d.p.fQC.fOU == 1)
        {
          str = "Range";
          if (com.tencent.mm.compatible.d.p.fQC.fOV != 1) {
            break label688;
          }
          paramBoolean = true;
          if (com.tencent.mm.compatible.d.p.fQC.fOW != 1) {
            break label693;
          }
          bool1 = true;
          if (com.tencent.mm.compatible.d.p.fQC.fOX != 1) {
            break label699;
          }
          bool2 = true;
          if (com.tencent.mm.compatible.d.p.fQC.fOY != 1) {
            break label705;
          }
          bool3 = true;
          w.i("MicroMsg.MMSightCamera", "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", new Object[] { localInteger, str, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
          if ((com.tencent.mm.compatible.d.p.fQC.fOU == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 1)))
          {
            b(this.fPj, false);
            if ((com.tencent.mm.compatible.d.p.fQC.fOV == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 2))) {
              b(this.fPj);
            }
            if ((com.tencent.mm.compatible.d.p.fQJ.fQY != -1) && (com.tencent.mm.compatible.d.p.fQJ.fQY == 1) && (com.tencent.mm.compatible.util.d.ev(14))) {
              a(this.fPj);
            }
            if ((com.tencent.mm.compatible.d.p.fQC.fOX == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 4))) {
              c(this.fPj);
            }
            if ((com.tencent.mm.compatible.d.p.fQC.fOY == 1) && (localInteger.intValue() != 0)) {
              localInteger.intValue();
            }
            d(this.fPj);
            aOX();
            this.fPj.setPreviewTexture(paramSurfaceTexture);
            this.fPj.startPreview();
            if (!j.mZc.mZo) {
              break label654;
            }
            if ((com.tencent.mm.compatible.d.p.fQC.fOX == 0) && (this.aDS != null) && (this.mYb != null)) {
              this.aDS.registerListener(this, this.mYb, 2);
            }
            this.mXX = true;
            w.i("MicroMsg.MMSightCamera", "start preview end, use %dms %s", new Object[] { Long.valueOf(bg.aI(l)), Looper.myLooper() });
            GMTrace.o(7326811553792L, 54589);
            return 0;
          }
        }
        else
        {
          if (com.tencent.mm.compatible.d.p.fQC.fOT != 1) {
            break label680;
          }
          str = "Fix";
          continue;
        }
        if ((com.tencent.mm.compatible.d.p.fQC.fOT != 1) || ((localInteger.intValue() != 0) && (localInteger.intValue() != 5))) {
          continue;
        }
        b(this.fPj, true);
        continue;
        this.aDS.registerListener(this, this.mYb, 2);
      }
      catch (Exception paramSurfaceTexture)
      {
        w.e("MicroMsg.MMSightCamera", "start preview FAILED, %s, %s", new Object[] { Looper.myLooper(), paramSurfaceTexture.getMessage() });
        i = com.tencent.mm.compatible.util.g.tA();
        GMTrace.o(7326811553792L, 54589);
        return 0 - i;
      }
      label654:
      continue;
      label671:
      Integer localInteger = Integer.valueOf(0);
      continue;
      label680:
      String str = "Error";
      continue;
      label688:
      paramBoolean = false;
      continue;
      label693:
      boolean bool1 = false;
      continue;
      label699:
      boolean bool2 = false;
      continue;
      label705:
      boolean bool3 = false;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(7325872029696L, 54582);
    this.mYp = parama;
    String str1;
    String str2;
    com.tencent.mm.plugin.base.model.a locala;
    if (parama == a.mYI)
    {
      parama = a.aOR();
      str1 = this.mYr.aOT();
      str2 = this.mYq.aOT();
      locala = this.mYl;
      if (locala.jiO != 0) {
        break label100;
      }
    }
    label100:
    for (int i = 0;; i = locala.jiN / locala.jiO)
    {
      parama.mXx = ((int)(bg.SA(str1) * 10.0D));
      parama.mXy = ((int)(bg.SA(str2) * 10.0D));
      parama.mXE = i;
      GMTrace.o(7325872029696L, 54582);
      return;
    }
  }
  
  public final void a(b paramb, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(20190372823040L, 150430);
    w.i("MicroMsg.MMSightCamera", "takePicture, callback: %s, currentFrameData: %s, isLandscape: %s, degree: %s", new Object[] { paramb, this.mYx, Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (this.mYx != null) {
      try
      {
        this.mYy = true;
        Point localPoint = new Point();
        if (this.mYh != null) {
          localPoint.x = this.mYh.x;
        }
        for (localPoint.y = this.mYh.y;; localPoint.y = this.mYg.y)
        {
          byte[] arrayOfByte = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(this.mYx.length));
          System.arraycopy(this.mYx, 0, arrayOfByte, 0, this.mYx.length);
          int i = this.mYa.eSp;
          paramb.a(arrayOfByte, localPoint.x, localPoint.y, i, paramInt);
          this.mYy = false;
          GMTrace.o(20190372823040L, 150430);
          return;
          if ((this.mYj == null) || (!this.mYk)) {
            break;
          }
          localPoint.x = this.mYg.x;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.MMSightCamera", "takePicture error: %s", new Object[] { localException.getMessage() });
          this.mYy = false;
          paramb.a(null, 0, 0, -1, 0);
          this.mYy = false;
          GMTrace.o(20190372823040L, 150430);
          return;
          localException.x = this.mXU.kXB;
          localException.y = this.mXU.kXC;
        }
      }
      finally
      {
        this.mYy = false;
      }
    }
    GMTrace.o(20190372823040L, 150430);
  }
  
  public final void a(f paramf)
  {
    GMTrace.i(16372012679168L, 121981);
    if (paramf != null) {
      this.mYn.add(paramf);
    }
    GMTrace.o(16372012679168L, 121981);
  }
  
  public final boolean a(Context paramContext, SurfaceTexture paramSurfaceTexture, int paramInt, float paramFloat, boolean paramBoolean)
  {
    GMTrace.i(20190775476224L, 150433);
    w.i("MicroMsg.MMSightCamera", "switch camera with limit, current useBack: %s", new Object[] { Boolean.valueOf(this.mYE) });
    try
    {
      aOV();
      if (!this.mYE) {}
      for (boolean bool = true;; bool = false)
      {
        h(paramContext, bool);
        a(paramSurfaceTexture, paramInt, paramFloat, paramBoolean);
        GMTrace.o(20190775476224L, 150433);
        return true;
      }
      return false;
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.MMSightCamera", "switchCamera error: %s", new Object[] { paramContext });
      GMTrace.o(20190775476224L, 150433);
    }
  }
  
  public final boolean a(Context paramContext, SurfaceTexture paramSurfaceTexture, boolean paramBoolean)
  {
    GMTrace.i(20190641258496L, 150432);
    w.i("MicroMsg.MMSightCamera", "switch camera, current useBack: %s", new Object[] { Boolean.valueOf(this.mYE) });
    try
    {
      aOV();
      if (!this.mYE) {}
      for (boolean bool = true;; bool = false)
      {
        h(paramContext, bool);
        a(paramSurfaceTexture, paramBoolean);
        GMTrace.o(20190641258496L, 150432);
        return true;
      }
      return false;
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.MMSightCamera", "switchCamera error: %s", new Object[] { paramContext });
      GMTrace.o(20190641258496L, 150432);
    }
  }
  
  public final void aOV()
  {
    GMTrace.i(7326006247424L, 54583);
    if ((this.aDS != null) && (this.mYb != null)) {
      this.aDS.unregisterListener(this);
    }
    w.i("MicroMsg.MMSightCamera", this.mYq.getValue());
    w.i("MicroMsg.MMSightCamera", this.mYr.getValue());
    w.i("MicroMsg.MMSightCamera", this.mYs.getValue());
    w.i("MicroMsg.MMSightCamera", this.mYt.getValue());
    w.i("MicroMsg.MMSightCamera", this.mYu.getValue());
    w.i("MicroMsg.MMSightCamera", this.mYv.getValue());
    if (this.fPj != null)
    {
      long l = bg.Pw();
      w.i("MicroMsg.MMSightCamera", "release camera beg, %s", new Object[] { Looper.myLooper() });
      this.mYD.removeCallbacksAndMessages(null);
      this.mYD.mYM = true;
      this.fPj.setPreviewCallback(null);
      this.fPj.stopPreview();
      this.fPj.release();
      this.fPj = null;
      this.mXX = false;
      w.i("MicroMsg.MMSightCamera", "release camera end, use %dms, %s", new Object[] { Long.valueOf(bg.aI(l)), Looper.myLooper() });
    }
    this.mXV = false;
    this.mYc = 0.0F;
    this.mYd = 0.0F;
    this.mYe = 0.0F;
    mYB = true;
    this.mContext = null;
    this.mYA = false;
    this.mYg = null;
    this.mYh = null;
    this.mYx = null;
    this.mYo = false;
    GMTrace.o(7326006247424L, 54583);
  }
  
  public final void aOW()
  {
    GMTrace.i(20189835952128L, 150426);
    w.i("MicroMsg.MMSightCamera", "switchToPictureFocusMode");
    if ((this.fPj != null) && (this.mXX)) {
      try
      {
        Camera.Parameters localParameters = this.fPj.getParameters();
        List localList = localParameters.getSupportedFocusModes();
        if ((localList != null) && (localList.contains("continuous-picture")))
        {
          w.i("MicroMsg.MMSightCameraSetting", "support continuous picture");
          localParameters.setFocusMode("continuous-picture");
        }
        this.fPj.setParameters(localParameters);
        GMTrace.o(20189835952128L, 150426);
        return;
      }
      catch (Exception localException)
      {
        w.i("MicroMsg.MMSightCamera", "switchToPictureFocusMode error: %s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(20189835952128L, 150426);
  }
  
  public final void aOY()
  {
    GMTrace.i(7326945771520L, 54590);
    if (true == this.mYA)
    {
      GMTrace.o(7326945771520L, 54590);
      return;
    }
    if (this.mContext == null)
    {
      GMTrace.o(7326945771520L, 54590);
      return;
    }
    if ((Build.MANUFACTURER.equalsIgnoreCase("meizu")) && (!com.tencent.mm.compatible.e.b.tu()))
    {
      GMTrace.o(7326945771520L, 54590);
      return;
    }
    Object localObject = new lm();
    ((lm)localObject).ePT.type = 2;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    if (((lm)localObject).ePU.ePS)
    {
      this.mYA = true;
      GMTrace.o(7326945771520L, 54590);
      return;
    }
    localObject = h.h(this.mContext, a.a.nko, a.a.cUG);
    if (localObject != null)
    {
      ((i)localObject).setCancelable(false);
      ((i)localObject).setCanceledOnTouchOutside(false);
      ((i)localObject).show();
      this.mYA = true;
    }
    GMTrace.o(7326945771520L, 54590);
  }
  
  public final String aOZ()
  {
    GMTrace.i(7327079989248L, 54591);
    if (this.fPj == null)
    {
      GMTrace.o(7327079989248L, 54591);
      return "";
    }
    for (;;)
    {
      Object localObject2;
      try
      {
        StringBuffer localStringBuffer = new StringBuffer();
        Object localObject1 = com.tencent.mm.plugin.mmsight.d.a(this.fPj.getParameters());
        localObject2 = com.tencent.mm.plugin.mmsight.d.cN(this.mContext);
        localStringBuffer.append(String.format("Screen size %d %d r:%.4f\n", new Object[] { Integer.valueOf(((Point)localObject2).x), Integer.valueOf(((Point)localObject2).y), Double.valueOf(((Point)localObject2).x * 1.0D / ((Point)localObject2).y) }));
        localObject1 = ((ArrayList)localObject1).iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localObject2 = (Camera.Size)((Iterator)localObject1).next();
        if (((getPreviewWidth() == ((Camera.Size)localObject2).width) && (getPreviewHeight() == ((Camera.Size)localObject2).height)) || ((getPreviewWidth() == ((Camera.Size)localObject2).height) && (getPreviewHeight() == ((Camera.Size)localObject2).width)))
        {
          localStringBuffer.append(String.format("%s*%s √ r:%.4f\n", new Object[] { Integer.valueOf(((Camera.Size)localObject2).width), Integer.valueOf(((Camera.Size)localObject2).height), Double.valueOf(((Camera.Size)localObject2).height * 1.0D / ((Camera.Size)localObject2).width) }));
          continue;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MMSightCamera", "getDebugInfo error: %s", new Object[] { localException.getMessage() });
        GMTrace.o(7327079989248L, 54591);
        return null;
      }
      tmp275_272[0] = Integer.valueOf(((Camera.Size)localObject2).width);
      Object[] tmp285_275 = tmp275_272;
      tmp285_275[1] = Integer.valueOf(((Camera.Size)localObject2).height);
      Object[] tmp295_285 = tmp285_275;
      tmp295_285[2] = Double.valueOf(((Camera.Size)localObject2).height * 1.0D / ((Camera.Size)localObject2).width);
      localException.append(String.format("%s*%s X r:%.4f\n", tmp295_285));
    }
    if (this.mYh != null) {
      localException.append("\nSIGHTCROPMODE:  " + this.mYh.x + " " + this.mYh.y + " from " + this.mXU.kXB + " " + this.mXU.kXC);
    }
    for (;;)
    {
      localException.append("\ngetOrientation:" + getOrientation());
      localException.append("\nrecorderOption: " + com.tencent.mm.compatible.d.p.fQJ.fQX);
      String str = localException.toString();
      GMTrace.o(7327079989248L, 54591);
      return str;
      str.append("\nFinalPreviewSize: " + getPreviewWidth() + " " + getPreviewHeight());
    }
  }
  
  public final void aPa()
  {
    GMTrace.i(20190909693952L, 150434);
    w.i("MicroMsg.MMSightCamera", "openFlash, camera: %s, isPreviewing: %s", new Object[] { this.fPj, Boolean.valueOf(this.mXX) });
    if ((this.fPj != null) && (this.mXX)) {
      try
      {
        this.mYm = true;
        Camera.Parameters localParameters = this.fPj.getParameters();
        if ((!bg.cc(localParameters.getSupportedFlashModes())) && (localParameters.getSupportedFlashModes().contains("torch")))
        {
          localParameters.setFlashMode("torch");
          this.fPj.setParameters(localParameters);
          w.i("MicroMsg.MMSightCamera", "open flash");
          GMTrace.o(20190909693952L, 150434);
          return;
        }
        w.i("MicroMsg.MMSightCamera", "camera not support flash!!");
        GMTrace.o(20190909693952L, 150434);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MMSightCamera", localException, "openFlash error: %s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(20190909693952L, 150434);
  }
  
  public final void aPb()
  {
    GMTrace.i(20191043911680L, 150435);
    w.i("MicroMsg.MMSightCamera", "closeFlash, camera: %s, isPreviewing: %s", new Object[] { this.fPj, Boolean.valueOf(this.mXX) });
    if ((this.fPj != null) && (this.mXX)) {
      try
      {
        this.mYm = false;
        Camera.Parameters localParameters = this.fPj.getParameters();
        if ((!bg.cc(localParameters.getSupportedFlashModes())) && (localParameters.getSupportedFlashModes().contains("off")))
        {
          localParameters.setFlashMode("off");
          this.fPj.setParameters(localParameters);
          w.i("MicroMsg.MMSightCamera", "close flash");
          GMTrace.o(20191043911680L, 150435);
          return;
        }
        w.i("MicroMsg.MMSightCamera", "camera not support close flash!!");
        GMTrace.o(20191043911680L, 150435);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MMSightCamera", localException, "closeFlash error: %s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(20191043911680L, 150435);
  }
  
  public final boolean ax(byte[] paramArrayOfByte)
  {
    GMTrace.i(16040360673280L, 119510);
    bg.Pw();
    if ((this.mYn == null) || (this.mYn.size() == 0))
    {
      GMTrace.o(16040360673280L, 119510);
      return false;
    }
    Iterator localIterator = this.mYn.iterator();
    for (boolean bool = false; localIterator.hasNext(); bool = ((f)localIterator.next()).L(paramArrayOfByte) | bool) {}
    GMTrace.o(16040360673280L, 119510);
    return bool;
  }
  
  public final void b(f paramf)
  {
    GMTrace.i(20189567516672L, 150424);
    if (paramf != null) {
      this.mYn.remove(paramf);
    }
    GMTrace.o(20189567516672L, 150424);
  }
  
  public final void b(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    GMTrace.i(7327482642432L, 54594);
    if ((this.fPj != null) && (this.mXX)) {}
    for (;;)
    {
      int m;
      int k;
      int j;
      try
      {
        w.d("MicroMsg.MMSightCamera", "triggerSmallZoom, zoom: %s", new Object[] { Boolean.valueOf(paramBoolean1) });
        if (this.mXW)
        {
          w.d("MicroMsg.MMSightCamera", "triggerSmallZoom, zooming, ignore");
          this.mXW = false;
          GMTrace.o(7327482642432L, 54594);
          return;
        }
        Camera.Parameters localParameters = this.fPj.getParameters();
        if (localParameters.isZoomSupported())
        {
          this.mXW = true;
          m = localParameters.getZoom();
          k = localParameters.getMaxZoom();
          if (!paramBoolean2)
          {
            if (this.mXS <= 0)
            {
              this.mXS = Math.round(k / 15.0F);
              if (this.mXS > 5) {
                this.mXS = 5;
              }
            }
            i = this.mXS;
            w.d("MicroMsg.MMSightCamera", "triggerSmallZoom, currentZoom: %s, maxZoom: %s, smallZoomStep: %s, scrollSmallZoomStep: %s, factor: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(this.mXS), Integer.valueOf(this.mXT), Integer.valueOf(paramInt) });
            j = i;
            if (paramInt > 0) {
              j = i * paramInt;
            }
            if (paramBoolean1)
            {
              if (m < k) {
                break label455;
              }
              this.mXW = false;
              GMTrace.o(7327482642432L, 54594);
            }
          }
          else
          {
            if (this.mXT <= 0)
            {
              w.e("MicroMsg.MMSightCamera", "scroll zoom error, scrollSmallZoomStep: %s", new Object[] { Integer.valueOf(this.mXT) });
              this.mXW = false;
              GMTrace.o(7327482642432L, 54594);
              return;
            }
            i = this.mXT;
            continue;
            w.d("MicroMsg.MMSightCamera", "triggerSmallZoom, nextZoom: %s", new Object[] { Integer.valueOf(paramInt) });
            localParameters.setZoom(paramInt);
            this.fPj.setParameters(localParameters);
          }
        }
        else
        {
          this.mXW = false;
          GMTrace.o(7327482642432L, 54594);
          return;
        }
        if (m == 0)
        {
          this.mXW = false;
          GMTrace.o(7327482642432L, 54594);
          return;
        }
        int i = m - j;
        paramInt = i;
        if (i > 0) {
          continue;
        }
        paramInt = 0;
        continue;
        GMTrace.o(7327482642432L, 54594);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MMSightCamera", "triggerSmallZoom error: %s", new Object[] { localException.getMessage() });
        this.mXW = false;
        GMTrace.o(7327482642432L, 54594);
        return;
      }
      finally
      {
        this.mXW = false;
      }
      return;
      label455:
      do
      {
        break;
        paramInt = j + m;
      } while (paramInt < k);
      paramInt = k;
    }
  }
  
  public final int getOrientation()
  {
    GMTrace.i(7328153731072L, 54599);
    if ((this.mYa != null) && (this.mXX))
    {
      int i = this.mYa.eSp;
      GMTrace.o(7328153731072L, 54599);
      return i;
    }
    GMTrace.o(7328153731072L, 54599);
    return -1;
  }
  
  public final int getPreviewHeight()
  {
    GMTrace.i(7328019513344L, 54598);
    if (this.fPj == null)
    {
      GMTrace.o(7328019513344L, 54598);
      return 0;
    }
    if (this.mYa != null) {
      try
      {
        int i;
        if ((this.mYk) && (this.mYj != null)) {
          if ((this.mYa.eSp == 0) || (this.mYa.eSp == 180)) {
            i = this.mYg.y;
          }
        }
        for (;;)
        {
          GMTrace.o(7328019513344L, 54598);
          return i;
          i = this.mYg.x;
          continue;
          if (this.mYh == null)
          {
            if ((this.mYa.eSp == 0) || (this.mYa.eSp == 180)) {
              i = this.mXU.kXC;
            } else {
              i = this.mXU.kXB;
            }
          }
          else if ((this.mYa.eSp == 0) || (this.mYa.eSp == 180)) {
            i = this.mYh.y;
          } else {
            i = this.mYh.x;
          }
        }
        GMTrace.o(7328019513344L, 54598);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MMSightCamera", "getPreviewHeight: %s", new Object[] { localException.getMessage() });
      }
    }
    return 0;
  }
  
  public final int getPreviewWidth()
  {
    GMTrace.i(7327885295616L, 54597);
    if (this.fPj == null)
    {
      GMTrace.o(7327885295616L, 54597);
      return 0;
    }
    if (this.mYa != null) {
      try
      {
        int i;
        if ((this.mYk) && (this.mYj != null)) {
          if ((this.mYa.eSp == 0) || (this.mYa.eSp == 180)) {
            i = this.mYg.x;
          }
        }
        for (;;)
        {
          GMTrace.o(7327885295616L, 54597);
          return i;
          i = this.mYg.y;
          continue;
          if (this.mYh == null)
          {
            if ((this.mYa.eSp == 0) || (this.mYa.eSp == 180)) {
              i = this.mXU.kXB;
            } else {
              i = this.mXU.kXC;
            }
          }
          else if ((this.mYa.eSp == 0) || (this.mYa.eSp == 180)) {
            i = this.mYh.x;
          } else {
            i = this.mYh.y;
          }
        }
        GMTrace.o(7327885295616L, 54597);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MMSightCamera", "getPreviewWidth: %s", new Object[] { localException.getMessage() });
      }
    }
    return 0;
  }
  
  public final boolean h(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(20190507040768L, 150431);
    if ((!j.mZc.mZo) || ((com.tencent.mm.compatible.d.p.fQC.fOX == 0) && (this.aDS == null) && (this.mYb == null)))
    {
      this.aDS = ((SensorManager)paramContext.getSystemService("sensor"));
      this.mYb = this.aDS.getDefaultSensor(1);
    }
    if (this.fPj == null)
    {
      aOV();
      this.mYE = paramBoolean;
      if (!paramBoolean) {}
    }
    for (;;)
    {
      try
      {
        this.mXY = c.sF();
        w.i("MicroMsg.MMSightCamera", "use camera id %d, DeviceInfo id %d", new Object[] { Integer.valueOf(this.mXY), Integer.valueOf(com.tencent.mm.compatible.d.p.fQC.fOZ) });
        this.mYA = false;
        this.mContext = paramContext;
        this.mYa = new n().o(paramContext, this.mXY);
        w.i("MicroMsg.MMSightCamera", "open camera end, %s", new Object[] { Looper.myLooper() });
        if (this.mYa == null)
        {
          w.i("MicroMsg.MMSightCamera", "open camera FAILED, %s", new Object[] { Looper.myLooper() });
          aOY();
          GMTrace.o(20190507040768L, 150431);
          return false;
          int j = Camera.getNumberOfCameras();
          Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
          i = 0;
          if (i >= j) {
            break label428;
          }
          Camera.getCameraInfo(i, localCameraInfo);
          if (localCameraInfo.facing == 1)
          {
            w.d("MicroMsg.CameraUtil", "tigercam get fid %d", new Object[] { Integer.valueOf(i) });
            w.d("MicroMsg.CameraUtil", "tigercam getBackCameraId %d", new Object[] { Integer.valueOf(i) });
            this.mXY = i;
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.MMSightCamera", localException, "try to get cameraid error %s, useBackCamera: %s", new Object[] { localException.getMessage(), Boolean.valueOf(this.mYE) });
        this.mXY = 0;
        continue;
        i += 1;
        continue;
        this.fPj = this.mYa.fPj;
        this.mYD.mYM = false;
        this.mXU.eSp = this.mYa.eSp;
        if (this.fPj == null)
        {
          w.e("MicroMsg.MMSightCamera", "start camera FAILED!");
          aOY();
          GMTrace.o(20190507040768L, 150431);
          return false;
        }
      }
      GMTrace.o(20190507040768L, 150431);
      return true;
      label428:
      int i = 0;
    }
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    GMTrace.i(7327214206976L, 54592);
    GMTrace.o(7327214206976L, 54592);
  }
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    GMTrace.i(7327348424704L, 54593);
    float f1 = paramSensorEvent.values[0];
    float f2 = paramSensorEvent.values[1];
    float f3 = paramSensorEvent.values[2];
    if ((Math.abs(this.mYc - f1) > 5.0F) || (Math.abs(this.mYd - f2) > 5.0F) || (Math.abs(this.mYe - f3) > 5.0F))
    {
      w.i("MicroMsg.MMSightCamera", "match accel limit %f, try auto focus x %s y %s z %s", new Object[] { Float.valueOf(5.0F), Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3) });
      this.mYD.e(this.fPj);
      this.mYc = f1;
      this.mYd = f2;
      this.mYe = f3;
    }
    GMTrace.o(7327348424704L, 54593);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(7336341012480L, 54660);
      mYG = new a("Preview", 0);
      mYH = new a("Recording", 1);
      mYI = new a("Stoping", 2);
      mYJ = new a[] { mYG, mYH, mYI };
      GMTrace.o(7336341012480L, 54660);
    }
    
    private a()
    {
      GMTrace.i(7336206794752L, 54659);
      GMTrace.o(7336206794752L, 54659);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
  
  private final class c
    extends ae
  {
    boolean mXV;
    int mYK;
    boolean mYL;
    boolean mYM;
    public float mYN;
    public int mYO;
    public int mYP;
    public float mps;
    
    public c(Looper paramLooper)
    {
      super();
      GMTrace.i(7325200941056L, 54577);
      this.mYK = 0;
      this.mXV = false;
      this.mYL = false;
      this.mYM = false;
      GMTrace.o(7325200941056L, 54577);
    }
    
    private static Rect a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2)
    {
      GMTrace.i(7324798287872L, 54574);
      paramFloat3 = 80.0F * paramFloat3;
      paramFloat1 /= paramInt1;
      paramFloat2 /= paramInt2;
      paramFloat1 = paramFloat1 * 2000.0F - 1000.0F - paramFloat3 / 2.0F;
      paramFloat2 = paramFloat2 * 2000.0F - 1000.0F - paramFloat3 / 2.0F;
      Object localObject = new RectF();
      ((RectF)localObject).set(paramFloat1, paramFloat2, paramFloat1 + paramFloat3, paramFloat3 + paramFloat2);
      localObject = new Rect(qI(Math.round(((RectF)localObject).left)), qI(Math.round(((RectF)localObject).top)), qI(Math.round(((RectF)localObject).right)), qI(Math.round(((RectF)localObject).bottom)));
      GMTrace.o(7324798287872L, 54574);
      return (Rect)localObject;
    }
    
    private static int b(Camera.Parameters paramParameters)
    {
      GMTrace.i(7325335158784L, 54578);
      if (paramParameters == null)
      {
        GMTrace.o(7325335158784L, 54578);
        return 0;
      }
      try
      {
        int j = paramParameters.getMaxZoom() / 2;
        i = j;
        if (j <= 0) {
          i = paramParameters.getMaxZoom();
        }
      }
      catch (Exception paramParameters)
      {
        for (;;)
        {
          w.e("MicroMsg.MMSightCamera", "get target zoom value error: %s", new Object[] { paramParameters.getMessage() });
          int i = 0;
        }
      }
      GMTrace.o(7325335158784L, 54578);
      return i;
    }
    
    private static int qI(int paramInt)
    {
      GMTrace.i(7324932505600L, 54575);
      if (paramInt > 1000)
      {
        GMTrace.o(7324932505600L, 54575);
        return 1000;
      }
      if (paramInt < 64536)
      {
        GMTrace.o(7324932505600L, 54575);
        return 64536;
      }
      GMTrace.o(7324932505600L, 54575);
      return paramInt;
    }
    
    final void e(Camera paramCamera)
    {
      GMTrace.i(7325066723328L, 54576);
      if (paramCamera == null)
      {
        w.w("MicroMsg.MMSightCamera", "want to auto focus, but camera is null, do nothing");
        GMTrace.o(7325066723328L, 54576);
        return;
      }
      if (!e.mYB)
      {
        w.w("MicroMsg.MMSightCamera", "auto focus not back");
        GMTrace.o(7325066723328L, 54576);
        return;
      }
      e.mYB = false;
      try
      {
        w.i("MicroMsg.MMSightCamera", "triggerAutoFocus");
        paramCamera.cancelAutoFocus();
        paramCamera.autoFocus(e.this.mYC);
        GMTrace.o(7325066723328L, 54576);
        return;
      }
      catch (Exception paramCamera)
      {
        w.w("MicroMsg.MMSightCamera", "autofocus fail, exception %s", new Object[] { paramCamera.getMessage() });
        e.mYB = true;
        GMTrace.o(7325066723328L, 54576);
      }
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(7325469376512L, 54579);
      switch (paramMessage.what)
      {
      }
      for (;;)
      {
        GMTrace.o(7325469376512L, 54579);
        return;
        paramMessage = (Camera)paramMessage.obj;
        if ((this.mYO == 0) || (this.mYP == 0) || (com.tencent.mm.compatible.util.d.eu(14)))
        {
          e(paramMessage);
          GMTrace.o(7325469376512L, 54579);
          return;
        }
        float f1 = this.mYN;
        float f2 = this.mps;
        int i = this.mYO;
        int j = this.mYP;
        if (paramMessage == null)
        {
          w.w("MicroMsg.MMSightCamera", "want to auto focus, but camera is null, do nothing");
          GMTrace.o(7325469376512L, 54579);
          return;
        }
        if (!e.mYB)
        {
          w.w("MicroMsg.MMSightCamera", "auto focus not back");
          GMTrace.o(7325469376512L, 54579);
          return;
        }
        e.mYB = false;
        try
        {
          paramMessage.cancelAutoFocus();
          w.i("MicroMsg.MMSightCamera", "ashutest:: touch %f %f, display %d %d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(j) });
          Object localObject2 = a(f1, f2, 1.0F, i, j);
          localObject1 = a(f1, f2, 1.5F, i, j);
          w.i("MicroMsg.MMSightCamera", "ashutest:: focus rect %s, meter rect %s", new Object[] { localObject2, localObject1 });
          localParameters = paramMessage.getParameters();
          Object localObject3 = localParameters.getSupportedFocusModes();
          if ((localObject3 != null) && (((List)localObject3).contains("auto"))) {
            localParameters.setFocusMode("auto");
          }
          if (localParameters.getMaxNumFocusAreas() > 0)
          {
            localObject3 = new ArrayList(1);
            ((ArrayList)localObject3).add(new Camera.Area((Rect)localObject2, 1000));
            localParameters.setFocusAreas((List)localObject3);
          }
          if (localParameters.getMaxNumMeteringAreas() > 0)
          {
            localObject2 = new ArrayList(1);
            ((ArrayList)localObject2).add(new Camera.Area((Rect)localObject1, 1000));
            localParameters.setMeteringAreas((List)localObject2);
          }
          paramMessage.setParameters(localParameters);
          paramMessage.autoFocus(e.this.mYC);
          GMTrace.o(7325469376512L, 54579);
          return;
        }
        catch (Exception paramMessage)
        {
          w.w("MicroMsg.MMSightCamera", "autofocus with area fail, exception %s", new Object[] { paramMessage.getMessage() });
          e.mYB = true;
          GMTrace.o(7325469376512L, 54579);
          return;
        }
        if (this.mYM)
        {
          GMTrace.o(7325469376512L, 54579);
          return;
        }
        Object localObject1 = (Camera)paramMessage.obj;
        Camera.Parameters localParameters = ((Camera)localObject1).getParameters();
        w.i("MicroMsg.MMSightCamera", "zoomed %s curZoomStep %s params.getZoom() %s", new Object[] { Boolean.valueOf(this.mXV), Integer.valueOf(this.mYK), Integer.valueOf(localParameters.getZoom()) });
        i = localParameters.getZoom() + this.mYK;
        if (this.mXV)
        {
          int k = b(localParameters);
          if (i >= k)
          {
            j = 1;
            i = k;
            label545:
            localParameters.setZoom(i);
          }
        }
        try
        {
          ((Camera)localObject1).setParameters(localParameters);
          if (j == 0) {
            continue;
          }
          this.mYO = 0;
          this.mYP = 0;
          continue;
          paramMessage = obtainMessage(4353, paramMessage.obj);
          if (this.mYL) {}
          for (long l = 10L;; l = 20L)
          {
            sendMessageDelayed(paramMessage, l);
            j = 0;
            break;
          }
          if (i <= 0)
          {
            i = 0;
            j = 1;
            break label545;
          }
          paramMessage = obtainMessage(4353, paramMessage.obj);
          if (this.mYL) {}
          for (l = 10L;; l = 20L)
          {
            sendMessageDelayed(paramMessage, l);
            j = 0;
            break;
          }
        }
        catch (Exception paramMessage)
        {
          for (;;) {}
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */