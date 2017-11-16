package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;

@a(7)
public final class GalleryEntryUI
  extends ActionBarActivity
{
  private boolean iBH;
  private int lDD;
  private int lDc;
  private boolean mInit;
  
  public GalleryEntryUI()
  {
    GMTrace.i(11945780445184L, 89003);
    this.mInit = false;
    this.iBH = false;
    GMTrace.o(11945780445184L, 89003);
  }
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11946451533824L, 89008);
    String str;
    if (paramIntent == null)
    {
      str = "";
      w.i("MicroMsg.GalleryEntryUI", "on activity result, requestCode %d resultCode %d, data:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
      this.iBH = true;
      switch (paramInt2)
      {
      }
    }
    for (;;)
    {
      if (this.iBH) {
        finish();
      }
      GMTrace.o(11946451533824L, 89008);
      return;
      str = paramIntent.toString();
      break;
      w.d("MicroMsg.GalleryEntryUI", "user choose canceld");
      setResult(0);
      continue;
      if (paramIntent == null)
      {
        GMTrace.o(11946451533824L, 89008);
        return;
      }
      setResult(-1, paramIntent);
      continue;
      setResult(1);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11945914662912L, 89004);
    w.i("MicroMsg.GalleryEntryUI", "on create");
    super.onCreate(paramBundle);
    w.i("MicroMsg.GalleryEntryUI", "checktask onCreate:%s#0x%x task:%s", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), bg.eG(this) });
    c.initialize();
    this.lDc = getIntent().getIntExtra("query_source_type", 3);
    this.lDD = getIntent().getIntExtra("query_media_type", 1);
    w.i("MicroMsg.GalleryEntryUI", "query souce: " + this.lDc + ", queryType: " + this.lDD);
    c.aCL().ok(this.lDD);
    c.aCL().ol(this.lDc);
    GMTrace.o(11945914662912L, 89004);
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(11946585751552L, 89009);
    super.onDestroy();
    w.i("MicroMsg.GalleryEntryUI", "onDestroy %B", new Object[] { Boolean.valueOf(this.iBH) });
    c.release(this.iBH);
    w.i("MicroMsg.GalleryEntryUI", "checktask onDestroy:%s#0x%x task:%s ", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), bg.eG(this) });
    GMTrace.o(11946585751552L, 89009);
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(11946317316096L, 89007);
    super.onNewIntent(paramIntent);
    w.d("MicroMsg.GalleryEntryUI", "on new intent, #0x%x", new Object[] { Integer.valueOf(hashCode()) });
    GMTrace.o(11946317316096L, 89007);
  }
  
  protected final void onRestoreInstanceState(Bundle paramBundle)
  {
    GMTrace.i(11946048880640L, 89005);
    w.d("MicroMsg.GalleryEntryUI", "onRestoreInstanceState");
    super.onRestoreInstanceState(paramBundle);
    this.mInit = true;
    GMTrace.o(11946048880640L, 89005);
  }
  
  protected final void onResume()
  {
    GMTrace.i(11946183098368L, 89006);
    w.i("MicroMsg.GalleryEntryUI", "on resume, init %B", new Object[] { Boolean.valueOf(this.mInit) });
    super.onResume();
    Object localObject;
    if (!this.mInit)
    {
      w.e("MicroMsg.GalleryEntryUI", "doRedirect %s", new Object[] { bg.bQW() });
      localObject = getIntent();
      if (!((Intent)localObject).getBooleanExtra("preview_image", false)) {
        break label241;
      }
      w.d("MicroMsg.GalleryEntryUI", "jump to preview ui directly");
      ArrayList localArrayList = ((Intent)localObject).getStringArrayListExtra("preview_image_list");
      Intent localIntent = new Intent(this, ImagePreviewUI.class);
      localIntent.addFlags(67108864);
      localIntent.putExtra("max_select_count", ((Intent)localObject).getIntExtra("max_select_count", 9));
      localIntent.putExtra("query_source_type", this.lDc);
      localIntent.putExtra("isPreviewPhoto", ((Intent)localObject).getBooleanExtra("isPreviewPhoto", false));
      localIntent.putExtra("preview_image", ((Intent)localObject).getBooleanExtra("preview_image", false));
      localObject = getIntent().getStringExtra("GalleryUI_FromUser");
      String str = getIntent().getStringExtra("GalleryUI_ToUser");
      if (!bg.nm((String)localObject)) {
        localIntent.putExtra("GalleryUI_FromUser", (String)localObject);
      }
      if (!bg.nm(str)) {
        localIntent.putExtra("GalleryUI_ToUser", str);
      }
      localIntent.putStringArrayListExtra("preview_image_list", localArrayList);
      startActivityForResult(localIntent, 1);
    }
    for (;;)
    {
      this.mInit = true;
      GMTrace.o(11946183098368L, 89006);
      return;
      label241:
      ((Intent)localObject).setClass(this, AlbumPreviewUI.class);
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).putExtra("send_btn_string", getIntent().getStringExtra("send_btn_string"));
      ((Intent)localObject).putExtra("max_select_count", getIntent().getIntExtra("max_select_count", 9));
      ((Intent)localObject).putExtra("GalleryUI_FromUser", getIntent().getStringExtra("GalleryUI_FromUser"));
      ((Intent)localObject).putExtra("GalleryUI_ToUser", getIntent().getStringExtra("GalleryUI_ToUser"));
      ((Intent)localObject).putExtra("key_send_raw_image", getIntent().getBooleanExtra("key_send_raw_image", false));
      startActivityForResult((Intent)localObject, 0);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\GalleryEntryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */