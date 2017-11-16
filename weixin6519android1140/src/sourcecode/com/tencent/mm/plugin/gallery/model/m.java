package com.tencent.mm.plugin.gallery.model;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;

@TargetApi(16)
public final class m
  implements Runnable
{
  public MediaFormat lCa;
  public GalleryItem.VideoMediaItem lCb;
  public a lCc;
  public String path;
  public int position;
  public MediaFormat videoFormat;
  
  public m(String paramString, int paramInt, GalleryItem.VideoMediaItem paramVideoMediaItem, a parama)
  {
    GMTrace.i(11904844038144L, 88698);
    this.path = paramString;
    this.position = paramInt;
    this.lCb = paramVideoMediaItem;
    this.lCc = parama;
    GMTrace.o(11904844038144L, 88698);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(11905112473600L, 88700);
    if (((paramObject instanceof m)) && ((this == paramObject) || (this.position == ((m)paramObject).position) || ((this.path != null) && (this.path.equals(((m)paramObject).path)))))
    {
      GMTrace.o(11905112473600L, 88700);
      return true;
    }
    GMTrace.o(11905112473600L, 88700);
    return false;
  }
  
  public final void run()
  {
    GMTrace.i(11904978255872L, 88699);
    MediaExtractor localMediaExtractor = new MediaExtractor();
    for (;;)
    {
      int i;
      try
      {
        localMediaExtractor.setDataSource(this.path);
        int j = localMediaExtractor.getTrackCount();
        i = 0;
        if (i < j)
        {
          localObject1 = localMediaExtractor.getTrackFormat(i);
          if (!((MediaFormat)localObject1).containsKey("mime"))
          {
            w.d("VideoAnalysisTask", "find video mime : not found.");
            break label594;
          }
          localObject3 = ((MediaFormat)localObject1).getString("mime");
          w.d("VideoAnalysisTask", "find video mime : %s", new Object[] { localObject3 });
          if (localObject3 == null) {
            break label594;
          }
          if (!((String)localObject3).startsWith("video/")) {
            continue;
          }
          if (this.videoFormat == null) {
            this.videoFormat = ((MediaFormat)localObject1);
          }
          if ((this.lCa == null) || (this.videoFormat == null)) {
            break label594;
          }
        }
        if (this.lCb == null) {
          continue;
        }
        if (this.videoFormat == null) {
          continue;
        }
        localObject1 = this.lCb;
        if (this.videoFormat.containsKey("durationUs")) {
          continue;
        }
        i = 0;
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject3;
        w.d("VideoAnalysisTask", "Video extractor init failed. video path = [%s] e = [%s]", new Object[] { this.path, localException.getMessage() });
        localMediaExtractor.release();
        continue;
        i = (int)(this.videoFormat.getLong("durationUs") / 1000L);
        continue;
        i = this.videoFormat.getInteger("height");
        continue;
        i = this.videoFormat.getInteger("width");
        continue;
        String str = this.videoFormat.getString("mime");
        continue;
        i = this.videoFormat.getInteger("bitrate");
        continue;
        i = this.videoFormat.getInteger("i-frame-interval");
        continue;
        i = this.videoFormat.getInteger("frame-rate");
        continue;
        str = this.lCa.getString("mime");
        continue;
      }
      finally
      {
        localMediaExtractor.release();
      }
      ((GalleryItem.VideoMediaItem)localObject1).gVq = i;
      localObject1 = this.lCb;
      if (!this.videoFormat.containsKey("height"))
      {
        i = 0;
        ((GalleryItem.VideoMediaItem)localObject1).videoHeight = i;
        localObject1 = this.lCb;
        if (this.videoFormat.containsKey("width")) {
          continue;
        }
        i = 0;
        ((GalleryItem.VideoMediaItem)localObject1).videoWidth = i;
        localObject3 = this.lCb;
        if (this.videoFormat.containsKey("mime")) {
          continue;
        }
        localObject1 = "";
        ((GalleryItem.VideoMediaItem)localObject3).gVo = ((String)localObject1);
        localObject1 = this.lCb;
        if (this.videoFormat.containsKey("bitrate")) {
          continue;
        }
        i = 0;
        ((GalleryItem.VideoMediaItem)localObject1).videoBitRate = i;
        localObject1 = this.lCb;
        if (this.videoFormat.containsKey("i-frame-interval")) {
          continue;
        }
        i = 0;
        ((GalleryItem.VideoMediaItem)localObject1).gVr = i;
        localObject1 = this.lCb;
        if (this.videoFormat.containsKey("frame-rate")) {
          continue;
        }
        i = 0;
        ((GalleryItem.VideoMediaItem)localObject1).videoFrameRate = i;
        if (this.lCa != null)
        {
          localObject3 = this.lCb;
          if (this.lCa.containsKey("mime")) {
            continue;
          }
          localObject1 = "";
          ((GalleryItem.VideoMediaItem)localObject3).gVp = ((String)localObject1);
        }
        localMediaExtractor.release();
        if (this.lCc != null) {
          break label574;
        }
        w.d("VideoAnalysisTask", "video analysis end. observer == null, position = [%d], mediaItem = [%s]", new Object[] { Integer.valueOf(this.position), this.lCb });
        GMTrace.o(11904978255872L, 88699);
        return;
        if ((!((String)localObject3).startsWith("audio/")) || (this.lCa != null)) {
          continue;
        }
        this.lCa = ((MediaFormat)localObject1);
      }
      label574:
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11916520980480L, 88785);
          if (m.this.lCc != null) {
            m.this.lCc.a(m.this);
          }
          GMTrace.o(11916520980480L, 88785);
        }
      });
      GMTrace.o(11904978255872L, 88699);
      return;
      label594:
      i += 1;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(m paramm);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */