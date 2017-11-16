package com.tencent.mm.plugin.facedetect.b;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;

public final class a
  implements com.tencent.mm.ad.e
{
  public boolean ezT;
  public long kRA;
  public int kRB;
  public i.a kRC;
  public int kRs;
  public d kRt;
  public c kRu;
  public boolean kRv;
  public long kRw;
  public int kRx;
  public k kRy;
  public k kRz;
  
  public a(int paramInt)
  {
    GMTrace.i(14538866950144L, 108323);
    this.kRs = -1;
    this.kRt = null;
    this.kRu = null;
    this.ezT = false;
    this.kRv = false;
    this.kRw = 0L;
    this.kRx = 0;
    this.kRy = null;
    this.kRz = null;
    this.kRA = -1L;
    this.kRB = -1;
    this.kRC = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(5939000246272L, 44249);
        if (paramAnonymousInt == 44531)
        {
          w.i("MicroMsg.FaceUploadProcessor", "hy: ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
          GMTrace.o(5939000246272L, 44249);
          return 0;
        }
        if ((paramAnonymouskeep_SceneResult != null) && (paramAnonymouskeep_SceneResult.field_retCode == 0))
        {
          w.i("MicroMsg.FaceUploadProcessor", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
          paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.field_fileId;
          paramAnonymousString = new Bundle();
          paramAnonymousString.putString("key_pic_cdn_id", paramAnonymouskeep_ProgressInfo);
          paramAnonymousString.putString("key_cdn_aes_key", paramAnonymouskeep_SceneResult.field_aesKey);
          paramAnonymouskeep_ProgressInfo = a.this;
          if (paramAnonymouskeep_ProgressInfo.kRt != null) {
            paramAnonymouskeep_ProgressInfo.kRt.a(0, 0, "ok", paramAnonymousString);
          }
          GMTrace.o(5939000246272L, 44249);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          w.w("MicroMsg.FaceUploadProcessor", "hy: cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
          a.this.g(3, 90020, "cdn ret error");
          GMTrace.o(5939000246272L, 44249);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          w.w("MicroMsg.FaceUploadProcessor", "hy: start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
          a.this.g(3, 90021, "cdn start error");
          GMTrace.o(5939000246272L, 44249);
          return 0;
        }
        w.i("MicroMsg.FaceUploadProcessor", "hy: on process, cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          double d = paramAnonymouskeep_ProgressInfo.field_finishedLength / paramAnonymouskeep_ProgressInfo.field_toltalLength;
          w.d("MicroMsg.FaceUploadProcessor", "hy: cdn process: %f", new Object[] { Double.valueOf(d) });
          paramAnonymousString = a.this;
          if (paramAnonymousString.kRt != null) {
            paramAnonymousString.kRt.j(d);
          }
        }
        GMTrace.o(5939000246272L, 44249);
        return 0;
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(5939134464000L, 44250);
        GMTrace.o(5939134464000L, 44250);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(5939268681728L, 44251);
        GMTrace.o(5939268681728L, 44251);
        return null;
      }
    };
    this.kRs = paramInt;
    GMTrace.o(14538866950144L, 108323);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    boolean bool = false;
    GMTrace.i(5939805552640L, 44255);
    w.i("MicroMsg.FaceUploadProcessor", "hy: scene: %s, errType: %d, errCode: %d, errMsg: %s", new Object[] { paramk.toString(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (((paramk instanceof u)) || ((paramk instanceof v)))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (b)paramk;
        this.kRw = paramString.avP();
        com.tencent.mm.plugin.facedetect.model.e.bZ(this.kRw);
        if (paramString.avQ() == null)
        {
          w.e("MicroMsg.FaceUploadProcessor", "hy: backend not return config");
          g(2, 90015, "face motion config from server is null");
          GMTrace.o(5939805552640L, 44255);
          return;
        }
        paramString = paramString.avQ();
        paramInt1 = paramString.length;
        if (this.kRt == null) {
          bool = true;
        }
        w.i("MicroMsg.FaceUploadProcessor", "configLen: %d, mUploadCallback == null: %b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(bool) });
        if (this.kRu != null) {
          this.kRu.e(this.kRw, paramString);
        }
        GMTrace.o(5939805552640L, 44255);
        return;
      }
      if (this.kRu != null)
      {
        this.kRu.N(paramInt1, "get face bio config failed");
        GMTrace.o(5939805552640L, 44255);
      }
    }
    else if ((this.kRz != null) && (paramk.getType() == this.kRz.getType()))
    {
      this.kRB = ((int)(System.currentTimeMillis() - this.kRA));
      if (this.kRt != null) {
        this.kRt.g(paramInt1, paramInt2, paramString, paramk);
      }
    }
    GMTrace.o(5939805552640L, 44255);
  }
  
  public final void avO()
  {
    GMTrace.i(5939537117184L, 44253);
    if (this.kRz != null) {
      h.wS().b(this.kRz.getType(), this);
    }
    GMTrace.o(5939537117184L, 44253);
  }
  
  public final void g(final int paramInt1, final int paramInt2, final String paramString)
  {
    GMTrace.i(5939671334912L, 44254);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5942624124928L, 44276);
        if (a.this.kRt != null) {
          a.this.kRt.a(a.this.kRx, paramInt1, paramInt2, paramString);
        }
        GMTrace.o(5942624124928L, 44276);
      }
    });
    GMTrace.o(5939671334912L, 44254);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */