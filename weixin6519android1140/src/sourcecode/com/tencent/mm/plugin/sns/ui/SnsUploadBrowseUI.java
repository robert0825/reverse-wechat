package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.g.b;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SnsUploadBrowseUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private int pYg;
  private ArrayList<String> qiW;
  private HashMap<Integer, Boolean> qiX;
  
  public SnsUploadBrowseUI()
  {
    GMTrace.i(8463904145408L, 63061);
    this.qiW = new ArrayList();
    this.pYg = 0;
    this.qiX = new HashMap();
    GMTrace.o(8463904145408L, 63061);
  }
  
  protected final void MP()
  {
    GMTrace.i(8464977887232L, 63069);
    String str = bg.aq(getIntent().getStringExtra("sns_gallery_userName"), "");
    this.qiW = getIntent().getStringArrayListExtra("sns_gallery_temp_paths");
    if (this.qiW == null)
    {
      GMTrace.o(8464977887232L, 63069);
      return;
    }
    this.pYg = getIntent().getIntExtra("sns_gallery_position", 0);
    this.pYe = new SnsInfoFlip(this);
    this.pYe.qbc = false;
    this.pYe.qbb = true;
    ae.getAccSnsTmpPath();
    List localList = ai.bu(this.qiW);
    this.pYe.a(localList, str, this.pYg, this.pXZ, this);
    this.pYe.qbs = new SnsInfoFlip.c()
    {
      public final void vs(int paramAnonymousInt)
      {
        GMTrace.i(8712072724480L, 64910);
        SnsUploadBrowseUI.a(SnsUploadBrowseUI.this).put(Integer.valueOf(paramAnonymousInt), Boolean.valueOf(true));
        GMTrace.o(8712072724480L, 64910);
      }
    };
    addView(this.pYe);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8600135139328L, 64076);
        SnsUploadBrowseUI.this.bpJ();
        GMTrace.o(8600135139328L, 64076);
        return true;
      }
    });
    a(0, i.j.cSt, i.e.oXT, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8400821813248L, 62591);
        h.a(SnsUploadBrowseUI.this, i.j.pjq, i.j.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(8338007916544L, 62123);
            if (SnsUploadBrowseUI.this.pYe.boX() == 0) {
              SnsUploadBrowseUI.this.bpJ();
            }
            GMTrace.o(8338007916544L, 62123);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(8363240849408L, 62311);
            GMTrace.o(8363240849408L, 62311);
          }
        });
        GMTrace.o(8400821813248L, 62591);
        return true;
      }
    });
    GMTrace.o(8464977887232L, 63069);
  }
  
  protected final int Qf()
  {
    GMTrace.i(8465380540416L, 63072);
    GMTrace.o(8465380540416L, 63072);
    return 4;
  }
  
  public final void bT(String paramString, int paramInt)
  {
    GMTrace.i(8465112104960L, 63070);
    if (this.pYe != null) {
      this.pYe.awY();
    }
    GMTrace.o(8465112104960L, 63070);
  }
  
  public final void bU(String paramString, int paramInt)
  {
    GMTrace.i(8465514758144L, 63073);
    GMTrace.o(8465514758144L, 63073);
  }
  
  public final void bpJ()
  {
    GMTrace.i(8464709451776L, 63067);
    Intent localIntent = new Intent();
    Object localObject = this.pYe.gpU;
    if (localObject == null)
    {
      GMTrace.o(8464709451776L, 63067);
      return;
    }
    this.qiW.clear();
    Iterator localIterator = ((List)localObject).iterator();
    if (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      localObject = ae.getAccSnsTmpPath() + localb.eUs.mmR;
      if (!localb.eUs.mmR.startsWith("pre_temp_extend_pic")) {
        break label192;
      }
      localObject = localb.eUs.mmR.substring(19);
    }
    label192:
    for (;;)
    {
      this.qiW.add(localObject);
      break;
      localIntent.putExtra("sns_gallery_temp_paths", this.qiW);
      localIntent.putExtra("sns_update_preview_image_count", this.qiX.size());
      this.qiX.clear();
      setResult(-1, localIntent);
      finish();
      GMTrace.o(8464709451776L, 63067);
      return;
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8464843669504L, 63068);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsUploadBrowseUI", "dispatchKeyEvent");
      bpJ();
      GMTrace.o(8464843669504L, 63068);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8464843669504L, 63068);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8464575234048L, 63066);
    int i = i.g.pfx;
    GMTrace.o(8464575234048L, 63066);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8465246322688L, 63071);
    w.i("MicroMsg.SnsUploadBrowseUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(8465246322688L, 63071);
      return;
    }
    GMTrace.o(8465246322688L, 63071);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8464038363136L, 63062);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(8464038363136L, 63062);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8464172580864L, 63063);
    if (this.pYe != null)
    {
      this.pYe.boW();
      this.pYe.onDestroy();
    }
    ae.bja().K(this);
    super.onDestroy();
    GMTrace.o(8464172580864L, 63063);
  }
  
  protected void onPause()
  {
    GMTrace.i(8464441016320L, 63065);
    if (this.pYe != null) {
      this.pYe.onPause();
    }
    super.onPause();
    GMTrace.o(8464441016320L, 63065);
  }
  
  public void onResume()
  {
    GMTrace.i(8464306798592L, 63064);
    super.onResume();
    if (this.pYe != null) {
      this.pYe.awY();
    }
    GMTrace.o(8464306798592L, 63064);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsUploadBrowseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */