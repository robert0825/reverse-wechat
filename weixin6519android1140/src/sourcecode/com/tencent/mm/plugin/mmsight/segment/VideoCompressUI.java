package com.tencent.mm.plugin.mmsight.segment;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.h;

@TargetApi(16)
public class VideoCompressUI
  extends MMBaseActivity
{
  private String eIy;
  private com.tencent.mm.remoteservice.d kSj;
  private VideoTransPara ndN;
  private ProgressDialog nfH;
  private a nfI;
  private Runnable nfJ;
  private String videoPath;
  
  public VideoCompressUI()
  {
    GMTrace.i(7473645748224L, 55683);
    this.kSj = new com.tencent.mm.remoteservice.d(this);
    this.nfI = new a();
    this.nfJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7429622333440L, 55355);
        try
        {
          VideoCompressUI.a(VideoCompressUI.this, VideoCompressUI.c(VideoCompressUI.this));
          Intent localIntent = new Intent();
          Point localPoint = VideoCompressUI.m(VideoCompressUI.d(VideoCompressUI.this).videoWidth, VideoCompressUI.d(VideoCompressUI.this).videoHeight, VideoCompressUI.a(VideoCompressUI.this).width, VideoCompressUI.a(VideoCompressUI.this).height);
          if ((VideoCompressUI.b(VideoCompressUI.this, VideoCompressUI.a(VideoCompressUI.this))) || (localPoint != null))
          {
            if (localPoint != null) {
              break label440;
            }
            localPoint = new Point(VideoCompressUI.d(VideoCompressUI.this).videoWidth, VideoCompressUI.d(VideoCompressUI.this).videoHeight);
          }
          for (;;)
          {
            String str = VideoCompressUI.ctO();
            w.i("VideoCompressUI", "need remux, inputVideoSize: [%s %s], out: %s, videoPath: %s, tmpPath: %s", new Object[] { Integer.valueOf(VideoCompressUI.d(VideoCompressUI.this).videoWidth), Integer.valueOf(VideoCompressUI.d(VideoCompressUI.this).videoHeight), localPoint, VideoCompressUI.c(VideoCompressUI.this), str });
            SightVideoJNI.remuxing(VideoCompressUI.c(VideoCompressUI.this), str, localPoint.x, localPoint.y, VideoCompressUI.a(VideoCompressUI.this).videoBitrate, VideoCompressUI.a(VideoCompressUI.this).gBn, 8, VideoCompressUI.a(VideoCompressUI.this).gBm, 25.0F, VideoCompressUI.a(VideoCompressUI.this).fps, null, 0, false);
            localIntent.putExtra("K_SEGMENTVIDEOPATH", str);
            localIntent.putExtra("KSEGMENTVIDEOTHUMBPATH", VideoCompressUI.a(VideoCompressUI.this, str, null));
            for (;;)
            {
              VideoCompressUI.this.setResult(-1, localIntent);
              VideoCompressUI.this.finish();
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(7477135409152L, 55709);
                  if (VideoCompressUI.g(VideoCompressUI.this) != null) {
                    VideoCompressUI.g(VideoCompressUI.this).dismiss();
                  }
                  GMTrace.o(7477135409152L, 55709);
                }
              });
              GMTrace.o(7429622333440L, 55355);
              return;
              w.i("VideoCompressUI", "no need remux, directly set result");
              localIntent.putExtra("K_SEGMENTVIDEOPATH", VideoCompressUI.c(VideoCompressUI.this));
              localIntent.putExtra("KSEGMENTVIDEOTHUMBPATH", VideoCompressUI.a(VideoCompressUI.this, VideoCompressUI.c(VideoCompressUI.this), VideoCompressUI.f(VideoCompressUI.this)));
            }
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("VideoCompressUI", localException, "video compress failed e [%s]", new Object[] { localException.getMessage() });
          VideoCompressUI.this.finish();
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7477135409152L, 55709);
              if (VideoCompressUI.g(VideoCompressUI.this) != null) {
                VideoCompressUI.g(VideoCompressUI.this).dismiss();
              }
              GMTrace.o(7477135409152L, 55709);
            }
          });
          GMTrace.o(7429622333440L, 55355);
          return;
        }
        finally
        {
          VideoCompressUI.this.finish();
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7477135409152L, 55709);
              if (VideoCompressUI.g(VideoCompressUI.this) != null) {
                VideoCompressUI.g(VideoCompressUI.this).dismiss();
              }
              GMTrace.o(7477135409152L, 55709);
            }
          });
        }
      }
    };
    GMTrace.o(7473645748224L, 55683);
  }
  
  private String cW(String paramString1, String paramString2)
  {
    GMTrace.i(7473914183680L, 55685);
    if (!bg.nm(paramString2))
    {
      GMTrace.o(7473914183680L, 55685);
      return paramString2;
    }
    localMediaMetadataRetriever = new MediaMetadataRetriever();
    for (;;)
    {
      try
      {
        localMediaMetadataRetriever.setDataSource(paramString1);
        paramString2 = localMediaMetadataRetriever.getFrameAtTime(0L);
        paramString1 = CaptureMMProxy.getInstance().getAccVideoPath() + "videoCompressTmpThumb/";
        if (FileOp.aZ(paramString1))
        {
          FileOp.B(paramString1, true);
          paramString1 = paramString1 + "video_send_preprocess_thumb_" + System.currentTimeMillis() + ".jpg";
          w.i("VideoCompressUI", "thumbPath: %s", new Object[] { paramString1 });
        }
      }
      catch (Exception paramString2)
      {
        paramString1 = null;
        w.printErrStackTrace("VideoCompressUI", paramString2, "get thumb error e [%s] videoMediaItem [%s] ", new Object[] { paramString2.getMessage(), this.nfI });
        localMediaMetadataRetriever.release();
        continue;
      }
      finally
      {
        localMediaMetadataRetriever.release();
      }
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(paramString2, 80, Bitmap.CompressFormat.JPEG, paramString1, true);
        localMediaMetadataRetriever.release();
        GMTrace.o(7473914183680L, 55685);
        return paramString1;
      }
      catch (Exception paramString2)
      {
        continue;
      }
      FileOp.la(paramString1);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7473779965952L, 55684);
    super.onCreate(paramBundle);
    setContentView(k.d.cpE);
    paramBundle = getIntent();
    if ((paramBundle == null) || (bg.nm(paramBundle.getStringExtra("K_SEGMENTVIDEOPATH"))))
    {
      setResult(0);
      finish();
      GMTrace.o(7473779965952L, 55684);
      return;
    }
    this.nfH = h.a(this, getString(k.f.cUV), false, null);
    this.videoPath = paramBundle.getStringExtra("K_SEGMENTVIDEOPATH");
    this.eIy = paramBundle.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
    CaptureMMProxy.createProxy(new CaptureMMProxy(this.kSj));
    this.kSj.C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7439420227584L, 55428);
        VideoCompressUI.a(VideoCompressUI.this, CaptureMMProxy.getInstance().getSnsAlbumVideoTransPara());
        if (VideoCompressUI.a(VideoCompressUI.this) == null)
        {
          w.e("VideoCompressUI", "VideoSendPreprocessTask para is null");
          VideoCompressUI.this.setResult(0);
          VideoCompressUI.this.finish();
          GMTrace.o(7439420227584L, 55428);
          return;
        }
        e.post(VideoCompressUI.b(VideoCompressUI.this), "video_remuxing_if_needed");
        GMTrace.o(7439420227584L, 55428);
      }
    });
    GMTrace.o(7473779965952L, 55684);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7474048401408L, 55686);
    super.onDestroy();
    if (this.kSj != null) {
      this.kSj.release();
    }
    GMTrace.o(7474048401408L, 55686);
  }
  
  private final class a
  {
    public int audioBitRate;
    public String gVo;
    public String gVp;
    public int gVq;
    public int gVr;
    public int videoBitRate;
    public int videoFrameRate;
    public int videoHeight;
    public int videoWidth;
    
    public a()
    {
      GMTrace.i(7453244653568L, 55531);
      this.gVq = -1;
      this.videoHeight = -1;
      this.videoWidth = -1;
      this.videoBitRate = -1;
      this.gVr = -1;
      this.videoFrameRate = -1;
      this.audioBitRate = -1;
      GMTrace.o(7453244653568L, 55531);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\VideoCompressUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */