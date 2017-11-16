package com.tencent.mm.plugin.music.a;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.c.g;
import com.tencent.mm.ao.a.d.b;
import com.tencent.mm.at.c;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  public com.tencent.mm.a.f<String, Bitmap> fKi;
  public a npD;
  public g npE;
  public ae npF;
  
  public d()
  {
    GMTrace.i(4853849915392L, 36164);
    this.npE = new g()
    {
      public final void a(final String paramAnonymousString, final View paramAnonymousView, b paramAnonymousb)
      {
        GMTrace.i(4849152294912L, 36129);
        if (paramAnonymousb.bitmap != null) {}
        for (boolean bool = true;; bool = false)
        {
          w.i("MicroMsg.Music.MusicImageLoader", "onImageLoadFinish %s %b", new Object[] { paramAnonymousString, Boolean.valueOf(bool) });
          paramAnonymousString = (com.tencent.mm.at.a)paramAnonymousView.getTag();
          if ((paramAnonymousb.bitmap != null) && (paramAnonymousString != null))
          {
            d.this.a(paramAnonymousString, paramAnonymousb.bitmap);
            paramAnonymousView = c.o(paramAnonymousb.bitmap);
            if (!paramAnonymousString.e(paramAnonymousView)) {
              h.aSt().K(paramAnonymousString.field_musicId, paramAnonymousView[0], paramAnonymousView[1]);
            }
            if (d.this.npD != null) {
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(4843112497152L, 36084);
                  d.this.npD.a(paramAnonymousString, paramAnonymousView);
                  GMTrace.o(4843112497152L, 36084);
                }
              });
            }
          }
          GMTrace.o(4849152294912L, 36129);
          return;
        }
      }
      
      public final void ku(String paramAnonymousString)
      {
        GMTrace.i(4849018077184L, 36128);
        GMTrace.o(4849018077184L, 36128);
      }
    };
    this.npF = new ae(Looper.getMainLooper());
    this.fKi = new com.tencent.mm.a.f(5);
    GMTrace.o(4853849915392L, 36164);
  }
  
  public final void a(com.tencent.mm.at.a parama, Bitmap paramBitmap)
  {
    GMTrace.i(4853984133120L, 36165);
    w.i("MicroMsg.Music.MusicImageLoader", "putBitmapToCache %s", new Object[] { parama.field_musicId });
    this.fKi.put(parama.field_musicId, paramBitmap);
    GMTrace.o(4853984133120L, 36165);
  }
  
  public static abstract interface a
  {
    public abstract void a(com.tencent.mm.at.a parama, int[] paramArrayOfInt);
  }
  
  private final class b
    implements Runnable
  {
    com.tencent.mm.at.a eNq;
    
    public b(com.tencent.mm.at.a parama)
    {
      GMTrace.i(4845931069440L, 36105);
      this.eNq = parama;
      GMTrace.o(4845931069440L, 36105);
    }
    
    public final void run()
    {
      GMTrace.i(4846065287168L, 36106);
      Object localObject = new anu();
      ((anu)localObject).mmR = this.eNq.field_songMediaId;
      ((anu)localObject).uCO = this.eNq.field_songAlbumUrl;
      ((anu)localObject).uCP = this.eNq.field_songAlbumType;
      ((anu)localObject).lPM = ((anu)localObject).uCO;
      localObject = n.poO.b((anu)localObject);
      if (localObject != null)
      {
        localObject = com.tencent.mm.sdk.platformtools.d.c((Bitmap)localObject, 10);
        d.this.a(this.eNq, (Bitmap)localObject);
        localObject = c.o((Bitmap)localObject);
        if (!this.eNq.e((int[])localObject)) {
          this.eNq = h.aSt().K(this.eNq.field_musicId, localObject[0], localObject[1]);
        }
        if ((d.this.npD != null) && (this.eNq != null)) {
          d.this.npD.a(this.eNq, (int[])localObject);
        }
      }
      GMTrace.o(4846065287168L, 36106);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */