package com.tencent.mm.ui.friend;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.preference.IconPreference;

public final class FriendSnsPreference
  extends IconPreference
{
  private Context context;
  public Bitmap wjQ;
  public String xbD;
  
  public FriendSnsPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(2805687386112L, 20904);
    GMTrace.o(2805687386112L, 20904);
  }
  
  public FriendSnsPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2805821603840L, 20905);
    this.xbD = null;
    this.wjQ = null;
    this.context = paramContext;
    GMTrace.o(2805821603840L, 20905);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(2805955821568L, 20906);
    super.onBindView(paramView);
    if (this.xbD != null) {
      a.b.a(this.mRV, this.xbD);
    }
    GMTrace.o(2805955821568L, 20906);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\friend\FriendSnsPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */