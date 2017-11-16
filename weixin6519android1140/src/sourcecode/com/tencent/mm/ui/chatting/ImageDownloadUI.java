package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.j;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.y.at;

public class ImageDownloadUI
  extends MMActivity
  implements com.tencent.mm.ad.e, com.tencent.mm.ad.f
{
  private long eDr;
  private long eSf;
  private int gGV;
  private ProgressBar nXm;
  private TextView nXn;
  private TextView nXo;
  private TextView nXp;
  private TextView nXq;
  private d nXs;
  private j nXt;
  private String username;
  private ImageView wFq;
  
  public ImageDownloadUI()
  {
    GMTrace.i(2170300661760L, 16170);
    this.eDr = 0L;
    this.eSf = 0L;
    GMTrace.o(2170300661760L, 16170);
  }
  
  private void sW(int paramInt)
  {
    GMTrace.i(2171240185856L, 16177);
    this.nXm.setProgress(paramInt);
    this.nXn.setText(getString(R.l.dwS, new Object[] { Integer.valueOf(paramInt) }));
    if (paramInt < this.nXm.getMax())
    {
      GMTrace.o(2171240185856L, 16177);
      return;
    }
    Object localObject = com.tencent.mm.ao.n.IZ().b(Long.valueOf(this.nXt.gIm));
    String str = ((d)localObject).gGS;
    if (this.gGV == 1) {
      str = com.tencent.mm.ao.e.c((d)localObject);
    }
    str = com.tencent.mm.ao.n.IZ().l(str, null, null);
    if ((str == null) || (str.equals("")) || (!com.tencent.mm.a.e.aZ(str)))
    {
      w.d("ImageDownloadUI", "showImg : imgPath is null");
      GMTrace.o(2171240185856L, 16177);
      return;
    }
    localObject = new Intent(this, ImageGalleryUI.class);
    ((Intent)localObject).putExtra("key_message_id", this.eDr);
    ((Intent)localObject).putExtra("key_image_path", str);
    ((Intent)localObject).putExtra("key_compress_type", this.gGV);
    ((Intent)localObject).putExtra("key_favorite", true);
    ((Intent)localObject).putExtra("img_gallery_msg_id", this.eDr);
    ((Intent)localObject).putExtra("img_gallery_talker", this.username);
    finish();
    GMTrace.o(2171240185856L, 16177);
  }
  
  protected final void MP()
  {
    GMTrace.i(2170971750400L, 16175);
    this.nXn = ((TextView)findViewById(R.h.bGy));
    this.nXo = ((TextView)findViewById(R.h.ckh));
    this.nXp = ((TextView)findViewById(R.h.cki));
    this.nXq = ((TextView)findViewById(R.h.ckf));
    this.wFq = ((ImageView)findViewById(R.h.buM));
    this.wFq.setImageResource(R.k.cLY);
    this.nXn.setVisibility(0);
    this.nXo.setVisibility(8);
    this.nXp.setVisibility(8);
    this.nXq.setVisibility(8);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2259555450880L, 16835);
        at.wS().c(ImageDownloadUI.a(ImageDownloadUI.this));
        ImageDownloadUI.this.finish();
        GMTrace.o(2259555450880L, 16835);
        return true;
      }
    });
    this.nXm = ((ProgressBar)findViewById(R.h.ckg));
    GMTrace.o(2170971750400L, 16175);
  }
  
  public final void a(int paramInt1, int paramInt2, k paramk)
  {
    GMTrace.i(2171105968128L, 16176);
    w.d("ImageDownloadUI", "offset " + paramInt1 + "totaolLen  " + paramInt2);
    if (paramk.getType() == 109) {
      if (paramInt2 == 0) {
        break label82;
      }
    }
    label82:
    for (paramInt1 = paramInt1 * 100 / paramInt2 - 1;; paramInt1 = 0)
    {
      sW(Math.max(0, paramInt1));
      GMTrace.o(2171105968128L, 16176);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2171374403584L, 16178);
    if (paramk.getType() != 109)
    {
      GMTrace.o(2171374403584L, 16178);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      sW(this.nXm.getMax());
      GMTrace.o(2171374403584L, 16178);
      return;
    }
    w.e("ImageDownloadUI", "onSceneEnd : fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    Toast.makeText(this, R.l.dCV, 1).show();
    GMTrace.o(2171374403584L, 16178);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2170569097216L, 16172);
    int i = R.i.cHm;
    GMTrace.o(2170569097216L, 16172);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2170434879488L, 16171);
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
      w.e("ImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.eDr + ", or msgSvrId = " + this.eSf);
      GMTrace.o(2170434879488L, 16171);
      return;
    }
    if ((this.eDr <= 0L) && (this.eSf > 0L))
    {
      at.AR();
      this.eDr = com.tencent.mm.y.c.yM().B(this.username, this.eSf).field_msgId;
    }
    this.nXt = new j(this.nXs.gGR, this.eDr, this.gGV, this);
    at.wS().a(this.nXt, 0);
    GMTrace.o(2170434879488L, 16171);
  }
  
  protected void onPause()
  {
    GMTrace.i(2170703314944L, 16173);
    super.onPause();
    at.wS().b(109, this);
    GMTrace.o(2170703314944L, 16173);
  }
  
  protected void onResume()
  {
    GMTrace.i(2170837532672L, 16174);
    super.onResume();
    at.wS().a(109, this);
    GMTrace.o(2170837532672L, 16174);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\ImageDownloadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */