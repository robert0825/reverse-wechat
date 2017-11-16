package com.tencent.mm.plugin.product.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.plugin.wxpay.a.b;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MallGalleryUI
  extends MallBaseUI
{
  private final String TAG;
  private ViewPager nJi;
  private g nJj;
  private List<String> nJk;
  private int nJl;
  private boolean nJm;
  
  public MallGalleryUI()
  {
    GMTrace.i(6037247623168L, 44981);
    this.TAG = "MicroMsg.MallGalleryUI";
    this.nJl = 0;
    GMTrace.o(6037247623168L, 44981);
  }
  
  protected final void MP()
  {
    GMTrace.i(6037784494080L, 44985);
    this.nJi = ((ViewPager)findViewById(a.f.sAP));
    this.nJi.yr = new ViewPager.e()
    {
      public final void V(int paramAnonymousInt)
      {
        GMTrace.i(6012819996672L, 44799);
        w.d("MicroMsg.MallGalleryUI", "Page Selected postion: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        MallGalleryUI.a(MallGalleryUI.this, paramAnonymousInt);
        if (MallGalleryUI.a(MallGalleryUI.this))
        {
          MallGalleryUI.this.vKB.bXF();
          MallGalleryUI.b(MallGalleryUI.this);
        }
        GMTrace.o(6012819996672L, 44799);
      }
      
      public final void W(int paramAnonymousInt)
      {
        GMTrace.i(6013088432128L, 44801);
        GMTrace.o(6013088432128L, 44801);
      }
      
      public final void a(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
      {
        try
        {
          GMTrace.i(6012954214400L, 44800);
          GMTrace.o(6012954214400L, 44800);
          return;
        }
        finally
        {
          localObject = finally;
          throw ((Throwable)localObject);
        }
      }
    };
    this.nJj = new g(this);
    this.nJj.nJJ = new g.a()
    {
      public final void aXu()
      {
        GMTrace.i(6029999865856L, 44927);
        MallGalleryUI.c(MallGalleryUI.this);
        GMTrace.o(6029999865856L, 44927);
      }
    };
    this.nJi.a(this.nJj);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6002753667072L, 44724);
        MallGalleryUI.this.finish();
        GMTrace.o(6002753667072L, 44724);
        return false;
      }
    });
    a(0, a.e.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6004901150720L, 44740);
        if (com.tencent.mm.bj.d.LL("favorite")) {}
        for (paramAnonymousMenuItem = MallGalleryUI.this.getResources().getStringArray(a.b.slL);; paramAnonymousMenuItem = MallGalleryUI.this.getResources().getStringArray(a.b.slM))
        {
          h.a(MallGalleryUI.this.vKB.vKW, null, paramAnonymousMenuItem, null, false, new h.c()
          {
            public final void hQ(int paramAnonymous2Int)
            {
              GMTrace.i(6001143054336L, 44712);
              switch (paramAnonymous2Int)
              {
              }
              for (;;)
              {
                GMTrace.o(6001143054336L, 44712);
                return;
                MallGalleryUI localMallGalleryUI = MallGalleryUI.this;
                Object localObject1 = new Intent();
                ((Intent)localObject1).putExtra("Retr_Msg_content", "");
                ((Intent)localObject1).putExtra("Retr_Msg_Type", 0);
                if (!bg.nm(localMallGalleryUI.aXt()))
                {
                  ((Intent)localObject1).putExtra("Retr_File_Name", localMallGalleryUI.aXt());
                  ((Intent)localObject1).putExtra("Retr_go_to_chattingUI", false);
                  ((Intent)localObject1).putExtra("Retr_show_success_tips", true);
                  com.tencent.mm.bj.d.a(localMallGalleryUI, ".ui.transmit.MsgRetransmitUI", (Intent)localObject1);
                  GMTrace.o(6001143054336L, 44712);
                  return;
                }
                w.e("MicroMsg.MallGalleryUI", "url is null or nil");
                GMTrace.o(6001143054336L, 44712);
                return;
                localMallGalleryUI = MallGalleryUI.this;
                localObject1 = localMallGalleryUI.aXt();
                if (!bg.nm((String)localObject1))
                {
                  w.d("MicroMsg.MallGalleryUI", "can save. img path: %s", new Object[] { localObject1 });
                  k.h((String)localObject1, localMallGalleryUI);
                  GMTrace.o(6001143054336L, 44712);
                  return;
                }
                w.w("MicroMsg.MallGalleryUI", "save error.");
                GMTrace.o(6001143054336L, 44712);
                return;
                localMallGalleryUI = MallGalleryUI.this;
                localObject1 = localMallGalleryUI.aXt();
                if (!bg.nm((String)localObject1))
                {
                  w.d("MicroMsg.MallGalleryUI", "file path valid");
                  cf localcf = new cf();
                  if (bg.nm((String)localObject1))
                  {
                    w.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
                    localcf.eDv.eDB = a.i.dtu;
                  }
                  for (;;)
                  {
                    localcf.eDv.eDC = 4;
                    localcf.eDv.activity = localMallGalleryUI;
                    com.tencent.mm.sdk.b.a.vgX.m(localcf);
                    GMTrace.o(6001143054336L, 44712);
                    return;
                    w.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple image), path %s sourceType %d", new Object[] { localObject1, Integer.valueOf(9) });
                    tt localtt = new tt();
                    tw localtw = new tw();
                    th localth = new th();
                    localth.zR(2);
                    localth.Qu((String)localObject1);
                    localth.Qt(com.tencent.mm.a.g.n((localth.toString() + 2 + System.currentTimeMillis()).getBytes()));
                    Object localObject2 = new ft();
                    ((ft)localObject2).eIo.type = 27;
                    ((ft)localObject2).eIo.eIq = localth;
                    com.tencent.mm.sdk.b.a.vgX.m((b)localObject2);
                    localObject2 = ((ft)localObject2).eIp.eIy;
                    com.tencent.mm.sdk.platformtools.d.b((String)localObject1, 150, 150, Bitmap.CompressFormat.JPEG, 90, (String)localObject2);
                    localth.Qv((String)localObject2);
                    localtw.QY(q.zE());
                    localtw.QZ(q.zE());
                    localtw.zZ(9);
                    localtw.eE(bg.Pv());
                    localtt.a(localtw);
                    localtt.ulB.add(localth);
                    localcf.eDv.title = localth.title;
                    localcf.eDv.eDx = localtt;
                    localcf.eDv.type = 2;
                  }
                }
                w.w("MicroMsg.MallGalleryUI", "file path invalid");
              }
            }
          });
          GMTrace.o(6004901150720L, 44740);
          return true;
        }
      }
    });
    GMTrace.o(6037784494080L, 44985);
  }
  
  final String aXt()
  {
    GMTrace.i(6037918711808L, 44986);
    if ((this.nJk == null) || (this.nJk.size() < this.nJl + 1)) {
      w.e("MicroMsg.MallGalleryUI", "data not ready.retransmit failed");
    }
    for (String str = null; bg.nm(str); str = (String)this.nJk.get(this.nJl))
    {
      w.w("MicroMsg.MallGalleryUI", "invoke error. No current url");
      GMTrace.o(6037918711808L, 44986);
      return null;
    }
    str = c.EH(str);
    GMTrace.o(6037918711808L, 44986);
    return str;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6037381840896L, 44982);
    int i = a.g.sNT;
    GMTrace.o(6037381840896L, 44982);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6037516058624L, 44983);
    super.onCreate(paramBundle);
    this.nJk = getIntent().getStringArrayListExtra("keys_img_urls");
    this.vKB.bXF();
    this.nJm = false;
    MP();
    GMTrace.o(6037516058624L, 44983);
  }
  
  protected void onResume()
  {
    GMTrace.i(6037650276352L, 44984);
    super.onResume();
    this.nJj.an(this.nJk);
    this.nJj.notifyDataSetChanged();
    if (this.nJk != null) {
      this.nJk.size();
    }
    GMTrace.o(6037650276352L, 44984);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\MallGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */