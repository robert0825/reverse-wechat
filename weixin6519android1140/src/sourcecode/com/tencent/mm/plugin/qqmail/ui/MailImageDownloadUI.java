package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.j;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;

public class MailImageDownloadUI
  extends MMActivity
  implements com.tencent.mm.ad.e, com.tencent.mm.ad.f
{
  private long eDr;
  private long eSf;
  private int gGV;
  private ae handler;
  private ProgressBar nXm;
  private TextView nXn;
  private TextView nXo;
  private TextView nXp;
  private TextView nXq;
  private RelativeLayout nXr;
  private com.tencent.mm.ao.d nXs;
  private j nXt;
  private ImageView nXu;
  private LinearLayout nXv;
  private String username;
  
  public MailImageDownloadUI()
  {
    GMTrace.i(5543460601856L, 41302);
    this.handler = new ae(Looper.getMainLooper());
    this.eDr = 0L;
    this.eSf = 0L;
    GMTrace.o(5543460601856L, 41302);
  }
  
  private void sW(int paramInt)
  {
    GMTrace.i(5544265908224L, 41308);
    this.nXn.setText(getString(R.l.dwS, new Object[] { Integer.valueOf(paramInt) }));
    if (paramInt < this.nXm.getMax())
    {
      GMTrace.o(5544265908224L, 41308);
      return;
    }
    com.tencent.mm.ao.d locald = com.tencent.mm.ao.n.IZ().b(Long.valueOf(this.nXt.gIm));
    if (this.gGV == 1) {
      com.tencent.mm.ao.e.c(locald);
    }
    finish();
    startActivity(getIntent());
    GMTrace.o(5544265908224L, 41308);
  }
  
  protected final void MP()
  {
    GMTrace.i(5544131690496L, 41307);
    this.nXn = ((TextView)findViewById(R.h.bGy));
    this.nXo = ((TextView)findViewById(R.h.bGy));
    this.nXp = ((TextView)findViewById(R.h.bGz));
    this.nXq = ((TextView)findViewById(R.h.bGw));
    this.nXu = ((ImageView)findViewById(R.h.bLL));
    this.nXn.setVisibility(0);
    this.nXv = ((LinearLayout)findViewById(R.h.bGv));
    this.nXr = ((RelativeLayout)findViewById(R.h.bLM));
    this.nXo.setVisibility(8);
    this.nXp.setVisibility(8);
    this.nXq.setVisibility(8);
    AU(8);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5547889786880L, 41335);
        at.wS().c(MailImageDownloadUI.a(MailImageDownloadUI.this));
        MailImageDownloadUI.this.finish();
        GMTrace.o(5547889786880L, 41335);
        return true;
      }
    });
    this.nXm = ((ProgressBar)findViewById(R.h.bGx));
    GMTrace.o(5544131690496L, 41307);
  }
  
  public final void a(int paramInt1, int paramInt2, k paramk)
  {
    GMTrace.i(5544400125952L, 41309);
    w.d("MicroMsg.MailImageDownloadUI", "offset " + paramInt1 + "totaolLen  " + paramInt2);
    if (paramk.getType() == 109) {
      if (paramInt2 == 0) {
        break label78;
      }
    }
    label78:
    for (paramInt1 = paramInt1 * 100 / paramInt2 - 1;; paramInt1 = 0)
    {
      sW(Math.max(0, paramInt1));
      GMTrace.o(5544400125952L, 41309);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5544534343680L, 41310);
    if (paramk.getType() != 109)
    {
      GMTrace.o(5544534343680L, 41310);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      sW(this.nXm.getMax());
      GMTrace.o(5544534343680L, 41310);
      return;
    }
    w.e("MicroMsg.MailImageDownloadUI", "onSceneEnd : fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    Toast.makeText(this, R.l.dCV, 1).show();
    GMTrace.o(5544534343680L, 41310);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5543729037312L, 41304);
    int i = R.i.cBa;
    GMTrace.o(5543729037312L, 41304);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5543594819584L, 41303);
    super.onCreate(paramBundle);
    this.eDr = getIntent().getLongExtra("img_msg_id", 0L);
    this.eSf = getIntent().getLongExtra("img_server_id", 0L);
    this.gGV = getIntent().getIntExtra("img_download_compress_type", 0);
    this.username = getIntent().getStringExtra("img_download_username");
    MP();
    if (this.eDr > 0L) {
      this.nXs = com.tencent.mm.ao.n.IZ().aq(this.eDr);
    }
    if (((this.nXs == null) || (this.nXs.gGR <= 0L)) && (this.eSf > 0L)) {
      this.nXs = com.tencent.mm.ao.n.IZ().ap(this.eSf);
    }
    if ((this.nXs == null) || (this.nXs.gGR <= 0L))
    {
      w.e("MicroMsg.MailImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.eDr + ", or msgSvrId = " + this.eSf);
      GMTrace.o(5543594819584L, 41303);
      return;
    }
    if ((this.eDr <= 0L) && (this.eSf > 0L))
    {
      at.AR();
      this.eDr = com.tencent.mm.y.c.yM().B(this.username, this.eSf).field_msgId;
    }
    paramBundle = this.nXs.gGS;
    String str = com.tencent.mm.ao.n.IZ().l(paramBundle, null, null);
    if ((!bg.nm(paramBundle)) && (com.tencent.mm.a.e.aZ(str)))
    {
      w.i("MicroMsg.MailImageDownloadUI", "has big image, bigImgPath = %s, hasHDImg = %b, fullPath = %s", new Object[] { paramBundle, Boolean.valueOf(this.nXs.II()), str });
      if ((str == null) || (str.equals("")) || (!com.tencent.mm.a.e.aZ(str)))
      {
        w.d("MicroMsg.MailImageDownloadUI", "showImg : imgPath is null");
        GMTrace.o(5543594819584L, 41303);
        return;
      }
      this.nXv.setVisibility(8);
      this.nXm.setVisibility(8);
      this.nXu.setVisibility(0);
      paramBundle = com.tencent.mm.sdk.platformtools.d.RD(str);
      this.nXu.setImageBitmap(paramBundle);
      this.nXr.invalidate();
      GMTrace.o(5543594819584L, 41303);
      return;
    }
    this.nXt = new j(this.nXs.gGR, this.eDr, this.gGV, this);
    at.wS().a(this.nXt, 0);
    GMTrace.o(5543594819584L, 41303);
  }
  
  protected void onPause()
  {
    GMTrace.i(5543863255040L, 41305);
    super.onPause();
    at.wS().b(109, this);
    GMTrace.o(5543863255040L, 41305);
  }
  
  protected void onResume()
  {
    GMTrace.i(5543997472768L, 41306);
    super.onResume();
    at.wS().a(109, this);
    GMTrace.o(5543997472768L, 41306);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\MailImageDownloadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */