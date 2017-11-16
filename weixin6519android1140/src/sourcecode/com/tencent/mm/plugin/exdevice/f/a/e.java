package com.tencent.mm.plugin.exdevice.f.a;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class e
{
  public static void a(Context paramContext, final ImageView paramImageView, final String paramString, final int paramInt)
  {
    GMTrace.i(11183557967872L, 83324);
    if (paramImageView != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (!com.tencent.mm.sdk.platformtools.af.isMainThread()) {
        break;
      }
      b(paramImageView, paramString, paramInt);
      GMTrace.o(11183557967872L, 83324);
      return;
    }
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11186644975616L, 83347);
        e.b(paramImageView, paramString, paramInt);
        GMTrace.o(11186644975616L, 83347);
      }
    });
    GMTrace.o(11183557967872L, 83324);
  }
  
  public static boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent, String paramString)
  {
    GMTrace.i(11183960621056L, 83327);
    if ((paramInt1 == 1001) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
      if ((paramIntent != null) && (paramIntent.size() > 0))
      {
        paramIntent = (String)paramIntent.get(0);
        paramString = new Intent();
        paramString.putExtra("CropImageMode", 1);
        paramString.putExtra("CropImage_OutputPath", com.tencent.mm.compatible.util.e.fSh + "temp.cover");
        paramString.putExtra("CropImage_ImgPath", paramIntent);
        com.tencent.mm.bj.d.a(paramMMActivity, ".ui.tools.CropImageNewUI", paramString, 1002);
        GMTrace.o(11183960621056L, 83327);
        return true;
      }
    }
    else if ((paramInt1 == 1002) && (paramInt2 == -1))
    {
      paramMMActivity = d.wK(com.tencent.mm.compatible.util.e.fSh + "temp.cover");
      paramIntent = ad.aub();
      paramIntent.appName = paramString;
      long l = System.currentTimeMillis();
      paramIntent.kBG = com.tencent.mm.modelcdntran.d.a("uploadexdeivce", l, q.Ak().field_username, String.valueOf(l));
      paramString = paramIntent.kBG;
      i locali = new i();
      locali.gAB = paramIntent;
      locali.field_mediaId = paramString;
      locali.field_fullpath = paramMMActivity;
      locali.field_thumbpath = "";
      locali.field_fileType = b.gzm;
      locali.field_talker = "";
      locali.field_priority = b.gzc;
      locali.field_needStorage = true;
      locali.field_isStreamMedia = false;
      locali.field_appType = 200;
      locali.field_bzScene = 2;
      if (!g.Gk().c(locali)) {
        w.e("MicroMsg.ExdevicePictureUploader", "hy: cdntra addSendTask failed. clientid:%s", new Object[] { paramString });
      }
      GMTrace.o(11183960621056L, 83327);
      return true;
    }
    GMTrace.o(11183960621056L, 83327);
    return false;
  }
  
  public static void b(ImageView paramImageView, String paramString, int paramInt)
  {
    GMTrace.i(11183692185600L, 83325);
    if ((!bg.nm(paramString)) && (!"#".equals(paramString)))
    {
      w.d("MicroMsg.ExdeviceRankUtil", "hy: set url to %s", new Object[] { paramString });
      ad.atU().a(paramString, paramImageView, ad.wI(paramString));
      GMTrace.o(11183692185600L, 83325);
      return;
    }
    w.d("MicroMsg.ExdeviceRankUtil", "hy: url is null or nill. set to default picture resource");
    paramImageView.setImageResource(paramInt);
    GMTrace.o(11183692185600L, 83325);
  }
  
  public static void c(MMActivity paramMMActivity)
  {
    GMTrace.i(11183826403328L, 83326);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    localLinkedList1.add(paramMMActivity.getString(R.l.dqS));
    localLinkedList2.add(Integer.valueOf(0));
    h.a(paramMMActivity, "", localLinkedList1, localLinkedList2, null, true, new h.d()
    {
      public final void bT(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(11187718717440L, 83355);
        switch (paramAnonymousInt2)
        {
        }
        for (;;)
        {
          GMTrace.o(11187718717440L, 83355);
          return;
          MMActivity localMMActivity = this.kBL;
          Intent localIntent = new Intent();
          localIntent.putExtra("query_source_type", 9);
          localIntent.putExtra("query_media_type", 1);
          localIntent.putExtra("max_select_count", 1);
          com.tencent.mm.bj.d.b(localMMActivity, "gallery", ".ui.AlbumPreviewUI", localIntent, 1001);
        }
      }
    });
    GMTrace.o(11183826403328L, 83326);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */