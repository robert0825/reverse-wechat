package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.modelvideo.s.a.b;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class eh
  extends ah.a
{
  private static SparseArray<String> wHd;
  private static View.OnClickListener wHe;
  public static Map<String, WeakReference<eh>> wrZ;
  ImageView pIr;
  MMPinProgressBtn pWE;
  
  static
  {
    GMTrace.i(2231101292544L, 16623);
    wHd = new SparseArray();
    wrZ = new HashMap();
    wHe = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2491349467136L, 18562);
        eh.a locala = (eh.a)paramAnonymousView.getTag(R.h.image);
        if ((locala == null) || (locala.eRz == null))
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ShortVideoItemHolder", "click error");
          GMTrace.o(2491349467136L, 18562);
          return;
        }
        r localr = t.mw(locala.eRz.field_imgPath);
        if (localr == null)
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ShortVideoItemHolder", "click %s, msg id %d, but videoinfo is null", new Object[] { locala.eRz.field_imgPath, Long.valueOf(locala.eRz.field_msgId) });
          GMTrace.o(2491349467136L, 18562);
          return;
        }
        if (locala.wrP)
        {
          i = localr.status;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShortVideoItemHolder", "on Click, info recv status: %d", new Object[] { Integer.valueOf(i) });
          int j = (int)locala.eRz.field_msgId;
          if (i == 199)
          {
            if (locala.wHf.CO(j))
            {
              locala.wHf.wvd.wyW.onClick(paramAnonymousView);
              locala.oUt.clear();
              if (locala.wHf.wte.vc())
              {
                locala.qyY.setVisibility(0);
                locala.qyY.setImageResource(R.k.cOK);
                eh.a(paramAnonymousView.getContext(), locala.oUt, locala.eRz.field_imgPath);
                locala.oUt.hr(false);
                locala.wHf.CP(j);
                GMTrace.o(2491349467136L, 18562);
              }
            }
            else
            {
              locala.qyY.setVisibility(8);
              eh.a(locala.oUt.bgm(), locala.oUt, locala.eRz.field_imgPath);
              o.Nh();
              paramAnonymousView = s.mk(locala.eRz.field_imgPath);
              locala.oUt.hr(true);
              locala.oUt.ar(paramAnonymousView, false);
              locala.wHf.CP(j);
              a.a(a.a.wqk, locala.eRz);
            }
            GMTrace.o(2491349467136L, 18562);
            return;
          }
          if ((i != 112) && (i != 196)) {
            if (i == 113)
            {
              t.ms(localr.getFileName());
              locala.oUt.hr(true);
              if (!locala.wHf.CO(j))
              {
                locala.wHf.CP(j);
                GMTrace.o(2491349467136L, 18562);
              }
            }
            else if (i == 198)
            {
              t.mu(localr.getFileName());
              locala.oUt.hr(true);
              if (!locala.wHf.CO(j))
              {
                locala.wHf.CP(j);
                GMTrace.o(2491349467136L, 18562);
              }
            }
            else
            {
              t.ms(locala.eRz.field_imgPath);
              locala.oUt.hr(true);
              if (!locala.wHf.CO(j)) {
                locala.wHf.CP(j);
              }
            }
          }
          GMTrace.o(2491349467136L, 18562);
          return;
        }
        int i = localr.status;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShortVideoItemHolder", "info send status: %d", new Object[] { Integer.valueOf(i) });
        if ((i == 104) || (i == 103))
        {
          locala.wHf.wvd.wyW.onClick(paramAnonymousView);
          GMTrace.o(2491349467136L, 18562);
          return;
        }
        if (i == 105)
        {
          t.mr(localr.getFileName());
          GMTrace.o(2491349467136L, 18562);
          return;
        }
        if (i == 198)
        {
          t.mv(localr.getFileName());
          GMTrace.o(2491349467136L, 18562);
          return;
        }
        if (i == 106)
        {
          locala.wHf.wvd.wyW.onClick(paramAnonymousView);
          GMTrace.o(2491349467136L, 18562);
          return;
        }
        if (i != 196)
        {
          i = (int)locala.eRz.field_msgId;
          if (locala.wHf.CO(i))
          {
            locala.oUt.clear();
            locala.wHf.wvd.wyW.onClick(paramAnonymousView);
            if (locala.wHf.wte.vc())
            {
              locala.qyY.setVisibility(0);
              locala.qyY.setImageResource(R.k.cOK);
              eh.a(paramAnonymousView.getContext(), locala.oUt, locala.eRz.field_imgPath);
              locala.oUt.hr(false);
              locala.wHf.CP(i);
              GMTrace.o(2491349467136L, 18562);
            }
          }
          else
          {
            locala.qyY.setVisibility(8);
            eh.a(locala.oUt.bgm(), locala.oUt, locala.eRz.field_imgPath);
            o.Nh();
            paramAnonymousView = s.mk(locala.eRz.field_imgPath);
            locala.oUt.hr(true);
            locala.oUt.ar(paramAnonymousView, false);
            locala.wHf.CP(i);
            a.a(a.a.wqk, locala.eRz);
          }
        }
        GMTrace.o(2491349467136L, 18562);
      }
    };
    GMTrace.o(2231101292544L, 16623);
  }
  
  public static void a(Context paramContext, com.tencent.mm.plugin.sight.decode.a.a parama, String paramString)
  {
    GMTrace.i(16015530393600L, 119325);
    at.AR();
    if (!c.isSDCardAvailable())
    {
      parama.bgk();
      GMTrace.o(16015530393600L, 119325);
      return;
    }
    o.Nh();
    paramString = s.ml(paramString);
    paramContext = n.IZ().a(paramString, com.tencent.mm.br.a.getDensity(paramContext), paramContext, -1);
    parama.bgj();
    parama.D(paramContext);
    GMTrace.o(16015530393600L, 119325);
  }
  
  public static boolean b(s.a.a parama)
  {
    GMTrace.i(2230698639360L, 16620);
    if (parama.hcL != s.a.b.hcP)
    {
      GMTrace.o(2230698639360L, 16620);
      return false;
    }
    r localr = t.mw(parama.euR);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ShortVideoItemHolder", "update status, filename %s, videoInfo not found", new Object[] { parama.euR });
      GMTrace.o(2230698639360L, 16620);
      return false;
    }
    if ((localr.status != 112) && (localr.status != 104) && (localr.status != 103))
    {
      GMTrace.o(2230698639360L, 16620);
      return false;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2156610453504L, 16068);
        Object localObject = (WeakReference)eh.wrZ.get(this.wzN.getFileName());
        if (localObject == null)
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ShortVideoItemHolder", "update status, filename %s, holder not found", new Object[] { this.wzN.getFileName() });
          GMTrace.o(2156610453504L, 16068);
          return;
        }
        localObject = (eh)((WeakReference)localObject).get();
        if (localObject == null)
        {
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ShortVideoItemHolder", "update status, filename %s, holder gc!", new Object[] { this.wzN.getFileName() });
          GMTrace.o(2156610453504L, 16068);
          return;
        }
        ((eh)localObject).pWE.setVisibility(0);
        ((eh)localObject).pIr.setVisibility(8);
        if (this.wzN.status == 112)
        {
          ((eh)localObject).pWE.setProgress(t.f(this.wzN));
          GMTrace.o(2156610453504L, 16068);
          return;
        }
        ((eh)localObject).pWE.setProgress(t.g(this.wzN));
        GMTrace.o(2156610453504L, 16068);
      }
    });
    GMTrace.o(2230698639360L, 16620);
    return true;
  }
  
  private static final class a
  {
    au eRz;
    com.tencent.mm.plugin.sight.decode.a.a oUt;
    ImageView qyY;
    En_5b8fbb1e.a wHf;
    boolean wrP;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */