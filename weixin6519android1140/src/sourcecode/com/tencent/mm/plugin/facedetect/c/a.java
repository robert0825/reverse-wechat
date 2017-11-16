package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.facedetect.b.u;
import com.tencent.mm.plugin.facedetect.b.v;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public abstract class a
{
  private int kRs;
  protected com.tencent.mm.plugin.facedetect.b.d kRt;
  protected com.tencent.mm.plugin.facedetect.b.c kRu;
  protected WeakReference<e> kSg;
  protected boolean kSh;
  int kSi;
  private com.tencent.mm.remoteservice.d kSj;
  protected com.tencent.mm.plugin.facedetect.b.a kSk;
  protected boolean kSl;
  private Context mContext;
  
  a(Context paramContext, e parame, int paramInt)
  {
    GMTrace.i(14546920013824L, 108383);
    this.kSh = false;
    this.kSi = -1;
    this.kSj = null;
    this.kSk = null;
    this.kRt = null;
    this.kRu = null;
    this.kSl = false;
    this.mContext = paramContext;
    this.kRs = paramInt;
    this.kSg = new WeakReference(parame);
    this.kSk = new com.tencent.mm.plugin.facedetect.b.a(paramInt);
    this.kSi = FaceDetectReporter.nq(paramInt);
    GMTrace.o(14546920013824L, 108383);
  }
  
  public abstract void O(int paramInt, String paramString);
  
  public final void a(com.tencent.mm.plugin.facedetect.b.c paramc)
  {
    GMTrace.i(5982755225600L, 44575);
    if (this.kSk != null)
    {
      this.kRu = paramc;
      this.kSk.kRu = this.kRu;
    }
    GMTrace.o(5982755225600L, 44575);
  }
  
  public final void a(com.tencent.mm.plugin.facedetect.b.d paramd)
  {
    GMTrace.i(5982889443328L, 44576);
    if (this.kSk != null)
    {
      this.kRt = paramd;
      this.kSk.kRt = paramd;
    }
    GMTrace.o(5982889443328L, 44576);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, a.b paramb)
  {
    GMTrace.i(5983828967424L, 44583);
    if ((this.kSg != null) && (this.kSg.get() != null)) {
      ((e)this.kSg.get()).a(paramBoolean1, paramBoolean2, paramb);
    }
    GMTrace.o(5983828967424L, 44583);
  }
  
  public final void avT()
  {
    GMTrace.i(5983023661056L, 44577);
    com.tencent.mm.plugin.facedetect.b.a locala;
    if (this.kSk != null)
    {
      locala = this.kSk;
      h.xw();
      locala.ezT = com.tencent.mm.kernel.a.wK();
      w.i("MicroMsg.FaceUploadProcessor", "alvinluo isLogin: %b", new Object[] { Boolean.valueOf(locala.ezT) });
      if (!locala.ezT) {
        break label157;
      }
      h.wS().a(732, locala);
      locala = this.kSk;
      locala.kRw = 0L;
      locala.kRx = 0;
      if (locala.kRy != null) {
        h.wS().c(locala.kRy);
      }
      if (com.tencent.mm.plugin.facedetect.model.e.awc()) {
        com.tencent.mm.plugin.facedetect.model.e.bZ(locala.kRw);
      }
      if (!locala.ezT) {
        break label170;
      }
    }
    label157:
    label170:
    for (locala.kRy = new u(locala.kRs);; locala.kRy = new v(locala.kRs))
    {
      h.wS().a(locala.kRy, 0);
      GMTrace.o(5983023661056L, 44577);
      return;
      h.wS().a(733, locala);
      break;
    }
  }
  
  public final void avU()
  {
    GMTrace.i(5983157878784L, 44578);
    if ((this.kSg != null) && (this.kSg.get() != null)) {
      ((e)this.kSg.get()).avU();
    }
    onStart();
    GMTrace.o(5983157878784L, 44578);
  }
  
  public final long avV()
  {
    GMTrace.i(5983426314240L, 44580);
    if (this.kSk != null)
    {
      long l = this.kSk.kRw;
      GMTrace.o(5983426314240L, 44580);
      return l;
    }
    GMTrace.o(5983426314240L, 44580);
    return -1L;
  }
  
  public final void avW()
  {
    GMTrace.i(5983560531968L, 44581);
    w.i("MicroMsg.FaceDetectBaseController", "alvinluo controller releaseFaceDetect");
    if ((this.kSg != null) && (this.kSg.get() != null)) {
      ((e)this.kSg.get()).avW();
    }
    this.kSg = null;
    Object localObject = bg.r(ab.getContext(), Process.myPid());
    String str = ab.getPackageName();
    w.i("MicroMsg.FaceDetectBaseController", "process name: %s", new Object[] { localObject });
    boolean bool;
    if (((String)localObject).equalsIgnoreCase(str)) {
      if (this.kSk != null)
      {
        localObject = this.kSk;
        if (((com.tencent.mm.plugin.facedetect.b.a)localObject).kRy != null) {
          break label213;
        }
        bool = true;
        w.v("MicroMsg.FaceUploadProcessor", "alvinluo uinit mCurrentNetScene == null: %b", new Object[] { Boolean.valueOf(bool) });
        ((com.tencent.mm.plugin.facedetect.b.a)localObject).kRv = true;
        if (((com.tencent.mm.plugin.facedetect.b.a)localObject).kRy != null)
        {
          w.i("MicroMsg.FaceUploadProcessor", "alvinluo hy: current scene: %s is not finished yet. cancel.", new Object[] { ((com.tencent.mm.plugin.facedetect.b.a)localObject).kRy.getClass().getSimpleName() });
          h.wS().c(((com.tencent.mm.plugin.facedetect.b.a)localObject).kRy);
        }
        if (!((com.tencent.mm.plugin.facedetect.b.a)localObject).ezT) {
          break label218;
        }
        h.wS().b(732, (com.tencent.mm.ad.e)localObject);
      }
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.facedetect.b.a)localObject).avO();
      this.kSk = null;
      onRelease();
      GMTrace.o(5983560531968L, 44581);
      return;
      label213:
      bool = false;
      break;
      label218:
      h.wS().b(733, (com.tencent.mm.ad.e)localObject);
    }
  }
  
  protected abstract k avX();
  
  public abstract Bundle avY();
  
  protected final void b(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    boolean bool = true;
    GMTrace.i(5983694749696L, 44582);
    if (this.kSg == null) {}
    for (;;)
    {
      w.i("MicroMsg.FaceDetectBaseController", "alvinluo finishWithResult mUIModel == null: %b", new Object[] { Boolean.valueOf(bool) });
      if ((this.kSg != null) && (this.kSg.get() != null)) {
        ((e)this.kSg.get()).b(paramInt1, paramInt2, paramString, paramBundle);
      }
      GMTrace.o(5983694749696L, 44582);
      return;
      bool = false;
    }
  }
  
  public final void c(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    GMTrace.i(5983963185152L, 44584);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (!d(paramInt1, paramInt2, paramString, paramBundle)))
    {
      w.i("MicroMsg.FaceDetectBaseController", "alvinluo onUploadSuccess");
      this.kSh = true;
      if (this.kSl)
      {
        paramString = avX();
        if (paramString == null)
        {
          w.e("MicroMsg.FaceDetectBaseController", "alvinluo verifyNetScene is null, stop verify");
          GMTrace.o(5983963185152L, 44584);
          return;
        }
        w.i("MicroMsg.FaceDetectBaseController", "alvinluo start verify, sceneType: %d", new Object[] { Integer.valueOf(paramString.getType()) });
        if (!this.kSh)
        {
          w.e("MicroMsg.FaceDetectBaseController", "isUploadDone: %b, upload not done, can't startVerify", new Object[] { Boolean.valueOf(this.kSh) });
          GMTrace.o(5983963185152L, 44584);
          return;
        }
        if (this.kSk != null)
        {
          paramBundle = this.kSk;
          if (paramString == null)
          {
            w.e("MicroMsg.FaceUploadProcessor", "alvinluo verifyNetScene is null");
            GMTrace.o(5983963185152L, 44584);
            return;
          }
          w.i("MicroMsg.FaceUploadProcessor", "uploader start verify, sceneType: %d", new Object[] { Integer.valueOf(paramString.getType()) });
          paramBundle.avO();
          paramBundle.kRz = paramString;
          paramBundle.kRx = 2;
          h.wS().a(paramString.getType(), paramBundle);
          h.wS().a(paramString, 0);
          paramBundle.kRA = System.currentTimeMillis();
        }
      }
    }
    GMTrace.o(5983963185152L, 44584);
  }
  
  public abstract boolean d(int paramInt1, int paramInt2, String paramString, Bundle paramBundle);
  
  public abstract void g(int paramInt1, int paramInt2, String paramString, k paramk);
  
  public abstract void h(int paramInt1, int paramInt2, String paramString);
  
  public abstract void i(int paramInt1, int paramInt2, String paramString);
  
  public abstract void onRelease();
  
  protected abstract void onStart();
  
  public final void xx(String paramString)
  {
    GMTrace.i(5983292096512L, 44579);
    if (this.kSk != null)
    {
      com.tencent.mm.plugin.facedetect.b.a locala = this.kSk;
      if (!locala.kRv)
      {
        locala.kRx = 1;
        if (bg.nm(paramString))
        {
          w.e("MicroMsg.FaceUploadProcessor", "hy: err face file null");
          locala.g(4, 90011, "face file null");
          GMTrace.o(5983292096512L, 44579);
          return;
        }
        if (!FileOp.aZ(paramString))
        {
          w.e("MicroMsg.FaceUploadProcessor", "hy: file not exist");
          locala.g(4, 90011, "get image failed");
          GMTrace.o(5983292096512L, 44579);
          return;
        }
        if (locala.kRw == 0L)
        {
          w.e("MicroMsg.FaceUploadProcessor", "hy: err not init");
          locala.g(4, 90014, "uploadId not init");
          GMTrace.o(5983292096512L, 44579);
          return;
        }
        w.i("MicroMsg.FaceUploadProcessor", "hy: start upload file : %s", new Object[] { paramString });
        if (!locala.kRv)
        {
          i locali = new i();
          locali.gAB = locala.kRC;
          locali.field_mediaId = com.tencent.mm.plugin.facedetect.model.n.xA(paramString);
          locali.field_fullpath = paramString;
          locali.field_thumbpath = "";
          locali.field_fileType = b.MediaType_FILE;
          locali.field_talker = "";
          locali.field_priority = b.gzd;
          locali.field_needStorage = false;
          locali.field_isStreamMedia = false;
          locali.field_appType = 0;
          locali.field_bzScene = 0;
          locali.field_largesvideo = false;
          if (!g.Gk().c(locali))
          {
            w.e("MicroMsg.FaceUploadProcessor", "hy: cdntra addSendTask failed. clientid:%s", new Object[] { locali.field_mediaId });
            locala.g(4, 90019, "add to cdn failed");
          }
        }
      }
    }
    GMTrace.o(5983292096512L, 44579);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */