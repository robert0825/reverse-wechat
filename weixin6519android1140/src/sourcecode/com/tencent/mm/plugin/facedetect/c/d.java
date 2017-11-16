package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.facedetect.a.d;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.b.m;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends a
{
  private String appId;
  private String eOQ;
  boolean jWK;
  private String kSo;
  private String kSp;
  
  d(Context paramContext, e parame, int paramInt, Bundle paramBundle)
  {
    super(paramContext, parame, paramInt);
    GMTrace.i(14546517360640L, 108380);
    this.jWK = false;
    this.kSl = true;
    this.appId = paramBundle.getString("k_app_id", null);
    this.eOQ = paramBundle.getString("request_verify_pre_info", null);
    GMTrace.o(14546517360640L, 108380);
  }
  
  private void a(final int paramInt1, final int paramInt2, final String paramString, final boolean paramBoolean, final Bundle paramBundle)
  {
    GMTrace.i(5981949919232L, 44569);
    Object localObject = ab.getContext();
    if (paramString == null) {}
    for (String str1 = ((Context)localObject).getString(a.h.kQx);; str1 = paramString)
    {
      int i = a.d.kPn;
      String str2;
      if (paramBoolean)
      {
        str2 = ((Context)localObject).getString(a.h.kQU);
        if (!paramBoolean) {
          break label130;
        }
      }
      label130:
      for (localObject = ((Context)localObject).getString(a.h.cSk);; localObject = null)
      {
        a(true, false, com.tencent.mm.plugin.facedetect.ui.a.a(i, str1, str2, null, (String)localObject, new View.OnClickListener()new View.OnClickListener
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5982218354688L, 44571);
            if (paramBoolean)
            {
              paramAnonymousView = d.this;
              paramAnonymousView.avU();
              paramAnonymousView.jWK = true;
              GMTrace.o(5982218354688L, 44571);
              return;
            }
            d.this.b(paramInt1, paramInt2, paramString, paramBundle);
            GMTrace.o(5982218354688L, 44571);
          }
        }, new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5982486790144L, 44573);
            d.this.b(paramInt1, paramInt2, paramString, paramBundle);
            GMTrace.o(5982486790144L, 44573);
          }
        }));
        GMTrace.o(5981949919232L, 44569);
        return;
        str2 = ((Context)localObject).getString(a.h.kQT);
        break;
      }
    }
  }
  
  public final void O(int paramInt, String paramString)
  {
    GMTrace.i(5981681483776L, 44567);
    w.i("MicroMsg.FaceDetectMpController", "alvinluo onCancel, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (!FaceDetectReporter.aws().kTv) {
      FaceDetectReporter.aws().a(this.kSi, this.jWK, 2, 1, paramInt);
    }
    b(1, paramInt, paramString, null);
    GMTrace.o(5981681483776L, 44567);
  }
  
  public final k avX()
  {
    GMTrace.i(5980741959680L, 44560);
    m localm = new m(avV(), this.appId, this.eOQ, this.kSo, this.kSp);
    GMTrace.o(5980741959680L, 44560);
    return localm;
  }
  
  public final Bundle avY()
  {
    GMTrace.i(5981815701504L, 44568);
    Bundle localBundle = new Bundle();
    localBundle.putLong("k_bio_id", avV());
    localBundle.putString("key_app_id", this.appId);
    GMTrace.o(5981815701504L, 44568);
    return localBundle;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    GMTrace.i(5981278830592L, 44564);
    w.i("MicroMsg.FaceDetectMpController", "alvinluo onUploadEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      FaceDetectReporter.aws().a(this.kSi, this.jWK, 1, 2, 90012);
      a(paramInt1, paramInt2, paramString, false, null);
      GMTrace.o(5981278830592L, 44564);
      return true;
    }
    if ((paramBundle == null) || (bg.nm(paramBundle.getString("key_pic_cdn_id"))))
    {
      w.e("MicroMsg.FaceDetectMpController", "hy: not return cdn id!");
      a(4, 6, "not return cdn id", false, null);
      GMTrace.o(5981278830592L, 44564);
      return true;
    }
    this.kSo = paramBundle.getString("key_pic_cdn_id");
    this.kSp = paramBundle.getString("key_cdn_aes_key");
    w.v("MicroMsg.FaceDetectMpController", "hy: start upload: picCdnId: %s, aes key: %s", new Object[] { this.kSo, this.kSp });
    GMTrace.o(5981278830592L, 44564);
    return false;
  }
  
  public final void g(final int paramInt1, final int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(5981413048320L, 44565);
    w.i("MicroMsg.FaceDetectMpController", "alvinluo onVerifyEnd sceneType: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    final Bundle localBundle;
    int j;
    boolean bool;
    FaceDetectReporter localFaceDetectReporter;
    if ((paramk instanceof m))
    {
      localBundle = new Bundle();
      localBundle.putString("verify_result", ((m)paramk).kRU);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = FaceDetectReporter.aws();
        j = this.kSi;
        bool = this.jWK;
        if (this.kSk != null) {}
        for (i = this.kSk.kRB;; i = 0)
        {
          paramk.a(j, bool, 0, paramInt1, paramInt2, i);
          FaceDetectReporter.aws().kTC = true;
          paramk = com.tencent.mm.plugin.facedetect.ui.a.nv(a.d.kPA);
          paramk.kVH = true;
          paramk.kVO = ab.getResources().getString(a.h.kQV);
          a(false, true, paramk);
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5986244886528L, 44601);
              d.this.b(paramInt1, paramInt2, paramString, localBundle);
              GMTrace.o(5986244886528L, 44601);
            }
          }, 1500L);
          GMTrace.o(5981413048320L, 44565);
          return;
        }
      }
      localFaceDetectReporter = FaceDetectReporter.aws();
      j = this.kSi;
      bool = this.jWK;
      if (this.kSk == null) {
        break label285;
      }
    }
    label285:
    for (int i = this.kSk.kRB;; i = 0)
    {
      localFaceDetectReporter.a(j, bool, 1, paramInt1, paramInt2, i);
      a(paramInt1, paramInt2, paramString, ((m)paramk).kRV, localBundle);
      GMTrace.o(5981413048320L, 44565);
      return;
    }
  }
  
  public final void h(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(16690242912256L, 124352);
    w.v("MicroMsg.FaceDetectMpController", "alvinluo onCollectEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    GMTrace.o(16690242912256L, 124352);
  }
  
  public final void i(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(5981547266048L, 44566);
    w.i("MicroMsg.FaceDetectMpController", "alvinluo onError errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!FaceDetectReporter.aws().kTv) {
      FaceDetectReporter.aws().a(this.kSi, this.jWK, 3, paramInt1, paramInt2);
    }
    b(paramInt1, paramInt2, paramString, null);
    GMTrace.o(5981547266048L, 44566);
  }
  
  public final void onRelease()
  {
    GMTrace.i(5981010395136L, 44562);
    if (!FaceDetectReporter.aws().kTv) {
      FaceDetectReporter.aws().a(this.kSi, this.jWK, 2, 1, 90006);
    }
    GMTrace.o(5981010395136L, 44562);
  }
  
  public final void onStart()
  {
    GMTrace.i(5980876177408L, 44561);
    w.i("MicroMsg.FaceDetectMpController", "alvinluo onStart and create report session");
    if (this.jWK) {
      FaceDetectReporter.aws().awt();
    }
    FaceDetectReporter.aws().x(this.kSi, this.jWK);
    FaceDetectReporter localFaceDetectReporter = FaceDetectReporter.aws();
    localFaceDetectReporter.kTB += 1;
    w.v("MicroMsg.FaceDetectReporter", "alvinluo addFaceDetectCount: %d", new Object[] { Integer.valueOf(localFaceDetectReporter.kTB) });
    GMTrace.o(5980876177408L, 44561);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */