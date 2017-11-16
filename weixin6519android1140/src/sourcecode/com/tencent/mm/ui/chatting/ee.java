package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.x.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.chatting.gallery.b;
import com.tencent.mm.y.at;

public final class ee
  extends com.tencent.mm.sdk.b.c<nt>
{
  public Activity activity;
  private a wGL;
  
  public ee(a parama, Activity paramActivity)
  {
    super(0);
    GMTrace.i(2291767705600L, 17075);
    this.wGL = null;
    this.activity = null;
    this.wGL = parama;
    this.activity = paramActivity;
    this.vhf = nt.class.getName().hashCode();
    GMTrace.o(2291767705600L, 17075);
  }
  
  private boolean a(nt paramnt)
  {
    GMTrace.i(2291901923328L, 17076);
    long l;
    String str;
    Object localObject;
    if ((this.wGL != null) && (paramnt != null) && ((paramnt instanceof nt)))
    {
      l = paramnt.eSJ.eDr;
      str = paramnt.eSJ.eSK;
      localObject = paramnt.eSJ.eSL;
      if ((localObject != null) && (((ce)localObject).field_msgId > 0L)) {
        break label586;
      }
    }
    label409:
    label586:
    for (paramnt = paramnt.eSJ.eSL;; paramnt = (nt)localObject)
    {
      if (paramnt == null)
      {
        w.e("MicroMsg.RevokeMsgListener", "in callback msgInfo null");
        GMTrace.o(2291901923328L, 17076);
        return false;
      }
      switch (paramnt.field_type)
      {
      }
      for (;;)
      {
        GMTrace.o(2291901923328L, 17076);
        return false;
        switch (3.wGN[this.wGL.ordinal()])
        {
        default: 
          break;
        case 1: 
          if ((paramnt != null) && (paramnt.field_msgId > 0L)) {
            localObject = com.tencent.mm.modelcdntran.d.a("downimg", paramnt.field_createTime, paramnt.field_talker, paramnt.field_msgId);
          }
          try
          {
            g.Gk().jz((String)localObject);
            w.i("MicroMsg.RevokeMsgListener", "[oneliang][revokeMsgImage] cancel result:%s", new Object[] { Boolean.valueOf(true) });
            at.wS().cancel(109);
            paramnt = com.tencent.mm.ui.chatting.gallery.d.bm(paramnt);
            com.tencent.mm.ao.n.Ja().f(paramnt.gGR, l);
            if ((this.activity == null) || (!(this.activity instanceof ImageGalleryUI))) {
              continue;
            }
            paramnt = (ImageGalleryUI)this.activity;
            w.i("MicroMsg.RevokeMsgListener", "[oneliang][revokeMsgImage] image gallery ui,msg id is:%s,downloadingImageMsgId: %s", new Object[] { Long.valueOf(l), Long.valueOf(paramnt.eDr) });
            if (l != paramnt.eDr) {
              continue;
            }
            com.tencent.mm.ui.base.h.a(this.activity, str, "", false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(2109231595520L, 15715);
                paramAnonymousDialogInterface.dismiss();
                ee.this.activity.finish();
                GMTrace.o(2109231595520L, 15715);
              }
            });
          }
          catch (Exception paramnt)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.RevokeMsgListener", paramnt, "[oneliang][revokeMsgImage] cancel failure:%s", new Object[] { paramnt.getMessage() });
            }
          }
          localObject = this.wGL;
          boolean bool;
          if (Looper.myLooper() == at.xB().ngv.getLooper())
          {
            bool = true;
            w.v("MicroMsg.RevokeMsgListener", "ashutest::revoke msg, type %s, isWorkerThread %B", new Object[] { localObject, Boolean.valueOf(bool) });
          }
          switch (3.wGN[this.wGL.ordinal()])
          {
          default: 
            break;
          case 2: 
            aN(paramnt);
            if ((this.activity instanceof ImageGalleryUI))
            {
              localObject = (ImageGalleryUI)this.activity;
              if ((((ImageGalleryUI)localObject).wKr != null) && (b.aY(paramnt)) && (paramnt.field_msgId == ((ImageGalleryUI)localObject).wKr.cfg().field_msgId)) {}
              for (int i = 1; i != 0; i = 0)
              {
                ((ImageGalleryUI)localObject).Dv(((ImageGalleryUI)localObject).cfB());
                com.tencent.mm.ui.base.h.a(this.activity, str, "", false, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                  {
                    GMTrace.i(2145336164352L, 15984);
                    paramAnonymousDialogInterface.dismiss();
                    ee.this.activity.finish();
                    GMTrace.o(2145336164352L, 15984);
                  }
                });
                break;
                bool = false;
                break label409;
              }
            }
            break;
          case 3: 
            aN(paramnt);
          }
          break;
        }
      }
    }
  }
  
  private static void aN(au paramau)
  {
    GMTrace.i(2292036141056L, 17077);
    paramau = t.mw(paramau.field_imgPath);
    if (paramau != null)
    {
      Object localObject = com.tencent.mm.modelcdntran.d.a("downvideo", paramau.hcs, paramau.Nq(), paramau.getFileName());
      try
      {
        g.Gk().jz((String)localObject);
        w.i("MicroMsg.RevokeMsgListener", "ashutest::[oneliang][revokeMsgVideo] cancel result:%s", new Object[] { Boolean.valueOf(true) });
        localObject = o.Nm();
        com.tencent.mm.kernel.h.wS().c(((x.a)localObject).hdf);
        ((x.a)localObject).qH();
        o.Nh().mi(paramau.getFileName());
        GMTrace.o(2292036141056L, 17077);
        return;
      }
      catch (Exception paramau)
      {
        w.printErrStackTrace("MicroMsg.RevokeMsgListener", paramau, "[oneliang][revokeMsgVideo] chatting item video,cancel failure:%s", new Object[] { paramau.getMessage() });
      }
    }
    GMTrace.o(2292036141056L, 17077);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(2269084909568L, 16906);
      wGO = new a("CHATTING_ITEM_VIDEO", 0);
      wGP = new a("IMAGE_GALLERY_UI", 1);
      wGQ = new a("VIDEO_GALLERY", 2);
      wGR = new a[] { wGO, wGP, wGQ };
      GMTrace.o(2269084909568L, 16906);
    }
    
    private a()
    {
      GMTrace.i(2268950691840L, 16905);
      GMTrace.o(2268950691840L, 16905);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */