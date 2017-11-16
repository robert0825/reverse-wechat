package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a;

import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.support.v4.app.n;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends n
{
  public List<Fragment> pp;
  
  public c(l paraml, List<Fragment> paramList)
  {
    super(paraml);
    GMTrace.i(17109539094528L, 127476);
    this.pp = new ArrayList();
    this.pp = paramList;
    GMTrace.o(17109539094528L, 127476);
  }
  
  public final Fragment I(int paramInt)
  {
    GMTrace.i(17109673312256L, 127477);
    Fragment localFragment = (Fragment)this.pp.get(paramInt);
    GMTrace.o(17109673312256L, 127477);
    return localFragment;
  }
  
  public final CharSequence bJ()
  {
    GMTrace.i(17109941747712L, 127479);
    GMTrace.o(17109941747712L, 127479);
    return "";
  }
  
  public final int getCount()
  {
    GMTrace.i(17109807529984L, 127478);
    int i = this.pp.size();
    GMTrace.o(17109807529984L, 127478);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\verticalviewpager\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */