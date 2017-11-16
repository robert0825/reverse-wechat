package com.tencent.mm.plugin.facedetect.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  public FaceProNative kSQ;
  
  public g()
  {
    GMTrace.i(5867193761792L, 43714);
    this.kSQ = null;
    GMTrace.o(5867193761792L, 43714);
  }
  
  public final FaceProNative.FaceResult awp()
  {
    GMTrace.i(5867327979520L, 43715);
    if (this.kSQ == null)
    {
      w.e("MicroMsg.FaceDetectNativeManager", "hy: release out not init");
      GMTrace.o(5867327979520L, 43715);
      return null;
    }
    try
    {
      long l = bg.Pw();
      FaceProNative.FaceResult localFaceResult = this.kSQ.engineReleaseOut();
      w.i("MicroMsg.FaceDetectNativeManager", "hy: uninitialize result : %d, using: %d ms", new Object[] { Integer.valueOf(localFaceResult.result), Long.valueOf(bg.Pw() - l) });
      this.kSQ = null;
      GMTrace.o(5867327979520L, 43715);
      return localFaceResult;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace("MicroMsg.FaceDetectNativeManager", localThrowable, "hy: face lib release crash!!!", new Object[0]);
      this.kSQ.engineRelease();
      this.kSQ = null;
      GMTrace.o(5867327979520L, 43715);
    }
    return null;
  }
  
  public final int awq()
  {
    GMTrace.i(5867462197248L, 43716);
    if (this.kSQ == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.v("MicroMsg.FaceDetectNativeManager", "alvinluo cutDown sFaceProNative == null: %b", new Object[] { Boolean.valueOf(bool) });
      if (this.kSQ != null) {
        break;
      }
      w.e("MicroMsg.FaceDetectNativeManager", "hy: reelase not init");
      GMTrace.o(5867462197248L, 43716);
      return -101;
    }
    int i = this.kSQ.engineRelease();
    w.i("MicroMsg.FaceDetectNativeManager", "hy: cut down result: %d", new Object[] { Integer.valueOf(i) });
    this.kSQ = null;
    GMTrace.o(5867462197248L, 43716);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */