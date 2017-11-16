package com.tencent.mm.plugin.record.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.a.mm.a;
import com.tencent.mm.plugin.record.a.m;
import com.tencent.mm.plugin.record.ui.RecordMsgImageUI;
import com.tencent.mm.plugin.record.ui.h.a;
import com.tencent.mm.plugin.record.ui.h.a.b;
import com.tencent.mm.plugin.record.ui.h.a.c;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.at;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Map;

public final class a
  implements h.b
{
  private ListView Ev;
  public l ihF;
  public Map<String, mm> lef;
  private com.tencent.mm.sdk.b.c leg;
  private View.OnClickListener lgu;
  public View.OnLongClickListener lit;
  public h.a ohW;
  public int oiz;
  
  public a(h.a parama, ListView paramListView)
  {
    GMTrace.i(7548405022720L, 56240);
    this.lef = new HashMap();
    this.lgu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7547465498624L, 56233);
        Object localObject = (com.tencent.mm.plugin.record.ui.a.b)paramAnonymousView.getTag();
        switch (((com.tencent.mm.plugin.record.ui.a.b)localObject).aGU)
        {
        }
        for (;;)
        {
          GMTrace.o(7547465498624L, 56233);
          return;
          Intent localIntent = new Intent(paramAnonymousView.getContext(), RecordMsgImageUI.class);
          localIntent.putExtra("message_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).eDr);
          localIntent.putExtra("record_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).eIc.lhq);
          localIntent.putExtra("record_xml", ((com.tencent.mm.plugin.record.ui.a.b)localObject).eRw);
          if (((paramAnonymousView.getContext() instanceof Activity)) && (((Activity)paramAnonymousView.getContext()).getIntent() != null))
          {
            localObject = ((Activity)paramAnonymousView.getContext()).getIntent().getBundleExtra("_stat_obj");
            if (localObject != null) {
              localIntent.putExtra("_stat_obj", (Bundle)localObject);
            }
          }
          paramAnonymousView.getContext().startActivity(localIntent);
          GMTrace.o(7547465498624L, 56233);
          return;
          localIntent = new Intent();
          localIntent.putExtra("key_detail_info_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).ohE.field_localId);
          localIntent.putExtra("key_detail_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).eIc.lhq);
          com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "favorite", ".ui.FavImgGalleryUI", localIntent);
        }
      }
    };
    this.lit = new View.OnLongClickListener()
    {
      public Context context;
      private com.tencent.mm.plugin.record.ui.a.b oiB;
      public com.tencent.mm.plugin.record.a.c oiC;
      public th oiD;
      public String path;
      
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(7546928627712L, 56229);
        if (paramAnonymousView != null)
        {
          this.context = paramAnonymousView.getContext();
          this.oiB = ((com.tencent.mm.plugin.record.ui.a.b)paramAnonymousView.getTag());
          this.oiC = this.oiB.ohE;
          this.oiD = this.oiB.eIc;
        }
        paramAnonymousView = new ft();
        paramAnonymousView.eIo.type = 2;
        paramAnonymousView.eIo.eIq = this.oiB.eIc;
        com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
        this.path = paramAnonymousView.eIp.path;
        if (!e.aZ(this.path))
        {
          w.w("MicroMsg.ImageViewWrapper", "file not exists");
          GMTrace.o(7546928627712L, 56229);
          return true;
        }
        if (a.this.ihF == null) {
          a.this.ihF = new l(this.context);
        }
        a.this.ihF.qik = new p.c()
        {
          public final void a(n paramAnonymous2n)
          {
            int j = 0;
            GMTrace.i(7545989103616L, 56222);
            if (a.2.this.oiD.ukB == 0)
            {
              Context localContext;
              if ((a.2.this.oiC.field_favProto.ukS & 0x1) != 0)
              {
                i = 1;
                if (i != 0) {
                  paramAnonymous2n.e(2, a.2.this.context.getString(R.l.duL));
                }
                i = j;
                if ((a.2.this.oiC.field_favProto.ukS & 0x2) != 0) {
                  i = 1;
                }
                if (i != 0) {
                  paramAnonymous2n.e(1, a.2.this.context.getString(R.l.dun));
                }
                paramAnonymous2n.e(3, a.2.this.context.getString(R.l.duG));
                mm localmm = (mm)a.this.lef.get(a.2.this.path);
                if (localmm == null) {
                  break label244;
                }
                if (bg.nm(localmm.eRt.result)) {
                  break label274;
                }
                localContext = a.2.this.context;
                if (!com.tencent.mm.plugin.scanner.a.an(localmm.eRt.eDg, localmm.eRt.result)) {
                  break label237;
                }
              }
              label237:
              for (int i = R.l.dQh;; i = R.l.dQg)
              {
                paramAnonymous2n.e(4, localContext.getString(i));
                GMTrace.o(7545989103616L, 56222);
                return;
                i = 0;
                break;
              }
              label244:
              paramAnonymous2n = new mk();
              paramAnonymous2n.eRq.filePath = a.2.this.path;
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2n);
            }
            label274:
            GMTrace.o(7545989103616L, 56222);
          }
        };
        a.this.ihF.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(7549881417728L, 56251);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(7549881417728L, 56251);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Ksnsupload_type", 0);
              paramAnonymous2MenuItem.putExtra("sns_kemdia_path", a.2.this.path);
              Object localObject = u.gy("fav_");
              u.Av().p((String)localObject, true).o("prePublishId", "fav_");
              paramAnonymous2MenuItem.putExtra("reportSessionId", (String)localObject);
              com.tencent.mm.bj.d.b(a.2.this.context, "sns", ".ui.En_c4f742e5", paramAnonymous2MenuItem);
              GMTrace.o(7549881417728L, 56251);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Retr_File_Name", a.2.this.path);
              paramAnonymous2MenuItem.putExtra("Retr_Compress_Type", 0);
              paramAnonymous2MenuItem.putExtra("Retr_Msg_Type", 0);
              com.tencent.mm.bj.d.a(a.2.this.context, ".ui.transmit.MsgRetransmitUI", paramAnonymous2MenuItem);
              GMTrace.o(7549881417728L, 56251);
              return;
              if (!com.tencent.mm.platformtools.d.a(a.2.this.path, a.2.this.context, R.l.dmf))
              {
                Toast.makeText(a.2.this.context, a.2.this.context.getString(R.l.duF), 1).show();
                GMTrace.o(7549881417728L, 56251);
                return;
                paramAnonymous2MenuItem = (mm)a.this.lef.get(a.2.this.path);
                if (paramAnonymous2MenuItem != null)
                {
                  localObject = new bz();
                  ((bz)localObject).eDf.activity = ((Activity)a.2.this.context);
                  ((bz)localObject).eDf.eBB = paramAnonymous2MenuItem.eRt.result;
                  ((bz)localObject).eDf.eDg = paramAnonymous2MenuItem.eRt.eDg;
                  ((bz)localObject).eDf.eDh = paramAnonymous2MenuItem.eRt.eDh;
                  com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
                }
              }
            }
          }
        };
        a.this.ihF.bpI();
        GMTrace.o(7546928627712L, 56229);
        return true;
      }
    };
    this.leg = new com.tencent.mm.sdk.b.c() {};
    this.ohW = parama;
    this.Ev = paramListView;
    com.tencent.mm.sdk.b.a.vgX.b(this.leg);
    GMTrace.o(7548405022720L, 56240);
  }
  
  public final void a(final View paramView, int paramInt, final com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    GMTrace.i(7548673458176L, 56242);
    paramView = (ImageView)paramView.findViewById(R.h.bXJ);
    paramView.setTag(paramb);
    paramView.setOnClickListener(this.lgu);
    if (paramb.aGU == 1) {
      paramView.setOnLongClickListener(this.lit);
    }
    h.a.b localb = new h.a.b();
    if (paramb.aGU == 0) {
      localb.ohY = paramb.eDr;
    }
    for (;;)
    {
      localb.eIc = paramb.eIc;
      localb.eIf = true;
      localb.maxWidth = this.oiz;
      Bitmap localBitmap = this.ohW.a(localb);
      if (localBitmap == null) {
        break;
      }
      w.d("MicroMsg.ImageViewWrapper", "get from dataId %s, cache %s", new Object[] { localb.eIc.lhq, localBitmap });
      a(paramView, localBitmap, R.k.cMo, paramb.eIc.lhq);
      GMTrace.o(7548673458176L, 56242);
      return;
      if (paramb.aGU == 1) {
        localb.ohY = paramb.ohE.field_localId;
      }
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7550686724096L, 56257);
        final Object localObject = (com.tencent.mm.plugin.record.ui.a.a)paramb;
        final int i;
        if (((com.tencent.mm.plugin.record.ui.a.a)localObject).aGU == 0)
        {
          if (!m.g(((com.tencent.mm.plugin.record.ui.a.a)localObject).eIc, ((com.tencent.mm.plugin.record.ui.a.a)localObject).eDr)) {
            break label243;
          }
          i = R.k.cOx;
          if (i != -1) {
            break label326;
          }
          i = R.k.cMo;
        }
        label243:
        label318:
        label321:
        label326:
        for (;;)
        {
          com.tencent.mm.plugin.record.ui.a.a locala = (com.tencent.mm.plugin.record.ui.a.a)paramb;
          h.a locala1 = a.this.ohW;
          int j = a.this.oiz;
          localObject = new h.a.b();
          ((h.a.b)localObject).eIc = locala.eIc;
          ((h.a.b)localObject).eIf = false;
          ((h.a.b)localObject).maxWidth = j;
          h.a.c localc = new h.a.c();
          localc.eIc = locala.eIc;
          Bitmap localBitmap;
          if (locala.aGU == 0)
          {
            if (m.g(locala.eIc, locala.eDr)) {
              break label321;
            }
            ((h.a.b)localObject).ohY = locala.eDr;
            localBitmap = locala1.a((h.a.b)localObject);
            localObject = localBitmap;
            if (localBitmap != null) {
              break label318;
            }
            localc.ohY = locala.eDr;
            localObject = locala1.a(localc);
          }
          for (;;)
          {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(7550149853184L, 56253);
                a.this.a(a.3.this.oiG, localObject, i, a.3.this.oiF.eIc.lhq);
                GMTrace.o(7550149853184L, 56253);
              }
            });
            GMTrace.o(7550686724096L, 56257);
            return;
            if ((((com.tencent.mm.plugin.record.ui.a.a)localObject).aGU == 1) && (bg.nm(((com.tencent.mm.plugin.record.ui.a.a)localObject).eIc.ujt)))
            {
              i = R.k.cOx;
              break;
            }
            i = -1;
            break;
            if (locala.aGU == 1)
            {
              ((h.a.b)localObject).ohY = locala.ohE.field_localId;
              ((h.a.b)localObject).eIg = false;
              localBitmap = locala1.a((h.a.b)localObject);
              localObject = localBitmap;
              if (localBitmap == null)
              {
                localc.ohY = locala.ohE.field_localId;
                localObject = locala1.a(localc);
              }
            }
            else
            {
              localObject = null;
            }
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(7550820941824L, 56258);
        String str = super.toString() + "|fillView";
        GMTrace.o(7550820941824L, 56258);
        return str;
      }
    });
    GMTrace.o(7548673458176L, 56242);
  }
  
  public final void a(ImageView paramImageView, Bitmap paramBitmap, int paramInt, String paramString)
  {
    GMTrace.i(7548807675904L, 56243);
    if (!((com.tencent.mm.plugin.record.ui.a.b)paramImageView.getTag()).eIc.lhq.equals(paramString))
    {
      w.d("MicroMsg.ImageViewWrapper", "scroll over to next img. old tag %s, now tag %s", new Object[] { paramString, paramImageView.getTag() });
      GMTrace.o(7548807675904L, 56243);
      return;
    }
    if (paramBitmap == null)
    {
      paramBitmap = paramImageView.getLayoutParams();
      paramBitmap.height = 200;
      paramBitmap.width = 280;
      paramImageView.setImageResource(paramInt);
      paramImageView.setBackgroundResource(R.e.aOj);
      GMTrace.o(7548807675904L, 56243);
      return;
    }
    w.d("MicroMsg.ImageViewWrapper", "update view bmp[%d, %d], iv[%d, %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(paramImageView.getWidth()), Integer.valueOf(paramImageView.getHeight()) });
    paramString = paramImageView.getLayoutParams();
    paramInt = paramBitmap.getWidth();
    int i = paramBitmap.getHeight();
    float f;
    if (i >= paramInt)
    {
      f = i / paramInt;
      if (f <= 2.5D) {
        break label466;
      }
      paramBitmap = Bitmap.createBitmap(paramBitmap, 0, (paramBitmap.getHeight() - (int)(paramBitmap.getWidth() * 2.5F)) / 2, paramBitmap.getWidth(), (int)(paramBitmap.getWidth() * 2.5F));
      f = 2.5F;
    }
    label466:
    for (;;)
    {
      if (f <= 2.0F)
      {
        paramInt = com.tencent.mm.br.a.W(paramImageView.getContext(), R.f.aPD);
        i = (int)(paramInt / f);
      }
      for (;;)
      {
        paramString.width = i;
        paramString.height = paramInt;
        paramImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        k.i(paramImageView, i, paramInt);
        if (paramImageView.getLayerType() == 1) {
          this.Ev.setLayerType(1, null);
        }
        paramImageView.setImageBitmap(paramBitmap);
        paramImageView.setBackgroundResource(0);
        GMTrace.o(7548807675904L, 56243);
        return;
        i = com.tencent.mm.br.a.W(paramImageView.getContext(), R.f.aPE);
        paramInt = (int)(i * f);
      }
      f = paramInt / i;
      if (f > 2.5D)
      {
        paramBitmap = Bitmap.createBitmap(paramBitmap, (paramBitmap.getWidth() - (int)(paramBitmap.getHeight() * 2.5F)) / 2, 0, (int)(paramBitmap.getHeight() * 2.5F), paramBitmap.getHeight());
        f = 2.5F;
      }
      for (;;)
      {
        if (f <= 2.0F)
        {
          i = com.tencent.mm.br.a.W(paramImageView.getContext(), R.f.aPD);
          paramInt = (int)(i / f);
          break;
        }
        paramInt = com.tencent.mm.br.a.W(paramImageView.getContext(), R.f.aPE);
        i = (int)(paramInt * f);
        break;
      }
    }
  }
  
  public final View cZ(Context paramContext)
  {
    GMTrace.i(7548539240448L, 56241);
    View localView = View.inflate(paramContext, R.i.cEA, null);
    this.oiz = com.tencent.mm.br.a.fromDPToPix(paramContext, 200);
    GMTrace.o(7548539240448L, 56241);
    return localView;
  }
  
  public final void destroy()
  {
    GMTrace.i(7548941893632L, 56244);
    com.tencent.mm.sdk.b.a.vgX.c(this.leg);
    GMTrace.o(7548941893632L, 56244);
  }
  
  public final void pause()
  {
    GMTrace.i(7549076111360L, 56245);
    GMTrace.o(7549076111360L, 56245);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */