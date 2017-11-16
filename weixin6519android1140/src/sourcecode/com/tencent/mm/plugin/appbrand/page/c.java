package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.ui.MMActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  private View itY;
  WebChromeClient.CustomViewCallback itZ;
  private Set<x> iua;
  private Context mContext;
  
  c(Context paramContext)
  {
    GMTrace.i(20758784901120L, 154665);
    this.iua = Collections.newSetFromMap(new ConcurrentHashMap());
    this.mContext = paramContext;
    GMTrace.o(20758784901120L, 154665);
  }
  
  private void Za()
  {
    GMTrace.i(20759321772032L, 154669);
    Iterator localIterator = this.iua.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
    GMTrace.o(20759321772032L, 154669);
  }
  
  public final boolean YZ()
  {
    GMTrace.i(20759053336576L, 154667);
    if (this.itY == null)
    {
      GMTrace.o(20759053336576L, 154667);
      return false;
    }
    if (this.itZ != null) {
      this.itZ.onCustomViewHidden();
    }
    Object localObject = (MMActivity)this.mContext;
    ViewGroup localViewGroup = (ViewGroup)((MMActivity)localObject).getWindow().getDecorView();
    localViewGroup.setSystemUiVisibility(0);
    localViewGroup.removeView(this.itY);
    ((MMActivity)localObject).getWindow().clearFlags(1024);
    if (((MMActivity)localObject).getRequestedOrientation() == 0) {
      ((MMActivity)localObject).setRequestedOrientation(1);
    }
    if (this.itY.getRotation() == 180.0F) {
      this.itY.setRotation(0.0F);
    }
    this.itY = null;
    this.itZ = null;
    localObject = this.iua.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((x)((Iterator)localObject).next()).WU();
    }
    GMTrace.o(20759053336576L, 154667);
    return true;
  }
  
  final void a(x paramx)
  {
    GMTrace.i(20759187554304L, 154668);
    this.iua.add(paramx);
    GMTrace.o(20759187554304L, 154668);
  }
  
  final void r(View paramView, int paramInt)
  {
    GMTrace.i(20758919118848L, 154666);
    YZ();
    this.itY = paramView;
    MMActivity localMMActivity = (MMActivity)this.mContext;
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    ViewGroup localViewGroup = (ViewGroup)localMMActivity.getWindow().getDecorView();
    localViewGroup.addView(paramView, localLayoutParams);
    paramView.setX(0.0F);
    paramView.setY(0.0F);
    if (d.eu(19)) {
      localViewGroup.setSystemUiVisibility(2);
    }
    for (;;)
    {
      localMMActivity.getWindow().addFlags(1024);
      if ((paramInt == 90) || (paramInt == -90)) {
        localMMActivity.setRequestedOrientation(0);
      }
      if ((paramInt == -90) || (paramInt == 180)) {
        paramView.setRotation(180.0F);
      }
      Za();
      GMTrace.o(20758919118848L, 154666);
      return;
      localViewGroup.setSystemUiVisibility(4098);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */