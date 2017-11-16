package com.tencent.mm.plugin.webview.ui.tools;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.compatible.i.a.a;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.mm.plugin.webview.model.ad;
import com.tencent.mm.plugin.webview.model.ai;
import com.tencent.mm.plugin.webview.modeltools.f;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class OpenFileChooserUI
  extends MMActivity
{
  private int count;
  private ProgressDialog htG;
  private String idK;
  private String idL;
  private int lDD;
  private int lDc;
  private int qkk;
  private boolean rIX;
  private int rIY;
  private int rIZ;
  private boolean rJa;
  private DialogInterface.OnCancelListener rJb;
  
  public OpenFileChooserUI()
  {
    GMTrace.i(12298907287552L, 91634);
    this.htG = null;
    this.rJa = false;
    this.rJb = null;
    GMTrace.o(12298907287552L, 91634);
  }
  
  private void LW(final String paramString)
  {
    GMTrace.i(12299846811648L, 91641);
    this.rJb = new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12128584990720L, 90365);
        OpenFileChooserUI.this.setResult(0);
        OpenFileChooserUI.this.finish();
        GMTrace.o(12128584990720L, 90365);
      }
    };
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.ekc), true, this.rJb);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12125095329792L, 90339);
        final Object localObject1 = new ArrayList();
        int i = OpenFileChooserUI.a(OpenFileChooserUI.this, paramString);
        if (i == -50002)
        {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12116639612928L, 90276);
              if ((OpenFileChooserUI.b(OpenFileChooserUI.this) == 7) && (OpenFileChooserUI.c(OpenFileChooserUI.this) == 2))
              {
                h.a(OpenFileChooserUI.this, OpenFileChooserUI.this.getString(R.l.ekd), OpenFileChooserUI.this.getString(R.l.cUG), OpenFileChooserUI.this.getString(R.l.cTo), false, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                  {
                    GMTrace.i(12131806216192L, 90389);
                    OpenFileChooserUI.this.setResult(1);
                    OpenFileChooserUI.this.finish();
                    GMTrace.o(12131806216192L, 90389);
                  }
                });
                GMTrace.o(12116639612928L, 90276);
                return;
              }
              Toast.makeText(OpenFileChooserUI.this, OpenFileChooserUI.this.getString(R.l.ego), 0).show();
              OpenFileChooserUI.this.setResult(1);
              OpenFileChooserUI.this.finish();
              GMTrace.o(12116639612928L, 90276);
            }
          });
          GMTrace.o(12125095329792L, 90339);
          return;
        }
        final Object localObject2;
        if (i == -50006)
        {
          localObject2 = OpenFileChooserUI.l(paramString, (List)localObject1);
          OpenFileChooserUI.b(OpenFileChooserUI.this, paramString);
          localObject1 = OpenFileChooserUI.d(OpenFileChooserUI.this);
        }
        while (!bg.nm((String)localObject2))
        {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12273271701504L, 91443);
              Intent localIntent = new Intent();
              localIntent.putExtra("key_pick_local_media_callback_type", 1);
              localIntent.putExtra("key_pick_local_media_local_id", localObject2);
              localIntent.putExtra("key_pick_local_media_thumb_local_id", localObject1);
              w.i("MicroMsg.OpenFileChooserUI", "thumbLocalId:%s", new Object[] { localObject1 });
              OpenFileChooserUI.this.setResult(-1, localIntent);
              OpenFileChooserUI.this.finish();
              GMTrace.o(12273271701504L, 91443);
            }
          });
          GMTrace.o(12125095329792L, 90339);
          return;
          if (i == 1)
          {
            String str1 = OpenFileChooserUI.c(OpenFileChooserUI.this, paramString);
            OpenFileChooserUI.b(OpenFileChooserUI.this, paramString);
            String str2 = OpenFileChooserUI.d(OpenFileChooserUI.this);
            localObject2 = str1;
            localObject1 = str2;
            if (bg.nm(str1))
            {
              localObject2 = str1;
              localObject1 = str2;
              if (OpenFileChooserUI.b(OpenFileChooserUI.this) == 7)
              {
                localObject2 = str1;
                localObject1 = str2;
                if (OpenFileChooserUI.c(OpenFileChooserUI.this) == 2)
                {
                  af.t(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(12326690357248L, 91841);
                      h.a(OpenFileChooserUI.this, OpenFileChooserUI.this.getString(R.l.eke), OpenFileChooserUI.this.getString(R.l.cUG), OpenFileChooserUI.this.getString(R.l.cTo), false, new DialogInterface.OnClickListener()
                      {
                        public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                        {
                          GMTrace.i(12133551046656L, 90402);
                          OpenFileChooserUI.this.setResult(1);
                          OpenFileChooserUI.this.finish();
                          GMTrace.o(12133551046656L, 90402);
                        }
                      });
                      GMTrace.o(12326690357248L, 91841);
                    }
                  });
                  GMTrace.o(12125095329792L, 90339);
                }
              }
            }
          }
          else
          {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(12272734830592L, 91439);
                OpenFileChooserUI.this.setResult(1);
                OpenFileChooserUI.this.finish();
                GMTrace.o(12272734830592L, 91439);
              }
            });
            GMTrace.o(12125095329792L, 90339);
            return;
          }
        }
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12325885050880L, 91835);
            OpenFileChooserUI.this.setResult(1);
            OpenFileChooserUI.this.finish();
            GMTrace.o(12325885050880L, 91835);
          }
        });
        GMTrace.o(12125095329792L, 90339);
      }
    });
    GMTrace.o(12299846811648L, 91641);
  }
  
  private String LX(String paramString)
  {
    GMTrace.i(12299981029376L, 91642);
    try
    {
      MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
      localMediaMetadataRetriever.setDataSource(paramString);
      if (localMediaMetadataRetriever == null)
      {
        GMTrace.o(12299981029376L, 91642);
        return null;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.OpenFileChooserUI", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", new Object[] { localException });
        localWebViewJSSDKVideoItem = null;
      }
      int i = bg.getInt(localWebViewJSSDKVideoItem.extractMetadata(18), 0);
      int j = bg.getInt(localWebViewJSSDKVideoItem.extractMetadata(19), 0);
      int k = bg.getInt(localWebViewJSSDKVideoItem.extractMetadata(9), 0);
      localWebViewJSSDKVideoItem.release();
      localWebViewJSSDKVideoItem.release();
      WebViewJSSDKVideoItem localWebViewJSSDKVideoItem = WebViewJSSDKFileItem.Lj(paramString);
      localWebViewJSSDKVideoItem.duration = ((k + 500) / 1000);
      localWebViewJSSDKVideoItem.width = i;
      localWebViewJSSDKVideoItem.height = j;
      localWebViewJSSDKVideoItem.size = com.tencent.mm.a.e.aY(paramString);
      if (this.rIZ == 1) {
        localWebViewJSSDKVideoItem.idL = this.idL;
      }
      f.bCW().b(localWebViewJSSDKVideoItem);
      paramString = localWebViewJSSDKVideoItem.eHy;
      GMTrace.o(12299981029376L, 91642);
    }
    return paramString;
  }
  
  private int LY(String paramString)
  {
    GMTrace.i(12300115247104L, 91643);
    Object localObject = new Intent();
    ((Intent)localObject).setData(Uri.parse("file://" + paramString));
    am.is2G(this);
    for (;;)
    {
      try
      {
        paramString = com.tencent.mm.compatible.i.a.i(this, (Intent)localObject);
        if (paramString == null)
        {
          w.e("MicroMsg.OpenFileChooserUI", "compressVideo filed.");
          GMTrace.o(12300115247104L, 91643);
          return -50005;
        }
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.OpenFileChooserUI", paramString, "", new Object[0]);
        paramString = null;
        continue;
        localObject = paramString.filename;
        boolean bool = c.np((String)localObject);
        w.i("MicroMsg.OpenFileChooserUI", "isMp4 = %b", new Object[] { Boolean.valueOf(bool) });
        i = 55536;
        if (bool)
        {
          i = SightVideoJNI.shouldRemuxing((String)localObject, 660, 500, 20971520, 300000.0D, 1000000);
          w.i("MicroMsg.OpenFileChooserUI", "check remuxing, ret %d", new Object[] { Integer.valueOf(i) });
        }
        if ((i == -1) || (!bool))
        {
          i = com.tencent.mm.a.e.aY((String)localObject);
          w.i("MicroMsg.OpenFileChooserUI", "fileLenght = %d", new Object[] { Integer.valueOf(i) });
          if (i > 20971520) {
            i = -1;
          }
        }
        else
        {
          switch (i)
          {
          default: 
            w.e("MicroMsg.OpenFileChooserUI", "unknown check type");
            GMTrace.o(12300115247104L, 91643);
            return -50001;
          }
        }
      }
      i = 1;
    }
    int i = 1;
    int j = 0;
    for (;;)
    {
      if (j != 0) {
        i = -50006;
      }
      w.i("MicroMsg.OpenFileChooserUI", "finish to import %s  ret %d | duration %d", new Object[] { localObject, Integer.valueOf(i), Integer.valueOf(paramString.duration / 1000) });
      GMTrace.o(12300115247104L, 91643);
      return i;
      j = 1;
      i = 0;
    }
    GMTrace.o(12300115247104L, 91643);
    return -50002;
  }
  
  private boolean bDF()
  {
    GMTrace.i(12299309940736L, 91637);
    w.i("MicroMsg.OpenFileChooserUI", "avaiableMem = %d", new Object[] { Long.valueOf(bg.eD(this)) });
    if (bg.eD(this) <= 200L)
    {
      GMTrace.o(12299309940736L, 91637);
      return false;
    }
    GMTrace.o(12299309940736L, 91637);
    return true;
  }
  
  private static boolean qC(String paramString)
  {
    GMTrace.i(12300383682560L, 91645);
    if (!TextUtils.isEmpty(paramString))
    {
      File localFile = new File(paramString);
      w.i("MicroMsg.OpenFileChooserUI", "thumbFilePath:%s", new Object[] { paramString });
      if (localFile.exists())
      {
        w.i("MicroMsg.OpenFileChooserUI", "video thumb file is exist");
        GMTrace.o(12300383682560L, 91645);
        return true;
      }
      w.e("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
      GMTrace.o(12300383682560L, 91645);
      return false;
    }
    w.e("MicroMsg.OpenFileChooserUI", "video thumb file path is null");
    GMTrace.o(12300383682560L, 91645);
    return false;
  }
  
  private SightParams xM(int paramInt)
  {
    GMTrace.i(18172275064832L, 135394);
    String str1 = "microMsg_" + System.currentTimeMillis();
    this.idK = (com.tencent.mm.compatible.util.e.fRZ + str1 + ".mp4");
    this.idL = (com.tencent.mm.compatible.util.e.fRZ + str1 + ".jpeg");
    int j = getIntent().getIntExtra("key_pick_local_media_duration", 60);
    SightParams localSightParams = new SightParams(3, 1);
    if (this.rIY == 16) {}
    for (int i = 1;; i = 2)
    {
      localSightParams.mWO = i;
      localSightParams.mode = paramInt;
      if (localSightParams.mWP == null) {
        localSightParams.mWP = new VideoTransPara();
      }
      localSightParams.mWP.duration = j;
      String str2 = com.tencent.mm.compatible.util.e.fRZ + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" });
      localSightParams.h(str1, this.idK, this.idL, str2);
      GMTrace.o(18172275064832L, 135394);
      return localSightParams;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12299041505280L, 91635);
    GMTrace.o(12299041505280L, 91635);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, final int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(12299712593920L, 91640);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      paramIntent = new Intent();
      paramIntent.putExtra("key_pick_local_media_show_memory_warning", this.rJa);
      setResult(paramInt2, paramIntent);
      finish();
      GMTrace.o(12299712593920L, 91640);
      return;
    }
    Object localObject2;
    switch (paramInt1)
    {
    default: 
      w.e("MicroMsg.OpenFileChooserUI", "unknown request code = %d", new Object[] { Integer.valueOf(paramInt1) });
      setResult(1);
      finish();
      GMTrace.o(12299712593920L, 91640);
      return;
    case 1: 
    case 3: 
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12117713354752L, 90284);
          Object localObject2 = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
          boolean bool1 = paramIntent.getBooleanExtra("isTakePhoto", false);
          boolean bool2 = paramIntent.getBooleanExtra("CropImage_Compress_Img", true);
          Object localObject1 = new ArrayList();
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str1 = (String)((Iterator)localObject2).next();
            WebViewJSSDKFileItem localWebViewJSSDKFileItem = WebViewJSSDKFileItem.Lh(str1);
            String str2 = localWebViewJSSDKFileItem.eHy;
            localWebViewJSSDKFileItem.hOs = bool2;
            f.bCW().b(localWebViewJSSDKFileItem);
            w.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", new Object[] { str1, str2 });
            ((ArrayList)localObject1).add(str2);
          }
          localObject1 = ai.X((ArrayList)localObject1);
          w.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", new Object[] { localObject1 });
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("key_pick_local_pic_callback_local_ids", (String)localObject1);
          if (bool1) {}
          for (localObject1 = "camera";; localObject1 = "album")
          {
            ((Intent)localObject2).putExtra("key_pick_local_pic_source_type", (String)localObject1);
            ((Intent)localObject2).putExtra("key_pick_local_media_show_memory_warning", OpenFileChooserUI.a(OpenFileChooserUI.this));
            OpenFileChooserUI.this.setResult(paramInt2, (Intent)localObject2);
            OpenFileChooserUI.this.finish();
            GMTrace.o(12117713354752L, 90284);
            return;
          }
        }
      });
      GMTrace.o(12299712593920L, 91640);
      return;
    case 2: 
      localObject1 = k.b(this.vKB.vKW.getApplicationContext(), paramIntent, com.tencent.mm.compatible.util.e.fRZ);
      if (bg.nm((String)localObject1))
      {
        w.w("MicroMsg.OpenFileChooserUI", "take photo, but result is null");
        setResult(-2, paramIntent);
        finish();
        GMTrace.o(12299712593920L, 91640);
        return;
      }
      w.i("MicroMsg.OpenFileChooserUI", "take photo, result[%s]", new Object[] { localObject1 });
      paramIntent = new Intent();
      paramIntent.putExtra("key_send_raw_image", this.rIX);
      paramIntent.putExtra("max_select_count", this.qkk);
      paramIntent.putExtra("query_source_type", this.lDc);
      localObject2 = new ArrayList(1);
      ((ArrayList)localObject2).add(localObject1);
      paramIntent.putStringArrayListExtra("preview_image_list", (ArrayList)localObject2);
      paramIntent.putExtra("preview_image", true);
      paramIntent.addFlags(67108864);
      d.b(this, "gallery", ".ui.GalleryEntryUI", paramIntent, 3);
      GMTrace.o(12299712593920L, 91640);
      return;
    case 5: 
      if (new File(this.idK).exists())
      {
        LW(this.idK);
        GMTrace.o(12299712593920L, 91640);
        return;
      }
      w.e("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_VIDEO, file not exist : %s", new Object[] { this.idK });
      setResult(1);
      finish();
      GMTrace.o(12299712593920L, 91640);
      return;
    case 4: 
      paramIntent = paramIntent.getStringArrayListExtra("key_select_video_list");
      if ((paramIntent == null) || (paramIntent.size() == 0))
      {
        w.e("MicroMsg.OpenFileChooserUI", "choose video failed, path is null");
        setResult(1);
        finish();
        GMTrace.o(12299712593920L, 91640);
        return;
      }
      w.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_GALLERY_VIDEO");
      w.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", new Object[] { paramIntent.get(0) });
      if ((this.rIZ == 1) && (!qC(this.idL))) {
        w.i("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
      }
      LW((String)paramIntent.get(0));
      GMTrace.o(12299712593920L, 91640);
      return;
    case 6: 
      w.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_SIGHT_VIDEO");
      if (paramIntent != null)
      {
        w.i("MicroMsg.OpenFileChooserUI", "data is valid!");
        paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
        if (paramIntent == null)
        {
          w.e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
          setResult(1);
          finish();
          GMTrace.o(12299712593920L, 91640);
          return;
        }
        this.idK = paramIntent.mWH;
        w.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", new Object[] { this.idK });
        if ((!qC(this.idL)) && (qC(paramIntent.mWI))) {
          this.idL = paramIntent.mWI;
        }
        paramIntent = null;
        if (!TextUtils.isEmpty(this.idK)) {
          paramIntent = new File(this.idK);
        }
        if ((paramIntent != null) && (paramIntent.exists()))
        {
          w.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", new Object[] { this.idK });
          LW(this.idK);
          GMTrace.o(12299712593920L, 91640);
          return;
        }
        w.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", new Object[] { this.idK });
      }
      w.e("MicroMsg.OpenFileChooserUI", "data is null!");
      setResult(1);
      finish();
      GMTrace.o(12299712593920L, 91640);
      return;
    case 7: 
      w.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
      if (paramIntent != null)
      {
        w.i("MicroMsg.OpenFileChooserUI", "data is valid!");
        paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
        if (paramIntent == null)
        {
          w.e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
          setResult(1);
          finish();
          GMTrace.o(12299712593920L, 91640);
          return;
        }
        if (paramIntent.mWF)
        {
          paramIntent = paramIntent.mWN;
          if (bg.nm(paramIntent))
          {
            w.e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", new Object[] { paramIntent });
            setResult(1);
            finish();
            GMTrace.o(12299712593920L, 91640);
            return;
          }
          localObject1 = new ArrayList();
          localObject2 = WebViewJSSDKFileItem.Lh(paramIntent);
          ((WebViewJSSDKFileItem)localObject2).hOs = true;
          ((WebViewJSSDKFileItem)localObject2).eGK = 1;
          f.bCW().b((WebViewJSSDKFileItem)localObject2);
          ((ArrayList)localObject1).add(((WebViewJSSDKFileItem)localObject2).eHy);
          w.i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", new Object[] { paramIntent, ((WebViewJSSDKFileItem)localObject2).eHy });
          paramIntent = ai.Y((ArrayList)localObject1);
          w.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", new Object[] { paramIntent });
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("key_pick_local_media_local_ids", paramIntent);
          ((Intent)localObject1).putExtra("key_pick_local_media_callback_type", 2);
          setResult(paramInt2, (Intent)localObject1);
          finish();
          GMTrace.o(12299712593920L, 91640);
          return;
        }
        this.idK = paramIntent.mWH;
        w.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", new Object[] { this.idK });
        if ((!qC(this.idL)) && (qC(paramIntent.mWI))) {
          this.idL = paramIntent.mWI;
        }
        paramIntent = null;
        if (!TextUtils.isEmpty(this.idK)) {
          paramIntent = new File(this.idK);
        }
        if ((paramIntent != null) && (paramIntent.exists()))
        {
          w.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", new Object[] { this.idK });
          LW(this.idK);
          GMTrace.o(12299712593920L, 91640);
          return;
        }
        w.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", new Object[] { this.idK });
      }
      w.e("MicroMsg.OpenFileChooserUI", "data is null!");
      setResult(1);
      finish();
      GMTrace.o(12299712593920L, 91640);
      return;
    }
    w.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
    Object localObject1 = paramIntent.getStringArrayListExtra("key_select_video_list");
    if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
    {
      LW((String)((ArrayList)localObject1).get(0));
      GMTrace.o(12299712593920L, 91640);
      return;
    }
    localObject1 = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
    boolean bool = paramIntent.getBooleanExtra("CropImage_Compress_Img", true);
    if (localObject1 == null)
    {
      w.e("MicroMsg.OpenFileChooserUI", "chosen is null");
      setResult(1);
      finish();
      GMTrace.o(12299712593920L, 91640);
      return;
    }
    paramIntent = new ArrayList();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      WebViewJSSDKFileItem localWebViewJSSDKFileItem = WebViewJSSDKFileItem.Lh((String)localObject2);
      String str = localWebViewJSSDKFileItem.eHy;
      localWebViewJSSDKFileItem.hOs = bool;
      f.bCW().b(localWebViewJSSDKFileItem);
      w.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", new Object[] { localObject2, str });
      paramIntent.add(str);
    }
    paramIntent = ai.Y(paramIntent);
    w.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", new Object[] { paramIntent });
    localObject1 = new Intent();
    ((Intent)localObject1).putExtra("key_pick_local_media_local_ids", paramIntent);
    ((Intent)localObject1).putExtra("key_pick_local_media_show_memory_warning", this.rJa);
    ((Intent)localObject1).putExtra("key_pick_local_media_callback_type", 2);
    setResult(paramInt2, (Intent)localObject1);
    finish();
    GMTrace.o(12299712593920L, 91640);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12299175723008L, 91636);
    super.onCreate(paramBundle);
    this.count = getIntent().getIntExtra("key_pick_local_pic_count", 0);
    if ((this.count <= 0) || (this.count > 9)) {
      this.count = 9;
    }
    this.qkk = this.count;
    this.lDc = getIntent().getIntExtra("key_pick_local_pic_query_source_type", 8);
    this.lDD = getIntent().getIntExtra("query_media_type", 1);
    this.rIX = getIntent().getBooleanExtra("key_pick_local_pic_send_raw", false);
    this.rIY = getIntent().getIntExtra("key_pick_local_pic_capture", 3);
    this.rIZ = getIntent().getIntExtra("key_pick_local_media_video_type", 0);
    int i;
    int j;
    if (((this.lDc == 7) && (this.lDD == 2)) || (this.lDD == 3))
    {
      if (!bDF())
      {
        u.makeText(this, getString(R.l.ekl), 1).show();
        this.rJa = true;
      }
      paramBundle = new Intent();
      paramBundle.putExtra("key_send_raw_image", this.rIX);
      paramBundle.putExtra("query_media_type", this.lDD);
      if (this.rIZ == 1) {
        if ((this.rIY != 4096) && ((this.rIY & 0x1000) > 0))
        {
          i = getIntent().getIntExtra("key_pick_local_media_quality", 1);
          j = getIntent().getIntExtra("key_pick_local_media_duration", 60);
          paramBundle.putExtra("KEY_SIGHT_PARAMS", xM(1));
          paramBundle.putExtra("record_video_force_sys_camera", false);
          paramBundle.putExtra("show_header_view", true);
          paramBundle.putExtra("record_video_is_sight_capture", true);
          paramBundle.putExtra("record_video_quality", i);
          paramBundle.putExtra("record_video_time_limit", j);
          paramBundle.putExtra("video_full_path", this.idK);
          k.c(this, this.qkk, this.lDc, paramBundle);
          if ((this.rIY == 4096) || ((this.rIY & 0x1000) <= 0)) {
            break label1049;
          }
          i = 1;
        }
      }
    }
    Object localObject;
    for (;;)
    {
      if (i == 0) {
        break label1093;
      }
      GMTrace.o(12299175723008L, 91636);
      return;
      if ((this.rIY == 16) || (this.rIY == 256))
      {
        paramBundle.putExtra("KEY_SIGHT_PARAMS", xM(1));
        k.a(this, 6, paramBundle, 3, 1);
        break;
      }
      if (this.rIY != 4096) {
        break;
      }
      paramBundle.putExtra("show_header_view", false);
      k.c(this, this.qkk, this.lDc, paramBundle);
      break;
      if (this.rIZ == 2)
      {
        localObject = bg.nl(getIntent().getStringExtra("key_pick_local_media_sight_type"));
        if ((this.rIY != 4096) && ((this.rIY & 0x1000) > 0))
        {
          w.e("MicroMsg.OpenFileChooserUI", "choose media from local or camera is not support");
          setResult(1);
          finish();
          break;
        }
        if ((this.rIY == 16) || (this.rIY == 256))
        {
          i = 0;
          if ((((String)localObject).contains("video")) && (((String)localObject).contains("image"))) {
            i = 0;
          }
          for (;;)
          {
            paramBundle.putExtra("KEY_SIGHT_PARAMS", xM(i));
            k.a(this, 7, paramBundle, 3, i);
            break;
            if (((String)localObject).contains("video")) {
              i = 1;
            } else if (((String)localObject).contains("image")) {
              i = 2;
            }
          }
        }
        if (this.rIY != 4096) {
          break;
        }
        i = 3;
        if ((((String)localObject).contains("image")) && (((String)localObject).contains("video"))) {
          i = 3;
        }
        for (;;)
        {
          paramBundle = new Intent();
          paramBundle.putExtra("key_can_select_video_and_pic", true);
          paramBundle.putExtra("key_send_raw_image", this.rIX);
          k.a(this, 8, this.qkk, this.lDc, i, false, paramBundle);
          break;
          if (((String)localObject).contains("image")) {
            i = 1;
          } else if (((String)localObject).contains("video")) {
            i = 2;
          }
        }
      }
      if ((this.rIY != 4096) && ((this.rIY & 0x1000) > 0))
      {
        this.idK = (com.tencent.mm.compatible.util.e.fRZ + "microMsg." + System.currentTimeMillis() + ".mp4");
        i = getIntent().getIntExtra("key_pick_local_media_quality", 1);
        j = getIntent().getIntExtra("key_pick_local_media_duration", 60);
        paramBundle.putExtra("record_video_force_sys_camera", true);
        paramBundle.putExtra("record_video_quality", i);
        paramBundle.putExtra("record_video_time_limit", j);
        paramBundle.putExtra("video_full_path", this.idK);
        k.c(this, this.qkk, this.lDc, paramBundle);
        break;
      }
      if ((this.rIY == 16) || (this.rIY == 256))
      {
        this.idK = (com.tencent.mm.compatible.util.e.fRZ + "microMsg." + System.currentTimeMillis() + ".mp4");
        i = getIntent().getIntExtra("key_pick_local_media_quality", 1);
        j = getIntent().getIntExtra("key_pick_local_media_duration", 60);
        paramBundle = this.idK;
        if (this.rIY == 16) {}
        for (boolean bool = true;; bool = false)
        {
          k.a(this, paramBundle, 5, j, i, bool);
          break;
        }
      }
      if (this.rIY != 4096) {
        break;
      }
      paramBundle.putExtra("show_header_view", false);
      k.c(this, this.qkk, this.lDc, paramBundle);
      break;
      label1049:
      if ((this.rIY == 16) || (this.rIY == 256)) {
        i = 1;
      } else if (this.rIY == 4096) {
        i = 1;
      } else {
        i = 0;
      }
    }
    label1093:
    if (!bDF())
    {
      u.makeText(this, getString(R.l.ekl), 1).show();
      this.rJa = true;
    }
    paramBundle = new Intent();
    paramBundle.putExtra("key_send_raw_image", this.rIX);
    paramBundle.putExtra("query_media_type", this.lDD);
    switch (this.rIY)
    {
    default: 
      w.e("MicroMsg.OpenFileChooserUI", "unkown scene, ignore this request");
      setResult(0);
      finish();
      GMTrace.o(12299175723008L, 91636);
      return;
    case 1: 
      paramBundle.putExtra("show_header_view", false);
      k.a(this, 1, this.qkk, this.lDc, paramBundle);
      GMTrace.o(12299175723008L, 91636);
      return;
    case 2: 
      paramBundle = getString(R.l.ekf);
      localObject = new h.c()
      {
        public final void hQ(int paramAnonymousInt)
        {
          GMTrace.i(12274077007872L, 91449);
          boolean bool = com.tencent.mm.pluginsdk.h.a.a(OpenFileChooserUI.this.vKB.vKW, "android.permission.CAMERA", 16, "", "");
          w.i("MicroMsg.OpenFileChooserUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), OpenFileChooserUI.this.vKB.vKW });
          if (!bool)
          {
            GMTrace.o(12274077007872L, 91449);
            return;
          }
          k.c(OpenFileChooserUI.this.vKB.vKW, com.tencent.mm.compatible.util.e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg", 2);
          GMTrace.o(12274077007872L, 91449);
        }
      };
      DialogInterface.OnCancelListener local2 = new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(12298773069824L, 91633);
          OpenFileChooserUI.this.setResult(0);
          OpenFileChooserUI.this.finish();
          GMTrace.o(12298773069824L, 91633);
        }
      };
      h.a(this, "", new String[] { paramBundle }, "", true, (h.c)localObject, local2);
      GMTrace.o(12299175723008L, 91636);
      return;
    }
    k.a(this, 1, this.count, this.lDc, paramBundle);
    GMTrace.o(12299175723008L, 91636);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12300249464832L, 91644);
    super.onDestroy();
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    GMTrace.o(12300249464832L, 91644);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(12299578376192L, 91639);
    w.i("MicroMsg.OpenFileChooserUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(12299578376192L, 91639);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        k.c(this.vKB.vKW, com.tencent.mm.compatible.util.e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg", 2);
        GMTrace.o(12299578376192L, 91639);
        return;
      }
      h.a(this, getString(R.l.dNn), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12324811309056L, 91827);
          OpenFileChooserUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(12324811309056L, 91827);
        }
      }, null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\OpenFileChooserUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */