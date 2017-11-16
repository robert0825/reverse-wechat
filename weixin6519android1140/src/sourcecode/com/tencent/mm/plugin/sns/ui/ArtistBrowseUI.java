package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.aw.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public class ArtistBrowseUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private String mwK;
  private String pOr;
  
  public ArtistBrowseUI()
  {
    GMTrace.i(8398405894144L, 62573);
    this.mwK = "";
    this.pOr = "";
    GMTrace.o(8398405894144L, 62573);
  }
  
  protected final void MP()
  {
    GMTrace.i(8399211200512L, 62579);
    this.mwK = getIntent().getStringExtra("sns_gallery_artist_lan");
    int i = getIntent().getIntExtra("sns_gallery_position", 0);
    com.tencent.mm.aw.t.Kj();
    this.pOr = n.Kf();
    r(false, 2);
    this.pYe = new SnsInfoFlip(this);
    List localList = ai.dD(this.mwK, this.pOr);
    this.pYe.qbb = true;
    this.pYe.a(localList, "", i, this.pXZ, this);
    addView(this.pYe);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8707643539456L, 64877);
        ArtistBrowseUI.this.pYb.bnv();
        GMTrace.o(8707643539456L, 64877);
        return true;
      }
    });
    oM(i.j.pld);
    lg(false);
    this.pXZ.pSv = new s.a()
    {
      public final void bmF()
      {
        GMTrace.i(8550206144512L, 63704);
        Object localObject1 = ArtistBrowseUI.this.pYe.bnu();
        if (localObject1 == null)
        {
          GMTrace.o(8550206144512L, 63704);
          return;
        }
        w.d("MicroMsg.ArtistBrowseUI", "set bg the meida id " + ((anu)localObject1).mmR);
        Object localObject2 = b.ha(723);
        ((b)localObject2).lu(((anu)localObject1).lPM);
        ((b)localObject2).LR();
        if (!FileOp.aZ(am.dE(ae.getAccSnsPath(), ((anu)localObject1).mmR) + i.l((anu)localObject1)))
        {
          GMTrace.o(8550206144512L, 63704);
          return;
        }
        localObject2 = ae.biZ();
        Object localObject3;
        String str;
        if ((((av)localObject2).biJ() != null) && (!((av)localObject2).biJ().equals("")))
        {
          localObject3 = am.dE(ae.getAccSnsPath(), ((anu)localObject1).mmR) + i.l((anu)localObject1);
          str = am.dE(ae.getAccSnsPath(), ((av)localObject2).biJ());
          if (!FileOp.aZ((String)localObject3)) {
            break label441;
          }
          w.d("MicroMsg.UploadManager", "bg file is exist!'");
          FileOp.la(str);
          FileOp.deleteFile(str + ((av)localObject2).biJ() + "bg_");
          FileOp.deleteFile(str + ((av)localObject2).biJ() + "tbg_");
          FileOp.o((String)localObject3, str + ((av)localObject2).biJ() + "bg_");
        }
        for (;;)
        {
          localObject3 = ae.bjh();
          Object localObject4 = ((av)localObject2).biJ();
          str = ((anu)localObject1).mmR;
          localObject4 = ((l)localObject3).Iw((String)localObject4);
          ((k)localObject4).field_bgId = str;
          ((l)localObject3).c((k)localObject4);
          ((av)localObject2).bjM();
          localObject2 = new aw(7);
          ((anu)localObject1).uCU = 1;
          ((aw)localObject2).pwJ.uUc.ueW.add(localObject1);
          ((aw)localObject2).uB(2);
          ((aw)localObject2).commit();
          localObject1 = new Intent();
          ((Intent)localObject1).setClass(ArtistBrowseUI.this, SettingSnsBackgroundUI.class);
          ((Intent)localObject1).setFlags(536870912);
          ((Intent)localObject1).addFlags(67108864);
          ArtistBrowseUI.this.startActivity((Intent)localObject1);
          ArtistBrowseUI.this.finish();
          GMTrace.o(8550206144512L, 63704);
          return;
          label441:
          FileOp.deleteFile(str + ((av)localObject2).biJ() + "bg_");
          FileOp.deleteFile(str + ((av)localObject2).biJ() + "tbg_");
          w.e("MicroMsg.UploadManager", "bg file is not exist! wait to down it");
        }
      }
    };
    GMTrace.o(8399211200512L, 62579);
  }
  
  public final void bT(String paramString, int paramInt)
  {
    GMTrace.i(8399479635968L, 62581);
    if (this.pYe != null) {
      this.pYe.awY();
    }
    GMTrace.o(8399479635968L, 62581);
  }
  
  public final void bU(String paramString, int paramInt)
  {
    GMTrace.i(8399748071424L, 62583);
    GMTrace.o(8399748071424L, 62583);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8399076982784L, 62578);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.ArtistBrowseUI", "dispatchKeyEvent");
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("sns_cmd_list", this.pYb.pSQ);
      setResult(-1, paramKeyEvent);
      finish();
      GMTrace.o(8399076982784L, 62578);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8399076982784L, 62578);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8398942765056L, 62577);
    int i = i.g.pfH;
    GMTrace.o(8398942765056L, 62577);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8399613853696L, 62582);
    w.i("MicroMsg.ArtistBrowseUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(8399613853696L, 62582);
      return;
    }
    paramInt1 = paramIntent.getIntExtra("sns_gallery_op_id", 0);
    this.pYb.vd(paramInt1);
    GMTrace.o(8399613853696L, 62582);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8398540111872L, 62574);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(8398540111872L, 62574);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8398674329600L, 62575);
    if (this.pYe != null)
    {
      this.pYe.boW();
      this.pYe.onDestroy();
    }
    ae.bja().K(this);
    super.onDestroy();
    GMTrace.o(8398674329600L, 62575);
  }
  
  protected void onPause()
  {
    GMTrace.i(8399345418240L, 62580);
    if (this.pYe != null) {
      this.pYe.onPause();
    }
    super.onPause();
    GMTrace.o(8399345418240L, 62580);
  }
  
  public void onResume()
  {
    GMTrace.i(8398808547328L, 62576);
    super.onResume();
    if (this.pYe != null) {
      this.pYe.awY();
    }
    GMTrace.o(8398808547328L, 62576);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ArtistBrowseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */