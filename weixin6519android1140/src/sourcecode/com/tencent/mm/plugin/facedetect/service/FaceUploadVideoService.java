package com.tencent.mm.plugin.facedetect.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.facedetect.b.r;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class FaceUploadVideoService
  extends Service
  implements e
{
  public FaceUploadVideoService()
  {
    GMTrace.i(5969870323712L, 44479);
    GMTrace.o(5969870323712L, 44479);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5970272976896L, 44482);
    if ((paramk instanceof r))
    {
      paramk = (r)paramk;
      w.i("MicroMsg.FaceUploadVideoService", "hy: bind video errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      h.wS().b(1197, this);
      com.tencent.mm.loader.stub.b.deleteFile(paramk.mFileName);
      stopSelf();
    }
    GMTrace.o(5970272976896L, 44482);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(5970138759168L, 44481);
    GMTrace.o(5970138759168L, 44481);
    return null;
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(5970004541440L, 44480);
    if (paramIntent == null)
    {
      w.e("MicroMsg.FaceUploadVideoService", "hy: null intent called to FaceUploadVideoService! Stub");
      paramInt1 = super.onStartCommand(null, paramInt1, paramInt2);
      GMTrace.o(5970004541440L, 44480);
      return paramInt1;
    }
    String str1 = paramIntent.getStringExtra("key_video_file_name");
    long l = paramIntent.getLongExtra("k_bio_id", -1L);
    String str2 = paramIntent.getStringExtra("key_app_id");
    w.i("MicroMsg.FaceUploadVideoService", "hy: start uploading %s", new Object[] { str1 });
    if (bg.nm(str1))
    {
      w.w("MicroMsg.FaceUploadVideoService", "hy: null file name");
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      GMTrace.o(5970004541440L, 44480);
      return paramInt1;
    }
    if (!new File(str1).exists())
    {
      w.w("MicroMsg.FaceUploadVideoService", "hy: file not exist");
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      GMTrace.o(5970004541440L, 44480);
      return paramInt1;
    }
    if ((l == -1L) && (bg.nm(str2)))
    {
      w.w("MicroMsg.FaceUploadVideoService", "hy: bioId or app id null");
      com.tencent.mm.loader.stub.b.deleteFile(str1);
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      GMTrace.o(5970004541440L, 44480);
      return paramInt1;
    }
    i locali = new i();
    locali.gAB = new a(l, str2, str1);
    locali.field_mediaId = com.tencent.mm.plugin.facedetect.model.n.xA(str1);
    locali.field_fullpath = str1;
    locali.field_thumbpath = "";
    locali.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FILE;
    locali.field_talker = "";
    locali.field_priority = com.tencent.mm.modelcdntran.b.gzd;
    locali.field_needStorage = false;
    locali.field_isStreamMedia = false;
    locali.field_appType = 0;
    locali.field_bzScene = 0;
    locali.field_largesvideo = false;
    if (!g.Gk().c(locali))
    {
      w.e("MicroMsg.FaceUploadVideoService", "hy: video task info failed. clientid:%s", new Object[] { locali.field_mediaId });
      com.tencent.mm.loader.stub.b.deleteFile(str1);
      FaceDetectReporter.d(l, 1, 10086);
    }
    paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
    GMTrace.o(5970004541440L, 44480);
    return paramInt1;
  }
  
  private final class a
    implements i.a
  {
    private String hyD;
    private long kSI;
    private String mFileName;
    
    public a(long paramLong, String paramString1, String paramString2)
    {
      GMTrace.i(5968393928704L, 44468);
      this.kSI = -1L;
      this.hyD = null;
      this.mFileName = null;
      this.kSI = paramLong;
      this.hyD = paramString1;
      this.mFileName = paramString2;
      GMTrace.o(5968393928704L, 44468);
    }
    
    public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult, boolean paramBoolean)
    {
      GMTrace.i(5968528146432L, 44469);
      w.i("MicroMsg.FaceUploadVideoService", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramkeep_ProgressInfo, paramkeep_SceneResult });
      if ((paramkeep_SceneResult != null) && (paramkeep_SceneResult.field_retCode == 0))
      {
        w.i("MicroMsg.FaceUploadVideoService", "hy: upload video done. now upload");
        FaceDetectReporter.d(this.kSI, 0, 0);
        h.wS().a(1197, FaceUploadVideoService.this);
        h.wS().a(new r(this.mFileName, this.kSI, this.hyD, paramkeep_SceneResult.field_fileId, paramkeep_SceneResult.field_aesKey), 0);
      }
      do
      {
        GMTrace.o(5968528146432L, 44469);
        return 0;
        if (paramkeep_SceneResult != null)
        {
          w.w("MicroMsg.FaceUploadVideoService", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramkeep_ProgressInfo, paramkeep_SceneResult });
          com.tencent.mm.loader.stub.b.deleteFile(this.mFileName);
          FaceDetectReporter.d(this.kSI, 1, paramkeep_SceneResult.field_retCode);
          GMTrace.o(5968528146432L, 44469);
          return 0;
        }
      } while (paramInt == 0);
      w.w("MicroMsg.FaceUploadVideoService", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramkeep_ProgressInfo, paramkeep_SceneResult });
      com.tencent.mm.loader.stub.b.deleteFile(this.mFileName);
      FaceDetectReporter.d(this.kSI, 1, paramInt);
      GMTrace.o(5968528146432L, 44469);
      return 0;
    }
    
    public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
    {
      GMTrace.i(5968662364160L, 44470);
      GMTrace.o(5968662364160L, 44470);
    }
    
    public final byte[] h(String paramString, byte[] paramArrayOfByte)
    {
      GMTrace.i(5968796581888L, 44471);
      GMTrace.o(5968796581888L, 44471);
      return new byte[0];
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\service\FaceUploadVideoService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */