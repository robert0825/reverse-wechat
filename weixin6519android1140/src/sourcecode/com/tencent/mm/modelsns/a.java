package com.tencent.mm.modelsns;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.po;
import com.tencent.mm.g.a.po.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Set;

public final class a
{
  public static Set<String> gVm;
  
  public static Intent a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2)
  {
    GMTrace.i(14691204071424L, 109458);
    w.d("MicroMsg.ShareSnsImpl", "appmsg.description " + paramWXMediaMessage.description);
    w.d("MicroMsg.ShareSnsImpl", "appmsg.title " + paramWXMediaMessage.title);
    Object localObject1 = paramWXMediaMessage.mediaObject;
    int i;
    switch (((WXMediaMessage.IMediaObject)localObject1).type())
    {
    default: 
      i = -1;
    }
    Intent localIntent;
    for (;;)
    {
      localIntent = new Intent();
      localIntent.putExtra("KThrid_app", true);
      w.d("MicroMsg.ShareSnsImpl", "TimeLineType " + i + " " + ((WXMediaMessage.IMediaObject)localObject1).type());
      localIntent.putExtra("Ksnsupload_appid", paramString1);
      localIntent.putExtra("Ksnsupload_appname", paramString2);
      localIntent.putExtra("KSnsAction", true);
      localIntent.putExtra("need_result", true);
      paramString1 = new Bundle();
      paramString2 = new SendMessageToWX.Req();
      paramString2.message = paramWXMediaMessage;
      paramString2.toBundle(paramString1);
      localIntent.putExtra("Ksnsupload_timeline", paramString1);
      if (i != -1) {
        break;
      }
      w.d("MicroMsg.ShareSnsImpl", "timeLineType is invalid");
      GMTrace.o(14691204071424L, 109458);
      return null;
      i = 2;
      continue;
      i = 4;
      continue;
      i = 1;
      continue;
      i = 3;
      continue;
      i = 5;
      continue;
      i = 3;
      continue;
      i = 15;
    }
    label525:
    label610:
    label618:
    label1055:
    String str1;
    String str2;
    switch (((WXMediaMessage.IMediaObject)localObject1).type())
    {
    default: 
      w.e("MicroMsg.ShareSnsImpl", "none type not support!");
      GMTrace.o(14691204071424L, 109458);
      return null;
    case 1: 
      localIntent.putExtra("Kdescription", ((WXTextObject)localObject1).text);
      localIntent.putExtra("Ksnsupload_type", 8);
      GMTrace.o(14691204071424L, 109458);
      return localIntent;
    case 3: 
      paramString1 = (WXMusicObject)localObject1;
      if (!bg.nm(paramString1.musicUrl))
      {
        paramWXMediaMessage = paramString1.musicUrl;
        paramString2 = bg.aq(paramWXMediaMessage, "");
        if (bg.nm(paramString1.musicDataUrl)) {
          break label610;
        }
        paramWXMediaMessage = paramString1.musicDataUrl;
        bg.aq(paramWXMediaMessage, "");
        if (bg.nm(paramString1.musicLowBandDataUrl)) {
          break label618;
        }
      }
      for (paramWXMediaMessage = paramString1.musicLowBandDataUrl;; paramWXMediaMessage = paramString1.musicLowBandUrl)
      {
        bg.aq(paramWXMediaMessage, "");
        localIntent.putExtra("Ksnsupload_link", paramString2);
        localIntent.putExtra("Ksnsupload_title", "");
        localIntent.putExtra("Ksnsupload_type", 2);
        localIntent.putExtra("ksnsis_music", true);
        GMTrace.o(14691204071424L, 109458);
        return localIntent;
        paramWXMediaMessage = paramString1.musicLowBandUrl;
        break;
        paramWXMediaMessage = paramString1.musicUrl;
        break label525;
      }
    case 2: 
      paramWXMediaMessage = (WXImageObject)localObject1;
      localIntent.putExtra("KBlockAdd", true);
      localIntent.putExtra("Ksnsupload_type", 0);
      localIntent.putExtra("sns_kemdia_path", paramWXMediaMessage.imagePath);
      GMTrace.o(14691204071424L, 109458);
      return localIntent;
    case 5: 
      localIntent.putExtra("Ksnsupload_link", ((WXWebpageObject)localObject1).webpageUrl);
      localIntent.putExtra("Ksnsupload_title", bg.aq(paramWXMediaMessage.title, ""));
      localIntent.putExtra("Ksnsupload_imgbuf", paramWXMediaMessage.thumbData);
      localIntent.putExtra("Ksnsupload_type", 1);
      GMTrace.o(14691204071424L, 109458);
      return localIntent;
    case 6: 
      w.e("MicroMsg.ShareSnsImpl", "file is not support!");
      GMTrace.o(14691204071424L, 109458);
      return null;
    case 4: 
      paramWXMediaMessage = (WXVideoObject)localObject1;
      if (!bg.nm(paramWXMediaMessage.videoUrl)) {}
      for (paramWXMediaMessage = paramWXMediaMessage.videoUrl;; paramWXMediaMessage = paramWXMediaMessage.videoLowBandUrl)
      {
        localIntent.putExtra("Ksnsupload_link", bg.aq(paramWXMediaMessage, ""));
        localIntent.putExtra("Ksnsupload_title", "");
        localIntent.putExtra("Ksnsupload_type", 1);
        localIntent.putExtra("ksnsis_video", true);
        GMTrace.o(14691204071424L, 109458);
        return localIntent;
      }
    case 38: 
      paramWXMediaMessage = (WXVideoFileObject)localObject1;
      localIntent.putExtra("KBlockAdd", true);
      localIntent.putExtra("Ksnsupload_type", 14);
      paramString1 = paramWXMediaMessage.filePath;
      paramWXMediaMessage = "";
      paramString2 = g.bg(paramString1);
      if ((bg.nm("")) || (!FileOp.aZ("")))
      {
        paramWXMediaMessage = new StringBuilder();
        at.AR();
        paramWXMediaMessage = c.getAccSnsTmpPath() + paramString2;
      }
      try
      {
        localObject1 = ls(paramString1);
        if (localObject1 == null) {
          break label1055;
        }
        w.i("MicroMsg.ShareSnsImpl", "getBitmap1 %d %d", new Object[] { Integer.valueOf(((Bitmap)localObject1).getWidth()), Integer.valueOf(((Bitmap)localObject1).getHeight()) });
        d.a((Bitmap)localObject1, 80, Bitmap.CompressFormat.JPEG, paramWXMediaMessage, true);
        localObject1 = d.RB(paramWXMediaMessage);
        w.i("MicroMsg.ShareSnsImpl", "getBitmap2 %d %d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject1).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject1).outHeight) });
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          w.e("MicroMsg.ShareSnsImpl", "savebitmap error %s", new Object[] { localException1.getMessage() });
        }
      }
      localIntent.putExtra("KSightPath", paramString1);
      localIntent.putExtra("KSightThumbPath", paramWXMediaMessage);
      localIntent.putExtra("sight_md5", paramString2);
      GMTrace.o(14691204071424L, 109458);
      return localIntent;
      w.e("MicroMsg.ShareSnsImpl", "thumb null , videoPath %s ", new Object[] { paramString1 });
      GMTrace.o(14691204071424L, 109458);
      return null;
    case 39: 
      paramWXMediaMessage = (WXGameVideoFileObject)localException1;
      localIntent.putExtra("KBlockAdd", true);
      localIntent.putExtra("Ksnsupload_type", 14);
      paramString1 = paramWXMediaMessage.filePath;
      paramString2 = paramWXMediaMessage.videoUrl;
      str1 = paramWXMediaMessage.thumbUrl;
      w.i("MicroMsg.ShareSnsImpl", "videoPath %s,thumbPath %s,cdnUrl %s,cdnThumbUrl %s", new Object[] { paramString1, "", paramString2, str1 });
      str2 = g.bg(paramString1);
      if ((bg.nm("")) || (!FileOp.aZ("")))
      {
        paramWXMediaMessage = new StringBuilder();
        at.AR();
      }
      break;
    }
    for (paramWXMediaMessage = c.getAccSnsTmpPath() + str2;; paramWXMediaMessage = "")
    {
      try
      {
        Object localObject2 = ls(paramString1);
        if (localObject2 == null) {
          break label1386;
        }
        w.i("MicroMsg.ShareSnsImpl", "getBitmap1 %d %d", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()) });
        d.a((Bitmap)localObject2, 80, Bitmap.CompressFormat.JPEG, paramWXMediaMessage, true);
        localObject2 = d.RB(paramWXMediaMessage);
        w.i("MicroMsg.ShareSnsImpl", "getBitmap2 %d %d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject2).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject2).outHeight) });
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          label1386:
          w.e("MicroMsg.ShareSnsImpl", "savebitmap error %s", new Object[] { localException2.getMessage() });
        }
      }
      localIntent.putExtra("KSightPath", paramString1);
      localIntent.putExtra("KSightThumbPath", paramWXMediaMessage);
      localIntent.putExtra("sight_md5", str2);
      localIntent.putExtra("KSightCdnUrl", paramString2);
      localIntent.putExtra("KSightCdnThumbUrl", str1);
      GMTrace.o(14691204071424L, 109458);
      return localIntent;
      w.e("MicroMsg.ShareSnsImpl", "thumb null , videoPath %s ", new Object[] { paramString1 });
      GMTrace.o(14691204071424L, 109458);
      return null;
      GMTrace.o(14691204071424L, 109458);
      return null;
    }
  }
  
  private static Bitmap ls(String paramString)
  {
    GMTrace.i(16268933464064L, 121213);
    po localpo = new po();
    localpo.eUo.eUq = paramString;
    com.tencent.mm.sdk.b.a.vgX.m(localpo);
    paramString = (Bitmap)localpo.eUp.result;
    GMTrace.o(16268933464064L, 121213);
    return paramString;
  }
  
  public static final class a
  {
    public String gVn;
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
      GMTrace.i(15961977520128L, 118926);
      this.gVq = -1;
      this.videoHeight = -1;
      this.videoWidth = -1;
      this.videoBitRate = -1;
      this.gVr = -1;
      this.videoFrameRate = -1;
      GMTrace.o(15961977520128L, 118926);
    }
    
    public static a lt(String paramString)
    {
      GMTrace.i(15962111737856L, 118927);
      MediaExtractor localMediaExtractor = new MediaExtractor();
      a locala = new a();
      locala.gVn = paramString;
      for (;;)
      {
        Object localObject2;
        int i;
        Object localObject5;
        Object localObject6;
        try
        {
          localMediaExtractor.setDataSource(paramString);
          int j = localMediaExtractor.getTrackCount();
          localObject2 = null;
          str1 = null;
          i = 0;
          localObject3 = localObject2;
          localObject4 = str1;
          if (i < j)
          {
            localMediaFormat = localMediaExtractor.getTrackFormat(i);
            if (!localMediaFormat.containsKey("mime"))
            {
              w.i("MicroMsg.ShareSnsImpl", "find video mime : not found.");
              localObject5 = localObject2;
              localObject6 = str1;
              break label510;
            }
            str2 = localMediaFormat.getString("mime");
            w.i("MicroMsg.ShareSnsImpl", "find video mime : %s", new Object[] { str2 });
            localObject5 = localObject2;
            localObject6 = str1;
            if (str2 == null) {
              break label510;
            }
            if (!str2.startsWith("video/")) {
              continue;
            }
            localObject3 = localObject2;
            localObject4 = str1;
            if (str1 != null) {
              break label524;
            }
            localObject4 = localMediaFormat;
            localObject3 = localObject2;
            break label524;
          }
          if (localObject4 != null)
          {
            if (((MediaFormat)localObject4).containsKey("durationUs")) {
              continue;
            }
            i = 0;
            locala.gVq = i;
            if (((MediaFormat)localObject4).containsKey("height")) {
              continue;
            }
            i = 0;
            locala.videoHeight = i;
            if (((MediaFormat)localObject4).containsKey("width")) {
              continue;
            }
            i = 0;
            locala.videoWidth = i;
            if (((MediaFormat)localObject4).containsKey("mime")) {
              continue;
            }
            str1 = "";
            locala.gVo = str1;
            if (((MediaFormat)localObject4).containsKey("bitrate")) {
              continue;
            }
            i = 0;
            locala.videoBitRate = i;
            if (((MediaFormat)localObject4).containsKey("i-frame-interval")) {
              continue;
            }
            i = 0;
            locala.gVr = i;
            if (((MediaFormat)localObject4).containsKey("frame-rate")) {
              continue;
            }
            i = 0;
            locala.videoFrameRate = i;
          }
          if (localObject3 != null)
          {
            if (((MediaFormat)localObject3).containsKey("mime")) {
              continue;
            }
            str1 = "";
            locala.gVp = str1;
          }
        }
        catch (Exception localException)
        {
          String str1;
          MediaFormat localMediaFormat;
          String str2;
          w.i("MicroMsg.ShareSnsImpl", "Video extractor init failed. video path = [%s] e = [%s]", new Object[] { paramString, localException.getMessage() });
          localMediaExtractor.release();
          continue;
        }
        finally
        {
          localMediaExtractor.release();
        }
        GMTrace.o(15962111737856L, 118927);
        return locala;
        Object localObject3 = localObject2;
        Object localObject4 = str1;
        if (str2.startsWith("audio/"))
        {
          localObject3 = localObject2;
          localObject4 = str1;
          if (localObject2 == null)
          {
            localObject3 = localMediaFormat;
            localObject4 = str1;
            break label524;
            i = (int)(((MediaFormat)localObject4).getLong("durationUs") / 1000L);
            continue;
            i = ((MediaFormat)localObject4).getInteger("height");
            continue;
            i = ((MediaFormat)localObject4).getInteger("width");
            continue;
            str1 = ((MediaFormat)localObject4).getString("mime");
            continue;
            i = ((MediaFormat)localObject4).getInteger("bitrate");
            continue;
            i = ((MediaFormat)localObject4).getInteger("i-frame-interval");
            continue;
            i = ((MediaFormat)localObject4).getInteger("frame-rate");
            continue;
            str1 = ((MediaFormat)localObject3).getString("mime");
            continue;
          }
        }
        label510:
        label524:
        do
        {
          do
          {
            i += 1;
            localObject2 = localObject5;
            Object localObject1 = localObject6;
            break;
            localObject5 = localObject3;
            localObject6 = localObject4;
          } while (localObject3 == null);
          localObject5 = localObject3;
          localObject6 = localObject4;
        } while (localObject4 == null);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelsns\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */