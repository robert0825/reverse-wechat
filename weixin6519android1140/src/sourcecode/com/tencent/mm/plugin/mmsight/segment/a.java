package com.tencent.mm.plugin.mmsight.segment;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@TargetApi(16)
public abstract class a
  implements f
{
  private String kmZ;
  String ndg;
  String ndh;
  private MediaExtractor ndi;
  private List<a> ndj;
  private List<a> ndk;
  long ndl;
  long ndm;
  int ndn;
  private boolean ndo;
  VideoTransPara ndp;
  int ndq;
  
  public a()
  {
    GMTrace.i(7484114731008L, 55761);
    this.ndj = new ArrayList();
    this.ndk = new ArrayList();
    this.ndn = -1;
    this.ndo = false;
    this.ndq = -1;
    GMTrace.o(7484114731008L, 55761);
  }
  
  private void a(MediaExtractor paramMediaExtractor)
  {
    GMTrace.i(7484517384192L, 55764);
    int j = paramMediaExtractor.getTrackCount();
    int i = 0;
    if (i < j)
    {
      MediaFormat localMediaFormat = paramMediaExtractor.getTrackFormat(i);
      String str;
      if ((localMediaFormat.containsKey("mime")) && (!bg.nm(localMediaFormat.getString("mime"))))
      {
        str = localMediaFormat.getString("mime");
        w.i("BaseMediaCodecClipper", "mime: %s", new Object[] { str });
        if (!str.startsWith("audio/")) {
          break label113;
        }
        this.ndk.add(new a(localMediaFormat, i));
      }
      for (;;)
      {
        i += 1;
        break;
        label113:
        if (str.startsWith("video/")) {
          this.ndj.add(new a(localMediaFormat, i));
        }
      }
    }
    w.i("BaseMediaCodecClipper", "findMediaFormat mAudioSelectedTrackList.size() = %d, mVideoSelectedTrackList.size() = %d", new Object[] { Integer.valueOf(this.ndk.size()), Integer.valueOf(this.ndj.size()) });
    GMTrace.o(7484517384192L, 55764);
  }
  
  private int aPV()
  {
    GMTrace.i(7485188472832L, 55769);
    int j = -1;
    int i = j;
    Iterator localIterator;
    a locala;
    if (this.ndk != null)
    {
      i = j;
      if (this.ndk.size() != 0)
      {
        localIterator = this.ndk.iterator();
        i = -1;
        if (localIterator.hasNext())
        {
          locala = (a)localIterator.next();
          if (!locala.ncd.containsKey("max-input-size")) {
            break label195;
          }
          i = Math.max(locala.ncd.getInteger("max-input-size"), i);
        }
      }
    }
    label192:
    label195:
    for (;;)
    {
      break;
      j = i;
      if (this.ndj != null)
      {
        j = i;
        if (this.ndj.size() != 0)
        {
          localIterator = this.ndj.iterator();
          if (localIterator.hasNext())
          {
            locala = (a)localIterator.next();
            if (!locala.ncd.containsKey("max-input-size")) {
              break label192;
            }
            i = Math.max(locala.ncd.getInteger("max-input-size"), i);
          }
        }
      }
      for (;;)
      {
        break;
        j = i;
        GMTrace.o(7485188472832L, 55769);
        return j;
      }
    }
  }
  
  public abstract int CL(String paramString);
  
  protected int a(MediaExtractor paramMediaExtractor, List<a> paramList1, List<a> paramList2)
  {
    GMTrace.i(7484785819648L, 55766);
    GMTrace.o(7484785819648L, 55766);
    return 0;
  }
  
  public void a(String paramString1, String paramString2, VideoTransPara paramVideoTransPara)
  {
    GMTrace.i(7484248948736L, 55762);
    w.d("BaseMediaCodecClipper", "init() called with: src = [" + paramString1 + "], dst = [" + paramString2 + "], para = [" + paramVideoTransPara + "]");
    long l = bg.Pw();
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (paramVideoTransPara == null)) {
      throw new IllegalArgumentException(String.format(Locale.CHINA, "Argument's null or nil. src = %s; dst = %s; param = %s", new Object[] { paramString1, paramString2, paramVideoTransPara }));
    }
    File localFile = new File(paramString1);
    new File(paramString2);
    if ((!FileOp.aZ(paramString1)) || (!localFile.canRead()) || (localFile.length() == 0L)) {
      throw new IllegalArgumentException(String.format(Locale.CHINA, "Argument src video file can not be read or empty %s", new Object[] { paramString1 }));
    }
    this.ndh = paramString1;
    this.ndg = paramString2;
    this.ndp = paramVideoTransPara;
    this.ndi = new MediaExtractor();
    this.ndi.setDataSource(paramString1);
    a(this.ndi);
    if ((this.ndj == null) || (this.ndj.size() == 0)) {
      throw new o("Can not find video or audio track in this video file.");
    }
    this.ndn = aPV();
    this.ndq = CL(paramString1);
    this.ndo = true;
    w.e("BaseMediaCodecClipper", "init cost time %dms", new Object[] { Long.valueOf(bg.aI(l)) });
    GMTrace.o(7484248948736L, 55762);
  }
  
  protected final String aPU()
  {
    GMTrace.i(7484920037376L, 55767);
    if (this.kmZ == null) {
      this.kmZ = (CaptureMMProxy.getInstance().getAccVideoPath() + "vsg_clip_temp.mp4");
    }
    String str = this.kmZ;
    GMTrace.o(7484920037376L, 55767);
    return str;
  }
  
  public int p(long paramLong1, long paramLong2)
  {
    GMTrace.i(7484651601920L, 55765);
    if (!this.ndo)
    {
      w.e("BaseMediaCodecClipper", "checkTimeParameter has not been initialized.");
      throw new IllegalStateException("Please init this component first.");
    }
    long l = paramLong1;
    if (paramLong1 < 0L) {
      l = 0L;
    }
    this.ndl = l;
    MediaFormat localMediaFormat = ((a)this.ndj.get(0)).ncd;
    if (!localMediaFormat.containsKey("durationUs")) {
      throw new o("Can not find duration.");
    }
    if (paramLong2 > 0L)
    {
      paramLong1 = paramLong2;
      if (paramLong2 <= localMediaFormat.getLong("durationUs") / 1000L) {}
    }
    else
    {
      paramLong1 = localMediaFormat.getLong("durationUs") / 1000L;
    }
    this.ndm = paramLong1;
    int i = a(this.ndi, this.ndk, this.ndj);
    GMTrace.o(7484651601920L, 55765);
    return i;
  }
  
  public final void release()
  {
    GMTrace.i(7485054255104L, 55768);
    this.ndo = false;
    if (this.ndi != null) {
      this.ndi.release();
    }
    GMTrace.o(7485054255104L, 55768);
  }
  
  final class a
  {
    int index;
    MediaFormat ncd;
    
    a(MediaFormat paramMediaFormat, int paramInt)
    {
      GMTrace.i(7423045664768L, 55306);
      this.ncd = paramMediaFormat;
      this.index = paramInt;
      GMTrace.o(7423045664768L, 55306);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */