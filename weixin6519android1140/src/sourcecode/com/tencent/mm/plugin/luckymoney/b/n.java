package com.tencent.mm.plugin.luckymoney.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.aj;
import com.tencent.mm.g.a.aj.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.i.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.ahm;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.b.a;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class n
{
  private static com.tencent.mm.a.f<String, Bitmap> ldh;
  public static int mJa;
  
  static
  {
    GMTrace.i(9732664328192L, 72514);
    mJa = Integer.MAX_VALUE;
    ldh = new com.tencent.mm.a.f(10);
    GMTrace.o(9732664328192L, 72514);
  }
  
  public static String BC(String paramString)
  {
    GMTrace.i(9730785280000L, 72500);
    Object localObject = com.tencent.mm.ac.n.Di().ig(paramString);
    if (localObject != null)
    {
      paramString = ((com.tencent.mm.ac.h)localObject).Dp();
      GMTrace.o(9730785280000L, 72500);
      return paramString;
    }
    com.tencent.mm.kernel.h.xz();
    localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
    if ((localObject == null) || (!((af)localObject).field_username.equals(paramString)))
    {
      GMTrace.o(9730785280000L, 72500);
      return null;
    }
    if (((af)localObject).fiZ == 4)
    {
      GMTrace.o(9730785280000L, 72500);
      return null;
    }
    com.tencent.mm.kernel.h.xz();
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TI(paramString);
    if (bg.bq(paramString))
    {
      GMTrace.o(9730785280000L, 72500);
      return null;
    }
    try
    {
      paramString = ((aos)new aos().aD(paramString)).ubW;
      GMTrace.o(9730785280000L, 72500);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.LuckyMoneyUtil", "exception:%s", new Object[] { bg.f(paramString) });
        paramString = null;
      }
    }
  }
  
  public static String BD(String paramString)
  {
    GMTrace.i(9732127457280L, 72510);
    if ((bg.nm(paramString)) || (!com.tencent.mm.kernel.h.xw().wL()))
    {
      GMTrace.o(9732127457280L, 72510);
      return "";
    }
    com.tencent.mm.kernel.h.xz();
    File localFile = new File(String.format("%s/%s/", new Object[] { com.tencent.mm.kernel.h.xy().fYU, "LuckyMoney" }));
    if ((!localFile.exists()) || (!localFile.isDirectory())) {
      localFile.mkdirs();
    }
    paramString = new File(localFile, paramString).getAbsolutePath();
    GMTrace.o(9732127457280L, 72510);
    return paramString;
  }
  
  public static void a(Context paramContext, TextView paramTextView, String paramString)
  {
    GMTrace.i(9730248409088L, 72496);
    if (paramTextView == null)
    {
      GMTrace.o(9730248409088L, 72496);
      return;
    }
    paramTextView.setText(com.tencent.mm.pluginsdk.ui.d.h.b(paramContext, paramString, paramTextView.getTextSize()));
    GMTrace.o(9730248409088L, 72496);
  }
  
  public static void a(View paramView, Animation.AnimationListener paramAnimationListener)
  {
    GMTrace.i(9731187933184L, 72503);
    ScaleAnimation localScaleAnimation1 = new ScaleAnimation(0.0F, 0.96F, 0.0F, 0.96F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation1.setDuration(300L);
    localScaleAnimation1.setInterpolator(new OvershootInterpolator());
    localScaleAnimation1.setFillAfter(true);
    final ScaleAnimation localScaleAnimation2 = new ScaleAnimation(0.96F, 1.0F, 0.96F, 1.0F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation2.setDuration(100L);
    localScaleAnimation2.setFillAfter(true);
    localScaleAnimation1.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(9726624530432L, 72469);
        this.jLv.startAnimation(localScaleAnimation2);
        GMTrace.o(9726624530432L, 72469);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(9726490312704L, 72468);
        GMTrace.o(9726490312704L, 72468);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(9726356094976L, 72467);
        GMTrace.o(9726356094976L, 72467);
      }
    });
    if (paramAnimationListener != null) {
      localScaleAnimation2.setAnimationListener(paramAnimationListener);
    }
    if (paramView != null) {
      paramView.startAnimation(localScaleAnimation1);
    }
    GMTrace.o(9731187933184L, 72503);
  }
  
  public static void a(Button paramButton)
  {
    GMTrace.i(9731322150912L, 72504);
    b(paramButton);
    GMTrace.o(9731322150912L, 72504);
  }
  
  public static void a(ImageView paramImageView, String paramString1, String paramString2)
  {
    GMTrace.i(9729979973632L, 72494);
    if (paramImageView == null)
    {
      GMTrace.o(9729979973632L, 72494);
      return;
    }
    if (!bg.nm(paramString2)) {}
    for (;;)
    {
      a.b.a(paramImageView, paramString2, 0.1F, false);
      GMTrace.o(9729979973632L, 72494);
      return;
      paramString2 = com.tencent.mm.ac.n.Dv().hV(paramString1);
    }
  }
  
  public static void a(ImageView paramImageView, String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(9729577320448L, 72491);
    c.a locala;
    if (paramImageView != null)
    {
      paramImageView.setImageBitmap(null);
      if (!bg.nm(paramString1))
      {
        locala = new c.a();
        com.tencent.mm.plugin.luckymoney.a.a.aLP();
        locala.gKF = com.tencent.mm.plugin.luckymoney.a.a.aLR();
        locala.gKC = true;
        locala.gKY = true;
        locala.gKZ = paramBoolean;
        if (paramBoolean) {
          locala.gLa = 0.0F;
        }
        if (bg.nm(paramString2)) {
          break label118;
        }
        locala.eDW = paramString2;
      }
    }
    label118:
    for (locala.gKK = true;; locala.gKK = false)
    {
      paramString2 = locala.Jn();
      com.tencent.mm.ao.n.Jd().a(paramString1, paramImageView, paramString2);
      GMTrace.o(9729577320448L, 72491);
      return;
    }
  }
  
  public static void a(ImageView paramImageView, String paramString, boolean paramBoolean)
  {
    GMTrace.i(9729443102720L, 72490);
    a(paramImageView, paramString, null, true);
    GMTrace.o(9729443102720L, 72490);
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(9730382626816L, 72497);
    if ((paramInt1 == 0) && (paramInt2 > 1))
    {
      Intent localIntent = new Intent();
      localIntent.setClass(paramMMActivity, SelectLuckyMoneyContactUI.class);
      localIntent.putExtra("key_friends_num", paramInt2);
      if (paramBoolean) {
        localIntent.putExtra("scene_from", 5);
      }
      paramMMActivity.startActivityForResult(localIntent, 2);
      GMTrace.o(9730382626816L, 72497);
      return;
    }
    a(paramMMActivity, 2, paramBoolean);
    GMTrace.o(9730382626816L, 72497);
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(9730516844544L, 72498);
    Intent localIntent = new Intent();
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("Select_Conv_Type", 3);
    if (paramBoolean) {
      localIntent.putExtra("scene_from", 5);
    }
    com.tencent.mm.bj.d.a(paramMMActivity, ".ui.transmit.SelectConversationUI", localIntent, paramInt);
    GMTrace.o(9730516844544L, 72498);
  }
  
  public static boolean a(Activity paramActivity, int paramInt1, com.tencent.mm.ad.k paramk, Bundle paramBundle, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener, b.a parama, int paramInt2)
  {
    GMTrace.i(9731859021824L, 72508);
    w.i("MicroMsg.LuckyMoneyUtil", "dealWithRealNameVerifyErr call");
    if (paramInt1 != 416)
    {
      w.i("MicroMsg.LuckyMoneyUtil", "don't need realname verify");
      GMTrace.o(9731859021824L, 72508);
      return false;
    }
    paramBoolean = a(paramActivity, paramk, paramBundle, paramBoolean, paramOnClickListener, paramInt2);
    GMTrace.o(9731859021824L, 72508);
    return paramBoolean;
  }
  
  private static boolean a(Activity paramActivity, com.tencent.mm.ad.k paramk, Bundle paramBundle, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener, int paramInt)
  {
    GMTrace.i(9731993239552L, 72509);
    paramOnClickListener = "";
    String str2 = "";
    String str3 = "";
    String str1 = "";
    if ((paramk != null) && ((paramk instanceof p)))
    {
      paramk = ((p)paramk).fUa;
      if (paramk != null)
      {
        paramk = (ahm)paramk.gtD.gtK;
        if (paramk.uwX != null) {
          paramk = com.tencent.mm.platformtools.n.b(paramk.uwX);
        }
      }
    }
    for (;;)
    {
      try
      {
        paramk = new JSONObject(paramk);
        if (paramk == null) {
          break label342;
        }
        w.i("MicroMsg.LuckyMoneyUtil", "dealWithRealNameVerifyErr json is not null");
        paramOnClickListener = paramk;
        if (paramk.has("real_name_info")) {
          paramOnClickListener = paramk.optJSONObject("real_name_info");
        }
        paramk = paramOnClickListener.optString("guide_flag", "");
        String str4 = paramOnClickListener.optString("guide_wording");
        str2 = paramOnClickListener.optString("left_button_wording", paramActivity.getString(a.i.cSk));
        str3 = paramOnClickListener.optString("right_button_wording", paramActivity.getString(a.i.cTM));
        str1 = paramOnClickListener.optString("upload_credit_url", "");
        paramOnClickListener = str4;
        if (!"1".equals(paramk)) {
          break label243;
        }
        w.i("MicroMsg.LuckyMoneyUtil", "showRealnameDialog");
        paramBoolean = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, paramBundle, paramInt);
        GMTrace.o(9731993239552L, 72509);
        return paramBoolean;
      }
      catch (JSONException paramk)
      {
        w.printErrStackTrace("MicroMsg.LuckyMoneyUtil", paramk, "", new Object[0]);
      }
      paramk = null;
      continue;
      label243:
      if (("2".equals(paramk)) && (!bg.nm(str1)))
      {
        w.i("MicroMsg.LuckyMoneyUtil", "showUploadCreditDialog");
        paramBoolean = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, paramOnClickListener, str1, str2, str3, paramBoolean, null);
        GMTrace.o(9731993239552L, 72509);
        return paramBoolean;
      }
      w.e("MicroMsg.LuckyMoneyUtil", "guide_flag=" + paramk + ";upload_credit_url=null?" + bg.nm(str1));
      GMTrace.o(9731993239552L, 72509);
      return false;
      label342:
      paramk = "";
    }
  }
  
  public static String aMg()
  {
    GMTrace.i(9730651062272L, 72499);
    com.tencent.mm.kernel.h.xz();
    String str = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vqD, null);
    GMTrace.o(9730651062272L, 72499);
    return str;
  }
  
  public static String aR(List<ag> paramList)
  {
    GMTrace.i(9732395892736L, 72512);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.e("MicroMsg.LuckyMoneyUtil", "splitOperationField is empty!");
      GMTrace.o(9732395892736L, 72512);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramList.size())
    {
      ag localag = (ag)paramList.get(i);
      if (localag != null)
      {
        if (i != 0) {
          localStringBuilder.append("|");
        }
        localStringBuilder.append(localag.type);
        localStringBuilder.append("|");
        localStringBuilder.append(localag.name);
      }
      i += 1;
    }
    paramList = localStringBuilder.toString();
    GMTrace.o(9732395892736L, 72512);
    return paramList;
  }
  
  public static Bitmap ag(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(9732261675008L, 72511);
    if (paramBoolean)
    {
      localObject = (Bitmap)ldh.get(paramString);
      if (localObject != null)
      {
        GMTrace.o(9732261675008L, 72511);
        return (Bitmap)localObject;
      }
    }
    if (!com.tencent.mm.compatible.util.f.ty())
    {
      w.e("MicroMsg.LuckyMoneyUtil", "sdcard is not avail!");
      paramString = BitmapFactory.decodeResource(ab.getContext().getResources(), a.e.aYv);
      GMTrace.o(9732261675008L, 72511);
      return paramString;
    }
    Object localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject);
    if (localBitmap != null) {
      localBitmap.recycle();
    }
    int i;
    int j;
    if ((com.tencent.mm.sdk.platformtools.d.bh(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) && (((BitmapFactory.Options)localObject).outWidth > 480))
    {
      i = 1;
      if ((!com.tencent.mm.sdk.platformtools.d.bg(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) || (((BitmapFactory.Options)localObject).outHeight <= 480)) {
        break label219;
      }
      j = 1;
    }
    label174:
    label219:
    int k;
    for (;;)
    {
      if ((i != 0) || (j != 0))
      {
        i = ((BitmapFactory.Options)localObject).outHeight;
        j = ((BitmapFactory.Options)localObject).outWidth;
        for (;;)
        {
          if (j * i > 2764800)
          {
            j >>= 1;
            i >>= 1;
            continue;
            i = 0;
            break;
            j = 0;
            break label174;
          }
        }
        j = Math.max(1, j);
        k = Math.max(1, i);
        w.w("MicroMsg.LuckyMoneyUtil", "fit long picture, beg %d*%d, after %d*%d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject).outHeight), Integer.valueOf(j), Integer.valueOf(k) });
        i = j;
        j = k;
      }
    }
    for (;;)
    {
      int n = BackwardSupportUtil.ExifHelper.Rz(paramString);
      int m;
      if (n != 90)
      {
        m = j;
        k = i;
        if (n != 270) {}
      }
      else
      {
        k = j;
        m = i;
      }
      if ((MMNativeJpeg.IsJpegFile(paramString)) && (MMNativeJpeg.isProgressive(paramString)))
      {
        localObject = MMNativeJpeg.decodeAsBitmap(paramString);
        if (localObject == null) {
          w.i("MicroMsg.LuckyMoneyUtil", "Progressive jpeg, result isNull:%b", new Object[] { Boolean.valueOf(bool) });
        }
      }
      for (;;)
      {
        if (localObject != null) {
          break label427;
        }
        w.e("MicroMsg.LuckyMoneyUtil", "getSuitableBmp fail, temBmp is null, filePath = " + paramString);
        GMTrace.o(9732261675008L, 72511);
        return null;
        bool = false;
        break;
        localObject = com.tencent.mm.sdk.platformtools.d.e(paramString, m, k, false);
      }
      label427:
      localObject = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject, n);
      if (paramBoolean) {
        ldh.put(paramString, localObject);
      }
      GMTrace.o(9732261675008L, 72511);
      return (Bitmap)localObject;
      j = 960;
      i = 960;
    }
  }
  
  public static void b(Button paramButton)
  {
    GMTrace.i(9731456368640L, 72505);
    if (paramButton == null)
    {
      GMTrace.o(9731456368640L, 72505);
      return;
    }
    paramButton.setBackgroundResource(a.e.snU);
    paramButton = (AnimationDrawable)paramButton.getBackground();
    if (paramButton != null) {
      paramButton.start();
    }
    GMTrace.o(9731456368640L, 72505);
  }
  
  public static void c(Button paramButton)
  {
    GMTrace.i(9731590586368L, 72506);
    if (paramButton == null)
    {
      GMTrace.o(9731590586368L, 72506);
      return;
    }
    if (!(paramButton.getBackground() instanceof AnimationDrawable))
    {
      GMTrace.o(9731590586368L, 72506);
      return;
    }
    paramButton = (AnimationDrawable)paramButton.getBackground();
    if (paramButton != null) {
      paramButton.stop();
    }
    GMTrace.o(9731590586368L, 72506);
  }
  
  public static int cL(Context paramContext)
  {
    GMTrace.i(9731053715456L, 72502);
    if (mJa == Integer.MAX_VALUE) {
      mJa = paramContext.getResources().getColor(a.c.smh);
    }
    int i = mJa;
    GMTrace.o(9731053715456L, 72502);
    return i;
  }
  
  public static void cO(String paramString1, String paramString2)
  {
    GMTrace.i(9732530110464L, 72513);
    if ((!bg.nm(paramString1)) && (!bg.nm(paramString2)))
    {
      au localau = new au();
      localau.dC(0);
      localau.db(paramString2);
      localau.dB(3);
      localau.setContent(paramString1);
      localau.E(bc.k(paramString2, System.currentTimeMillis() / 1000L));
      localau.setType(10000);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().P(localau);
    }
    GMTrace.o(9732530110464L, 72513);
  }
  
  public static void d(ImageView paramImageView, String paramString, int paramInt)
  {
    GMTrace.i(9729845755904L, 72493);
    if (paramImageView == null)
    {
      GMTrace.o(9729845755904L, 72493);
      return;
    }
    paramImageView.setImageBitmap(null);
    if (!bg.nm(paramString))
    {
      Object localObject = new c.a();
      com.tencent.mm.plugin.luckymoney.a.a.aLP();
      ((c.a)localObject).gKF = com.tencent.mm.plugin.luckymoney.a.a.aLR();
      ((c.a)localObject).gKC = true;
      ((c.a)localObject).gKY = true;
      ((c.a)localObject).gKZ = false;
      if (paramInt != 0) {
        ((c.a)localObject).gKR = paramInt;
      }
      localObject = ((c.a)localObject).Jn();
      com.tencent.mm.ao.n.Jd().a(paramString, paramImageView, (com.tencent.mm.ao.a.a.c)localObject);
    }
    GMTrace.o(9729845755904L, 72493);
  }
  
  public static void e(ImageView paramImageView, String paramString, int paramInt)
  {
    GMTrace.i(9730114191360L, 72495);
    if (paramImageView == null)
    {
      GMTrace.o(9730114191360L, 72495);
      return;
    }
    paramImageView.setImageBitmap(null);
    if (!bg.nm(paramString))
    {
      Object localObject = new c.a();
      com.tencent.mm.plugin.luckymoney.a.a.aLP();
      ((c.a)localObject).gKF = com.tencent.mm.plugin.luckymoney.a.a.aLR();
      ((c.a)localObject).gKC = true;
      ((c.a)localObject).gKY = true;
      ((c.a)localObject).gKZ = true;
      ((c.a)localObject).gKH = 1;
      if (paramInt != 0) {
        ((c.a)localObject).gKR = paramInt;
      }
      localObject = ((c.a)localObject).Jn();
      com.tencent.mm.ao.n.Jd().a(paramString, paramImageView, (com.tencent.mm.ao.a.a.c)localObject);
    }
    GMTrace.o(9730114191360L, 72495);
  }
  
  public static String fr(String paramString)
  {
    GMTrace.i(9730919497728L, 72501);
    com.tencent.mm.kernel.h.xz();
    x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
    if ((localx == null) || (!localx.field_username.equals(paramString)))
    {
      GMTrace.o(9730919497728L, 72501);
      return null;
    }
    paramString = localx.field_nickname;
    GMTrace.o(9730919497728L, 72501);
    return paramString;
  }
  
  public static String g(Context paramContext, long paramLong)
  {
    GMTrace.i(9729308884992L, 72489);
    Object localObject = new GregorianCalendar();
    if (paramLong < 3600000L)
    {
      GMTrace.o(9729308884992L, 72489);
      return "";
    }
    long l = paramLong - new GregorianCalendar(((GregorianCalendar)localObject).get(1), ((GregorianCalendar)localObject).get(2), ((GregorianCalendar)localObject).get(5)).getTimeInMillis();
    if ((l > 0L) && (l <= 86400000L))
    {
      paramContext = new SimpleDateFormat("HH:mm:ss").format(new Date(paramLong));
      GMTrace.o(9729308884992L, 72489);
      return paramContext;
    }
    localObject = new Time();
    ((Time)localObject).set(paramLong);
    paramContext = m.a(paramContext.getString(a.i.kcd, new Object[] { " " }), (Time)localObject).toString();
    GMTrace.o(9729308884992L, 72489);
    return paramContext;
  }
  
  public static void g(ImageView paramImageView, String paramString)
  {
    GMTrace.i(9729711538176L, 72492);
    a(paramImageView, paramString, null, false);
    GMTrace.o(9729711538176L, 72492);
  }
  
  public static boolean z(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(9731724804096L, 72507);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.w("MicroMsg.LuckyMoneyUtil", bg.nl(paramString1) + ", " + bg.nl(paramString2));
      GMTrace.o(9731724804096L, 72507);
      return false;
    }
    au localau = new au();
    localau.setContent(paramString1);
    localau.dB(2);
    localau.db(paramString2);
    localau.E(bc.gR(paramString2));
    localau.dC(1);
    if (paramInt == 3) {
      localau.setType(469762097);
    }
    long l;
    for (;;)
    {
      l = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().P(localau);
      if (l >= 0L) {
        break;
      }
      w.e("MicroMsg.LuckyMoneyUtil", com.tencent.mm.compatible.util.g.tC() + "insert msg failed :" + l);
      GMTrace.o(9731724804096L, 72507);
      return false;
      localau.setType(436207665);
    }
    com.tencent.mm.x.f localf;
    label428:
    boolean bool1;
    if (localau.aCp())
    {
      com.tencent.mm.modelstat.b.gWv.a(localau, com.tencent.mm.x.g.g(localau));
      localau.C(l);
      localf = new com.tencent.mm.x.f();
      localf.field_xml = localau.field_content;
      paramString2 = bg.Sx(paramString1);
      paramString1 = null;
      if (paramString2 != null)
      {
        paramString2 = f.a.C(paramString2, localau.field_reserved);
        paramString1 = paramString2;
        if (paramString2 != null)
        {
          localf.field_title = paramString2.title;
          localf.field_description = paramString2.description;
          paramString1 = paramString2;
        }
      }
      localf.field_type = 2001;
      localf.field_msgId = l;
      if ((paramString1 != null) && (paramString1.type == 2001) && (paramString1.showType == 1))
      {
        if ((TextUtils.isEmpty(paramString1.gke)) || (TextUtils.isEmpty(paramString1.gkf)) || (paramString1.gkg <= 0)) {
          break label486;
        }
        w.i("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! send predownload image event!");
        paramString2 = new aj();
        paramString2.eBw = new aj.a();
        paramString2.eBw.eBy = paramString1.gkf;
        paramString2.eBw.eBx = paramString1.gke;
        paramString2.eBw.eBz = paramString1.gkg;
        com.tencent.mm.sdk.b.a.vgX.m(paramString2);
      }
      paramString1 = com.tencent.mm.plugin.x.a.aWz().er(l);
      if ((paramString1 == null) || (paramString1.field_msgId != l)) {
        break label497;
      }
      bool1 = com.tencent.mm.plugin.x.a.aWz().c(localf, new String[0]);
    }
    for (;;)
    {
      GMTrace.o(9731724804096L, 72507);
      return bool1;
      com.tencent.mm.modelstat.b.gWv.f(localau);
      break;
      label486:
      w.e("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! don't send predownload image event, because image preload data is illegal!");
      break label428;
      label497:
      boolean bool2 = com.tencent.mm.plugin.x.a.aWz().b(localf);
      bool1 = bool2;
      if (!bool2)
      {
        w.e("MicroMsg.LuckyMoneyUtil", "PinOpenApi.getAppMessageStorage().insert msg failed id:" + l);
        bool1 = bool2;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */