package com.tencent.mm.plugin.multitalk.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkVideoView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.j.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class l
{
  public volatile Map<String, a> nnu;
  
  public l()
  {
    GMTrace.i(4754931449856L, 35427);
    this.nnu = Collections.synchronizedMap(new HashMap());
    GMTrace.o(4754931449856L, 35427);
  }
  
  public final boolean a(MultiTalkVideoView paramMultiTalkVideoView, boolean paramBoolean)
  {
    GMTrace.i(4755199885312L, 35429);
    if (paramMultiTalkVideoView == null)
    {
      w.e("MicroMsg.MT.MultiTalkViewManager", "drawAvatar view is null");
      GMTrace.o(4755199885312L, 35429);
      return false;
    }
    a locala;
    Bitmap localBitmap2;
    Bitmap localBitmap1;
    if (this.nnu.containsKey(paramMultiTalkVideoView.username))
    {
      locala = (a)this.nnu.get(paramMultiTalkVideoView.username);
      if (locala.nnv == null) {
        break label209;
      }
      if (paramBoolean)
      {
        localBitmap2 = a.b.bKI().b(paramMultiTalkVideoView.username, paramMultiTalkVideoView.getMeasuredWidth(), paramMultiTalkVideoView.getMeasuredHeight(), 1);
        localBitmap1 = localBitmap2;
        if (localBitmap2 != null)
        {
          localBitmap1 = localBitmap2;
          if (localBitmap2.getHeight() < localBitmap2.getWidth()) {
            localBitmap1 = Bitmap.createBitmap(localBitmap2, 0, 0, localBitmap2.getHeight(), localBitmap2.getHeight());
          }
        }
      }
    }
    for (locala.nnv = localBitmap1;; locala.nnv = localBitmap1)
    {
      if (locala.nnv == null) {
        break label286;
      }
      paramMultiTalkVideoView.a(locala.nnv, 0, 0);
      GMTrace.o(4755199885312L, 35429);
      return true;
      locala = new a();
      locala.username = paramMultiTalkVideoView.username;
      this.nnu.put(paramMultiTalkVideoView.username, locala);
      break;
      label209:
      localBitmap2 = a.b.bKI().b(paramMultiTalkVideoView.username, paramMultiTalkVideoView.getMeasuredWidth(), paramMultiTalkVideoView.getMeasuredHeight(), 1);
      localBitmap1 = localBitmap2;
      if (localBitmap2 != null)
      {
        localBitmap1 = localBitmap2;
        if (localBitmap2.getHeight() < localBitmap2.getWidth()) {
          localBitmap1 = Bitmap.createBitmap(localBitmap2, 0, 0, localBitmap2.getHeight(), localBitmap2.getHeight());
        }
      }
    }
    label286:
    if (locala.nnw == null) {
      locala.nnw = BitmapFactory.decodeResource(paramMultiTalkVideoView.getResources(), R.g.aYb);
    }
    paramMultiTalkVideoView.a(locala.nnw, 0, 0);
    GMTrace.o(4755199885312L, 35429);
    return true;
  }
  
  public final boolean a(MultiTalkVideoView paramMultiTalkVideoView, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool;
    for (;;)
    {
      try
      {
        GMTrace.i(4755065667584L, 35428);
        if (paramMultiTalkVideoView == null)
        {
          w.e("MicroMsg.MT.MultiTalkViewManager", "drawVideo view is null");
          bool = false;
          GMTrace.o(4755065667584L, 35428);
          return bool;
        }
        if (paramArrayOfInt == null)
        {
          w.e("MicroMsg.MT.MultiTalkViewManager", "renderVideoBitmap img is null");
          bool = false;
          GMTrace.o(4755065667584L, 35428);
          continue;
        }
        if (paramArrayOfInt.length >= paramInt1 * paramInt2) {
          break label119;
        }
      }
      finally {}
      w.e("MicroMsg.MT.MultiTalkViewManager", "img length error %d %d", new Object[] { Integer.valueOf(paramArrayOfInt.length), Integer.valueOf(paramInt1 * paramInt2) });
      bool = false;
      GMTrace.o(4755065667584L, 35428);
      continue;
      label119:
      if (paramInt1 == paramInt2) {
        break;
      }
      w.e("MicroMsg.MT.MultiTalkViewManager", "imgW != imgH");
      bool = false;
      GMTrace.o(4755065667584L, 35428);
    }
    a locala = (a)this.nnu.get(paramMultiTalkVideoView.username);
    if (locala == null)
    {
      locala = new a();
      this.nnu.put(paramMultiTalkVideoView.username, locala);
    }
    for (;;)
    {
      locala.nnf = paramInt3;
      locala.angle = paramInt4;
      if ((locala.nnx == null) || (locala.nnx.getWidth() != paramInt2)) {
        locala.nnx = Bitmap.createBitmap(paramInt2, paramInt2, Bitmap.Config.ARGB_8888);
      }
      locala.nnx.setPixels(paramArrayOfInt, 0, paramInt2, 0, 0, paramInt2, paramInt2);
      paramMultiTalkVideoView.a(locala.nnx, locala.angle, locala.nnf);
      bool = true;
      GMTrace.o(4755065667584L, 35428);
      break;
    }
  }
  
  public final void aRL()
  {
    GMTrace.i(4755334103040L, 35430);
    this.nnu.clear();
    GMTrace.o(4755334103040L, 35430);
  }
  
  private final class a
  {
    public int angle;
    public int nnf;
    Bitmap nnv;
    Bitmap nnw;
    public Bitmap nnx;
    String username;
    
    public a()
    {
      GMTrace.i(4740033282048L, 35316);
      GMTrace.o(4740033282048L, 35316);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */