package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;

public class RealnameGuideHelper
  implements Parcelable
{
  public static final Parcelable.Creator<RealnameGuideHelper> CREATOR;
  private int gGg;
  private String mJM;
  private String mJN;
  private String mJO;
  private String mJP;
  private String mJQ;
  private int rdR;
  private boolean rdS;
  
  static
  {
    GMTrace.i(6855170457600L, 51075);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6855170457600L, 51075);
  }
  
  public RealnameGuideHelper()
  {
    GMTrace.i(6854230933504L, 51068);
    this.mJO = "";
    this.mJP = "";
    this.mJQ = "";
    this.rdS = false;
    GMTrace.o(6854230933504L, 51068);
  }
  
  public RealnameGuideHelper(Parcel paramParcel)
  {
    GMTrace.i(6854365151232L, 51069);
    this.mJO = "";
    this.mJP = "";
    this.mJQ = "";
    this.rdS = false;
    this.mJM = paramParcel.readString();
    this.mJN = paramParcel.readString();
    this.mJO = paramParcel.readString();
    this.mJP = paramParcel.readString();
    this.mJQ = paramParcel.readString();
    this.gGg = paramParcel.readInt();
    this.rdR = paramParcel.readInt();
    GMTrace.o(6854365151232L, 51069);
  }
  
  public final void a(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2)
  {
    GMTrace.i(19315810107392L, 143914);
    this.rdR = paramInt1;
    this.mJM = paramString1;
    this.mJN = paramString2;
    this.mJO = paramString3;
    this.mJP = paramString4;
    this.mJQ = paramString5;
    this.gGg = paramInt2;
    GMTrace.o(19315810107392L, 143914);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    GMTrace.i(6854499368960L, 51070);
    a(paramString1, 0, paramString2, paramString3, paramString4, paramString5, paramInt);
    GMTrace.o(6854499368960L, 51070);
  }
  
  public final boolean a(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(19315944325120L, 143915);
    boolean bool = a(paramMMActivity, paramBundle, paramOnClickListener, false);
    GMTrace.o(19315944325120L, 143915);
    return bool;
  }
  
  public final boolean a(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    GMTrace.i(19316078542848L, 143916);
    w.d("MicroMsg.RealnameGuideHelper", "doIfNeedSetPwd sendPwdMsg %s mEntryScene %s guide_wording %s upload_credit_url %s left_button_wording %s right_button_wording %s hadShow %s guide_flag %s", new Object[] { Integer.valueOf(this.rdR), Integer.valueOf(this.gGg), this.mJN, this.mJQ, this.mJO, this.mJP, Boolean.valueOf(this.rdS), this.mJM });
    if (this.rdS)
    {
      GMTrace.o(19316078542848L, 143916);
      return false;
    }
    int i;
    String str2;
    Object localObject2;
    Object localObject1;
    if (this.rdR == 1)
    {
      i = this.gGg;
      str2 = this.mJN;
      localObject2 = this.mJO;
      String str1 = this.mJP;
      com.tencent.mm.kernel.h.xz();
      int j = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzk, Integer.valueOf(0))).intValue();
      w.i("MicroMsg.RealnameVerifyUtil", "showSetPwdDialog count %s", new Object[] { Integer.valueOf(j) });
      if (j >= 3)
      {
        paramBoolean = false;
        if ((paramBoolean) && (!this.rdS)) {
          this.rdS = true;
        }
        GMTrace.o(19316078542848L, 143916);
        return paramBoolean;
      }
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vzk, Integer.valueOf(j + 1));
      localObject1 = localObject2;
      if (bg.nm((String)localObject2)) {
        localObject1 = paramMMActivity.getString(a.i.cSk);
      }
      localObject2 = str1;
      if (bg.nm(str1)) {
        localObject2 = paramMMActivity.getString(a.i.cTM);
      }
      if (paramOnClickListener != null) {
        break label378;
      }
      paramOnClickListener = new a.3(paramBoolean, paramMMActivity);
    }
    label378:
    for (;;)
    {
      paramBundle = com.tencent.mm.ui.base.h.a(paramMMActivity, str2, "", (String)localObject2, (String)localObject1, new a.4(paramBundle, i, paramMMActivity, paramBoolean), paramOnClickListener, a.c.aPp);
      if (paramBundle != null)
      {
        paramBundle.setOnCancelListener(new a.5(paramBoolean, paramMMActivity));
        paramBundle.setOnDismissListener(new a.6(paramBoolean, paramMMActivity));
      }
      paramBoolean = true;
      break;
      GMTrace.o(19316078542848L, 143916);
      return false;
    }
  }
  
  public final boolean b(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(6854633586688L, 51071);
    boolean bool = b(paramMMActivity, paramBundle, paramOnClickListener, false);
    GMTrace.o(6854633586688L, 51071);
    return bool;
  }
  
  public final boolean b(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    GMTrace.i(6854767804416L, 51072);
    if (this.rdS)
    {
      GMTrace.o(6854767804416L, 51072);
      return false;
    }
    if ("1".equals(this.mJM))
    {
      if (!this.rdS) {
        this.rdS = true;
      }
      paramBoolean = a.a(paramMMActivity, paramBundle, this.gGg);
      GMTrace.o(6854767804416L, 51072);
      return paramBoolean;
    }
    if (("2".equals(this.mJM)) && (!bg.nm(this.mJQ)))
    {
      if (!this.rdS) {
        this.rdS = true;
      }
      paramBoolean = a.a(paramMMActivity, this.mJN, this.mJQ, this.mJO, this.mJP, paramBoolean, paramOnClickListener);
      GMTrace.o(6854767804416L, 51072);
      return paramBoolean;
    }
    GMTrace.o(6854767804416L, 51072);
    return false;
  }
  
  public int describeContents()
  {
    GMTrace.i(6854902022144L, 51073);
    GMTrace.o(6854902022144L, 51073);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6855036239872L, 51074);
    paramParcel.writeString(this.mJM);
    paramParcel.writeString(this.mJN);
    paramParcel.writeString(this.mJO);
    paramParcel.writeString(this.mJP);
    paramParcel.writeString(this.mJQ);
    paramParcel.writeInt(this.gGg);
    paramParcel.writeInt(this.rdR);
    GMTrace.o(6855036239872L, 51074);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\util\RealnameGuideHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */