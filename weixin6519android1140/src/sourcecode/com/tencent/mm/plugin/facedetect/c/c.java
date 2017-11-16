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
import com.tencent.mm.plugin.facedetect.b.n;
import com.tencent.mm.plugin.facedetect.b.o;
import com.tencent.mm.plugin.facedetect.b.s;
import com.tencent.mm.plugin.facedetect.b.t;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends a
{
  boolean jWK;
  private String kSo;
  private String kSp;
  private int kSq;
  
  c(Context paramContext, e parame, int paramInt)
  {
    super(paramContext, parame, paramInt);
    GMTrace.i(14547725320192L, 108389);
    this.jWK = false;
    this.kSl = true;
    this.kSq = paramInt;
    GMTrace.o(14547725320192L, 108389);
  }
  
  private void a(final int paramInt1, final int paramInt2, final String paramString, final boolean paramBoolean, final Bundle paramBundle)
  {
    GMTrace.i(14547859537920L, 108390);
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
            GMTrace.i(14547322667008L, 108386);
            if (paramBoolean)
            {
              paramAnonymousView = c.this;
              paramAnonymousView.avU();
              paramAnonymousView.jWK = true;
              GMTrace.o(14547322667008L, 108386);
              return;
            }
            c.this.b(paramInt1, paramInt2, paramString, paramBundle);
            GMTrace.o(14547322667008L, 108386);
          }
        }, new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(14547591102464L, 108388);
            c.this.b(paramInt1, paramInt2, paramString, paramBundle);
            GMTrace.o(14547591102464L, 108388);
          }
        }));
        GMTrace.o(14547859537920L, 108390);
        return;
        str2 = ((Context)localObject).getString(a.h.kQT);
        break;
      }
    }
  }
  
  public final void O(int paramInt, String paramString)
  {
    GMTrace.i(5987452846080L, 44610);
    w.i("MicroMsg.FaceDetectLoginController", "alvinluo onCancel, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (!FaceDetectReporter.aws().kTv) {
      FaceDetectReporter.aws().a(FaceDetectReporter.nq(this.kSq), this.jWK, 2, 1, paramInt);
    }
    b(1, paramInt, paramString, null);
    GMTrace.o(5987452846080L, 44610);
  }
  
  public final k avX()
  {
    GMTrace.i(5986513321984L, 44603);
    long l = avV();
    Object localObject = this.kSo;
    String str = this.kSp;
    switch (this.kSq)
    {
    case 2: 
    default: 
      GMTrace.o(5986513321984L, 44603);
      return null;
    case 0: 
      localObject = new n(l, (String)localObject, str);
      GMTrace.o(5986513321984L, 44603);
      return (k)localObject;
    case 1: 
      localObject = new s(l, (String)localObject, str);
      GMTrace.o(5986513321984L, 44603);
      return (k)localObject;
    case 3: 
      localObject = new o(l, (String)localObject, str);
      GMTrace.o(5986513321984L, 44603);
      return (k)localObject;
    }
    localObject = new t(l, (String)localObject, str);
    GMTrace.o(5986513321984L, 44603);
    return (k)localObject;
  }
  
  public final Bundle avY()
  {
    GMTrace.i(5987587063808L, 44611);
    Bundle localBundle = new Bundle();
    localBundle.putLong("k_bio_id", avV());
    GMTrace.o(5987587063808L, 44611);
    return localBundle;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    GMTrace.i(5987050192896L, 44607);
    w.i("MicroMsg.FaceDetectLoginController", "alvinluo onUploadEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      FaceDetectReporter.aws().a(FaceDetectReporter.nq(this.kSq), this.jWK, 1, 2, 90012);
      a(paramInt1, paramInt2, paramString, false, null);
      GMTrace.o(5987050192896L, 44607);
      return true;
    }
    if ((paramBundle == null) || (bg.nm(paramBundle.getString("key_pic_cdn_id"))))
    {
      w.e("MicroMsg.FaceDetectLoginController", "hy: not return cdn id!");
      a(4, 6, "not return cdn id", false, null);
      GMTrace.o(5987050192896L, 44607);
      return true;
    }
    this.kSo = paramBundle.getString("key_pic_cdn_id");
    this.kSp = paramBundle.getString("key_cdn_aes_key");
    w.v("MicroMsg.FaceDetectLoginController", "hy: start upload: picCdnId: %s, aes key: %s", new Object[] { this.kSo, this.kSp });
    GMTrace.o(5987050192896L, 44607);
    return false;
  }
  
  public final void g(final int paramInt1, final int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(5987184410624L, 44608);
    w.i("MicroMsg.FaceDetectLoginController", "alvinluo onVerifyEnd sceneType: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    com.tencent.mm.plugin.facedetect.b.e locale;
    final Bundle localBundle;
    int j;
    boolean bool;
    if ((paramk instanceof com.tencent.mm.plugin.facedetect.b.e))
    {
      locale = (com.tencent.mm.plugin.facedetect.b.e)paramk;
      localBundle = new Bundle();
      switch (this.kSq)
      {
      case 2: 
      default: 
        paramk = "verify_result";
        localBundle.putString(paramk, locale.avS());
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break label274;
        }
        paramk = FaceDetectReporter.aws();
        j = this.kSi;
        bool = locale.avR();
        if (this.kSk == null) {
          break;
        }
      }
      for (i = this.kSk.kRB;; i = 0)
      {
        paramk.a(j, bool, 0, paramInt1, paramInt2, i);
        paramk = com.tencent.mm.plugin.facedetect.ui.a.nv(a.d.kPA);
        paramk.kVH = true;
        paramk.kVO = ab.getResources().getString(a.h.kQV);
        a(false, true, paramk);
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14546785796096L, 108382);
            c.this.b(paramInt1, paramInt2, paramString, localBundle);
            GMTrace.o(14546785796096L, 108382);
          }
        }, 1500L);
        GMTrace.o(5987184410624L, 44608);
        return;
        paramk = "faceregister_ticket";
        break;
        paramk = "faceverify_ticket";
        break;
      }
      label274:
      paramk = FaceDetectReporter.aws();
      j = this.kSi;
      bool = locale.avR();
      if (this.kSk == null) {
        break label349;
      }
    }
    label349:
    for (int i = this.kSk.kRB;; i = 0)
    {
      paramk.a(j, bool, 1, paramInt1, paramInt2, i);
      a(paramInt1, paramInt2, paramString, locale.avR(), localBundle);
      GMTrace.o(5987184410624L, 44608);
      return;
    }
  }
  
  public final void h(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(16689974476800L, 124350);
    w.v("MicroMsg.FaceDetectLoginController", "alvinluo onCollectEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    GMTrace.o(16689974476800L, 124350);
  }
  
  public final void i(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(5987318628352L, 44609);
    w.i("MicroMsg.FaceDetectLoginController", "alvinluo onError errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!FaceDetectReporter.aws().kTv) {
      FaceDetectReporter.aws().a(FaceDetectReporter.nq(this.kSq), this.jWK, 3, paramInt1, paramInt2);
    }
    b(paramInt1, paramInt2, paramString, null);
    GMTrace.o(5987318628352L, 44609);
  }
  
  public final void onRelease()
  {
    GMTrace.i(5986781757440L, 44605);
    if (!FaceDetectReporter.aws().kTv) {
      FaceDetectReporter.aws().a(FaceDetectReporter.nq(this.kSq), this.jWK, 2, 1, 90006);
    }
    GMTrace.o(5986781757440L, 44605);
  }
  
  public final void onStart()
  {
    GMTrace.i(5986647539712L, 44604);
    w.i("MicroMsg.FaceDetectLoginController", "alvinluo onStart and create report session");
    if (this.jWK)
    {
      FaceDetectReporter.aws().awt();
      FaceDetectReporter.aws().x(FaceDetectReporter.nq(this.kSq), this.jWK);
    }
    GMTrace.o(5986647539712L, 44604);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */