package com.tencent.mm.plugin.api.recordView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.a;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.c;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.d;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.e;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.f;
import com.tencent.mm.plugin.mmsight.model.a.d.a;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.a.k;
import com.tencent.mm.plugin.mmsight.model.e;
import com.tencent.mm.plugin.mmsight.model.e.3;
import com.tencent.mm.plugin.mmsight.model.e.b;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.video.b;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;

public final class f
  extends MMSightRecordView.d
  implements g.a, d.a, com.tencent.mm.plugin.mmsight.model.f
{
  private int audioSampleRate;
  private Context context;
  private int fps;
  private int gBk;
  private com.tencent.mm.plugin.mmsight.model.a.d hxA;
  public e hxB;
  public int hxC;
  public float hxD;
  private int hxE;
  private boolean hxF;
  private ObservableTextureView hxG;
  private MMSightCameraGLSurfaceView hxH;
  public boolean hxI;
  private MMSightRecordView.a hxJ;
  public boolean hxK;
  public boolean hxL;
  public int hxM;
  public Point hxN;
  private Point hxO;
  private boolean hxP;
  private boolean hxQ;
  private g hxR;
  public MMSightRecordView.c hxS;
  private boolean hxT;
  private float hxU;
  private byte[] hxV;
  private int videoBitrate;
  private String videoPath;
  
  public f()
  {
    GMTrace.i(20181380235264L, 150363);
    this.hxF = true;
    this.hxI = false;
    this.hxK = false;
    this.hxL = false;
    this.hxM = -1;
    this.hxP = true;
    this.hxQ = true;
    this.hxT = false;
    this.hxU = 1.0F;
    this.hxV = null;
    GMTrace.o(20181380235264L, 150363);
  }
  
  private void Ro()
  {
    GMTrace.i(20184198807552L, 150384);
    if ((this.hxB != null) && (this.hxB.mXX))
    {
      if (this.hxB.mYz)
      {
        this.hxO = new Point(com.tencent.mm.plugin.mmsight.d.cs((int)(this.hxB.getPreviewWidth() / this.hxD), this.hxB.getPreviewHeight()), this.hxB.getPreviewWidth());
        GMTrace.o(20184198807552L, 150384);
        return;
      }
      int i = com.tencent.mm.plugin.mmsight.d.cs((int)(this.hxB.getPreviewHeight() * this.hxD), this.hxB.getPreviewWidth());
      this.hxO = new Point(this.hxB.getPreviewHeight(), i);
    }
    GMTrace.o(20184198807552L, 150384);
  }
  
  public final boolean L(byte[] paramArrayOfByte)
  {
    GMTrace.i(20185406767104L, 150393);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(20185406767104L, 150393);
      return false;
    }
    int j;
    int k;
    byte[] arrayOfByte;
    label166:
    label171:
    Object localObject;
    a locala;
    int m;
    if ((this.hxD > 0.0F) && (this.hxC > 0) && (this.hxB != null))
    {
      j = this.hxB.getPreviewWidth();
      k = this.hxB.getPreviewHeight();
      if (this.hxB.mYz)
      {
        i = (int)(this.hxB.getPreviewWidth() / this.hxD);
        if (i >= k) {
          break label1077;
        }
        if ((!this.hxK) && (this.hxV == null))
        {
          this.hxV = new byte[j * i * 3 >> 1];
          arrayOfByte = this.hxV;
          bg.Pw();
          SightVideoJNI.cropCameraDataLongEdge(paramArrayOfByte, arrayOfByte, k, this.hxO.x, j);
          if (this.hxK) {
            i = this.hxO.x;
          }
          this.hxT = true;
          k = i;
          i = j;
          localObject = arrayOfByte;
          if (this.hxH != null)
          {
            localObject = this.hxH;
            j = this.hxB.getOrientation();
            if ((k != ((MMSightCameraGLSurfaceView)localObject).hwX) || (i != ((MMSightCameraGLSurfaceView)localObject).hwY) || (j != ((MMSightCameraGLSurfaceView)localObject).hxr))
            {
              w.i("MicroMsg.MMSightCameraGLSurfaceView", "setFrameInfo, width: %s, height: %s, rotate: %s this: %s", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), localObject });
              ((MMSightCameraGLSurfaceView)localObject).hwX = k;
              ((MMSightCameraGLSurfaceView)localObject).hwY = i;
              ((MMSightCameraGLSurfaceView)localObject).hxr = j;
            }
            localObject = this.hxH;
            if ((arrayOfByte == null) || (((MMSightCameraGLSurfaceView)localObject).hxp == null) || (((MMSightCameraGLSurfaceView)localObject).hxp.hwV)) {
              break label996;
            }
            locala = ((MMSightCameraGLSurfaceView)localObject).hxp;
            j = ((MMSightCameraGLSurfaceView)localObject).hwX;
            k = ((MMSightCameraGLSurfaceView)localObject).hwY;
            m = ((MMSightCameraGLSurfaceView)localObject).hxr;
          }
        }
      }
    }
    for (int i = 0;; i = 1)
    {
      label653:
      label691:
      label722:
      boolean bool;
      try
      {
        if ((locala.hwY != k) || (locala.hwX != j) || (locala.eSp != m) || (locala.hxo)) {
          continue;
        }
        if (i != 0) {
          w.d("MicroMsg.MMSightCameraGLRenderer", "setDrawFrame, frameData: %s, frameWidth: %s, frameHeight: %s, rotate: %s, isLandScape, frameSizeChange: %s, this %s", new Object[] { arrayOfByte, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Boolean.valueOf(false), Boolean.valueOf(true), locala });
        }
        locala.hwW = arrayOfByte;
        locala.hwX = j;
        locala.hwY = k;
        locala.eSp = m;
        locala.hxo = false;
        if (i != 0)
        {
          locala.hwZ = ByteBuffer.allocateDirect(k * j);
          locala.hxa = ByteBuffer.allocateDirect(j * k / 2);
          locala.hwZ.order(ByteOrder.nativeOrder());
          locala.hxa.order(ByteOrder.nativeOrder());
          locala.hxn = a.hwQ;
          if (locala.hxn != null)
          {
            locala.hxj.put(locala.hxn);
            locala.hxj.position(0);
          }
        }
        if ((locala.hwZ != null) && (locala.hxa != null))
        {
          locala.hwZ.put(arrayOfByte, 0, j * k);
          locala.hwZ.position(0);
          locala.hxa.put(arrayOfByte, j * k, j * k / 2);
          locala.hxa.position(0);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.MMSightCameraGLRenderer", "setDrawFrame error: %s", new Object[] { localException.getMessage() });
        }
      }
      ((MMSightCameraGLSurfaceView)localObject).requestRender();
      localObject = arrayOfByte;
      if (this.hxJ != null)
      {
        if ((this.hxB.getOrientation() == 0) || (this.hxB.getOrientation() == 180))
        {
          this.hxB.getPreviewWidth();
          if ((this.hxB.getOrientation() != 0) && (this.hxB.getOrientation() != 180)) {
            break label1028;
          }
          this.hxB.getPreviewWidth();
        }
      }
      else
      {
        if ((this.hxA == null) || (this.hxA.aPw() == null)) {
          break label1061;
        }
        if ((!this.hxK) || (!this.hxT)) {
          break label1039;
        }
        bool = this.hxA.aPw().L((byte[])localObject);
        i = 1;
      }
      for (;;)
      {
        if ((i != 0) && ((this.hxA == null) || (this.hxA.aPx() != d.c.nae))) {
          com.tencent.mm.plugin.mmsight.model.a.j.naP.x((byte[])localObject);
        }
        GMTrace.o(20185406767104L, 150393);
        return bool;
        arrayOfByte = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(this.hxO.x * this.hxO.y * 3 >> 1));
        break;
        i = (int)(k * this.hxD);
        if (i >= j) {
          break label1069;
        }
        if ((!this.hxK) && (this.hxV == null)) {
          this.hxV = new byte[i * k * 3 >> 1];
        }
        for (arrayOfByte = this.hxV;; arrayOfByte = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(this.hxO.x * this.hxO.y * 3 >> 1)))
        {
          bg.Pw();
          SightVideoJNI.cropCameraData(paramArrayOfByte, arrayOfByte, k, j, this.hxO.y);
          i = this.hxO.y;
          this.hxT = true;
          break;
        }
        label996:
        w.v("MicroMsg.MMSightCameraGLSurfaceView", "passing draw");
        localObject = arrayOfByte;
        break label653;
        localObject = paramArrayOfByte;
        break label653;
        this.hxB.getPreviewHeight();
        break label691;
        label1028:
        this.hxB.getPreviewHeight();
        break label722;
        label1039:
        bool = this.hxA.aPw().L(paramArrayOfByte);
        i = 0;
        continue;
        label1061:
        bool = true;
        i = 0;
      }
      label1069:
      i = j;
      arrayOfByte = paramArrayOfByte;
      break label171;
      label1077:
      i = k;
      arrayOfByte = paramArrayOfByte;
      break label166;
    }
  }
  
  public final void M(float paramFloat)
  {
    GMTrace.i(20181782888448L, 150366);
    w.i("MicroMsg.MMSightRecordViewImpl", "setDisplayRatio: %s", new Object[] { Float.valueOf(paramFloat) });
    this.hxD = paramFloat;
    GMTrace.o(20181782888448L, 150366);
  }
  
  public final String Rj()
  {
    GMTrace.i(20182453977088L, 150371);
    if ((this.hxA != null) && (this.hxI))
    {
      str = this.hxA.getFilePath();
      GMTrace.o(20182453977088L, 150371);
      return str;
    }
    String str = this.videoPath;
    GMTrace.o(20182453977088L, 150371);
    return str;
  }
  
  public final void Rk()
  {
    GMTrace.i(20182588194816L, 150372);
    Rl();
    GMTrace.o(20182588194816L, 150372);
  }
  
  public final void Rl()
  {
    GMTrace.i(20182722412544L, 150373);
    if (this.hxI)
    {
      w.i("MicroMsg.MMSightRecordViewImpl", "initRecorder, already init");
      GMTrace.o(20182722412544L, 150373);
      return;
    }
    if (this.hxA != null)
    {
      w.i("MicroMsg.MMSightRecordViewImpl", "startRecord, recorder not null, stop first");
      this.hxA.cancel();
      if (this.hxB != null) {
        this.hxB.b(this.hxA.aPw());
      }
      this.hxA = null;
    }
    if ((this.hxC > 0) && (this.hxE > 0) && (this.videoBitrate > 0) && (this.fps > 0) && (this.gBk > 0) && (this.audioSampleRate > 0) && (this.hxB != null) && (this.hxB.mYg != null))
    {
      VideoTransPara localVideoTransPara = new VideoTransPara();
      localVideoTransPara.width = this.hxC;
      localVideoTransPara.height = ((int)(this.hxC / this.hxD));
      localVideoTransPara.duration = this.hxE;
      localVideoTransPara.videoBitrate = this.videoBitrate;
      localVideoTransPara.fps = this.fps;
      localVideoTransPara.gBk = this.gBk;
      localVideoTransPara.audioSampleRate = this.audioSampleRate;
      localVideoTransPara.gBm = 2;
      localVideoTransPara.gBn = 1;
      localVideoTransPara.gBl = 1;
      com.tencent.mm.plugin.mmsight.model.j.mZc.mWP = localVideoTransPara;
      com.tencent.mm.plugin.mmsight.model.j.mZc.videoBitrate = this.videoBitrate;
      com.tencent.mm.plugin.mmsight.model.j.mZc.mXB = this.hxC;
      k.aPI();
      this.hxA = k.c(localVideoTransPara);
      if (this.hxA == null)
      {
        w.e("MicroMsg.MMSightRecordViewImpl", "can not get media recorder!");
        if (this.hxS != null) {
          this.hxS.WG();
        }
        GMTrace.o(20182722412544L, 150373);
        return;
      }
      this.hxA.setFilePath(this.videoPath);
      if ((this.hxK) && (this.hxB != null) && (this.hxB.mXX)) {
        Ro();
      }
      int k = this.hxB.mYg.x;
      int m = this.hxB.mYg.y;
      int i = m;
      int j = k;
      if (this.hxO != null)
      {
        i = m;
        j = k;
        if (this.hxK)
        {
          j = this.hxO.x;
          i = this.hxO.y;
        }
      }
      j = (int)(j * this.hxU);
      i = (int)(i * this.hxU);
      j = com.tencent.mm.plugin.mmsight.d.qF(j);
      i = com.tencent.mm.plugin.mmsight.d.qF(i);
      w.i("MicroMsg.MMSightRecordViewImpl", "initRecorder, videoWidth: %s, videoHeight: %s, videoSizeRatio: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Float.valueOf(this.hxU) });
      if ((this.hxO != null) && (this.hxK)) {
        this.hxA.k(this.hxO.y, this.hxO.x, j, i);
      }
      for (;;)
      {
        this.hxA.aPE();
        this.hxA.a(this);
        if (this.hxA.qJ(this.hxB.getOrientation())) {
          break;
        }
        w.e("MicroMsg.MMSightRecordViewImpl", "init recorder error");
        if (this.hxS != null) {
          this.hxS.WG();
        }
        GMTrace.o(20182722412544L, 150373);
        return;
        this.hxA.k(this.hxB.getPreviewWidth(), this.hxB.getPreviewHeight(), j, i);
      }
      this.hxI = true;
    }
    GMTrace.o(20182722412544L, 150373);
  }
  
  public final Point Rm()
  {
    GMTrace.i(20183527718912L, 150379);
    if ((this.hxB != null) && (this.hxB.mXX))
    {
      if (!this.hxL)
      {
        localPoint = new Point(this.hxB.getPreviewWidth(), this.hxB.getPreviewHeight());
        GMTrace.o(20183527718912L, 150379);
        return localPoint;
      }
      Rp();
      Point localPoint = this.hxN;
      GMTrace.o(20183527718912L, 150379);
      return localPoint;
    }
    GMTrace.o(20183527718912L, 150379);
    return null;
  }
  
  public final Point Rn()
  {
    GMTrace.i(20183661936640L, 150380);
    if ((this.hxB != null) && (this.hxB.mXX))
    {
      int k = this.hxB.mYg.x;
      int m = this.hxB.mYg.y;
      int i = m;
      int j = k;
      if (this.hxO != null)
      {
        i = m;
        j = k;
        if (this.hxK)
        {
          j = this.hxO.x;
          i = this.hxO.y;
        }
      }
      j = (int)(j * this.hxU);
      i = (int)(i * this.hxU);
      Point localPoint = new Point(com.tencent.mm.plugin.mmsight.d.qF(j), com.tencent.mm.plugin.mmsight.d.qF(i));
      GMTrace.o(20183661936640L, 150380);
      return localPoint;
    }
    GMTrace.o(20183661936640L, 150380);
    return null;
  }
  
  public final void Rp()
  {
    GMTrace.i(20184467243008L, 150386);
    if ((this.hxB != null) && (this.hxB.mXX))
    {
      if (this.hxB.mYz)
      {
        int i = (int)(this.hxB.getPreviewWidth() / this.hxD);
        this.hxN = new Point(this.hxB.getPreviewWidth(), i);
        GMTrace.o(20184467243008L, 150386);
        return;
      }
      this.hxN = new Point((int)(this.hxB.getPreviewHeight() * this.hxD), this.hxB.getPreviewHeight());
    }
    GMTrace.o(20184467243008L, 150386);
  }
  
  public final void Rq()
  {
    GMTrace.i(20184735678464L, 150388);
    w.i("MicroMsg.MMSightRecordViewImpl", "setFlashModeImpl, mode: %s", new Object[] { Integer.valueOf(this.hxM) });
    switch (this.hxM)
    {
    }
    for (;;)
    {
      GMTrace.o(20184735678464L, 150388);
      return;
      this.hxB.aPa();
      GMTrace.o(20184735678464L, 150388);
      return;
      this.hxB.aPb();
      GMTrace.o(20184735678464L, 150388);
      return;
      e locale = this.hxB;
      w.i("MicroMsg.MMSightCamera", "autoFlash, camera: %s, isPreviewing: %s", new Object[] { locale.fPj, Boolean.valueOf(locale.mXX) });
      if ((locale.fPj != null) && (locale.mXX)) {
        try
        {
          locale.mYm = true;
          Camera.Parameters localParameters = locale.fPj.getParameters();
          if ((bg.cc(localParameters.getSupportedFlashModes())) || (!localParameters.getSupportedFlashModes().contains("auto"))) {
            break;
          }
          localParameters.setFlashMode("auto");
          locale.fPj.setParameters(localParameters);
          w.i("MicroMsg.MMSightCamera", "auto flash");
          GMTrace.o(20184735678464L, 150388);
          return;
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.MMSightCamera", localException, "autoFlash error: %s", new Object[] { localException.getMessage() });
        }
      }
    }
    w.i("MicroMsg.MMSightCamera", "camera not support auto flash!!");
    GMTrace.o(20184735678464L, 150388);
  }
  
  public final int Rr()
  {
    GMTrace.i(20184869896192L, 150389);
    int i = this.hxM;
    GMTrace.o(20184869896192L, 150389);
    return i;
  }
  
  public final void Rs()
  {
    GMTrace.i(20185004113920L, 150390);
    w.i("MicroMsg.MMSightRecordViewImpl", "setHalfPreviewVideoSize");
    this.hxU = 0.5F;
    GMTrace.o(20185004113920L, 150390);
  }
  
  public final void Rt()
  {
    GMTrace.i(20185138331648L, 150391);
    w.i("MicroMsg.MMSightRecordViewImpl", "set34PreviewVideoSize");
    this.hxU = 0.75F;
    GMTrace.o(20185138331648L, 150391);
  }
  
  public final Bitmap Ru()
  {
    GMTrace.i(20850187173888L, 155346);
    Object localObject2;
    Object localObject1;
    int j;
    int i;
    int k;
    if ((this.hxB != null) && (this.hxB.mXX))
    {
      localObject2 = this.hxB;
      if (((e)localObject2).mYx != null)
      {
        ((e)localObject2).mYy = true;
        localObject1 = new byte[((e)localObject2).mYx.length];
        System.arraycopy(((e)localObject2).mYx, 0, localObject1, 0, ((e)localObject2).mYx.length);
        ((e)localObject2).mYy = false;
        if (localObject1 == null) {
          break label457;
        }
        j = this.hxB.getPreviewWidth();
        i = this.hxB.getPreviewHeight();
        if (!this.hxB.mYz) {
          break label341;
        }
        k = (int)(this.hxB.getPreviewWidth() / this.hxD);
        if (k >= i) {
          break label471;
        }
        if ((this.hxK) || (this.hxV != null)) {
          break label308;
        }
        this.hxV = new byte[j * k * 3 >> 1];
        localObject2 = this.hxV;
        label164:
        SightVideoJNI.cropCameraDataLongEdge((byte[])localObject1, (byte[])localObject2, i, this.hxO.x, j);
        i = k;
        if (this.hxK) {
          i = this.hxO.x;
        }
        this.hxT = true;
      }
    }
    for (;;)
    {
      localObject1 = localObject2;
      for (;;)
      {
        localObject1 = new YuvImage((byte[])localObject1, 17, i, j, null);
        localObject2 = new ByteArrayOutputStream();
        ((YuvImage)localObject1).compressToJpeg(new Rect(0, 0, i, j), 100, (OutputStream)localObject2);
        localObject1 = ((ByteArrayOutputStream)localObject2).toByteArray();
        localObject1 = MMBitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length);
        localObject2 = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject1, this.hxB.getOrientation());
        ((Bitmap)localObject1).recycle();
        GMTrace.o(20850187173888L, 155346);
        return (Bitmap)localObject2;
        localObject1 = null;
        break;
        label308:
        localObject2 = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(this.hxO.x * this.hxO.y * 3 >> 1));
        break label164;
        label341:
        k = (int)(i * this.hxD);
        if (k < j)
        {
          if ((!this.hxK) && (this.hxV == null)) {
            this.hxV = new byte[k * i * 3 >> 1];
          }
          for (localObject2 = this.hxV;; localObject2 = com.tencent.mm.plugin.mmsight.model.a.j.naP.h(Integer.valueOf(this.hxO.x * this.hxO.y * 3 >> 1)))
          {
            SightVideoJNI.cropCameraData((byte[])localObject1, (byte[])localObject2, i, j, this.hxO.y);
            j = this.hxO.y;
            this.hxT = true;
            localObject1 = localObject2;
            break;
          }
          label457:
          GMTrace.o(20850187173888L, 155346);
          return null;
        }
      }
      label471:
      localObject2 = localObject1;
    }
  }
  
  public final void Rv()
  {
    GMTrace.i(20185540984832L, 150394);
    w.i("MicroMsg.MMSightRecordViewImpl", "onError: %s", new Object[] { Integer.valueOf(1) });
    this.hxA.reset();
    GMTrace.o(20185540984832L, 150394);
  }
  
  public final void Rw()
  {
    GMTrace.i(20185675202560L, 150395);
    if ((this.hxB != null) && (this.hxB.mXX) && (this.hxQ))
    {
      e locale = this.hxB;
      if ((locale.fPj != null) && (locale.mXX))
      {
        Camera.Parameters localParameters = locale.fPj.getParameters();
        List localList = localParameters.getSupportedFocusModes();
        if ((localList != null) && (localList.contains("auto")))
        {
          w.i("MicroMsg.MMSightCameraSetting", "support auto focus");
          localParameters.setFocusMode("auto");
          locale.fPj.setParameters(localParameters);
        }
        locale.fPj.cancelAutoFocus();
        locale.fPj.autoFocus(new e.3(locale));
      }
    }
    GMTrace.o(20185675202560L, 150395);
  }
  
  public final void Rx()
  {
    GMTrace.i(20185809420288L, 150396);
    if ((this.hxB != null) && (this.hxB.mXX) && (this.hxP)) {
      this.hxB.b(true, false, 1);
    }
    GMTrace.o(20185809420288L, 150396);
  }
  
  public final void Ry()
  {
    GMTrace.i(20185943638016L, 150397);
    if ((this.hxB != null) && (this.hxB.mXX) && (this.hxP)) {
      this.hxB.b(false, false, 1);
    }
    GMTrace.o(20185943638016L, 150397);
  }
  
  public final void a(MMSightRecordView.a parama)
  {
    GMTrace.i(20183796154368L, 150381);
    this.hxJ = parama;
    GMTrace.o(20183796154368L, 150381);
  }
  
  public final void a(MMSightRecordView.c paramc)
  {
    GMTrace.i(20181648670720L, 150365);
    this.hxS = paramc;
    GMTrace.o(20181648670720L, 150365);
  }
  
  public final void a(final MMSightRecordView.e parame, final boolean paramBoolean)
  {
    GMTrace.i(20183125065728L, 150376);
    if ((parame != null) && (this.hxB != null) && (this.hxB.mXX))
    {
      if (paramBoolean) {
        this.hxB.aPa();
      }
      if (paramBoolean)
      {
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20186883162112L, 150404);
            f.this.b(parame, paramBoolean);
            GMTrace.o(20186883162112L, 150404);
          }
        }, 100L);
        GMTrace.o(20183125065728L, 150376);
        return;
      }
      b(parame, paramBoolean);
    }
    GMTrace.o(20183125065728L, 150376);
  }
  
  public final void a(final MMSightRecordView.f paramf)
  {
    GMTrace.i(20182990848000L, 150375);
    if (this.hxA != null)
    {
      w.i("MicroMsg.MMSightRecordViewImpl", "stopRecord, stopCallback: %s", new Object[] { paramf });
      this.hxA.a(new d.a()
      {
        public final void Rv()
        {
          GMTrace.i(20180440711168L, 150356);
          if (paramf != null) {
            paramf.ce(true);
          }
          GMTrace.o(20180440711168L, 150356);
        }
      });
      this.hxA.x(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20189030645760L, 150420);
          f.this.hxI = false;
          if (paramf != null) {
            paramf.ce(false);
          }
          GMTrace.o(20189030645760L, 150420);
        }
      });
      this.hxA = null;
    }
    GMTrace.o(20182990848000L, 150375);
  }
  
  public final void b(Context paramContext, ViewGroup paramViewGroup)
  {
    GMTrace.i(20181514452992L, 150364);
    this.context = paramContext;
    this.hxG = new ObservableTextureView(paramContext);
    this.hxH = new MMSightCameraGLSurfaceView(paramContext);
    int i = com.tencent.mm.br.a.fromDPToPix(paramContext, 1);
    Object localObject = new FrameLayout.LayoutParams(i, i);
    paramViewGroup.addView(this.hxG, (ViewGroup.LayoutParams)localObject);
    localObject = new ViewGroup.MarginLayoutParams(-1, -1);
    paramViewGroup.addView(this.hxH, (ViewGroup.LayoutParams)localObject);
    this.hxR = new g();
    this.hxR.hyd = this;
    this.hxH.setOnTouchListener(this.hxR);
    com.tencent.mm.plugin.mmsight.model.j.aPc();
    w.i("MicroMsg.MMSightRecordViewImpl", "init view, context: %s", new Object[] { paramContext });
    GMTrace.o(20181514452992L, 150364);
  }
  
  public final void b(final MMSightRecordView.e parame, final boolean paramBoolean)
  {
    GMTrace.i(20183259283456L, 150377);
    this.hxB.a(new e.b()
    {
      public final void a(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(20187822686208L, 150411);
        if (paramBoolean) {
          f.this.hxB.aPb();
        }
        if ((paramAnonymousArrayOfByte == null) || (paramAnonymousInt1 < 0) || (paramAnonymousInt2 < 0) || (paramAnonymousInt3 < 0))
        {
          w.e("MicroMsg.MMSightRecordViewImpl", "onPictureYuvTaken, data is null!!");
          parame.WF();
          GMTrace.o(20187822686208L, 150411);
          return;
        }
        try
        {
          Object localObject;
          if (f.this.hxL)
          {
            f.this.Rp();
            if (f.this.hxB.mYz)
            {
              if (f.this.hxN.y >= paramAnonymousInt1) {
                break label432;
              }
              localObject = new byte[f.this.hxN.x * f.this.hxN.y * 3 >> 1];
              SightVideoJNI.cropCameraDataLongEdge(paramAnonymousArrayOfByte, (byte[])localObject, paramAnonymousInt1, f.this.hxN.y, paramAnonymousInt2);
              paramAnonymousInt1 = f.this.hxN.y;
              paramAnonymousInt2 = f.this.hxN.x;
              paramAnonymousArrayOfByte = (byte[])localObject;
            }
          }
          for (;;)
          {
            paramAnonymousArrayOfByte = new YuvImage(paramAnonymousArrayOfByte, 17, paramAnonymousInt1, paramAnonymousInt2, null);
            localObject = new ByteArrayOutputStream();
            paramAnonymousArrayOfByte.compressToJpeg(new Rect(0, 0, paramAnonymousInt1, paramAnonymousInt2), 100, (OutputStream)localObject);
            paramAnonymousArrayOfByte = ((ByteArrayOutputStream)localObject).toByteArray();
            paramAnonymousArrayOfByte = MMBitmapFactory.decodeByteArray(paramAnonymousArrayOfByte, 0, paramAnonymousArrayOfByte.length);
            paramAnonymousInt1 = paramAnonymousInt3;
            if (paramAnonymousInt4 == 180)
            {
              paramAnonymousInt2 = paramAnonymousInt3 + 180;
              paramAnonymousInt1 = paramAnonymousInt2;
              if (paramAnonymousInt2 > 360) {
                paramAnonymousInt1 = paramAnonymousInt2 - 360;
              }
            }
            localObject = com.tencent.mm.sdk.platformtools.d.b(paramAnonymousArrayOfByte, paramAnonymousInt1);
            paramAnonymousArrayOfByte.recycle();
            parame.r((Bitmap)localObject);
            GMTrace.o(20187822686208L, 150411);
            return;
            if (f.this.hxN.x < paramAnonymousInt2)
            {
              localObject = new byte[f.this.hxN.x * f.this.hxN.y * 3 >> 1];
              SightVideoJNI.cropCameraData(paramAnonymousArrayOfByte, (byte[])localObject, paramAnonymousInt1, paramAnonymousInt2, f.this.hxN.x);
              paramAnonymousInt1 = f.this.hxN.y;
              paramAnonymousInt2 = f.this.hxN.x;
              paramAnonymousArrayOfByte = (byte[])localObject;
            }
          }
        }
        catch (Exception paramAnonymousArrayOfByte)
        {
          w.printErrStackTrace("MicroMsg.MMSightRecordViewImpl", paramAnonymousArrayOfByte, "saveCaptureYuvDataToBitmap error: %s", new Object[] { paramAnonymousArrayOfByte.getMessage() });
          parame.WF();
          GMTrace.o(20187822686208L, 150411);
          return;
        }
      }
    }, false, 0);
    GMTrace.o(20183259283456L, 150377);
  }
  
  public final void bR(boolean paramBoolean)
  {
    GMTrace.i(20183393501184L, 150378);
    w.i("MicroMsg.MMSightRecordViewImpl", "setUseBackCamera: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hxF = paramBoolean;
    GMTrace.o(20183393501184L, 150378);
  }
  
  public final void bS(boolean paramBoolean)
  {
    GMTrace.i(20184064589824L, 150383);
    this.hxK = true;
    if ((this.hxK) && (this.hxB != null) && (this.hxB.mXX)) {
      Ro();
    }
    GMTrace.o(20184064589824L, 150383);
  }
  
  public final void bT(boolean paramBoolean)
  {
    GMTrace.i(20184333025280L, 150385);
    this.hxL = true;
    if ((this.hxL) && (this.hxB != null) && (this.hxB.mXX)) {
      Rp();
    }
    GMTrace.o(20184333025280L, 150385);
  }
  
  public final void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(20182185541632L, 150369);
    this.hxE = paramInt1;
    this.videoBitrate = 4800000;
    this.fps = 30;
    this.gBk = 64000;
    this.audioSampleRate = 44100;
    w.i("MicroMsg.MMSightRecordViewImpl", "setVideoPara, maxDuration: %s, videoBitrate: %s, fps: %s, audioBitrate: %s, audioSampleRate: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(4800000), Integer.valueOf(30), Integer.valueOf(64000), Integer.valueOf(44100) });
    GMTrace.o(20182185541632L, 150369);
  }
  
  public final void hU(int paramInt)
  {
    GMTrace.i(20181917106176L, 150367);
    w.i("MicroMsg.MMSightRecordViewImpl", "setPreviewSizeLimit: %s", new Object[] { Integer.valueOf(paramInt) });
    this.hxC = paramInt;
    GMTrace.o(20181917106176L, 150367);
  }
  
  public final void hV(int paramInt)
  {
    boolean bool = true;
    GMTrace.i(20184601460736L, 150387);
    this.hxM = paramInt;
    e locale = this.hxB;
    if ((this.hxB != null) && (this.hxB.mXX)) {}
    for (;;)
    {
      w.i("MicroMsg.MMSightRecordViewImpl", "setFlashMode: %s, camera: %s, previewing: %s", new Object[] { Integer.valueOf(paramInt), locale, Boolean.valueOf(bool) });
      if ((this.hxB != null) && (this.hxB.mXX)) {
        Rq();
      }
      GMTrace.o(20184601460736L, 150387);
      return;
      bool = false;
    }
  }
  
  public final void nH(String paramString)
  {
    GMTrace.i(20182319759360L, 150370);
    w.i("MicroMsg.MMSightRecordViewImpl", "setVideoFilePath: %s", new Object[] { paramString });
    this.videoPath = paramString;
    GMTrace.o(20182319759360L, 150370);
  }
  
  public final boolean qw()
  {
    GMTrace.i(20182856630272L, 150374);
    w.i("MicroMsg.MMSightRecordViewImpl", "startRecord, recorder: %s", new Object[] { this.hxA });
    Rl();
    if (this.hxA == null)
    {
      w.e("MicroMsg.MMSightRecordViewImpl", "startRecord error, recorder is null!");
      GMTrace.o(20182856630272L, 150374);
      return false;
    }
    int i = this.hxA.b(this.hxB.getOrientation(), false, 0);
    w.i("MicroMsg.MMSightRecordViewImpl", "startRecord now, ret: %s", new Object[] { Integer.valueOf(i) });
    if (i >= 0)
    {
      GMTrace.o(20182856630272L, 150374);
      return true;
    }
    GMTrace.o(20182856630272L, 150374);
    return false;
  }
  
  public final void release()
  {
    GMTrace.i(20185272549376L, 150392);
    w.i("MicroMsg.MMSightRecordViewImpl", "release, camera: %s, recorder: %s", new Object[] { this.hxB, this.hxA });
    if (this.hxB != null) {
      this.hxB.aOV();
    }
    if (this.hxA != null)
    {
      this.hxA.x(null);
      this.hxA = null;
    }
    this.hxI = false;
    this.hxK = false;
    this.hxL = false;
    this.hxN = null;
    this.hxO = null;
    this.hxM = -1;
    this.hxP = true;
    this.hxQ = true;
    com.tencent.mm.plugin.mmsight.model.a.j.naP.ye();
    GMTrace.o(20185272549376L, 150392);
  }
  
  public final void startPreview()
  {
    GMTrace.i(20182051323904L, 150368);
    w.i("MicroMsg.MMSightRecordViewImpl", "startPreview, displayRatio: %s, previewSizeLimit: %s", new Object[] { Float.valueOf(this.hxD), Integer.valueOf(this.hxC) });
    if ((this.hxD > 0.0F) && (this.hxC > 0))
    {
      VideoTransPara localVideoTransPara = new VideoTransPara();
      localVideoTransPara.width = this.hxC;
      localVideoTransPara.height = ((int)(this.hxC / this.hxD));
      w.i("MicroMsg.MMSightRecordViewImpl", "para width: %s, height: %s", new Object[] { Integer.valueOf(localVideoTransPara.width), Integer.valueOf(localVideoTransPara.height) });
      this.hxB = new e(localVideoTransPara, -1);
      this.hxB.a(this);
      if (!this.hxB.h(this.context, this.hxF))
      {
        w.i("MicroMsg.MMSightRecordViewImpl", "open camera failed!");
        if (this.hxS != null) {
          this.hxS.WG();
        }
        GMTrace.o(20182051323904L, 150368);
        return;
      }
      w.i("MicroMsg.MMSightRecordViewImpl", "open camera finish");
      if (this.hxG.isAvailable())
      {
        if (this.hxB.a(this.hxG.getSurfaceTexture(), this.hxC, this.hxD, this.hxK) < 0)
        {
          w.e("MicroMsg.MMSightRecordViewImpl", "start preview failed!");
          if (this.hxS != null) {
            this.hxS.WG();
          }
        }
        if (this.hxM != -1) {
          Rq();
        }
        this.hxB.aOW();
        w.i("MicroMsg.MMSightRecordViewImpl", "do start preview directly");
        Rl();
        GMTrace.o(20182051323904L, 150368);
        return;
      }
      this.hxG.a(new b()
      {
        public final void a(SurfaceTexture paramAnonymousSurfaceTexture)
        {
          GMTrace.i(20187151597568L, 150406);
          if (f.this.hxB.a(paramAnonymousSurfaceTexture, f.this.hxC, f.this.hxD, f.this.hxK) < 0)
          {
            w.e("MicroMsg.MMSightRecordViewImpl", "start preview failed!");
            if (f.this.hxS != null) {
              f.this.hxS.WG();
            }
          }
          if (f.this.hxM != -1) {
            f.this.Rq();
          }
          f.this.hxB.aOW();
          f.this.Rl();
          w.i("MicroMsg.MMSightRecordViewImpl", "do start preview after texture available");
          GMTrace.o(20187151597568L, 150406);
        }
      });
    }
    GMTrace.o(20182051323904L, 150368);
  }
  
  public final void switchCamera()
  {
    GMTrace.i(20183930372096L, 150382);
    if ((this.hxB != null) && (this.hxB.mXX) && ((this.hxA == null) || (this.hxA.aPx() != d.c.nae))) {
      this.hxB.a(this.context, this.hxG.getSurfaceTexture(), this.hxC, this.hxD, this.hxK);
    }
    GMTrace.o(20183930372096L, 150382);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\api\recordView\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */