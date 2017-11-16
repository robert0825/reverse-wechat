package com.tencent.mm.plugin.gallery.model;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class e
{
  private ae ghS;
  HandlerThread lBu;
  HandlerThread lBv;
  HandlerThread lBw;
  ae lBx;
  ae lBy;
  ae lBz;
  
  public e()
  {
    GMTrace.i(11897864716288L, 88646);
    w.d("MicroMsg.GalleryHandlerThread", "galleryhandlerthread init");
    this.lBu = new HandlerThread("galleryDecodeHanlderThread", 10);
    this.lBx = null;
    this.lBu.start();
    this.lBv = new HandlerThread("galleryQueryHandlerThread", 1);
    this.lBy = null;
    this.lBv.start();
    this.lBw = new HandlerThread("galleryAfterTakePicThreadThread", 0);
    this.lBz = null;
    this.lBw.start();
    GMTrace.o(11897864716288L, 88646);
  }
  
  public final ae aCY()
  {
    GMTrace.i(11897998934016L, 88647);
    if ((this.lBx == null) && (this.lBu != null)) {
      this.lBx = new ae(this.lBu.getLooper());
    }
    ae localae = this.lBx;
    GMTrace.o(11897998934016L, 88647);
    return localae;
  }
  
  public final ae aCZ()
  {
    GMTrace.i(11898267369472L, 88649);
    if (this.lBy == null) {
      this.lBy = new ae(this.lBv.getLooper());
    }
    ae localae = this.lBy;
    GMTrace.o(11898267369472L, 88649);
    return localae;
  }
  
  public final ae aDa()
  {
    GMTrace.i(11898401587200L, 88650);
    if (this.ghS == null) {
      this.ghS = new ae(Looper.getMainLooper());
    }
    ae localae = this.ghS;
    GMTrace.o(11898401587200L, 88650);
    return localae;
  }
  
  public final void aDb()
  {
    GMTrace.i(11898670022656L, 88652);
    ae localae = aCY();
    if (localae == null)
    {
      w.e("MicroMsg.GalleryHandlerThread", "remove all work handler callbacks, but decode handler is null");
      GMTrace.o(11898670022656L, 88652);
      return;
    }
    localae.removeCallbacksAndMessages(null);
    GMTrace.o(11898670022656L, 88652);
  }
  
  public final void oj(int paramInt)
  {
    GMTrace.i(11898133151744L, 88648);
    try
    {
      Process.setThreadPriority(this.lBw.getThreadId(), paramInt);
      GMTrace.o(11898133151744L, 88648);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.GalleryHandlerThread", localException, "", new Object[0]);
      GMTrace.o(11898133151744L, 88648);
    }
  }
  
  public final void s(Runnable paramRunnable)
  {
    GMTrace.i(11898535804928L, 88651);
    ae localae = aCY();
    if (localae == null)
    {
      w.e("MicroMsg.GalleryHandlerThread", "post to decode worker, but decode handler is null");
      GMTrace.o(11898535804928L, 88651);
      return;
    }
    localae.post(paramRunnable);
    GMTrace.o(11898535804928L, 88651);
  }
  
  public final void t(Runnable paramRunnable)
  {
    GMTrace.i(11898804240384L, 88653);
    aDa().post(paramRunnable);
    GMTrace.o(11898804240384L, 88653);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */